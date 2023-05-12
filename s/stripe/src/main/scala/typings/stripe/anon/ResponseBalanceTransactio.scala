package typings.stripe.anon

import typings.stripe.mod.Stripe.ApplicationFee
import typings.stripe.mod.Stripe.BalanceTransaction.FeeDetail
import typings.stripe.mod.Stripe.Charge
import typings.stripe.mod.Stripe.ConnectCollectionTransfer
import typings.stripe.mod.Stripe.Dispute
import typings.stripe.mod.Stripe.FeeRefund
import typings.stripe.mod.Stripe.Issuing.Authorization
import typings.stripe.mod.Stripe.Issuing.Transaction
import typings.stripe.mod.Stripe.Payout
import typings.stripe.mod.Stripe.PlatformTaxFee
import typings.stripe.mod.Stripe.Refund
import typings.stripe.mod.Stripe.ReserveTransaction
import typings.stripe.mod.Stripe.TaxDeductedAtSource
import typings.stripe.mod.Stripe.Topup
import typings.stripe.mod.Stripe.Transfer
import typings.stripe.mod.Stripe.TransferReversal
import typings.stripe.stripeStrings.balance_transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.BalanceTransaction> */
trait ResponseBalanceTransactio extends StObject {
  
  /**
    * Gross amount of the transaction, in %s.
    */
  var amount: Double
  
  /**
    * The date the transaction's net funds will become available in the Stripe balance.
    */
  var available_on: Double
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null
  
  /**
    * The exchange rate used, if applicable, for this transaction. Specifically, if money was converted from currency A to currency B, then the `amount` in currency A, times `exchange_rate`, would be the `amount` in currency B. For example, suppose you charged a customer 10.00 EUR. Then the PaymentIntent's `amount` would be `1000` and `currency` would be `eur`. Suppose this was converted into 12.34 USD in your Stripe account. Then the BalanceTransaction's `amount` would be `1234`, `currency` would be `usd`, and `exchange_rate` would be `1.234`.
    */
  var exchange_rate: Double | Null
  
  /**
    * Fees (in %s) paid for this transaction.
    */
  var fee: Double
  
  /**
    * Detailed breakdown of fees (in %s) paid for this transaction.
    */
  var fee_details: js.Array[FeeDetail]
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Net amount of the transaction, in %s.
    */
  var net: Double
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: balance_transaction
  
  /**
    * [Learn more](https://stripe.com/docs/reports/reporting-categories) about how reporting categories can help you understand balance transactions from an accounting perspective.
    */
  var reporting_category: String
  
  /**
    * The Stripe object to which this transaction is related.
    */
  var source: String | ApplicationFee | Charge | ConnectCollectionTransfer | Dispute | FeeRefund | Authorization | typings.stripe.mod.Stripe.Issuing.Dispute | Transaction | Payout | PlatformTaxFee | Refund | ReserveTransaction | TaxDeductedAtSource | Topup | Transfer | TransferReversal | Null
  
  /**
    * If the transaction's net funds are available in the Stripe balance yet. Either `available` or `pending`.
    */
  var status: String
  
  /**
    * Transaction type: `adjustment`, `advance`, `advance_funding`, `anticipation_repayment`, `application_fee`, `application_fee_refund`, `charge`, `connect_collection_transfer`, `contribution`, `issuing_authorization_hold`, `issuing_authorization_release`, `issuing_dispute`, `issuing_transaction`, `payment`, `payment_failure_refund`, `payment_refund`, `payout`, `payout_cancel`, `payout_failure`, `refund`, `refund_failure`, `reserve_transaction`, `reserved_funds`, `stripe_fee`, `stripe_fx_fee`, `tax_fee`, `topup`, `topup_reversal`, `transfer`, `transfer_cancel`, `transfer_failure`, or `transfer_refund`. [Learn more](https://stripe.com/docs/reports/balance-transaction-types) about balance transaction types and what they represent. If you are looking to classify transactions for accounting purposes, you might want to consider `reporting_category` instead.
    */
  var `type`: typings.stripe.mod.Stripe.BalanceTransaction.Type
}
object ResponseBalanceTransactio {
  
  inline def apply(
    amount: Double,
    available_on: Double,
    created: Double,
    currency: String,
    fee: Double,
    fee_details: js.Array[FeeDetail],
    id: String,
    lastResponse: ApiVersion,
    net: Double,
    reporting_category: String,
    status: String,
    `type`: typings.stripe.mod.Stripe.BalanceTransaction.Type
  ): ResponseBalanceTransactio = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], available_on = available_on.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], fee_details = fee_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], reporting_category = reporting_category.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], description = null, exchange_rate = null, source = null)
    __obj.updateDynamic("object")("balance_transaction")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBalanceTransactio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseBalanceTransactio] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAvailable_on(value: Double): Self = StObject.set(x, "available_on", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setExchange_rate(value: Double): Self = StObject.set(x, "exchange_rate", value.asInstanceOf[js.Any])
    
    inline def setExchange_rateNull: Self = StObject.set(x, "exchange_rate", null)
    
    inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFee_details(value: js.Array[FeeDetail]): Self = StObject.set(x, "fee_details", value.asInstanceOf[js.Any])
    
    inline def setFee_detailsVarargs(value: FeeDetail*): Self = StObject.set(x, "fee_details", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setNet(value: Double): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    inline def setObject(value: balance_transaction): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReporting_category(value: String): Self = StObject.set(x, "reporting_category", value.asInstanceOf[js.Any])
    
    inline def setSource(
      value: String | ApplicationFee | Charge | ConnectCollectionTransfer | Dispute | FeeRefund | Authorization | typings.stripe.mod.Stripe.Issuing.Dispute | Transaction | Payout | PlatformTaxFee | Refund | ReserveTransaction | TaxDeductedAtSource | Topup | Transfer | TransferReversal
    ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.stripe.mod.Stripe.BalanceTransaction.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
