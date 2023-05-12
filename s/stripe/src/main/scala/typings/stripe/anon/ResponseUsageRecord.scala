package typings.stripe.anon

import typings.stripe.stripeStrings.usage_record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.UsageRecord> */
trait ResponseUsageRecord extends StObject {
  
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
  var `object`: usage_record
  
  /**
    * The usage quantity for the specified date.
    */
  var quantity: Double
  
  /**
    * The ID of the subscription item this usage record contains data for.
    */
  var subscription_item: String
  
  /**
    * The timestamp when this usage occurred.
    */
  var timestamp: Double
}
object ResponseUsageRecord {
  
  inline def apply(
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    quantity: Double,
    subscription_item: String,
    timestamp: Double
  ): ResponseUsageRecord = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], subscription_item = subscription_item.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("usage_record")
    __obj.asInstanceOf[ResponseUsageRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseUsageRecord] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: usage_record): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setSubscription_item(value: String): Self = StObject.set(x, "subscription_item", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
