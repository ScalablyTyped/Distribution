package typings.twilio

import typings.std.Record
import typings.twilio.anon.ActionsUrl
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewUnderstandAssistantTaskFieldMod.FieldContext
import typings.twilio.libRestPreviewUnderstandAssistantTaskFieldMod.FieldListInstance
import typings.twilio.libRestPreviewUnderstandAssistantTaskSampleMod.SampleContext
import typings.twilio.libRestPreviewUnderstandAssistantTaskSampleMod.SampleListInstance
import typings.twilio.libRestPreviewUnderstandAssistantTaskTaskActionsMod.TaskActionsContext
import typings.twilio.libRestPreviewUnderstandAssistantTaskTaskActionsMod.TaskActionsListInstance
import typings.twilio.libRestPreviewUnderstandAssistantTaskTaskStatisticsMod.TaskStatisticsContext
import typings.twilio.libRestPreviewUnderstandAssistantTaskTaskStatisticsMod.TaskStatisticsListInstance
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantTaskMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task", "TaskContextImpl")
  @js.native
  open class TaskContextImpl protected ()
    extends StObject
       with TaskContext {
    def this(_version: default, assistantSid: String, sid: String) = this()
    
    /* protected */ var _fields: js.UndefOr[FieldListInstance] = js.native
    
    /* protected */ var _samples: js.UndefOr[SampleListInstance] = js.native
    
    /* protected */ var _solution: TaskContextSolution = js.native
    
    /* protected */ var _statistics: js.UndefOr[TaskStatisticsListInstance] = js.native
    
    /* protected */ var _taskActions: js.UndefOr[TaskActionsListInstance] = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def fields: FieldListInstance = js.native
    
    def samples: SampleListInstance = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskInstance], Any]
    ): js.Promise[TaskInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskInstance], Any]
    ): js.Promise[TaskInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task", "TaskInstance")
  @js.native
  open class TaskInstance protected () extends StObject {
    def this(_version: default, payload: TaskResource, assistantSid: String) = this()
    def this(_version: default, payload: TaskResource, assistantSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[TaskContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: TaskContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Task.
      */
    var accountSid: String = js.native
    
    /**
      * User-provided HTTP endpoint where from the assistant fetches actions
      */
    var actionsUrl: String = js.native
    
    /**
      * The unique ID of the Assistant.
      */
    var assistantSid: String = js.native
    
    /**
      * The date that this resource was created
      */
    var dateCreated: js.Date = js.native
    
    /**
      * The date that this resource was last updated
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * Fetch a TaskInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskInstance
      */
    def fetch(): js.Promise[TaskInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[TaskInstance] = js.native
    
    /**
      * Access the fields.
      */
    def fields(): FieldListInstance = js.native
    
    /**
      * A user-provided string that identifies this resource. It is non-unique and can up to 255 characters long.
      */
    var friendlyName: String = js.native
    
    var links: Record[String, String] = js.native
    
    /**
      * Remove a TaskInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Access the samples.
      */
    def samples(): SampleListInstance = js.native
    
    /**
      * A 34 character string that uniquely identifies this resource.
      */
    var sid: String = js.native
    
    /**
      * Access the statistics.
      */
    def statistics(): TaskStatisticsListInstance = js.native
    
    /**
      * Access the taskActions.
      */
    def taskActions(): TaskActionsListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): ActionsUrl = js.native
    
    /**
      * A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
      */
    var uniqueName: String = js.native
    
    /**
      * Update a TaskInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskInstance
      */
    def update(): js.Promise[TaskInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[TaskInstance] = js.native
    /**
      * Update a TaskInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskInstance
      */
    def update(params: TaskContextUpdateOptions): js.Promise[TaskInstance] = js.native
    def update(
      params: TaskContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[TaskInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait TaskListInstance extends StObject {
    
    def apply(sid: String): TaskContext = js.native
    
    var _solution: TaskSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a TaskInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskInstance
      */
    def create(params: TaskListInstanceCreateOptions): js.Promise[TaskInstance] = js.native
    def create(
      params: TaskListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskInstance], Any]
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
      * @param { TaskListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: TaskListInstanceEachOptions): Unit = js.native
    def each(
      params: TaskListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): TaskContext = js.native
    
    /**
      * Retrieve a single target page of TaskInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[TaskPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    
    /**
      * Lists TaskInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { TaskListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TaskInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TaskInstance], Any]): js.Promise[js.Array[TaskInstance]] = js.native
    def list(params: TaskListInstanceOptions): js.Promise[js.Array[TaskInstance]] = js.native
    def list(
      params: TaskListInstanceOptions,
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
      * @param { TaskListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[TaskPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]): js.Promise[TaskPage] = js.native
    def page(params: TaskListInstancePageOptions): js.Promise[TaskPage] = js.native
    def page(
      params: TaskListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskPage, Any]
    ): js.Promise[TaskPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object TaskListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/task", "TaskListInstance")
    @js.native
    def apply(version: default, assistantSid: String): TaskListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task", "TaskPage")
  @js.native
  open class TaskPage protected ()
    extends typings.twilio.libBasePageMod.default[default, TaskPayload, TaskResource, TaskInstance] {
    /**
      * Initialize the TaskPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: TaskSolution
    ) = this()
    
    /**
      * Build an instance of TaskInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskResource): TaskInstance = js.native
  }
  
  @js.native
  trait TaskContext extends StObject {
    
    /**
      * Fetch a TaskInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskInstance
      */
    def fetch(): js.Promise[TaskInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskInstance], Any]): js.Promise[TaskInstance] = js.native
    
    def fields(sid: String): FieldContext = js.native
    @JSName("fields")
    var fields_Original: FieldListInstance = js.native
    
    /**
      * Remove a TaskInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    def samples(sid: String): SampleContext = js.native
    @JSName("samples")
    var samples_Original: SampleListInstance = js.native
    
    def statistics(): TaskStatisticsContext = js.native
    @JSName("statistics")
    var statistics_Original: TaskStatisticsListInstance = js.native
    
    def taskActions(): TaskActionsContext = js.native
    @JSName("taskActions")
    var taskActions_Original: TaskActionsListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a TaskInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskInstance
      */
    def update(): js.Promise[TaskInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskInstance], Any]): js.Promise[TaskInstance] = js.native
    /**
      * Update a TaskInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskInstance
      */
    def update(params: TaskContextUpdateOptions): js.Promise[TaskInstance] = js.native
    def update(
      params: TaskContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskInstance], Any]
    ): js.Promise[TaskInstance] = js.native
  }
  
  trait TaskContextSolution extends StObject {
    
    var assistantSid: String
    
    var sid: String
  }
  object TaskContextSolution {
    
    inline def apply(assistantSid: String, sid: String): TaskContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskContextUpdateOptions extends StObject {
    
    /** A user-provided JSON object encoded as a string to specify the actions for this task. It is optional and non-unique. */
    var actions: js.UndefOr[Any] = js.undefined
    
    /** User-provided HTTP endpoint where from the assistant fetches actions */
    var actionsUrl: js.UndefOr[String] = js.undefined
    
    /** A user-provided string that identifies this resource. It is non-unique and can up to 255 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object TaskContextUpdateOptions {
    
    inline def apply(): TaskContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsUrl(value: String): Self = StObject.set(x, "actionsUrl", value.asInstanceOf[js.Any])
      
      inline def setActionsUrlUndefined: Self = StObject.set(x, "actionsUrl", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait TaskListInstanceCreateOptions extends StObject {
    
    /** A user-provided JSON object encoded as a string to specify the actions for this task. It is optional and non-unique. */
    var actions: js.UndefOr[Any] = js.undefined
    
    /** User-provided HTTP endpoint where from the assistant fetches actions */
    var actionsUrl: js.UndefOr[String] = js.undefined
    
    /** A user-provided string that identifies this resource. It is non-unique and can up to 255 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. */
    var uniqueName: String
  }
  object TaskListInstanceCreateOptions {
    
    inline def apply(uniqueName: String): TaskListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsUrl(value: String): Self = StObject.set(x, "actionsUrl", value.asInstanceOf[js.Any])
      
      inline def setActionsUrlUndefined: Self = StObject.set(x, "actionsUrl", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TaskInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TaskListInstanceEachOptions {
    
    inline def apply(): TaskListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskListInstanceEachOptions] (val x: Self) extends AnyVal {
      
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
  
  trait TaskListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TaskListInstanceOptions {
    
    inline def apply(): TaskListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait TaskListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object TaskListInstancePageOptions {
    
    inline def apply(): TaskListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskListInstancePageOptions] (val x: Self) extends AnyVal {
      
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
       with TwilioResponsePayload {
    
    var tasks: js.Array[TaskResource]
  }
  object TaskPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      tasks: js.Array[TaskResource],
      uri: String
    ): TaskPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskPayload] (val x: Self) extends AnyVal {
      
      inline def setTasks(value: js.Array[TaskResource]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksVarargs(value: TaskResource*): Self = StObject.set(x, "tasks", js.Array(value*))
    }
  }
  
  trait TaskResource extends StObject {
    
    var account_sid: String
    
    var actions_url: String
    
    var assistant_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: Record[String, String]
    
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
      links: Record[String, String],
      sid: String,
      unique_name: String,
      url: String
    ): TaskResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], actions_url = actions_url.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setActions_url(value: String): Self = StObject.set(x, "actions_url", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskSolution extends StObject {
    
    var assistantSid: String
  }
  object TaskSolution {
    
    inline def apply(assistantSid: String): TaskSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
}
