package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantModelBuildMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/modelBuild", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/modelBuild", "ModelBuildContext")
  @js.native
  open class ModelBuildContext protected () extends StObject {
    /**
      * Initialize the ModelBuildContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The assistant_sid
      * @param sid - The sid
      */
    def this(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String, sid: String) = this()
    
    /**
      * fetch a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ModelBuildInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildInstance, Any]): js.Promise[ModelBuildInstance] = js.native
    
    /**
      * remove a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ModelBuildInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildInstance, Any]): js.Promise[ModelBuildInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildInstance, Any]
    ): js.Promise[ModelBuildInstance] = js.native
    def update(opts: ModelBuildInstanceUpdateOptions): js.Promise[ModelBuildInstance] = js.native
    def update(
      opts: ModelBuildInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildInstance, Any]
    ): js.Promise[ModelBuildInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/modelBuild", "ModelBuildInstance")
  @js.native
  open class ModelBuildInstance protected () extends SerializableClass {
    /**
      * Initialize the ModelBuildContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The unique ID of the parent Assistant.
      * @param sid - The sid
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      payload: ModelBuildPayload,
      assistantSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: ModelBuildContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var buildDuration: Double = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var errorCode: Double = js.native
    
    /**
      * fetch a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ModelBuildInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ModelBuildInstance] = js.native
    
    /**
      * remove a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var status: ModelBuildStatus = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ModelBuildInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ModelBuildInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ModelBuildInstance] = js.native
    def update(opts: ModelBuildInstanceUpdateOptions): js.Promise[ModelBuildInstance] = js.native
    def update(
      opts: ModelBuildInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ModelBuildInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ModelBuildList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The unique ID of the parent Assistant.
    */
  inline def ModelBuildList(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String): ModelBuildListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ModelBuildList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any])).asInstanceOf[ModelBuildListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/modelBuild", "ModelBuildPage")
  @js.native
  open class ModelBuildPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewUnderstandMod.^, 
          ModelBuildPayload, 
          ModelBuildResource, 
          ModelBuildInstance
        ] {
    /**
      * Initialize the ModelBuildPage
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
      solution: ModelBuildSolution
    ) = this()
    
    /**
      * Build an instance of ModelBuildInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ModelBuildPayload): ModelBuildInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property uniqueName - A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. For example: v0.1
    */
  trait ModelBuildInstanceUpdateOptions extends StObject {
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object ModelBuildInstanceUpdateOptions {
    
    inline def apply(): ModelBuildInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelBuildInstanceUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildInstanceUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait ModelBuildListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ModelBuildContext = js.native
    
    /**
      * create a ModelBuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[ModelBuildInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ ModelBuildInstance, Any]): js.Promise[ModelBuildInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ModelBuildInstance, Any]
    ): js.Promise[ModelBuildInstance] = js.native
    def create(opts: ModelBuildListInstanceCreateOptions): js.Promise[ModelBuildInstance] = js.native
    def create(
      opts: ModelBuildListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ModelBuildInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ ModelBuildInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ModelBuildInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ModelBuildListInstanceEachOptions): Unit = js.native
    def each(
      opts: ModelBuildListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ModelBuildInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a model_build
      *
      * @param sid - The sid
      */
    def get(sid: String): ModelBuildContext = js.native
    
    /**
      * Retrieve a single target page of ModelBuildInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ModelBuildPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildPage, Any]): js.Promise[ModelBuildPage] = js.native
    def getPage(targetUrl: String): js.Promise[ModelBuildPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildPage, Any]
    ): js.Promise[ModelBuildPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildPage, Any]
    ): js.Promise[ModelBuildPage] = js.native
    
    /**
      * Lists ModelBuildInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ModelBuildInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ModelBuildInstance], Any]): js.Promise[js.Array[ModelBuildInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ModelBuildInstance], Any]
    ): js.Promise[js.Array[ModelBuildInstance]] = js.native
    def list(opts: ModelBuildListInstanceOptions): js.Promise[js.Array[ModelBuildInstance]] = js.native
    def list(
      opts: ModelBuildListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ModelBuildPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildPage, Any]): js.Promise[ModelBuildPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildPage, Any]): js.Promise[ModelBuildPage] = js.native
    def page(opts: ModelBuildListInstancePageOptions): js.Promise[ModelBuildPage] = js.native
    def page(
      opts: ModelBuildListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ModelBuildPage, Any]
    ): js.Promise[ModelBuildPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property statusCallback - The status_callback
    * @property uniqueName - A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. For example: v0.1
    */
  trait ModelBuildListInstanceCreateOptions extends StObject {
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
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
  trait ModelBuildListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ModelBuildInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  trait ModelBuildListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait ModelBuildListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
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
       with ModelBuildResource
       with TwilioResponsePayload
  object ModelBuildPayload {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      build_duration: Double,
      date_created: js.Date,
      date_updated: js.Date,
      error_code: Double,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: ModelBuildStatus,
      unique_name: String,
      uri: String,
      url: String
    ): ModelBuildPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], build_duration = build_duration.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelBuildPayload]
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
    
    var assistantSid: js.UndefOr[String] = js.undefined
  }
  object ModelBuildSolution {
    
    inline def apply(): ModelBuildSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelBuildSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelBuildSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
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
