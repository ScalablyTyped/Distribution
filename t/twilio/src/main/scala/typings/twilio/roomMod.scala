package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.roomParticipantMod.ParticipantContext
import typings.twilio.roomParticipantMod.ParticipantListInstance
import typings.twilio.twilioStrings.completed_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomMod {
  
  @JSImport("twilio/lib/rest/insights/v1/room", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/room", "RoomContext")
  @js.native
  open class RoomContext protected () extends StObject {
    /**
      * Initialize the RoomContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param roomSid - The SID of the Room resource.
      */
    def this(version: typings.twilio.insightsV1Mod.^, roomSid: String) = this()
    
    /**
      * fetch a RoomInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RoomInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomInstance, Any]): js.Promise[RoomInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def participants(sid: String): ParticipantContext = js.native
    @JSName("participants")
    var participants_Original: ParticipantListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/insights/v1/room", "RoomInstance")
  @js.native
  open class RoomInstance protected () extends SerializableClass {
    /**
      * Initialize the RoomContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param roomSid - The SID of the Room resource.
      */
    def this(version: typings.twilio.insightsV1Mod.^, payload: RoomPayload, roomSid: String) = this()
    
    /* private */ var _proxy: RoomContext = js.native
    
    var accountSid: String = js.native
    
    var codecs: js.Array[RoomCodec] = js.native
    
    var concurrentParticipants: Double = js.native
    
    var createTime: js.Date = js.native
    
    var createdMethod: RoomCreatedMethod = js.native
    
    var durationSec: Double = js.native
    
    var edgeLocation: RoomEdgeLocation = js.native
    
    var endReason: RoomEndReason = js.native
    
    var endTime: js.Date = js.native
    
    /**
      * fetch a RoomInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RoomInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RoomInstance] = js.native
    
    var links: String = js.native
    
    var maxConcurrentParticipants: Double = js.native
    
    var maxParticipants: Double = js.native
    
    var mediaRegion: RoomTwilioRealm = js.native
    
    /**
      * Access the participants
      */
    def participants(): ParticipantListInstance = js.native
    
    var processingState: RoomProcessingState = js.native
    
    var recordingEnabled: Boolean = js.native
    
    var roomName: String = js.native
    
    var roomSid: String = js.native
    
    var roomStatus: RoomRoomStatus = js.native
    
    var roomType: RoomRoomType = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    var totalParticipantDurationSec: Double = js.native
    
    var totalRecordingDurationSec: Double = js.native
    
    var uniqueParticipantIdentities: Double = js.native
    
    var uniqueParticipants: Double = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the RoomList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def RoomList(version: typings.twilio.insightsV1Mod.^): RoomListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("RoomList")(version.asInstanceOf[js.Any]).asInstanceOf[RoomListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/room", "RoomPage")
  @js.native
  open class RoomPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.insightsV1Mod.^, RoomPayload, RoomResource, RoomInstance] {
    /**
      * Initialize the RoomPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.insightsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RoomSolution
    ) = this()
    
    /**
      * Build an instance of RoomInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RoomPayload): RoomInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.VP8
    - typings.twilio.twilioStrings.H264
    - typings.twilio.twilioStrings.VP9
  */
  trait RoomCodec extends StObject
  object RoomCodec {
    
    inline def H264: typings.twilio.twilioStrings.H264 = "H264".asInstanceOf[typings.twilio.twilioStrings.H264]
    
    inline def VP8: typings.twilio.twilioStrings.VP8 = "VP8".asInstanceOf[typings.twilio.twilioStrings.VP8]
    
    inline def VP9: typings.twilio.twilioStrings.VP9 = "VP9".asInstanceOf[typings.twilio.twilioStrings.VP9]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.sdk
    - typings.twilio.twilioStrings.ad_hoc
    - typings.twilio.twilioStrings.api
  */
  trait RoomCreatedMethod extends StObject
  object RoomCreatedMethod {
    
    inline def ad_hoc: typings.twilio.twilioStrings.ad_hoc = "ad_hoc".asInstanceOf[typings.twilio.twilioStrings.ad_hoc]
    
    inline def api: typings.twilio.twilioStrings.api = "api".asInstanceOf[typings.twilio.twilioStrings.api]
    
    inline def sdk: typings.twilio.twilioStrings.sdk = "sdk".asInstanceOf[typings.twilio.twilioStrings.sdk]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.ashburn
    - typings.twilio.twilioStrings.dublin
    - typings.twilio.twilioStrings.frankfurt
    - typings.twilio.twilioStrings.singapore
    - typings.twilio.twilioStrings.sydney
    - typings.twilio.twilioStrings.sao_paulo
    - typings.twilio.twilioStrings.roaming
    - typings.twilio.twilioStrings.umatilla
    - typings.twilio.twilioStrings.tokyo
  */
  trait RoomEdgeLocation extends StObject
  object RoomEdgeLocation {
    
    inline def ashburn: typings.twilio.twilioStrings.ashburn = "ashburn".asInstanceOf[typings.twilio.twilioStrings.ashburn]
    
    inline def dublin: typings.twilio.twilioStrings.dublin = "dublin".asInstanceOf[typings.twilio.twilioStrings.dublin]
    
    inline def frankfurt: typings.twilio.twilioStrings.frankfurt = "frankfurt".asInstanceOf[typings.twilio.twilioStrings.frankfurt]
    
    inline def roaming: typings.twilio.twilioStrings.roaming = "roaming".asInstanceOf[typings.twilio.twilioStrings.roaming]
    
    inline def sao_paulo: typings.twilio.twilioStrings.sao_paulo = "sao_paulo".asInstanceOf[typings.twilio.twilioStrings.sao_paulo]
    
    inline def singapore: typings.twilio.twilioStrings.singapore = "singapore".asInstanceOf[typings.twilio.twilioStrings.singapore]
    
    inline def sydney: typings.twilio.twilioStrings.sydney = "sydney".asInstanceOf[typings.twilio.twilioStrings.sydney]
    
    inline def tokyo: typings.twilio.twilioStrings.tokyo = "tokyo".asInstanceOf[typings.twilio.twilioStrings.tokyo]
    
    inline def umatilla: typings.twilio.twilioStrings.umatilla = "umatilla".asInstanceOf[typings.twilio.twilioStrings.umatilla]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.room_ended_via_api
    - typings.twilio.twilioStrings.timeout
  */
  trait RoomEndReason extends StObject
  object RoomEndReason {
    
    inline def room_ended_via_api: typings.twilio.twilioStrings.room_ended_via_api = "room_ended_via_api".asInstanceOf[typings.twilio.twilioStrings.room_ended_via_api]
    
    inline def timeout: typings.twilio.twilioStrings.timeout = "timeout".asInstanceOf[typings.twilio.twilioStrings.timeout]
  }
  
  @js.native
  trait RoomListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RoomContext = js.native
    
    /**
      * Streams RoomInstance records from the API.
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
          /* item */ RoomInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ RoomInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: RoomListInstanceEachOptions): Unit = js.native
    def each(
      opts: RoomListInstanceEachOptions,
      callback: js.Function2[
          /* item */ RoomInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a room
      *
      * @param roomSid - The SID of the Room resource.
      */
    def get(roomSid: String): RoomContext = js.native
    
    /**
      * Retrieve a single target page of RoomInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[RoomPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomPage, Any]): js.Promise[RoomPage] = js.native
    def getPage(targetUrl: String): js.Promise[RoomPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomPage, Any]): js.Promise[RoomPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomPage, Any]): js.Promise[RoomPage] = js.native
    
    /**
      * Lists RoomInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[RoomInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RoomInstance], Any]): js.Promise[js.Array[RoomInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RoomInstance], Any]
    ): js.Promise[js.Array[RoomInstance]] = js.native
    def list(opts: RoomListInstanceOptions): js.Promise[js.Array[RoomInstance]] = js.native
    def list(
      opts: RoomListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RoomInstance], Any]
    ): js.Promise[js.Array[RoomInstance]] = js.native
    
    /**
      * Retrieve a single page of RoomInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[RoomPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomPage, Any]): js.Promise[RoomPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomPage, Any]): js.Promise[RoomPage] = js.native
    def page(opts: RoomListInstancePageOptions): js.Promise[RoomPage] = js.native
    def page(
      opts: RoomListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomPage, Any]
    ): js.Promise[RoomPage] = js.native
    
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
    * @property codec - Codecs used by participants in the room.
    * @property createdAfter - Only read rooms that started on or after this ISO 8601 timestamp.
    * @property createdBefore - Only read rooms that started before this ISO 8601 timestamp.
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
    * @property roomName - Room friendly name.
    * @property roomType - Type of room.
    */
  trait RoomListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ RoomInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var codec: js.UndefOr[RoomCodec | js.Array[RoomCodec]] = js.undefined
    
    var createdAfter: js.UndefOr[js.Date] = js.undefined
    
    var createdBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var roomName: js.UndefOr[String] = js.undefined
    
    var roomType: js.UndefOr[RoomRoomType | js.Array[RoomRoomType]] = js.undefined
  }
  object RoomListInstanceEachOptions {
    
    inline def apply(): RoomListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomListInstanceEachOptions]
    }
    
    extension [Self <: RoomListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ RoomInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCodec(value: RoomCodec | js.Array[RoomCodec]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
      
      inline def setCodecVarargs(value: RoomCodec*): Self = StObject.set(x, "codec", js.Array(value*))
      
      inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
      
      inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
      
      inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
      
      inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
      
      inline def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
      
      inline def setRoomType(value: RoomRoomType | js.Array[RoomRoomType]): Self = StObject.set(x, "roomType", value.asInstanceOf[js.Any])
      
      inline def setRoomTypeUndefined: Self = StObject.set(x, "roomType", js.undefined)
      
      inline def setRoomTypeVarargs(value: RoomRoomType*): Self = StObject.set(x, "roomType", js.Array(value*))
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property codec - Codecs used by participants in the room.
    * @property createdAfter - Only read rooms that started on or after this ISO 8601 timestamp.
    * @property createdBefore - Only read rooms that started before this ISO 8601 timestamp.
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
    * @property roomName - Room friendly name.
    * @property roomType - Type of room.
    */
  trait RoomListInstanceOptions extends StObject {
    
    var codec: js.UndefOr[RoomCodec | js.Array[RoomCodec]] = js.undefined
    
    var createdAfter: js.UndefOr[js.Date] = js.undefined
    
    var createdBefore: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var roomName: js.UndefOr[String] = js.undefined
    
    var roomType: js.UndefOr[RoomRoomType | js.Array[RoomRoomType]] = js.undefined
  }
  object RoomListInstanceOptions {
    
    inline def apply(): RoomListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomListInstanceOptions]
    }
    
    extension [Self <: RoomListInstanceOptions](x: Self) {
      
      inline def setCodec(value: RoomCodec | js.Array[RoomCodec]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
      
      inline def setCodecVarargs(value: RoomCodec*): Self = StObject.set(x, "codec", js.Array(value*))
      
      inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
      
      inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
      
      inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
      
      inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
      
      inline def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
      
      inline def setRoomType(value: RoomRoomType | js.Array[RoomRoomType]): Self = StObject.set(x, "roomType", value.asInstanceOf[js.Any])
      
      inline def setRoomTypeUndefined: Self = StObject.set(x, "roomType", js.undefined)
      
      inline def setRoomTypeVarargs(value: RoomRoomType*): Self = StObject.set(x, "roomType", js.Array(value*))
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property codec - Codecs used by participants in the room.
    * @property createdAfter - Only read rooms that started on or after this ISO 8601 timestamp.
    * @property createdBefore - Only read rooms that started before this ISO 8601 timestamp.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property roomName - Room friendly name.
    * @property roomType - Type of room.
    */
  trait RoomListInstancePageOptions extends StObject {
    
    var codec: js.UndefOr[RoomCodec | js.Array[RoomCodec]] = js.undefined
    
    var createdAfter: js.UndefOr[js.Date] = js.undefined
    
    var createdBefore: js.UndefOr[js.Date] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var roomName: js.UndefOr[String] = js.undefined
    
    var roomType: js.UndefOr[RoomRoomType | js.Array[RoomRoomType]] = js.undefined
  }
  object RoomListInstancePageOptions {
    
    inline def apply(): RoomListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomListInstancePageOptions]
    }
    
    extension [Self <: RoomListInstancePageOptions](x: Self) {
      
      inline def setCodec(value: RoomCodec | js.Array[RoomCodec]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
      
      inline def setCodecVarargs(value: RoomCodec*): Self = StObject.set(x, "codec", js.Array(value*))
      
      inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
      
      inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
      
      inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
      
      inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
      
      inline def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
      
      inline def setRoomType(value: RoomRoomType | js.Array[RoomRoomType]): Self = StObject.set(x, "roomType", value.asInstanceOf[js.Any])
      
      inline def setRoomTypeUndefined: Self = StObject.set(x, "roomType", js.undefined)
      
      inline def setRoomTypeVarargs(value: RoomRoomType*): Self = StObject.set(x, "roomType", js.Array(value*))
    }
  }
  
  trait RoomPayload
    extends StObject
       with RoomResource
       with TwilioResponsePayload
  object RoomPayload {
    
    inline def apply(
      account_sid: String,
      codecs: js.Array[RoomCodec],
      concurrent_participants: Double,
      create_time: js.Date,
      created_method: RoomCreatedMethod,
      duration_sec: Double,
      edge_location: RoomEdgeLocation,
      end_reason: RoomEndReason,
      end_time: js.Date,
      first_page_uri: String,
      links: String,
      max_concurrent_participants: Double,
      max_participants: Double,
      media_region: RoomTwilioRealm,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      processing_state: RoomProcessingState,
      recording_enabled: Boolean,
      room_name: String,
      room_sid: String,
      room_status: RoomRoomStatus,
      room_type: RoomRoomType,
      status_callback: String,
      status_callback_method: String,
      total_participant_duration_sec: Double,
      total_recording_duration_sec: Double,
      unique_participant_identities: Double,
      unique_participants: Double,
      uri: String,
      url: String
    ): RoomPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], codecs = codecs.asInstanceOf[js.Any], concurrent_participants = concurrent_participants.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], created_method = created_method.asInstanceOf[js.Any], duration_sec = duration_sec.asInstanceOf[js.Any], edge_location = edge_location.asInstanceOf[js.Any], end_reason = end_reason.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], max_concurrent_participants = max_concurrent_participants.asInstanceOf[js.Any], max_participants = max_participants.asInstanceOf[js.Any], media_region = media_region.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], processing_state = processing_state.asInstanceOf[js.Any], recording_enabled = recording_enabled.asInstanceOf[js.Any], room_name = room_name.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], room_status = room_status.asInstanceOf[js.Any], room_type = room_type.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], total_participant_duration_sec = total_participant_duration_sec.asInstanceOf[js.Any], total_recording_duration_sec = total_recording_duration_sec.asInstanceOf[js.Any], unique_participant_identities = unique_participant_identities.asInstanceOf[js.Any], unique_participants = unique_participants.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomPayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.complete
    - typings.twilio.twilioStrings.in_progress
  */
  trait RoomProcessingState extends StObject
  object RoomProcessingState {
    
    inline def complete: typings.twilio.twilioStrings.complete = "complete".asInstanceOf[typings.twilio.twilioStrings.complete]
    
    inline def in_progress: typings.twilio.twilioStrings.in_progress = "in_progress".asInstanceOf[typings.twilio.twilioStrings.in_progress]
  }
  
  trait RoomResource extends StObject {
    
    var account_sid: String
    
    var codecs: js.Array[RoomCodec]
    
    var concurrent_participants: Double
    
    var create_time: js.Date
    
    var created_method: RoomCreatedMethod
    
    var duration_sec: Double
    
    var edge_location: RoomEdgeLocation
    
    var end_reason: RoomEndReason
    
    var end_time: js.Date
    
    var links: String
    
    var max_concurrent_participants: Double
    
    var max_participants: Double
    
    var media_region: RoomTwilioRealm
    
    var processing_state: RoomProcessingState
    
    var recording_enabled: Boolean
    
    var room_name: String
    
    var room_sid: String
    
    var room_status: RoomRoomStatus
    
    var room_type: RoomRoomType
    
    var status_callback: String
    
    var status_callback_method: String
    
    var total_participant_duration_sec: Double
    
    var total_recording_duration_sec: Double
    
    var unique_participant_identities: Double
    
    var unique_participants: Double
    
    var url: String
  }
  object RoomResource {
    
    inline def apply(
      account_sid: String,
      codecs: js.Array[RoomCodec],
      concurrent_participants: Double,
      create_time: js.Date,
      created_method: RoomCreatedMethod,
      duration_sec: Double,
      edge_location: RoomEdgeLocation,
      end_reason: RoomEndReason,
      end_time: js.Date,
      links: String,
      max_concurrent_participants: Double,
      max_participants: Double,
      media_region: RoomTwilioRealm,
      processing_state: RoomProcessingState,
      recording_enabled: Boolean,
      room_name: String,
      room_sid: String,
      room_status: RoomRoomStatus,
      room_type: RoomRoomType,
      status_callback: String,
      status_callback_method: String,
      total_participant_duration_sec: Double,
      total_recording_duration_sec: Double,
      unique_participant_identities: Double,
      unique_participants: Double,
      url: String
    ): RoomResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], codecs = codecs.asInstanceOf[js.Any], concurrent_participants = concurrent_participants.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], created_method = created_method.asInstanceOf[js.Any], duration_sec = duration_sec.asInstanceOf[js.Any], edge_location = edge_location.asInstanceOf[js.Any], end_reason = end_reason.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], max_concurrent_participants = max_concurrent_participants.asInstanceOf[js.Any], max_participants = max_participants.asInstanceOf[js.Any], media_region = media_region.asInstanceOf[js.Any], processing_state = processing_state.asInstanceOf[js.Any], recording_enabled = recording_enabled.asInstanceOf[js.Any], room_name = room_name.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], room_status = room_status.asInstanceOf[js.Any], room_type = room_type.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], total_participant_duration_sec = total_participant_duration_sec.asInstanceOf[js.Any], total_recording_duration_sec = total_recording_duration_sec.asInstanceOf[js.Any], unique_participant_identities = unique_participant_identities.asInstanceOf[js.Any], unique_participants = unique_participants.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomResource]
    }
    
    extension [Self <: RoomResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCodecs(value: js.Array[RoomCodec]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
      
      inline def setCodecsVarargs(value: RoomCodec*): Self = StObject.set(x, "codecs", js.Array(value*))
      
      inline def setConcurrent_participants(value: Double): Self = StObject.set(x, "concurrent_participants", value.asInstanceOf[js.Any])
      
      inline def setCreate_time(value: js.Date): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      inline def setCreated_method(value: RoomCreatedMethod): Self = StObject.set(x, "created_method", value.asInstanceOf[js.Any])
      
      inline def setDuration_sec(value: Double): Self = StObject.set(x, "duration_sec", value.asInstanceOf[js.Any])
      
      inline def setEdge_location(value: RoomEdgeLocation): Self = StObject.set(x, "edge_location", value.asInstanceOf[js.Any])
      
      inline def setEnd_reason(value: RoomEndReason): Self = StObject.set(x, "end_reason", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMax_concurrent_participants(value: Double): Self = StObject.set(x, "max_concurrent_participants", value.asInstanceOf[js.Any])
      
      inline def setMax_participants(value: Double): Self = StObject.set(x, "max_participants", value.asInstanceOf[js.Any])
      
      inline def setMedia_region(value: RoomTwilioRealm): Self = StObject.set(x, "media_region", value.asInstanceOf[js.Any])
      
      inline def setProcessing_state(value: RoomProcessingState): Self = StObject.set(x, "processing_state", value.asInstanceOf[js.Any])
      
      inline def setRecording_enabled(value: Boolean): Self = StObject.set(x, "recording_enabled", value.asInstanceOf[js.Any])
      
      inline def setRoom_name(value: String): Self = StObject.set(x, "room_name", value.asInstanceOf[js.Any])
      
      inline def setRoom_sid(value: String): Self = StObject.set(x, "room_sid", value.asInstanceOf[js.Any])
      
      inline def setRoom_status(value: RoomRoomStatus): Self = StObject.set(x, "room_status", value.asInstanceOf[js.Any])
      
      inline def setRoom_type(value: RoomRoomType): Self = StObject.set(x, "room_type", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setTotal_participant_duration_sec(value: Double): Self = StObject.set(x, "total_participant_duration_sec", value.asInstanceOf[js.Any])
      
      inline def setTotal_recording_duration_sec(value: Double): Self = StObject.set(x, "total_recording_duration_sec", value.asInstanceOf[js.Any])
      
      inline def setUnique_participant_identities(value: Double): Self = StObject.set(x, "unique_participant_identities", value.asInstanceOf[js.Any])
      
      inline def setUnique_participants(value: Double): Self = StObject.set(x, "unique_participants", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.in_progress
    - typings.twilio.twilioStrings.completed_
  */
  trait RoomRoomStatus extends StObject
  object RoomRoomStatus {
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def in_progress: typings.twilio.twilioStrings.in_progress = "in_progress".asInstanceOf[typings.twilio.twilioStrings.in_progress]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.go
    - typings.twilio.twilioStrings.peer_to_peer
    - typings.twilio.twilioStrings.group
    - typings.twilio.twilioStrings.group_small
  */
  trait RoomRoomType extends StObject
  object RoomRoomType {
    
    inline def go: typings.twilio.twilioStrings.go = "go".asInstanceOf[typings.twilio.twilioStrings.go]
    
    inline def group: typings.twilio.twilioStrings.group = "group".asInstanceOf[typings.twilio.twilioStrings.group]
    
    inline def group_small: typings.twilio.twilioStrings.group_small = "group_small".asInstanceOf[typings.twilio.twilioStrings.group_small]
    
    inline def peer_to_peer: typings.twilio.twilioStrings.peer_to_peer = "peer_to_peer".asInstanceOf[typings.twilio.twilioStrings.peer_to_peer]
  }
  
  trait RoomSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.us1
    - typings.twilio.twilioStrings.us2
    - typings.twilio.twilioStrings.au1
    - typings.twilio.twilioStrings.br1
    - typings.twilio.twilioStrings.ie1
    - typings.twilio.twilioStrings.jp1
    - typings.twilio.twilioStrings.sg1
    - typings.twilio.twilioStrings.in1
    - typings.twilio.twilioStrings.de1
    - typings.twilio.twilioStrings.gll
  */
  trait RoomTwilioRealm extends StObject
  object RoomTwilioRealm {
    
    inline def au1: typings.twilio.twilioStrings.au1 = "au1".asInstanceOf[typings.twilio.twilioStrings.au1]
    
    inline def br1: typings.twilio.twilioStrings.br1 = "br1".asInstanceOf[typings.twilio.twilioStrings.br1]
    
    inline def de1: typings.twilio.twilioStrings.de1 = "de1".asInstanceOf[typings.twilio.twilioStrings.de1]
    
    inline def gll: typings.twilio.twilioStrings.gll = "gll".asInstanceOf[typings.twilio.twilioStrings.gll]
    
    inline def ie1: typings.twilio.twilioStrings.ie1 = "ie1".asInstanceOf[typings.twilio.twilioStrings.ie1]
    
    inline def in1: typings.twilio.twilioStrings.in1 = "in1".asInstanceOf[typings.twilio.twilioStrings.in1]
    
    inline def jp1: typings.twilio.twilioStrings.jp1 = "jp1".asInstanceOf[typings.twilio.twilioStrings.jp1]
    
    inline def sg1: typings.twilio.twilioStrings.sg1 = "sg1".asInstanceOf[typings.twilio.twilioStrings.sg1]
    
    inline def us1: typings.twilio.twilioStrings.us1 = "us1".asInstanceOf[typings.twilio.twilioStrings.us1]
    
    inline def us2: typings.twilio.twilioStrings.us2 = "us2".asInstanceOf[typings.twilio.twilioStrings.us2]
  }
}
