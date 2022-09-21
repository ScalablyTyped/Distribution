package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.roomParticipantAnonymizeMod.AnonymizeContext
import typings.twilio.roomParticipantAnonymizeMod.AnonymizeListInstance
import typings.twilio.roomParticipantPublishedTrackMod.PublishedTrackContext
import typings.twilio.roomParticipantPublishedTrackMod.PublishedTrackListInstance
import typings.twilio.roomParticipantSubscribeRuleMod.SubscribeRulesListInstance
import typings.twilio.roomParticipantSubscribedTrackMod.SubscribedTrackContext
import typings.twilio.roomParticipantSubscribedTrackMod.SubscribedTrackListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomRoomParticipantMod {
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant", "ParticipantContext")
  @js.native
  open class ParticipantContext protected () extends StObject {
    /**
      * Initialize the ParticipantContext
      *
      * @param version - Version of the resource
      * @param roomSid - The SID of the room with the Participant resource to fetch
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, roomSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def anonymize(sid: String): AnonymizeContext = js.native
    @JSName("anonymize")
    var anonymize_Original: AnonymizeListInstance = js.native
    
    /**
      * fetch a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]): js.Promise[ParticipantInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def publishedTracks(sid: String): PublishedTrackContext = js.native
    @JSName("publishedTracks")
    var publishedTracks_Original: PublishedTrackListInstance = js.native
    
    var subscribeRules: SubscribeRulesListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def subscribedTracks(sid: String): SubscribedTrackContext = js.native
    @JSName("subscribedTracks")
    var subscribedTracks_Original: SubscribedTrackListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ParticipantInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]): js.Promise[ParticipantInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]
    ): js.Promise[ParticipantInstance] = js.native
    def update(opts: ParticipantInstanceUpdateOptions): js.Promise[ParticipantInstance] = js.native
    def update(
      opts: ParticipantInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]
    ): js.Promise[ParticipantInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant", "ParticipantInstance")
  @js.native
  open class ParticipantInstance protected () extends SerializableClass {
    /**
      * Initialize the ParticipantContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param roomSid - The SID of the participant's room
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, payload: ParticipantPayload, roomSid: String, sid: String) = this()
    
    /* private */ var _proxy: ParticipantContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the anonymize
      */
    def anonymize(): AnonymizeListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var duration: Double = js.native
    
    var endTime: js.Date = js.native
    
    /**
      * fetch a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ParticipantInstance] = js.native
    
    var identity: String = js.native
    
    var links: String = js.native
    
    /**
      * Access the publishedTracks
      */
    def publishedTracks(): PublishedTrackListInstance = js.native
    
    var roomSid: String = js.native
    
    var sid: String = js.native
    
    var startTime: js.Date = js.native
    
    var status: ParticipantStatus = js.native
    
    /**
      * Access the subscribeRules
      */
    def subscribeRules(): SubscribeRulesListInstance = js.native
    
    /**
      * Access the subscribedTracks
      */
    def subscribedTracks(): SubscribedTrackListInstance = js.native
    
    /**
      * update a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ParticipantInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ParticipantInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ParticipantInstance] = js.native
    def update(opts: ParticipantInstanceUpdateOptions): js.Promise[ParticipantInstance] = js.native
    def update(
      opts: ParticipantInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ParticipantInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ParticipantList
    *
    * @param version - Version of the resource
    * @param roomSid - The SID of the participant's room
    */
  inline def ParticipantList(version: typings.twilio.videoV1Mod.^, roomSid: String): ParticipantListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ParticipantList")(version.asInstanceOf[js.Any], roomSid.asInstanceOf[js.Any])).asInstanceOf[ParticipantListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant", "ParticipantPage")
  @js.native
  open class ParticipantPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.videoV1Mod.^, 
          ParticipantPayload, 
          ParticipantResource, 
          ParticipantInstance
        ] {
    /**
      * Initialize the ParticipantPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
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
  
  /**
    * Options to pass to update
    *
    * @property status - The new status of the resource
    */
  trait ParticipantInstanceUpdateOptions extends StObject {
    
    var status: js.UndefOr[ParticipantStatus] = js.undefined
  }
  object ParticipantInstanceUpdateOptions {
    
    inline def apply(): ParticipantInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantInstanceUpdateOptions]
    }
    
    extension [Self <: ParticipantInstanceUpdateOptions](x: Self) {
      
      inline def setStatus(value: ParticipantStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
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
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): ParticipantContext = js.native
    
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
    * @property dateCreatedAfter - Read only Participants that started after this date in UTC ISO 8601 format
    * @property dateCreatedBefore - Read only Participants that started before this date in ISO 8601 format
    * @property done - Function to be called upon completion of streaming
    * @property identity - Read only the Participants with this user identity value
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
    * @property status - Read only the participants with this status
    */
  trait ParticipantListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[ParticipantStatus] = js.undefined
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
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: ParticipantStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property dateCreatedAfter - Read only Participants that started after this date in UTC ISO 8601 format
    * @property dateCreatedBefore - Read only Participants that started before this date in ISO 8601 format
    * @property identity - Read only the Participants with this user identity value
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
    * @property status - Read only the participants with this status
    */
  trait ParticipantListInstanceOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[ParticipantStatus] = js.undefined
  }
  object ParticipantListInstanceOptions {
    
    inline def apply(): ParticipantListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstanceOptions]
    }
    
    extension [Self <: ParticipantListInstanceOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: ParticipantStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dateCreatedAfter - Read only Participants that started after this date in UTC ISO 8601 format
    * @property dateCreatedBefore - Read only Participants that started before this date in ISO 8601 format
    * @property identity - Read only the Participants with this user identity value
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - Read only the participants with this status
    */
  trait ParticipantListInstancePageOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[ParticipantStatus] = js.undefined
  }
  object ParticipantListInstancePageOptions {
    
    inline def apply(): ParticipantListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstancePageOptions]
    }
    
    extension [Self <: ParticipantListInstancePageOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: ParticipantStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait ParticipantPayload
    extends StObject
       with ParticipantResource
       with TwilioResponsePayload
  object ParticipantPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      duration: Double,
      end_time: js.Date,
      first_page_uri: String,
      identity: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      room_sid: String,
      sid: String,
      start_time: js.Date,
      status: ParticipantStatus,
      uri: String,
      url: String
    ): ParticipantPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantPayload]
    }
  }
  
  trait ParticipantResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var duration: Double
    
    var end_time: js.Date
    
    var identity: String
    
    var links: String
    
    var room_sid: String
    
    var sid: String
    
    var start_time: js.Date
    
    var status: ParticipantStatus
    
    var url: String
  }
  object ParticipantResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      duration: Double,
      end_time: js.Date,
      identity: String,
      links: String,
      room_sid: String,
      sid: String,
      start_time: js.Date,
      status: ParticipantStatus,
      url: String
    ): ParticipantResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantResource]
    }
    
    extension [Self <: ParticipantResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRoom_sid(value: String): Self = StObject.set(x, "room_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: js.Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ParticipantStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
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
    - typings.twilio.twilioStrings.connected
    - typings.twilio.twilioStrings.disconnected
  */
  trait ParticipantStatus extends StObject
  object ParticipantStatus {
    
    inline def connected: typings.twilio.twilioStrings.connected = "connected".asInstanceOf[typings.twilio.twilioStrings.connected]
    
    inline def disconnected: typings.twilio.twilioStrings.disconnected = "disconnected".asInstanceOf[typings.twilio.twilioStrings.disconnected]
  }
}
