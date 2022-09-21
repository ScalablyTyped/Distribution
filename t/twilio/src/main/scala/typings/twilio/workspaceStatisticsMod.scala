package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceStatistics", "WorkspaceStatisticsContext")
  @js.native
  open class WorkspaceStatisticsContext protected () extends StObject {
    /**
      * Initialize the WorkspaceStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String) = this()
    
    /**
      * fetch a WorkspaceStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkspaceStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceStatisticsInstance, Any]): js.Promise[WorkspaceStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceStatisticsInstance, Any]
    ): js.Promise[WorkspaceStatisticsInstance] = js.native
    def fetch(opts: WorkspaceStatisticsInstanceFetchOptions): js.Promise[WorkspaceStatisticsInstance] = js.native
    def fetch(
      opts: WorkspaceStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkspaceStatisticsInstance, Any]
    ): js.Promise[WorkspaceStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceStatistics", "WorkspaceStatisticsInstance")
  @js.native
  open class WorkspaceStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkspaceStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkspaceStatisticsPayload,
      workspaceSid: String
    ) = this()
    
    /* private */ var _proxy: WorkspaceStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var cumulative: Any = js.native
    
    /**
      * fetch a WorkspaceStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkspaceStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkspaceStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkspaceStatisticsInstance] = js.native
    def fetch(opts: WorkspaceStatisticsInstanceFetchOptions): js.Promise[WorkspaceStatisticsInstance] = js.native
    def fetch(
      opts: WorkspaceStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkspaceStatisticsInstance] = js.native
    
    var realtime: Any = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkspaceStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace
    */
  inline def WorkspaceStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): WorkspaceStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkspaceStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[WorkspaceStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workspaceStatistics", "WorkspaceStatisticsPage")
  @js.native
  open class WorkspaceStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkspaceStatisticsPayload, 
          WorkspaceStatisticsResource, 
          WorkspaceStatisticsInstance
        ] {
    /**
      * Initialize the WorkspaceStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkspaceStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of WorkspaceStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkspaceStatisticsPayload): WorkspaceStatisticsInstance = js.native
    
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
    * @property taskChannel - Only calculate statistics on this TaskChannel.
    */
  trait WorkspaceStatisticsInstanceFetchOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var splitByWaitTime: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object WorkspaceStatisticsInstanceFetchOptions {
    
    inline def apply(): WorkspaceStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: WorkspaceStatisticsInstanceFetchOptions](x: Self) {
      
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
  trait WorkspaceStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkspaceStatisticsContext = js.native
    
    /**
      * Constructs a workspace_statistics
      */
    def get(): WorkspaceStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait WorkspaceStatisticsPayload
    extends StObject
       with WorkspaceStatisticsResource
       with TwilioResponsePayload
  object WorkspaceStatisticsPayload {
    
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
      workspace_sid: String
    ): WorkspaceStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceStatisticsPayload]
    }
  }
  
  trait WorkspaceStatisticsResource extends StObject {
    
    var account_sid: String
    
    var cumulative: js.Object
    
    var realtime: js.Object
    
    var url: String
    
    var workspace_sid: String
  }
  object WorkspaceStatisticsResource {
    
    inline def apply(
      account_sid: String,
      cumulative: js.Object,
      realtime: js.Object,
      url: String,
      workspace_sid: String
    ): WorkspaceStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceStatisticsResource]
    }
    
    extension [Self <: WorkspaceStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCumulative(value: js.Object): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      inline def setRealtime(value: js.Object): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkspaceStatisticsSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkspaceStatisticsSolution {
    
    inline def apply(): WorkspaceStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceStatisticsSolution]
    }
    
    extension [Self <: WorkspaceStatisticsSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
