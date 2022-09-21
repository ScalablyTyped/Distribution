package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskQueuesStatisticsMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueuesStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueuesStatistics", "TaskQueuesStatisticsInstance")
  @js.native
  open class TaskQueuesStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the TaskQueuesStatisticsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the TaskQueue
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: TaskQueuesStatisticsPayload,
      workspaceSid: String
    ) = this()
    
    var accountSid: String = js.native
    
    var cumulative: Any = js.native
    
    var realtime: Any = js.native
    
    var taskQueueSid: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the TaskQueuesStatisticsList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the TaskQueue
    */
  inline def TaskQueuesStatisticsList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): TaskQueuesStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TaskQueuesStatisticsList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[TaskQueuesStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/taskQueue/taskQueuesStatistics", "TaskQueuesStatisticsPage")
  @js.native
  open class TaskQueuesStatisticsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          TaskQueuesStatisticsPayload, 
          TaskQueuesStatisticsResource, 
          TaskQueuesStatisticsInstance
        ] {
    /**
      * Initialize the TaskQueuesStatisticsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TaskQueuesStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of TaskQueuesStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskQueuesStatisticsPayload): TaskQueuesStatisticsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait TaskQueuesStatisticsListInstance extends StObject {
    
    /**
      * Streams TaskQueuesStatisticsInstance records from the API.
      *
      * This operation lazily loads records as efficiently as possible until the limit
      * is reached.
      *
      * The results are passed into the callback function, so this operation is memory
      * efficient.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ TaskQueuesStatisticsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TaskQueuesStatisticsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TaskQueuesStatisticsListInstanceEachOptions): Unit = js.native
    def each(
      opts: TaskQueuesStatisticsListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TaskQueuesStatisticsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of TaskQueuesStatisticsInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TaskQueuesStatisticsPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuesStatisticsPage, Any]): js.Promise[TaskQueuesStatisticsPage] = js.native
    def getPage(targetUrl: String): js.Promise[TaskQueuesStatisticsPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuesStatisticsPage, Any]
    ): js.Promise[TaskQueuesStatisticsPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuesStatisticsPage, Any]
    ): js.Promise[TaskQueuesStatisticsPage] = js.native
    
    /**
      * Lists TaskQueuesStatisticsInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TaskQueuesStatisticsInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskQueuesStatisticsInstance], Any]
    ): js.Promise[js.Array[TaskQueuesStatisticsInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskQueuesStatisticsInstance], Any]
    ): js.Promise[js.Array[TaskQueuesStatisticsInstance]] = js.native
    def list(opts: TaskQueuesStatisticsListInstanceOptions): js.Promise[js.Array[TaskQueuesStatisticsInstance]] = js.native
    def list(
      opts: TaskQueuesStatisticsListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskQueuesStatisticsInstance], Any]
    ): js.Promise[js.Array[TaskQueuesStatisticsInstance]] = js.native
    
    /**
      * Retrieve a single page of TaskQueuesStatisticsInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TaskQueuesStatisticsPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuesStatisticsPage, Any]): js.Promise[TaskQueuesStatisticsPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuesStatisticsPage, Any]
    ): js.Promise[TaskQueuesStatisticsPage] = js.native
    def page(opts: TaskQueuesStatisticsListInstancePageOptions): js.Promise[TaskQueuesStatisticsPage] = js.native
    def page(
      opts: TaskQueuesStatisticsListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskQueuesStatisticsPage, Any]
    ): js.Promise[TaskQueuesStatisticsPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property endDate - Only calculate statistics from on or before this date
    * @property friendlyName - The friendly_name of the TaskQueue statistics to read
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property minutes - Only calculate statistics since this many minutes in the past
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property splitByWaitTime - A comma separated list of values that describes the thresholds to calculate statistics on
    * @property startDate - Only calculate statistics from on or after this date
    * @property taskChannel - Only calculate statistics on this TaskChannel.
    */
  trait TaskQueuesStatisticsListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TaskQueuesStatisticsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var splitByWaitTime: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object TaskQueuesStatisticsListInstanceEachOptions {
    
    inline def apply(): TaskQueuesStatisticsListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueuesStatisticsListInstanceEachOptions]
    }
    
    extension [Self <: TaskQueuesStatisticsListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TaskQueuesStatisticsInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSplitByWaitTime(value: String): Self = StObject.set(x, "splitByWaitTime", value.asInstanceOf[js.Any])
      
      inline def setSplitByWaitTimeUndefined: Self = StObject.set(x, "splitByWaitTime", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property endDate - Only calculate statistics from on or before this date
    * @property friendlyName - The friendly_name of the TaskQueue statistics to read
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property minutes - Only calculate statistics since this many minutes in the past
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property splitByWaitTime - A comma separated list of values that describes the thresholds to calculate statistics on
    * @property startDate - Only calculate statistics from on or after this date
    * @property taskChannel - Only calculate statistics on this TaskChannel.
    */
  trait TaskQueuesStatisticsListInstanceOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var splitByWaitTime: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object TaskQueuesStatisticsListInstanceOptions {
    
    inline def apply(): TaskQueuesStatisticsListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueuesStatisticsListInstanceOptions]
    }
    
    extension [Self <: TaskQueuesStatisticsListInstanceOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSplitByWaitTime(value: String): Self = StObject.set(x, "splitByWaitTime", value.asInstanceOf[js.Any])
      
      inline def setSplitByWaitTimeUndefined: Self = StObject.set(x, "splitByWaitTime", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property endDate - Only calculate statistics from on or before this date
    * @property friendlyName - The friendly_name of the TaskQueue statistics to read
    * @property minutes - Only calculate statistics since this many minutes in the past
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property splitByWaitTime - A comma separated list of values that describes the thresholds to calculate statistics on
    * @property startDate - Only calculate statistics from on or after this date
    * @property taskChannel - Only calculate statistics on this TaskChannel.
    */
  trait TaskQueuesStatisticsListInstancePageOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var splitByWaitTime: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var taskChannel: js.UndefOr[String] = js.undefined
  }
  object TaskQueuesStatisticsListInstancePageOptions {
    
    inline def apply(): TaskQueuesStatisticsListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueuesStatisticsListInstancePageOptions]
    }
    
    extension [Self <: TaskQueuesStatisticsListInstancePageOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSplitByWaitTime(value: String): Self = StObject.set(x, "splitByWaitTime", value.asInstanceOf[js.Any])
      
      inline def setSplitByWaitTimeUndefined: Self = StObject.set(x, "splitByWaitTime", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTaskChannel(value: String): Self = StObject.set(x, "taskChannel", value.asInstanceOf[js.Any])
      
      inline def setTaskChannelUndefined: Self = StObject.set(x, "taskChannel", js.undefined)
    }
  }
  
  trait TaskQueuesStatisticsPayload
    extends StObject
       with TaskQueuesStatisticsResource
       with TwilioResponsePayload
  object TaskQueuesStatisticsPayload {
    
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
      workspace_sid: String
    ): TaskQueuesStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], task_queue_sid = task_queue_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueuesStatisticsPayload]
    }
  }
  
  trait TaskQueuesStatisticsResource extends StObject {
    
    var account_sid: String
    
    var cumulative: js.Object
    
    var realtime: js.Object
    
    var task_queue_sid: String
    
    var workspace_sid: String
  }
  object TaskQueuesStatisticsResource {
    
    inline def apply(
      account_sid: String,
      cumulative: js.Object,
      realtime: js.Object,
      task_queue_sid: String,
      workspace_sid: String
    ): TaskQueuesStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], task_queue_sid = task_queue_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueuesStatisticsResource]
    }
    
    extension [Self <: TaskQueuesStatisticsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCumulative(value: js.Object): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      inline def setRealtime(value: js.Object): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      inline def setTask_queue_sid(value: String): Self = StObject.set(x, "task_queue_sid", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskQueuesStatisticsSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object TaskQueuesStatisticsSolution {
    
    inline def apply(): TaskQueuesStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskQueuesStatisticsSolution]
    }
    
    extension [Self <: TaskQueuesStatisticsSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
