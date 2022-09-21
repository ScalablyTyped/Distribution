package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.deleted_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1RecordingMod {
  
  @JSImport("twilio/lib/rest/video/v1/recording", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/recording", "RecordingContext")
  @js.native
  open class RecordingContext protected () extends StObject {
    /**
      * Initialize the RecordingContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, sid: String) = this()
    
    /**
      * fetch a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RecordingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingInstance, Any]): js.Promise[RecordingInstance] = js.native
    
    /**
      * remove a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/video/v1/recording", "RecordingInstance")
  @js.native
  open class RecordingInstance protected () extends SerializableClass {
    /**
      * Initialize the RecordingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, payload: RecordingPayload, sid: String) = this()
    
    /* private */ var _proxy: RecordingContext = js.native
    
    var accountSid: String = js.native
    
    var codec: RecordingCodec = js.native
    
    var containerFormat: RecordingFormat = js.native
    
    var dateCreated: js.Date = js.native
    
    var duration: Double = js.native
    
    /**
      * fetch a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RecordingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RecordingInstance] = js.native
    
    var groupingSids: Any = js.native
    
    var links: String = js.native
    
    var mediaExternalLocation: String = js.native
    
    var offset: Double = js.native
    
    /**
      * remove a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var size: Double = js.native
    
    var sourceSid: String = js.native
    
    var status: RecordingStatus = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    var trackName: String = js.native
    
    var `type`: RecordingType = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the RecordingList
    *
    * @param version - Version of the resource
    */
  inline def RecordingList(version: typings.twilio.videoV1Mod.^): RecordingListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("RecordingList")(version.asInstanceOf[js.Any]).asInstanceOf[RecordingListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/recording", "RecordingPage")
  @js.native
  open class RecordingPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.videoV1Mod.^, RecordingPayload, RecordingResource, RecordingInstance] {
    /**
      * Initialize the RecordingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RecordingSolution
    ) = this()
    
    /**
      * Build an instance of RecordingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RecordingPayload): RecordingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.VP8
    - typings.twilio.twilioStrings.H264
    - typings.twilio.twilioStrings.OPUS
    - typings.twilio.twilioStrings.PCMU
  */
  trait RecordingCodec extends StObject
  object RecordingCodec {
    
    inline def H264: typings.twilio.twilioStrings.H264 = "H264".asInstanceOf[typings.twilio.twilioStrings.H264]
    
    inline def OPUS: typings.twilio.twilioStrings.OPUS = "OPUS".asInstanceOf[typings.twilio.twilioStrings.OPUS]
    
    inline def PCMU: typings.twilio.twilioStrings.PCMU = "PCMU".asInstanceOf[typings.twilio.twilioStrings.PCMU]
    
    inline def VP8: typings.twilio.twilioStrings.VP8 = "VP8".asInstanceOf[typings.twilio.twilioStrings.VP8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.mka
    - typings.twilio.twilioStrings.mkv
  */
  trait RecordingFormat extends StObject
  object RecordingFormat {
    
    inline def mka: typings.twilio.twilioStrings.mka = "mka".asInstanceOf[typings.twilio.twilioStrings.mka]
    
    inline def mkv: typings.twilio.twilioStrings.mkv = "mkv".asInstanceOf[typings.twilio.twilioStrings.mkv]
  }
  
  @js.native
  trait RecordingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RecordingContext = js.native
    
    /**
      * Streams RecordingInstance records from the API.
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
          /* item */ RecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ RecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: RecordingListInstanceEachOptions): Unit = js.native
    def each(
      opts: RecordingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ RecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a recording
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): RecordingContext = js.native
    
    /**
      * Retrieve a single target page of RecordingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[RecordingPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]): js.Promise[RecordingPage] = js.native
    def getPage(targetUrl: String): js.Promise[RecordingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]
    ): js.Promise[RecordingPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]
    ): js.Promise[RecordingPage] = js.native
    
    /**
      * Lists RecordingInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[RecordingInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RecordingInstance], Any]): js.Promise[js.Array[RecordingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RecordingInstance], Any]
    ): js.Promise[js.Array[RecordingInstance]] = js.native
    def list(opts: RecordingListInstanceOptions): js.Promise[js.Array[RecordingInstance]] = js.native
    def list(
      opts: RecordingListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RecordingInstance], Any]
    ): js.Promise[js.Array[RecordingInstance]] = js.native
    
    /**
      * Retrieve a single page of RecordingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[RecordingPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]): js.Promise[RecordingPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]): js.Promise[RecordingPage] = js.native
    def page(opts: RecordingListInstancePageOptions): js.Promise[RecordingPage] = js.native
    def page(
      opts: RecordingListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]
    ): js.Promise[RecordingPage] = js.native
    
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
    * @property dateCreatedAfter - Read only recordings that started on or after this {@link https://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date-time with time zone
    * @property dateCreatedBefore - Read only recordings that started before this {@link https://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date-time with time zone
    * @property done - Function to be called upon completion of streaming
    * @property groupingSid - Read only recordings that have this grouping_sid
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property mediaType - Read only recordings that have this media type
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property sourceSid - Read only the recordings that have this source_sid
    * @property status - Read only the recordings that have this status
    */
  trait RecordingListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ RecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var groupingSid: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mediaType: js.UndefOr[RecordingType] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sourceSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[RecordingStatus] = js.undefined
  }
  object RecordingListInstanceEachOptions {
    
    inline def apply(): RecordingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingListInstanceEachOptions]
    }
    
    extension [Self <: RecordingListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ RecordingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setGroupingSid(value: String | js.Array[String]): Self = StObject.set(x, "groupingSid", value.asInstanceOf[js.Any])
      
      inline def setGroupingSidUndefined: Self = StObject.set(x, "groupingSid", js.undefined)
      
      inline def setGroupingSidVarargs(value: String*): Self = StObject.set(x, "groupingSid", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMediaType(value: RecordingType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSourceSid(value: String): Self = StObject.set(x, "sourceSid", value.asInstanceOf[js.Any])
      
      inline def setSourceSidUndefined: Self = StObject.set(x, "sourceSid", js.undefined)
      
      inline def setStatus(value: RecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property dateCreatedAfter - Read only recordings that started on or after this {@link https://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date-time with time zone
    * @property dateCreatedBefore - Read only recordings that started before this {@link https://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date-time with time zone
    * @property groupingSid - Read only recordings that have this grouping_sid
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property mediaType - Read only recordings that have this media type
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property sourceSid - Read only the recordings that have this source_sid
    * @property status - Read only the recordings that have this status
    */
  trait RecordingListInstanceOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var groupingSid: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mediaType: js.UndefOr[RecordingType] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sourceSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[RecordingStatus] = js.undefined
  }
  object RecordingListInstanceOptions {
    
    inline def apply(): RecordingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingListInstanceOptions]
    }
    
    extension [Self <: RecordingListInstanceOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setGroupingSid(value: String | js.Array[String]): Self = StObject.set(x, "groupingSid", value.asInstanceOf[js.Any])
      
      inline def setGroupingSidUndefined: Self = StObject.set(x, "groupingSid", js.undefined)
      
      inline def setGroupingSidVarargs(value: String*): Self = StObject.set(x, "groupingSid", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMediaType(value: RecordingType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSourceSid(value: String): Self = StObject.set(x, "sourceSid", value.asInstanceOf[js.Any])
      
      inline def setSourceSidUndefined: Self = StObject.set(x, "sourceSid", js.undefined)
      
      inline def setStatus(value: RecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dateCreatedAfter - Read only recordings that started on or after this {@link https://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date-time with time zone
    * @property dateCreatedBefore - Read only recordings that started before this {@link https://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date-time with time zone
    * @property groupingSid - Read only recordings that have this grouping_sid
    * @property mediaType - Read only recordings that have this media type
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property sourceSid - Read only the recordings that have this source_sid
    * @property status - Read only the recordings that have this status
    */
  trait RecordingListInstancePageOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var groupingSid: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var mediaType: js.UndefOr[RecordingType] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var sourceSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[RecordingStatus] = js.undefined
  }
  object RecordingListInstancePageOptions {
    
    inline def apply(): RecordingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingListInstancePageOptions]
    }
    
    extension [Self <: RecordingListInstancePageOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setGroupingSid(value: String | js.Array[String]): Self = StObject.set(x, "groupingSid", value.asInstanceOf[js.Any])
      
      inline def setGroupingSidUndefined: Self = StObject.set(x, "groupingSid", js.undefined)
      
      inline def setGroupingSidVarargs(value: String*): Self = StObject.set(x, "groupingSid", js.Array(value*))
      
      inline def setMediaType(value: RecordingType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSourceSid(value: String): Self = StObject.set(x, "sourceSid", value.asInstanceOf[js.Any])
      
      inline def setSourceSidUndefined: Self = StObject.set(x, "sourceSid", js.undefined)
      
      inline def setStatus(value: RecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait RecordingPayload
    extends StObject
       with RecordingResource
       with TwilioResponsePayload
  object RecordingPayload {
    
    inline def apply(
      account_sid: String,
      codec: RecordingCodec,
      container_format: RecordingFormat,
      date_created: js.Date,
      duration: Double,
      first_page_uri: String,
      grouping_sids: js.Object,
      links: String,
      media_external_location: String,
      next_page_uri: String,
      offset: Double,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      size: Double,
      source_sid: String,
      status: RecordingStatus,
      status_callback: String,
      status_callback_method: String,
      track_name: String,
      `type`: RecordingType,
      uri: String,
      url: String
    ): RecordingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], container_format = container_format.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], grouping_sids = grouping_sids.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], media_external_location = media_external_location.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source_sid = source_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], track_name = track_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingPayload]
    }
  }
  
  trait RecordingResource extends StObject {
    
    var account_sid: String
    
    var codec: RecordingCodec
    
    var container_format: RecordingFormat
    
    var date_created: js.Date
    
    var duration: Double
    
    var grouping_sids: js.Object
    
    var links: String
    
    var media_external_location: String
    
    var offset: Double
    
    var sid: String
    
    var size: Double
    
    var source_sid: String
    
    var status: RecordingStatus
    
    var status_callback: String
    
    var status_callback_method: String
    
    var track_name: String
    
    var `type`: RecordingType
    
    var url: String
  }
  object RecordingResource {
    
    inline def apply(
      account_sid: String,
      codec: RecordingCodec,
      container_format: RecordingFormat,
      date_created: js.Date,
      duration: Double,
      grouping_sids: js.Object,
      links: String,
      media_external_location: String,
      offset: Double,
      sid: String,
      size: Double,
      source_sid: String,
      status: RecordingStatus,
      status_callback: String,
      status_callback_method: String,
      track_name: String,
      `type`: RecordingType,
      url: String
    ): RecordingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], container_format = container_format.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], grouping_sids = grouping_sids.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], media_external_location = media_external_location.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source_sid = source_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], track_name = track_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingResource]
    }
    
    extension [Self <: RecordingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCodec(value: RecordingCodec): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setContainer_format(value: RecordingFormat): Self = StObject.set(x, "container_format", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setGrouping_sids(value: js.Object): Self = StObject.set(x, "grouping_sids", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMedia_external_location(value: String): Self = StObject.set(x, "media_external_location", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSource_sid(value: String): Self = StObject.set(x, "source_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: RecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setTrack_name(value: String): Self = StObject.set(x, "track_name", value.asInstanceOf[js.Any])
      
      inline def setType(value: RecordingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordingSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.processing
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.deleted_
    - typings.twilio.twilioStrings.failed__
  */
  trait RecordingStatus extends StObject
  object RecordingStatus {
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def deleted: deleted_ = "deleted".asInstanceOf[deleted_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def processing: typings.twilio.twilioStrings.processing = "processing".asInstanceOf[typings.twilio.twilioStrings.processing]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.audio
    - typings.twilio.twilioStrings.video
    - typings.twilio.twilioStrings.data
  */
  trait RecordingType extends StObject
  object RecordingType {
    
    inline def audio: typings.twilio.twilioStrings.audio = "audio".asInstanceOf[typings.twilio.twilioStrings.audio]
    
    inline def data: typings.twilio.twilioStrings.data = "data".asInstanceOf[typings.twilio.twilioStrings.data]
    
    inline def video: typings.twilio.twilioStrings.video = "video".asInstanceOf[typings.twilio.twilioStrings.video]
  }
}
