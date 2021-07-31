package typings.stripe.mod

import typings.stripe.mod.events.EventType
import typings.stripe.stripeStrings.disabled
import typings.stripe.stripeStrings.enabled
import typings.stripe.stripeStrings.webhook_endpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webhookEndpoints {
  
  trait IWebhookCreateOptions extends StObject {
    
    /**
      * Events sent to this endpoint will be generated with this Stripe Version instead of your
      * account’s default Stripe Version.
      */
    var api_version: js.UndefOr[String] = js.undefined
    
    /**
      * If true, this endpoint will receive events from connected accounts instead of just your account.
      */
    var connect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The list of enabled events for this webhook endpoint.
      * Use '*' to enable all events, except those that require explicit selection.
      */
    var enabled_events: js.Array[EventType]
    
    /**
      * The URL of the webhook endpoint
      */
    var url: String
  }
  object IWebhookCreateOptions {
    
    @scala.inline
    def apply(enabled_events: js.Array[EventType], url: String): IWebhookCreateOptions = {
      val __obj = js.Dynamic.literal(enabled_events = enabled_events.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebhookCreateOptions]
    }
    
    @scala.inline
    implicit class IWebhookCreateOptionsMutableBuilder[Self <: IWebhookCreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_versionUndefined: Self = StObject.set(x, "api_version", js.undefined)
      
      @scala.inline
      def setConnect(value: Boolean): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      @scala.inline
      def setEnabled_events(value: js.Array[EventType]): Self = StObject.set(x, "enabled_events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled_eventsVarargs(value: EventType*): Self = StObject.set(x, "enabled_events", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWebhookEndpoint
    extends StObject
       with IObject {
    
    /**
      * The Stripe API version used to render data.
      */
    var api_version: String
    
    /**
      * ID of the Application.
      */
    var application: String | Null
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * The list of enabled events for this webhook endpoint.
      * Use '*' to enable all events, except those that require explicit selection.
      */
    var enabled_events: js.Array[EventType]
    
    var id: String
    
    /**
      * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
      */
    var livemode: Boolean
    
    /**
      * Set of key-value pairs that you can attach to an object.
      * This can be useful for storing additional information about
      * the object in a structured format.
      */
    var metadata: js.UndefOr[IMetadata] = js.undefined
    
    /**
      * Value is 'webhook_endpoint'
      */
    @JSName("object")
    var object_IWebhookEndpoint: webhook_endpoint
    
    /**
      * The endpoint’s secret, used to generate webhook signatures. Only returned at creation.
      */
    var secret: js.UndefOr[String] = js.undefined
    
    /**
      * The status of the webhook.
      */
    var status: enabled | disabled
    
    /**
      * The URL of the webhook endpoint.
      */
    var url: String
  }
  object IWebhookEndpoint {
    
    @scala.inline
    def apply(
      api_version: String,
      created: Double,
      enabled_events: js.Array[EventType],
      id: String,
      livemode: Boolean,
      status: enabled | disabled,
      url: String
    ): IWebhookEndpoint = {
      val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], enabled_events = enabled_events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], application = null)
      __obj.updateDynamic("object")("webhook_endpoint")
      __obj.asInstanceOf[IWebhookEndpoint]
    }
    
    @scala.inline
    implicit class IWebhookEndpointMutableBuilder[Self <: IWebhookEndpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationNull: Self = StObject.set(x, "application", null)
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled_events(value: js.Array[EventType]): Self = StObject.set(x, "enabled_events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled_eventsVarargs(value: EventType*): Self = StObject.set(x, "enabled_events", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setObject(value: webhook_endpoint): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setStatus(value: enabled | disabled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWebhookUpdateOptions extends StObject {
    
    /**
      * If true, it disables the webhookendpoint.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The list of enabled events for this webhook endpoint.
      * Use '*' to enable all events, except those that require explicit selection.
      */
    var enabled_events: js.UndefOr[js.Array[EventType]] = js.undefined
    
    /**
      * Set of key-value pairs that you can attach to an object.
      * This can be useful for storing additional information about
      * the object in a structured format.
      */
    var metadata: js.UndefOr[IMetadata] = js.undefined
    
    /**
      * The URL of the webhook endpoint.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object IWebhookUpdateOptions {
    
    @scala.inline
    def apply(): IWebhookUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebhookUpdateOptions]
    }
    
    @scala.inline
    implicit class IWebhookUpdateOptionsMutableBuilder[Self <: IWebhookUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEnabled_events(value: js.Array[EventType]): Self = StObject.set(x, "enabled_events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled_eventsUndefined: Self = StObject.set(x, "enabled_events", js.undefined)
      
      @scala.inline
      def setEnabled_eventsVarargs(value: EventType*): Self = StObject.set(x, "enabled_events", js.Array(value :_*))
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
