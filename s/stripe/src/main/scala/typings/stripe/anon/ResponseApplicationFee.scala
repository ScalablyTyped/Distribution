package typings.stripe.anon

import typings.stripe.mod.Stripe.Account
import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.Application
import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.Charge
import typings.stripe.mod.Stripe.FeeRefund
import typings.stripe.stripeStrings.application_fee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.ApplicationFee> */
trait ResponseApplicationFee extends StObject {
  
  /**
    * ID of the Stripe account this fee was taken from.
    */
  var account: String | Account
  
  /**
    * Amount earned, in %s.
    */
  var amount: Double
  
  /**
    * Amount in %s refunded (can be less than the amount attribute on the fee if a partial refund was issued)
    */
  var amount_refunded: Double
  
  /**
    * ID of the Connect application that earned the fee.
    */
  var application: String | Application
  
  /**
    * Balance transaction that describes the impact of this collected application fee on your account balance (not including refunds).
    */
  var balance_transaction: String | BalanceTransaction | Null
  
  /**
    * ID of the charge that the application fee was taken from.
    */
  var charge: String | Charge
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
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
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: application_fee
  
  /**
    * ID of the corresponding charge on the platform account, if this fee was the result of a charge using the `destination` parameter.
    */
  var originating_transaction: String | Charge | Null
  
  /**
    * Whether the fee has been fully refunded. If the fee is only partially refunded, this attribute will still be false.
    */
  var refunded: Boolean
  
  /**
    * A list of refunds that have been applied to the fee.
    */
  var refunds: ApiList[FeeRefund]
}
object ResponseApplicationFee {
  
  inline def apply(
    account: String | Account,
    amount: Double,
    amount_refunded: Double,
    application: String | Application,
    charge: String | Charge,
    created: Double,
    currency: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    refunded: Boolean,
    refunds: ApiList[FeeRefund]
  ): ResponseApplicationFee = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any], balance_transaction = null, originating_transaction = null)
    __obj.updateDynamic("object")("application_fee")
    __obj.asInstanceOf[ResponseApplicationFee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseApplicationFee] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String | Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmount_refunded(value: Double): Self = StObject.set(x, "amount_refunded", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: String | Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setBalance_transaction(value: String | BalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
    
    inline def setCharge(value: String | Charge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: application_fee): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOriginating_transaction(value: String | Charge): Self = StObject.set(x, "originating_transaction", value.asInstanceOf[js.Any])
    
    inline def setOriginating_transactionNull: Self = StObject.set(x, "originating_transaction", null)
    
    inline def setRefunded(value: Boolean): Self = StObject.set(x, "refunded", value.asInstanceOf[js.Any])
    
    inline def setRefunds(value: ApiList[FeeRefund]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
  }
}
