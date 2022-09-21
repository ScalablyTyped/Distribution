package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceWebhookMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/webhook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/webhook", "WebhookContext")
  @js.native
  open class WebhookContext protected () extends StObject {
    /**
      * Initialize the WebhookContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - Service Sid.
      * @param sid - The unique string that identifies the resource to fetch
      */
    def this(version: typings.twilio.verifyV2Mod.^, serviceSid: String, sid: String) = this()
    
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
  
  @JSImport("twilio/lib/rest/verify/v2/service/webhook", "WebhookInstance")
  @js.native
  open class WebhookInstance protected () extends SerializableClass {
    /**
      * Initialize the WebhookContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Service Sid.
      * @param sid - The unique string that identifies the resource to fetch
      */
    def this(version: typings.twilio.verifyV2Mod.^, payload: WebhookPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: WebhookContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var eventTypes: js.Array[String] = js.native
    
    /**
      * fetch a WebhookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WebhookInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WebhookInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a WebhookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var status: WebhookStatus = js.native
    
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
    
    var version: WebhookVersion = js.native
    
    var webhookMethod: WebhookMethods = js.native
    
    var webhookUrl: String = js.native
  }
  
  /**
    * Initialize the WebhookList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - Service Sid.
    */
  inline def WebhookList(version: typings.twilio.verifyV2Mod.^, serviceSid: String): WebhookListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WebhookList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[WebhookListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/webhook", "WebhookPage")
  @js.native
  open class WebhookPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, WebhookPayload, WebhookResource, WebhookInstance] {
    /**
      * Initialize the WebhookPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
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
    * @property eventTypes - The array of events that this Webhook is subscribed to.
    * @property friendlyName - The string that you assigned to describe the webhook
    * @property status - The webhook status
    * @property version - The webhook version
    * @property webhookUrl - The URL associated with this Webhook.
    */
  trait WebhookInstanceUpdateOptions extends StObject {
    
    var eventTypes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[WebhookStatus] = js.undefined
    
    var version: js.UndefOr[WebhookVersion] = js.undefined
    
    var webhookUrl: js.UndefOr[String] = js.undefined
  }
  object WebhookInstanceUpdateOptions {
    
    inline def apply(): WebhookInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookInstanceUpdateOptions]
    }
    
    extension [Self <: WebhookInstanceUpdateOptions](x: Self) {
      
      inline def setEventTypes(value: String | js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
      
      inline def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
      
      inline def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value*))
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setStatus(value: WebhookStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setVersion(value: WebhookVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWebhookUrl(value: String): Self = StObject.set(x, "webhookUrl", value.asInstanceOf[js.Any])
      
      inline def setWebhookUrlUndefined: Self = StObject.set(x, "webhookUrl", js.undefined)
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
      * @param sid - The unique string that identifies the resource to fetch
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
    * @property eventTypes - The array of events that this Webhook is subscribed to.
    * @property friendlyName - The string that you assigned to describe the webhook
    * @property status - The webhook status
    * @property version - The webhook version
    * @property webhookUrl - The URL associated with this Webhook.
    */
  trait WebhookListInstanceCreateOptions extends StObject {
    
    var eventTypes: String | js.Array[String]
    
    var friendlyName: String
    
    var status: js.UndefOr[WebhookStatus] = js.undefined
    
    var version: js.UndefOr[WebhookVersion] = js.undefined
    
    var webhookUrl: String
  }
  object WebhookListInstanceCreateOptions {
    
    inline def apply(eventTypes: String | js.Array[String], friendlyName: String, webhookUrl: String): WebhookListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(eventTypes = eventTypes.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], webhookUrl = webhookUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookListInstanceCreateOptions]
    }
    
    extension [Self <: WebhookListInstanceCreateOptions](x: Self) {
      
      inline def setEventTypes(value: String | js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
      
      inline def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value*))
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: WebhookStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setVersion(value: WebhookVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWebhookUrl(value: String): Self = StObject.set(x, "webhookUrl", value.asInstanceOf[js.Any])
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
  trait WebhookMethods extends StObject
  object WebhookMethods {
    
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
      date_created: js.Date,
      date_updated: js.Date,
      event_types: js.Array[String],
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      status: WebhookStatus,
      uri: String,
      url: String,
      version: WebhookVersion,
      webhook_method: WebhookMethods,
      webhook_url: String
    ): WebhookPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], event_types = event_types.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webhook_method = webhook_method.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookPayload]
    }
  }
  
  trait WebhookResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var event_types: js.Array[String]
    
    var friendly_name: String
    
    var service_sid: String
    
    var sid: String
    
    var status: WebhookStatus
    
    var url: String
    
    var version: WebhookVersion
    
    var webhook_method: WebhookMethods
    
    var webhook_url: String
  }
  object WebhookResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      event_types: js.Array[String],
      friendly_name: String,
      service_sid: String,
      sid: String,
      status: WebhookStatus,
      url: String,
      version: WebhookVersion,
      webhook_method: WebhookMethods,
      webhook_url: String
    ): WebhookResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], event_types = event_types.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webhook_method = webhook_method.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookResource]
    }
    
    extension [Self <: WebhookResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEvent_types(value: js.Array[String]): Self = StObject.set(x, "event_types", value.asInstanceOf[js.Any])
      
      inline def setEvent_typesVarargs(value: String*): Self = StObject.set(x, "event_types", js.Array(value*))
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: WebhookStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: WebhookVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWebhook_method(value: WebhookMethods): Self = StObject.set(x, "webhook_method", value.asInstanceOf[js.Any])
      
      inline def setWebhook_url(value: String): Self = StObject.set(x, "webhook_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebhookSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object WebhookSolution {
    
    inline def apply(): WebhookSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookSolution]
    }
    
    extension [Self <: WebhookSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.enabled
    - typings.twilio.twilioStrings.disabled
  */
  trait WebhookStatus extends StObject
  object WebhookStatus {
    
    inline def disabled: typings.twilio.twilioStrings.disabled = "disabled".asInstanceOf[typings.twilio.twilioStrings.disabled]
    
    inline def enabled: typings.twilio.twilioStrings.enabled = "enabled".asInstanceOf[typings.twilio.twilioStrings.enabled]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.v1
    - typings.twilio.twilioStrings.v2
  */
  trait WebhookVersion extends StObject
  object WebhookVersion {
    
    inline def v1: typings.twilio.twilioStrings.v1 = "v1".asInstanceOf[typings.twilio.twilioStrings.v1]
    
    inline def v2: typings.twilio.twilioStrings.v2 = "v2".asInstanceOf[typings.twilio.twilioStrings.v2]
  }
}
