package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ChannelMod {
  
  @JSImport("twilio/lib/rest/flexApi/v1/channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/flexApi/v1/channel", "ChannelContext")
  @js.native
  open class ChannelContext protected () extends StObject {
    /**
      * Initialize the ChannelContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the Flex chat channel resource to fetch
      */
    def this(version: typings.twilio.flexApiV1Mod.^, sid: String) = this()
    
    /**
      * fetch a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelInstance, Any]): js.Promise[ChannelInstance] = js.native
    
    /**
      * remove a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/flexApi/v1/channel", "ChannelInstance")
  @js.native
  open class ChannelInstance protected () extends SerializableClass {
    /**
      * Initialize the ChannelContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the Flex chat channel resource to fetch
      */
    def this(version: typings.twilio.flexApiV1Mod.^, payload: ChannelPayload, sid: String) = this()
    
    /* private */ var _proxy: ChannelContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ChannelInstance] = js.native
    
    var flexFlowSid: String = js.native
    
    /**
      * remove a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var taskSid: String = js.native
    
    var url: String = js.native
    
    var userSid: String = js.native
  }
  
  /**
    * Initialize the ChannelList
    *
    * @param version - Version of the resource
    */
  inline def ChannelList(version: typings.twilio.flexApiV1Mod.^): ChannelListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ChannelList")(version.asInstanceOf[js.Any]).asInstanceOf[ChannelListInstance]
  
  @JSImport("twilio/lib/rest/flexApi/v1/channel", "ChannelPage")
  @js.native
  open class ChannelPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.flexApiV1Mod.^, ChannelPayload, ChannelResource, ChannelInstance] {
    /**
      * Initialize the ChannelPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ChannelSolution
    ) = this()
    
    /**
      * Build an instance of ChannelInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ChannelPayload): ChannelInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ChannelListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ChannelContext = js.native
    
    /**
      * create a ChannelInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ChannelListInstanceCreateOptions): js.Promise[ChannelInstance] = js.native
    def create(
      opts: ChannelListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ChannelInstance, Any]
    ): js.Promise[ChannelInstance] = js.native
    
    /**
      * Streams ChannelInstance records from the API.
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
          /* item */ ChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ChannelListInstanceEachOptions): Unit = js.native
    def each(
      opts: ChannelListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a channel
      *
      * @param sid - The SID that identifies the Flex chat channel resource to fetch
      */
    def get(sid: String): ChannelContext = js.native
    
    /**
      * Retrieve a single target page of ChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ChannelPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]): js.Promise[ChannelPage] = js.native
    def getPage(targetUrl: String): js.Promise[ChannelPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]
    ): js.Promise[ChannelPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]): js.Promise[ChannelPage] = js.native
    
    /**
      * Lists ChannelInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ChannelInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ChannelInstance], Any]): js.Promise[js.Array[ChannelInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ChannelInstance], Any]
    ): js.Promise[js.Array[ChannelInstance]] = js.native
    def list(opts: ChannelListInstanceOptions): js.Promise[js.Array[ChannelInstance]] = js.native
    def list(
      opts: ChannelListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ChannelInstance], Any]
    ): js.Promise[js.Array[ChannelInstance]] = js.native
    
    /**
      * Retrieve a single page of ChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ChannelPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]): js.Promise[ChannelPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]): js.Promise[ChannelPage] = js.native
    def page(opts: ChannelListInstancePageOptions): js.Promise[ChannelPage] = js.native
    def page(
      opts: ChannelListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]
    ): js.Promise[ChannelPage] = js.native
    
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
    * @property chatUserFriendlyName - The chat participant's friendly name
    * @property flexFlowSid - The SID of the Flex Flow
    * @property identity - The identity value that identifies the new resource's chat User
    * @property longLived - Whether to create the channel as long-lived
    * @property preEngagementData - The pre-engagement data
    * @property target - The Target Contact Identity
    * @property taskAttributes - The Task attributes to be added for the TaskRouter Task
    * @property taskSid - The SID of the TaskRouter Task
    */
  trait ChannelListInstanceCreateOptions extends StObject {
    
    var chatFriendlyName: String
    
    var chatUniqueName: js.UndefOr[String] = js.undefined
    
    var chatUserFriendlyName: String
    
    var flexFlowSid: String
    
    var identity: String
    
    var longLived: js.UndefOr[Boolean] = js.undefined
    
    var preEngagementData: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var taskAttributes: js.UndefOr[String] = js.undefined
    
    var taskSid: js.UndefOr[String] = js.undefined
  }
  object ChannelListInstanceCreateOptions {
    
    inline def apply(chatFriendlyName: String, chatUserFriendlyName: String, flexFlowSid: String, identity: String): ChannelListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(chatFriendlyName = chatFriendlyName.asInstanceOf[js.Any], chatUserFriendlyName = chatUserFriendlyName.asInstanceOf[js.Any], flexFlowSid = flexFlowSid.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelListInstanceCreateOptions]
    }
    
    extension [Self <: ChannelListInstanceCreateOptions](x: Self) {
      
      inline def setChatFriendlyName(value: String): Self = StObject.set(x, "chatFriendlyName", value.asInstanceOf[js.Any])
      
      inline def setChatUniqueName(value: String): Self = StObject.set(x, "chatUniqueName", value.asInstanceOf[js.Any])
      
      inline def setChatUniqueNameUndefined: Self = StObject.set(x, "chatUniqueName", js.undefined)
      
      inline def setChatUserFriendlyName(value: String): Self = StObject.set(x, "chatUserFriendlyName", value.asInstanceOf[js.Any])
      
      inline def setFlexFlowSid(value: String): Self = StObject.set(x, "flexFlowSid", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLongLived(value: Boolean): Self = StObject.set(x, "longLived", value.asInstanceOf[js.Any])
      
      inline def setLongLivedUndefined: Self = StObject.set(x, "longLived", js.undefined)
      
      inline def setPreEngagementData(value: String): Self = StObject.set(x, "preEngagementData", value.asInstanceOf[js.Any])
      
      inline def setPreEngagementDataUndefined: Self = StObject.set(x, "preEngagementData", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTaskAttributes(value: String): Self = StObject.set(x, "taskAttributes", value.asInstanceOf[js.Any])
      
      inline def setTaskAttributesUndefined: Self = StObject.set(x, "taskAttributes", js.undefined)
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSidUndefined: Self = StObject.set(x, "taskSid", js.undefined)
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
  trait ChannelListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ChannelListInstanceEachOptions {
    
    inline def apply(): ChannelListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelListInstanceEachOptions]
    }
    
    extension [Self <: ChannelListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ChannelInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ChannelListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ChannelListInstanceOptions {
    
    inline def apply(): ChannelListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelListInstanceOptions]
    }
    
    extension [Self <: ChannelListInstanceOptions](x: Self) {
      
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
  trait ChannelListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ChannelListInstancePageOptions {
    
    inline def apply(): ChannelListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelListInstancePageOptions]
    }
    
    extension [Self <: ChannelListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ChannelPayload
    extends StObject
       with ChannelResource
       with TwilioResponsePayload
  object ChannelPayload {
    
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
      task_sid: String,
      uri: String,
      url: String,
      user_sid: String
    ): ChannelPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flex_flow_sid = flex_flow_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_sid = user_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelPayload]
    }
  }
  
  trait ChannelResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var flex_flow_sid: String
    
    var sid: String
    
    var task_sid: String
    
    var url: String
    
    var user_sid: String
  }
  object ChannelResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      flex_flow_sid: String,
      sid: String,
      task_sid: String,
      url: String,
      user_sid: String
    ): ChannelResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], flex_flow_sid = flex_flow_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_sid = user_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelResource]
    }
    
    extension [Self <: ChannelResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFlex_flow_sid(value: String): Self = StObject.set(x, "flex_flow_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTask_sid(value: String): Self = StObject.set(x, "task_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser_sid(value: String): Self = StObject.set(x, "user_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelSolution extends StObject
}
