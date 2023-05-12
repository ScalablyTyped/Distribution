package typings.stripe.anon

import typings.stripe.mod.Stripe.Event.Data
import typings.stripe.mod.Stripe.Event.Request
import typings.stripe.stripeStrings.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Event> */
trait ResponseEvent extends StObject {
  
  /**
    * The connected account that originated the event.
    */
  var account: js.UndefOr[String] = js.undefined
  
  /**
    * The Stripe API version used to render `data`. *Note: This property is populated only for events on or after October 31, 2014*.
    */
  var api_version: String | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  var data: Data
  
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
  var `object`: event
  
  /**
    * Number of webhooks that have yet to be successfully delivered (i.e., to return a 20x response) to the URLs you've specified.
    */
  var pending_webhooks: Double
  
  /**
    * Information on the API request that instigated the event.
    */
  var request: Request | Null
  
  /**
    * Description of the event (e.g., `invoice.created` or `charge.refunded`).
    */
  var `type`: String
}
object ResponseEvent {
  
  inline def apply(
    created: Double,
    data: Data,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    pending_webhooks: Double,
    `type`: String
  ): ResponseEvent = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], pending_webhooks = pending_webhooks.asInstanceOf[js.Any], api_version = null, request = null)
    __obj.updateDynamic("object")("event")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseEvent] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
    
    inline def setApi_versionNull: Self = StObject.set(x, "api_version", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: event): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPending_webhooks(value: Double): Self = StObject.set(x, "pending_webhooks", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestNull: Self = StObject.set(x, "request", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
