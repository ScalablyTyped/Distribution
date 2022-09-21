package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerChannelMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workerChannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workerChannel", "WorkerChannelContext")
  @js.native
  open class WorkerChannelContext protected () extends StObject {
    /**
      * Initialize the WorkerChannelContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the WorkerChannel to fetch
      * @param workerSid - The SID of the Worker with the WorkerChannel to fetch
      * @param sid - The SID of the to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, workerSid: String, sid: String) = this()
    
    /**
      * fetch a WorkerChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkerChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerChannelInstance, Any]): js.Promise[WorkerChannelInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a WorkerChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WorkerChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerChannelInstance, Any]): js.Promise[WorkerChannelInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerChannelInstance, Any]
    ): js.Promise[WorkerChannelInstance] = js.native
    def update(opts: WorkerChannelInstanceUpdateOptions): js.Promise[WorkerChannelInstance] = js.native
    def update(
      opts: WorkerChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerChannelInstance, Any]
    ): js.Promise[WorkerChannelInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workerChannel", "WorkerChannelInstance")
  @js.native
  open class WorkerChannelInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkerChannelContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the WorkerChannel
      * @param workerSid - The SID of the Worker that contains the WorkerChannel
      * @param sid - The SID of the to fetch
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkerChannelPayload,
      workspaceSid: String,
      workerSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: WorkerChannelContext = js.native
    
    var accountSid: String = js.native
    
    var assignedTasks: Double = js.native
    
    var available: Boolean = js.native
    
    var availableCapacityPercentage: Double = js.native
    
    var configuredCapacity: Double = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a WorkerChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkerChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkerChannelInstance] = js.native
    
    var sid: String = js.native
    
    var taskChannelSid: String = js.native
    
    var taskChannelUniqueName: String = js.native
    
    /**
      * update a WorkerChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WorkerChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkerChannelInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkerChannelInstance] = js.native
    def update(opts: WorkerChannelInstanceUpdateOptions): js.Promise[WorkerChannelInstance] = js.native
    def update(
      opts: WorkerChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkerChannelInstance] = js.native
    
    var url: String = js.native
    
    var workerSid: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkerChannelList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the WorkerChannel
    * @param workerSid - The SID of the Worker that contains the WorkerChannel
    */
  inline def WorkerChannelList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, workerSid: String): WorkerChannelListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkerChannelList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any])).asInstanceOf[WorkerChannelListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workerChannel", "WorkerChannelPage")
  @js.native
  open class WorkerChannelPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkerChannelPayload, 
          WorkerChannelResource, 
          WorkerChannelInstance
        ] {
    /**
      * Initialize the WorkerChannelPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkerChannelSolution
    ) = this()
    
    /**
      * Build an instance of WorkerChannelInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkerChannelPayload): WorkerChannelInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property available - Whether the WorkerChannel is available
    * @property capacity - The total number of Tasks that the Worker should handle for the TaskChannel type
    */
  trait WorkerChannelInstanceUpdateOptions extends StObject {
    
    var available: js.UndefOr[Boolean] = js.undefined
    
    var capacity: js.UndefOr[Double] = js.undefined
  }
  object WorkerChannelInstanceUpdateOptions {
    
    inline def apply(): WorkerChannelInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerChannelInstanceUpdateOptions]
    }
    
    extension [Self <: WorkerChannelInstanceUpdateOptions](x: Self) {
      
      inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    }
  }
  
  @js.native
  trait WorkerChannelListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkerChannelContext = js.native
    
    /**
      * Streams WorkerChannelInstance records from the API.
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
          /* item */ WorkerChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ WorkerChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: WorkerChannelListInstanceEachOptions): Unit = js.native
    def each(
      opts: WorkerChannelListInstanceEachOptions,
      callback: js.Function2[
          /* item */ WorkerChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a worker_channel
      *
      * @param sid - The SID of the to fetch
      */
    def get(sid: String): WorkerChannelContext = js.native
    
    /**
      * Retrieve a single target page of WorkerChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[WorkerChannelPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerChannelPage, Any]): js.Promise[WorkerChannelPage] = js.native
    def getPage(targetUrl: String): js.Promise[WorkerChannelPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerChannelPage, Any]
    ): js.Promise[WorkerChannelPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerChannelPage, Any]
    ): js.Promise[WorkerChannelPage] = js.native
    
    /**
      * Lists WorkerChannelInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[WorkerChannelInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkerChannelInstance], Any]
    ): js.Promise[js.Array[WorkerChannelInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkerChannelInstance], Any]
    ): js.Promise[js.Array[WorkerChannelInstance]] = js.native
    def list(opts: WorkerChannelListInstanceOptions): js.Promise[js.Array[WorkerChannelInstance]] = js.native
    def list(
      opts: WorkerChannelListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkerChannelInstance], Any]
    ): js.Promise[js.Array[WorkerChannelInstance]] = js.native
    
    /**
      * Retrieve a single page of WorkerChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[WorkerChannelPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerChannelPage, Any]): js.Promise[WorkerChannelPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerChannelPage, Any]
    ): js.Promise[WorkerChannelPage] = js.native
    def page(opts: WorkerChannelListInstancePageOptions): js.Promise[WorkerChannelPage] = js.native
    def page(
      opts: WorkerChannelListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerChannelPage, Any]
    ): js.Promise[WorkerChannelPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
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
  trait WorkerChannelListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ WorkerChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object WorkerChannelListInstanceEachOptions {
    
    inline def apply(): WorkerChannelListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerChannelListInstanceEachOptions]
    }
    
    extension [Self <: WorkerChannelListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ WorkerChannelInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait WorkerChannelListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object WorkerChannelListInstanceOptions {
    
    inline def apply(): WorkerChannelListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerChannelListInstanceOptions]
    }
    
    extension [Self <: WorkerChannelListInstanceOptions](x: Self) {
      
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
  trait WorkerChannelListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object WorkerChannelListInstancePageOptions {
    
    inline def apply(): WorkerChannelListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerChannelListInstancePageOptions]
    }
    
    extension [Self <: WorkerChannelListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait WorkerChannelPayload
    extends StObject
       with WorkerChannelResource
       with TwilioResponsePayload
  object WorkerChannelPayload {
    
    inline def apply(
      account_sid: String,
      assigned_tasks: Double,
      available: Boolean,
      available_capacity_percentage: Double,
      configured_capacity: Double,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      task_channel_sid: String,
      task_channel_unique_name: String,
      uri: String,
      url: String,
      worker_sid: String,
      workspace_sid: String
    ): WorkerChannelPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assigned_tasks = assigned_tasks.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], available_capacity_percentage = available_capacity_percentage.asInstanceOf[js.Any], configured_capacity = configured_capacity.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_channel_sid = task_channel_sid.asInstanceOf[js.Any], task_channel_unique_name = task_channel_unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], worker_sid = worker_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerChannelPayload]
    }
  }
  
  trait WorkerChannelResource extends StObject {
    
    var account_sid: String
    
    var assigned_tasks: Double
    
    var available: Boolean
    
    var available_capacity_percentage: Double
    
    var configured_capacity: Double
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var sid: String
    
    var task_channel_sid: String
    
    var task_channel_unique_name: String
    
    var url: String
    
    var worker_sid: String
    
    var workspace_sid: String
  }
  object WorkerChannelResource {
    
    inline def apply(
      account_sid: String,
      assigned_tasks: Double,
      available: Boolean,
      available_capacity_percentage: Double,
      configured_capacity: Double,
      date_created: js.Date,
      date_updated: js.Date,
      sid: String,
      task_channel_sid: String,
      task_channel_unique_name: String,
      url: String,
      worker_sid: String,
      workspace_sid: String
    ): WorkerChannelResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assigned_tasks = assigned_tasks.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], available_capacity_percentage = available_capacity_percentage.asInstanceOf[js.Any], configured_capacity = configured_capacity.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_channel_sid = task_channel_sid.asInstanceOf[js.Any], task_channel_unique_name = task_channel_unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], worker_sid = worker_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerChannelResource]
    }
    
    extension [Self <: WorkerChannelResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssigned_tasks(value: Double): Self = StObject.set(x, "assigned_tasks", value.asInstanceOf[js.Any])
      
      inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailable_capacity_percentage(value: Double): Self = StObject.set(x, "available_capacity_percentage", value.asInstanceOf[js.Any])
      
      inline def setConfigured_capacity(value: Double): Self = StObject.set(x, "configured_capacity", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTask_channel_sid(value: String): Self = StObject.set(x, "task_channel_sid", value.asInstanceOf[js.Any])
      
      inline def setTask_channel_unique_name(value: String): Self = StObject.set(x, "task_channel_unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorker_sid(value: String): Self = StObject.set(x, "worker_sid", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerChannelSolution extends StObject {
    
    var workerSid: js.UndefOr[String] = js.undefined
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkerChannelSolution {
    
    inline def apply(): WorkerChannelSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerChannelSolution]
    }
    
    extension [Self <: WorkerChannelSolution](x: Self) {
      
      inline def setWorkerSid(value: String): Self = StObject.set(x, "workerSid", value.asInstanceOf[js.Any])
      
      inline def setWorkerSidUndefined: Self = StObject.set(x, "workerSid", js.undefined)
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
