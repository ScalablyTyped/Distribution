package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.webhook_endpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.WebhookEndpoint> */
trait ResponseWebhookEndpoint extends StObject {
  
  /**
    * The API version events are rendered as for this webhook endpoint.
    */
  var api_version: String | Null
  
  /**
    * The ID of the associated Connect application.
    */
  var application: String | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * An optional description of what the webhook is used for.
    */
  var description: String | Null
  
  /**
    * The list of events to enable for this endpoint. `['*']` indicates that all events are enabled, except those that require explicit selection.
    */
  var enabled_events: js.Array[String]
  
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
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: webhook_endpoint
  
  /**
    * The endpoint's secret, used to generate [webhook signatures](https://stripe.com/docs/webhooks/signatures). Only returned at creation.
    */
  var secret: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the webhook. It can be `enabled` or `disabled`.
    */
  var status: String
  
  /**
    * The URL of the webhook endpoint.
    */
  var url: String
}
object ResponseWebhookEndpoint {
  
  inline def apply(
    created: Double,
    enabled_events: js.Array[String],
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    status: String,
    url: String
  ): ResponseWebhookEndpoint = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], enabled_events = enabled_events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], api_version = null, application = null, description = null)
    __obj.updateDynamic("object")("webhook_endpoint")
    __obj.asInstanceOf[ResponseWebhookEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseWebhookEndpoint] (val x: Self) extends AnyVal {
    
    inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
    
    inline def setApi_versionNull: Self = StObject.set(x, "api_version", null)
    
    inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationNull: Self = StObject.set(x, "application", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEnabled_events(value: js.Array[String]): Self = StObject.set(x, "enabled_events", value.asInstanceOf[js.Any])
    
    inline def setEnabled_eventsVarargs(value: String*): Self = StObject.set(x, "enabled_events", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: webhook_endpoint): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
