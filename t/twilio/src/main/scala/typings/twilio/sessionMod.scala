package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.sessionInteractionMod.InteractionContext
import typings.twilio.sessionInteractionMod.InteractionListInstance
import typings.twilio.sessionParticipantMod.ParticipantContext
import typings.twilio.sessionParticipantMod.ParticipantListInstance
import typings.twilio.twilioStrings.failed__
import typings.twilio.twilioStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session", "SessionContext")
  @js.native
  open class SessionContext protected () extends StObject {
    /**
      * Initialize the SessionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the resource from
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.proxyV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a SessionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SessionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionInstance, Any]): js.Promise[SessionInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def interactions(sid: String): InteractionContext = js.native
    @JSName("interactions")
    var interactions_Original: InteractionListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def participants(sid: String): ParticipantContext = js.native
    @JSName("participants")
    var participants_Original: ParticipantListInstance = js.native
    
    /**
      * remove a SessionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SessionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SessionInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionInstance, Any]): js.Promise[SessionInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionInstance, Any]): js.Promise[SessionInstance] = js.native
    def update(opts: SessionInstanceUpdateOptions): js.Promise[SessionInstance] = js.native
    def update(
      opts: SessionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionInstance, Any]
    ): js.Promise[SessionInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session", "SessionInstance")
  @js.native
  open class SessionInstance protected () extends SerializableClass {
    /**
      * Initialize the SessionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the resource's parent Service
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.proxyV1Mod.^, payload: SessionPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: SessionContext = js.native
    
    var accountSid: String = js.native
    
    var closedReason: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateEnded: js.Date = js.native
    
    var dateExpiry: js.Date = js.native
    
    var dateLastInteraction: js.Date = js.native
    
    var dateStarted: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SessionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SessionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SessionInstance] = js.native
    
    /**
      * Access the interactions
      */
    def interactions(): InteractionListInstance = js.native
    
    var links: String = js.native
    
    var mode: SessionMode = js.native
    
    /**
      * Access the participants
      */
    def participants(): ParticipantListInstance = js.native
    
    /**
      * remove a SessionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var status: SessionStatus = js.native
    
    var ttl: Double = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a SessionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SessionInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SessionInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SessionInstance] = js.native
    def update(opts: SessionInstanceUpdateOptions): js.Promise[SessionInstance] = js.native
    def update(
      opts: SessionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SessionInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SessionList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the resource's parent Service
    */
  inline def SessionList(version: typings.twilio.proxyV1Mod.^, serviceSid: String): SessionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SessionList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[SessionListInstance]
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session", "SessionPage")
  @js.native
  open class SessionPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.proxyV1Mod.^, SessionPayload, SessionResource, SessionInstance] {
    /**
      * Initialize the SessionPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.proxyV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SessionSolution
    ) = this()
    
    /**
      * Build an instance of SessionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SessionPayload): SessionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property dateExpiry - The ISO 8601 date when the Session should expire
    * @property failOnParticipantConflict - An experimental parameter to override the ProxyAllowParticipantConflict account flag on a per-request basis.
    * @property status - The new status of the resource
    * @property ttl - When the session will expire
    */
  trait SessionInstanceUpdateOptions extends StObject {
    
    var dateExpiry: js.UndefOr[js.Date] = js.undefined
    
    var failOnParticipantConflict: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[SessionStatus] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object SessionInstanceUpdateOptions {
    
    inline def apply(): SessionInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionInstanceUpdateOptions]
    }
    
    extension [Self <: SessionInstanceUpdateOptions](x: Self) {
      
      inline def setDateExpiry(value: js.Date): Self = StObject.set(x, "dateExpiry", value.asInstanceOf[js.Any])
      
      inline def setDateExpiryUndefined: Self = StObject.set(x, "dateExpiry", js.undefined)
      
      inline def setFailOnParticipantConflict(value: Boolean): Self = StObject.set(x, "failOnParticipantConflict", value.asInstanceOf[js.Any])
      
      inline def setFailOnParticipantConflictUndefined: Self = StObject.set(x, "failOnParticipantConflict", js.undefined)
      
      inline def setStatus(value: SessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait SessionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SessionContext = js.native
    
    /**
      * create a SessionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[SessionInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ SessionInstance, Any]): js.Promise[SessionInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ SessionInstance, Any]): js.Promise[SessionInstance] = js.native
    def create(opts: SessionListInstanceCreateOptions): js.Promise[SessionInstance] = js.native
    def create(
      opts: SessionListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SessionInstance, Any]
    ): js.Promise[SessionInstance] = js.native
    
    /**
      * Streams SessionInstance records from the API.
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
          /* item */ SessionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SessionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SessionListInstanceEachOptions): Unit = js.native
    def each(
      opts: SessionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SessionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a session
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): SessionContext = js.native
    
    /**
      * Retrieve a single target page of SessionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SessionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionPage, Any]): js.Promise[SessionPage] = js.native
    def getPage(targetUrl: String): js.Promise[SessionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionPage, Any]
    ): js.Promise[SessionPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionPage, Any]): js.Promise[SessionPage] = js.native
    
    /**
      * Lists SessionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SessionInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SessionInstance], Any]): js.Promise[js.Array[SessionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SessionInstance], Any]
    ): js.Promise[js.Array[SessionInstance]] = js.native
    def list(opts: SessionListInstanceOptions): js.Promise[js.Array[SessionInstance]] = js.native
    def list(
      opts: SessionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SessionInstance], Any]
    ): js.Promise[js.Array[SessionInstance]] = js.native
    
    /**
      * Retrieve a single page of SessionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SessionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionPage, Any]): js.Promise[SessionPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionPage, Any]): js.Promise[SessionPage] = js.native
    def page(opts: SessionListInstancePageOptions): js.Promise[SessionPage] = js.native
    def page(
      opts: SessionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SessionPage, Any]
    ): js.Promise[SessionPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property dateExpiry - The ISO 8601 date when the Session should expire
    * @property failOnParticipantConflict - An experimental parameter to override the ProxyAllowParticipantConflict account flag on a per-request basis.
    * @property mode - The Mode of the Session
    * @property participants - The Participant objects to include in the new session
    * @property status - Session status
    * @property ttl - When the session will expire
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait SessionListInstanceCreateOptions extends StObject {
    
    var dateExpiry: js.UndefOr[js.Date] = js.undefined
    
    var failOnParticipantConflict: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[SessionMode] = js.undefined
    
    var participants: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined
    
    var status: js.UndefOr[SessionStatus] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object SessionListInstanceCreateOptions {
    
    inline def apply(): SessionListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionListInstanceCreateOptions]
    }
    
    extension [Self <: SessionListInstanceCreateOptions](x: Self) {
      
      inline def setDateExpiry(value: js.Date): Self = StObject.set(x, "dateExpiry", value.asInstanceOf[js.Any])
      
      inline def setDateExpiryUndefined: Self = StObject.set(x, "dateExpiry", js.undefined)
      
      inline def setFailOnParticipantConflict(value: Boolean): Self = StObject.set(x, "failOnParticipantConflict", value.asInstanceOf[js.Any])
      
      inline def setFailOnParticipantConflictUndefined: Self = StObject.set(x, "failOnParticipantConflict", js.undefined)
      
      inline def setMode(value: SessionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setParticipants(value: js.Object | js.Array[js.Object]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
      
      inline def setParticipantsVarargs(value: js.Object*): Self = StObject.set(x, "participants", js.Array(value*))
      
      inline def setStatus(value: SessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
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
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait SessionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SessionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SessionListInstanceEachOptions {
    
    inline def apply(): SessionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionListInstanceEachOptions]
    }
    
    extension [Self <: SessionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SessionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait SessionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SessionListInstanceOptions {
    
    inline def apply(): SessionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionListInstanceOptions]
    }
    
    extension [Self <: SessionListInstanceOptions](x: Self) {
      
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
  trait SessionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SessionListInstancePageOptions {
    
    inline def apply(): SessionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionListInstancePageOptions]
    }
    
    extension [Self <: SessionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`message-only`
    - typings.twilio.twilioStrings.`voice-only`
    - typings.twilio.twilioStrings.`voice-and-message`
  */
  trait SessionMode extends StObject
  object SessionMode {
    
    inline def `message-only`: typings.twilio.twilioStrings.`message-only` = "message-only".asInstanceOf[typings.twilio.twilioStrings.`message-only`]
    
    inline def `voice-and-message`: typings.twilio.twilioStrings.`voice-and-message` = "voice-and-message".asInstanceOf[typings.twilio.twilioStrings.`voice-and-message`]
    
    inline def `voice-only`: typings.twilio.twilioStrings.`voice-only` = "voice-only".asInstanceOf[typings.twilio.twilioStrings.`voice-only`]
  }
  
  trait SessionPayload
    extends StObject
       with SessionResource
       with TwilioResponsePayload
  object SessionPayload {
    
    inline def apply(
      account_sid: String,
      closed_reason: String,
      date_created: js.Date,
      date_ended: js.Date,
      date_expiry: js.Date,
      date_last_interaction: js.Date,
      date_started: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      links: String,
      mode: SessionMode,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      status: SessionStatus,
      ttl: Double,
      unique_name: String,
      uri: String,
      url: String
    ): SessionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], closed_reason = closed_reason.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_ended = date_ended.asInstanceOf[js.Any], date_expiry = date_expiry.asInstanceOf[js.Any], date_last_interaction = date_last_interaction.asInstanceOf[js.Any], date_started = date_started.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionPayload]
    }
  }
  
  trait SessionResource extends StObject {
    
    var account_sid: String
    
    var closed_reason: String
    
    var date_created: js.Date
    
    var date_ended: js.Date
    
    var date_expiry: js.Date
    
    var date_last_interaction: js.Date
    
    var date_started: js.Date
    
    var date_updated: js.Date
    
    var links: String
    
    var mode: SessionMode
    
    var service_sid: String
    
    var sid: String
    
    var status: SessionStatus
    
    var ttl: Double
    
    var unique_name: String
    
    var url: String
  }
  object SessionResource {
    
    inline def apply(
      account_sid: String,
      closed_reason: String,
      date_created: js.Date,
      date_ended: js.Date,
      date_expiry: js.Date,
      date_last_interaction: js.Date,
      date_started: js.Date,
      date_updated: js.Date,
      links: String,
      mode: SessionMode,
      service_sid: String,
      sid: String,
      status: SessionStatus,
      ttl: Double,
      unique_name: String,
      url: String
    ): SessionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], closed_reason = closed_reason.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_ended = date_ended.asInstanceOf[js.Any], date_expiry = date_expiry.asInstanceOf[js.Any], date_last_interaction = date_last_interaction.asInstanceOf[js.Any], date_started = date_started.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionResource]
    }
    
    extension [Self <: SessionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setClosed_reason(value: String): Self = StObject.set(x, "closed_reason", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_ended(value: js.Date): Self = StObject.set(x, "date_ended", value.asInstanceOf[js.Any])
      
      inline def setDate_expiry(value: js.Date): Self = StObject.set(x, "date_expiry", value.asInstanceOf[js.Any])
      
      inline def setDate_last_interaction(value: js.Date): Self = StObject.set(x, "date_last_interaction", value.asInstanceOf[js.Any])
      
      inline def setDate_started(value: js.Date): Self = StObject.set(x, "date_started", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMode(value: SessionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SessionSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object SessionSolution {
    
    inline def apply(): SessionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionSolution]
    }
    
    extension [Self <: SessionSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.open
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.closed
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.unknown_
  */
  trait SessionStatus extends StObject
  object SessionStatus {
    
    inline def closed: typings.twilio.twilioStrings.closed = "closed".asInstanceOf[typings.twilio.twilioStrings.closed]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def `in-progress`: typings.twilio.twilioStrings.`in-progress` = "in-progress".asInstanceOf[typings.twilio.twilioStrings.`in-progress`]
    
    inline def open: typings.twilio.twilioStrings.open = "open".asInstanceOf[typings.twilio.twilioStrings.open]
    
    inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  }
}
