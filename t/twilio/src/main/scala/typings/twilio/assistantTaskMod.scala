package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.taskFieldMod.FieldContext
import typings.twilio.taskFieldMod.FieldListInstance
import typings.twilio.taskSampleMod.SampleContext
import typings.twilio.taskSampleMod.SampleListInstance
import typings.twilio.taskTaskActionsMod.TaskActionsContext
import typings.twilio.taskTaskActionsMod.TaskActionsListInstance
import typings.twilio.taskTaskStatisticsMod.TaskStatisticsContext
import typings.twilio.taskTaskStatisticsMod.TaskStatisticsListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assistantTaskMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task", "TaskContext")
  @js.native
  open class TaskContext protected () extends StObject {
    /**
      * Initialize the TaskContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The unique ID of the Assistant.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(version: typings.twilio.understandMod.^, assistantSid: String, sid: String) = this()
    
    /**
      * fetch a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]): js.Promise[TaskInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def fields(sid: String): FieldContext = js.native
    @JSName("fields")
    var fields_Original: FieldListInstance = js.native
    
    /**
      * remove a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def samples(sid: String): SampleContext = js.native
    @JSName("samples")
    var samples_Original: SampleListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def statistics(sid: String): TaskStatisticsContext = js.native
    @JSName("statistics")
    var statistics_Original: TaskStatisticsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def taskActions(sid: String): TaskActionsContext = js.native
    @JSName("taskActions")
    var taskActions_Original: TaskActionsListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TaskInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]): js.Promise[TaskInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]): js.Promise[TaskInstance] = js.native
    def update(opts: TaskInstanceUpdateOptions): js.Promise[TaskInstance] = js.native
    def update(
      opts: TaskInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskInstance, Any]
    ): js.Promise[TaskInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task", "TaskInstance")
  @js.native
  open class TaskInstance protected () extends SerializableClass {
    /**
      * Initialize the TaskContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The unique ID of the Assistant.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(version: typings.twilio.understandMod.^, payload: TaskPayload, assistantSid: String, sid: String) = this()
    
    /* private */ var _proxy: TaskContext = js.native
    
    var accountSid: String = js.native
    
    var actionsUrl: String = js.native
    
    var assistantSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskInstance] = js.native
    
    /**
      * Access the fields
      */
    def fields(): FieldListInstance = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * remove a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Access the samples
      */
    def samples(): SampleListInstance = js.native
    
    var sid: String = js.native
    
    /**
      * Access the statistics
      */
    def statistics(): TaskStatisticsListInstance = js.native
    
    /**
      * Access the taskActions
      */
    def taskActions(): TaskActionsListInstance = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a TaskInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TaskInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskInstance] = js.native
    def update(opts: TaskInstanceUpdateOptions): js.Promise[TaskInstance] = js.native
    def update(
      opts: TaskInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TaskInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the TaskList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The unique ID of the Assistant.
    */
  inline def TaskList(version: typings.twilio.understandMod.^, assistantSid: String): TaskListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TaskList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any])).asInstanceOf[TaskListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task", "TaskPage")
  @js.native
  open class TaskPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.understandMod.^, TaskPayload, TaskResource, TaskInstance] {
    /**
      * Initialize the TaskPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.understandMod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TaskSolution
    ) = this()
    
    /**
      * Build an instance of TaskInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskPayload): TaskInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property actions - A user-provided JSON object encoded as a string to specify the actions for this task. It is optional and non-unique.
    * @property actionsUrl - User-provided HTTP endpoint where from the assistant fetches actions
    * @property friendlyName - A user-provided string that identifies this resource. It is non-unique and can up to 255 characters long.
    * @property uniqueName - A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
    */
  trait TaskInstanceUpdateOptions extends StObject {
    
    var actions: js.UndefOr[js.Object] = js.undefined
    
    var actionsUrl: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object TaskInstanceUpdateOptions {
    
    inline def apply(): TaskInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskInstanceUpdateOptions]
    }
    
    extension [Self <: TaskInstanceUpdateOptions](x: Self) {
      
      inline def setActions(value: js.Object): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsUrl(value: String): Self = StObject.set(x, "actionsUrl", value.asInstanceOf[js.Any])
      
      inline def setActionsUrlUndefined: Self = StObject.set(x, "actionsUrl", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait TaskListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TaskContext = js.native
    
    /**
      * create a TaskInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: TaskListInstanceCreateOptions): js.Promise[TaskInstance] = js.native
    def create(
      opts: TaskListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TaskInstance, Any]
    ): js.Promise[TaskInstance] = js.native
    
    /**
      * Streams TaskInstance records from the API.
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
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TaskListInstanceEachOptions): Unit = js.native
    def each(
      opts: TaskListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a task
      *
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def get(sid: String): TaskContext = js.native
    
    /**
      * Retrieve a single target page of TaskInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TaskPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    def getPage(targetUrl: String): js.Promise[TaskPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    
    /**
      * Lists TaskInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TaskInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskInstance], Any]): js.Promise[js.Array[TaskInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskInstance], Any]
    ): js.Promise[js.Array[TaskInstance]] = js.native
    def list(opts: TaskListInstanceOptions): js.Promise[js.Array[TaskInstance]] = js.native
    def list(
      opts: TaskListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskInstance], Any]
    ): js.Promise[js.Array[TaskInstance]] = js.native
    
    /**
      * Retrieve a single page of TaskInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TaskPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    def page(opts: TaskListInstancePageOptions): js.Promise[TaskPage] = js.native
    def page(
      opts: TaskListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]
    ): js.Promise[TaskPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property actions - A user-provided JSON object encoded as a string to specify the actions for this task. It is optional and non-unique.
    * @property actionsUrl - User-provided HTTP endpoint where from the assistant fetches actions
    * @property friendlyName - A user-provided string that identifies this resource. It is non-unique and can up to 255 characters long.
    * @property uniqueName - A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
    */
  trait TaskListInstanceCreateOptions extends StObject {
    
    var actions: js.UndefOr[js.Object] = js.undefined
    
    var actionsUrl: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var uniqueName: String
  }
  object TaskListInstanceCreateOptions {
    
    inline def apply(uniqueName: String): TaskListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskListInstanceCreateOptions]
    }
    
    extension [Self <: TaskListInstanceCreateOptions](x: Self) {
      
      inline def setActions(value: js.Object): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsUrl(value: String): Self = StObject.set(x, "actionsUrl", value.asInstanceOf[js.Any])
      
      inline def setActionsUrlUndefined: Self = StObject.set(x, "actionsUrl", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
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
  trait TaskListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TaskListInstanceEachOptions {
    
    inline def apply(): TaskListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskListInstanceEachOptions]
    }
    
    extension [Self <: TaskListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TaskInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
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
  trait TaskListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TaskListInstanceOptions {
    
    inline def apply(): TaskListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskListInstanceOptions]
    }
    
    extension [Self <: TaskListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait TaskListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object TaskListInstancePageOptions {
    
    inline def apply(): TaskListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskListInstancePageOptions]
    }
    
    extension [Self <: TaskListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait TaskPayload
    extends StObject
       with TaskResource
       with TwilioResponsePayload
  object TaskPayload {
    
    inline def apply(
      account_sid: String,
      actions_url: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): TaskPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], actions_url = actions_url.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskPayload]
    }
  }
  
  trait TaskResource extends StObject {
    
    var account_sid: String
    
    var actions_url: String
    
    var assistant_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object TaskResource {
    
    inline def apply(
      account_sid: String,
      actions_url: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      sid: String,
      unique_name: String,
      url: String
    ): TaskResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], actions_url = actions_url.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskResource]
    }
    
    extension [Self <: TaskResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setActions_url(value: String): Self = StObject.set(x, "actions_url", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskSolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
  }
  object TaskSolution {
    
    inline def apply(): TaskSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskSolution]
    }
    
    extension [Self <: TaskSolution](x: Self) {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
    }
  }
}
