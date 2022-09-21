package typings.twilio

import typings.twilio.anon.Triggers
import typings.twilio.anon.Url
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceConversationWebhookMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/webhook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/webhook", "WebhookContext")
  @js.native
  open class WebhookContext protected () extends StObject {
    /**
      * Initialize the WebhookContext
      *
      * @param version - Version of the resource
      * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
      * @param conversationSid - The unique ID of the Conversation for this webhook.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      chatServiceSid: String,
      conversationSid: String,
      sid: String
    ) = this()
    
    /**
      * fetch a WebhookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WebhookInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookInstance, Any]): js.Promise[WebhookInstance] = js.native
    
    /**
      * remove a WebhookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookInstance, Any]): js.Promise[Boolean] = js.native
    
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
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/webhook", "WebhookInstance")
  @js.native
  open class WebhookInstance protected () extends SerializableClass {
    /**
      * Initialize the WebhookContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
      * @param conversationSid - The unique ID of the Conversation for this webhook.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      payload: WebhookPayload,
      chatServiceSid: String,
      conversationSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: WebhookContext = js.native
    
    var accountSid: String = js.native
    
    var chatServiceSid: String = js.native
    
    var configuration: Any = js.native
    
    var conversationSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a WebhookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WebhookInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WebhookInstance] = js.native
    
    /**
      * remove a WebhookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var target: String = js.native
    
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
    * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
    * @param conversationSid - The unique ID of the Conversation for this webhook.
    */
  inline def WebhookList(version: typings.twilio.conversationsV1Mod.^, chatServiceSid: String, conversationSid: String): WebhookListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WebhookList")(version.asInstanceOf[js.Any], chatServiceSid.asInstanceOf[js.Any], conversationSid.asInstanceOf[js.Any])).asInstanceOf[WebhookListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/webhook", "WebhookPage")
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
    * @property configuration.filters - The list of events, firing webhook event for this Conversation.
    * @property configuration.flowSid - The studio flow SID, where the webhook should be sent to.
    * @property configuration.method - The HTTP method to be used when sending a webhook request.
    * @property configuration.triggers - The list of keywords, firing webhook event for this Conversation.
    * @property configuration.url - The absolute url the webhook request should be sent to.
    */
  trait WebhookInstanceUpdateOptions extends StObject {
    
    var configuration: js.UndefOr[Triggers] = js.undefined
  }
  object WebhookInstanceUpdateOptions {
    
    inline def apply(): WebhookInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookInstanceUpdateOptions]
    }
    
    extension [Self <: WebhookInstanceUpdateOptions](x: Self) {
      
      inline def setConfiguration(value: Triggers): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    }
  }
  
  @js.native
  trait WebhookListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WebhookContext = js.native
    
    /**
      * create a WebhookInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: WebhookListInstanceCreateOptions): js.Promise[WebhookInstance] = js.native
    def create(
      opts: WebhookListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ WebhookInstance, Any]
    ): js.Promise[WebhookInstance] = js.native
    
    /**
      * Streams WebhookInstance records from the API.
      *
      * This operation lazily loads records as efficiently as possible until the limit
      * is reached.
      *
      * The results are passed into the callback function, so this operation is memory
      * efficient.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ WebhookInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ WebhookInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: WebhookListInstanceEachOptions): Unit = js.native
    def each(
      opts: WebhookListInstanceEachOptions,
      callback: js.Function2[
          /* item */ WebhookInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a webhook
      *
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def get(sid: String): WebhookContext = js.native
    
    /**
      * Retrieve a single target page of WebhookInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[WebhookPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookPage, Any]): js.Promise[WebhookPage] = js.native
    def getPage(targetUrl: String): js.Promise[WebhookPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookPage, Any]
    ): js.Promise[WebhookPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookPage, Any]): js.Promise[WebhookPage] = js.native
    
    /**
      * Lists WebhookInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[WebhookInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WebhookInstance], Any]): js.Promise[js.Array[WebhookInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WebhookInstance], Any]
    ): js.Promise[js.Array[WebhookInstance]] = js.native
    def list(opts: WebhookListInstanceOptions): js.Promise[js.Array[WebhookInstance]] = js.native
    def list(
      opts: WebhookListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WebhookInstance], Any]
    ): js.Promise[js.Array[WebhookInstance]] = js.native
    
    /**
      * Retrieve a single page of WebhookInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[WebhookPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookPage, Any]): js.Promise[WebhookPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookPage, Any]): js.Promise[WebhookPage] = js.native
    def page(opts: WebhookListInstancePageOptions): js.Promise[WebhookPage] = js.native
    def page(
      opts: WebhookListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WebhookPage, Any]
    ): js.Promise[WebhookPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property configuration.filters - The list of events, firing webhook event for this Conversation.
    * @property configuration.flowSid - The studio flow SID, where the webhook should be sent to.
    * @property configuration.method - The HTTP method to be used when sending a webhook request.
    * @property configuration.replayAfter - The message index for which and it's successors the webhook will be replayed.
    * @property configuration.triggers - The list of keywords, firing webhook event for this Conversation.
    * @property configuration.url - The absolute url the webhook request should be sent to.
    * @property target - The target of this webhook.
    */
  trait WebhookListInstanceCreateOptions extends StObject {
    
    var configuration: js.UndefOr[Url] = js.undefined
    
    var target: WebhookTarget
  }
  object WebhookListInstanceCreateOptions {
    
    inline def apply(target: WebhookTarget): WebhookListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookListInstanceCreateOptions]
    }
    
    extension [Self <: WebhookListInstanceCreateOptions](x: Self) {
      
      inline def setConfiguration(value: Url): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setTarget(value: WebhookTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait WebhookListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ WebhookInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object WebhookListInstanceEachOptions {
    
    inline def apply(): WebhookListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookListInstanceEachOptions]
    }
    
    extension [Self <: WebhookListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ WebhookInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait WebhookListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object WebhookListInstanceOptions {
    
    inline def apply(): WebhookListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookListInstanceOptions]
    }
    
    extension [Self <: WebhookListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait WebhookListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object WebhookListInstancePageOptions {
    
    inline def apply(): WebhookListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookListInstancePageOptions]
    }
    
    extension [Self <: WebhookListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
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
      chat_service_sid: String,
      configuration: js.Object,
      conversation_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      target: String,
      uri: String,
      url: String
    ): WebhookPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookPayload]
    }
  }
  
  trait WebhookResource extends StObject {
    
    var account_sid: String
    
    var chat_service_sid: String
    
    var configuration: js.Object
    
    var conversation_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var sid: String
    
    var target: String
    
    var url: String
  }
  object WebhookResource {
    
    inline def apply(
      account_sid: String,
      chat_service_sid: String,
      configuration: js.Object,
      conversation_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      sid: String,
      target: String,
      url: String
    ): WebhookResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookResource]
    }
    
    extension [Self <: WebhookResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setConfiguration(value: js.Object): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConversation_sid(value: String): Self = StObject.set(x, "conversation_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebhookSolution extends StObject {
    
    var chatServiceSid: js.UndefOr[String] = js.undefined
    
    var conversationSid: js.UndefOr[String] = js.undefined
  }
  object WebhookSolution {
    
    inline def apply(): WebhookSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookSolution]
    }
    
    extension [Self <: WebhookSolution](x: Self) {
      
      inline def setChatServiceSid(value: String): Self = StObject.set(x, "chatServiceSid", value.asInstanceOf[js.Any])
      
      inline def setChatServiceSidUndefined: Self = StObject.set(x, "chatServiceSid", js.undefined)
      
      inline def setConversationSid(value: String): Self = StObject.set(x, "conversationSid", value.asInstanceOf[js.Any])
      
      inline def setConversationSidUndefined: Self = StObject.set(x, "conversationSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.webhook
    - typings.twilio.twilioStrings.trigger
    - typings.twilio.twilioStrings.studio
  */
  trait WebhookTarget extends StObject
  object WebhookTarget {
    
    inline def studio: typings.twilio.twilioStrings.studio = "studio".asInstanceOf[typings.twilio.twilioStrings.studio]
    
    inline def trigger: typings.twilio.twilioStrings.trigger = "trigger".asInstanceOf[typings.twilio.twilioStrings.trigger]
    
    inline def webhook: typings.twilio.twilioStrings.webhook = "webhook".asInstanceOf[typings.twilio.twilioStrings.webhook]
  }
}
