package typings.twilio

import typings.std.Record
import typings.twilio.anon.CallbackEvents
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewUnderstandAssistantAssistantFallbackActionsMod.AssistantFallbackActionsContext
import typings.twilio.libRestPreviewUnderstandAssistantAssistantFallbackActionsMod.AssistantFallbackActionsListInstance
import typings.twilio.libRestPreviewUnderstandAssistantAssistantInitiationActionsMod.AssistantInitiationActionsContext
import typings.twilio.libRestPreviewUnderstandAssistantAssistantInitiationActionsMod.AssistantInitiationActionsListInstance
import typings.twilio.libRestPreviewUnderstandAssistantDialogueMod.DialogueContext
import typings.twilio.libRestPreviewUnderstandAssistantDialogueMod.DialogueListInstance
import typings.twilio.libRestPreviewUnderstandAssistantFieldTypeMod.FieldTypeContext
import typings.twilio.libRestPreviewUnderstandAssistantFieldTypeMod.FieldTypeListInstance
import typings.twilio.libRestPreviewUnderstandAssistantModelBuildMod.ModelBuildContext
import typings.twilio.libRestPreviewUnderstandAssistantModelBuildMod.ModelBuildListInstance
import typings.twilio.libRestPreviewUnderstandAssistantQueryMod.QueryContext
import typings.twilio.libRestPreviewUnderstandAssistantQueryMod.QueryListInstance
import typings.twilio.libRestPreviewUnderstandAssistantStyleSheetMod.StyleSheetContext
import typings.twilio.libRestPreviewUnderstandAssistantStyleSheetMod.StyleSheetListInstance
import typings.twilio.libRestPreviewUnderstandAssistantTaskMod.TaskContext
import typings.twilio.libRestPreviewUnderstandAssistantTaskMod.TaskListInstance
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant", "AssistantContextImpl")
  @js.native
  open class AssistantContextImpl protected ()
    extends StObject
       with AssistantContext {
    def this(_version: default, sid: String) = this()
    
    /* protected */ var _assistantFallbackActions: js.UndefOr[AssistantFallbackActionsListInstance] = js.native
    
    /* protected */ var _assistantInitiationActions: js.UndefOr[AssistantInitiationActionsListInstance] = js.native
    
    /* protected */ var _dialogues: js.UndefOr[DialogueListInstance] = js.native
    
    /* protected */ var _fieldTypes: js.UndefOr[FieldTypeListInstance] = js.native
    
    /* protected */ var _modelBuilds: js.UndefOr[ModelBuildListInstance] = js.native
    
    /* protected */ var _queries: js.UndefOr[QueryListInstance] = js.native
    
    /* protected */ var _solution: AssistantContextSolution = js.native
    
    /* protected */ var _styleSheet: js.UndefOr[StyleSheetListInstance] = js.native
    
    /* protected */ var _tasks: js.UndefOr[TaskListInstance] = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def dialogues: DialogueListInstance = js.native
    
    def fieldTypes: FieldTypeListInstance = js.native
    
    def modelBuilds: ModelBuildListInstance = js.native
    
    def queries: QueryListInstance = js.native
    
    def tasks: TaskListInstance = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[AssistantInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[AssistantInstance], Any]
    ): js.Promise[AssistantInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[AssistantInstance], Any]
    ): js.Promise[AssistantInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant", "AssistantInstance")
  @js.native
  open class AssistantInstance protected () extends StObject {
    def this(_version: default, payload: AssistantResource) = this()
    def this(_version: default, payload: AssistantResource, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[AssistantContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: AssistantContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Assistant.
      */
    var accountSid: String = js.native
    
    /**
      * Access the assistantFallbackActions.
      */
    def assistantFallbackActions(): AssistantFallbackActionsListInstance = js.native
    
    /**
      * Access the assistantInitiationActions.
      */
    def assistantInitiationActions(): AssistantInitiationActionsListInstance = js.native
    
    /**
      * Space-separated list of callback events that will trigger callbacks.
      */
    var callbackEvents: String = js.native
    
    /**
      * A user-provided URL to send event callbacks to.
      */
    var callbackUrl: String = js.native
    
    /**
      * The date that this resource was created
      */
    var dateCreated: js.Date = js.native
    
    /**
      * The date that this resource was last updated
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the dialogues.
      */
    def dialogues(): DialogueListInstance = js.native
    
    /**
      * Fetch a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInstance
      */
    def fetch(): js.Promise[AssistantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[AssistantInstance] = js.native
    
    /**
      * Access the fieldTypes.
      */
    def fieldTypes(): FieldTypeListInstance = js.native
    
    /**
      * A text description for the Assistant. It is non-unique and can up to 255 characters long.
      */
    var friendlyName: String = js.native
    
    /**
      * The unique ID (Sid) of the latest model build. Null if no model has been built.
      */
    var latestModelBuildSid: String = js.native
    
    var links: Record[String, String] = js.native
    
    /**
      * A boolean that specifies whether queries should be logged for 30 days further training. If false, no queries will be stored, if true, queries will be stored for 30 days and deleted thereafter.
      */
    var logQueries: Boolean = js.native
    
    /**
      * Access the modelBuilds.
      */
    def modelBuilds(): ModelBuildListInstance = js.native
    
    /**
      * Access the queries.
      */
    def queries(): QueryListInstance = js.native
    
    /**
      * Remove a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * A 34 character string that uniquely identifies this resource.
      */
    var sid: String = js.native
    
    /**
      * Access the styleSheet.
      */
    def styleSheet(): StyleSheetListInstance = js.native
    
    /**
      * Access the tasks.
      */
    def tasks(): TaskListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): CallbackEvents = js.native
    
    /**
      * A user-provided string that uniquely identifies this resource as an alternative to the sid. You can use the unique name in the URL path. Unique up to 64 characters long.
      */
    var uniqueName: String = js.native
    
    /**
      * Update a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInstance
      */
    def update(): js.Promise[AssistantInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[AssistantInstance] = js.native
    /**
      * Update a AssistantInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInstance
      */
    def update(params: AssistantContextUpdateOptions): js.Promise[AssistantInstance] = js.native
    def update(
      params: AssistantContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[AssistantInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait AssistantListInstance extends StObject {
    
    def apply(sid: String): AssistantContext = js.native
    
    var _solution: AssistantSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInstance
      */
    def create(): js.Promise[AssistantInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[AssistantInstance], Any]): js.Promise[AssistantInstance] = js.native
    /**
      * Create a AssistantInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInstance
      */
    def create(params: AssistantListInstanceCreateOptions): js.Promise[AssistantInstance] = js.native
    def create(
      params: AssistantListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[AssistantInstance], Any]
    ): js.Promise[AssistantInstance] = js.native
    
    /**
      * Streams AssistantInstance records from the API.
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
      * @param { AssistantListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ AssistantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: AssistantListInstanceEachOptions): Unit = js.native
    def each(
      params: AssistantListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AssistantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): AssistantContext = js.native
    
    /**
      * Retrieve a single target page of AssistantInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[AssistantPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantPage, Any]
    ): js.Promise[AssistantPage] = js.native
    
    /**
      * Lists AssistantInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { AssistantListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AssistantInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssistantInstance], Any]): js.Promise[js.Array[AssistantInstance]] = js.native
    def list(params: AssistantListInstanceOptions): js.Promise[js.Array[AssistantInstance]] = js.native
    def list(
      params: AssistantListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssistantInstance], Any]
    ): js.Promise[js.Array[AssistantInstance]] = js.native
    
    /**
      * Retrieve a single page of AssistantInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { AssistantListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[AssistantPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantPage, Any]): js.Promise[AssistantPage] = js.native
    def page(params: AssistantListInstancePageOptions): js.Promise[AssistantPage] = js.native
    def page(
      params: AssistantListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantPage, Any]
    ): js.Promise[AssistantPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object AssistantListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant", "AssistantListInstance")
    @js.native
    def apply(version: default): AssistantListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant", "AssistantPage")
  @js.native
  open class AssistantPage protected ()
    extends typings.twilio.libBasePageMod.default[default, AssistantPayload, AssistantResource, AssistantInstance] {
    /**
      * Initialize the AssistantPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: AssistantSolution
    ) = this()
    
    /**
      * Build an instance of AssistantInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AssistantResource): AssistantInstance = js.native
  }
  
  @js.native
  trait AssistantContext extends StObject {
    
    def assistantFallbackActions(): AssistantFallbackActionsContext = js.native
    @JSName("assistantFallbackActions")
    var assistantFallbackActions_Original: AssistantFallbackActionsListInstance = js.native
    
    def assistantInitiationActions(): AssistantInitiationActionsContext = js.native
    @JSName("assistantInitiationActions")
    var assistantInitiationActions_Original: AssistantInitiationActionsListInstance = js.native
    
    def dialogues(sid: String): DialogueContext = js.native
    @JSName("dialogues")
    var dialogues_Original: DialogueListInstance = js.native
    
    /**
      * Fetch a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInstance
      */
    def fetch(): js.Promise[AssistantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[AssistantInstance], Any]): js.Promise[AssistantInstance] = js.native
    
    def fieldTypes(sid: String): FieldTypeContext = js.native
    @JSName("fieldTypes")
    var fieldTypes_Original: FieldTypeListInstance = js.native
    
    def modelBuilds(sid: String): ModelBuildContext = js.native
    @JSName("modelBuilds")
    var modelBuilds_Original: ModelBuildListInstance = js.native
    
    def queries(sid: String): QueryContext = js.native
    @JSName("queries")
    var queries_Original: QueryListInstance = js.native
    
    /**
      * Remove a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    def styleSheet(): StyleSheetContext = js.native
    @JSName("styleSheet")
    var styleSheet_Original: StyleSheetListInstance = js.native
    
    def tasks(sid: String): TaskContext = js.native
    @JSName("tasks")
    var tasks_Original: TaskListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInstance
      */
    def update(): js.Promise[AssistantInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[AssistantInstance], Any]): js.Promise[AssistantInstance] = js.native
    /**
      * Update a AssistantInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInstance
      */
    def update(params: AssistantContextUpdateOptions): js.Promise[AssistantInstance] = js.native
    def update(
      params: AssistantContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[AssistantInstance], Any]
    ): js.Promise[AssistantInstance] = js.native
  }
  
  trait AssistantContextSolution extends StObject {
    
    var sid: String
  }
  object AssistantContextSolution {
    
    inline def apply(sid: String): AssistantContextSolution = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssistantContextUpdateOptions extends StObject {
    
    /** Space-separated list of callback events that will trigger callbacks. */
    var callbackEvents: js.UndefOr[String] = js.undefined
    
    /** A user-provided URL to send event callbacks to. */
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    /** The JSON actions to be executed when the user\\\'s input is not recognized as matching any Task. */
    var fallbackActions: js.UndefOr[Any] = js.undefined
    
    /** A text description for the Assistant. It is non-unique and can up to 255 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** The JSON actions to be executed on inbound phone calls when the Assistant has to say something first. */
    var initiationActions: js.UndefOr[Any] = js.undefined
    
    /** A boolean that specifies whether queries should be logged for 30 days further training. If false, no queries will be stored, if true, queries will be stored for 30 days and deleted thereafter. Defaults to true if no value is provided. */
    var logQueries: js.UndefOr[Boolean] = js.undefined
    
    /** The JSON object that holds the style sheet for the assistant */
    var styleSheet: js.UndefOr[Any] = js.undefined
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object AssistantContextUpdateOptions {
    
    inline def apply(): AssistantContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setCallbackEvents(value: String): Self = StObject.set(x, "callbackEvents", value.asInstanceOf[js.Any])
      
      inline def setCallbackEventsUndefined: Self = StObject.set(x, "callbackEvents", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setFallbackActions(value: Any): Self = StObject.set(x, "fallbackActions", value.asInstanceOf[js.Any])
      
      inline def setFallbackActionsUndefined: Self = StObject.set(x, "fallbackActions", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setInitiationActions(value: Any): Self = StObject.set(x, "initiationActions", value.asInstanceOf[js.Any])
      
      inline def setInitiationActionsUndefined: Self = StObject.set(x, "initiationActions", js.undefined)
      
      inline def setLogQueries(value: Boolean): Self = StObject.set(x, "logQueries", value.asInstanceOf[js.Any])
      
      inline def setLogQueriesUndefined: Self = StObject.set(x, "logQueries", js.undefined)
      
      inline def setStyleSheet(value: Any): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetUndefined: Self = StObject.set(x, "styleSheet", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait AssistantListInstanceCreateOptions extends StObject {
    
    /** Space-separated list of callback events that will trigger callbacks. */
    var callbackEvents: js.UndefOr[String] = js.undefined
    
    /** A user-provided URL to send event callbacks to. */
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    /** The JSON actions to be executed when the user\\\'s input is not recognized as matching any Task. */
    var fallbackActions: js.UndefOr[Any] = js.undefined
    
    /** A text description for the Assistant. It is non-unique and can up to 255 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** The JSON actions to be executed on inbound phone calls when the Assistant has to say something first. */
    var initiationActions: js.UndefOr[Any] = js.undefined
    
    /** A boolean that specifies whether queries should be logged for 30 days further training. If false, no queries will be stored, if true, queries will be stored for 30 days and deleted thereafter. Defaults to true if no value is provided. */
    var logQueries: js.UndefOr[Boolean] = js.undefined
    
    /** The JSON object that holds the style sheet for the assistant */
    var styleSheet: js.UndefOr[Any] = js.undefined
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object AssistantListInstanceCreateOptions {
    
    inline def apply(): AssistantListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setCallbackEvents(value: String): Self = StObject.set(x, "callbackEvents", value.asInstanceOf[js.Any])
      
      inline def setCallbackEventsUndefined: Self = StObject.set(x, "callbackEvents", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setFallbackActions(value: Any): Self = StObject.set(x, "fallbackActions", value.asInstanceOf[js.Any])
      
      inline def setFallbackActionsUndefined: Self = StObject.set(x, "fallbackActions", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setInitiationActions(value: Any): Self = StObject.set(x, "initiationActions", value.asInstanceOf[js.Any])
      
      inline def setInitiationActionsUndefined: Self = StObject.set(x, "initiationActions", js.undefined)
      
      inline def setLogQueries(value: Boolean): Self = StObject.set(x, "logQueries", value.asInstanceOf[js.Any])
      
      inline def setLogQueriesUndefined: Self = StObject.set(x, "logQueries", js.undefined)
      
      inline def setStyleSheet(value: Any): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetUndefined: Self = StObject.set(x, "styleSheet", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait AssistantListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AssistantInstance, 
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
  object AssistantListInstanceEachOptions {
    
    inline def apply(): AssistantListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ AssistantInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait AssistantListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AssistantListInstanceOptions {
    
    inline def apply(): AssistantListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait AssistantListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AssistantListInstancePageOptions {
    
    inline def apply(): AssistantListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait AssistantPayload
    extends StObject
       with TwilioResponsePayload {
    
    var assistants: js.Array[AssistantResource]
  }
  object AssistantPayload {
    
    inline def apply(
      assistants: js.Array[AssistantResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): AssistantPayload = {
      val __obj = js.Dynamic.literal(assistants = assistants.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantPayload] (val x: Self) extends AnyVal {
      
      inline def setAssistants(value: js.Array[AssistantResource]): Self = StObject.set(x, "assistants", value.asInstanceOf[js.Any])
      
      inline def setAssistantsVarargs(value: AssistantResource*): Self = StObject.set(x, "assistants", js.Array(value*))
    }
  }
  
  trait AssistantResource extends StObject {
    
    var account_sid: String
    
    var callback_events: String
    
    var callback_url: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var latest_model_build_sid: String
    
    var links: Record[String, String]
    
    var log_queries: Boolean
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object AssistantResource {
    
    inline def apply(
      account_sid: String,
      callback_events: String,
      callback_url: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      latest_model_build_sid: String,
      links: Record[String, String],
      log_queries: Boolean,
      sid: String,
      unique_name: String,
      url: String
    ): AssistantResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], callback_events = callback_events.asInstanceOf[js.Any], callback_url = callback_url.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], latest_model_build_sid = latest_model_build_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], log_queries = log_queries.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCallback_events(value: String): Self = StObject.set(x, "callback_events", value.asInstanceOf[js.Any])
      
      inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLatest_model_build_sid(value: String): Self = StObject.set(x, "latest_model_build_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLog_queries(value: Boolean): Self = StObject.set(x, "log_queries", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssistantSolution extends StObject
}
