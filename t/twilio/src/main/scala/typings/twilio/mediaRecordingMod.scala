package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.asc_
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.deleted_
import typings.twilio.twilioStrings.desc_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRecordingMod {
  
  @JSImport("twilio/lib/rest/media/v1/mediaRecording", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/media/v1/mediaRecording", "MediaRecordingContext")
  @js.native
  open class MediaRecordingContext protected () extends StObject {
    /**
      * Initialize the MediaRecordingContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.mediaV1Mod.^, sid: String) = this()
    
    /**
      * fetch a MediaRecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MediaRecordingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaRecordingInstance, Any]): js.Promise[MediaRecordingInstance] = js.native
    
    /**
      * remove a MediaRecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaRecordingInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/media/v1/mediaRecording", "MediaRecordingInstance")
  @js.native
  open class MediaRecordingInstance protected () extends SerializableClass {
    /**
      * Initialize the MediaRecordingContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.mediaV1Mod.^, payload: MediaRecordingPayload, sid: String) = this()
    
    /* private */ var _proxy: MediaRecordingContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var duration: Double = js.native
    
    /**
      * fetch a MediaRecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MediaRecordingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MediaRecordingInstance] = js.native
    
    var format: MediaRecordingFormat = js.native
    
    var links: String = js.native
    
    var mediaSize: Double = js.native
    
    var processorSid: String = js.native
    
    /**
      * remove a MediaRecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var resolution: String = js.native
    
    var sid: String = js.native
    
    var sourceSid: String = js.native
    
    var status: MediaRecordingStatus = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the MediaRecordingList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def MediaRecordingList(version: typings.twilio.mediaV1Mod.^): MediaRecordingListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaRecordingList")(version.asInstanceOf[js.Any]).asInstanceOf[MediaRecordingListInstance]
  
  @JSImport("twilio/lib/rest/media/v1/mediaRecording", "MediaRecordingPage")
  @js.native
  open class MediaRecordingPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.mediaV1Mod.^, 
          MediaRecordingPayload, 
          MediaRecordingResource, 
          MediaRecordingInstance
        ] {
    /**
      * Initialize the MediaRecordingPage
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
      version: typings.twilio.mediaV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: MediaRecordingSolution
    ) = this()
    
    /**
      * Build an instance of MediaRecordingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: MediaRecordingPayload): MediaRecordingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.mp4
    - typings.twilio.twilioStrings.webm
  */
  trait MediaRecordingFormat extends StObject
  object MediaRecordingFormat {
    
    inline def mp4: typings.twilio.twilioStrings.mp4 = "mp4".asInstanceOf[typings.twilio.twilioStrings.mp4]
    
    inline def webm: typings.twilio.twilioStrings.webm = "webm".asInstanceOf[typings.twilio.twilioStrings.webm]
  }
  
  @js.native
  trait MediaRecordingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): MediaRecordingContext = js.native
    
    /**
      * Streams MediaRecordingInstance records from the API.
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
          /* item */ MediaRecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ MediaRecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: MediaRecordingListInstanceEachOptions): Unit = js.native
    def each(
      opts: MediaRecordingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ MediaRecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a media_recording
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): MediaRecordingContext = js.native
    
    /**
      * Retrieve a single target page of MediaRecordingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[MediaRecordingPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaRecordingPage, Any]): js.Promise[MediaRecordingPage] = js.native
    def getPage(targetUrl: String): js.Promise[MediaRecordingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaRecordingPage, Any]
    ): js.Promise[MediaRecordingPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaRecordingPage, Any]
    ): js.Promise[MediaRecordingPage] = js.native
    
    /**
      * Lists MediaRecordingInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[MediaRecordingInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MediaRecordingInstance], Any]
    ): js.Promise[js.Array[MediaRecordingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MediaRecordingInstance], Any]
    ): js.Promise[js.Array[MediaRecordingInstance]] = js.native
    def list(opts: MediaRecordingListInstanceOptions): js.Promise[js.Array[MediaRecordingInstance]] = js.native
    def list(
      opts: MediaRecordingListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MediaRecordingInstance], Any]
    ): js.Promise[js.Array[MediaRecordingInstance]] = js.native
    
    /**
      * Retrieve a single page of MediaRecordingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[MediaRecordingPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaRecordingPage, Any]): js.Promise[MediaRecordingPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaRecordingPage, Any]
    ): js.Promise[MediaRecordingPage] = js.native
    def page(opts: MediaRecordingListInstancePageOptions): js.Promise[MediaRecordingPage] = js.native
    def page(
      opts: MediaRecordingListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaRecordingPage, Any]
    ): js.Promise[MediaRecordingPage] = js.native
    
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
    * @property processorSid - MediaProcessor to filter by
    * @property sourceSid - Source SID to filter by
    * @property status - Status to filter by
    */
  trait MediaRecordingListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ MediaRecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[MediaRecordingOrder] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var processorSid: js.UndefOr[String] = js.undefined
    
    var sourceSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[MediaRecordingStatus] = js.undefined
  }
  object MediaRecordingListInstanceEachOptions {
    
    inline def apply(): MediaRecordingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaRecordingListInstanceEachOptions]
    }
    
    extension [Self <: MediaRecordingListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ MediaRecordingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: MediaRecordingOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setProcessorSid(value: String): Self = StObject.set(x, "processorSid", value.asInstanceOf[js.Any])
      
      inline def setProcessorSidUndefined: Self = StObject.set(x, "processorSid", js.undefined)
      
      inline def setSourceSid(value: String): Self = StObject.set(x, "sourceSid", value.asInstanceOf[js.Any])
      
      inline def setSourceSidUndefined: Self = StObject.set(x, "sourceSid", js.undefined)
      
      inline def setStatus(value: MediaRecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
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
    * @property processorSid - MediaProcessor to filter by
    * @property sourceSid - Source SID to filter by
    * @property status - Status to filter by
    */
  trait MediaRecordingListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[MediaRecordingOrder] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var processorSid: js.UndefOr[String] = js.undefined
    
    var sourceSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[MediaRecordingStatus] = js.undefined
  }
  object MediaRecordingListInstanceOptions {
    
    inline def apply(): MediaRecordingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaRecordingListInstanceOptions]
    }
    
    extension [Self <: MediaRecordingListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: MediaRecordingOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setProcessorSid(value: String): Self = StObject.set(x, "processorSid", value.asInstanceOf[js.Any])
      
      inline def setProcessorSidUndefined: Self = StObject.set(x, "processorSid", js.undefined)
      
      inline def setSourceSid(value: String): Self = StObject.set(x, "sourceSid", value.asInstanceOf[js.Any])
      
      inline def setSourceSidUndefined: Self = StObject.set(x, "sourceSid", js.undefined)
      
      inline def setStatus(value: MediaRecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
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
    * @property processorSid - MediaProcessor to filter by
    * @property sourceSid - Source SID to filter by
    * @property status - Status to filter by
    */
  trait MediaRecordingListInstancePageOptions extends StObject {
    
    var order: js.UndefOr[MediaRecordingOrder] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var processorSid: js.UndefOr[String] = js.undefined
    
    var sourceSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[MediaRecordingStatus] = js.undefined
  }
  object MediaRecordingListInstancePageOptions {
    
    inline def apply(): MediaRecordingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaRecordingListInstancePageOptions]
    }
    
    extension [Self <: MediaRecordingListInstancePageOptions](x: Self) {
      
      inline def setOrder(value: MediaRecordingOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setProcessorSid(value: String): Self = StObject.set(x, "processorSid", value.asInstanceOf[js.Any])
      
      inline def setProcessorSidUndefined: Self = StObject.set(x, "processorSid", js.undefined)
      
      inline def setSourceSid(value: String): Self = StObject.set(x, "sourceSid", value.asInstanceOf[js.Any])
      
      inline def setSourceSidUndefined: Self = StObject.set(x, "sourceSid", js.undefined)
      
      inline def setStatus(value: MediaRecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.asc_
    - typings.twilio.twilioStrings.desc_
  */
  trait MediaRecordingOrder extends StObject
  object MediaRecordingOrder {
    
    inline def asc: asc_ = "asc".asInstanceOf[asc_]
    
    inline def desc: desc_ = "desc".asInstanceOf[desc_]
  }
  
  trait MediaRecordingPayload
    extends StObject
       with MediaRecordingResource
       with TwilioResponsePayload
  object MediaRecordingPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      duration: Double,
      first_page_uri: String,
      format: MediaRecordingFormat,
      links: String,
      media_size: Double,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      processor_sid: String,
      resolution: String,
      sid: String,
      source_sid: String,
      status: MediaRecordingStatus,
      status_callback: String,
      status_callback_method: String,
      uri: String,
      url: String
    ): MediaRecordingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], media_size = media_size.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], processor_sid = processor_sid.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source_sid = source_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRecordingPayload]
    }
  }
  
  trait MediaRecordingResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var duration: Double
    
    var format: MediaRecordingFormat
    
    var links: String
    
    var media_size: Double
    
    var processor_sid: String
    
    var resolution: String
    
    var sid: String
    
    var source_sid: String
    
    var status: MediaRecordingStatus
    
    var status_callback: String
    
    var status_callback_method: String
    
    var url: String
  }
  object MediaRecordingResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      duration: Double,
      format: MediaRecordingFormat,
      links: String,
      media_size: Double,
      processor_sid: String,
      resolution: String,
      sid: String,
      source_sid: String,
      status: MediaRecordingStatus,
      status_callback: String,
      status_callback_method: String,
      url: String
    ): MediaRecordingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], media_size = media_size.asInstanceOf[js.Any], processor_sid = processor_sid.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source_sid = source_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRecordingResource]
    }
    
    extension [Self <: MediaRecordingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: MediaRecordingFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMedia_size(value: Double): Self = StObject.set(x, "media_size", value.asInstanceOf[js.Any])
      
      inline def setProcessor_sid(value: String): Self = StObject.set(x, "processor_sid", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSource_sid(value: String): Self = StObject.set(x, "source_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: MediaRecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRecordingSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.processing
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.deleted_
    - typings.twilio.twilioStrings.failed__
  */
  trait MediaRecordingStatus extends StObject
  object MediaRecordingStatus {
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def deleted: deleted_ = "deleted".asInstanceOf[deleted_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def processing: typings.twilio.twilioStrings.processing = "processing".asInstanceOf[typings.twilio.twilioStrings.processing]
  }
}
