package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.roomRecordingMod.RoomRecordingContext
import typings.twilio.roomRecordingMod.RoomRecordingListInstance
import typings.twilio.roomRecordingRuleMod.RecordingRulesListInstance
import typings.twilio.roomRoomParticipantMod.ParticipantContext
import typings.twilio.roomRoomParticipantMod.ParticipantListInstance
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1RoomMod {
  
  @JSImport("twilio/lib/rest/video/v1/room", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/room", "RoomContext")
  @js.native
  open class RoomContext protected () extends StObject {
    /**
      * Initialize the RoomContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, sid: String) = this()
    
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
    
    var recordingRules: RecordingRulesListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def recordings(sid: String): RoomRecordingContext = js.native
    @JSName("recordings")
    var recordings_Original: RoomRecordingListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a RoomInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: RoomInstanceUpdateOptions): js.Promise[RoomInstance] = js.native
    def update(
      opts: RoomInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RoomInstance, Any]
    ): js.Promise[RoomInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/video/v1/room", "RoomInstance")
  @js.native
  open class RoomInstance protected () extends SerializableClass {
    /**
      * Initialize the RoomContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, payload: RoomPayload, sid: String) = this()
    
    /* private */ var _proxy: RoomContext = js.native
    
    var accountSid: String = js.native
    
    var audioOnly: Boolean = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var duration: Double = js.native
    
    var emptyRoomTimeout: Double = js.native
    
    var enableTurn: Boolean = js.native
    
    var endTime: js.Date = js.native
    
    /**
      * fetch a RoomInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RoomInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RoomInstance] = js.native
    
    var largeRoom: Boolean = js.native
    
    var links: String = js.native
    
    var maxConcurrentPublishedTracks: Double = js.native
    
    var maxParticipantDuration: Double = js.native
    
    var maxParticipants: Double = js.native
    
    var mediaRegion: String = js.native
    
    /**
      * Access the participants
      */
    def participants(): ParticipantListInstance = js.native
    
    var recordParticipantsOnConnect: Boolean = js.native
    
    /**
      * Access the recordingRules
      */
    def recordingRules(): RecordingRulesListInstance = js.native
    
    /**
      * Access the recordings
      */
    def recordings(): RoomRecordingListInstance = js.native
    
    var sid: String = js.native
    
    var status: RoomRoomStatus = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    var `type`: RoomRoomType = js.native
    
    var uniqueName: String = js.native
    
    var unusedRoomTimeout: Double = js.native
    
    /**
      * update a RoomInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: RoomInstanceUpdateOptions): js.Promise[RoomInstance] = js.native
    def update(
      opts: RoomInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[RoomInstance] = js.native
    
    var url: String = js.native
    
    var videoCodecs: js.Array[RoomVideoCodec] = js.native
  }
  
  /**
    * Initialize the RoomList
    *
    * @param version - Version of the resource
    */
  inline def RoomList(version: typings.twilio.videoV1Mod.^): RoomListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("RoomList")(version.asInstanceOf[js.Any]).asInstanceOf[RoomListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/room", "RoomPage")
  @js.native
  open class RoomPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.videoV1Mod.^, RoomPayload, RoomResource, RoomInstance] {
    /**
      * Initialize the RoomPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
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
  
  /**
    * Options to pass to update
    *
    * @property status - The new status of the resource
    */
  trait RoomInstanceUpdateOptions extends StObject {
    
    var status: RoomRoomStatus
  }
  object RoomInstanceUpdateOptions {
    
    inline def apply(status: RoomRoomStatus): RoomInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomInstanceUpdateOptions]
    }
    
    extension [Self <: RoomInstanceUpdateOptions](x: Self) {
      
      inline def setStatus(value: RoomRoomStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoomListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RoomContext = js.native
    
    /**
      * create a RoomInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[RoomInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ RoomInstance, Any]): js.Promise[RoomInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ RoomInstance, Any]): js.Promise[RoomInstance] = js.native
    def create(opts: RoomListInstanceCreateOptions): js.Promise[RoomInstance] = js.native
    def create(
      opts: RoomListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ RoomInstance, Any]
    ): js.Promise[RoomInstance] = js.native
    
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
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): RoomContext = js.native
    
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
    * Options to pass to create
    *
    * @property audioOnly - Indicates whether the room will only contain audio track participants for group rooms.
    * @property emptyRoomTimeout - Configures the time a room will remain active after last participant leaves.
    * @property enableTurn - Enable Twilio's Network Traversal TURN service
    * @property largeRoom - Indicates whether this is a large room.
    * @property maxParticipantDuration - The maximum number of seconds a Participant can be connected to the room
    * @property maxParticipants - The maximum number of concurrent Participants allowed in the room
    * @property mediaRegion - The region for the media server in Group Rooms
    * @property recordParticipantsOnConnect - Whether to start recording when Participants connect
    * @property recordingRules - A collection of Recording Rules
    * @property statusCallback - The URL to send status information to your application
    * @property statusCallbackMethod - The HTTP method we should use to call status_callback
    * @property type - The type of room
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    * @property unusedRoomTimeout - Configures the time a room will remain active when no one joins.
    * @property videoCodecs - An array of the video codecs that are supported when publishing a track in the room
    */
  trait RoomListInstanceCreateOptions extends StObject {
    
    var audioOnly: js.UndefOr[Boolean] = js.undefined
    
    var emptyRoomTimeout: js.UndefOr[Double] = js.undefined
    
    var enableTurn: js.UndefOr[Boolean] = js.undefined
    
    var largeRoom: js.UndefOr[Boolean] = js.undefined
    
    var maxParticipantDuration: js.UndefOr[Double] = js.undefined
    
    var maxParticipants: js.UndefOr[Double] = js.undefined
    
    var mediaRegion: js.UndefOr[String] = js.undefined
    
    var recordParticipantsOnConnect: js.UndefOr[Boolean] = js.undefined
    
    var recordingRules: js.UndefOr[js.Object] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[RoomRoomType] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
    
    var unusedRoomTimeout: js.UndefOr[Double] = js.undefined
    
    var videoCodecs: js.UndefOr[RoomVideoCodec | js.Array[RoomVideoCodec]] = js.undefined
  }
  object RoomListInstanceCreateOptions {
    
    inline def apply(): RoomListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomListInstanceCreateOptions]
    }
    
    extension [Self <: RoomListInstanceCreateOptions](x: Self) {
      
      inline def setAudioOnly(value: Boolean): Self = StObject.set(x, "audioOnly", value.asInstanceOf[js.Any])
      
      inline def setAudioOnlyUndefined: Self = StObject.set(x, "audioOnly", js.undefined)
      
      inline def setEmptyRoomTimeout(value: Double): Self = StObject.set(x, "emptyRoomTimeout", value.asInstanceOf[js.Any])
      
      inline def setEmptyRoomTimeoutUndefined: Self = StObject.set(x, "emptyRoomTimeout", js.undefined)
      
      inline def setEnableTurn(value: Boolean): Self = StObject.set(x, "enableTurn", value.asInstanceOf[js.Any])
      
      inline def setEnableTurnUndefined: Self = StObject.set(x, "enableTurn", js.undefined)
      
      inline def setLargeRoom(value: Boolean): Self = StObject.set(x, "largeRoom", value.asInstanceOf[js.Any])
      
      inline def setLargeRoomUndefined: Self = StObject.set(x, "largeRoom", js.undefined)
      
      inline def setMaxParticipantDuration(value: Double): Self = StObject.set(x, "maxParticipantDuration", value.asInstanceOf[js.Any])
      
      inline def setMaxParticipantDurationUndefined: Self = StObject.set(x, "maxParticipantDuration", js.undefined)
      
      inline def setMaxParticipants(value: Double): Self = StObject.set(x, "maxParticipants", value.asInstanceOf[js.Any])
      
      inline def setMaxParticipantsUndefined: Self = StObject.set(x, "maxParticipants", js.undefined)
      
      inline def setMediaRegion(value: String): Self = StObject.set(x, "mediaRegion", value.asInstanceOf[js.Any])
      
      inline def setMediaRegionUndefined: Self = StObject.set(x, "mediaRegion", js.undefined)
      
      inline def setRecordParticipantsOnConnect(value: Boolean): Self = StObject.set(x, "recordParticipantsOnConnect", value.asInstanceOf[js.Any])
      
      inline def setRecordParticipantsOnConnectUndefined: Self = StObject.set(x, "recordParticipantsOnConnect", js.undefined)
      
      inline def setRecordingRules(value: js.Object): Self = StObject.set(x, "recordingRules", value.asInstanceOf[js.Any])
      
      inline def setRecordingRulesUndefined: Self = StObject.set(x, "recordingRules", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setType(value: RoomRoomType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
      
      inline def setUnusedRoomTimeout(value: Double): Self = StObject.set(x, "unusedRoomTimeout", value.asInstanceOf[js.Any])
      
      inline def setUnusedRoomTimeoutUndefined: Self = StObject.set(x, "unusedRoomTimeout", js.undefined)
      
      inline def setVideoCodecs(value: RoomVideoCodec | js.Array[RoomVideoCodec]): Self = StObject.set(x, "videoCodecs", value.asInstanceOf[js.Any])
      
      inline def setVideoCodecsUndefined: Self = StObject.set(x, "videoCodecs", js.undefined)
      
      inline def setVideoCodecsVarargs(value: RoomVideoCodec*): Self = StObject.set(x, "videoCodecs", js.Array(value*))
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property dateCreatedAfter - Read only rooms that started on or after this date, given as YYYY-MM-DD
    * @property dateCreatedBefore - Read only rooms that started before this date, given as YYYY-MM-DD
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
    * @property status - Read only the rooms with this status
    * @property uniqueName - Read only rooms with this unique_name
    */
  trait RoomListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ RoomInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[RoomRoomStatus] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
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
      
      inline def setStatus(value: RoomRoomStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property dateCreatedAfter - Read only rooms that started on or after this date, given as YYYY-MM-DD
    * @property dateCreatedBefore - Read only rooms that started before this date, given as YYYY-MM-DD
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
    * @property status - Read only the rooms with this status
    * @property uniqueName - Read only rooms with this unique_name
    */
  trait RoomListInstanceOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[RoomRoomStatus] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object RoomListInstanceOptions {
    
    inline def apply(): RoomListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomListInstanceOptions]
    }
    
    extension [Self <: RoomListInstanceOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: RoomRoomStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dateCreatedAfter - Read only rooms that started on or after this date, given as YYYY-MM-DD
    * @property dateCreatedBefore - Read only rooms that started before this date, given as YYYY-MM-DD
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - Read only the rooms with this status
    * @property uniqueName - Read only rooms with this unique_name
    */
  trait RoomListInstancePageOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[RoomRoomStatus] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object RoomListInstancePageOptions {
    
    inline def apply(): RoomListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomListInstancePageOptions]
    }
    
    extension [Self <: RoomListInstancePageOptions](x: Self) {
      
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
      
      inline def setStatus(value: RoomRoomStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait RoomPayload
    extends StObject
       with RoomResource
       with TwilioResponsePayload
  object RoomPayload {
    
    inline def apply(
      account_sid: String,
      audio_only: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      duration: Double,
      empty_room_timeout: Double,
      enable_turn: Boolean,
      end_time: js.Date,
      first_page_uri: String,
      large_room: Boolean,
      links: String,
      max_concurrent_published_tracks: Double,
      max_participant_duration: Double,
      max_participants: Double,
      media_region: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      record_participants_on_connect: Boolean,
      sid: String,
      status: RoomRoomStatus,
      status_callback: String,
      status_callback_method: String,
      `type`: RoomRoomType,
      unique_name: String,
      unused_room_timeout: Double,
      uri: String,
      url: String,
      video_codecs: js.Array[RoomVideoCodec]
    ): RoomPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], audio_only = audio_only.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], empty_room_timeout = empty_room_timeout.asInstanceOf[js.Any], enable_turn = enable_turn.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], large_room = large_room.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], max_concurrent_published_tracks = max_concurrent_published_tracks.asInstanceOf[js.Any], max_participant_duration = max_participant_duration.asInstanceOf[js.Any], max_participants = max_participants.asInstanceOf[js.Any], media_region = media_region.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], record_participants_on_connect = record_participants_on_connect.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], unused_room_timeout = unused_room_timeout.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], video_codecs = video_codecs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomPayload]
    }
  }
  
  trait RoomResource extends StObject {
    
    var account_sid: String
    
    var audio_only: Boolean
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var duration: Double
    
    var empty_room_timeout: Double
    
    var enable_turn: Boolean
    
    var end_time: js.Date
    
    var large_room: Boolean
    
    var links: String
    
    var max_concurrent_published_tracks: Double
    
    var max_participant_duration: Double
    
    var max_participants: Double
    
    var media_region: String
    
    var record_participants_on_connect: Boolean
    
    var sid: String
    
    var status: RoomRoomStatus
    
    var status_callback: String
    
    var status_callback_method: String
    
    var `type`: RoomRoomType
    
    var unique_name: String
    
    var unused_room_timeout: Double
    
    var url: String
    
    var video_codecs: js.Array[RoomVideoCodec]
  }
  object RoomResource {
    
    inline def apply(
      account_sid: String,
      audio_only: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      duration: Double,
      empty_room_timeout: Double,
      enable_turn: Boolean,
      end_time: js.Date,
      large_room: Boolean,
      links: String,
      max_concurrent_published_tracks: Double,
      max_participant_duration: Double,
      max_participants: Double,
      media_region: String,
      record_participants_on_connect: Boolean,
      sid: String,
      status: RoomRoomStatus,
      status_callback: String,
      status_callback_method: String,
      `type`: RoomRoomType,
      unique_name: String,
      unused_room_timeout: Double,
      url: String,
      video_codecs: js.Array[RoomVideoCodec]
    ): RoomResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], audio_only = audio_only.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], empty_room_timeout = empty_room_timeout.asInstanceOf[js.Any], enable_turn = enable_turn.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], large_room = large_room.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], max_concurrent_published_tracks = max_concurrent_published_tracks.asInstanceOf[js.Any], max_participant_duration = max_participant_duration.asInstanceOf[js.Any], max_participants = max_participants.asInstanceOf[js.Any], media_region = media_region.asInstanceOf[js.Any], record_participants_on_connect = record_participants_on_connect.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], unused_room_timeout = unused_room_timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], video_codecs = video_codecs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomResource]
    }
    
    extension [Self <: RoomResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAudio_only(value: Boolean): Self = StObject.set(x, "audio_only", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEmpty_room_timeout(value: Double): Self = StObject.set(x, "empty_room_timeout", value.asInstanceOf[js.Any])
      
      inline def setEnable_turn(value: Boolean): Self = StObject.set(x, "enable_turn", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setLarge_room(value: Boolean): Self = StObject.set(x, "large_room", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMax_concurrent_published_tracks(value: Double): Self = StObject.set(x, "max_concurrent_published_tracks", value.asInstanceOf[js.Any])
      
      inline def setMax_participant_duration(value: Double): Self = StObject.set(x, "max_participant_duration", value.asInstanceOf[js.Any])
      
      inline def setMax_participants(value: Double): Self = StObject.set(x, "max_participants", value.asInstanceOf[js.Any])
      
      inline def setMedia_region(value: String): Self = StObject.set(x, "media_region", value.asInstanceOf[js.Any])
      
      inline def setRecord_participants_on_connect(value: Boolean): Self = StObject.set(x, "record_participants_on_connect", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: RoomRoomStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setType(value: RoomRoomType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUnused_room_timeout(value: Double): Self = StObject.set(x, "unused_room_timeout", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVideo_codecs(value: js.Array[RoomVideoCodec]): Self = StObject.set(x, "video_codecs", value.asInstanceOf[js.Any])
      
      inline def setVideo_codecsVarargs(value: RoomVideoCodec*): Self = StObject.set(x, "video_codecs", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.failed__
  */
  trait RoomRoomStatus extends StObject
  object RoomRoomStatus {
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def `in-progress`: typings.twilio.twilioStrings.`in-progress` = "in-progress".asInstanceOf[typings.twilio.twilioStrings.`in-progress`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.go
    - typings.twilio.twilioStrings.`peer-to-peer`
    - typings.twilio.twilioStrings.group
    - typings.twilio.twilioStrings.`group-small`
  */
  trait RoomRoomType extends StObject
  object RoomRoomType {
    
    inline def go: typings.twilio.twilioStrings.go = "go".asInstanceOf[typings.twilio.twilioStrings.go]
    
    inline def group: typings.twilio.twilioStrings.group = "group".asInstanceOf[typings.twilio.twilioStrings.group]
    
    inline def `group-small`: typings.twilio.twilioStrings.`group-small` = "group-small".asInstanceOf[typings.twilio.twilioStrings.`group-small`]
    
    inline def `peer-to-peer`: typings.twilio.twilioStrings.`peer-to-peer` = "peer-to-peer".asInstanceOf[typings.twilio.twilioStrings.`peer-to-peer`]
  }
  
  trait RoomSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.VP8
    - typings.twilio.twilioStrings.H264
  */
  trait RoomVideoCodec extends StObject
  object RoomVideoCodec {
    
    inline def H264: typings.twilio.twilioStrings.H264 = "H264".asInstanceOf[typings.twilio.twilioStrings.H264]
    
    inline def VP8: typings.twilio.twilioStrings.VP8 = "VP8".asInstanceOf[typings.twilio.twilioStrings.VP8]
  }
}
