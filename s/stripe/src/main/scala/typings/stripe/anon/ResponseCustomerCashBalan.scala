package typings.stripe.anon

import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.CustomerCashBalanceTransaction.AppliedToPayment
import typings.stripe.mod.Stripe.CustomerCashBalanceTransaction.Funded
import typings.stripe.mod.Stripe.CustomerCashBalanceTransaction.RefundedFromPayment
import typings.stripe.mod.Stripe.CustomerCashBalanceTransaction.UnappliedFromPayment
import typings.stripe.stripeStrings.customer_cash_balance_transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.CustomerCashBalanceTransaction> */
trait ResponseCustomerCashBalan extends StObject {
  
  var applied_to_payment: js.UndefOr[AppliedToPayment] = js.undefined
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * The customer whose available cash balance changed as a result of this transaction.
    */
  var customer: String | Customer
  
  /**
    * The total available cash balance for the specified currency after this transaction was applied. Represented in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
    */
  var ending_balance: Double
  
  var funded: js.UndefOr[Funded] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * The amount by which the cash balance changed, represented in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal). A positive value represents funds being added to the cash balance, a negative value represents funds being removed from the cash balance.
    */
  var net_amount: Double
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: customer_cash_balance_transaction
  
  var refunded_from_payment: js.UndefOr[RefundedFromPayment] = js.undefined
  
  /**
    * The type of the cash balance transaction. One of `applied_to_payment`, `unapplied_from_payment`, `refunded_from_payment`, `funded`, `return_initiated`, or `return_canceled`. New types may be added in future. See [Customer Balance](https://stripe.com/docs/payments/customer-balance#types) to learn more about these types.
    */
  var `type`: typings.stripe.mod.Stripe.CustomerCashBalanceTransaction.Type
  
  var unapplied_from_payment: js.UndefOr[UnappliedFromPayment] = js.undefined
}
object ResponseCustomerCashBalan {
  
  inline def apply(
    created: Double,
    currency: String,
    customer: String | Customer,
    ending_balance: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    net_amount: Double,
    `type`: typings.stripe.mod.Stripe.CustomerCashBalanceTransaction.Type
  ): ResponseCustomerCashBalan = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], ending_balance = ending_balance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], net_amount = net_amount.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("customer_cash_balance_transaction")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCustomerCashBalan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCustomerCashBalan] (val x: Self) extends AnyVal {
    
    inline def setApplied_to_payment(value: AppliedToPayment): Self = StObject.set(x, "applied_to_payment", value.asInstanceOf[js.Any])
    
    inline def setApplied_to_paymentUndefined: Self = StObject.set(x, "applied_to_payment", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | Customer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setEnding_balance(value: Double): Self = StObject.set(x, "ending_balance", value.asInstanceOf[js.Any])
    
    inline def setFunded(value: Funded): Self = StObject.set(x, "funded", value.asInstanceOf[js.Any])
    
    inline def setFundedUndefined: Self = StObject.set(x, "funded", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setNet_amount(value: Double): Self = StObject.set(x, "net_amount", value.asInstanceOf[js.Any])
    
    inline def setObject(value: customer_cash_balance_transaction): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setRefunded_from_payment(value: RefundedFromPayment): Self = StObject.set(x, "refunded_from_payment", value.asInstanceOf[js.Any])
    
    inline def setRefunded_from_paymentUndefined: Self = StObject.set(x, "refunded_from_payment", js.undefined)
    
    inline def setType(value: typings.stripe.mod.Stripe.CustomerCashBalanceTransaction.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnapplied_from_payment(value: UnappliedFromPayment): Self = StObject.set(x, "unapplied_from_payment", value.asInstanceOf[js.Any])
    
    inline def setUnapplied_from_paymentUndefined: Self = StObject.set(x, "unapplied_from_payment", js.undefined)
  }
}
