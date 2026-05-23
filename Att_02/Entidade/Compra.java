package Att_02.Entidade;

import java.util.Scanner;

public class Compra {
    private double valor;
    private double total;
    private double frete;
    private String pagamentoAceito;

    public Compra() {
        this.total = 0;
    }

    public void adicionarItem() {
        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Deseja adicionar item? (Sim/Não)");
            opcao = sc.nextLine();

            if (opcao.equalsIgnoreCase("Sim")) {
                System.out.println("Digite o valor do item:");
                valor = sc.nextDouble();
                sc.nextLine();

                total += valor;
            }

        } while (opcao.equalsIgnoreCase("Sim"));

        System.out.println("Total da compra: " + total);

        System.out.println("Pagamento foi concluído? (Sim/Não)");
        pagamentoAceito = sc.nextLine();

        if (pagamentoAceito.equalsIgnoreCase("Sim")) {
            System.out.println("Pagamento concluído.");
        } else {
            System.out.println("Erro ao finalizar compra.");
            System.exit(0);
        }
    }

    public void calcularFrete() {
        if (total > 500) {
            frete = 0;
            System.out.println("Frete grátis!");
        } else {
            frete = 25.0;
            total += frete;
            System.out.println("Frete de R$25 adicionado.");
            System.out.println("Total final: " + total);
        }
    }

    public double getTotal() {
        return total;
    }
}