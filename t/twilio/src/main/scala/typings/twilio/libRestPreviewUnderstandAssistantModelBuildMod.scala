package typings.twilio

import typings.twilio.anon.BuildDuration
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantModelBuildMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/modelBuild", "ModelBuildContextImpl")
  @js.native
  open class ModelBuildContextImpl protected ()
    extends StObject
       with ModelBuildContext {
    def this(_version: default, assistantSid: String, sid: String) = this()
    
    /* protected */ var _solution: ModelBuildContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ModelBuildInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ModelBuildInstance], Any]
    ): js.Promise[ModelBuildInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ModelBuildInstance], Any]
    ): js.Promise[ModelBuildInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/modelBuild", "ModelBuildInstance")
  @js.native
  open class ModelBuildInstance protected () extends StObject {
    def this(_version: default, payload: ModelBuildResource, assistantSid: String) = this()
    def this(_version: default, payload: ModelBuildResource, assistantSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[ModelBuildContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: ModelBuildContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Model Build.
      */
    var accountSid: String = js.native
    
    /**
      * The unique ID of the parent Assistant.
      */
    var assistantSid: String = js.native
    
    /**
      * The time in seconds it took to build the model.
      */
    var buildDuration: Double = js.native
    
    /**
      * The date that this resource was created
      */
    var dateCreated: js.Date = js.native
    
    /**
      * The date that this resource was last updated
      */
    var dateUpdated: js.Date = js.native
    
    var errorCode: Double = js.native
    
    /**
      * Fetch a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ModelBuildInstance
      */
    def fetch(): js.Promise[ModelBuildInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[ModelBuildInstance] = js.native
    
    /**
      * Remove a ModelBuildInstance
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
    
    var status: ModelBuildStatus = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): BuildDuration = js.native
    
    /**
      * A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
      */
    var uniqueName: String = js.native
    
    /**
      * Update a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ModelBuildInstance
      */
    def update(): js.Promise[ModelBuildInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[ModelBuildInstance] = js.native
    /**
      * Update a ModelBuildInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ModelBuildInstance
      */
    def update(params: ModelBuildContextUpdateOptions): js.Promise[ModelBuildInstance] = js.native
    def update(
      params: ModelBuildContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[ModelBuildInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait ModelBuildListInstance extends StObject {
    
    def apply(sid: String): ModelBuildContext = js.native
    
    var _solution: ModelBuildSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ModelBuildInstance
      */
    def create(): js.Promise[ModelBuildInstance] = js.native
    def create(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ModelBuildInstance], Any]
    ): js.Promise[ModelBuildInstance] = js.native
    /**
      * Create a ModelBuildInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ModelBuildInstance
      */
    def create(params: ModelBuildListInstanceCreateOptions): js.Promise[ModelBuildInstance] = js.native
    def create(
      params: ModelBuildListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ModelBuildInstance], Any]
    ): js.Promise[ModelBuildInstance] = js.native
    
    /**
      * Streams ModelBuildInstance records from the API.
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
      * @param { ModelBuildListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ ModelBuildInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: ModelBuildListInstanceEachOptions): Unit = js.native
    def each(
      params: ModelBuildListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ModelBuildInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): ModelBuildContext = js.native
    
    /**
      * Retrieve a single target page of ModelBuildInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[ModelBuildPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildPage, Any]
    ): js.Promise[ModelBuildPage] = js.native
    
    /**
      * Lists ModelBuildInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { ModelBuildListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ModelBuildInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ModelBuildInstance], Any]): js.Promise[js.Array[ModelBuildInstance]] = js.native
    def list(params: ModelBuildListInstanceOptions): js.Promise[js.Array[ModelBuildInstance]] = js.native
    def list(
      params: ModelBuildListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ModelBuildInstance], Any]
    ): js.Promise[js.Array[ModelBuildInstance]] = js.native
    
    /**
      * Retrieve a single page of ModelBuildInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { ModelBuildListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[ModelBuildPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildPage, Any]): js.Promise[ModelBuildPage] = js.native
    def page(params: ModelBuildListInstancePageOptions): js.Promise[ModelBuildPage] = js.native
    def page(
      params: ModelBuildListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildPage, Any]
    ): js.Promise[ModelBuildPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object ModelBuildListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/modelBuild", "ModelBuildListInstance")
    @js.native
    def apply(version: default, assistantSid: String): ModelBuildListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/modelBuild", "ModelBuildPage")
  @js.native
  open class ModelBuildPage protected ()
    extends typings.twilio.libBasePageMod.default[default, ModelBuildPayload, ModelBuildResource, ModelBuildInstance] {
    /**
      * Initialize the ModelBuildPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: ModelBuildSolution
    ) = this()
    
    /**
      * Build an instance of ModelBuildInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ModelBuildResource): ModelBuildInstance = js.native
  }
  
  @js.native
  trait ModelBuildContext extends StObject {
    
    /**
      * Fetch a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ModelBuildInstance
      */
    def fetch(): js.Promise[ModelBuildInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ModelBuildInstance], Any]
    ): js.Promise[ModelBuildInstance] = js.native
    
    /**
      * Remove a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ModelBuildInstance
      */
    def update(): js.Promise[ModelBuildInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ModelBuildInstance], Any]
    ): js.Promise[ModelBuildInstance] = js.native
    /**
      * Update a ModelBuildInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ModelBuildInstance
      */
    def update(params: ModelBuildContextUpdateOptions): js.Promise[ModelBuildInstance] = js.native
    def update(
      params: ModelBuildContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ModelBuildInstance], Any]
    ): js.Promise[ModelBuildInstance] = js.native
  }
  
  trait ModelBuildContextSolution extends StObject {
    
    var assistantSid: String
    
    var sid: String
  }
  object ModelBuildContextSolution {
    
    inline def apply(assistantSid: String, sid: String): ModelBuildContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelBuildContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModelBuildContextUpdateOptions extends StObject {
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. For example: v0.1 */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object ModelBuildContextUpdateOptions {
    
    inline def apply(): ModelBuildContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelBuildContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait ModelBuildListInstanceCreateOptions extends StObject {
    
    /**  */
    var statusCallback: js.UndefOr[String] = js.undefined
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. For example: v0.1 */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object ModelBuildListInstanceCreateOptions {
    
    inline def apply(): ModelBuildListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelBuildListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait ModelBuildListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ModelBuildInstance, 
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
  object ModelBuildListInstanceEachOptions {
    
    inline def apply(): ModelBuildListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelBuildListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ ModelBuildInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait ModelBuildListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ModelBuildListInstanceOptions {
    
    inline def apply(): ModelBuildListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelBuildListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait ModelBuildListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ModelBuildListInstancePageOptions {
    
    inline def apply(): ModelBuildListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelBuildListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ModelBuildPayload
    extends StObject
       with TwilioResponsePayload {
    
    var model_builds: js.Array[ModelBuildResource]
  }
  object ModelBuildPayload {
    
    inline def apply(
      first_page_uri: String,
      model_builds: js.Array[ModelBuildResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): ModelBuildPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], model_builds = model_builds.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelBuildPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildPayload] (val x: Self) extends AnyVal {
      
      inline def setModel_builds(value: js.Array[ModelBuildResource]): Self = StObject.set(x, "model_builds", value.asInstanceOf[js.Any])
      
      inline def setModel_buildsVarargs(value: ModelBuildResource*): Self = StObject.set(x, "model_builds", js.Array(value*))
    }
  }
  
  trait ModelBuildResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var build_duration: Double
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var error_code: Double
    
    var sid: String
    
    var status: ModelBuildStatus
    
    var unique_name: String
    
    var url: String
  }
  object ModelBuildResource {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      build_duration: Double,
      date_created: js.Date,
      date_updated: js.Date,
      error_code: Double,
      sid: String,
      status: ModelBuildStatus,
      unique_name: String,
      url: String
    ): ModelBuildResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], build_duration = build_duration.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelBuildResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setBuild_duration(value: Double): Self = StObject.set(x, "build_duration", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ModelBuildStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModelBuildSolution extends StObject {
    
    var assistantSid: String
  }
  object ModelBuildSolution {
    
    inline def apply(assistantSid: String): ModelBuildSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelBuildSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.enqueued
    - typings.twilio.twilioStrings.building
    - typings.twilio.twilioStrings.completed
    - typings.twilio.twilioStrings.failed
    - typings.twilio.twilioStrings.canceled
  */
  trait ModelBuildStatus extends StObject
  object ModelBuildStatus {
    
    inline def building: typings.twilio.twilioStrings.building = "building".asInstanceOf[typings.twilio.twilioStrings.building]
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def completed: typings.twilio.twilioStrings.completed = "completed".asInstanceOf[typings.twilio.twilioStrings.completed]
    
    inline def enqueued: typings.twilio.twilioStrings.enqueued = "enqueued".asInstanceOf[typings.twilio.twilioStrings.enqueued]
    
    inline def failed: typings.twilio.twilioStrings.failed = "failed".asInstanceOf[typings.twilio.twilioStrings.failed]
  }
}
