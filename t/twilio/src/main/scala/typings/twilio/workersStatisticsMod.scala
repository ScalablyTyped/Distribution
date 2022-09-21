package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workersStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersStatistics", "WorkersStatisticsContext")
  @js.native
  open class WorkersStatisticsContext protected () extends StObject {
    /**
      * Initialize the WorkersStatisticsContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the Worker to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String) = this()
    
    /**
      * fetch a WorkersStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkersStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkersStatisticsInstance, Any]): js.Promise[WorkersStatisticsInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkersStatisticsInstance, Any]
    ): js.Promise[WorkersStatisticsInstance] = js.native
    def fetch(opts: WorkersStatisticsInstanceFetchOptions): js.Promise[WorkersStatisticsInstance] = js.native
    def fetch(
      opts: WorkersStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkersStatisticsInstance, Any]
    ): js.Promise[WorkersStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersStatistics", "WorkersStatisticsInstance")
  @js.native
  open class WorkersStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkersStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the Worker
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, payload: WorkersStatisticsPayload, workspaceSid: String) = this()
    
    /* private */ var _proxy: WorkersStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var cumulative: Any = js.native
    
    /**
      * fetch a WorkersStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkersStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkersStatisticsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkersStatisticsInstance] = js.native
    def fetch(opts: WorkersStatisticsInstanceFetchOptions): js.Promise[WorkersStatisticsInstance] = js.native
    def fetch(
      opts: WorkersStatisticsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkersStatisticsInstance] = js.native
    
    var realtime: Any = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkersStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the Worker
    */
  inline def WorkersStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): WorkersStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkersStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[WorkersStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/workersStatistics", "WorkersStatisticsPage")
  @js.native
  open class WorkersStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          WorkersStatisticsPayload, 
          WorkersStatisticsResource, 
          WorkersStatisticsInstance
        ] {
    /**
      * Initialize the WorkersStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkersStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of WorkersStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkersStatisticsPayload): WorkersStatisticsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property endDate - Only calculate statistics from this date and time and earlier
    * @property friendlyName - Only include Workers with `friendly_name` values that match this parameter
    * @property minutes - Only calculate statistics since this many minutes in the past
    * @property startDate - Only calculate statistics from on or after this date
    * @property taskChannel - Only calculate statistics on this TaskChannel
    * @property taskQueueName - The friendly_name of the TaskQueue for which to fetch Worker statistics
    * @property taskQueueSid - The SID of the TaskQueue for which to fetch Worker statistics
    */
  trait WorkersStatisticsInstanceFetchOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
    
    var taskQueueName: js.UndefOr[String] = js.undefined
    
    var taskQueueSid: js.UndefOr[String] = js.undefined
  }
  object WorkersStatisticsInstanceFetchOptions {
    
    inline def apply(): WorkersStatisticsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkersStatisticsInstanceFetchOptions]
    }
    
    extension [Self <: WorkersStatisticsInstanceFetchOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
      
      inline def setTaskQueueName(value: String): Self = StObject.set(x, "taskQueueName", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueNameUndefined: Self = StObject.set(x, "taskQueueName", js.undefined)
      
      inline def setTaskQueueSid(value: String): Self = StObject.set(x, "taskQueueSid", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueSidUndefined: Self = StObject.set(x, "taskQueueSid", js.undefined)
    }
  }
  
  @js.native
  trait WorkersStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkersStatisticsContext = js.native
    
    /**
      * Constructs a workers_statistics
      */
    def get(): WorkersStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait WorkersStatisticsPayload
    extends StObject
       with WorkersStatisticsResource
       with TwilioResponsePayload
  object WorkersStatisticsPayload {
    
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
    ): WorkersStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkersStatisticsPayload]
    }
  }
  
  trait WorkersStatisticsResource extends StObject {
    
    var account_sid: String
    
    var cumulative: js.Object
    
    var realtime: js.Object
    
    var url: String
    
    var workspace_sid: String
  }
  object WorkersStatisticsResource {
    
    inline def apply(
      account_sid: String,
      cumulative: js.Object,
      realtime: js.Object,
      url: String,
      workspace_sid: String
    ): WorkersStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkersStatisticsResource]
    }
    
    extension [Self <: WorkersStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCumulative(value: js.Object): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      inline def setRealtime(value: js.Object): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkersStatisticsSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkersStatisticsSolution {
    
    inline def apply(): WorkersStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkersStatisticsSolution]
    }
    
    extension [Self <: WorkersStatisticsSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
