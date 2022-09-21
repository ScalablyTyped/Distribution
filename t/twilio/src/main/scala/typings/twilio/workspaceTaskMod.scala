package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.reservationMod.ReservationContext
import typings.twilio.reservationMod.ReservationListInstance
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.pending_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceTaskMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/task", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/task", "TaskContext")
  @js.native
  open class TaskContext protected () extends StObject {
    /**
      * Initialize the TaskContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the Task to fetch
      * @param sid - The SID of the resource to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, sid: String) = this()
    
    /**
      * fetch a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]): js.Promise[TaskInstance] = js.native
    
    /**
      * remove a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]): js.Promise[Boolean] = js.native
    def remove(opts: TaskInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: TaskInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def reservations(sid: String): ReservationContext = js.native
    @JSName("reservations")
    var reservations_Original: ReservationListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TaskInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]): js.Promise[TaskInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]): js.Promise[TaskInstance] = js.native
    def update(opts: TaskInstanceUpdateOptions): js.Promise[TaskInstance] = js.native
    def update(
      opts: TaskInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]
    ): js.Promise[TaskInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/task", "TaskInstance")
  @js.native
  open class TaskInstance protected () extends SerializableClass {
    /**
      * Initialize the TaskContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the Task
      * @param sid - The SID of the resource to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, payload: TaskPayload, workspaceSid: String, sid: String) = this()
    
    /* private */ var _proxy: TaskContext = js.native
    
    var accountSid: String = js.native
    
    var addons: String = js.native
    
    var age: Double = js.native
    
    var assignmentStatus: TaskStatus = js.native
    
    var attributes: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskInstance] = js.native
    
    var links: String = js.native
    
    var priority: Double = js.native
    
    var reason: String = js.native
    
    /**
      * remove a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: TaskInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: TaskInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Access the reservations
      */
    def reservations(): ReservationListInstance = js.native
    
    var sid: String = js.native
    
    var taskChannelSid: String = js.native
    
    var taskChannelUniqueName: String = js.native
    
    var taskQueueEnteredDate: js.Date = js.native
    
    var taskQueueFriendlyName: String = js.native
    
    var taskQueueSid: String = js.native
    
    var timeout: Double = js.native
    
    /**
      * update a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TaskInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskInstance] = js.native
    def update(opts: TaskInstanceUpdateOptions): js.Promise[TaskInstance] = js.native
    def update(
      opts: TaskInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TaskInstance] = js.native
    
    var url: String = js.native
    
    var workflowFriendlyName: String = js.native
    
    var workflowSid: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the TaskList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the Task
    */
  inline def TaskList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): TaskListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TaskList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[TaskListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/task", "TaskPage")
  @js.native
  open class TaskPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.taskrouterV1Mod.^, TaskPayload, TaskResource, TaskInstance] {
    /**
      * Initialize the TaskPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TaskSolution
    ) = this()
    
    /**
      * Build an instance of TaskInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskPayload): TaskInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to remove
    *
    * @property ifMatch - The If-Match HTTP request header
    */
  trait TaskInstanceRemoveOptions extends StObject {
    
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object TaskInstanceRemoveOptions {
    
    inline def apply(): TaskInstanceRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskInstanceRemoveOptions]
    }
    
    extension [Self <: TaskInstanceRemoveOptions](x: Self) {
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  /**
    * Options to pass to update
    *
    * @property assignmentStatus - The new status of the task
    * @property attributes - The JSON string that describes the custom attributes of the task
    * @property ifMatch - The If-Match HTTP request header
    * @property priority - The Task's new priority value
    * @property reason - The reason that the Task was canceled or complete
    * @property taskChannel - When MultiTasking is enabled, specify the TaskChannel with the task to update
    */
  trait TaskInstanceUpdateOptions extends StObject {
    
    var assignmentStatus: js.UndefOr[TaskStatus] = js.undefined
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var ifMatch: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object TaskInstanceUpdateOptions {
    
    inline def apply(): TaskInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskInstanceUpdateOptions]
    }
    
    extension [Self <: TaskInstanceUpdateOptions](x: Self) {
      
      inline def setAssignmentStatus(value: TaskStatus): Self = StObject.set(x, "assignmentStatus", value.asInstanceOf[js.Any])
      
      inline def setAssignmentStatusUndefined: Self = StObject.set(x, "assignmentStatus", js.undefined)
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
    }
  }
  
  @js.native
  trait TaskListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TaskContext = js.native
    
    /**
      * create a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[TaskInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ TaskInstance, Any]): js.Promise[TaskInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ TaskInstance, Any]): js.Promise[TaskInstance] = js.native
    def create(opts: TaskListInstanceCreateOptions): js.Promise[TaskInstance] = js.native
    def create(
      opts: TaskListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TaskInstance, Any]
    ): js.Promise[TaskInstance] = js.native
    
    /**
      * Streams TaskInstance records from the API.
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
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TaskListInstanceEachOptions): Unit = js.native
    def each(
      opts: TaskListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a task
      *
      * @param sid - The SID of the resource to fetch
      */
    def get(sid: String): TaskContext = js.native
    
    /**
      * Retrieve a single target page of TaskInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TaskPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    def getPage(targetUrl: String): js.Promise[TaskPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    
    /**
      * Lists TaskInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TaskInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskInstance], Any]): js.Promise[js.Array[TaskInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskInstance], Any]
    ): js.Promise[js.Array[TaskInstance]] = js.native
    def list(opts: TaskListInstanceOptions): js.Promise[js.Array[TaskInstance]] = js.native
    def list(
      opts: TaskListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskInstance], Any]
    ): js.Promise[js.Array[TaskInstance]] = js.native
    
    /**
      * Retrieve a single page of TaskInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TaskPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    def page(opts: TaskListInstancePageOptions): js.Promise[TaskPage] = js.native
    def page(
      opts: TaskListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]
    ): js.Promise[TaskPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property attributes - A URL-encoded JSON string describing the attributes of the task
    * @property priority - The priority to assign the new task and override the default
    * @property taskChannel - When MultiTasking is enabled specify the TaskChannel by passing either its unique_name or SID
    * @property timeout - The amount of time in seconds the task can live before being assigned
    * @property workflowSid - The SID of the Workflow that you would like to handle routing for the new Task
    */
  trait TaskListInstanceCreateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var workflowSid: js.UndefOr[String] = js.undefined
  }
  object TaskListInstanceCreateOptions {
    
    inline def apply(): TaskListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskListInstanceCreateOptions]
    }
    
    extension [Self <: TaskListInstanceCreateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWorkflowSid(value: String): Self = StObject.set(x, "workflowSid", value.asInstanceOf[js.Any])
      
      inline def setWorkflowSidUndefined: Self = StObject.set(x, "workflowSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property assignmentStatus - Returns the list of all Tasks in the Workspace with the specified assignment_status
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property evaluateTaskAttributes - The task attributes of the Tasks to read
    * @property hasAddons - Whether to read Tasks with addons
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property ordering - Controls the order of the Tasks returned
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property priority - The priority value of the Tasks to read
    * @property taskQueueName - The friendly_name of the TaskQueue with the Tasks to read
    * @property taskQueueSid - The SID of the TaskQueue with the Tasks to read
    * @property workflowName - The friendly name of the Workflow with the Tasks to read
    * @property workflowSid - The SID of the Workflow with the Tasks to read
    */
  trait TaskListInstanceEachOptions extends StObject {
    
    var assignmentStatus: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var evaluateTaskAttributes: js.UndefOr[String] = js.undefined
    
    var hasAddons: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var ordering: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var taskQueueName: js.UndefOr[String] = js.undefined
    
    var taskQueueSid: js.UndefOr[String] = js.undefined
    
    var workflowName: js.UndefOr[String] = js.undefined
    
    var workflowSid: js.UndefOr[String] = js.undefined
  }
  object TaskListInstanceEachOptions {
    
    inline def apply(): TaskListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskListInstanceEachOptions]
    }
    
    extension [Self <: TaskListInstanceEachOptions](x: Self) {
      
      inline def setAssignmentStatus(value: String | js.Array[String]): Self = StObject.set(x, "assignmentStatus", value.asInstanceOf[js.Any])
      
      inline def setAssignmentStatusUndefined: Self = StObject.set(x, "assignmentStatus", js.undefined)
      
      inline def setAssignmentStatusVarargs(value: String*): Self = StObject.set(x, "assignmentStatus", js.Array(value*))
      
      inline def setCallback(
        value: (/* item */ TaskInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEvaluateTaskAttributes(value: String): Self = StObject.set(x, "evaluateTaskAttributes", value.asInstanceOf[js.Any])
      
      inline def setEvaluateTaskAttributesUndefined: Self = StObject.set(x, "evaluateTaskAttributes", js.undefined)
      
      inline def setHasAddons(value: Boolean): Self = StObject.set(x, "hasAddons", value.asInstanceOf[js.Any])
      
      inline def setHasAddonsUndefined: Self = StObject.set(x, "hasAddons", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrdering(value: String): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
      
      inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTaskQueueName(value: String): Self = StObject.set(x, "taskQueueName", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueNameUndefined: Self = StObject.set(x, "taskQueueName", js.undefined)
      
      inline def setTaskQueueSid(value: String): Self = StObject.set(x, "taskQueueSid", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueSidUndefined: Self = StObject.set(x, "taskQueueSid", js.undefined)
      
      inline def setWorkflowName(value: String): Self = StObject.set(x, "workflowName", value.asInstanceOf[js.Any])
      
      inline def setWorkflowNameUndefined: Self = StObject.set(x, "workflowName", js.undefined)
      
      inline def setWorkflowSid(value: String): Self = StObject.set(x, "workflowSid", value.asInstanceOf[js.Any])
      
      inline def setWorkflowSidUndefined: Self = StObject.set(x, "workflowSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property assignmentStatus - Returns the list of all Tasks in the Workspace with the specified assignment_status
    * @property evaluateTaskAttributes - The task attributes of the Tasks to read
    * @property hasAddons - Whether to read Tasks with addons
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property ordering - Controls the order of the Tasks returned
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property priority - The priority value of the Tasks to read
    * @property taskQueueName - The friendly_name of the TaskQueue with the Tasks to read
    * @property taskQueueSid - The SID of the TaskQueue with the Tasks to read
    * @property workflowName - The friendly name of the Workflow with the Tasks to read
    * @property workflowSid - The SID of the Workflow with the Tasks to read
    */
  trait TaskListInstanceOptions extends StObject {
    
    var assignmentStatus: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var evaluateTaskAttributes: js.UndefOr[String] = js.undefined
    
    var hasAddons: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var ordering: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var taskQueueName: js.UndefOr[String] = js.undefined
    
    var taskQueueSid: js.UndefOr[String] = js.undefined
    
    var workflowName: js.UndefOr[String] = js.undefined
    
    var workflowSid: js.UndefOr[String] = js.undefined
  }
  object TaskListInstanceOptions {
    
    inline def apply(): TaskListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskListInstanceOptions]
    }
    
    extension [Self <: TaskListInstanceOptions](x: Self) {
      
      inline def setAssignmentStatus(value: String | js.Array[String]): Self = StObject.set(x, "assignmentStatus", value.asInstanceOf[js.Any])
      
      inline def setAssignmentStatusUndefined: Self = StObject.set(x, "assignmentStatus", js.undefined)
      
      inline def setAssignmentStatusVarargs(value: String*): Self = StObject.set(x, "assignmentStatus", js.Array(value*))
      
      inline def setEvaluateTaskAttributes(value: String): Self = StObject.set(x, "evaluateTaskAttributes", value.asInstanceOf[js.Any])
      
      inline def setEvaluateTaskAttributesUndefined: Self = StObject.set(x, "evaluateTaskAttributes", js.undefined)
      
      inline def setHasAddons(value: Boolean): Self = StObject.set(x, "hasAddons", value.asInstanceOf[js.Any])
      
      inline def setHasAddonsUndefined: Self = StObject.set(x, "hasAddons", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrdering(value: String): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
      
      inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTaskQueueName(value: String): Self = StObject.set(x, "taskQueueName", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueNameUndefined: Self = StObject.set(x, "taskQueueName", js.undefined)
      
      inline def setTaskQueueSid(value: String): Self = StObject.set(x, "taskQueueSid", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueSidUndefined: Self = StObject.set(x, "taskQueueSid", js.undefined)
      
      inline def setWorkflowName(value: String): Self = StObject.set(x, "workflowName", value.asInstanceOf[js.Any])
      
      inline def setWorkflowNameUndefined: Self = StObject.set(x, "workflowName", js.undefined)
      
      inline def setWorkflowSid(value: String): Self = StObject.set(x, "workflowSid", value.asInstanceOf[js.Any])
      
      inline def setWorkflowSidUndefined: Self = StObject.set(x, "workflowSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property assignmentStatus - Returns the list of all Tasks in the Workspace with the specified assignment_status
    * @property evaluateTaskAttributes - The task attributes of the Tasks to read
    * @property hasAddons - Whether to read Tasks with addons
    * @property ordering - Controls the order of the Tasks returned
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property priority - The priority value of the Tasks to read
    * @property taskQueueName - The friendly_name of the TaskQueue with the Tasks to read
    * @property taskQueueSid - The SID of the TaskQueue with the Tasks to read
    * @property workflowName - The friendly name of the Workflow with the Tasks to read
    * @property workflowSid - The SID of the Workflow with the Tasks to read
    */
  trait TaskListInstancePageOptions extends StObject {
    
    var assignmentStatus: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var evaluateTaskAttributes: js.UndefOr[String] = js.undefined
    
    var hasAddons: js.UndefOr[Boolean] = js.undefined
    
    var ordering: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var taskQueueName: js.UndefOr[String] = js.undefined
    
    var taskQueueSid: js.UndefOr[String] = js.undefined
    
    var workflowName: js.UndefOr[String] = js.undefined
    
    var workflowSid: js.UndefOr[String] = js.undefined
  }
  object TaskListInstancePageOptions {
    
    inline def apply(): TaskListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskListInstancePageOptions]
    }
    
    extension [Self <: TaskListInstancePageOptions](x: Self) {
      
      inline def setAssignmentStatus(value: String | js.Array[String]): Self = StObject.set(x, "assignmentStatus", value.asInstanceOf[js.Any])
      
      inline def setAssignmentStatusUndefined: Self = StObject.set(x, "assignmentStatus", js.undefined)
      
      inline def setAssignmentStatusVarargs(value: String*): Self = StObject.set(x, "assignmentStatus", js.Array(value*))
      
      inline def setEvaluateTaskAttributes(value: String): Self = StObject.set(x, "evaluateTaskAttributes", value.asInstanceOf[js.Any])
      
      inline def setEvaluateTaskAttributesUndefined: Self = StObject.set(x, "evaluateTaskAttributes", js.undefined)
      
      inline def setHasAddons(value: Boolean): Self = StObject.set(x, "hasAddons", value.asInstanceOf[js.Any])
      
      inline def setHasAddonsUndefined: Self = StObject.set(x, "hasAddons", js.undefined)
      
      inline def setOrdering(value: String): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
      
      inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTaskQueueName(value: String): Self = StObject.set(x, "taskQueueName", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueNameUndefined: Self = StObject.set(x, "taskQueueName", js.undefined)
      
      inline def setTaskQueueSid(value: String): Self = StObject.set(x, "taskQueueSid", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueSidUndefined: Self = StObject.set(x, "taskQueueSid", js.undefined)
      
      inline def setWorkflowName(value: String): Self = StObject.set(x, "workflowName", value.asInstanceOf[js.Any])
      
      inline def setWorkflowNameUndefined: Self = StObject.set(x, "workflowName", js.undefined)
      
      inline def setWorkflowSid(value: String): Self = StObject.set(x, "workflowSid", value.asInstanceOf[js.Any])
      
      inline def setWorkflowSidUndefined: Self = StObject.set(x, "workflowSid", js.undefined)
    }
  }
  
  trait TaskPayload
    extends StObject
       with TaskResource
       with TwilioResponsePayload
  object TaskPayload {
    
    inline def apply(
      account_sid: String,
      addons: String,
      age: Double,
      assignment_status: TaskStatus,
      attributes: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      priority: Double,
      reason: String,
      sid: String,
      task_channel_sid: String,
      task_channel_unique_name: String,
      task_queue_entered_date: js.Date,
      task_queue_friendly_name: String,
      task_queue_sid: String,
      timeout: Double,
      uri: String,
      url: String,
      workflow_friendly_name: String,
      workflow_sid: String,
      workspace_sid: String
    ): TaskPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], addons = addons.asInstanceOf[js.Any], age = age.asInstanceOf[js.Any], assignment_status = assignment_status.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_channel_sid = task_channel_sid.asInstanceOf[js.Any], task_channel_unique_name = task_channel_unique_name.asInstanceOf[js.Any], task_queue_entered_date = task_queue_entered_date.asInstanceOf[js.Any], task_queue_friendly_name = task_queue_friendly_name.asInstanceOf[js.Any], task_queue_sid = task_queue_sid.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_friendly_name = workflow_friendly_name.asInstanceOf[js.Any], workflow_sid = workflow_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskPayload]
    }
  }
  
  trait TaskResource extends StObject {
    
    var account_sid: String
    
    var addons: String
    
    var age: Double
    
    var assignment_status: TaskStatus
    
    var attributes: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var links: String
    
    var priority: Double
    
    var reason: String
    
    var sid: String
    
    var task_channel_sid: String
    
    var task_channel_unique_name: String
    
    var task_queue_entered_date: js.Date
    
    var task_queue_friendly_name: String
    
    var task_queue_sid: String
    
    var timeout: Double
    
    var url: String
    
    var workflow_friendly_name: String
    
    var workflow_sid: String
    
    var workspace_sid: String
  }
  object TaskResource {
    
    inline def apply(
      account_sid: String,
      addons: String,
      age: Double,
      assignment_status: TaskStatus,
      attributes: String,
      date_created: js.Date,
      date_updated: js.Date,
      links: String,
      priority: Double,
      reason: String,
      sid: String,
      task_channel_sid: String,
      task_channel_unique_name: String,
      task_queue_entered_date: js.Date,
      task_queue_friendly_name: String,
      task_queue_sid: String,
      timeout: Double,
      url: String,
      workflow_friendly_name: String,
      workflow_sid: String,
      workspace_sid: String
    ): TaskResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], addons = addons.asInstanceOf[js.Any], age = age.asInstanceOf[js.Any], assignment_status = assignment_status.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_channel_sid = task_channel_sid.asInstanceOf[js.Any], task_channel_unique_name = task_channel_unique_name.asInstanceOf[js.Any], task_queue_entered_date = task_queue_entered_date.asInstanceOf[js.Any], task_queue_friendly_name = task_queue_friendly_name.asInstanceOf[js.Any], task_queue_sid = task_queue_sid.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_friendly_name = workflow_friendly_name.asInstanceOf[js.Any], workflow_sid = workflow_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskResource]
    }
    
    extension [Self <: TaskResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAddons(value: String): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
      
      inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setAssignment_status(value: TaskStatus): Self = StObject.set(x, "assignment_status", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTask_channel_sid(value: String): Self = StObject.set(x, "task_channel_sid", value.asInstanceOf[js.Any])
      
      inline def setTask_channel_unique_name(value: String): Self = StObject.set(x, "task_channel_unique_name", value.asInstanceOf[js.Any])
      
      inline def setTask_queue_entered_date(value: js.Date): Self = StObject.set(x, "task_queue_entered_date", value.asInstanceOf[js.Any])
      
      inline def setTask_queue_friendly_name(value: String): Self = StObject.set(x, "task_queue_friendly_name", value.asInstanceOf[js.Any])
      
      inline def setTask_queue_sid(value: String): Self = StObject.set(x, "task_queue_sid", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkflow_friendly_name(value: String): Self = StObject.set(x, "workflow_friendly_name", value.asInstanceOf[js.Any])
      
      inline def setWorkflow_sid(value: String): Self = StObject.set(x, "workflow_sid", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object TaskSolution {
    
    inline def apply(): TaskSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskSolution]
    }
    
    extension [Self <: TaskSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.pending_
    - typings.twilio.twilioStrings.reserved
    - typings.twilio.twilioStrings.assigned
    - typings.twilio.twilioStrings.canceled
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.wrapping
  */
  trait TaskStatus extends StObject
  object TaskStatus {
    
    inline def assigned: typings.twilio.twilioStrings.assigned = "assigned".asInstanceOf[typings.twilio.twilioStrings.assigned]
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def pending: pending_ = "pending".asInstanceOf[pending_]
    
    inline def reserved: typings.twilio.twilioStrings.reserved = "reserved".asInstanceOf[typings.twilio.twilioStrings.reserved]
    
    inline def wrapping: typings.twilio.twilioStrings.wrapping = "wrapping".asInstanceOf[typings.twilio.twilioStrings.wrapping]
  }
}
