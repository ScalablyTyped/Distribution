package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomParticipantPublishedTrackMod {
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantPublishedTrack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantPublishedTrack", "PublishedTrackContext")
  @js.native
  open class PublishedTrackContext protected () extends StObject {
    /**
      * Initialize the PublishedTrackContext
      *
      * @param version - Version of the resource
      * @param roomSid - The SID of the Room resource where the Track resource to fetch is published
      * @param participantSid - The SID of the Participant resource with the published track to fetch
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, roomSid: String, participantSid: String, sid: String) = this()
    
    /**
      * fetch a PublishedTrackInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PublishedTrackInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ PublishedTrackInstance, Any]): js.Promise[PublishedTrackInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantPublishedTrack", "PublishedTrackInstance")
  @js.native
  open class PublishedTrackInstance protected () extends SerializableClass {
    /**
      * Initialize the PublishedTrackContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param roomSid - The SID of the Room resource where the track is published
      * @param participantSid - The SID of the Participant resource with the published track
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      payload: PublishedTrackPayload,
      roomSid: String,
      participantSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: PublishedTrackContext = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * fetch a PublishedTrackInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PublishedTrackInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PublishedTrackInstance] = js.native
    
    var kind: PublishedTrackKind = js.native
    
    var name: String = js.native
    
    var participantSid: String = js.native
    
    var roomSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the PublishedTrackList
    *
    * @param version - Version of the resource
    * @param roomSid - The SID of the Room resource where the track is published
    * @param participantSid - The SID of the Participant resource with the published track
    */
  inline def PublishedTrackList(version: typings.twilio.videoV1Mod.^, roomSid: String, participantSid: String): PublishedTrackListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("PublishedTrackList")(version.asInstanceOf[js.Any], roomSid.asInstanceOf[js.Any], participantSid.asInstanceOf[js.Any])).asInstanceOf[PublishedTrackListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantPublishedTrack", "PublishedTrackPage")
  @js.native
  open class PublishedTrackPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.videoV1Mod.^, 
          PublishedTrackPayload, 
          PublishedTrackResource, 
          PublishedTrackInstance
        ] {
    /**
      * Initialize the PublishedTrackPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: PublishedTrackSolution
    ) = this()
    
    /**
      * Build an instance of PublishedTrackInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: PublishedTrackPayload): PublishedTrackInstance = js.native
    
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
  trait PublishedTrackKind extends StObject
  object PublishedTrackKind {
    
    inline def audio: typings.twilio.twilioStrings.audio = "audio".asInstanceOf[typings.twilio.twilioStrings.audio]
    
    inline def data: typings.twilio.twilioStrings.data = "data".asInstanceOf[typings.twilio.twilioStrings.data]
    
    inline def video: typings.twilio.twilioStrings.video = "video".asInstanceOf[typings.twilio.twilioStrings.video]
  }
  
  @js.native
  trait PublishedTrackListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): PublishedTrackContext = js.native
    
    /**
      * Streams PublishedTrackInstance records from the API.
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
          /* item */ PublishedTrackInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ PublishedTrackInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: PublishedTrackListInstanceEachOptions): Unit = js.native
    def each(
      opts: PublishedTrackListInstanceEachOptions,
      callback: js.Function2[
          /* item */ PublishedTrackInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a published_track
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): PublishedTrackContext = js.native
    
    /**
      * Retrieve a single target page of PublishedTrackInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[PublishedTrackPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ PublishedTrackPage, Any]): js.Promise[PublishedTrackPage] = js.native
    def getPage(targetUrl: String): js.Promise[PublishedTrackPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PublishedTrackPage, Any]
    ): js.Promise[PublishedTrackPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PublishedTrackPage, Any]
    ): js.Promise[PublishedTrackPage] = js.native
    
    /**
      * Lists PublishedTrackInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[PublishedTrackInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PublishedTrackInstance], Any]
    ): js.Promise[js.Array[PublishedTrackInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PublishedTrackInstance], Any]
    ): js.Promise[js.Array[PublishedTrackInstance]] = js.native
    def list(opts: PublishedTrackListInstanceOptions): js.Promise[js.Array[PublishedTrackInstance]] = js.native
    def list(
      opts: PublishedTrackListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PublishedTrackInstance], Any]
    ): js.Promise[js.Array[PublishedTrackInstance]] = js.native
    
    /**
      * Retrieve a single page of PublishedTrackInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[PublishedTrackPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ PublishedTrackPage, Any]): js.Promise[PublishedTrackPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PublishedTrackPage, Any]
    ): js.Promise[PublishedTrackPage] = js.native
    def page(opts: PublishedTrackListInstancePageOptions): js.Promise[PublishedTrackPage] = js.native
    def page(
      opts: PublishedTrackListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PublishedTrackPage, Any]
    ): js.Promise[PublishedTrackPage] = js.native
    
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
  trait PublishedTrackListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ PublishedTrackInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PublishedTrackListInstanceEachOptions {
    
    inline def apply(): PublishedTrackListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishedTrackListInstanceEachOptions]
    }
    
    extension [Self <: PublishedTrackListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ PublishedTrackInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait PublishedTrackListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PublishedTrackListInstanceOptions {
    
    inline def apply(): PublishedTrackListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishedTrackListInstanceOptions]
    }
    
    extension [Self <: PublishedTrackListInstanceOptions](x: Self) {
      
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
  trait PublishedTrackListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object PublishedTrackListInstancePageOptions {
    
    inline def apply(): PublishedTrackListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishedTrackListInstancePageOptions]
    }
    
    extension [Self <: PublishedTrackListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait PublishedTrackPayload
    extends StObject
       with PublishedTrackResource
       with TwilioResponsePayload
  object PublishedTrackPayload {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      first_page_uri: String,
      kind: PublishedTrackKind,
      name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      participant_sid: String,
      previous_page_uri: String,
      room_sid: String,
      sid: String,
      uri: String,
      url: String
    ): PublishedTrackPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishedTrackPayload]
    }
  }
  
  trait PublishedTrackResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var enabled: Boolean
    
    var kind: PublishedTrackKind
    
    var name: String
    
    var participant_sid: String
    
    var room_sid: String
    
    var sid: String
    
    var url: String
  }
  object PublishedTrackResource {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      kind: PublishedTrackKind,
      name: String,
      participant_sid: String,
      room_sid: String,
      sid: String,
      url: String
    ): PublishedTrackResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishedTrackResource]
    }
    
    extension [Self <: PublishedTrackResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setKind(value: PublishedTrackKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParticipant_sid(value: String): Self = StObject.set(x, "participant_sid", value.asInstanceOf[js.Any])
      
      inline def setRoom_sid(value: String): Self = StObject.set(x, "room_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublishedTrackSolution extends StObject {
    
    var participantSid: js.UndefOr[String] = js.undefined
    
    var roomSid: js.UndefOr[String] = js.undefined
  }
  object PublishedTrackSolution {
    
    inline def apply(): PublishedTrackSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishedTrackSolution]
    }
    
    extension [Self <: PublishedTrackSolution](x: Self) {
      
      inline def setParticipantSid(value: String): Self = StObject.set(x, "participantSid", value.asInstanceOf[js.Any])
      
      inline def setParticipantSidUndefined: Self = StObject.set(x, "participantSid", js.undefined)
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setRoomSidUndefined: Self = StObject.set(x, "roomSid", js.undefined)
    }
  }
}
