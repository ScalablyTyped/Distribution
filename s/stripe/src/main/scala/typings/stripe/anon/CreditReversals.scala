package typings.stripe.anon

import typings.stripe.mod.Stripe.Treasury.CreditReversalsResource
import typings.stripe.mod.Stripe.Treasury.DebitReversalsResource
import typings.stripe.mod.Stripe.Treasury.FinancialAccountsResource
import typings.stripe.mod.Stripe.Treasury.InboundTransfersResource
import typings.stripe.mod.Stripe.Treasury.OutboundPaymentsResource
import typings.stripe.mod.Stripe.Treasury.OutboundTransfersResource
import typings.stripe.mod.Stripe.Treasury.ReceivedCreditsResource
import typings.stripe.mod.Stripe.Treasury.ReceivedDebitsResource
import typings.stripe.mod.Stripe.Treasury.TransactionEntriesResource
import typings.stripe.mod.Stripe.Treasury.TransactionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditReversals extends StObject {
  
  var creditReversals: CreditReversalsResource
  
  var debitReversals: DebitReversalsResource
  
  var financialAccounts: FinancialAccountsResource
  
  var inboundTransfers: InboundTransfersResource
  
  var outboundPayments: OutboundPaymentsResource
  
  var outboundTransfers: OutboundTransfersResource
  
  var receivedCredits: ReceivedCreditsResource
  
  var receivedDebits: ReceivedDebitsResource
  
  var transactionEntries: TransactionEntriesResource
  
  var transactions: TransactionsResource
}
object CreditReversals {
  
  inline def apply(
    creditReversals: CreditReversalsResource,
    debitReversals: DebitReversalsResource,
    financialAccounts: FinancialAccountsResource,
    inboundTransfers: InboundTransfersResource,
    outboundPayments: OutboundPaymentsResource,
    outboundTransfers: OutboundTransfersResource,
    receivedCredits: ReceivedCreditsResource,
    receivedDebits: ReceivedDebitsResource,
    transactionEntries: TransactionEntriesResource,
    transactions: TransactionsResource
  ): CreditReversals = {
    val __obj = js.Dynamic.literal(creditReversals = creditReversals.asInstanceOf[js.Any], debitReversals = debitReversals.asInstanceOf[js.Any], financialAccounts = financialAccounts.asInstanceOf[js.Any], inboundTransfers = inboundTransfers.asInstanceOf[js.Any], outboundPayments = outboundPayments.asInstanceOf[js.Any], outboundTransfers = outboundTransfers.asInstanceOf[js.Any], receivedCredits = receivedCredits.asInstanceOf[js.Any], receivedDebits = receivedDebits.asInstanceOf[js.Any], transactionEntries = transactionEntries.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditReversals]
  }
  
  extension [Self <: CreditReversals](x: Self) {
    
    inline def setCreditReversals(value: CreditReversalsResource): Self = StObject.set(x, "creditReversals", value.asInstanceOf[js.Any])
    
    inline def setDebitReversals(value: DebitReversalsResource): Self = StObject.set(x, "debitReversals", value.asInstanceOf[js.Any])
    
    inline def setFinancialAccounts(value: FinancialAccountsResource): Self = StObject.set(x, "financialAccounts", value.asInstanceOf[js.Any])
    
    inline def setInboundTransfers(value: InboundTransfersResource): Self = StObject.set(x, "inboundTransfers", value.asInstanceOf[js.Any])
    
    inline def setOutboundPayments(value: OutboundPaymentsResource): Self = StObject.set(x, "outboundPayments", value.asInstanceOf[js.Any])
    
    inline def setOutboundTransfers(value: OutboundTransfersResource): Self = StObject.set(x, "outboundTransfers", value.asInstanceOf[js.Any])
    
    inline def setReceivedCredits(value: ReceivedCreditsResource): Self = StObject.set(x, "receivedCredits", value.asInstanceOf[js.Any])
    
    inline def setReceivedDebits(value: ReceivedDebitsResource): Self = StObject.set(x, "receivedDebits", value.asInstanceOf[js.Any])
    
    inline def setTransactionEntries(value: TransactionEntriesResource): Self = StObject.set(x, "transactionEntries", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: TransactionsResource): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
  }
}
