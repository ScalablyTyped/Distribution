package typings.stripe.anon

import typings.stripe.mod.Stripe.Balance.Available
import typings.stripe.mod.Stripe.Balance.ConnectReserved
import typings.stripe.mod.Stripe.Balance.InstantAvailable
import typings.stripe.mod.Stripe.Balance.Issuing
import typings.stripe.mod.Stripe.Balance.Pending
import typings.stripe.stripeStrings.balance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Balance> */
trait ResponseBalance extends StObject {
  
  /**
    * Funds that are available to be transferred or paid out, whether automatically by Stripe or explicitly via the [Transfers API](https://stripe.com/docs/api#transfers) or [Payouts API](https://stripe.com/docs/api#payouts). The available balance for each currency and payment type can be found in the `source_types` property.
    */
  var available: js.Array[Available]
  
  /**
    * Funds held due to negative balances on connected Custom accounts. The connect reserve balance for each currency and payment type can be found in the `source_types` property.
    */
  var connect_reserved: js.UndefOr[js.Array[ConnectReserved]] = js.undefined
  
  /**
    * Funds that can be paid out using Instant Payouts.
    */
  var instant_available: js.UndefOr[js.Array[InstantAvailable]] = js.undefined
  
  var issuing: js.UndefOr[Issuing] = js.undefined
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: balance
  
  /**
    * Funds that are not yet available in the balance, due to the 7-day rolling pay cycle. The pending balance for each currency, and for each payment type, can be found in the `source_types` property.
    */
  var pending: js.Array[Pending]
}
object ResponseBalance {
  
  inline def apply(
    available: js.Array[Available],
    lastResponse: ApiVersion,
    livemode: Boolean,
    pending: js.Array[Pending]
  ): ResponseBalance = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("balance")
    __obj.asInstanceOf[ResponseBalance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseBalance] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: js.Array[Available]): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableVarargs(value: Available*): Self = StObject.set(x, "available", js.Array(value*))
    
    inline def setConnect_reserved(value: js.Array[ConnectReserved]): Self = StObject.set(x, "connect_reserved", value.asInstanceOf[js.Any])
    
    inline def setConnect_reservedUndefined: Self = StObject.set(x, "connect_reserved", js.undefined)
    
    inline def setConnect_reservedVarargs(value: ConnectReserved*): Self = StObject.set(x, "connect_reserved", js.Array(value*))
    
    inline def setInstant_available(value: js.Array[InstantAvailable]): Self = StObject.set(x, "instant_available", value.asInstanceOf[js.Any])
    
    inline def setInstant_availableUndefined: Self = StObject.set(x, "instant_available", js.undefined)
    
    inline def setInstant_availableVarargs(value: InstantAvailable*): Self = StObject.set(x, "instant_available", js.Array(value*))
    
    inline def setIssuing(value: Issuing): Self = StObject.set(x, "issuing", value.asInstanceOf[js.Any])
    
    inline def setIssuingUndefined: Self = StObject.set(x, "issuing", js.undefined)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: balance): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPending(value: js.Array[Pending]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingVarargs(value: Pending*): Self = StObject.set(x, "pending", js.Array(value*))
  }
}
