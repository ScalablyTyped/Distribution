package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workersCumulativeStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersCumulativeStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersCumulativeStatistics", "WorkersCumulativeStatisticsContext")
  @js.native
  open class WorkersCumulativeStatisticsContext protected () extends StObject {
    /**
      * Initialize the WorkersCumulativeStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the resource to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String) = this()
    
    /**
      * fetch a WorkersCumulativeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkersCumulativeStatisticsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkersCumulativeStatisticsInstance, Any]
    ): js.Promise[WorkersCumulativeStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkersCumulativeStatisticsInstance, Any]
    ): js.Promise[WorkersCumulativeStatisticsInstance] = js.native
    def fetch(opts: WorkersCumulativeStatisticsInstanceFetchOptions): js.Promise[WorkersCumulativeStatisticsInstance] = js.native
    def fetch(
      opts: WorkersCumulativeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkersCumulativeStatisticsInstance, Any]
    ): js.Promise[WorkersCumulativeStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersCumulativeStatistics", "WorkersCumulativeStatisticsInstance")
  @js.native
  open class WorkersCumulativeStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkersCumulativeStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the Workers
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkersCumulativeStatisticsPayload,
      workspaceSid: String
    ) = this()
    
    /* private */ var _proxy: WorkersCumulativeStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var activityDurations: js.Array[js.Object] = js.native
    
    var endTime: js.Date = js.native
    
    /**
      * fetch a WorkersCumulativeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkersCumulativeStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkersCumulativeStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkersCumulativeStatisticsInstance] = js.native
    def fetch(opts: WorkersCumulativeStatisticsInstanceFetchOptions): js.Promise[WorkersCumulativeStatisticsInstance] = js.native
    def fetch(
      opts: WorkersCumulativeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkersCumulativeStatisticsInstance] = js.native
    
    var reservationsAccepted: Double = js.native
    
    var reservationsCanceled: Double = js.native
    
    var reservationsCreated: Double = js.native
    
    var reservationsRejected: Double = js.native
    
    var reservationsRescinded: Double = js.native
    
    var reservationsTimedOut: Double = js.native
    
    var startTime: js.Date = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkersCumulativeStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the Workers
    */
  inline def WorkersCumulativeStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): WorkersCumulativeStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkersCumulativeStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[WorkersCumulativeStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersCumulativeStatistics", "WorkersCumulativeStatisticsPage")
  @js.native
  open class WorkersCumulativeStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkersCumulativeStatisticsPayload, 
          WorkersCumulativeStatisticsResource, 
          WorkersCumulativeStatisticsInstance
        ] {
    /**
      * Initialize the WorkersCumulativeStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkersCumulativeStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of WorkersCumulativeStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkersCumulativeStatisticsPayload): WorkersCumulativeStatisticsInstance = js.native
    
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
    * @property startDate - Only calculate statistics from on or after this date
    * @property taskChannel - Only calculate cumulative statistics on this TaskChannel
    */
  trait WorkersCumulativeStatisticsInstanceFetchOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object WorkersCumulativeStatisticsInstanceFetchOptions {
    
    inline def apply(): WorkersCumulativeStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkersCumulativeStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: WorkersCumulativeStatisticsInstanceFetchOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
    }
  }
  
  @js.native
  trait WorkersCumulativeStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkersCumulativeStatisticsContext = js.native
    
    /**
      * Constructs a workers_cumulative_statistics
      */
    def get(): WorkersCumulativeStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait WorkersCumulativeStatisticsPayload
    extends StObject
       with WorkersCumulativeStatisticsResource
       with TwilioResponsePayload
  object WorkersCumulativeStatisticsPayload {
    
    inline def apply(
      account_sid: String,
      activity_durations: js.Array[js.Object],
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
      start_time: js.Date,
      uri: String,
      url: String,
      workspace_sid: String
    ): WorkersCumulativeStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], activity_durations = activity_durations.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reservations_accepted = reservations_accepted.asInstanceOf[js.Any], reservations_canceled = reservations_canceled.asInstanceOf[js.Any], reservations_created = reservations_created.asInstanceOf[js.Any], reservations_rejected = reservations_rejected.asInstanceOf[js.Any], reservations_rescinded = reservations_rescinded.asInstanceOf[js.Any], reservations_timed_out = reservations_timed_out.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkersCumulativeStatisticsPayload]
    }
  }
  
  trait WorkersCumulativeStatisticsResource extends StObject {
    
    var account_sid: String
    
    var activity_durations: js.Array[js.Object]
    
    var end_time: js.Date
    
    var reservations_accepted: Double
    
    var reservations_canceled: Double
    
    var reservations_created: Double
    
    var reservations_rejected: Double
    
    var reservations_rescinded: Double
    
    var reservations_timed_out: Double
    
    var start_time: js.Date
    
    var url: String
    
    var workspace_sid: String
  }
  object WorkersCumulativeStatisticsResource {
    
    inline def apply(
      account_sid: String,
      activity_durations: js.Array[js.Object],
      end_time: js.Date,
      reservations_accepted: Double,
      reservations_canceled: Double,
      reservations_created: Double,
      reservations_rejected: Double,
      reservations_rescinded: Double,
      reservations_timed_out: Double,
      start_time: js.Date,
      url: String,
      workspace_sid: String
    ): WorkersCumulativeStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], activity_durations = activity_durations.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], reservations_accepted = reservations_accepted.asInstanceOf[js.Any], reservations_canceled = reservations_canceled.asInstanceOf[js.Any], reservations_created = reservations_created.asInstanceOf[js.Any], reservations_rejected = reservations_rejected.asInstanceOf[js.Any], reservations_rescinded = reservations_rescinded.asInstanceOf[js.Any], reservations_timed_out = reservations_timed_out.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkersCumulativeStatisticsResource]
    }
    
    extension [Self <: WorkersCumulativeStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setActivity_durations(value: js.Array[js.Object]): Self = StObject.set(x, "activity_durations", value.asInstanceOf[js.Any])
      
      inline def setActivity_durationsVarargs(value: js.Object*): Self = StObject.set(x, "activity_durations", js.Array(value*))
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setReservations_accepted(value: Double): Self = StObject.set(x, "reservations_accepted", value.asInstanceOf[js.Any])
      
      inline def setReservations_canceled(value: Double): Self = StObject.set(x, "reservations_canceled", value.asInstanceOf[js.Any])
      
      inline def setReservations_created(value: Double): Self = StObject.set(x, "reservations_created", value.asInstanceOf[js.Any])
      
      inline def setReservations_rejected(value: Double): Self = StObject.set(x, "reservations_rejected", value.asInstanceOf[js.Any])
      
      inline def setReservations_rescinded(value: Double): Self = StObject.set(x, "reservations_rescinded", value.asInstanceOf[js.Any])
      
      inline def setReservations_timed_out(value: Double): Self = StObject.set(x, "reservations_timed_out", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: js.Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkersCumulativeStatisticsSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkersCumulativeStatisticsSolution {
    
    inline def apply(): WorkersCumulativeStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkersCumulativeStatisticsSolution]
    }
    
    extension [Self <: WorkersCumulativeStatisticsSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
