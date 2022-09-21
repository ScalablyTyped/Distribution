package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskQueueRealTimeStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueRealTimeStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueRealTimeStatistics", "TaskQueueRealTimeStatisticsContext")
  @js.native
  open class TaskQueueRealTimeStatisticsContext protected () extends StObject {
    /**
      * Initialize the TaskQueueRealTimeStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the TaskQueue to fetch
      * @param taskQueueSid - The SID of the TaskQueue for which to fetch statistics
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, taskQueueSid: String) = this()
    
    /**
      * fetch a TaskQueueRealTimeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskQueueRealTimeStatisticsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueRealTimeStatisticsInstance, Any]
    ): js.Promise[TaskQueueRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueRealTimeStatisticsInstance, Any]
    ): js.Promise[TaskQueueRealTimeStatisticsInstance] = js.native
    def fetch(opts: TaskQueueRealTimeStatisticsInstanceFetchOptions): js.Promise[TaskQueueRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: TaskQueueRealTimeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueRealTimeStatisticsInstance, Any]
    ): js.Promise[TaskQueueRealTimeStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueRealTimeStatistics", "TaskQueueRealTimeStatisticsInstance")
  @js.native
  open class TaskQueueRealTimeStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the TaskQueueRealTimeStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the TaskQueue
      * @param taskQueueSid - The SID of the TaskQueue from which these statistics were calculated
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: TaskQueueRealTimeStatisticsPayload,
      workspaceSid: String,
      taskQueueSid: String
    ) = this()
    
    /* private */ var _proxy: TaskQueueRealTimeStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var activityStatistics: js.Array[js.Object] = js.native
    
    /**
      * fetch a TaskQueueRealTimeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskQueueRealTimeStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskQueueRealTimeStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskQueueRealTimeStatisticsInstance] = js.native
    def fetch(opts: TaskQueueRealTimeStatisticsInstanceFetchOptions): js.Promise[TaskQueueRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: TaskQueueRealTimeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TaskQueueRealTimeStatisticsInstance] = js.native
    
    var longestRelativeTaskAgeInQueue: Double = js.native
    
    var longestRelativeTaskSidInQueue: String = js.native
    
    var longestTaskWaitingAge: Double = js.native
    
    var longestTaskWaitingSid: String = js.native
    
    var taskQueueSid: String = js.native
    
    var tasksByPriority: Any = js.native
    
    var tasksByStatus: Any = js.native
    
    var totalAvailableWorkers: Double = js.native
    
    var totalEligibleWorkers: Double = js.native
    
    var totalTasks: Double = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the TaskQueueRealTimeStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the TaskQueue
    * @param taskQueueSid - The SID of the TaskQueue from which these statistics were calculated
    */
  inline def TaskQueueRealTimeStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, taskQueueSid: String): TaskQueueRealTimeStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TaskQueueRealTimeStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any], taskQueueSid.asInstanceOf[js.Any])).asInstanceOf[TaskQueueRealTimeStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueRealTimeStatistics", "TaskQueueRealTimeStatisticsPage")
  @js.native
  open class TaskQueueRealTimeStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          TaskQueueRealTimeStatisticsPayload, 
          TaskQueueRealTimeStatisticsResource, 
          TaskQueueRealTimeStatisticsInstance
        ] {
    /**
      * Initialize the TaskQueueRealTimeStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TaskQueueRealTimeStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of TaskQueueRealTimeStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskQueueRealTimeStatisticsPayload): TaskQueueRealTimeStatisticsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property taskChannel - The TaskChannel for which to fetch statistics
    */
  trait TaskQueueRealTimeStatisticsInstanceFetchOptions extends StObject {
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object TaskQueueRealTimeStatisticsInstanceFetchOptions {
    
    inline def apply(): TaskQueueRealTimeStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueRealTimeStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: TaskQueueRealTimeStatisticsInstanceFetchOptions](x: Self) {
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
    }
  }
  
  @js.native
  trait TaskQueueRealTimeStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TaskQueueRealTimeStatisticsContext = js.native
    
    /**
      * Constructs a task_queue_real_time_statistics
      */
    def get(): TaskQueueRealTimeStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait TaskQueueRealTimeStatisticsPayload
    extends StObject
       with TaskQueueRealTimeStatisticsResource
       with TwilioResponsePayload
  object TaskQueueRealTimeStatisticsPayload {
    
    inline def apply(
      account_sid: String,
      activity_statistics: js.Array[js.Object],
      first_page_uri: String,
      longest_relative_task_age_in_queue: Double,
      longest_relative_task_sid_in_queue: String,
      longest_task_waiting_age: Double,
      longest_task_waiting_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      task_queue_sid: String,
      tasks_by_priority: js.Object,
      tasks_by_status: js.Object,
      total_available_workers: Double,
      total_eligible_workers: Double,
      total_tasks: Double,
      uri: String,
      url: String,
      workspace_sid: String
    ): TaskQueueRealTimeStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], activity_statistics = activity_statistics.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], longest_relative_task_age_in_queue = longest_relative_task_age_in_queue.asInstanceOf[js.Any], longest_relative_task_sid_in_queue = longest_relative_task_sid_in_queue.asInstanceOf[js.Any], longest_task_waiting_age = longest_task_waiting_age.asInstanceOf[js.Any], longest_task_waiting_sid = longest_task_waiting_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], task_queue_sid = task_queue_sid.asInstanceOf[js.Any], tasks_by_priority = tasks_by_priority.asInstanceOf[js.Any], tasks_by_status = tasks_by_status.asInstanceOf[js.Any], total_available_workers = total_available_workers.asInstanceOf[js.Any], total_eligible_workers = total_eligible_workers.asInstanceOf[js.Any], total_tasks = total_tasks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueueRealTimeStatisticsPayload]
    }
  }
  
  trait TaskQueueRealTimeStatisticsResource extends StObject {
    
    var account_sid: String
    
    var activity_statistics: js.Array[js.Object]
    
    var longest_relative_task_age_in_queue: Double
    
    var longest_relative_task_sid_in_queue: String
    
    var longest_task_waiting_age: Double
    
    var longest_task_waiting_sid: String
    
    var task_queue_sid: String
    
    var tasks_by_priority: js.Object
    
    var tasks_by_status: js.Object
    
    var total_available_workers: Double
    
    var total_eligible_workers: Double
    
    var total_tasks: Double
    
    var url: String
    
    var workspace_sid: String
  }
  object TaskQueueRealTimeStatisticsResource {
    
    inline def apply(
      account_sid: String,
      activity_statistics: js.Array[js.Object],
      longest_relative_task_age_in_queue: Double,
      longest_relative_task_sid_in_queue: String,
      longest_task_waiting_age: Double,
      longest_task_waiting_sid: String,
      task_queue_sid: String,
      tasks_by_priority: js.Object,
      tasks_by_status: js.Object,
      total_available_workers: Double,
      total_eligible_workers: Double,
      total_tasks: Double,
      url: String,
      workspace_sid: String
    ): TaskQueueRealTimeStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], activity_statistics = activity_statistics.asInstanceOf[js.Any], longest_relative_task_age_in_queue = longest_relative_task_age_in_queue.asInstanceOf[js.Any], longest_relative_task_sid_in_queue = longest_relative_task_sid_in_queue.asInstanceOf[js.Any], longest_task_waiting_age = longest_task_waiting_age.asInstanceOf[js.Any], longest_task_waiting_sid = longest_task_waiting_sid.asInstanceOf[js.Any], task_queue_sid = task_queue_sid.asInstanceOf[js.Any], tasks_by_priority = tasks_by_priority.asInstanceOf[js.Any], tasks_by_status = tasks_by_status.asInstanceOf[js.Any], total_available_workers = total_available_workers.asInstanceOf[js.Any], total_eligible_workers = total_eligible_workers.asInstanceOf[js.Any], total_tasks = total_tasks.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueueRealTimeStatisticsResource]
    }
    
    extension [Self <: TaskQueueRealTimeStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setActivity_statistics(value: js.Array[js.Object]): Self = StObject.set(x, "activity_statistics", value.asInstanceOf[js.Any])
      
      inline def setActivity_statisticsVarargs(value: js.Object*): Self = StObject.set(x, "activity_statistics", js.Array(value*))
      
      inline def setLongest_relative_task_age_in_queue(value: Double): Self = StObject.set(x, "longest_relative_task_age_in_queue", value.asInstanceOf[js.Any])
      
      inline def setLongest_relative_task_sid_in_queue(value: String): Self = StObject.set(x, "longest_relative_task_sid_in_queue", value.asInstanceOf[js.Any])
      
      inline def setLongest_task_waiting_age(value: Double): Self = StObject.set(x, "longest_task_waiting_age", value.asInstanceOf[js.Any])
      
      inline def setLongest_task_waiting_sid(value: String): Self = StObject.set(x, "longest_task_waiting_sid", value.asInstanceOf[js.Any])
      
      inline def setTask_queue_sid(value: String): Self = StObject.set(x, "task_queue_sid", value.asInstanceOf[js.Any])
      
      inline def setTasks_by_priority(value: js.Object): Self = StObject.set(x, "tasks_by_priority", value.asInstanceOf[js.Any])
      
      inline def setTasks_by_status(value: js.Object): Self = StObject.set(x, "tasks_by_status", value.asInstanceOf[js.Any])
      
      inline def setTotal_available_workers(value: Double): Self = StObject.set(x, "total_available_workers", value.asInstanceOf[js.Any])
      
      inline def setTotal_eligible_workers(value: Double): Self = StObject.set(x, "total_eligible_workers", value.asInstanceOf[js.Any])
      
      inline def setTotal_tasks(value: Double): Self = StObject.set(x, "total_tasks", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskQueueRealTimeStatisticsSolution extends StObject {
    
    var taskQueueSid: js.UndefOr[String] = js.undefined
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object TaskQueueRealTimeStatisticsSolution {
    
    inline def apply(): TaskQueueRealTimeStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueRealTimeStatisticsSolution]
    }
    
    extension [Self <: TaskQueueRealTimeStatisticsSolution](x: Self) {
      
      inline def setTaskQueueSid(value: String): Self = StObject.set(x, "taskQueueSid", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueSidUndefined: Self = StObject.set(x, "taskQueueSid", js.undefined)
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
