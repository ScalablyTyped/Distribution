package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationWebhookMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/configuration/webhook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/configuration/webhook", "WebhookContext")
  @js.native
  open class WebhookContext protected () extends StObject {
    /**
      * Initialize the WebhookContext
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.conversationsV1Mod.^) = this()
    
    /**
      * fetch a WebhookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WebhookInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookInstance, Any]): js.Promise[WebhookInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a WebhookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WebhookInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookInstance, Any]): js.Promise[WebhookInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookInstance, Any]): js.Promise[WebhookInstance] = js.native
    def update(opts: WebhookInstanceUpdateOptions): js.Promise[WebhookInstance] = js.native
    def update(
      opts: WebhookInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookInstance, Any]
    ): js.Promise[WebhookInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/configuration/webhook", "WebhookInstance")
  @js.native
  open class WebhookInstance protected () extends SerializableClass {
    /**
      * Initialize the WebhookContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.conversationsV1Mod.^, payload: WebhookPayload) = this()
    
    /* private */ var _proxy: WebhookContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * fetch a WebhookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WebhookInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WebhookInstance] = js.native
    
    var filters: js.Array[String] = js.native
    
    var method: WebhookMethod = js.native
    
    var postWebhookUrl: String = js.native
    
    var preWebhookUrl: String = js.native
    
    var target: WebhookTarget = js.native
    
    /**
      * update a WebhookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WebhookInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WebhookInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WebhookInstance] = js.native
    def update(opts: WebhookInstanceUpdateOptions): js.Promise[WebhookInstance] = js.native
    def update(
      opts: WebhookInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WebhookInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the WebhookList
    *
    * @param version - Version of the resource
    */
  inline def WebhookList(version: typings.twilio.conversationsV1Mod.^): WebhookListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("WebhookList")(version.asInstanceOf[js.Any]).asInstanceOf[WebhookListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/configuration/webhook", "WebhookPage")
  @js.native
  open class WebhookPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.conversationsV1Mod.^, WebhookPayload, WebhookResource, WebhookInstance] {
    /**
      * Initialize the WebhookPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WebhookSolution
    ) = this()
    
    /**
      * Build an instance of WebhookInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WebhookPayload): WebhookInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property filters - The list of webhook event triggers that are enabled for this Service.
    * @property method - The HTTP method to be used when sending a webhook request.
    * @property postWebhookUrl - The absolute url the post-event webhook request should be sent to.
    * @property preWebhookUrl - The absolute url the pre-event webhook request should be sent to.
    * @property target - The routing target of the webhook.
    */
  trait WebhookInstanceUpdateOptions extends StObject {
    
    var filters: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var postWebhookUrl: js.UndefOr[String] = js.undefined
    
    var preWebhookUrl: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[WebhookTarget] = js.undefined
  }
  object WebhookInstanceUpdateOptions {
    
    inline def apply(): WebhookInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookInstanceUpdateOptions]
    }
    
    extension [Self <: WebhookInstanceUpdateOptions](x: Self) {
      
      inline def setFilters(value: String | js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPostWebhookUrl(value: String): Self = StObject.set(x, "postWebhookUrl", value.asInstanceOf[js.Any])
      
      inline def setPostWebhookUrlUndefined: Self = StObject.set(x, "postWebhookUrl", js.undefined)
      
      inline def setPreWebhookUrl(value: String): Self = StObject.set(x, "preWebhookUrl", value.asInstanceOf[js.Any])
      
      inline def setPreWebhookUrlUndefined: Self = StObject.set(x, "preWebhookUrl", js.undefined)
      
      inline def setTarget(value: WebhookTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait WebhookListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WebhookContext = js.native
    
    /**
      * Constructs a webhook
      */
    def get(): WebhookContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.GET
    - typings.twilio.twilioStrings.POST
  */
  trait WebhookMethod extends StObject
  object WebhookMethod {
    
    inline def GET: typings.twilio.twilioStrings.GET = "GET".asInstanceOf[typings.twilio.twilioStrings.GET]
    
    inline def POST: typings.twilio.twilioStrings.POST = "POST".asInstanceOf[typings.twilio.twilioStrings.POST]
  }
  
  trait WebhookPayload
    extends StObject
       with WebhookResource
       with TwilioResponsePayload
  object WebhookPayload {
    
    inline def apply(
      account_sid: String,
      filters: js.Array[String],
      first_page_uri: String,
      method: WebhookMethod,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      post_webhook_url: String,
      pre_webhook_url: String,
      previous_page_uri: String,
      target: WebhookTarget,
      uri: String,
      url: String
    ): WebhookPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], post_webhook_url = post_webhook_url.asInstanceOf[js.Any], pre_webhook_url = pre_webhook_url.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookPayload]
    }
  }
  
  trait WebhookResource extends StObject {
    
    var account_sid: String
    
    var filters: js.Array[String]
    
    var method: WebhookMethod
    
    var post_webhook_url: String
    
    var pre_webhook_url: String
    
    var target: WebhookTarget
    
    var url: String
  }
  object WebhookResource {
    
    inline def apply(
      account_sid: String,
      filters: js.Array[String],
      method: WebhookMethod,
      post_webhook_url: String,
      pre_webhook_url: String,
      target: WebhookTarget,
      url: String
    ): WebhookResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], post_webhook_url = post_webhook_url.asInstanceOf[js.Any], pre_webhook_url = pre_webhook_url.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookResource]
    }
    
    extension [Self <: WebhookResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setMethod(value: WebhookMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPost_webhook_url(value: String): Self = StObject.set(x, "post_webhook_url", value.asInstanceOf[js.Any])
      
      inline def setPre_webhook_url(value: String): Self = StObject.set(x, "pre_webhook_url", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: WebhookTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebhookSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.webhook
    - typings.twilio.twilioStrings.flex
  */
  trait WebhookTarget extends StObject
  object WebhookTarget {
    
    inline def flex: typings.twilio.twilioStrings.flex = "flex".asInstanceOf[typings.twilio.twilioStrings.flex]
    
    inline def webhook: typings.twilio.twilioStrings.webhook = "webhook".asInstanceOf[typings.twilio.twilioStrings.webhook]
  }
}
