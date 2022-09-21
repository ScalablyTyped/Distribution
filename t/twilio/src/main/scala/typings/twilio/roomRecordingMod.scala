package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.deleted_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomRecordingMod {
  
  @JSImport("twilio/lib/rest/video/v1/room/recording", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/room/recording", "RoomRecordingContext")
  @js.native
  open class RoomRecordingContext protected () extends StObject {
    /**
      * Initialize the RoomRecordingContext
      *
      * @param version - Version of the resource
      * @param roomSid - The SID of the Room resource with the recording to fetch
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, roomSid: String, sid: String) = this()
    
    /**
      * fetch a RoomRecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RoomRecordingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomRecordingInstance, Any]): js.Promise[RoomRecordingInstance] = js.native
    
    /**
      * remove a RoomRecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomRecordingInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/video/v1/room/recording", "RoomRecordingInstance")
  @js.native
  open class RoomRecordingInstance protected () extends SerializableClass {
    /**
      * Initialize the RoomRecordingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param roomSid - The SID of the Room resource the recording is associated with
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, payload: RoomRecordingPayload, roomSid: String, sid: String) = this()
    
    /* private */ var _proxy: RoomRecordingContext = js.native
    
    var accountSid: String = js.native
    
    var codec: RoomRecordingCodec = js.native
    
    var containerFormat: RoomRecordingFormat = js.native
    
    var dateCreated: js.Date = js.native
    
    var duration: Double = js.native
    
    /**
      * fetch a RoomRecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RoomRecordingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RoomRecordingInstance] = js.native
    
    var groupingSids: Any = js.native
    
    var links: String = js.native
    
    var mediaExternalLocation: String = js.native
    
    var offset: Double = js.native
    
    /**
      * remove a RoomRecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var roomSid: String = js.native
    
    var sid: String = js.native
    
    var size: Double = js.native
    
    var sourceSid: String = js.native
    
    var status: RoomRecordingStatus = js.native
    
    var trackName: String = js.native
    
    var `type`: RoomRecordingType = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the RoomRecordingList
    *
    * @param version - Version of the resource
    * @param roomSid - The SID of the Room resource the recording is associated with
    */
  inline def RoomRecordingList(version: typings.twilio.videoV1Mod.^, roomSid: String): RoomRecordingListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("RoomRecordingList")(version.asInstanceOf[js.Any], roomSid.asInstanceOf[js.Any])).asInstanceOf[RoomRecordingListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/room/recording", "RoomRecordingPage")
  @js.native
  open class RoomRecordingPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.videoV1Mod.^, 
          RoomRecordingPayload, 
          RoomRecordingResource, 
          RoomRecordingInstance
        ] {
    /**
      * Initialize the RoomRecordingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RoomRecordingSolution
    ) = this()
    
    /**
      * Build an instance of RoomRecordingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RoomRecordingPayload): RoomRecordingInstance = js.native
    
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
  trait RoomRecordingCodec extends StObject
  object RoomRecordingCodec {
    
    inline def H264: typings.twilio.twilioStrings.H264 = "H264".asInstanceOf[typings.twilio.twilioStrings.H264]
    
    inline def OPUS: typings.twilio.twilioStrings.OPUS = "OPUS".asInstanceOf[typings.twilio.twilioStrings.OPUS]
    
    inline def PCMU: typings.twilio.twilioStrings.PCMU = "PCMU".asInstanceOf[typings.twilio.twilioStrings.PCMU]
    
    inline def VP8: typings.twilio.twilioStrings.VP8 = "VP8".asInstanceOf[typings.twilio.twilioStrings.VP8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.mka
    - typings.twilio.twilioStrings.mkv
  */
  trait RoomRecordingFormat extends StObject
  object RoomRecordingFormat {
    
    inline def mka: typings.twilio.twilioStrings.mka = "mka".asInstanceOf[typings.twilio.twilioStrings.mka]
    
    inline def mkv: typings.twilio.twilioStrings.mkv = "mkv".asInstanceOf[typings.twilio.twilioStrings.mkv]
  }
  
  @js.native
  trait RoomRecordingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RoomRecordingContext = js.native
    
    /**
      * Streams RoomRecordingInstance records from the API.
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
          /* item */ RoomRecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ RoomRecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: RoomRecordingListInstanceEachOptions): Unit = js.native
    def each(
      opts: RoomRecordingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ RoomRecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a room_recording
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): RoomRecordingContext = js.native
    
    /**
      * Retrieve a single target page of RoomRecordingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[RoomRecordingPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomRecordingPage, Any]): js.Promise[RoomRecordingPage] = js.native
    def getPage(targetUrl: String): js.Promise[RoomRecordingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomRecordingPage, Any]
    ): js.Promise[RoomRecordingPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomRecordingPage, Any]
    ): js.Promise[RoomRecordingPage] = js.native
    
    /**
      * Lists RoomRecordingInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[RoomRecordingInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RoomRecordingInstance], Any]
    ): js.Promise[js.Array[RoomRecordingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RoomRecordingInstance], Any]
    ): js.Promise[js.Array[RoomRecordingInstance]] = js.native
    def list(opts: RoomRecordingListInstanceOptions): js.Promise[js.Array[RoomRecordingInstance]] = js.native
    def list(
      opts: RoomRecordingListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RoomRecordingInstance], Any]
    ): js.Promise[js.Array[RoomRecordingInstance]] = js.native
    
    /**
      * Retrieve a single page of RoomRecordingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[RoomRecordingPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomRecordingPage, Any]): js.Promise[RoomRecordingPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomRecordingPage, Any]
    ): js.Promise[RoomRecordingPage] = js.native
    def page(opts: RoomRecordingListInstancePageOptions): js.Promise[RoomRecordingPage] = js.native
    def page(
      opts: RoomRecordingListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomRecordingPage, Any]
    ): js.Promise[RoomRecordingPage] = js.native
    
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
    * @property dateCreatedAfter - Read only Recordings that started on or after this ISO 8601 datetime with time zone
    * @property dateCreatedBefore - Read only Recordings that started before this ISO 8601 date-time with time zone
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
    * @property sourceSid - Read only the recordings that have this source_sid
    * @property status - Read only the recordings with this status
    */
  trait RoomRecordingListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ RoomRecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sourceSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[RoomRecordingStatus] = js.undefined
  }
  object RoomRecordingListInstanceEachOptions {
    
    inline def apply(): RoomRecordingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomRecordingListInstanceEachOptions]
    }
    
    extension [Self <: RoomRecordingListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ RoomRecordingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSourceSid(value: String): Self = StObject.set(x, "sourceSid", value.asInstanceOf[js.Any])
      
      inline def setSourceSidUndefined: Self = StObject.set(x, "sourceSid", js.undefined)
      
      inline def setStatus(value: RoomRecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property dateCreatedAfter - Read only Recordings that started on or after this ISO 8601 datetime with time zone
    * @property dateCreatedBefore - Read only Recordings that started before this ISO 8601 date-time with time zone
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
    * @property sourceSid - Read only the recordings that have this source_sid
    * @property status - Read only the recordings with this status
    */
  trait RoomRecordingListInstanceOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sourceSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[RoomRecordingStatus] = js.undefined
  }
  object RoomRecordingListInstanceOptions {
    
    inline def apply(): RoomRecordingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomRecordingListInstanceOptions]
    }
    
    extension [Self <: RoomRecordingListInstanceOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSourceSid(value: String): Self = StObject.set(x, "sourceSid", value.asInstanceOf[js.Any])
      
      inline def setSourceSidUndefined: Self = StObject.set(x, "sourceSid", js.undefined)
      
      inline def setStatus(value: RoomRecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dateCreatedAfter - Read only Recordings that started on or after this ISO 8601 datetime with time zone
    * @property dateCreatedBefore - Read only Recordings that started before this ISO 8601 date-time with time zone
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property sourceSid - Read only the recordings that have this source_sid
    * @property status - Read only the recordings with this status
    */
  trait RoomRecordingListInstancePageOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var sourceSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[RoomRecordingStatus] = js.undefined
  }
  object RoomRecordingListInstancePageOptions {
    
    inline def apply(): RoomRecordingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomRecordingListInstancePageOptions]
    }
    
    extension [Self <: RoomRecordingListInstancePageOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSourceSid(value: String): Self = StObject.set(x, "sourceSid", value.asInstanceOf[js.Any])
      
      inline def setSourceSidUndefined: Self = StObject.set(x, "sourceSid", js.undefined)
      
      inline def setStatus(value: RoomRecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait RoomRecordingPayload
    extends StObject
       with RoomRecordingResource
       with TwilioResponsePayload
  object RoomRecordingPayload {
    
    inline def apply(
      account_sid: String,
      codec: RoomRecordingCodec,
      container_format: RoomRecordingFormat,
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
      room_sid: String,
      sid: String,
      size: Double,
      source_sid: String,
      status: RoomRecordingStatus,
      track_name: String,
      `type`: RoomRecordingType,
      uri: String,
      url: String
    ): RoomRecordingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], container_format = container_format.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], grouping_sids = grouping_sids.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], media_external_location = media_external_location.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source_sid = source_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], track_name = track_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomRecordingPayload]
    }
  }
  
  trait RoomRecordingResource extends StObject {
    
    var account_sid: String
    
    var codec: RoomRecordingCodec
    
    var container_format: RoomRecordingFormat
    
    var date_created: js.Date
    
    var duration: Double
    
    var grouping_sids: js.Object
    
    var links: String
    
    var media_external_location: String
    
    var offset: Double
    
    var room_sid: String
    
    var sid: String
    
    var size: Double
    
    var source_sid: String
    
    var status: RoomRecordingStatus
    
    var track_name: String
    
    var `type`: RoomRecordingType
    
    var url: String
  }
  object RoomRecordingResource {
    
    inline def apply(
      account_sid: String,
      codec: RoomRecordingCodec,
      container_format: RoomRecordingFormat,
      date_created: js.Date,
      duration: Double,
      grouping_sids: js.Object,
      links: String,
      media_external_location: String,
      offset: Double,
      room_sid: String,
      sid: String,
      size: Double,
      source_sid: String,
      status: RoomRecordingStatus,
      track_name: String,
      `type`: RoomRecordingType,
      url: String
    ): RoomRecordingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], container_format = container_format.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], grouping_sids = grouping_sids.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], media_external_location = media_external_location.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source_sid = source_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], track_name = track_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomRecordingResource]
    }
    
    extension [Self <: RoomRecordingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCodec(value: RoomRecordingCodec): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setContainer_format(value: RoomRecordingFormat): Self = StObject.set(x, "container_format", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setGrouping_sids(value: js.Object): Self = StObject.set(x, "grouping_sids", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMedia_external_location(value: String): Self = StObject.set(x, "media_external_location", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setRoom_sid(value: String): Self = StObject.set(x, "room_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSource_sid(value: String): Self = StObject.set(x, "source_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: RoomRecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTrack_name(value: String): Self = StObject.set(x, "track_name", value.asInstanceOf[js.Any])
      
      inline def setType(value: RoomRecordingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoomRecordingSolution extends StObject {
    
    var roomSid: js.UndefOr[String] = js.undefined
  }
  object RoomRecordingSolution {
    
    inline def apply(): RoomRecordingSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomRecordingSolution]
    }
    
    extension [Self <: RoomRecordingSolution](x: Self) {
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setRoomSidUndefined: Self = StObject.set(x, "roomSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.processing
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.deleted_
    - typings.twilio.twilioStrings.failed__
  */
  trait RoomRecordingStatus extends StObject
  object RoomRecordingStatus {
    
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
  trait RoomRecordingType extends StObject
  object RoomRecordingType {
    
    inline def audio: typings.twilio.twilioStrings.audio = "audio".asInstanceOf[typings.twilio.twilioStrings.audio]
    
    inline def data: typings.twilio.twilioStrings.data = "data".asInstanceOf[typings.twilio.twilioStrings.data]
    
    inline def video: typings.twilio.twilioStrings.video = "video".asInstanceOf[typings.twilio.twilioStrings.video]
  }
}
