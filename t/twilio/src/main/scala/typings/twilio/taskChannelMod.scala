package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskChannelMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskChannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskChannel", "TaskChannelContext")
  @js.native
  open class TaskChannelContext protected () extends StObject {
    /**
      * Initialize the TaskChannelContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the Task Channel to fetch
      * @param sid - The SID of the Task Channel resource to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, sid: String) = this()
    
    /**
      * fetch a TaskChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelInstance, Any]): js.Promise[TaskChannelInstance] = js.native
    
    /**
      * remove a TaskChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a TaskChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TaskChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelInstance, Any]): js.Promise[TaskChannelInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelInstance, Any]
    ): js.Promise[TaskChannelInstance] = js.native
    def update(opts: TaskChannelInstanceUpdateOptions): js.Promise[TaskChannelInstance] = js.native
    def update(
      opts: TaskChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelInstance, Any]
    ): js.Promise[TaskChannelInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskChannel", "TaskChannelInstance")
  @js.native
  open class TaskChannelInstance protected () extends SerializableClass {
    /**
      * Initialize the TaskChannelContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the Task Channel
      * @param sid - The SID of the Task Channel resource to fetch
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: TaskChannelPayload,
      workspaceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: TaskChannelContext = js.native
    
    var accountSid: String = js.native
    
    var channelOptimizedRouting: Boolean = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a TaskChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskChannelInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * remove a TaskChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a TaskChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TaskChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskChannelInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskChannelInstance] = js.native
    def update(opts: TaskChannelInstanceUpdateOptions): js.Promise[TaskChannelInstance] = js.native
    def update(
      opts: TaskChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TaskChannelInstance] = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the TaskChannelList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the Task Channel
    */
  inline def TaskChannelList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): TaskChannelListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TaskChannelList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[TaskChannelListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskChannel", "TaskChannelPage")
  @js.native
  open class TaskChannelPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          TaskChannelPayload, 
          TaskChannelResource, 
          TaskChannelInstance
        ] {
    /**
      * Initialize the TaskChannelPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TaskChannelSolution
    ) = this()
    
    /**
      * Build an instance of TaskChannelInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskChannelPayload): TaskChannelInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property channelOptimizedRouting - Whether the TaskChannel should prioritize Workers that have been idle
    * @property friendlyName - A string to describe the Task Channel resource
    */
  trait TaskChannelInstanceUpdateOptions extends StObject {
    
    var channelOptimizedRouting: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object TaskChannelInstanceUpdateOptions {
    
    inline def apply(): TaskChannelInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskChannelInstanceUpdateOptions]
    }
    
    extension [Self <: TaskChannelInstanceUpdateOptions](x: Self) {
      
      inline def setChannelOptimizedRouting(value: Boolean): Self = StObject.set(x, "channelOptimizedRouting", value.asInstanceOf[js.Any])
      
      inline def setChannelOptimizedRoutingUndefined: Self = StObject.set(x, "channelOptimizedRouting", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait TaskChannelListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TaskChannelContext = js.native
    
    /**
      * create a TaskChannelInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: TaskChannelListInstanceCreateOptions): js.Promise[TaskChannelInstance] = js.native
    def create(
      opts: TaskChannelListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TaskChannelInstance, Any]
    ): js.Promise[TaskChannelInstance] = js.native
    
    /**
      * Streams TaskChannelInstance records from the API.
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
          /* item */ TaskChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TaskChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TaskChannelListInstanceEachOptions): Unit = js.native
    def each(
      opts: TaskChannelListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TaskChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a task_channel
      *
      * @param sid - The SID of the Task Channel resource to fetch
      */
    def get(sid: String): TaskChannelContext = js.native
    
    /**
      * Retrieve a single target page of TaskChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TaskChannelPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelPage, Any]): js.Promise[TaskChannelPage] = js.native
    def getPage(targetUrl: String): js.Promise[TaskChannelPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelPage, Any]
    ): js.Promise[TaskChannelPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelPage, Any]
    ): js.Promise[TaskChannelPage] = js.native
    
    /**
      * Lists TaskChannelInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TaskChannelInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskChannelInstance], Any]
    ): js.Promise[js.Array[TaskChannelInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskChannelInstance], Any]
    ): js.Promise[js.Array[TaskChannelInstance]] = js.native
    def list(opts: TaskChannelListInstanceOptions): js.Promise[js.Array[TaskChannelInstance]] = js.native
    def list(
      opts: TaskChannelListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskChannelInstance], Any]
    ): js.Promise[js.Array[TaskChannelInstance]] = js.native
    
    /**
      * Retrieve a single page of TaskChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TaskChannelPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelPage, Any]): js.Promise[TaskChannelPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelPage, Any]): js.Promise[TaskChannelPage] = js.native
    def page(opts: TaskChannelListInstancePageOptions): js.Promise[TaskChannelPage] = js.native
    def page(
      opts: TaskChannelListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskChannelPage, Any]
    ): js.Promise[TaskChannelPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property channelOptimizedRouting - Whether the Task Channel should prioritize Workers that have been idle
    * @property friendlyName - A string to describe the Task Channel resource
    * @property uniqueName - An application-defined string that uniquely identifies the Task Channel
    */
  trait TaskChannelListInstanceCreateOptions extends StObject {
    
    var channelOptimizedRouting: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: String
    
    var uniqueName: String
  }
  object TaskChannelListInstanceCreateOptions {
    
    inline def apply(friendlyName: String, uniqueName: String): TaskChannelListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskChannelListInstanceCreateOptions]
    }
    
    extension [Self <: TaskChannelListInstanceCreateOptions](x: Self) {
      
      inline def setChannelOptimizedRouting(value: Boolean): Self = StObject.set(x, "channelOptimizedRouting", value.asInstanceOf[js.Any])
      
      inline def setChannelOptimizedRoutingUndefined: Self = StObject.set(x, "channelOptimizedRouting", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
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
  trait TaskChannelListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TaskChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TaskChannelListInstanceEachOptions {
    
    inline def apply(): TaskChannelListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskChannelListInstanceEachOptions]
    }
    
    extension [Self <: TaskChannelListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TaskChannelInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait TaskChannelListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TaskChannelListInstanceOptions {
    
    inline def apply(): TaskChannelListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskChannelListInstanceOptions]
    }
    
    extension [Self <: TaskChannelListInstanceOptions](x: Self) {
      
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
  trait TaskChannelListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object TaskChannelListInstancePageOptions {
    
    inline def apply(): TaskChannelListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskChannelListInstancePageOptions]
    }
    
    extension [Self <: TaskChannelListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait TaskChannelPayload
    extends StObject
       with TaskChannelResource
       with TwilioResponsePayload
  object TaskChannelPayload {
    
    inline def apply(
      account_sid: String,
      channel_optimized_routing: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String,
      workspace_sid: String
    ): TaskChannelPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_optimized_routing = channel_optimized_routing.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskChannelPayload]
    }
  }
  
  trait TaskChannelResource extends StObject {
    
    var account_sid: String
    
    var channel_optimized_routing: Boolean
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
    
    var workspace_sid: String
  }
  object TaskChannelResource {
    
    inline def apply(
      account_sid: String,
      channel_optimized_routing: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      sid: String,
      unique_name: String,
      url: String,
      workspace_sid: String
    ): TaskChannelResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_optimized_routing = channel_optimized_routing.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskChannelResource]
    }
    
    extension [Self <: TaskChannelResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel_optimized_routing(value: Boolean): Self = StObject.set(x, "channel_optimized_routing", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskChannelSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object TaskChannelSolution {
    
    inline def apply(): TaskChannelSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskChannelSolution]
    }
    
    extension [Self <: TaskChannelSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
