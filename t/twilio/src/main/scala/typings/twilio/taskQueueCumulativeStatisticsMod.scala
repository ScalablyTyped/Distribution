package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskQueueCumulativeStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueCumulativeStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueCumulativeStatistics", "TaskQueueCumulativeStatisticsContext")
  @js.native
  open class TaskQueueCumulativeStatisticsContext protected () extends StObject {
    /**
      * Initialize the TaskQueueCumulativeStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the TaskQueue to fetch
      * @param taskQueueSid - The SID of the TaskQueue for which to fetch statistics
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, taskQueueSid: String) = this()
    
    /**
      * fetch a TaskQueueCumulativeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskQueueCumulativeStatisticsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueCumulativeStatisticsInstance, Any]
    ): js.Promise[TaskQueueCumulativeStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueCumulativeStatisticsInstance, Any]
    ): js.Promise[TaskQueueCumulativeStatisticsInstance] = js.native
    def fetch(opts: TaskQueueCumulativeStatisticsInstanceFetchOptions): js.Promise[TaskQueueCumulativeStatisticsInstance] = js.native
    def fetch(
      opts: TaskQueueCumulativeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueCumulativeStatisticsInstance, Any]
    ): js.Promise[TaskQueueCumulativeStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueCumulativeStatistics", "TaskQueueCumulativeStatisticsInstance")
  @js.native
  open class TaskQueueCumulativeStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the TaskQueueCumulativeStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the TaskQueue
      * @param taskQueueSid - The SID of the TaskQueue from which these statistics were calculated
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: TaskQueueCumulativeStatisticsPayload,
      workspaceSid: String,
      taskQueueSid: String
    ) = this()
    
    /* private */ var _proxy: TaskQueueCumulativeStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var avgTaskAcceptanceTime: Double = js.native
    
    var endTime: js.Date = js.native
    
    /**
      * fetch a TaskQueueCumulativeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskQueueCumulativeStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskQueueCumulativeStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskQueueCumulativeStatisticsInstance] = js.native
    def fetch(opts: TaskQueueCumulativeStatisticsInstanceFetchOptions): js.Promise[TaskQueueCumulativeStatisticsInstance] = js.native
    def fetch(
      opts: TaskQueueCumulativeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TaskQueueCumulativeStatisticsInstance] = js.native
    
    var reservationsAccepted: Double = js.native
    
    var reservationsCanceled: Double = js.native
    
    var reservationsCreated: Double = js.native
    
    var reservationsRejected: Double = js.native
    
    var reservationsRescinded: Double = js.native
    
    var reservationsTimedOut: Double = js.native
    
    var splitByWaitTime: Any = js.native
    
    var startTime: js.Date = js.native
    
    var taskQueueSid: String = js.native
    
    var tasksCanceled: Double = js.native
    
    var tasksCompleted: Double = js.native
    
    var tasksDeleted: Double = js.native
    
    var tasksEntered: Double = js.native
    
    var tasksMoved: Double = js.native
    
    var url: String = js.native
    
    var waitDurationInQueueUntilAccepted: Any = js.native
    
    var waitDurationUntilAccepted: Any = js.native
    
    var waitDurationUntilCanceled: Any = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the TaskQueueCumulativeStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the TaskQueue
    * @param taskQueueSid - The SID of the TaskQueue from which these statistics were calculated
    */
  inline def TaskQueueCumulativeStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, taskQueueSid: String): TaskQueueCumulativeStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TaskQueueCumulativeStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any], taskQueueSid.asInstanceOf[js.Any])).asInstanceOf[TaskQueueCumulativeStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueCumulativeStatistics", "TaskQueueCumulativeStatisticsPage")
  @js.native
  open class TaskQueueCumulativeStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          TaskQueueCumulativeStatisticsPayload, 
          TaskQueueCumulativeStatisticsResource, 
          TaskQueueCumulativeStatisticsInstance
        ] {
    /**
      * Initialize the TaskQueueCumulativeStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TaskQueueCumulativeStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of TaskQueueCumulativeStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskQueueCumulativeStatisticsPayload): TaskQueueCumulativeStatisticsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property endDate - Only calculate statistics from on or before this date
    * @property minutes - Only calculate statistics since this many minutes in the past
    * @property splitByWaitTime - A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on
    * @property startDate - Only calculate statistics from on or after this date
    * @property taskChannel - Only calculate cumulative statistics on this TaskChannel
    */
  trait TaskQueueCumulativeStatisticsInstanceFetchOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var splitByWaitTime: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object TaskQueueCumulativeStatisticsInstanceFetchOptions {
    
    inline def apply(): TaskQueueCumulativeStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueCumulativeStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: TaskQueueCumulativeStatisticsInstanceFetchOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setSplitByWaitTime(value: String): Self = StObject.set(x, "splitByWaitTime", value.asInstanceOf[js.Any])
      
      inline def setSplitByWaitTimeUndefined: Self = StObject.set(x, "splitByWaitTime", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
    }
  }
  
  @js.native
  trait TaskQueueCumulativeStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TaskQueueCumulativeStatisticsContext = js.native
    
    /**
      * Constructs a task_queue_cumulative_statistics
      */
    def get(): TaskQueueCumulativeStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait TaskQueueCumulativeStatisticsPayload
    extends StObject
       with TaskQueueCumulativeStatisticsResource
       with TwilioResponsePayload
  object TaskQueueCumulativeStatisticsPayload {
    
    inline def apply(
      account_sid: String,
      avg_task_acceptance_time: Double,
      end_time: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      reservations_accepted: Double,
      reservations_canceled: Double,
      reservations_created: Double,
      reservations_rejected: Double,
      reservations_rescinded: Double,
      reservations_timed_out: Double,
      split_by_wait_time: js.Object,
      start_time: js.Date,
      task_queue_sid: String,
      tasks_canceled: Double,
      tasks_completed: Double,
      tasks_deleted: Double,
      tasks_entered: Double,
      tasks_moved: Double,
      uri: String,
      url: String,
      wait_duration_in_queue_until_accepted: js.Object,
      wait_duration_until_accepted: js.Object,
      wait_duration_until_canceled: js.Object,
      workspace_sid: String
    ): TaskQueueCumulativeStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], avg_task_acceptance_time = avg_task_acceptance_time.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reservations_accepted = reservations_accepted.asInstanceOf[js.Any], reservations_canceled = reservations_canceled.asInstanceOf[js.Any], reservations_created = reservations_created.asInstanceOf[js.Any], reservations_rejected = reservations_rejected.asInstanceOf[js.Any], reservations_rescinded = reservations_rescinded.asInstanceOf[js.Any], reservations_timed_out = reservations_timed_out.asInstanceOf[js.Any], split_by_wait_time = split_by_wait_time.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], task_queue_sid = task_queue_sid.asInstanceOf[js.Any], tasks_canceled = tasks_canceled.asInstanceOf[js.Any], tasks_completed = tasks_completed.asInstanceOf[js.Any], tasks_deleted = tasks_deleted.asInstanceOf[js.Any], tasks_entered = tasks_entered.asInstanceOf[js.Any], tasks_moved = tasks_moved.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wait_duration_in_queue_until_accepted = wait_duration_in_queue_until_accepted.asInstanceOf[js.Any], wait_duration_until_accepted = wait_duration_until_accepted.asInstanceOf[js.Any], wait_duration_until_canceled = wait_duration_until_canceled.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueueCumulativeStatisticsPayload]
    }
  }
  
  trait TaskQueueCumulativeStatisticsResource extends StObject {
    
    var account_sid: String
    
    var avg_task_acceptance_time: Double
    
    var end_time: js.Date
    
    var reservations_accepted: Double
    
    var reservations_canceled: Double
    
    var reservations_created: Double
    
    var reservations_rejected: Double
    
    var reservations_rescinded: Double
    
    var reservations_timed_out: Double
    
    var split_by_wait_time: js.Object
    
    var start_time: js.Date
    
    var task_queue_sid: String
    
    var tasks_canceled: Double
    
    var tasks_completed: Double
    
    var tasks_deleted: Double
    
    var tasks_entered: Double
    
    var tasks_moved: Double
    
    var url: String
    
    var wait_duration_in_queue_until_accepted: js.Object
    
    var wait_duration_until_accepted: js.Object
    
    var wait_duration_until_canceled: js.Object
    
    var workspace_sid: String
  }
  object TaskQueueCumulativeStatisticsResource {
    
    inline def apply(
      account_sid: String,
      avg_task_acceptance_time: Double,
      end_time: js.Date,
      reservations_accepted: Double,
      reservations_canceled: Double,
      reservations_created: Double,
      reservations_rejected: Double,
      reservations_rescinded: Double,
      reservations_timed_out: Double,
      split_by_wait_time: js.Object,
      start_time: js.Date,
      task_queue_sid: String,
      tasks_canceled: Double,
      tasks_completed: Double,
      tasks_deleted: Double,
      tasks_entered: Double,
      tasks_moved: Double,
      url: String,
      wait_duration_in_queue_until_accepted: js.Object,
      wait_duration_until_accepted: js.Object,
      wait_duration_until_canceled: js.Object,
      workspace_sid: String
    ): TaskQueueCumulativeStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], avg_task_acceptance_time = avg_task_acceptance_time.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], reservations_accepted = reservations_accepted.asInstanceOf[js.Any], reservations_canceled = reservations_canceled.asInstanceOf[js.Any], reservations_created = reservations_created.asInstanceOf[js.Any], reservations_rejected = reservations_rejected.asInstanceOf[js.Any], reservations_rescinded = reservations_rescinded.asInstanceOf[js.Any], reservations_timed_out = reservations_timed_out.asInstanceOf[js.Any], split_by_wait_time = split_by_wait_time.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], task_queue_sid = task_queue_sid.asInstanceOf[js.Any], tasks_canceled = tasks_canceled.asInstanceOf[js.Any], tasks_completed = tasks_completed.asInstanceOf[js.Any], tasks_deleted = tasks_deleted.asInstanceOf[js.Any], tasks_entered = tasks_entered.asInstanceOf[js.Any], tasks_moved = tasks_moved.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wait_duration_in_queue_until_accepted = wait_duration_in_queue_until_accepted.asInstanceOf[js.Any], wait_duration_until_accepted = wait_duration_until_accepted.asInstanceOf[js.Any], wait_duration_until_canceled = wait_duration_until_canceled.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueueCumulativeStatisticsResource]
    }
    
    extension [Self <: TaskQueueCumulativeStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAvg_task_acceptance_time(value: Double): Self = StObject.set(x, "avg_task_acceptance_time", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setReservations_accepted(value: Double): Self = StObject.set(x, "reservations_accepted", value.asInstanceOf[js.Any])
      
      inline def setReservations_canceled(value: Double): Self = StObject.set(x, "reservations_canceled", value.asInstanceOf[js.Any])
      
      inline def setReservations_created(value: Double): Self = StObject.set(x, "reservations_created", value.asInstanceOf[js.Any])
      
      inline def setReservations_rejected(value: Double): Self = StObject.set(x, "reservations_rejected", value.asInstanceOf[js.Any])
      
      inline def setReservations_rescinded(value: Double): Self = StObject.set(x, "reservations_rescinded", value.asInstanceOf[js.Any])
      
      inline def setReservations_timed_out(value: Double): Self = StObject.set(x, "reservations_timed_out", value.asInstanceOf[js.Any])
      
      inline def setSplit_by_wait_time(value: js.Object): Self = StObject.set(x, "split_by_wait_time", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: js.Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setTask_queue_sid(value: String): Self = StObject.set(x, "task_queue_sid", value.asInstanceOf[js.Any])
      
      inline def setTasks_canceled(value: Double): Self = StObject.set(x, "tasks_canceled", value.asInstanceOf[js.Any])
      
      inline def setTasks_completed(value: Double): Self = StObject.set(x, "tasks_completed", value.asInstanceOf[js.Any])
      
      inline def setTasks_deleted(value: Double): Self = StObject.set(x, "tasks_deleted", value.asInstanceOf[js.Any])
      
      inline def setTasks_entered(value: Double): Self = StObject.set(x, "tasks_entered", value.asInstanceOf[js.Any])
      
      inline def setTasks_moved(value: Double): Self = StObject.set(x, "tasks_moved", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWait_duration_in_queue_until_accepted(value: js.Object): Self = StObject.set(x, "wait_duration_in_queue_until_accepted", value.asInstanceOf[js.Any])
      
      inline def setWait_duration_until_accepted(value: js.Object): Self = StObject.set(x, "wait_duration_until_accepted", value.asInstanceOf[js.Any])
      
      inline def setWait_duration_until_canceled(value: js.Object): Self = StObject.set(x, "wait_duration_until_canceled", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskQueueCumulativeStatisticsSolution extends StObject {
    
    var taskQueueSid: js.UndefOr[String] = js.undefined
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object TaskQueueCumulativeStatisticsSolution {
    
    inline def apply(): TaskQueueCumulativeStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueCumulativeStatisticsSolution]
    }
    
    extension [Self <: TaskQueueCumulativeStatisticsSolution](x: Self) {
      
      inline def setTaskQueueSid(value: String): Self = StObject.set(x, "taskQueueSid", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueSidUndefined: Self = StObject.set(x, "taskQueueSid", js.undefined)
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
