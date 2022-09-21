package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.inactive_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webChannelMod {
  
  @JSImport("twilio/lib/rest/flexApi/v1/webChannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/flexApi/v1/webChannel", "WebChannelContext")
  @js.native
  open class WebChannelContext protected () extends StObject {
    /**
      * Initialize the WebChannelContext
      *
      * @param version - Version of the resource
      * @param sid - The SID of the WebChannel resource to fetch
      */
    def this(version: typings.twilio.flexApiV1Mod.^, sid: String) = this()
    
    /**
      * fetch a WebChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WebChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelInstance, Any]): js.Promise[WebChannelInstance] = js.native
    
    /**
      * remove a WebChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a WebChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WebChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelInstance, Any]): js.Promise[WebChannelInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelInstance, Any]
    ): js.Promise[WebChannelInstance] = js.native
    def update(opts: WebChannelInstanceUpdateOptions): js.Promise[WebChannelInstance] = js.native
    def update(
      opts: WebChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelInstance, Any]
    ): js.Promise[WebChannelInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/flexApi/v1/webChannel", "WebChannelInstance")
  @js.native
  open class WebChannelInstance protected () extends SerializableClass {
    /**
      * Initialize the WebChannelContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID of the WebChannel resource to fetch
      */
    def this(version: typings.twilio.flexApiV1Mod.^, payload: WebChannelPayload, sid: String) = this()
    
    /* private */ var _proxy: WebChannelContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a WebChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WebChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WebChannelInstance] = js.native
    
    var flexFlowSid: String = js.native
    
    /**
      * remove a WebChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a WebChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WebChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WebChannelInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WebChannelInstance] = js.native
    def update(opts: WebChannelInstanceUpdateOptions): js.Promise[WebChannelInstance] = js.native
    def update(
      opts: WebChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WebChannelInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the WebChannelList
    *
    * @param version - Version of the resource
    */
  inline def WebChannelList(version: typings.twilio.flexApiV1Mod.^): WebChannelListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("WebChannelList")(version.asInstanceOf[js.Any]).asInstanceOf[WebChannelListInstance]
  
  @JSImport("twilio/lib/rest/flexApi/v1/webChannel", "WebChannelPage")
  @js.native
  open class WebChannelPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.flexApiV1Mod.^, 
          WebChannelPayload, 
          WebChannelResource, 
          WebChannelInstance
        ] {
    /**
      * Initialize the WebChannelPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WebChannelSolution
    ) = this()
    
    /**
      * Build an instance of WebChannelInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WebChannelPayload): WebChannelInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  type WebChannelChatStatus = inactive_
  
  /**
    * Options to pass to update
    *
    * @property chatStatus - The chat status
    * @property postEngagementData - The post-engagement data
    */
  trait WebChannelInstanceUpdateOptions extends StObject {
    
    var chatStatus: js.UndefOr[WebChannelChatStatus] = js.undefined
    
    var postEngagementData: js.UndefOr[String] = js.undefined
  }
  object WebChannelInstanceUpdateOptions {
    
    inline def apply(): WebChannelInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebChannelInstanceUpdateOptions]
    }
    
    extension [Self <: WebChannelInstanceUpdateOptions](x: Self) {
      
      inline def setChatStatus(value: WebChannelChatStatus): Self = StObject.set(x, "chatStatus", value.asInstanceOf[js.Any])
      
      inline def setChatStatusUndefined: Self = StObject.set(x, "chatStatus", js.undefined)
      
      inline def setPostEngagementData(value: String): Self = StObject.set(x, "postEngagementData", value.asInstanceOf[js.Any])
      
      inline def setPostEngagementDataUndefined: Self = StObject.set(x, "postEngagementData", js.undefined)
    }
  }
  
  @js.native
  trait WebChannelListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WebChannelContext = js.native
    
    /**
      * create a WebChannelInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: WebChannelListInstanceCreateOptions): js.Promise[WebChannelInstance] = js.native
    def create(
      opts: WebChannelListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ WebChannelInstance, Any]
    ): js.Promise[WebChannelInstance] = js.native
    
    /**
      * Streams WebChannelInstance records from the API.
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
          /* item */ WebChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ WebChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: WebChannelListInstanceEachOptions): Unit = js.native
    def each(
      opts: WebChannelListInstanceEachOptions,
      callback: js.Function2[
          /* item */ WebChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a web_channel
      *
      * @param sid - The SID of the WebChannel resource to fetch
      */
    def get(sid: String): WebChannelContext = js.native
    
    /**
      * Retrieve a single target page of WebChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[WebChannelPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelPage, Any]): js.Promise[WebChannelPage] = js.native
    def getPage(targetUrl: String): js.Promise[WebChannelPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelPage, Any]
    ): js.Promise[WebChannelPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelPage, Any]
    ): js.Promise[WebChannelPage] = js.native
    
    /**
      * Lists WebChannelInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[WebChannelInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WebChannelInstance], Any]): js.Promise[js.Array[WebChannelInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WebChannelInstance], Any]
    ): js.Promise[js.Array[WebChannelInstance]] = js.native
    def list(opts: WebChannelListInstanceOptions): js.Promise[js.Array[WebChannelInstance]] = js.native
    def list(
      opts: WebChannelListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WebChannelInstance], Any]
    ): js.Promise[js.Array[WebChannelInstance]] = js.native
    
    /**
      * Retrieve a single page of WebChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[WebChannelPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelPage, Any]): js.Promise[WebChannelPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelPage, Any]): js.Promise[WebChannelPage] = js.native
    def page(opts: WebChannelListInstancePageOptions): js.Promise[WebChannelPage] = js.native
    def page(
      opts: WebChannelListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WebChannelPage, Any]
    ): js.Promise[WebChannelPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property chatFriendlyName - The chat channel's friendly name
    * @property chatUniqueName - The chat channel's unique name
    * @property customerFriendlyName - The chat participant's friendly name
    * @property flexFlowSid - The SID of the Flex Flow
    * @property identity - The chat identity
    * @property preEngagementData - The pre-engagement data
    */
  trait WebChannelListInstanceCreateOptions extends StObject {
    
    var chatFriendlyName: String
    
    var chatUniqueName: js.UndefOr[String] = js.undefined
    
    var customerFriendlyName: String
    
    var flexFlowSid: String
    
    var identity: String
    
    var preEngagementData: js.UndefOr[String] = js.undefined
  }
  object WebChannelListInstanceCreateOptions {
    
    inline def apply(chatFriendlyName: String, customerFriendlyName: String, flexFlowSid: String, identity: String): WebChannelListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(chatFriendlyName = chatFriendlyName.asInstanceOf[js.Any], customerFriendlyName = customerFriendlyName.asInstanceOf[js.Any], flexFlowSid = flexFlowSid.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebChannelListInstanceCreateOptions]
    }
    
    extension [Self <: WebChannelListInstanceCreateOptions](x: Self) {
      
      inline def setChatFriendlyName(value: String): Self = StObject.set(x, "chatFriendlyName", value.asInstanceOf[js.Any])
      
      inline def setChatUniqueName(value: String): Self = StObject.set(x, "chatUniqueName", value.asInstanceOf[js.Any])
      
      inline def setChatUniqueNameUndefined: Self = StObject.set(x, "chatUniqueName", js.undefined)
      
      inline def setCustomerFriendlyName(value: String): Self = StObject.set(x, "customerFriendlyName", value.asInstanceOf[js.Any])
      
      inline def setFlexFlowSid(value: String): Self = StObject.set(x, "flexFlowSid", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setPreEngagementData(value: String): Self = StObject.set(x, "preEngagementData", value.asInstanceOf[js.Any])
      
      inline def setPreEngagementDataUndefined: Self = StObject.set(x, "preEngagementData", js.undefined)
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
  trait WebChannelListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ WebChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object WebChannelListInstanceEachOptions {
    
    inline def apply(): WebChannelListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebChannelListInstanceEachOptions]
    }
    
    extension [Self <: WebChannelListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ WebChannelInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait WebChannelListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object WebChannelListInstanceOptions {
    
    inline def apply(): WebChannelListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebChannelListInstanceOptions]
    }
    
    extension [Self <: WebChannelListInstanceOptions](x: Self) {
      
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
  trait WebChannelListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object WebChannelListInstancePageOptions {
    
    inline def apply(): WebChannelListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebChannelListInstancePageOptions]
    }
    
    extension [Self <: WebChannelListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait WebChannelPayload
    extends StObject
       with WebChannelResource
       with TwilioResponsePayload
  object WebChannelPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      flex_flow_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): WebChannelPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flex_flow_sid = flex_flow_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebChannelPayload]
    }
  }
  
  trait WebChannelResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var flex_flow_sid: String
    
    var sid: String
    
    var url: String
  }
  object WebChannelResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      flex_flow_sid: String,
      sid: String,
      url: String
    ): WebChannelResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], flex_flow_sid = flex_flow_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebChannelResource]
    }
    
    extension [Self <: WebChannelResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFlex_flow_sid(value: String): Self = StObject.set(x, "flex_flow_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebChannelSolution extends StObject
}
