package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.workflowCumulativeStatisticsMod.WorkflowCumulativeStatisticsContext
import typings.twilio.workflowCumulativeStatisticsMod.WorkflowCumulativeStatisticsListInstance
import typings.twilio.workflowRealTimeStatisticsMod.WorkflowRealTimeStatisticsContext
import typings.twilio.workflowRealTimeStatisticsMod.WorkflowRealTimeStatisticsListInstance
import typings.twilio.workflowStatisticsMod.WorkflowStatisticsContext
import typings.twilio.workflowStatisticsMod.WorkflowStatisticsListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workflowMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow", "WorkflowContext")
  @js.native
  open class WorkflowContext protected () extends StObject {
    /**
      * Initialize the WorkflowContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the Workflow to fetch
      * @param sid - The SID of the resource
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def cumulativeStatistics(sid: String): WorkflowCumulativeStatisticsContext = js.native
    @JSName("cumulativeStatistics")
    var cumulativeStatistics_Original: WorkflowCumulativeStatisticsListInstance = js.native
    
    /**
      * fetch a WorkflowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkflowInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowInstance, Any]): js.Promise[WorkflowInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def realTimeStatistics(sid: String): WorkflowRealTimeStatisticsContext = js.native
    @JSName("realTimeStatistics")
    var realTimeStatistics_Original: WorkflowRealTimeStatisticsListInstance = js.native
    
    /**
      * remove a WorkflowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def statistics(sid: String): WorkflowStatisticsContext = js.native
    @JSName("statistics")
    var statistics_Original: WorkflowStatisticsListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a WorkflowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WorkflowInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowInstance, Any]): js.Promise[WorkflowInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowInstance, Any]): js.Promise[WorkflowInstance] = js.native
    def update(opts: WorkflowInstanceUpdateOptions): js.Promise[WorkflowInstance] = js.native
    def update(
      opts: WorkflowInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowInstance, Any]
    ): js.Promise[WorkflowInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow", "WorkflowInstance")
  @js.native
  open class WorkflowInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkflowContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the Workflow
      * @param sid - The SID of the resource
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkflowPayload,
      workspaceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: WorkflowContext = js.native
    
    var accountSid: String = js.native
    
    var assignmentCallbackUrl: String = js.native
    
    var configuration: String = js.native
    
    /**
      * Access the cumulativeStatistics
      */
    def cumulativeStatistics(): WorkflowCumulativeStatisticsListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var documentContentType: String = js.native
    
    var fallbackAssignmentCallbackUrl: String = js.native
    
    /**
      * fetch a WorkflowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkflowInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkflowInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * Access the realTimeStatistics
      */
    def realTimeStatistics(): WorkflowRealTimeStatisticsListInstance = js.native
    
    /**
      * remove a WorkflowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * Access the statistics
      */
    def statistics(): WorkflowStatisticsListInstance = js.native
    
    var taskReservationTimeout: Double = js.native
    
    /**
      * update a WorkflowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WorkflowInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkflowInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkflowInstance] = js.native
    def update(opts: WorkflowInstanceUpdateOptions): js.Promise[WorkflowInstance] = js.native
    def update(
      opts: WorkflowInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkflowInstance] = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkflowList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the Workflow
    */
  inline def WorkflowList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): WorkflowListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkflowList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[WorkflowListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/workflow", "WorkflowPage")
  @js.native
  open class WorkflowPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.taskrouterV1Mod.^, WorkflowPayload, WorkflowResource, WorkflowInstance] {
    /**
      * Initialize the WorkflowPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkflowSolution
    ) = this()
    
    /**
      * Build an instance of WorkflowInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkflowPayload): WorkflowInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property assignmentCallbackUrl - The URL from your application that will process task assignment events
    * @property configuration - A JSON string that contains the rules to apply to the Workflow
    * @property fallbackAssignmentCallbackUrl - The URL that we should call when a call to the `assignment_callback_url` fails
    * @property friendlyName -  descriptive string that you create to describe the Workflow resource
    * @property reEvaluateTasks - Whether or not to re-evaluate Tasks
    * @property taskReservationTimeout - How long TaskRouter will wait for a confirmation response from your application after it assigns a Task to a Worker
    */
  trait WorkflowInstanceUpdateOptions extends StObject {
    
    var assignmentCallbackUrl: js.UndefOr[String] = js.undefined
    
    var configuration: js.UndefOr[String] = js.undefined
    
    var fallbackAssignmentCallbackUrl: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var reEvaluateTasks: js.UndefOr[String] = js.undefined
    
    var taskReservationTimeout: js.UndefOr[Double] = js.undefined
  }
  object WorkflowInstanceUpdateOptions {
    
    inline def apply(): WorkflowInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkflowInstanceUpdateOptions]
    }
    
    extension [Self <: WorkflowInstanceUpdateOptions](x: Self) {
      
      inline def setAssignmentCallbackUrl(value: String): Self = StObject.set(x, "assignmentCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setAssignmentCallbackUrlUndefined: Self = StObject.set(x, "assignmentCallbackUrl", js.undefined)
      
      inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setFallbackAssignmentCallbackUrl(value: String): Self = StObject.set(x, "fallbackAssignmentCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setFallbackAssignmentCallbackUrlUndefined: Self = StObject.set(x, "fallbackAssignmentCallbackUrl", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setReEvaluateTasks(value: String): Self = StObject.set(x, "reEvaluateTasks", value.asInstanceOf[js.Any])
      
      inline def setReEvaluateTasksUndefined: Self = StObject.set(x, "reEvaluateTasks", js.undefined)
      
      inline def setTaskReservationTimeout(value: Double): Self = StObject.set(x, "taskReservationTimeout", value.asInstanceOf[js.Any])
      
      inline def setTaskReservationTimeoutUndefined: Self = StObject.set(x, "taskReservationTimeout", js.undefined)
    }
  }
  
  @js.native
  trait WorkflowListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkflowContext = js.native
    
    /**
      * create a WorkflowInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: WorkflowListInstanceCreateOptions): js.Promise[WorkflowInstance] = js.native
    def create(
      opts: WorkflowListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ WorkflowInstance, Any]
    ): js.Promise[WorkflowInstance] = js.native
    
    /**
      * Streams WorkflowInstance records from the API.
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
          /* item */ WorkflowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ WorkflowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: WorkflowListInstanceEachOptions): Unit = js.native
    def each(
      opts: WorkflowListInstanceEachOptions,
      callback: js.Function2[
          /* item */ WorkflowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a workflow
      *
      * @param sid - The SID of the resource
      */
    def get(sid: String): WorkflowContext = js.native
    
    /**
      * Retrieve a single target page of WorkflowInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[WorkflowPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowPage, Any]): js.Promise[WorkflowPage] = js.native
    def getPage(targetUrl: String): js.Promise[WorkflowPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowPage, Any]
    ): js.Promise[WorkflowPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowPage, Any]
    ): js.Promise[WorkflowPage] = js.native
    
    /**
      * Lists WorkflowInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[WorkflowInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkflowInstance], Any]): js.Promise[js.Array[WorkflowInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkflowInstance], Any]
    ): js.Promise[js.Array[WorkflowInstance]] = js.native
    def list(opts: WorkflowListInstanceOptions): js.Promise[js.Array[WorkflowInstance]] = js.native
    def list(
      opts: WorkflowListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkflowInstance], Any]
    ): js.Promise[js.Array[WorkflowInstance]] = js.native
    
    /**
      * Retrieve a single page of WorkflowInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[WorkflowPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowPage, Any]): js.Promise[WorkflowPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowPage, Any]): js.Promise[WorkflowPage] = js.native
    def page(opts: WorkflowListInstancePageOptions): js.Promise[WorkflowPage] = js.native
    def page(
      opts: WorkflowListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkflowPage, Any]
    ): js.Promise[WorkflowPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property assignmentCallbackUrl - The URL from your application that will process task assignment events
    * @property configuration - A JSON string that contains the rules to apply to the Workflow
    * @property fallbackAssignmentCallbackUrl - The URL that we should call when a call to the `assignment_callback_url` fails
    * @property friendlyName -  descriptive string that you create to describe the Workflow resource
    * @property taskReservationTimeout - How long TaskRouter will wait for a confirmation response from your application after it assigns a Task to a Worker
    */
  trait WorkflowListInstanceCreateOptions extends StObject {
    
    var assignmentCallbackUrl: js.UndefOr[String] = js.undefined
    
    var configuration: String
    
    var fallbackAssignmentCallbackUrl: js.UndefOr[String] = js.undefined
    
    var friendlyName: String
    
    var taskReservationTimeout: js.UndefOr[Double] = js.undefined
  }
  object WorkflowListInstanceCreateOptions {
    
    inline def apply(configuration: String, friendlyName: String): WorkflowListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkflowListInstanceCreateOptions]
    }
    
    extension [Self <: WorkflowListInstanceCreateOptions](x: Self) {
      
      inline def setAssignmentCallbackUrl(value: String): Self = StObject.set(x, "assignmentCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setAssignmentCallbackUrlUndefined: Self = StObject.set(x, "assignmentCallbackUrl", js.undefined)
      
      inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setFallbackAssignmentCallbackUrl(value: String): Self = StObject.set(x, "fallbackAssignmentCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setFallbackAssignmentCallbackUrlUndefined: Self = StObject.set(x, "fallbackAssignmentCallbackUrl", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setTaskReservationTimeout(value: Double): Self = StObject.set(x, "taskReservationTimeout", value.asInstanceOf[js.Any])
      
      inline def setTaskReservationTimeoutUndefined: Self = StObject.set(x, "taskReservationTimeout", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The friendly_name of the Workflow resources to read
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait WorkflowListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ WorkflowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object WorkflowListInstanceEachOptions {
    
    inline def apply(): WorkflowListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkflowListInstanceEachOptions]
    }
    
    extension [Self <: WorkflowListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ WorkflowInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - The friendly_name of the Workflow resources to read
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait WorkflowListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object WorkflowListInstanceOptions {
    
    inline def apply(): WorkflowListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkflowListInstanceOptions]
    }
    
    extension [Self <: WorkflowListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - The friendly_name of the Workflow resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait WorkflowListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object WorkflowListInstancePageOptions {
    
    inline def apply(): WorkflowListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkflowListInstancePageOptions]
    }
    
    extension [Self <: WorkflowListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait WorkflowPayload
    extends StObject
       with WorkflowResource
       with TwilioResponsePayload
  object WorkflowPayload {
    
    inline def apply(
      account_sid: String,
      assignment_callback_url: String,
      configuration: String,
      date_created: js.Date,
      date_updated: js.Date,
      document_content_type: String,
      fallback_assignment_callback_url: String,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      task_reservation_timeout: Double,
      uri: String,
      url: String,
      workspace_sid: String
    ): WorkflowPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assignment_callback_url = assignment_callback_url.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], document_content_type = document_content_type.asInstanceOf[js.Any], fallback_assignment_callback_url = fallback_assignment_callback_url.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_reservation_timeout = task_reservation_timeout.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkflowPayload]
    }
  }
  
  trait WorkflowResource extends StObject {
    
    var account_sid: String
    
    var assignment_callback_url: String
    
    var configuration: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var document_content_type: String
    
    var fallback_assignment_callback_url: String
    
    var friendly_name: String
    
    var links: String
    
    var sid: String
    
    var task_reservation_timeout: Double
    
    var url: String
    
    var workspace_sid: String
  }
  object WorkflowResource {
    
    inline def apply(
      account_sid: String,
      assignment_callback_url: String,
      configuration: String,
      date_created: js.Date,
      date_updated: js.Date,
      document_content_type: String,
      fallback_assignment_callback_url: String,
      friendly_name: String,
      links: String,
      sid: String,
      task_reservation_timeout: Double,
      url: String,
      workspace_sid: String
    ): WorkflowResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assignment_callback_url = assignment_callback_url.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], document_content_type = document_content_type.asInstanceOf[js.Any], fallback_assignment_callback_url = fallback_assignment_callback_url.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_reservation_timeout = task_reservation_timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkflowResource]
    }
    
    extension [Self <: WorkflowResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssignment_callback_url(value: String): Self = StObject.set(x, "assignment_callback_url", value.asInstanceOf[js.Any])
      
      inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDocument_content_type(value: String): Self = StObject.set(x, "document_content_type", value.asInstanceOf[js.Any])
      
      inline def setFallback_assignment_callback_url(value: String): Self = StObject.set(x, "fallback_assignment_callback_url", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTask_reservation_timeout(value: Double): Self = StObject.set(x, "task_reservation_timeout", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkflowSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkflowSolution {
    
    inline def apply(): WorkflowSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkflowSolution]
    }
    
    extension [Self <: WorkflowSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
