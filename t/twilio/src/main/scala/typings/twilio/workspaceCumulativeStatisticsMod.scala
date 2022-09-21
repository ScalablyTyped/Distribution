package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceCumulativeStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceCumulativeStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceCumulativeStatistics", "WorkspaceCumulativeStatisticsContext")
  @js.native
  open class WorkspaceCumulativeStatisticsContext protected () extends StObject {
    /**
      * Initialize the WorkspaceCumulativeStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String) = this()
    
    /**
      * fetch a WorkspaceCumulativeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkspaceCumulativeStatisticsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceCumulativeStatisticsInstance, Any]
    ): js.Promise[WorkspaceCumulativeStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceCumulativeStatisticsInstance, Any]
    ): js.Promise[WorkspaceCumulativeStatisticsInstance] = js.native
    def fetch(opts: WorkspaceCumulativeStatisticsInstanceFetchOptions): js.Promise[WorkspaceCumulativeStatisticsInstance] = js.native
    def fetch(
      opts: WorkspaceCumulativeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceCumulativeStatisticsInstance, Any]
    ): js.Promise[WorkspaceCumulativeStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceCumulativeStatistics", "WorkspaceCumulativeStatisticsInstance")
  @js.native
  open class WorkspaceCumulativeStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkspaceCumulativeStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkspaceCumulativeStatisticsPayload,
      workspaceSid: String
    ) = this()
    
    /* private */ var _proxy: WorkspaceCumulativeStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var avgTaskAcceptanceTime: Double = js.native
    
    var endTime: js.Date = js.native
    
    /**
      * fetch a WorkspaceCumulativeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkspaceCumulativeStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkspaceCumulativeStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkspaceCumulativeStatisticsInstance] = js.native
    def fetch(opts: WorkspaceCumulativeStatisticsInstanceFetchOptions): js.Promise[WorkspaceCumulativeStatisticsInstance] = js.native
    def fetch(
      opts: WorkspaceCumulativeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkspaceCumulativeStatisticsInstance] = js.native
    
    var reservationsAccepted: Double = js.native
    
    var reservationsCanceled: Double = js.native
    
    var reservationsCreated: Double = js.native
    
    var reservationsRejected: Double = js.native
    
    var reservationsRescinded: Double = js.native
    
    var reservationsTimedOut: Double = js.native
    
    var splitByWaitTime: Any = js.native
    
    var startTime: js.Date = js.native
    
    var tasksCanceled: Double = js.native
    
    var tasksCompleted: Double = js.native
    
    var tasksCreated: Double = js.native
    
    var tasksDeleted: Double = js.native
    
    var tasksMoved: Double = js.native
    
    var tasksTimedOutInWorkflow: Double = js.native
    
    var url: String = js.native
    
    var waitDurationUntilAccepted: Any = js.native
    
    var waitDurationUntilCanceled: Any = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkspaceCumulativeStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace
    */
  inline def WorkspaceCumulativeStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): WorkspaceCumulativeStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkspaceCumulativeStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[WorkspaceCumulativeStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceCumulativeStatistics", "WorkspaceCumulativeStatisticsPage")
  @js.native
  open class WorkspaceCumulativeStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkspaceCumulativeStatisticsPayload, 
          WorkspaceCumulativeStatisticsResource, 
          WorkspaceCumulativeStatisticsInstance
        ] {
    /**
      * Initialize the WorkspaceCumulativeStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkspaceCumulativeStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of WorkspaceCumulativeStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkspaceCumulativeStatisticsPayload): WorkspaceCumulativeStatisticsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property endDate - Only include usage that occurred on or before this date
    * @property minutes - Only calculate statistics since this many minutes in the past
    * @property splitByWaitTime - A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on
    * @property startDate - Only calculate statistics from on or after this date
    * @property taskChannel - Only calculate cumulative statistics on this TaskChannel
    */
  trait WorkspaceCumulativeStatisticsInstanceFetchOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var splitByWaitTime: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object WorkspaceCumulativeStatisticsInstanceFetchOptions {
    
    inline def apply(): WorkspaceCumulativeStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceCumulativeStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: WorkspaceCumulativeStatisticsInstanceFetchOptions](x: Self) {
      
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
  trait WorkspaceCumulativeStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkspaceCumulativeStatisticsContext = js.native
    
    /**
      * Constructs a workspace_cumulative_statistics
      */
    def get(): WorkspaceCumulativeStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait WorkspaceCumulativeStatisticsPayload
    extends StObject
       with WorkspaceCumulativeStatisticsResource
       with TwilioResponsePayload
  object WorkspaceCumulativeStatisticsPayload {
    
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
      tasks_canceled: Double,
      tasks_completed: Double,
      tasks_created: Double,
      tasks_deleted: Double,
      tasks_moved: Double,
      tasks_timed_out_in_workflow: Double,
      uri: String,
      url: String,
      wait_duration_until_accepted: js.Object,
      wait_duration_until_canceled: js.Object,
      workspace_sid: String
    ): WorkspaceCumulativeStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], avg_task_acceptance_time = avg_task_acceptance_time.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reservations_accepted = reservations_accepted.asInstanceOf[js.Any], reservations_canceled = reservations_canceled.asInstanceOf[js.Any], reservations_created = reservations_created.asInstanceOf[js.Any], reservations_rejected = reservations_rejected.asInstanceOf[js.Any], reservations_rescinded = reservations_rescinded.asInstanceOf[js.Any], reservations_timed_out = reservations_timed_out.asInstanceOf[js.Any], split_by_wait_time = split_by_wait_time.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tasks_canceled = tasks_canceled.asInstanceOf[js.Any], tasks_completed = tasks_completed.asInstanceOf[js.Any], tasks_created = tasks_created.asInstanceOf[js.Any], tasks_deleted = tasks_deleted.asInstanceOf[js.Any], tasks_moved = tasks_moved.asInstanceOf[js.Any], tasks_timed_out_in_workflow = tasks_timed_out_in_workflow.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wait_duration_until_accepted = wait_duration_until_accepted.asInstanceOf[js.Any], wait_duration_until_canceled = wait_duration_until_canceled.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceCumulativeStatisticsPayload]
    }
  }
  
  trait WorkspaceCumulativeStatisticsResource extends StObject {
    
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
    
    var tasks_canceled: Double
    
    var tasks_completed: Double
    
    var tasks_created: Double
    
    var tasks_deleted: Double
    
    var tasks_moved: Double
    
    var tasks_timed_out_in_workflow: Double
    
    var url: String
    
    var wait_duration_until_accepted: js.Object
    
    var wait_duration_until_canceled: js.Object
    
    var workspace_sid: String
  }
  object WorkspaceCumulativeStatisticsResource {
    
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
      tasks_canceled: Double,
      tasks_completed: Double,
      tasks_created: Double,
      tasks_deleted: Double,
      tasks_moved: Double,
      tasks_timed_out_in_workflow: Double,
      url: String,
      wait_duration_until_accepted: js.Object,
      wait_duration_until_canceled: js.Object,
      workspace_sid: String
    ): WorkspaceCumulativeStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], avg_task_acceptance_time = avg_task_acceptance_time.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], reservations_accepted = reservations_accepted.asInstanceOf[js.Any], reservations_canceled = reservations_canceled.asInstanceOf[js.Any], reservations_created = reservations_created.asInstanceOf[js.Any], reservations_rejected = reservations_rejected.asInstanceOf[js.Any], reservations_rescinded = reservations_rescinded.asInstanceOf[js.Any], reservations_timed_out = reservations_timed_out.asInstanceOf[js.Any], split_by_wait_time = split_by_wait_time.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tasks_canceled = tasks_canceled.asInstanceOf[js.Any], tasks_completed = tasks_completed.asInstanceOf[js.Any], tasks_created = tasks_created.asInstanceOf[js.Any], tasks_deleted = tasks_deleted.asInstanceOf[js.Any], tasks_moved = tasks_moved.asInstanceOf[js.Any], tasks_timed_out_in_workflow = tasks_timed_out_in_workflow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wait_duration_until_accepted = wait_duration_until_accepted.asInstanceOf[js.Any], wait_duration_until_canceled = wait_duration_until_canceled.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceCumulativeStatisticsResource]
    }
    
    extension [Self <: WorkspaceCumulativeStatisticsResource](x: Self) {
      
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
      
      inline def setTasks_canceled(value: Double): Self = StObject.set(x, "tasks_canceled", value.asInstanceOf[js.Any])
      
      inline def setTasks_completed(value: Double): Self = StObject.set(x, "tasks_completed", value.asInstanceOf[js.Any])
      
      inline def setTasks_created(value: Double): Self = StObject.set(x, "tasks_created", value.asInstanceOf[js.Any])
      
      inline def setTasks_deleted(value: Double): Self = StObject.set(x, "tasks_deleted", value.asInstanceOf[js.Any])
      
      inline def setTasks_moved(value: Double): Self = StObject.set(x, "tasks_moved", value.asInstanceOf[js.Any])
      
      inline def setTasks_timed_out_in_workflow(value: Double): Self = StObject.set(x, "tasks_timed_out_in_workflow", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWait_duration_until_accepted(value: js.Object): Self = StObject.set(x, "wait_duration_until_accepted", value.asInstanceOf[js.Any])
      
      inline def setWait_duration_until_canceled(value: js.Object): Self = StObject.set(x, "wait_duration_until_canceled", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkspaceCumulativeStatisticsSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkspaceCumulativeStatisticsSolution {
    
    inline def apply(): WorkspaceCumulativeStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceCumulativeStatisticsSolution]
    }
    
    extension [Self <: WorkspaceCumulativeStatisticsSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
