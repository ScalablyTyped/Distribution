package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomParticipantMod {
  
  @JSImport("twilio/lib/rest/insights/v1/room/participant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/room/participant", "ParticipantContext")
  @js.native
  open class ParticipantContext protected () extends StObject {
    /**
      * Initialize the ParticipantContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param roomSid - The SID of the Room resource.
      * @param participantSid - The SID of the Participant resource.
      */
    def this(version: typings.twilio.insightsV1Mod.^, roomSid: String, participantSid: String) = this()
    
    /**
      * fetch a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]): js.Promise[ParticipantInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/insights/v1/room/participant", "ParticipantInstance")
  @js.native
  open class ParticipantInstance protected () extends SerializableClass {
    /**
      * Initialize the ParticipantContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param roomSid - Unique identifier for the room.
      * @param participantSid - The SID of the Participant resource.
      */
    def this(
      version: typings.twilio.insightsV1Mod.^,
      payload: ParticipantPayload,
      roomSid: String,
      participantSid: String
    ) = this()
    
    /* private */ var _proxy: ParticipantContext = js.native
    
    var accountSid: String = js.native
    
    var codecs: js.Array[ParticipantCodec] = js.native
    
    var durationSec: Double = js.native
    
    var edgeLocation: ParticipantEdgeLocation = js.native
    
    var endReason: String = js.native
    
    var errorCode: Double = js.native
    
    var errorCodeUrl: String = js.native
    
    /**
      * fetch a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ParticipantInstance] = js.native
    
    var joinTime: js.Date = js.native
    
    var leaveTime: js.Date = js.native
    
    var mediaRegion: ParticipantTwilioRealm = js.native
    
    var participantIdentity: String = js.native
    
    var participantSid: String = js.native
    
    var properties: Any = js.native
    
    var publisherInfo: Any = js.native
    
    var roomSid: String = js.native
    
    var status: ParticipantRoomStatus = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ParticipantList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param roomSid - Unique identifier for the room.
    */
  inline def ParticipantList(version: typings.twilio.insightsV1Mod.^, roomSid: String): ParticipantListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ParticipantList")(version.asInstanceOf[js.Any], roomSid.asInstanceOf[js.Any])).asInstanceOf[ParticipantListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/room/participant", "ParticipantPage")
  @js.native
  open class ParticipantPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.insightsV1Mod.^, 
          ParticipantPayload, 
          ParticipantResource, 
          ParticipantInstance
        ] {
    /**
      * Initialize the ParticipantPage
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
      solution: ParticipantSolution
    ) = this()
    
    /**
      * Build an instance of ParticipantInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ParticipantPayload): ParticipantInstance = js.native
    
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
  trait ParticipantCodec extends StObject
  object ParticipantCodec {
    
    inline def H264: typings.twilio.twilioStrings.H264 = "H264".asInstanceOf[typings.twilio.twilioStrings.H264]
    
    inline def VP8: typings.twilio.twilioStrings.VP8 = "VP8".asInstanceOf[typings.twilio.twilioStrings.VP8]
    
    inline def VP9: typings.twilio.twilioStrings.VP9 = "VP9".asInstanceOf[typings.twilio.twilioStrings.VP9]
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
  trait ParticipantEdgeLocation extends StObject
  object ParticipantEdgeLocation {
    
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
  
  @js.native
  trait ParticipantListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ParticipantContext = js.native
    
    /**
      * Streams ParticipantInstance records from the API.
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
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ParticipantListInstanceEachOptions): Unit = js.native
    def each(
      opts: ParticipantListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a participant
      *
      * @param participantSid - The SID of the Participant resource.
      */
    def get(participantSid: String): ParticipantContext = js.native
    
    /**
      * Retrieve a single target page of ParticipantInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ParticipantPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]): js.Promise[ParticipantPage] = js.native
    def getPage(targetUrl: String): js.Promise[ParticipantPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]
    ): js.Promise[ParticipantPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]
    ): js.Promise[ParticipantPage] = js.native
    
    /**
      * Lists ParticipantInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ParticipantInstance], Any]
    ): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ParticipantInstance], Any]
    ): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(opts: ParticipantListInstanceOptions): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(
      opts: ParticipantListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ParticipantInstance], Any]
    ): js.Promise[js.Array[ParticipantInstance]] = js.native
    
    /**
      * Retrieve a single page of ParticipantInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ParticipantPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]): js.Promise[ParticipantPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]): js.Promise[ParticipantPage] = js.native
    def page(opts: ParticipantListInstancePageOptions): js.Promise[ParticipantPage] = js.native
    def page(
      opts: ParticipantListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]
    ): js.Promise[ParticipantPage] = js.native
    
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
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait ParticipantListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ParticipantListInstanceEachOptions {
    
    inline def apply(): ParticipantListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstanceEachOptions]
    }
    
    extension [Self <: ParticipantListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ParticipantInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ParticipantListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ParticipantListInstanceOptions {
    
    inline def apply(): ParticipantListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstanceOptions]
    }
    
    extension [Self <: ParticipantListInstanceOptions](x: Self) {
      
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
  trait ParticipantListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ParticipantListInstancePageOptions {
    
    inline def apply(): ParticipantListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstancePageOptions]
    }
    
    extension [Self <: ParticipantListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ParticipantPayload
    extends StObject
       with ParticipantResource
       with TwilioResponsePayload
  object ParticipantPayload {
    
    inline def apply(
      account_sid: String,
      codecs: js.Array[ParticipantCodec],
      duration_sec: Double,
      edge_location: ParticipantEdgeLocation,
      end_reason: String,
      error_code: Double,
      error_code_url: String,
      first_page_uri: String,
      join_time: js.Date,
      leave_time: js.Date,
      media_region: ParticipantTwilioRealm,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      participant_identity: String,
      participant_sid: String,
      previous_page_uri: String,
      properties: js.Object,
      publisher_info: js.Object,
      room_sid: String,
      status: ParticipantRoomStatus,
      uri: String,
      url: String
    ): ParticipantPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], codecs = codecs.asInstanceOf[js.Any], duration_sec = duration_sec.asInstanceOf[js.Any], edge_location = edge_location.asInstanceOf[js.Any], end_reason = end_reason.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_code_url = error_code_url.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], join_time = join_time.asInstanceOf[js.Any], leave_time = leave_time.asInstanceOf[js.Any], media_region = media_region.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], participant_identity = participant_identity.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], publisher_info = publisher_info.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantPayload]
    }
  }
  
  trait ParticipantResource extends StObject {
    
    var account_sid: String
    
    var codecs: js.Array[ParticipantCodec]
    
    var duration_sec: Double
    
    var edge_location: ParticipantEdgeLocation
    
    var end_reason: String
    
    var error_code: Double
    
    var error_code_url: String
    
    var join_time: js.Date
    
    var leave_time: js.Date
    
    var media_region: ParticipantTwilioRealm
    
    var participant_identity: String
    
    var participant_sid: String
    
    var properties: js.Object
    
    var publisher_info: js.Object
    
    var room_sid: String
    
    var status: ParticipantRoomStatus
    
    var url: String
  }
  object ParticipantResource {
    
    inline def apply(
      account_sid: String,
      codecs: js.Array[ParticipantCodec],
      duration_sec: Double,
      edge_location: ParticipantEdgeLocation,
      end_reason: String,
      error_code: Double,
      error_code_url: String,
      join_time: js.Date,
      leave_time: js.Date,
      media_region: ParticipantTwilioRealm,
      participant_identity: String,
      participant_sid: String,
      properties: js.Object,
      publisher_info: js.Object,
      room_sid: String,
      status: ParticipantRoomStatus,
      url: String
    ): ParticipantResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], codecs = codecs.asInstanceOf[js.Any], duration_sec = duration_sec.asInstanceOf[js.Any], edge_location = edge_location.asInstanceOf[js.Any], end_reason = end_reason.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_code_url = error_code_url.asInstanceOf[js.Any], join_time = join_time.asInstanceOf[js.Any], leave_time = leave_time.asInstanceOf[js.Any], media_region = media_region.asInstanceOf[js.Any], participant_identity = participant_identity.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], publisher_info = publisher_info.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantResource]
    }
    
    extension [Self <: ParticipantResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCodecs(value: js.Array[ParticipantCodec]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
      
      inline def setCodecsVarargs(value: ParticipantCodec*): Self = StObject.set(x, "codecs", js.Array(value*))
      
      inline def setDuration_sec(value: Double): Self = StObject.set(x, "duration_sec", value.asInstanceOf[js.Any])
      
      inline def setEdge_location(value: ParticipantEdgeLocation): Self = StObject.set(x, "edge_location", value.asInstanceOf[js.Any])
      
      inline def setEnd_reason(value: String): Self = StObject.set(x, "end_reason", value.asInstanceOf[js.Any])
      
      inline def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_code_url(value: String): Self = StObject.set(x, "error_code_url", value.asInstanceOf[js.Any])
      
      inline def setJoin_time(value: js.Date): Self = StObject.set(x, "join_time", value.asInstanceOf[js.Any])
      
      inline def setLeave_time(value: js.Date): Self = StObject.set(x, "leave_time", value.asInstanceOf[js.Any])
      
      inline def setMedia_region(value: ParticipantTwilioRealm): Self = StObject.set(x, "media_region", value.asInstanceOf[js.Any])
      
      inline def setParticipant_identity(value: String): Self = StObject.set(x, "participant_identity", value.asInstanceOf[js.Any])
      
      inline def setParticipant_sid(value: String): Self = StObject.set(x, "participant_sid", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPublisher_info(value: js.Object): Self = StObject.set(x, "publisher_info", value.asInstanceOf[js.Any])
      
      inline def setRoom_sid(value: String): Self = StObject.set(x, "room_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ParticipantRoomStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.in_progress
    - typings.twilio.twilioStrings.completed_
  */
  trait ParticipantRoomStatus extends StObject
  object ParticipantRoomStatus {
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def in_progress: typings.twilio.twilioStrings.in_progress = "in_progress".asInstanceOf[typings.twilio.twilioStrings.in_progress]
  }
  
  trait ParticipantSolution extends StObject {
    
    var roomSid: js.UndefOr[String] = js.undefined
  }
  object ParticipantSolution {
    
    inline def apply(): ParticipantSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantSolution]
    }
    
    extension [Self <: ParticipantSolution](x: Self) {
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setRoomSidUndefined: Self = StObject.set(x, "roomSid", js.undefined)
    }
  }
  
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
  trait ParticipantTwilioRealm extends StObject
  object ParticipantTwilioRealm {
    
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
