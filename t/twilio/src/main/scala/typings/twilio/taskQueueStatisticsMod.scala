package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskQueueStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueStatistics", "TaskQueueStatisticsContext")
  @js.native
  open class TaskQueueStatisticsContext protected () extends StObject {
    /**
      * Initialize the TaskQueueStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the TaskQueue to fetch
      * @param taskQueueSid - The SID of the TaskQueue for which to fetch statistics
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, taskQueueSid: String) = this()
    
    /**
      * fetch a TaskQueueStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskQueueStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueStatisticsInstance, Any]): js.Promise[TaskQueueStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueStatisticsInstance, Any]
    ): js.Promise[TaskQueueStatisticsInstance] = js.native
    def fetch(opts: TaskQueueStatisticsInstanceFetchOptions): js.Promise[TaskQueueStatisticsInstance] = js.native
    def fetch(
      opts: TaskQueueStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueueStatisticsInstance, Any]
    ): js.Promise[TaskQueueStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueStatistics", "TaskQueueStatisticsInstance")
  @js.native
  open class TaskQueueStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the TaskQueueStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the TaskQueue
      * @param taskQueueSid - The SID of the TaskQueue from which these statistics were calculated
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: TaskQueueStatisticsPayload,
      workspaceSid: String,
      taskQueueSid: String
    ) = this()
    
    /* private */ var _proxy: TaskQueueStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var cumulative: Any = js.native
    
    /**
      * fetch a TaskQueueStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskQueueStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskQueueStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskQueueStatisticsInstance] = js.native
    def fetch(opts: TaskQueueStatisticsInstanceFetchOptions): js.Promise[TaskQueueStatisticsInstance] = js.native
    def fetch(
      opts: TaskQueueStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TaskQueueStatisticsInstance] = js.native
    
    var realtime: Any = js.native
    
    var taskQueueSid: String = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the TaskQueueStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the TaskQueue
    * @param taskQueueSid - The SID of the TaskQueue from which these statistics were calculated
    */
  inline def TaskQueueStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, taskQueueSid: String): TaskQueueStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TaskQueueStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any], taskQueueSid.asInstanceOf[js.Any])).asInstanceOf[TaskQueueStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueueStatistics", "TaskQueueStatisticsPage")
  @js.native
  open class TaskQueueStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          TaskQueueStatisticsPayload, 
          TaskQueueStatisticsResource, 
          TaskQueueStatisticsInstance
        ] {
    /**
      * Initialize the TaskQueueStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TaskQueueStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of TaskQueueStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskQueueStatisticsPayload): TaskQueueStatisticsInstance = js.native
    
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
    * @property splitByWaitTime - A comma separated list of values that describes the thresholds to calculate statistics on
    * @property startDate - Only calculate statistics from on or after this date
    * @property taskChannel - Only calculate real-time and cumulative statistics for the specified TaskChannel
    */
  trait TaskQueueStatisticsInstanceFetchOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var splitByWaitTime: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object TaskQueueStatisticsInstanceFetchOptions {
    
    inline def apply(): TaskQueueStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: TaskQueueStatisticsInstanceFetchOptions](x: Self) {
      
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
  trait TaskQueueStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TaskQueueStatisticsContext = js.native
    
    /**
      * Constructs a task_queue_statistics
      */
    def get(): TaskQueueStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait TaskQueueStatisticsPayload
    extends StObject
       with TaskQueueStatisticsResource
       with TwilioResponsePayload
  object TaskQueueStatisticsPayload {
    
    inline def apply(
      account_sid: String,
      cumulative: js.Object,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      realtime: js.Object,
      task_queue_sid: String,
      uri: String,
      url: String,
      workspace_sid: String
    ): TaskQueueStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], task_queue_sid = task_queue_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueueStatisticsPayload]
    }
  }
  
  trait TaskQueueStatisticsResource extends StObject {
    
    var account_sid: String
    
    var cumulative: js.Object
    
    var realtime: js.Object
    
    var task_queue_sid: String
    
    var url: String
    
    var workspace_sid: String
  }
  object TaskQueueStatisticsResource {
    
    inline def apply(
      account_sid: String,
      cumulative: js.Object,
      realtime: js.Object,
      task_queue_sid: String,
      url: String,
      workspace_sid: String
    ): TaskQueueStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], task_queue_sid = task_queue_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueueStatisticsResource]
    }
    
    extension [Self <: TaskQueueStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCumulative(value: js.Object): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      inline def setRealtime(value: js.Object): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      inline def setTask_queue_sid(value: String): Self = StObject.set(x, "task_queue_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskQueueStatisticsSolution extends StObject {
    
    var taskQueueSid: js.UndefOr[String] = js.undefined
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object TaskQueueStatisticsSolution {
    
    inline def apply(): TaskQueueStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueueStatisticsSolution]
    }
    
    extension [Self <: TaskQueueStatisticsSolution](x: Self) {
      
      inline def setTaskQueueSid(value: String): Self = StObject.set(x, "taskQueueSid", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueSidUndefined: Self = StObject.set(x, "taskQueueSid", js.undefined)
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
