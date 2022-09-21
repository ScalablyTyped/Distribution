package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.taskQueueCumulativeStatisticsMod.TaskQueueCumulativeStatisticsContext
import typings.twilio.taskQueueCumulativeStatisticsMod.TaskQueueCumulativeStatisticsListInstance
import typings.twilio.taskQueueRealTimeStatisticsMod.TaskQueueRealTimeStatisticsContext
import typings.twilio.taskQueueRealTimeStatisticsMod.TaskQueueRealTimeStatisticsListInstance
import typings.twilio.taskQueueStatisticsMod.TaskQueueStatisticsContext
import typings.twilio.taskQueueStatisticsMod.TaskQueueStatisticsListInstance
import typings.twilio.taskQueuesStatisticsMod.TaskQueuesStatisticsListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskQueueMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue", "TaskQueueContext")
  @js.native
  open class TaskQueueContext protected () extends StObject {
    /**
      * Initialize the TaskQueueContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the TaskQueue to fetch
      * @param sid - The SID of the resource to
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def cumulativeStatistics(sid: String): TaskQueueCumulativeStatisticsContext = js.native
    @JSName("cumulativeStatistics")
    var cumulativeStatistics_Original: TaskQueueCumulativeStatisticsListInstance = js.native
    
    /**
      * fetch a TaskQueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskQueueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueInstance, Any]): js.Promise[TaskQueueInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def realTimeStatistics(sid: String): TaskQueueRealTimeStatisticsContext = js.native
    @JSName("realTimeStatistics")
    var realTimeStatistics_Original: TaskQueueRealTimeStatisticsListInstance = js.native
    
    /**
      * remove a TaskQueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def statistics(sid: String): TaskQueueStatisticsContext = js.native
    @JSName("statistics")
    var statistics_Original: TaskQueueStatisticsListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a TaskQueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TaskQueueInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueInstance, Any]): js.Promise[TaskQueueInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueInstance, Any]
    ): js.Promise[TaskQueueInstance] = js.native
    def update(opts: TaskQueueInstanceUpdateOptions): js.Promise[TaskQueueInstance] = js.native
    def update(
      opts: TaskQueueInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueInstance, Any]
    ): js.Promise[TaskQueueInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue", "TaskQueueInstance")
  @js.native
  open class TaskQueueInstance protected () extends SerializableClass {
    /**
      * Initialize the TaskQueueContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the TaskQueue
      * @param sid - The SID of the resource to
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: TaskQueuePayload,
      workspaceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: TaskQueueContext = js.native
    
    var accountSid: String = js.native
    
    var assignmentActivityName: String = js.native
    
    var assignmentActivitySid: String = js.native
    
    /**
      * Access the cumulativeStatistics
      */
    def cumulativeStatistics(): TaskQueueCumulativeStatisticsListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a TaskQueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskQueueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskQueueInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    var maxReservedWorkers: Double = js.native
    
    /**
      * Access the realTimeStatistics
      */
    def realTimeStatistics(): TaskQueueRealTimeStatisticsListInstance = js.native
    
    /**
      * remove a TaskQueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var reservationActivityName: String = js.native
    
    var reservationActivitySid: String = js.native
    
    var sid: String = js.native
    
    /**
      * Access the statistics
      */
    def statistics(): TaskQueueStatisticsListInstance = js.native
    
    var targetWorkers: String = js.native
    
    var taskOrder: TaskQueueTaskOrder = js.native
    
    /**
      * update a TaskQueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TaskQueueInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskQueueInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskQueueInstance] = js.native
    def update(opts: TaskQueueInstanceUpdateOptions): js.Promise[TaskQueueInstance] = js.native
    def update(
      opts: TaskQueueInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TaskQueueInstance] = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the TaskQueueList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the TaskQueue
    */
  inline def TaskQueueList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): TaskQueueListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TaskQueueList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[TaskQueueListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue", "TaskQueuePage")
  @js.native
  open class TaskQueuePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          TaskQueuePayload, 
          TaskQueueResource, 
          TaskQueueInstance
        ] {
    /**
      * Initialize the TaskQueuePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TaskQueueSolution
    ) = this()
    
    /**
      * Build an instance of TaskQueueInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskQueuePayload): TaskQueueInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property assignmentActivitySid - The SID of the Activity to assign Workers when a task is assigned for them
    * @property friendlyName - A string to describe the resource
    * @property maxReservedWorkers - The maximum number of Workers to create reservations for the assignment of a task while in the queue
    * @property reservationActivitySid - The SID of the Activity to assign Workers when a task is reserved for them
    * @property targetWorkers - A string describing the Worker selection criteria for any Tasks that enter the TaskQueue
    * @property taskOrder - How Tasks will be assigned to Workers
    */
  trait TaskQueueInstanceUpdateOptions extends StObject {
    
    var assignmentActivitySid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var maxReservedWorkers: js.UndefOr[Double] = js.undefined
    
    var reservationActivitySid: js.UndefOr[String] = js.undefined
    
    var targetWorkers: js.UndefOr[String] = js.undefined
    
    var taskOrder: js.UndefOr[TaskQueueTaskOrder] = js.undefined
  }
  object TaskQueueInstanceUpdateOptions {
    
    inline def apply(): TaskQueueInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueInstanceUpdateOptions]
    }
    
    extension [Self <: TaskQueueInstanceUpdateOptions](x: Self) {
      
      inline def setAssignmentActivitySid(value: String): Self = StObject.set(x, "assignmentActivitySid", value.asInstanceOf[js.Any])
      
      inline def setAssignmentActivitySidUndefined: Self = StObject.set(x, "assignmentActivitySid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setMaxReservedWorkers(value: Double): Self = StObject.set(x, "maxReservedWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxReservedWorkersUndefined: Self = StObject.set(x, "maxReservedWorkers", js.undefined)
      
      inline def setReservationActivitySid(value: String): Self = StObject.set(x, "reservationActivitySid", value.asInstanceOf[js.Any])
      
      inline def setReservationActivitySidUndefined: Self = StObject.set(x, "reservationActivitySid", js.undefined)
      
      inline def setTargetWorkers(value: String): Self = StObject.set(x, "targetWorkers", value.asInstanceOf[js.Any])
      
      inline def setTargetWorkersUndefined: Self = StObject.set(x, "targetWorkers", js.undefined)
      
      inline def setTaskOrder(value: TaskQueueTaskOrder): Self = StObject.set(x, "taskOrder", value.asInstanceOf[js.Any])
      
      inline def setTaskOrderUndefined: Self = StObject.set(x, "taskOrder", js.undefined)
    }
  }
  
  @js.native
  trait TaskQueueListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TaskQueueContext = js.native
    
    /**
      * create a TaskQueueInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: TaskQueueListInstanceCreateOptions): js.Promise[TaskQueueInstance] = js.native
    def create(
      opts: TaskQueueListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TaskQueueInstance, Any]
    ): js.Promise[TaskQueueInstance] = js.native
    
    /**
      * Streams TaskQueueInstance records from the API.
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
          /* item */ TaskQueueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TaskQueueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TaskQueueListInstanceEachOptions): Unit = js.native
    def each(
      opts: TaskQueueListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TaskQueueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a task_queue
      *
      * @param sid - The SID of the resource to
      */
    def get(sid: String): TaskQueueContext = js.native
    
    /**
      * Retrieve a single target page of TaskQueueInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TaskQueuePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuePage, Any]): js.Promise[TaskQueuePage] = js.native
    def getPage(targetUrl: String): js.Promise[TaskQueuePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuePage, Any]
    ): js.Promise[TaskQueuePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuePage, Any]
    ): js.Promise[TaskQueuePage] = js.native
    
    /**
      * Lists TaskQueueInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TaskQueueInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskQueueInstance], Any]): js.Promise[js.Array[TaskQueueInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskQueueInstance], Any]
    ): js.Promise[js.Array[TaskQueueInstance]] = js.native
    def list(opts: TaskQueueListInstanceOptions): js.Promise[js.Array[TaskQueueInstance]] = js.native
    def list(
      opts: TaskQueueListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskQueueInstance], Any]
    ): js.Promise[js.Array[TaskQueueInstance]] = js.native
    
    /**
      * Retrieve a single page of TaskQueueInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TaskQueuePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuePage, Any]): js.Promise[TaskQueuePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuePage, Any]): js.Promise[TaskQueuePage] = js.native
    def page(opts: TaskQueueListInstancePageOptions): js.Promise[TaskQueuePage] = js.native
    def page(
      opts: TaskQueueListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuePage, Any]
    ): js.Promise[TaskQueuePage] = js.native
    
    var statistics: js.UndefOr[TaskQueuesStatisticsListInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property assignmentActivitySid - The SID of the Activity to assign Workers once a task is assigned to them
    * @property friendlyName - A string to describe the resource
    * @property maxReservedWorkers - The maximum number of Workers to reserve
    * @property reservationActivitySid - The SID of the Activity to assign Workers when a task is reserved for them
    * @property targetWorkers - A string describing the Worker selection criteria for any Tasks that enter the TaskQueue
    * @property taskOrder - How Tasks will be assigned to Workers
    */
  trait TaskQueueListInstanceCreateOptions extends StObject {
    
    var assignmentActivitySid: js.UndefOr[String] = js.undefined
    
    var friendlyName: String
    
    var maxReservedWorkers: js.UndefOr[Double] = js.undefined
    
    var reservationActivitySid: js.UndefOr[String] = js.undefined
    
    var targetWorkers: js.UndefOr[String] = js.undefined
    
    var taskOrder: js.UndefOr[TaskQueueTaskOrder] = js.undefined
  }
  object TaskQueueListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): TaskQueueListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueueListInstanceCreateOptions]
    }
    
    extension [Self <: TaskQueueListInstanceCreateOptions](x: Self) {
      
      inline def setAssignmentActivitySid(value: String): Self = StObject.set(x, "assignmentActivitySid", value.asInstanceOf[js.Any])
      
      inline def setAssignmentActivitySidUndefined: Self = StObject.set(x, "assignmentActivitySid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setMaxReservedWorkers(value: Double): Self = StObject.set(x, "maxReservedWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxReservedWorkersUndefined: Self = StObject.set(x, "maxReservedWorkers", js.undefined)
      
      inline def setReservationActivitySid(value: String): Self = StObject.set(x, "reservationActivitySid", value.asInstanceOf[js.Any])
      
      inline def setReservationActivitySidUndefined: Self = StObject.set(x, "reservationActivitySid", js.undefined)
      
      inline def setTargetWorkers(value: String): Self = StObject.set(x, "targetWorkers", value.asInstanceOf[js.Any])
      
      inline def setTargetWorkersUndefined: Self = StObject.set(x, "targetWorkers", js.undefined)
      
      inline def setTaskOrder(value: TaskQueueTaskOrder): Self = StObject.set(x, "taskOrder", value.asInstanceOf[js.Any])
      
      inline def setTaskOrderUndefined: Self = StObject.set(x, "taskOrder", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property evaluateWorkerAttributes - The attributes of the Workers to read
    * @property friendlyName - The friendly_name of the TaskQueue resources to read
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
    * @property workerSid - The SID of the Worker with the TaskQueue resources to read
    */
  trait TaskQueueListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TaskQueueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var evaluateWorkerAttributes: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var workerSid: js.UndefOr[String] = js.undefined
  }
  object TaskQueueListInstanceEachOptions {
    
    inline def apply(): TaskQueueListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueListInstanceEachOptions]
    }
    
    extension [Self <: TaskQueueListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TaskQueueInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEvaluateWorkerAttributes(value: String): Self = StObject.set(x, "evaluateWorkerAttributes", value.asInstanceOf[js.Any])
      
      inline def setEvaluateWorkerAttributesUndefined: Self = StObject.set(x, "evaluateWorkerAttributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setWorkerSid(value: String): Self = StObject.set(x, "workerSid", value.asInstanceOf[js.Any])
      
      inline def setWorkerSidUndefined: Self = StObject.set(x, "workerSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property evaluateWorkerAttributes - The attributes of the Workers to read
    * @property friendlyName - The friendly_name of the TaskQueue resources to read
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
    * @property workerSid - The SID of the Worker with the TaskQueue resources to read
    */
  trait TaskQueueListInstanceOptions extends StObject {
    
    var evaluateWorkerAttributes: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var workerSid: js.UndefOr[String] = js.undefined
  }
  object TaskQueueListInstanceOptions {
    
    inline def apply(): TaskQueueListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueListInstanceOptions]
    }
    
    extension [Self <: TaskQueueListInstanceOptions](x: Self) {
      
      inline def setEvaluateWorkerAttributes(value: String): Self = StObject.set(x, "evaluateWorkerAttributes", value.asInstanceOf[js.Any])
      
      inline def setEvaluateWorkerAttributesUndefined: Self = StObject.set(x, "evaluateWorkerAttributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setWorkerSid(value: String): Self = StObject.set(x, "workerSid", value.asInstanceOf[js.Any])
      
      inline def setWorkerSidUndefined: Self = StObject.set(x, "workerSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property evaluateWorkerAttributes - The attributes of the Workers to read
    * @property friendlyName - The friendly_name of the TaskQueue resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property workerSid - The SID of the Worker with the TaskQueue resources to read
    */
  trait TaskQueueListInstancePageOptions extends StObject {
    
    var evaluateWorkerAttributes: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var workerSid: js.UndefOr[String] = js.undefined
  }
  object TaskQueueListInstancePageOptions {
    
    inline def apply(): TaskQueueListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueListInstancePageOptions]
    }
    
    extension [Self <: TaskQueueListInstancePageOptions](x: Self) {
      
      inline def setEvaluateWorkerAttributes(value: String): Self = StObject.set(x, "evaluateWorkerAttributes", value.asInstanceOf[js.Any])
      
      inline def setEvaluateWorkerAttributesUndefined: Self = StObject.set(x, "evaluateWorkerAttributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setWorkerSid(value: String): Self = StObject.set(x, "workerSid", value.asInstanceOf[js.Any])
      
      inline def setWorkerSidUndefined: Self = StObject.set(x, "workerSid", js.undefined)
    }
  }
  
  trait TaskQueuePayload
    extends StObject
       with TaskQueueResource
       with TwilioResponsePayload
  object TaskQueuePayload {
    
    inline def apply(
      account_sid: String,
      assignment_activity_name: String,
      assignment_activity_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      max_reserved_workers: Double,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      reservation_activity_name: String,
      reservation_activity_sid: String,
      sid: String,
      target_workers: String,
      task_order: TaskQueueTaskOrder,
      uri: String,
      url: String,
      workspace_sid: String
    ): TaskQueuePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assignment_activity_name = assignment_activity_name.asInstanceOf[js.Any], assignment_activity_sid = assignment_activity_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], max_reserved_workers = max_reserved_workers.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reservation_activity_name = reservation_activity_name.asInstanceOf[js.Any], reservation_activity_sid = reservation_activity_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], target_workers = target_workers.asInstanceOf[js.Any], task_order = task_order.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueuePayload]
    }
  }
  
  trait TaskQueueResource extends StObject {
    
    var account_sid: String
    
    var assignment_activity_name: String
    
    var assignment_activity_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var max_reserved_workers: Double
    
    var reservation_activity_name: String
    
    var reservation_activity_sid: String
    
    var sid: String
    
    var target_workers: String
    
    var task_order: TaskQueueTaskOrder
    
    var url: String
    
    var workspace_sid: String
  }
  object TaskQueueResource {
    
    inline def apply(
      account_sid: String,
      assignment_activity_name: String,
      assignment_activity_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      max_reserved_workers: Double,
      reservation_activity_name: String,
      reservation_activity_sid: String,
      sid: String,
      target_workers: String,
      task_order: TaskQueueTaskOrder,
      url: String,
      workspace_sid: String
    ): TaskQueueResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assignment_activity_name = assignment_activity_name.asInstanceOf[js.Any], assignment_activity_sid = assignment_activity_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], max_reserved_workers = max_reserved_workers.asInstanceOf[js.Any], reservation_activity_name = reservation_activity_name.asInstanceOf[js.Any], reservation_activity_sid = reservation_activity_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], target_workers = target_workers.asInstanceOf[js.Any], task_order = task_order.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueueResource]
    }
    
    extension [Self <: TaskQueueResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssignment_activity_name(value: String): Self = StObject.set(x, "assignment_activity_name", value.asInstanceOf[js.Any])
      
      inline def setAssignment_activity_sid(value: String): Self = StObject.set(x, "assignment_activity_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMax_reserved_workers(value: Double): Self = StObject.set(x, "max_reserved_workers", value.asInstanceOf[js.Any])
      
      inline def setReservation_activity_name(value: String): Self = StObject.set(x, "reservation_activity_name", value.asInstanceOf[js.Any])
      
      inline def setReservation_activity_sid(value: String): Self = StObject.set(x, "reservation_activity_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTarget_workers(value: String): Self = StObject.set(x, "target_workers", value.asInstanceOf[js.Any])
      
      inline def setTask_order(value: TaskQueueTaskOrder): Self = StObject.set(x, "task_order", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskQueueSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object TaskQueueSolution {
    
    inline def apply(): TaskQueueSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueSolution]
    }
    
    extension [Self <: TaskQueueSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.FIFO
    - typings.twilio.twilioStrings.LIFO
  */
  trait TaskQueueTaskOrder extends StObject
  object TaskQueueTaskOrder {
    
    inline def FIFO: typings.twilio.twilioStrings.FIFO = "FIFO".asInstanceOf[typings.twilio.twilioStrings.FIFO]
    
    inline def LIFO: typings.twilio.twilioStrings.LIFO = "LIFO".asInstanceOf[typings.twilio.twilioStrings.LIFO]
  }
}
