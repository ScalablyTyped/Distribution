package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.workerChannelMod.WorkerChannelContext
import typings.twilio.workerChannelMod.WorkerChannelListInstance
import typings.twilio.workerReservationMod.ReservationContext
import typings.twilio.workerReservationMod.ReservationListInstance
import typings.twilio.workerStatisticsMod.WorkerStatisticsContext
import typings.twilio.workerStatisticsMod.WorkerStatisticsListInstance
import typings.twilio.workersCumulativeStatisticsMod.WorkersCumulativeStatisticsContext
import typings.twilio.workersCumulativeStatisticsMod.WorkersCumulativeStatisticsListInstance
import typings.twilio.workersRealTimeStatisticsMod.WorkersRealTimeStatisticsContext
import typings.twilio.workersRealTimeStatisticsMod.WorkersRealTimeStatisticsListInstance
import typings.twilio.workersStatisticsMod.WorkersStatisticsListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker", "WorkerContext")
  @js.native
  open class WorkerContext protected () extends StObject {
    /**
      * Initialize the WorkerContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the Worker to fetch
      * @param sid - The SID of the resource to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def cumulativeStatistics(sid: String): WorkersCumulativeStatisticsContext = js.native
    @JSName("cumulativeStatistics")
    var cumulativeStatistics_Original: WorkersCumulativeStatisticsListInstance = js.native
    
    /**
      * fetch a WorkerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkerInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerInstance, Any]): js.Promise[WorkerInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def realTimeStatistics(sid: String): WorkersRealTimeStatisticsContext = js.native
    @JSName("realTimeStatistics")
    var realTimeStatistics_Original: WorkersRealTimeStatisticsListInstance = js.native
    
    /**
      * remove a WorkerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerInstance, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerInstance, Any]): js.Promise[Boolean] = js.native
    def remove(opts: WorkerInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: WorkerInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def reservations(sid: String): ReservationContext = js.native
    @JSName("reservations")
    var reservations_Original: ReservationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def statistics(sid: String): WorkerStatisticsContext = js.native
    @JSName("statistics")
    var statistics_Original: WorkerStatisticsListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a WorkerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WorkerInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerInstance, Any]): js.Promise[WorkerInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerInstance, Any]): js.Promise[WorkerInstance] = js.native
    def update(opts: WorkerInstanceUpdateOptions): js.Promise[WorkerInstance] = js.native
    def update(
      opts: WorkerInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerInstance, Any]
    ): js.Promise[WorkerInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def workerChannels(sid: String): WorkerChannelContext = js.native
    @JSName("workerChannels")
    var workerChannels_Original: WorkerChannelListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker", "WorkerInstance")
  @js.native
  open class WorkerInstance protected () extends SerializableClass {
    /**
      * Initialize the WorkerContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the Worker
      * @param sid - The SID of the resource to fetch
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: WorkerPayload,
      workspaceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: WorkerContext = js.native
    
    var accountSid: String = js.native
    
    var activityName: String = js.native
    
    var activitySid: String = js.native
    
    var attributes: String = js.native
    
    var available: Boolean = js.native
    
    /**
      * Access the cumulativeStatistics
      */
    def cumulativeStatistics(): WorkersCumulativeStatisticsListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateStatusChanged: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a WorkerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[WorkerInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkerInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * Access the realTimeStatistics
      */
    def realTimeStatistics(): WorkersRealTimeStatisticsListInstance = js.native
    
    /**
      * remove a WorkerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: WorkerInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: WorkerInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Access the reservations
      */
    def reservations(): ReservationListInstance = js.native
    
    var sid: String = js.native
    
    /**
      * Access the statistics
      */
    def statistics(): WorkerStatisticsListInstance = js.native
    
    /**
      * update a WorkerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[WorkerInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkerInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[WorkerInstance] = js.native
    def update(opts: WorkerInstanceUpdateOptions): js.Promise[WorkerInstance] = js.native
    def update(
      opts: WorkerInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[WorkerInstance] = js.native
    
    var url: String = js.native
    
    /**
      * Access the workerChannels
      */
    def workerChannels(): WorkerChannelListInstance = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the WorkerList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the Worker
    */
  inline def WorkerList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): WorkerListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("WorkerList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[WorkerListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker", "WorkerPage")
  @js.native
  open class WorkerPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.taskrouterV1Mod.^, WorkerPayload, WorkerResource, WorkerInstance] {
    /**
      * Initialize the WorkerPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: WorkerSolution
    ) = this()
    
    /**
      * Build an instance of WorkerInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: WorkerPayload): WorkerInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to remove
    *
    * @property ifMatch - The If-Match HTTP request header
    */
  trait WorkerInstanceRemoveOptions extends StObject {
    
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object WorkerInstanceRemoveOptions {
    
    inline def apply(): WorkerInstanceRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerInstanceRemoveOptions]
    }
    
    extension [Self <: WorkerInstanceRemoveOptions](x: Self) {
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  /**
    * Options to pass to update
    *
    * @property activitySid - The SID of the Activity that describes the Worker's initial state
    * @property attributes - The JSON string that describes the Worker
    * @property friendlyName - A string to describe the Worker
    * @property ifMatch - The If-Match HTTP request header
    * @property rejectPendingReservations - Whether to reject the Worker's pending reservations
    */
  trait WorkerInstanceUpdateOptions extends StObject {
    
    var activitySid: js.UndefOr[String] = js.undefined
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var ifMatch: js.UndefOr[String] = js.undefined
    
    var rejectPendingReservations: js.UndefOr[Boolean] = js.undefined
  }
  object WorkerInstanceUpdateOptions {
    
    inline def apply(): WorkerInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerInstanceUpdateOptions]
    }
    
    extension [Self <: WorkerInstanceUpdateOptions](x: Self) {
      
      inline def setActivitySid(value: String): Self = StObject.set(x, "activitySid", value.asInstanceOf[js.Any])
      
      inline def setActivitySidUndefined: Self = StObject.set(x, "activitySid", js.undefined)
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
      
      inline def setRejectPendingReservations(value: Boolean): Self = StObject.set(x, "rejectPendingReservations", value.asInstanceOf[js.Any])
      
      inline def setRejectPendingReservationsUndefined: Self = StObject.set(x, "rejectPendingReservations", js.undefined)
    }
  }
  
  @js.native
  trait WorkerListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): WorkerContext = js.native
    
    /**
      * create a WorkerInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: WorkerListInstanceCreateOptions): js.Promise[WorkerInstance] = js.native
    def create(
      opts: WorkerListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ WorkerInstance, Any]
    ): js.Promise[WorkerInstance] = js.native
    
    /**
      * Streams WorkerInstance records from the API.
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
          /* item */ WorkerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ WorkerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: WorkerListInstanceEachOptions): Unit = js.native
    def each(
      opts: WorkerListInstanceEachOptions,
      callback: js.Function2[
          /* item */ WorkerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a worker
      *
      * @param sid - The SID of the resource to fetch
      */
    def get(sid: String): WorkerContext = js.native
    
    /**
      * Retrieve a single target page of WorkerInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[WorkerPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerPage, Any]): js.Promise[WorkerPage] = js.native
    def getPage(targetUrl: String): js.Promise[WorkerPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerPage, Any]
    ): js.Promise[WorkerPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerPage, Any]): js.Promise[WorkerPage] = js.native
    
    /**
      * Lists WorkerInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[WorkerInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkerInstance], Any]): js.Promise[js.Array[WorkerInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkerInstance], Any]
    ): js.Promise[js.Array[WorkerInstance]] = js.native
    def list(opts: WorkerListInstanceOptions): js.Promise[js.Array[WorkerInstance]] = js.native
    def list(
      opts: WorkerListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[WorkerInstance], Any]
    ): js.Promise[js.Array[WorkerInstance]] = js.native
    
    /**
      * Retrieve a single page of WorkerInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[WorkerPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerPage, Any]): js.Promise[WorkerPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerPage, Any]): js.Promise[WorkerPage] = js.native
    def page(opts: WorkerListInstancePageOptions): js.Promise[WorkerPage] = js.native
    def page(
      opts: WorkerListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ WorkerPage, Any]
    ): js.Promise[WorkerPage] = js.native
    
    var statistics: js.UndefOr[WorkersStatisticsListInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property activitySid - The SID of a valid Activity that describes the new Worker's initial state
    * @property attributes - A valid JSON string that describes the new Worker
    * @property friendlyName - A string to describe the resource
    */
  trait WorkerListInstanceCreateOptions extends StObject {
    
    var activitySid: js.UndefOr[String] = js.undefined
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var friendlyName: String
  }
  object WorkerListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): WorkerListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerListInstanceCreateOptions]
    }
    
    extension [Self <: WorkerListInstanceCreateOptions](x: Self) {
      
      inline def setActivitySid(value: String): Self = StObject.set(x, "activitySid", value.asInstanceOf[js.Any])
      
      inline def setActivitySidUndefined: Self = StObject.set(x, "activitySid", js.undefined)
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property activityName - The activity_name of the Worker resources to read
    * @property activitySid - The activity_sid of the Worker resources to read
    * @property available - Whether to return Worker resources that are available or unavailable
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The friendly_name of the Worker resources to read
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
    * @property targetWorkersExpression - Filter by Workers that would match an expression on a TaskQueue
    * @property taskQueueName - The friendly_name of the TaskQueue that the Workers to read are eligible for
    * @property taskQueueSid - The SID of the TaskQueue that the Workers to read are eligible for
    */
  trait WorkerListInstanceEachOptions extends StObject {
    
    var activityName: js.UndefOr[String] = js.undefined
    
    var activitySid: js.UndefOr[String] = js.undefined
    
    var available: js.UndefOr[String] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ WorkerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var targetWorkersExpression: js.UndefOr[String] = js.undefined
    
    var taskQueueName: js.UndefOr[String] = js.undefined
    
    var taskQueueSid: js.UndefOr[String] = js.undefined
  }
  object WorkerListInstanceEachOptions {
    
    inline def apply(): WorkerListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerListInstanceEachOptions]
    }
    
    extension [Self <: WorkerListInstanceEachOptions](x: Self) {
      
      inline def setActivityName(value: String): Self = StObject.set(x, "activityName", value.asInstanceOf[js.Any])
      
      inline def setActivityNameUndefined: Self = StObject.set(x, "activityName", js.undefined)
      
      inline def setActivitySid(value: String): Self = StObject.set(x, "activitySid", value.asInstanceOf[js.Any])
      
      inline def setActivitySidUndefined: Self = StObject.set(x, "activitySid", js.undefined)
      
      inline def setAvailable(value: String): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
      
      inline def setCallback(
        value: (/* item */ WorkerInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
      
      inline def setTargetWorkersExpression(value: String): Self = StObject.set(x, "targetWorkersExpression", value.asInstanceOf[js.Any])
      
      inline def setTargetWorkersExpressionUndefined: Self = StObject.set(x, "targetWorkersExpression", js.undefined)
      
      inline def setTaskQueueName(value: String): Self = StObject.set(x, "taskQueueName", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueNameUndefined: Self = StObject.set(x, "taskQueueName", js.undefined)
      
      inline def setTaskQueueSid(value: String): Self = StObject.set(x, "taskQueueSid", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueSidUndefined: Self = StObject.set(x, "taskQueueSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property activityName - The activity_name of the Worker resources to read
    * @property activitySid - The activity_sid of the Worker resources to read
    * @property available - Whether to return Worker resources that are available or unavailable
    * @property friendlyName - The friendly_name of the Worker resources to read
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
    * @property targetWorkersExpression - Filter by Workers that would match an expression on a TaskQueue
    * @property taskQueueName - The friendly_name of the TaskQueue that the Workers to read are eligible for
    * @property taskQueueSid - The SID of the TaskQueue that the Workers to read are eligible for
    */
  trait WorkerListInstanceOptions extends StObject {
    
    var activityName: js.UndefOr[String] = js.undefined
    
    var activitySid: js.UndefOr[String] = js.undefined
    
    var available: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var targetWorkersExpression: js.UndefOr[String] = js.undefined
    
    var taskQueueName: js.UndefOr[String] = js.undefined
    
    var taskQueueSid: js.UndefOr[String] = js.undefined
  }
  object WorkerListInstanceOptions {
    
    inline def apply(): WorkerListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerListInstanceOptions]
    }
    
    extension [Self <: WorkerListInstanceOptions](x: Self) {
      
      inline def setActivityName(value: String): Self = StObject.set(x, "activityName", value.asInstanceOf[js.Any])
      
      inline def setActivityNameUndefined: Self = StObject.set(x, "activityName", js.undefined)
      
      inline def setActivitySid(value: String): Self = StObject.set(x, "activitySid", value.asInstanceOf[js.Any])
      
      inline def setActivitySidUndefined: Self = StObject.set(x, "activitySid", js.undefined)
      
      inline def setAvailable(value: String): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setTargetWorkersExpression(value: String): Self = StObject.set(x, "targetWorkersExpression", value.asInstanceOf[js.Any])
      
      inline def setTargetWorkersExpressionUndefined: Self = StObject.set(x, "targetWorkersExpression", js.undefined)
      
      inline def setTaskQueueName(value: String): Self = StObject.set(x, "taskQueueName", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueNameUndefined: Self = StObject.set(x, "taskQueueName", js.undefined)
      
      inline def setTaskQueueSid(value: String): Self = StObject.set(x, "taskQueueSid", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueSidUndefined: Self = StObject.set(x, "taskQueueSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property activityName - The activity_name of the Worker resources to read
    * @property activitySid - The activity_sid of the Worker resources to read
    * @property available - Whether to return Worker resources that are available or unavailable
    * @property friendlyName - The friendly_name of the Worker resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property targetWorkersExpression - Filter by Workers that would match an expression on a TaskQueue
    * @property taskQueueName - The friendly_name of the TaskQueue that the Workers to read are eligible for
    * @property taskQueueSid - The SID of the TaskQueue that the Workers to read are eligible for
    */
  trait WorkerListInstancePageOptions extends StObject {
    
    var activityName: js.UndefOr[String] = js.undefined
    
    var activitySid: js.UndefOr[String] = js.undefined
    
    var available: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var targetWorkersExpression: js.UndefOr[String] = js.undefined
    
    var taskQueueName: js.UndefOr[String] = js.undefined
    
    var taskQueueSid: js.UndefOr[String] = js.undefined
  }
  object WorkerListInstancePageOptions {
    
    inline def apply(): WorkerListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerListInstancePageOptions]
    }
    
    extension [Self <: WorkerListInstancePageOptions](x: Self) {
      
      inline def setActivityName(value: String): Self = StObject.set(x, "activityName", value.asInstanceOf[js.Any])
      
      inline def setActivityNameUndefined: Self = StObject.set(x, "activityName", js.undefined)
      
      inline def setActivitySid(value: String): Self = StObject.set(x, "activitySid", value.asInstanceOf[js.Any])
      
      inline def setActivitySidUndefined: Self = StObject.set(x, "activitySid", js.undefined)
      
      inline def setAvailable(value: String): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setTargetWorkersExpression(value: String): Self = StObject.set(x, "targetWorkersExpression", value.asInstanceOf[js.Any])
      
      inline def setTargetWorkersExpressionUndefined: Self = StObject.set(x, "targetWorkersExpression", js.undefined)
      
      inline def setTaskQueueName(value: String): Self = StObject.set(x, "taskQueueName", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueNameUndefined: Self = StObject.set(x, "taskQueueName", js.undefined)
      
      inline def setTaskQueueSid(value: String): Self = StObject.set(x, "taskQueueSid", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueSidUndefined: Self = StObject.set(x, "taskQueueSid", js.undefined)
    }
  }
  
  trait WorkerPayload
    extends StObject
       with WorkerResource
       with TwilioResponsePayload
  object WorkerPayload {
    
    inline def apply(
      account_sid: String,
      activity_name: String,
      activity_sid: String,
      attributes: String,
      available: Boolean,
      date_created: js.Date,
      date_status_changed: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String,
      workspace_sid: String
    ): WorkerPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], activity_name = activity_name.asInstanceOf[js.Any], activity_sid = activity_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_status_changed = date_status_changed.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerPayload]
    }
  }
  
  trait WorkerResource extends StObject {
    
    var account_sid: String
    
    var activity_name: String
    
    var activity_sid: String
    
    var attributes: String
    
    var available: Boolean
    
    var date_created: js.Date
    
    var date_status_changed: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var sid: String
    
    var url: String
    
    var workspace_sid: String
  }
  object WorkerResource {
    
    inline def apply(
      account_sid: String,
      activity_name: String,
      activity_sid: String,
      attributes: String,
      available: Boolean,
      date_created: js.Date,
      date_status_changed: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      sid: String,
      url: String,
      workspace_sid: String
    ): WorkerResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], activity_name = activity_name.asInstanceOf[js.Any], activity_sid = activity_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_status_changed = date_status_changed.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerResource]
    }
    
    extension [Self <: WorkerResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setActivity_name(value: String): Self = StObject.set(x, "activity_name", value.asInstanceOf[js.Any])
      
      inline def setActivity_sid(value: String): Self = StObject.set(x, "activity_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_status_changed(value: js.Date): Self = StObject.set(x, "date_status_changed", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerSolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object WorkerSolution {
    
    inline def apply(): WorkerSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerSolution]
    }
    
    extension [Self <: WorkerSolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
