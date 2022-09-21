package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workflowStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow/workflowStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow/workflowStatistics", "WorkflowStatisticsContext")
  @js.native
  open class WorkflowStatisticsContext protected () extends StObject {
    /**
      * Initialize the WorkflowStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the Workflow to fetch
      * @param workflowSid - Returns the list of Tasks that are being controlled by the Workflow with the specified SID value
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, workflowSid: String) = this()
    
    /**
      * fetch a WorkflowStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkflowStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowStatisticsInstance, Any]): js.Promise[WorkflowStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowStatisticsInstance, Any]
    ): js.Promise[WorkflowStatisticsInstance] = js.native
    def fetch(opts: WorkflowStatisticsInstanceFetchOptions): js.Promise[WorkflowStatisticsInstance] = js.native
    def fetch(
      opts: WorkflowStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowStatisticsInstance, Any]
    ): js.Promise[WorkflowStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow/workflowStatistics", "WorkflowStatisticsInstance")
  @js.native
  open class WorkflowStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkflowStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the Workflow
      * @param workflowSid - Returns the list of Tasks that are being controlled by the Workflow with the specified SID value
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkflowStatisticsPayload,
      workspaceSid: String,
      workflowSid: String
    ) = this()
    
    /* private */ var _proxy: WorkflowStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var cumulative: Any = js.native
    
    /**
      * fetch a WorkflowStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkflowStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkflowStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkflowStatisticsInstance] = js.native
    def fetch(opts: WorkflowStatisticsInstanceFetchOptions): js.Promise[WorkflowStatisticsInstance] = js.native
    def fetch(
      opts: WorkflowStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkflowStatisticsInstance] = js.native
    
    var realtime: Any = js.native
    
    var url: String = js.native
    
    var workflowSid: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkflowStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the Workflow
    * @param workflowSid - Returns the list of Tasks that are being controlled by the Workflow with the specified SID value
    */
  inline def WorkflowStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, workflowSid: String): WorkflowStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkflowStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any], workflowSid.asInstanceOf[js.Any])).asInstanceOf[WorkflowStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow/workflowStatistics", "WorkflowStatisticsPage")
  @js.native
  open class WorkflowStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkflowStatisticsPayload, 
          WorkflowStatisticsResource, 
          WorkflowStatisticsInstance
        ] {
    /**
      * Initialize the WorkflowStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkflowStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of WorkflowStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkflowStatisticsPayload): WorkflowStatisticsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property endDate - Only calculate statistics from this date and time and earlier
    * @property minutes - Only calculate statistics since this many minutes in the past
    * @property splitByWaitTime - A comma separated list of values that describes the thresholds to calculate statistics on
    * @property startDate - Only calculate statistics from on or after this date
    * @property taskChannel - Only calculate real-time statistics on this TaskChannel.
    */
  trait WorkflowStatisticsInstanceFetchOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var splitByWaitTime: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object WorkflowStatisticsInstanceFetchOptions {
    
    inline def apply(): WorkflowStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkflowStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: WorkflowStatisticsInstanceFetchOptions](x: Self) {
      
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
  trait WorkflowStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkflowStatisticsContext = js.native
    
    /**
      * Constructs a workflow_statistics
      */
    def get(): WorkflowStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait WorkflowStatisticsPayload
    extends StObject
       with WorkflowStatisticsResource
       with TwilioResponsePayload
  object WorkflowStatisticsPayload {
    
    inline def apply(
      account_sid: String,
      cumulative: js.Object,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      realtime: js.Object,
      uri: String,
      url: String,
      workflow_sid: String,
      workspace_sid: String
    ): WorkflowStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_sid = workflow_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkflowStatisticsPayload]
    }
  }
  
  trait WorkflowStatisticsResource extends StObject {
    
    var account_sid: String
    
    var cumulative: js.Object
    
    var realtime: js.Object
    
    var url: String
    
    var workflow_sid: String
    
    var workspace_sid: String
  }
  object WorkflowStatisticsResource {
    
    inline def apply(
      account_sid: String,
      cumulative: js.Object,
      realtime: js.Object,
      url: String,
      workflow_sid: String,
      workspace_sid: String
    ): WorkflowStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_sid = workflow_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkflowStatisticsResource]
    }
    
    extension [Self <: WorkflowStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCumulative(value: js.Object): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      inline def setRealtime(value: js.Object): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkflow_sid(value: String): Self = StObject.set(x, "workflow_sid", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkflowStatisticsSolution extends StObject {
    
    var workflowSid: js.UndefOr[String] = js.undefined
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkflowStatisticsSolution {
    
    inline def apply(): WorkflowStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkflowStatisticsSolution]
    }
    
    extension [Self <: WorkflowStatisticsSolution](x: Self) {
      
      inline def setWorkflowSid(value: String): Self = StObject.set(x, "workflowSid", value.asInstanceOf[js.Any])
      
      inline def setWorkflowSidUndefined: Self = StObject.set(x, "workflowSid", js.undefined)
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
