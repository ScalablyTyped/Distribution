package typings.stripe.anon

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.mod.Stripe.CashBalance.Settings
import typings.stripe.stripeStrings.cash_balance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.CashBalance> */
trait ResponseCashBalance extends StObject {
  
  /**
    * A hash of all cash balances available to this customer. You cannot delete a customer with any cash balances, even if the balance is 0. Amounts are represented in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
    */
  var available: StringDictionary[Double] | Null
  
  /**
    * The ID of the customer whose cash balance this object represents.
    */
  var customer: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: cash_balance
  
  var settings: Settings
}
object ResponseCashBalance {
  
  inline def apply(customer: String, lastResponse: ApiVersion, livemode: Boolean, settings: Settings): ResponseCashBalance = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], available = null)
    __obj.updateDynamic("object")("cash_balance")
    __obj.asInstanceOf[ResponseCashBalance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCashBalance] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: StringDictionary[Double]): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableNull: Self = StObject.set(x, "available", null)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: cash_balance): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
