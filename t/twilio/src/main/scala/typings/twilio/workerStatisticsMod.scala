package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workerStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workerStatistics", "WorkerStatisticsContext")
  @js.native
  open class WorkerStatisticsContext protected () extends StObject {
    /**
      * Initialize the WorkerStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the WorkerChannel to fetch
      * @param workerSid - The SID of the Worker with the WorkerChannel to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, workerSid: String) = this()
    
    /**
      * fetch a WorkerStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkerStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerStatisticsInstance, Any]): js.Promise[WorkerStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerStatisticsInstance, Any]
    ): js.Promise[WorkerStatisticsInstance] = js.native
    def fetch(opts: WorkerStatisticsInstanceFetchOptions): js.Promise[WorkerStatisticsInstance] = js.native
    def fetch(
      opts: WorkerStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerStatisticsInstance, Any]
    ): js.Promise[WorkerStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workerStatistics", "WorkerStatisticsInstance")
  @js.native
  open class WorkerStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkerStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the WorkerChannel
      * @param workerSid - The SID of the Worker that contains the WorkerChannel
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkerStatisticsPayload,
      workspaceSid: String,
      workerSid: String
    ) = this()
    
    /* private */ var _proxy: WorkerStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var cumulative: Any = js.native
    
    /**
      * fetch a WorkerStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkerStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkerStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkerStatisticsInstance] = js.native
    def fetch(opts: WorkerStatisticsInstanceFetchOptions): js.Promise[WorkerStatisticsInstance] = js.native
    def fetch(
      opts: WorkerStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkerStatisticsInstance] = js.native
    
    var url: String = js.native
    
    var workerSid: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkerStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the WorkerChannel
    * @param workerSid - The SID of the Worker that contains the WorkerChannel
    */
  inline def WorkerStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, workerSid: String): WorkerStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkerStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any])).asInstanceOf[WorkerStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workerStatistics", "WorkerStatisticsPage")
  @js.native
  open class WorkerStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkerStatisticsPayload, 
          WorkerStatisticsResource, 
          WorkerStatisticsInstance
        ] {
    /**
      * Initialize the WorkerStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkerStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of WorkerStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkerStatisticsPayload): WorkerStatisticsInstance = js.native
    
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
    * @property startDate - Only calculate statistics from on or after this date
    * @property taskChannel - Only calculate statistics on this TaskChannel
    */
  trait WorkerStatisticsInstanceFetchOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object WorkerStatisticsInstanceFetchOptions {
    
    inline def apply(): WorkerStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: WorkerStatisticsInstanceFetchOptions](x: Self) {
      
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
  trait WorkerStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkerStatisticsContext = js.native
    
    /**
      * Constructs a worker_statistics
      */
    def get(): WorkerStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait WorkerStatisticsPayload
    extends StObject
       with WorkerStatisticsResource
       with TwilioResponsePayload
  object WorkerStatisticsPayload {
    
    inline def apply(
      account_sid: String,
      cumulative: js.Object,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String,
      worker_sid: String,
      workspace_sid: String
    ): WorkerStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], worker_sid = worker_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerStatisticsPayload]
    }
  }
  
  trait WorkerStatisticsResource extends StObject {
    
    var account_sid: String
    
    var cumulative: js.Object
    
    var url: String
    
    var worker_sid: String
    
    var workspace_sid: String
  }
  object WorkerStatisticsResource {
    
    inline def apply(account_sid: String, cumulative: js.Object, url: String, worker_sid: String, workspace_sid: String): WorkerStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], worker_sid = worker_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerStatisticsResource]
    }
    
    extension [Self <: WorkerStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCumulative(value: js.Object): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorker_sid(value: String): Self = StObject.set(x, "worker_sid", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerStatisticsSolution extends StObject {
    
    var workerSid: js.UndefOr[String] = js.undefined
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkerStatisticsSolution {
    
    inline def apply(): WorkerStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerStatisticsSolution]
    }
    
    extension [Self <: WorkerStatisticsSolution](x: Self) {
      
      inline def setWorkerSid(value: String): Self = StObject.set(x, "workerSid", value.asInstanceOf[js.Any])
      
      inline def setWorkerSidUndefined: Self = StObject.set(x, "workerSid", js.undefined)
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
