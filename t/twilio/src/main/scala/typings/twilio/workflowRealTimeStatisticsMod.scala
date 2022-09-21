package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workflowRealTimeStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow/workflowRealTimeStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow/workflowRealTimeStatistics", "WorkflowRealTimeStatisticsContext")
  @js.native
  open class WorkflowRealTimeStatisticsContext protected () extends StObject {
    /**
      * Initialize the WorkflowRealTimeStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the Workflow to fetch
      * @param workflowSid - Returns the list of Tasks that are being controlled by the Workflow with the specified SID value
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, workflowSid: String) = this()
    
    /**
      * fetch a WorkflowRealTimeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkflowRealTimeStatisticsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowRealTimeStatisticsInstance, Any]
    ): js.Promise[WorkflowRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowRealTimeStatisticsInstance, Any]
    ): js.Promise[WorkflowRealTimeStatisticsInstance] = js.native
    def fetch(opts: WorkflowRealTimeStatisticsInstanceFetchOptions): js.Promise[WorkflowRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: WorkflowRealTimeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowRealTimeStatisticsInstance, Any]
    ): js.Promise[WorkflowRealTimeStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow/workflowRealTimeStatistics", "WorkflowRealTimeStatisticsInstance")
  @js.native
  open class WorkflowRealTimeStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkflowRealTimeStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the Workflow.
      * @param workflowSid - Returns the list of Tasks that are being controlled by the Workflow with the specified SID value
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkflowRealTimeStatisticsPayload,
      workspaceSid: String,
      workflowSid: String
    ) = this()
    
    /* private */ var _proxy: WorkflowRealTimeStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * fetch a WorkflowRealTimeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkflowRealTimeStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkflowRealTimeStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkflowRealTimeStatisticsInstance] = js.native
    def fetch(opts: WorkflowRealTimeStatisticsInstanceFetchOptions): js.Promise[WorkflowRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: WorkflowRealTimeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkflowRealTimeStatisticsInstance] = js.native
    
    var longestTaskWaitingAge: Double = js.native
    
    var longestTaskWaitingSid: String = js.native
    
    var tasksByPriority: Any = js.native
    
    var tasksByStatus: Any = js.native
    
    var totalTasks: Double = js.native
    
    var url: String = js.native
    
    var workflowSid: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkflowRealTimeStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the Workflow.
    * @param workflowSid - Returns the list of Tasks that are being controlled by the Workflow with the specified SID value
    */
  inline def WorkflowRealTimeStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, workflowSid: String): WorkflowRealTimeStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkflowRealTimeStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any], workflowSid.asInstanceOf[js.Any])).asInstanceOf[WorkflowRealTimeStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow/workflowRealTimeStatistics", "WorkflowRealTimeStatisticsPage")
  @js.native
  open class WorkflowRealTimeStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkflowRealTimeStatisticsPayload, 
          WorkflowRealTimeStatisticsResource, 
          WorkflowRealTimeStatisticsInstance
        ] {
    /**
      * Initialize the WorkflowRealTimeStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkflowRealTimeStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of WorkflowRealTimeStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkflowRealTimeStatisticsPayload): WorkflowRealTimeStatisticsInstance = js.native
    
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
  trait WorkflowRealTimeStatisticsInstanceFetchOptions extends StObject {
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object WorkflowRealTimeStatisticsInstanceFetchOptions {
    
    inline def apply(): WorkflowRealTimeStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkflowRealTimeStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: WorkflowRealTimeStatisticsInstanceFetchOptions](x: Self) {
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
    }
  }
  
  @js.native
  trait WorkflowRealTimeStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkflowRealTimeStatisticsContext = js.native
    
    /**
      * Constructs a workflow_real_time_statistics
      */
    def get(): WorkflowRealTimeStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait WorkflowRealTimeStatisticsPayload
    extends StObject
       with WorkflowRealTimeStatisticsResource
       with TwilioResponsePayload
  object WorkflowRealTimeStatisticsPayload {
    
    inline def apply(
      account_sid: String,
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
      uri: String,
      url: String,
      workflow_sid: String,
      workspace_sid: String
    ): WorkflowRealTimeStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], longest_task_waiting_age = longest_task_waiting_age.asInstanceOf[js.Any], longest_task_waiting_sid = longest_task_waiting_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], tasks_by_priority = tasks_by_priority.asInstanceOf[js.Any], tasks_by_status = tasks_by_status.asInstanceOf[js.Any], total_tasks = total_tasks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_sid = workflow_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkflowRealTimeStatisticsPayload]
    }
  }
  
  trait WorkflowRealTimeStatisticsResource extends StObject {
    
    var account_sid: String
    
    var longest_task_waiting_age: Double
    
    var longest_task_waiting_sid: String
    
    var tasks_by_priority: js.Object
    
    var tasks_by_status: js.Object
    
    var total_tasks: Double
    
    var url: String
    
    var workflow_sid: String
    
    var workspace_sid: String
  }
  object WorkflowRealTimeStatisticsResource {
    
    inline def apply(
      account_sid: String,
      longest_task_waiting_age: Double,
      longest_task_waiting_sid: String,
      tasks_by_priority: js.Object,
      tasks_by_status: js.Object,
      total_tasks: Double,
      url: String,
      workflow_sid: String,
      workspace_sid: String
    ): WorkflowRealTimeStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], longest_task_waiting_age = longest_task_waiting_age.asInstanceOf[js.Any], longest_task_waiting_sid = longest_task_waiting_sid.asInstanceOf[js.Any], tasks_by_priority = tasks_by_priority.asInstanceOf[js.Any], tasks_by_status = tasks_by_status.asInstanceOf[js.Any], total_tasks = total_tasks.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_sid = workflow_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkflowRealTimeStatisticsResource]
    }
    
    extension [Self <: WorkflowRealTimeStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setLongest_task_waiting_age(value: Double): Self = StObject.set(x, "longest_task_waiting_age", value.asInstanceOf[js.Any])
      
      inline def setLongest_task_waiting_sid(value: String): Self = StObject.set(x, "longest_task_waiting_sid", value.asInstanceOf[js.Any])
      
      inline def setTasks_by_priority(value: js.Object): Self = StObject.set(x, "tasks_by_priority", value.asInstanceOf[js.Any])
      
      inline def setTasks_by_status(value: js.Object): Self = StObject.set(x, "tasks_by_status", value.asInstanceOf[js.Any])
      
      inline def setTotal_tasks(value: Double): Self = StObject.set(x, "total_tasks", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkflow_sid(value: String): Self = StObject.set(x, "workflow_sid", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkflowRealTimeStatisticsSolution extends StObject {
    
    var workflowSid: js.UndefOr[String] = js.undefined
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkflowRealTimeStatisticsSolution {
    
    inline def apply(): WorkflowRealTimeStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkflowRealTimeStatisticsSolution]
    }
    
    extension [Self <: WorkflowRealTimeStatisticsSolution](x: Self) {
      
      inline def setWorkflowSid(value: String): Self = StObject.set(x, "workflowSid", value.asInstanceOf[js.Any])
      
      inline def setWorkflowSidUndefined: Self = StObject.set(x, "workflowSid", js.undefined)
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
