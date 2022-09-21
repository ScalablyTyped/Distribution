package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceRealTimeStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceRealTimeStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceRealTimeStatistics", "WorkspaceRealTimeStatisticsContext")
  @js.native
  open class WorkspaceRealTimeStatisticsContext protected () extends StObject {
    /**
      * Initialize the WorkspaceRealTimeStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String) = this()
    
    /**
      * fetch a WorkspaceRealTimeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkspaceRealTimeStatisticsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceRealTimeStatisticsInstance, Any]
    ): js.Promise[WorkspaceRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceRealTimeStatisticsInstance, Any]
    ): js.Promise[WorkspaceRealTimeStatisticsInstance] = js.native
    def fetch(opts: WorkspaceRealTimeStatisticsInstanceFetchOptions): js.Promise[WorkspaceRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: WorkspaceRealTimeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceRealTimeStatisticsInstance, Any]
    ): js.Promise[WorkspaceRealTimeStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceRealTimeStatistics", "WorkspaceRealTimeStatisticsInstance")
  @js.native
  open class WorkspaceRealTimeStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkspaceRealTimeStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkspaceRealTimeStatisticsPayload,
      workspaceSid: String
    ) = this()
    
    /* private */ var _proxy: WorkspaceRealTimeStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var activityStatistics: js.Array[js.Object] = js.native
    
    /**
      * fetch a WorkspaceRealTimeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkspaceRealTimeStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkspaceRealTimeStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkspaceRealTimeStatisticsInstance] = js.native
    def fetch(opts: WorkspaceRealTimeStatisticsInstanceFetchOptions): js.Promise[WorkspaceRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: WorkspaceRealTimeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkspaceRealTimeStatisticsInstance] = js.native
    
    var longestTaskWaitingAge: Double = js.native
    
    var longestTaskWaitingSid: String = js.native
    
    var tasksByPriority: Any = js.native
    
    var tasksByStatus: Any = js.native
    
    var totalTasks: Double = js.native
    
    var totalWorkers: Double = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkspaceRealTimeStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace
    */
  inline def WorkspaceRealTimeStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): WorkspaceRealTimeStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkspaceRealTimeStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[WorkspaceRealTimeStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceRealTimeStatistics", "WorkspaceRealTimeStatisticsPage")
  @js.native
  open class WorkspaceRealTimeStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkspaceRealTimeStatisticsPayload, 
          WorkspaceRealTimeStatisticsResource, 
          WorkspaceRealTimeStatisticsInstance
        ] {
    /**
      * Initialize the WorkspaceRealTimeStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkspaceRealTimeStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of WorkspaceRealTimeStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkspaceRealTimeStatisticsPayload): WorkspaceRealTimeStatisticsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property taskChannel - Only calculate real-time statistics on this TaskChannel
    */
  trait WorkspaceRealTimeStatisticsInstanceFetchOptions extends StObject {
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object WorkspaceRealTimeStatisticsInstanceFetchOptions {
    
    inline def apply(): WorkspaceRealTimeStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceRealTimeStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: WorkspaceRealTimeStatisticsInstanceFetchOptions](x: Self) {
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
    }
  }
  
  @js.native
  trait WorkspaceRealTimeStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkspaceRealTimeStatisticsContext = js.native
    
    /**
      * Constructs a workspace_real_time_statistics
      */
    def get(): WorkspaceRealTimeStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait WorkspaceRealTimeStatisticsPayload
    extends StObject
       with WorkspaceRealTimeStatisticsResource
       with TwilioResponsePayload
  object WorkspaceRealTimeStatisticsPayload {
    
    inline def apply(
      account_sid: String,
      activity_statistics: js.Array[js.Object],
      first_page_uri: String,
      longest_task_waiting_age: Double,
      longest_task_waiting_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      tasks_by_priority: js.Object,
      tasks_by_status: js.Object,
      total_tasks: Double,
      total_workers: Double,
      uri: String,
      url: String,
      workspace_sid: String
    ): WorkspaceRealTimeStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], activity_statistics = activity_statistics.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], longest_task_waiting_age = longest_task_waiting_age.asInstanceOf[js.Any], longest_task_waiting_sid = longest_task_waiting_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], tasks_by_priority = tasks_by_priority.asInstanceOf[js.Any], tasks_by_status = tasks_by_status.asInstanceOf[js.Any], total_tasks = total_tasks.asInstanceOf[js.Any], total_workers = total_workers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceRealTimeStatisticsPayload]
    }
  }
  
  trait WorkspaceRealTimeStatisticsResource extends StObject {
    
    var account_sid: String
    
    var activity_statistics: js.Array[js.Object]
    
    var longest_task_waiting_age: Double
    
    var longest_task_waiting_sid: String
    
    var tasks_by_priority: js.Object
    
    var tasks_by_status: js.Object
    
    var total_tasks: Double
    
    var total_workers: Double
    
    var url: String
    
    var workspace_sid: String
  }
  object WorkspaceRealTimeStatisticsResource {
    
    inline def apply(
      account_sid: String,
      activity_statistics: js.Array[js.Object],
      longest_task_waiting_age: Double,
      longest_task_waiting_sid: String,
      tasks_by_priority: js.Object,
      tasks_by_status: js.Object,
      total_tasks: Double,
      total_workers: Double,
      url: String,
      workspace_sid: String
    ): WorkspaceRealTimeStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], activity_statistics = activity_statistics.asInstanceOf[js.Any], longest_task_waiting_age = longest_task_waiting_age.asInstanceOf[js.Any], longest_task_waiting_sid = longest_task_waiting_sid.asInstanceOf[js.Any], tasks_by_priority = tasks_by_priority.asInstanceOf[js.Any], tasks_by_status = tasks_by_status.asInstanceOf[js.Any], total_tasks = total_tasks.asInstanceOf[js.Any], total_workers = total_workers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceRealTimeStatisticsResource]
    }
    
    extension [Self <: WorkspaceRealTimeStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setActivity_statistics(value: js.Array[js.Object]): Self = StObject.set(x, "activity_statistics", value.asInstanceOf[js.Any])
      
      inline def setActivity_statisticsVarargs(value: js.Object*): Self = StObject.set(x, "activity_statistics", js.Array(value*))
      
      inline def setLongest_task_waiting_age(value: Double): Self = StObject.set(x, "longest_task_waiting_age", value.asInstanceOf[js.Any])
      
      inline def setLongest_task_waiting_sid(value: String): Self = StObject.set(x, "longest_task_waiting_sid", value.asInstanceOf[js.Any])
      
      inline def setTasks_by_priority(value: js.Object): Self = StObject.set(x, "tasks_by_priority", value.asInstanceOf[js.Any])
      
      inline def setTasks_by_status(value: js.Object): Self = StObject.set(x, "tasks_by_status", value.asInstanceOf[js.Any])
      
      inline def setTotal_tasks(value: Double): Self = StObject.set(x, "total_tasks", value.asInstanceOf[js.Any])
      
      inline def setTotal_workers(value: Double): Self = StObject.set(x, "total_workers", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkspaceRealTimeStatisticsSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkspaceRealTimeStatisticsSolution {
    
    inline def apply(): WorkspaceRealTimeStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceRealTimeStatisticsSolution]
    }
    
    extension [Self <: WorkspaceRealTimeStatisticsSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
