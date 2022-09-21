package typings.twilio

import typings.twilio.activityMod.ActivityContext
import typings.twilio.activityMod.ActivityListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.taskChannelMod.TaskChannelContext
import typings.twilio.taskChannelMod.TaskChannelListInstance
import typings.twilio.taskQueueMod.TaskQueueContext
import typings.twilio.taskQueueMod.TaskQueueListInstance
import typings.twilio.workerMod.WorkerContext
import typings.twilio.workerMod.WorkerListInstance
import typings.twilio.workflowMod.WorkflowContext
import typings.twilio.workflowMod.WorkflowListInstance
import typings.twilio.workspaceCumulativeStatisticsMod.WorkspaceCumulativeStatisticsContext
import typings.twilio.workspaceCumulativeStatisticsMod.WorkspaceCumulativeStatisticsListInstance
import typings.twilio.workspaceEventMod.EventContext
import typings.twilio.workspaceEventMod.EventListInstance
import typings.twilio.workspaceRealTimeStatisticsMod.WorkspaceRealTimeStatisticsContext
import typings.twilio.workspaceRealTimeStatisticsMod.WorkspaceRealTimeStatisticsListInstance
import typings.twilio.workspaceStatisticsMod.WorkspaceStatisticsContext
import typings.twilio.workspaceStatisticsMod.WorkspaceStatisticsListInstance
import typings.twilio.workspaceTaskMod.TaskContext
import typings.twilio.workspaceTaskMod.TaskListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace", "WorkspaceContext")
  @js.native
  open class WorkspaceContext protected () extends StObject {
    /**
      * Initialize the WorkspaceContext
      *
      * @param version - Version of the resource
      * @param sid - The SID of the resource to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def activities(sid: String): ActivityContext = js.native
    @JSName("activities")
    var activities_Original: ActivityListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def cumulativeStatistics(sid: String): WorkspaceCumulativeStatisticsContext = js.native
    @JSName("cumulativeStatistics")
    var cumulativeStatistics_Original: WorkspaceCumulativeStatisticsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def events(sid: String): EventContext = js.native
    @JSName("events")
    var events_Original: EventListInstance = js.native
    
    /**
      * fetch a WorkspaceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkspaceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceInstance, Any]): js.Promise[WorkspaceInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def realTimeStatistics(sid: String): WorkspaceRealTimeStatisticsContext = js.native
    @JSName("realTimeStatistics")
    var realTimeStatistics_Original: WorkspaceRealTimeStatisticsListInstance = js.native
    
    /**
      * remove a WorkspaceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def statistics(sid: String): WorkspaceStatisticsContext = js.native
    @JSName("statistics")
    var statistics_Original: WorkspaceStatisticsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def taskChannels(sid: String): TaskChannelContext = js.native
    @JSName("taskChannels")
    var taskChannels_Original: TaskChannelListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def taskQueues(sid: String): TaskQueueContext = js.native
    @JSName("taskQueues")
    var taskQueues_Original: TaskQueueListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def tasks(sid: String): TaskContext = js.native
    @JSName("tasks")
    var tasks_Original: TaskListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a WorkspaceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WorkspaceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceInstance, Any]): js.Promise[WorkspaceInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceInstance, Any]
    ): js.Promise[WorkspaceInstance] = js.native
    def update(opts: WorkspaceInstanceUpdateOptions): js.Promise[WorkspaceInstance] = js.native
    def update(
      opts: WorkspaceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceInstance, Any]
    ): js.Promise[WorkspaceInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def workers(sid: String): WorkerContext = js.native
    @JSName("workers")
    var workers_Original: WorkerListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def workflows(sid: String): WorkflowContext = js.native
    @JSName("workflows")
    var workflows_Original: WorkflowListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace", "WorkspaceInstance")
  @js.native
  open class WorkspaceInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkspaceContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID of the resource to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, payload: WorkspacePayload, sid: String) = this()
    
    /* private */ var _proxy: WorkspaceContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the activities
      */
    def activities(): ActivityListInstance = js.native
    
    /**
      * Access the cumulativeStatistics
      */
    def cumulativeStatistics(): WorkspaceCumulativeStatisticsListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var defaultActivityName: String = js.native
    
    var defaultActivitySid: String = js.native
    
    var eventCallbackUrl: String = js.native
    
    /**
      * Access the events
      */
    def events(): EventListInstance = js.native
    
    var eventsFilter: String = js.native
    
    /**
      * fetch a WorkspaceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkspaceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkspaceInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    var multiTaskEnabled: Boolean = js.native
    
    var prioritizeQueueOrder: WorkspaceQueueOrder = js.native
    
    /**
      * Access the realTimeStatistics
      */
    def realTimeStatistics(): WorkspaceRealTimeStatisticsListInstance = js.native
    
    /**
      * remove a WorkspaceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * Access the statistics
      */
    def statistics(): WorkspaceStatisticsListInstance = js.native
    
    /**
      * Access the taskChannels
      */
    def taskChannels(): TaskChannelListInstance = js.native
    
    /**
      * Access the taskQueues
      */
    def taskQueues(): TaskQueueListInstance = js.native
    
    /**
      * Access the tasks
      */
    def tasks(): TaskListInstance = js.native
    
    var timeoutActivityName: String = js.native
    
    var timeoutActivitySid: String = js.native
    
    /**
      * update a WorkspaceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WorkspaceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkspaceInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkspaceInstance] = js.native
    def update(opts: WorkspaceInstanceUpdateOptions): js.Promise[WorkspaceInstance] = js.native
    def update(
      opts: WorkspaceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkspaceInstance] = js.native
    
    var url: String = js.native
    
    /**
      * Access the workers
      */
    def workers(): WorkerListInstance = js.native
    
    /**
      * Access the workflows
      */
    def workflows(): WorkflowListInstance = js.native
  }
  
  /**
    * Initialize the WorkspaceList
    *
    * @param version - Version of the resource
    */
  inline def WorkspaceList(version: typings.twilio.taskrouterV1Mod.^): WorkspaceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("WorkspaceList")(version.asInstanceOf[js.Any]).asInstanceOf[WorkspaceListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace", "WorkspacePage")
  @js.native
  open class WorkspacePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkspacePayload, 
          WorkspaceResource, 
          WorkspaceInstance
        ] {
    /**
      * Initialize the WorkspacePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkspaceSolution
    ) = this()
    
    /**
      * Build an instance of WorkspaceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkspacePayload): WorkspaceInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property defaultActivitySid - The SID of the Activity that will be used when new Workers are created in the Workspace
    * @property eventCallbackUrl - The URL we should call when an event occurs
    * @property eventsFilter - The list of Workspace events for which to call event_callback_url
    * @property friendlyName - A string to describe the Workspace resource
    * @property multiTaskEnabled - Whether multi-tasking is enabled
    * @property prioritizeQueueOrder - The type of TaskQueue to prioritize when Workers are receiving Tasks from both types of TaskQueues
    * @property timeoutActivitySid - The SID of the Activity that will be assigned to a Worker when a Task reservation times out without a response
    */
  trait WorkspaceInstanceUpdateOptions extends StObject {
    
    var defaultActivitySid: js.UndefOr[String] = js.undefined
    
    var eventCallbackUrl: js.UndefOr[String] = js.undefined
    
    var eventsFilter: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var multiTaskEnabled: js.UndefOr[Boolean] = js.undefined
    
    var prioritizeQueueOrder: js.UndefOr[WorkspaceQueueOrder] = js.undefined
    
    var timeoutActivitySid: js.UndefOr[String] = js.undefined
  }
  object WorkspaceInstanceUpdateOptions {
    
    inline def apply(): WorkspaceInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceInstanceUpdateOptions]
    }
    
    extension [Self <: WorkspaceInstanceUpdateOptions](x: Self) {
      
      inline def setDefaultActivitySid(value: String): Self = StObject.set(x, "defaultActivitySid", value.asInstanceOf[js.Any])
      
      inline def setDefaultActivitySidUndefined: Self = StObject.set(x, "defaultActivitySid", js.undefined)
      
      inline def setEventCallbackUrl(value: String): Self = StObject.set(x, "eventCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setEventCallbackUrlUndefined: Self = StObject.set(x, "eventCallbackUrl", js.undefined)
      
      inline def setEventsFilter(value: String): Self = StObject.set(x, "eventsFilter", value.asInstanceOf[js.Any])
      
      inline def setEventsFilterUndefined: Self = StObject.set(x, "eventsFilter", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setMultiTaskEnabled(value: Boolean): Self = StObject.set(x, "multiTaskEnabled", value.asInstanceOf[js.Any])
      
      inline def setMultiTaskEnabledUndefined: Self = StObject.set(x, "multiTaskEnabled", js.undefined)
      
      inline def setPrioritizeQueueOrder(value: WorkspaceQueueOrder): Self = StObject.set(x, "prioritizeQueueOrder", value.asInstanceOf[js.Any])
      
      inline def setPrioritizeQueueOrderUndefined: Self = StObject.set(x, "prioritizeQueueOrder", js.undefined)
      
      inline def setTimeoutActivitySid(value: String): Self = StObject.set(x, "timeoutActivitySid", value.asInstanceOf[js.Any])
      
      inline def setTimeoutActivitySidUndefined: Self = StObject.set(x, "timeoutActivitySid", js.undefined)
    }
  }
  
  @js.native
  trait WorkspaceListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkspaceContext = js.native
    
    /**
      * create a WorkspaceInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: WorkspaceListInstanceCreateOptions): js.Promise[WorkspaceInstance] = js.native
    def create(
      opts: WorkspaceListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ WorkspaceInstance, Any]
    ): js.Promise[WorkspaceInstance] = js.native
    
    /**
      * Streams WorkspaceInstance records from the API.
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
          /* item */ WorkspaceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ WorkspaceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: WorkspaceListInstanceEachOptions): Unit = js.native
    def each(
      opts: WorkspaceListInstanceEachOptions,
      callback: js.Function2[
          /* item */ WorkspaceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a workspace
      *
      * @param sid - The SID of the resource to fetch
      */
    def get(sid: String): WorkspaceContext = js.native
    
    /**
      * Retrieve a single target page of WorkspaceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[WorkspacePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspacePage, Any]): js.Promise[WorkspacePage] = js.native
    def getPage(targetUrl: String): js.Promise[WorkspacePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspacePage, Any]
    ): js.Promise[WorkspacePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspacePage, Any]
    ): js.Promise[WorkspacePage] = js.native
    
    /**
      * Lists WorkspaceInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[WorkspaceInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkspaceInstance], Any]): js.Promise[js.Array[WorkspaceInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkspaceInstance], Any]
    ): js.Promise[js.Array[WorkspaceInstance]] = js.native
    def list(opts: WorkspaceListInstanceOptions): js.Promise[js.Array[WorkspaceInstance]] = js.native
    def list(
      opts: WorkspaceListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkspaceInstance], Any]
    ): js.Promise[js.Array[WorkspaceInstance]] = js.native
    
    /**
      * Retrieve a single page of WorkspaceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[WorkspacePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspacePage, Any]): js.Promise[WorkspacePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspacePage, Any]): js.Promise[WorkspacePage] = js.native
    def page(opts: WorkspaceListInstancePageOptions): js.Promise[WorkspacePage] = js.native
    def page(
      opts: WorkspaceListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspacePage, Any]
    ): js.Promise[WorkspacePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property eventCallbackUrl - The URL we should call when an event occurs
    * @property eventsFilter - The list of Workspace events for which to call event_callback_url
    * @property friendlyName - A string to describe the Workspace resource
    * @property multiTaskEnabled - Whether multi-tasking is enabled
    * @property prioritizeQueueOrder - The type of TaskQueue to prioritize when Workers are receiving Tasks from both types of TaskQueues
    * @property template - An available template name
    */
  trait WorkspaceListInstanceCreateOptions extends StObject {
    
    var eventCallbackUrl: js.UndefOr[String] = js.undefined
    
    var eventsFilter: js.UndefOr[String] = js.undefined
    
    var friendlyName: String
    
    var multiTaskEnabled: js.UndefOr[Boolean] = js.undefined
    
    var prioritizeQueueOrder: js.UndefOr[WorkspaceQueueOrder] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
  }
  object WorkspaceListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): WorkspaceListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceListInstanceCreateOptions]
    }
    
    extension [Self <: WorkspaceListInstanceCreateOptions](x: Self) {
      
      inline def setEventCallbackUrl(value: String): Self = StObject.set(x, "eventCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setEventCallbackUrlUndefined: Self = StObject.set(x, "eventCallbackUrl", js.undefined)
      
      inline def setEventsFilter(value: String): Self = StObject.set(x, "eventsFilter", value.asInstanceOf[js.Any])
      
      inline def setEventsFilterUndefined: Self = StObject.set(x, "eventsFilter", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setMultiTaskEnabled(value: Boolean): Self = StObject.set(x, "multiTaskEnabled", value.asInstanceOf[js.Any])
      
      inline def setMultiTaskEnabledUndefined: Self = StObject.set(x, "multiTaskEnabled", js.undefined)
      
      inline def setPrioritizeQueueOrder(value: WorkspaceQueueOrder): Self = StObject.set(x, "prioritizeQueueOrder", value.asInstanceOf[js.Any])
      
      inline def setPrioritizeQueueOrderUndefined: Self = StObject.set(x, "prioritizeQueueOrder", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The friendly_name of the Workspace resources to read
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
  trait WorkspaceListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ WorkspaceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object WorkspaceListInstanceEachOptions {
    
    inline def apply(): WorkspaceListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceListInstanceEachOptions]
    }
    
    extension [Self <: WorkspaceListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ WorkspaceInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - The friendly_name of the Workspace resources to read
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
  trait WorkspaceListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object WorkspaceListInstanceOptions {
    
    inline def apply(): WorkspaceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceListInstanceOptions]
    }
    
    extension [Self <: WorkspaceListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - The friendly_name of the Workspace resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait WorkspaceListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object WorkspaceListInstancePageOptions {
    
    inline def apply(): WorkspaceListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceListInstancePageOptions]
    }
    
    extension [Self <: WorkspaceListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait WorkspacePayload
    extends StObject
       with WorkspaceResource
       with TwilioResponsePayload
  object WorkspacePayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      default_activity_name: String,
      default_activity_sid: String,
      event_callback_url: String,
      events_filter: String,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      multi_task_enabled: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      prioritize_queue_order: WorkspaceQueueOrder,
      sid: String,
      timeout_activity_name: String,
      timeout_activity_sid: String,
      uri: String,
      url: String
    ): WorkspacePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_activity_name = default_activity_name.asInstanceOf[js.Any], default_activity_sid = default_activity_sid.asInstanceOf[js.Any], event_callback_url = event_callback_url.asInstanceOf[js.Any], events_filter = events_filter.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], multi_task_enabled = multi_task_enabled.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], prioritize_queue_order = prioritize_queue_order.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], timeout_activity_name = timeout_activity_name.asInstanceOf[js.Any], timeout_activity_sid = timeout_activity_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspacePayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.FIFO
    - typings.twilio.twilioStrings.LIFO
  */
  trait WorkspaceQueueOrder extends StObject
  object WorkspaceQueueOrder {
    
    inline def FIFO: typings.twilio.twilioStrings.FIFO = "FIFO".asInstanceOf[typings.twilio.twilioStrings.FIFO]
    
    inline def LIFO: typings.twilio.twilioStrings.LIFO = "LIFO".asInstanceOf[typings.twilio.twilioStrings.LIFO]
  }
  
  trait WorkspaceResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var default_activity_name: String
    
    var default_activity_sid: String
    
    var event_callback_url: String
    
    var events_filter: String
    
    var friendly_name: String
    
    var links: String
    
    var multi_task_enabled: Boolean
    
    var prioritize_queue_order: WorkspaceQueueOrder
    
    var sid: String
    
    var timeout_activity_name: String
    
    var timeout_activity_sid: String
    
    var url: String
  }
  object WorkspaceResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      default_activity_name: String,
      default_activity_sid: String,
      event_callback_url: String,
      events_filter: String,
      friendly_name: String,
      links: String,
      multi_task_enabled: Boolean,
      prioritize_queue_order: WorkspaceQueueOrder,
      sid: String,
      timeout_activity_name: String,
      timeout_activity_sid: String,
      url: String
    ): WorkspaceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_activity_name = default_activity_name.asInstanceOf[js.Any], default_activity_sid = default_activity_sid.asInstanceOf[js.Any], event_callback_url = event_callback_url.asInstanceOf[js.Any], events_filter = events_filter.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], multi_task_enabled = multi_task_enabled.asInstanceOf[js.Any], prioritize_queue_order = prioritize_queue_order.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], timeout_activity_name = timeout_activity_name.asInstanceOf[js.Any], timeout_activity_sid = timeout_activity_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceResource]
    }
    
    extension [Self <: WorkspaceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDefault_activity_name(value: String): Self = StObject.set(x, "default_activity_name", value.asInstanceOf[js.Any])
      
      inline def setDefault_activity_sid(value: String): Self = StObject.set(x, "default_activity_sid", value.asInstanceOf[js.Any])
      
      inline def setEvent_callback_url(value: String): Self = StObject.set(x, "event_callback_url", value.asInstanceOf[js.Any])
      
      inline def setEvents_filter(value: String): Self = StObject.set(x, "events_filter", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMulti_task_enabled(value: Boolean): Self = StObject.set(x, "multi_task_enabled", value.asInstanceOf[js.Any])
      
      inline def setPrioritize_queue_order(value: WorkspaceQueueOrder): Self = StObject.set(x, "prioritize_queue_order", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTimeout_activity_name(value: String): Self = StObject.set(x, "timeout_activity_name", value.asInstanceOf[js.Any])
      
      inline def setTimeout_activity_sid(value: String): Self = StObject.set(x, "timeout_activity_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkspaceSolution extends StObject
}
