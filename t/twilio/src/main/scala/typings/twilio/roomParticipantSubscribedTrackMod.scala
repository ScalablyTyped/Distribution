package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomParticipantSubscribedTrackMod {
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantSubscribedTrack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantSubscribedTrack", "SubscribedTrackContext")
  @js.native
  open class SubscribedTrackContext protected () extends StObject {
    /**
      * Initialize the SubscribedTrackContext
      *
      * @param version - Version of the resource
      * @param roomSid - The SID of the Room where the Track resource to fetch is subscribed
      * @param participantSid - The SID of the participant that subscribes to the Track resource to fetch
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, roomSid: String, participantSid: String, sid: String) = this()
    
    /**
      * fetch a SubscribedTrackInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SubscribedTrackInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedTrackInstance, Any]): js.Promise[SubscribedTrackInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantSubscribedTrack", "SubscribedTrackInstance")
  @js.native
  open class SubscribedTrackInstance protected () extends SerializableClass {
    /**
      * Initialize the SubscribedTrackContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param roomSid - The SID of the room where the track is published
      * @param participantSid - The SID of the participant that subscribes to the track
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      payload: SubscribedTrackPayload,
      roomSid: String,
      participantSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: SubscribedTrackContext = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * fetch a SubscribedTrackInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SubscribedTrackInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SubscribedTrackInstance] = js.native
    
    var kind: SubscribedTrackKind = js.native
    
    var name: String = js.native
    
    var participantSid: String = js.native
    
    var publisherSid: String = js.native
    
    var roomSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SubscribedTrackList
    *
    * @param version - Version of the resource
    * @param roomSid - The SID of the room where the track is published
    * @param participantSid - The SID of the participant that subscribes to the track
    */
  inline def SubscribedTrackList(version: typings.twilio.videoV1Mod.^, roomSid: String, participantSid: String): SubscribedTrackListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SubscribedTrackList")(version.asInstanceOf[js.Any], roomSid.asInstanceOf[js.Any], participantSid.asInstanceOf[js.Any])).asInstanceOf[SubscribedTrackListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantSubscribedTrack", "SubscribedTrackPage")
  @js.native
  open class SubscribedTrackPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.videoV1Mod.^, 
          SubscribedTrackPayload, 
          SubscribedTrackResource, 
          SubscribedTrackInstance
        ] {
    /**
      * Initialize the SubscribedTrackPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SubscribedTrackSolution
    ) = this()
    
    /**
      * Build an instance of SubscribedTrackInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SubscribedTrackPayload): SubscribedTrackInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.audio
    - typings.twilio.twilioStrings.video
    - typings.twilio.twilioStrings.data
  */
  trait SubscribedTrackKind extends StObject
  object SubscribedTrackKind {
    
    inline def audio: typings.twilio.twilioStrings.audio = "audio".asInstanceOf[typings.twilio.twilioStrings.audio]
    
    inline def data: typings.twilio.twilioStrings.data = "data".asInstanceOf[typings.twilio.twilioStrings.data]
    
    inline def video: typings.twilio.twilioStrings.video = "video".asInstanceOf[typings.twilio.twilioStrings.video]
  }
  
  @js.native
  trait SubscribedTrackListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SubscribedTrackContext = js.native
    
    /**
      * Streams SubscribedTrackInstance records from the API.
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
          /* item */ SubscribedTrackInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SubscribedTrackInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SubscribedTrackListInstanceEachOptions): Unit = js.native
    def each(
      opts: SubscribedTrackListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SubscribedTrackInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a subscribed_track
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): SubscribedTrackContext = js.native
    
    /**
      * Retrieve a single target page of SubscribedTrackInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SubscribedTrackPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedTrackPage, Any]): js.Promise[SubscribedTrackPage] = js.native
    def getPage(targetUrl: String): js.Promise[SubscribedTrackPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedTrackPage, Any]
    ): js.Promise[SubscribedTrackPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedTrackPage, Any]
    ): js.Promise[SubscribedTrackPage] = js.native
    
    /**
      * Lists SubscribedTrackInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SubscribedTrackInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SubscribedTrackInstance], Any]
    ): js.Promise[js.Array[SubscribedTrackInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SubscribedTrackInstance], Any]
    ): js.Promise[js.Array[SubscribedTrackInstance]] = js.native
    def list(opts: SubscribedTrackListInstanceOptions): js.Promise[js.Array[SubscribedTrackInstance]] = js.native
    def list(
      opts: SubscribedTrackListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SubscribedTrackInstance], Any]
    ): js.Promise[js.Array[SubscribedTrackInstance]] = js.native
    
    /**
      * Retrieve a single page of SubscribedTrackInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SubscribedTrackPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedTrackPage, Any]): js.Promise[SubscribedTrackPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedTrackPage, Any]
    ): js.Promise[SubscribedTrackPage] = js.native
    def page(opts: SubscribedTrackListInstancePageOptions): js.Promise[SubscribedTrackPage] = js.native
    def page(
      opts: SubscribedTrackListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedTrackPage, Any]
    ): js.Promise[SubscribedTrackPage] = js.native
    
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
  trait SubscribedTrackListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SubscribedTrackInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SubscribedTrackListInstanceEachOptions {
    
    inline def apply(): SubscribedTrackListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribedTrackListInstanceEachOptions]
    }
    
    extension [Self <: SubscribedTrackListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SubscribedTrackInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait SubscribedTrackListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SubscribedTrackListInstanceOptions {
    
    inline def apply(): SubscribedTrackListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribedTrackListInstanceOptions]
    }
    
    extension [Self <: SubscribedTrackListInstanceOptions](x: Self) {
      
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
  trait SubscribedTrackListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SubscribedTrackListInstancePageOptions {
    
    inline def apply(): SubscribedTrackListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribedTrackListInstancePageOptions]
    }
    
    extension [Self <: SubscribedTrackListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SubscribedTrackPayload
    extends StObject
       with SubscribedTrackResource
       with TwilioResponsePayload
  object SubscribedTrackPayload {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      first_page_uri: String,
      kind: SubscribedTrackKind,
      name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      participant_sid: String,
      previous_page_uri: String,
      publisher_sid: String,
      room_sid: String,
      sid: String,
      uri: String,
      url: String
    ): SubscribedTrackPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], publisher_sid = publisher_sid.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribedTrackPayload]
    }
  }
  
  trait SubscribedTrackResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var enabled: Boolean
    
    var kind: SubscribedTrackKind
    
    var name: String
    
    var participant_sid: String
    
    var publisher_sid: String
    
    var room_sid: String
    
    var sid: String
    
    var url: String
  }
  object SubscribedTrackResource {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      kind: SubscribedTrackKind,
      name: String,
      participant_sid: String,
      publisher_sid: String,
      room_sid: String,
      sid: String,
      url: String
    ): SubscribedTrackResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], publisher_sid = publisher_sid.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribedTrackResource]
    }
    
    extension [Self <: SubscribedTrackResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setKind(value: SubscribedTrackKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParticipant_sid(value: String): Self = StObject.set(x, "participant_sid", value.asInstanceOf[js.Any])
      
      inline def setPublisher_sid(value: String): Self = StObject.set(x, "publisher_sid", value.asInstanceOf[js.Any])
      
      inline def setRoom_sid(value: String): Self = StObject.set(x, "room_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscribedTrackSolution extends StObject {
    
    var participantSid: js.UndefOr[String] = js.undefined
    
    var roomSid: js.UndefOr[String] = js.undefined
  }
  object SubscribedTrackSolution {
    
    inline def apply(): SubscribedTrackSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribedTrackSolution]
    }
    
    extension [Self <: SubscribedTrackSolution](x: Self) {
      
      inline def setParticipantSid(value: String): Self = StObject.set(x, "participantSid", value.asInstanceOf[js.Any])
      
      inline def setParticipantSidUndefined: Self = StObject.set(x, "participantSid", js.undefined)
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setRoomSidUndefined: Self = StObject.set(x, "roomSid", js.undefined)
    }
  }
}
