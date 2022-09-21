package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.asc_
import typings.twilio.twilioStrings.desc_
import typings.twilio.twilioStrings.ended
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaProcessorMod {
  
  @JSImport("twilio/lib/rest/media/v1/mediaProcessor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/media/v1/mediaProcessor", "MediaProcessorContext")
  @js.native
  open class MediaProcessorContext protected () extends StObject {
    /**
      * Initialize the MediaProcessorContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.mediaV1Mod.^, sid: String) = this()
    
    /**
      * fetch a MediaProcessorInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MediaProcessorInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaProcessorInstance, Any]): js.Promise[MediaProcessorInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a MediaProcessorInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: MediaProcessorInstanceUpdateOptions): js.Promise[MediaProcessorInstance] = js.native
    def update(
      opts: MediaProcessorInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaProcessorInstance, Any]
    ): js.Promise[MediaProcessorInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/media/v1/mediaProcessor", "MediaProcessorInstance")
  @js.native
  open class MediaProcessorInstance protected () extends SerializableClass {
    /**
      * Initialize the MediaProcessorContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.mediaV1Mod.^, payload: MediaProcessorPayload, sid: String) = this()
    
    /* private */ var _proxy: MediaProcessorContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var endedReason: String = js.native
    
    var `extension`: String = js.native
    
    var extensionContext: String = js.native
    
    /**
      * fetch a MediaProcessorInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MediaProcessorInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MediaProcessorInstance] = js.native
    
    var maxDuration: Double = js.native
    
    var sid: String = js.native
    
    var status: MediaProcessorStatus = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    /**
      * update a MediaProcessorInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: MediaProcessorInstanceUpdateOptions): js.Promise[MediaProcessorInstance] = js.native
    def update(
      opts: MediaProcessorInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[MediaProcessorInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the MediaProcessorList
    *
    * @param version - Version of the resource
    */
  inline def MediaProcessorList(version: typings.twilio.mediaV1Mod.^): MediaProcessorListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaProcessorList")(version.asInstanceOf[js.Any]).asInstanceOf[MediaProcessorListInstance]
  
  @JSImport("twilio/lib/rest/media/v1/mediaProcessor", "MediaProcessorPage")
  @js.native
  open class MediaProcessorPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.mediaV1Mod.^, 
          MediaProcessorPayload, 
          MediaProcessorResource, 
          MediaProcessorInstance
        ] {
    /**
      * Initialize the MediaProcessorPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.mediaV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: MediaProcessorSolution
    ) = this()
    
    /**
      * Build an instance of MediaProcessorInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: MediaProcessorPayload): MediaProcessorInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property status - The status of the MediaProcessor
    */
  trait MediaProcessorInstanceUpdateOptions extends StObject {
    
    var status: MediaProcessorUpdateStatus
  }
  object MediaProcessorInstanceUpdateOptions {
    
    inline def apply(status: MediaProcessorUpdateStatus): MediaProcessorInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaProcessorInstanceUpdateOptions]
    }
    
    extension [Self <: MediaProcessorInstanceUpdateOptions](x: Self) {
      
      inline def setStatus(value: MediaProcessorUpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaProcessorListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): MediaProcessorContext = js.native
    
    /**
      * create a MediaProcessorInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: MediaProcessorListInstanceCreateOptions): js.Promise[MediaProcessorInstance] = js.native
    def create(
      opts: MediaProcessorListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ MediaProcessorInstance, Any]
    ): js.Promise[MediaProcessorInstance] = js.native
    
    /**
      * Streams MediaProcessorInstance records from the API.
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
          /* item */ MediaProcessorInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ MediaProcessorInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: MediaProcessorListInstanceEachOptions): Unit = js.native
    def each(
      opts: MediaProcessorListInstanceEachOptions,
      callback: js.Function2[
          /* item */ MediaProcessorInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a media_processor
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): MediaProcessorContext = js.native
    
    /**
      * Retrieve a single target page of MediaProcessorInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[MediaProcessorPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaProcessorPage, Any]): js.Promise[MediaProcessorPage] = js.native
    def getPage(targetUrl: String): js.Promise[MediaProcessorPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaProcessorPage, Any]
    ): js.Promise[MediaProcessorPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaProcessorPage, Any]
    ): js.Promise[MediaProcessorPage] = js.native
    
    /**
      * Lists MediaProcessorInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[MediaProcessorInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MediaProcessorInstance], Any]
    ): js.Promise[js.Array[MediaProcessorInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MediaProcessorInstance], Any]
    ): js.Promise[js.Array[MediaProcessorInstance]] = js.native
    def list(opts: MediaProcessorListInstanceOptions): js.Promise[js.Array[MediaProcessorInstance]] = js.native
    def list(
      opts: MediaProcessorListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MediaProcessorInstance], Any]
    ): js.Promise[js.Array[MediaProcessorInstance]] = js.native
    
    /**
      * Retrieve a single page of MediaProcessorInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[MediaProcessorPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaProcessorPage, Any]): js.Promise[MediaProcessorPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaProcessorPage, Any]
    ): js.Promise[MediaProcessorPage] = js.native
    def page(opts: MediaProcessorListInstancePageOptions): js.Promise[MediaProcessorPage] = js.native
    def page(
      opts: MediaProcessorListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaProcessorPage, Any]
    ): js.Promise[MediaProcessorPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property extension - The Media Extension name or URL
    * @property extensionContext - The Media Extension context
    * @property extensionEnvironment - The Media Extension environment
    * @property maxDuration - Maximum MediaProcessor duration in minutes
    * @property statusCallback - The URL to send MediaProcessor event updates to your application
    * @property statusCallbackMethod - The HTTP method Twilio should use to call the `status_callback` URL
    */
  trait MediaProcessorListInstanceCreateOptions extends StObject {
    
    var `extension`: String
    
    var extensionContext: String
    
    var extensionEnvironment: js.UndefOr[js.Object] = js.undefined
    
    var maxDuration: js.UndefOr[Double] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
  }
  object MediaProcessorListInstanceCreateOptions {
    
    inline def apply(`extension`: String, extensionContext: String): MediaProcessorListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(extensionContext = extensionContext.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaProcessorListInstanceCreateOptions]
    }
    
    extension [Self <: MediaProcessorListInstanceCreateOptions](x: Self) {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionContext(value: String): Self = StObject.set(x, "extensionContext", value.asInstanceOf[js.Any])
      
      inline def setExtensionEnvironment(value: js.Object): Self = StObject.set(x, "extensionEnvironment", value.asInstanceOf[js.Any])
      
      inline def setExtensionEnvironmentUndefined: Self = StObject.set(x, "extensionEnvironment", js.undefined)
      
      inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
      
      inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
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
    * @property order - The sort order of the list
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property status - Status to filter by
    */
  trait MediaProcessorListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ MediaProcessorInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[MediaProcessorOrder] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[MediaProcessorStatus] = js.undefined
  }
  object MediaProcessorListInstanceEachOptions {
    
    inline def apply(): MediaProcessorListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaProcessorListInstanceEachOptions]
    }
    
    extension [Self <: MediaProcessorListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ MediaProcessorInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: MediaProcessorOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: MediaProcessorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property order - The sort order of the list
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property status - Status to filter by
    */
  trait MediaProcessorListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[MediaProcessorOrder] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[MediaProcessorStatus] = js.undefined
  }
  object MediaProcessorListInstanceOptions {
    
    inline def apply(): MediaProcessorListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaProcessorListInstanceOptions]
    }
    
    extension [Self <: MediaProcessorListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: MediaProcessorOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: MediaProcessorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property order - The sort order of the list
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - Status to filter by
    */
  trait MediaProcessorListInstancePageOptions extends StObject {
    
    var order: js.UndefOr[MediaProcessorOrder] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[MediaProcessorStatus] = js.undefined
  }
  object MediaProcessorListInstancePageOptions {
    
    inline def apply(): MediaProcessorListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaProcessorListInstancePageOptions]
    }
    
    extension [Self <: MediaProcessorListInstancePageOptions](x: Self) {
      
      inline def setOrder(value: MediaProcessorOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: MediaProcessorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.asc_
    - typings.twilio.twilioStrings.desc_
  */
  trait MediaProcessorOrder extends StObject
  object MediaProcessorOrder {
    
    inline def asc: asc_ = "asc".asInstanceOf[asc_]
    
    inline def desc: desc_ = "desc".asInstanceOf[desc_]
  }
  
  trait MediaProcessorPayload
    extends StObject
       with MediaProcessorResource
       with TwilioResponsePayload
  object MediaProcessorPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      ended_reason: String,
      `extension`: String,
      extension_context: String,
      first_page_uri: String,
      max_duration: Double,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: MediaProcessorStatus,
      status_callback: String,
      status_callback_method: String,
      uri: String,
      url: String
    ): MediaProcessorPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], ended_reason = ended_reason.asInstanceOf[js.Any], extension_context = extension_context.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], max_duration = max_duration.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaProcessorPayload]
    }
  }
  
  trait MediaProcessorResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var ended_reason: String
    
    var `extension`: String
    
    var extension_context: String
    
    var max_duration: Double
    
    var sid: String
    
    var status: MediaProcessorStatus
    
    var status_callback: String
    
    var status_callback_method: String
    
    var url: String
  }
  object MediaProcessorResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      ended_reason: String,
      `extension`: String,
      extension_context: String,
      max_duration: Double,
      sid: String,
      status: MediaProcessorStatus,
      status_callback: String,
      status_callback_method: String,
      url: String
    ): MediaProcessorResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], ended_reason = ended_reason.asInstanceOf[js.Any], extension_context = extension_context.asInstanceOf[js.Any], max_duration = max_duration.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaProcessorResource]
    }
    
    extension [Self <: MediaProcessorResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnded_reason(value: String): Self = StObject.set(x, "ended_reason", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtension_context(value: String): Self = StObject.set(x, "extension_context", value.asInstanceOf[js.Any])
      
      inline def setMax_duration(value: Double): Self = StObject.set(x, "max_duration", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: MediaProcessorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaProcessorSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.started
    - typings.twilio.twilioStrings.ended
  */
  trait MediaProcessorStatus extends StObject
  object MediaProcessorStatus {
    
    inline def ended: typings.twilio.twilioStrings.ended = "ended".asInstanceOf[typings.twilio.twilioStrings.ended]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def started: typings.twilio.twilioStrings.started = "started".asInstanceOf[typings.twilio.twilioStrings.started]
  }
  
  type MediaProcessorUpdateStatus = ended
}
