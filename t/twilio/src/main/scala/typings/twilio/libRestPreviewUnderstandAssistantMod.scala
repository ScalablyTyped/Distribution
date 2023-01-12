package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant", "AssistantContext")
  @js.native
  open class AssistantContext protected () extends StObject {
    /**
      * Initialize the AssistantContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(version: typings.twilio.libRestPreviewUnderstandMod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def assistantFallbackActions(sid: String): AssistantFallbackActionsContext = js.native
    @JSName("assistantFallbackActions")
    var assistantFallbackActions_Original: AssistantFallbackActionsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def assistantInitiationActions(sid: String): AssistantInitiationActionsContext = js.native
    @JSName("assistantInitiationActions")
    var assistantInitiationActions_Original: AssistantInitiationActionsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def dialogues(sid: String): DialogueContext = js.native
    @JSName("dialogues")
    var dialogues_Original: DialogueListInstance = js.native
    
    /**
      * fetch a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssistantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantInstance, Any]): js.Promise[AssistantInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def fieldTypes(sid: String): FieldTypeContext = js.native
    @JSName("fieldTypes")
    var fieldTypes_Original: FieldTypeListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def modelBuilds(sid: String): ModelBuildContext = js.native
    @JSName("modelBuilds")
    var modelBuilds_Original: ModelBuildListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def queries(sid: String): QueryContext = js.native
    @JSName("queries")
    var queries_Original: QueryListInstance = js.native
    
    /**
      * remove a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def styleSheet(sid: String): StyleSheetContext = js.native
    @JSName("styleSheet")
    var styleSheet_Original: StyleSheetListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def tasks(sid: String): TaskContext = js.native
    @JSName("tasks")
    var tasks_Original: TaskListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AssistantInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantInstance, Any]): js.Promise[AssistantInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantInstance, Any]
    ): js.Promise[AssistantInstance] = js.native
    def update(opts: AssistantInstanceUpdateOptions): js.Promise[AssistantInstance] = js.native
    def update(
      opts: AssistantInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantInstance, Any]
    ): js.Promise[AssistantInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant", "AssistantInstance")
  @js.native
  open class AssistantInstance protected () extends SerializableClass {
    /**
      * Initialize the AssistantContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(version: typings.twilio.libRestPreviewUnderstandMod.^, payload: AssistantPayload, sid: String) = this()
    
    /* private */ var _proxy: AssistantContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the assistantFallbackActions
      */
    def assistantFallbackActions(): AssistantFallbackActionsListInstance = js.native
    
    /**
      * Access the assistantInitiationActions
      */
    def assistantInitiationActions(): AssistantInitiationActionsListInstance = js.native
    
    var callbackEvents: String = js.native
    
    var callbackUrl: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the dialogues
      */
    def dialogues(): DialogueListInstance = js.native
    
    /**
      * fetch a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssistantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssistantInstance] = js.native
    
    /**
      * Access the fieldTypes
      */
    def fieldTypes(): FieldTypeListInstance = js.native
    
    var friendlyName: String = js.native
    
    var latestModelBuildSid: String = js.native
    
    var links: String = js.native
    
    var logQueries: Boolean = js.native
    
    /**
      * Access the modelBuilds
      */
    def modelBuilds(): ModelBuildListInstance = js.native
    
    /**
      * Access the queries
      */
    def queries(): QueryListInstance = js.native
    
    /**
      * remove a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * Access the styleSheet
      */
    def styleSheet(): StyleSheetListInstance = js.native
    
    /**
      * Access the tasks
      */
    def tasks(): TaskListInstance = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AssistantInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssistantInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssistantInstance] = js.native
    def update(opts: AssistantInstanceUpdateOptions): js.Promise[AssistantInstance] = js.native
    def update(
      opts: AssistantInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[AssistantInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AssistantList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def AssistantList(version: typings.twilio.libRestPreviewUnderstandMod.^): AssistantListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("AssistantList")(version.asInstanceOf[js.Any]).asInstanceOf[AssistantListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant", "AssistantPage")
  @js.native
  open class AssistantPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewUnderstandMod.^, 
          AssistantPayload, 
          AssistantResource, 
          AssistantInstance
        ] {
    /**
      * Initialize the AssistantPage
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
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
      solution: AssistantSolution
    ) = this()
    
    /**
      * Build an instance of AssistantInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AssistantPayload): AssistantInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property callbackEvents - Space-separated list of callback events that will trigger callbacks.
    * @property callbackUrl - A user-provided URL to send event callbacks to.
    * @property fallbackActions - The JSON actions to be executed when the user's input is not recognized as matching any Task.
    * @property friendlyName - A text description for the Assistant. It is non-unique and can up to 255 characters long.
    * @property initiationActions - The JSON actions to be executed on inbound phone calls when the Assistant has to say something first.
    * @property logQueries - A boolean that specifies whether queries should be logged for 30 days further training. If false, no queries will be stored, if true, queries will be stored for 30 days and deleted thereafter. Defaults to true if no value is provided.
    * @property styleSheet - The JSON object that holds the style sheet for the assistant
    * @property uniqueName - A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
    */
  trait AssistantInstanceUpdateOptions extends StObject {
    
    var callbackEvents: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var fallbackActions: js.UndefOr[js.Object] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var initiationActions: js.UndefOr[js.Object] = js.undefined
    
    var logQueries: js.UndefOr[Boolean] = js.undefined
    
    var styleSheet: js.UndefOr[js.Object] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object AssistantInstanceUpdateOptions {
    
    inline def apply(): AssistantInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantInstanceUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantInstanceUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setCallbackEvents(value: String): Self = StObject.set(x, "callbackEvents", value.asInstanceOf[js.Any])
      
      inline def setCallbackEventsUndefined: Self = StObject.set(x, "callbackEvents", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setFallbackActions(value: js.Object): Self = StObject.set(x, "fallbackActions", value.asInstanceOf[js.Any])
      
      inline def setFallbackActionsUndefined: Self = StObject.set(x, "fallbackActions", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setInitiationActions(value: js.Object): Self = StObject.set(x, "initiationActions", value.asInstanceOf[js.Any])
      
      inline def setInitiationActionsUndefined: Self = StObject.set(x, "initiationActions", js.undefined)
      
      inline def setLogQueries(value: Boolean): Self = StObject.set(x, "logQueries", value.asInstanceOf[js.Any])
      
      inline def setLogQueriesUndefined: Self = StObject.set(x, "logQueries", js.undefined)
      
      inline def setStyleSheet(value: js.Object): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetUndefined: Self = StObject.set(x, "styleSheet", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait AssistantListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AssistantContext = js.native
    
    /**
      * create a AssistantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[AssistantInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ AssistantInstance, Any]): js.Promise[AssistantInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ AssistantInstance, Any]): js.Promise[AssistantInstance] = js.native
    def create(opts: AssistantListInstanceCreateOptions): js.Promise[AssistantInstance] = js.native
    def create(
      opts: AssistantListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ AssistantInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ AssistantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AssistantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AssistantListInstanceEachOptions): Unit = js.native
    def each(
      opts: AssistantListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AssistantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a assistant
      *
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def get(sid: String): AssistantContext = js.native
    
    /**
      * Retrieve a single target page of AssistantInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AssistantPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantPage, Any]): js.Promise[AssistantPage] = js.native
    def getPage(targetUrl: String): js.Promise[AssistantPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantPage, Any]
    ): js.Promise[AssistantPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantPage, Any]
    ): js.Promise[AssistantPage] = js.native
    
    /**
      * Lists AssistantInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AssistantInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssistantInstance], Any]): js.Promise[js.Array[AssistantInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssistantInstance], Any]
    ): js.Promise[js.Array[AssistantInstance]] = js.native
    def list(opts: AssistantListInstanceOptions): js.Promise[js.Array[AssistantInstance]] = js.native
    def list(
      opts: AssistantListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AssistantPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantPage, Any]): js.Promise[AssistantPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantPage, Any]): js.Promise[AssistantPage] = js.native
    def page(opts: AssistantListInstancePageOptions): js.Promise[AssistantPage] = js.native
    def page(
      opts: AssistantListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantPage, Any]
    ): js.Promise[AssistantPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property callbackEvents - Space-separated list of callback events that will trigger callbacks.
    * @property callbackUrl - A user-provided URL to send event callbacks to.
    * @property fallbackActions - The JSON actions to be executed when the user's input is not recognized as matching any Task.
    * @property friendlyName - A text description for the Assistant. It is non-unique and can up to 255 characters long.
    * @property initiationActions - The JSON actions to be executed on inbound phone calls when the Assistant has to say something first.
    * @property logQueries - A boolean that specifies whether queries should be logged for 30 days further training. If false, no queries will be stored, if true, queries will be stored for 30 days and deleted thereafter. Defaults to true if no value is provided.
    * @property styleSheet - The JSON object that holds the style sheet for the assistant
    * @property uniqueName - A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
    */
  trait AssistantListInstanceCreateOptions extends StObject {
    
    var callbackEvents: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var fallbackActions: js.UndefOr[js.Object] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var initiationActions: js.UndefOr[js.Object] = js.undefined
    
    var logQueries: js.UndefOr[Boolean] = js.undefined
    
    var styleSheet: js.UndefOr[js.Object] = js.undefined
    
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
      
      inline def setFallbackActions(value: js.Object): Self = StObject.set(x, "fallbackActions", value.asInstanceOf[js.Any])
      
      inline def setFallbackActionsUndefined: Self = StObject.set(x, "fallbackActions", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setInitiationActions(value: js.Object): Self = StObject.set(x, "initiationActions", value.asInstanceOf[js.Any])
      
      inline def setInitiationActionsUndefined: Self = StObject.set(x, "initiationActions", js.undefined)
      
      inline def setLogQueries(value: Boolean): Self = StObject.set(x, "logQueries", value.asInstanceOf[js.Any])
      
      inline def setLogQueriesUndefined: Self = StObject.set(x, "logQueries", js.undefined)
      
      inline def setStyleSheet(value: js.Object): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetUndefined: Self = StObject.set(x, "styleSheet", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
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
  trait AssistantListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AssistantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  trait AssistantListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait AssistantListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
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
       with AssistantResource
       with TwilioResponsePayload
  object AssistantPayload {
    
    inline def apply(
      account_sid: String,
      callback_events: String,
      callback_url: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      latest_model_build_sid: String,
      links: String,
      log_queries: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): AssistantPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], callback_events = callback_events.asInstanceOf[js.Any], callback_url = callback_url.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], latest_model_build_sid = latest_model_build_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], log_queries = log_queries.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantPayload]
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
    
    var links: String
    
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
      links: String,
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
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLog_queries(value: Boolean): Self = StObject.set(x, "log_queries", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssistantSolution extends StObject
}
