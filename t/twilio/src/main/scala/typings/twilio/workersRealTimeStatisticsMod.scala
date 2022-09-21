package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workersRealTimeStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersRealTimeStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersRealTimeStatistics", "WorkersRealTimeStatisticsContext")
  @js.native
  open class WorkersRealTimeStatisticsContext protected () extends StObject {
    /**
      * Initialize the WorkersRealTimeStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the resource to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String) = this()
    
    /**
      * fetch a WorkersRealTimeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkersRealTimeStatisticsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkersRealTimeStatisticsInstance, Any]
    ): js.Promise[WorkersRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkersRealTimeStatisticsInstance, Any]
    ): js.Promise[WorkersRealTimeStatisticsInstance] = js.native
    def fetch(opts: WorkersRealTimeStatisticsInstanceFetchOptions): js.Promise[WorkersRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: WorkersRealTimeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkersRealTimeStatisticsInstance, Any]
    ): js.Promise[WorkersRealTimeStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersRealTimeStatistics", "WorkersRealTimeStatisticsInstance")
  @js.native
  open class WorkersRealTimeStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkersRealTimeStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the Workers
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkersRealTimeStatisticsPayload,
      workspaceSid: String
    ) = this()
    
    /* private */ var _proxy: WorkersRealTimeStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var activityStatistics: js.Array[js.Object] = js.native
    
    /**
      * fetch a WorkersRealTimeStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkersRealTimeStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkersRealTimeStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkersRealTimeStatisticsInstance] = js.native
    def fetch(opts: WorkersRealTimeStatisticsInstanceFetchOptions): js.Promise[WorkersRealTimeStatisticsInstance] = js.native
    def fetch(
      opts: WorkersRealTimeStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkersRealTimeStatisticsInstance] = js.native
    
    var totalWorkers: Double = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkersRealTimeStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the Workers
    */
  inline def WorkersRealTimeStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): WorkersRealTimeStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkersRealTimeStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[WorkersRealTimeStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersRealTimeStatistics", "WorkersRealTimeStatisticsPage")
  @js.native
  open class WorkersRealTimeStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkersRealTimeStatisticsPayload, 
          WorkersRealTimeStatisticsResource, 
          WorkersRealTimeStatisticsInstance
        ] {
    /**
      * Initialize the WorkersRealTimeStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkersRealTimeStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of WorkersRealTimeStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkersRealTimeStatisticsPayload): WorkersRealTimeStatisticsInstance = js.native
    
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
  trait WorkersRealTimeStatisticsInstanceFetchOptions extends StObject {
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object WorkersRealTimeStatisticsInstanceFetchOptions {
    
    inline def apply(): WorkersRealTimeStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkersRealTimeStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: WorkersRealTimeStatisticsInstanceFetchOptions](x: Self) {
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
    }
  }
  
  @js.native
  trait WorkersRealTimeStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkersRealTimeStatisticsContext = js.native
    
    /**
      * Constructs a workers_real_time_statistics
      */
    def get(): WorkersRealTimeStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait WorkersRealTimeStatisticsPayload
    extends StObject
       with WorkersRealTimeStatisticsResource
       with TwilioResponsePayload
  object WorkersRealTimeStatisticsPayload {
    
    inline def apply(
      account_sid: String,
      activity_statistics: js.Array[js.Object],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      total_workers: Double,
      uri: String,
      url: String,
      workspace_sid: String
    ): WorkersRealTimeStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], activity_statistics = activity_statistics.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], total_workers = total_workers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkersRealTimeStatisticsPayload]
    }
  }
  
  trait WorkersRealTimeStatisticsResource extends StObject {
    
    var account_sid: String
    
    var activity_statistics: js.Array[js.Object]
    
    var total_workers: Double
    
    var url: String
    
    var workspace_sid: String
  }
  object WorkersRealTimeStatisticsResource {
    
    inline def apply(
      account_sid: String,
      activity_statistics: js.Array[js.Object],
      total_workers: Double,
      url: String,
      workspace_sid: String
    ): WorkersRealTimeStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], activity_statistics = activity_statistics.asInstanceOf[js.Any], total_workers = total_workers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkersRealTimeStatisticsResource]
    }
    
    extension [Self <: WorkersRealTimeStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setActivity_statistics(value: js.Array[js.Object]): Self = StObject.set(x, "activity_statistics", value.asInstanceOf[js.Any])
      
      inline def setActivity_statisticsVarargs(value: js.Object*): Self = StObject.set(x, "activity_statistics", js.Array(value*))
      
      inline def setTotal_workers(value: Double): Self = StObject.set(x, "total_workers", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkersRealTimeStatisticsSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkersRealTimeStatisticsSolution {
    
    inline def apply(): WorkersRealTimeStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkersRealTimeStatisticsSolution]
    }
    
    extension [Self <: WorkersRealTimeStatisticsSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
