package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conferenceParticipantMod {
  
  @JSImport("twilio/lib/rest/insights/v1/conference/conferenceParticipant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/conference/conferenceParticipant", "ConferenceParticipantContext")
  @js.native
  open class ConferenceParticipantContext protected () extends StObject {
    /**
      * Initialize the ConferenceParticipantContext
      *
      * @param version - Version of the resource
      * @param conferenceSid - Conference SID.
      * @param participantSid - Participant SID.
      */
    def this(version: typings.twilio.insightsV1Mod.^, conferenceSid: String, participantSid: String) = this()
    
    /**
      * fetch a ConferenceParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConferenceParticipantInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceParticipantInstance, Any]
    ): js.Promise[ConferenceParticipantInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceParticipantInstance, Any]
    ): js.Promise[ConferenceParticipantInstance] = js.native
    def fetch(opts: ConferenceParticipantInstanceFetchOptions): js.Promise[ConferenceParticipantInstance] = js.native
    def fetch(
      opts: ConferenceParticipantInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceParticipantInstance, Any]
    ): js.Promise[ConferenceParticipantInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/insights/v1/conference/conferenceParticipant", "ConferenceParticipantInstance")
  @js.native
  open class ConferenceParticipantInstance protected () extends SerializableClass {
    /**
      * Initialize the ConferenceParticipantContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param conferenceSid - Conference SID.
      * @param participantSid - Participant SID.
      */
    def this(
      version: typings.twilio.insightsV1Mod.^,
      payload: ConferenceParticipantPayload,
      conferenceSid: String,
      participantSid: String
    ) = this()
    
    /* private */ var _proxy: ConferenceParticipantContext = js.native
    
    var accountSid: String = js.native
    
    var callDirection: ConferenceParticipantCallDirection = js.native
    
    var callSid: String = js.native
    
    var callStatus: ConferenceParticipantCallStatus = js.native
    
    var callType: ConferenceParticipantCallType = js.native
    
    var coachedParticipants: js.Array[String] = js.native
    
    var conferenceRegion: ConferenceParticipantRegion = js.native
    
    var conferenceSid: String = js.native
    
    var countryCode: String = js.native
    
    var durationSeconds: Double = js.native
    
    var events: Any = js.native
    
    /**
      * fetch a ConferenceParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConferenceParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConferenceParticipantInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConferenceParticipantInstance] = js.native
    def fetch(opts: ConferenceParticipantInstanceFetchOptions): js.Promise[ConferenceParticipantInstance] = js.native
    def fetch(
      opts: ConferenceParticipantInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ConferenceParticipantInstance] = js.native
    
    var from: String = js.native
    
    var isCoach: Boolean = js.native
    
    var isModerator: Boolean = js.native
    
    var jitterBufferSize: ConferenceParticipantJitterBufferSize = js.native
    
    var joinTime: js.Date = js.native
    
    var label: String = js.native
    
    var leaveTime: js.Date = js.native
    
    var metrics: Any = js.native
    
    var outboundQueueLength: Double = js.native
    
    var outboundTimeInQueue: Double = js.native
    
    var participantRegion: ConferenceParticipantRegion = js.native
    
    var participantSid: String = js.native
    
    var processingState: ConferenceParticipantProcessingState = js.native
    
    var properties: Any = js.native
    
    var to: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ConferenceParticipantList
    *
    * @param version - Version of the resource
    * @param conferenceSid - Conference SID.
    */
  inline def ConferenceParticipantList(version: typings.twilio.insightsV1Mod.^, conferenceSid: String): ConferenceParticipantListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ConferenceParticipantList")(version.asInstanceOf[js.Any], conferenceSid.asInstanceOf[js.Any])).asInstanceOf[ConferenceParticipantListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/conference/conferenceParticipant", "ConferenceParticipantPage")
  @js.native
  open class ConferenceParticipantPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.insightsV1Mod.^, 
          ConferenceParticipantPayload, 
          ConferenceParticipantResource, 
          ConferenceParticipantInstance
        ] {
    /**
      * Initialize the ConferenceParticipantPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.insightsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ConferenceParticipantSolution
    ) = this()
    
    /**
      * Build an instance of ConferenceParticipantInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ConferenceParticipantPayload): ConferenceParticipantInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.inbound
    - typings.twilio.twilioStrings.outbound
  */
  trait ConferenceParticipantCallDirection extends StObject
  object ConferenceParticipantCallDirection {
    
    inline def inbound: typings.twilio.twilioStrings.inbound = "inbound".asInstanceOf[typings.twilio.twilioStrings.inbound]
    
    inline def outbound: typings.twilio.twilioStrings.outbound = "outbound".asInstanceOf[typings.twilio.twilioStrings.outbound]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.answered
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.busy
    - typings.twilio.twilioStrings.fail
    - typings.twilio.twilioStrings.noanswer
    - typings.twilio.twilioStrings.ringing
    - typings.twilio.twilioStrings.canceled
  */
  trait ConferenceParticipantCallStatus extends StObject
  object ConferenceParticipantCallStatus {
    
    inline def answered: typings.twilio.twilioStrings.answered = "answered".asInstanceOf[typings.twilio.twilioStrings.answered]
    
    inline def busy: typings.twilio.twilioStrings.busy = "busy".asInstanceOf[typings.twilio.twilioStrings.busy]
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def fail: typings.twilio.twilioStrings.fail = "fail".asInstanceOf[typings.twilio.twilioStrings.fail]
    
    inline def noanswer: typings.twilio.twilioStrings.noanswer = "noanswer".asInstanceOf[typings.twilio.twilioStrings.noanswer]
    
    inline def ringing: typings.twilio.twilioStrings.ringing = "ringing".asInstanceOf[typings.twilio.twilioStrings.ringing]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.carrier
    - typings.twilio.twilioStrings.client
    - typings.twilio.twilioStrings.sip
  */
  trait ConferenceParticipantCallType extends StObject
  object ConferenceParticipantCallType {
    
    inline def carrier: typings.twilio.twilioStrings.carrier = "carrier".asInstanceOf[typings.twilio.twilioStrings.carrier]
    
    inline def client: typings.twilio.twilioStrings.client = "client".asInstanceOf[typings.twilio.twilioStrings.client]
    
    inline def sip: typings.twilio.twilioStrings.sip = "sip".asInstanceOf[typings.twilio.twilioStrings.sip]
  }
  
  /**
    * Options to pass to fetch
    *
    * @property events - Conference events generated by application or participant activity.
    * @property metrics - Object. Contains call quality metrics.
    */
  trait ConferenceParticipantInstanceFetchOptions extends StObject {
    
    var events: js.UndefOr[String] = js.undefined
    
    var metrics: js.UndefOr[String] = js.undefined
  }
  object ConferenceParticipantInstanceFetchOptions {
    
    inline def apply(): ConferenceParticipantInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceParticipantInstanceFetchOptions]
    }
    
    extension [Self <: ConferenceParticipantInstanceFetchOptions](x: Self) {
      
      inline def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setMetrics(value: String): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.large
    - typings.twilio.twilioStrings.small
    - typings.twilio.twilioStrings.medium
    - typings.twilio.twilioStrings.off
  */
  trait ConferenceParticipantJitterBufferSize extends StObject
  object ConferenceParticipantJitterBufferSize {
    
    inline def large: typings.twilio.twilioStrings.large = "large".asInstanceOf[typings.twilio.twilioStrings.large]
    
    inline def medium: typings.twilio.twilioStrings.medium = "medium".asInstanceOf[typings.twilio.twilioStrings.medium]
    
    inline def off: typings.twilio.twilioStrings.off = "off".asInstanceOf[typings.twilio.twilioStrings.off]
    
    inline def small: typings.twilio.twilioStrings.small = "small".asInstanceOf[typings.twilio.twilioStrings.small]
  }
  
  @js.native
  trait ConferenceParticipantListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ConferenceParticipantContext = js.native
    
    /**
      * Streams ConferenceParticipantInstance records from the API.
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
          /* item */ ConferenceParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ConferenceParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ConferenceParticipantListInstanceEachOptions): Unit = js.native
    def each(
      opts: ConferenceParticipantListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ConferenceParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a conference_participant
      *
      * @param participantSid - Participant SID.
      */
    def get(participantSid: String): ConferenceParticipantContext = js.native
    
    /**
      * Retrieve a single target page of ConferenceParticipantInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ConferenceParticipantPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceParticipantPage, Any]): js.Promise[ConferenceParticipantPage] = js.native
    def getPage(targetUrl: String): js.Promise[ConferenceParticipantPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceParticipantPage, Any]
    ): js.Promise[ConferenceParticipantPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceParticipantPage, Any]
    ): js.Promise[ConferenceParticipantPage] = js.native
    
    /**
      * Lists ConferenceParticipantInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ConferenceParticipantInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[ConferenceParticipantInstance], 
          Any
        ]
    ): js.Promise[js.Array[ConferenceParticipantInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[ConferenceParticipantInstance], 
          Any
        ]
    ): js.Promise[js.Array[ConferenceParticipantInstance]] = js.native
    def list(opts: ConferenceParticipantListInstanceOptions): js.Promise[js.Array[ConferenceParticipantInstance]] = js.native
    def list(
      opts: ConferenceParticipantListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[ConferenceParticipantInstance], 
          Any
        ]
    ): js.Promise[js.Array[ConferenceParticipantInstance]] = js.native
    
    /**
      * Retrieve a single page of ConferenceParticipantInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ConferenceParticipantPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceParticipantPage, Any]): js.Promise[ConferenceParticipantPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceParticipantPage, Any]
    ): js.Promise[ConferenceParticipantPage] = js.native
    def page(opts: ConferenceParticipantListInstancePageOptions): js.Promise[ConferenceParticipantPage] = js.native
    def page(
      opts: ConferenceParticipantListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceParticipantPage, Any]
    ): js.Promise[ConferenceParticipantPage] = js.native
    
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
    * @property events - Conference events generated by application or participant activity.
    * @property label - User-specified label for a participant.
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
    * @property participantSid - Participant SID.
    */
  trait ConferenceParticipantListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ConferenceParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var events: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var participantSid: js.UndefOr[String] = js.undefined
  }
  object ConferenceParticipantListInstanceEachOptions {
    
    inline def apply(): ConferenceParticipantListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceParticipantListInstanceEachOptions]
    }
    
    extension [Self <: ConferenceParticipantListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ConferenceParticipantInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setParticipantSid(value: String): Self = StObject.set(x, "participantSid", value.asInstanceOf[js.Any])
      
      inline def setParticipantSidUndefined: Self = StObject.set(x, "participantSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property events - Conference events generated by application or participant activity.
    * @property label - User-specified label for a participant.
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
    * @property participantSid - Participant SID.
    */
  trait ConferenceParticipantListInstanceOptions extends StObject {
    
    var events: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var participantSid: js.UndefOr[String] = js.undefined
  }
  object ConferenceParticipantListInstanceOptions {
    
    inline def apply(): ConferenceParticipantListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceParticipantListInstanceOptions]
    }
    
    extension [Self <: ConferenceParticipantListInstanceOptions](x: Self) {
      
      inline def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setParticipantSid(value: String): Self = StObject.set(x, "participantSid", value.asInstanceOf[js.Any])
      
      inline def setParticipantSidUndefined: Self = StObject.set(x, "participantSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property events - Conference events generated by application or participant activity.
    * @property label - User-specified label for a participant.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property participantSid - Participant SID.
    */
  trait ConferenceParticipantListInstancePageOptions extends StObject {
    
    var events: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var participantSid: js.UndefOr[String] = js.undefined
  }
  object ConferenceParticipantListInstancePageOptions {
    
    inline def apply(): ConferenceParticipantListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceParticipantListInstancePageOptions]
    }
    
    extension [Self <: ConferenceParticipantListInstancePageOptions](x: Self) {
      
      inline def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setParticipantSid(value: String): Self = StObject.set(x, "participantSid", value.asInstanceOf[js.Any])
      
      inline def setParticipantSidUndefined: Self = StObject.set(x, "participantSid", js.undefined)
    }
  }
  
  trait ConferenceParticipantPayload
    extends StObject
       with ConferenceParticipantResource
       with TwilioResponsePayload
  object ConferenceParticipantPayload {
    
    inline def apply(
      account_sid: String,
      call_direction: ConferenceParticipantCallDirection,
      call_sid: String,
      call_status: ConferenceParticipantCallStatus,
      call_type: ConferenceParticipantCallType,
      coached_participants: js.Array[String],
      conference_region: ConferenceParticipantRegion,
      conference_sid: String,
      country_code: String,
      duration_seconds: Double,
      events: js.Object,
      first_page_uri: String,
      from: String,
      is_coach: Boolean,
      is_moderator: Boolean,
      jitter_buffer_size: ConferenceParticipantJitterBufferSize,
      join_time: js.Date,
      label: String,
      leave_time: js.Date,
      metrics: js.Object,
      next_page_uri: String,
      outbound_queue_length: Double,
      outbound_time_in_queue: Double,
      page: Double,
      page_size: Double,
      participant_region: ConferenceParticipantRegion,
      participant_sid: String,
      previous_page_uri: String,
      processing_state: ConferenceParticipantProcessingState,
      properties: js.Object,
      to: String,
      uri: String,
      url: String
    ): ConferenceParticipantPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_direction = call_direction.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], call_status = call_status.asInstanceOf[js.Any], call_type = call_type.asInstanceOf[js.Any], coached_participants = coached_participants.asInstanceOf[js.Any], conference_region = conference_region.asInstanceOf[js.Any], conference_sid = conference_sid.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], duration_seconds = duration_seconds.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], is_coach = is_coach.asInstanceOf[js.Any], is_moderator = is_moderator.asInstanceOf[js.Any], jitter_buffer_size = jitter_buffer_size.asInstanceOf[js.Any], join_time = join_time.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], leave_time = leave_time.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], outbound_queue_length = outbound_queue_length.asInstanceOf[js.Any], outbound_time_in_queue = outbound_time_in_queue.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], participant_region = participant_region.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], processing_state = processing_state.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConferenceParticipantPayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.complete
    - typings.twilio.twilioStrings.in_progress
    - typings.twilio.twilioStrings.timeout
  */
  trait ConferenceParticipantProcessingState extends StObject
  object ConferenceParticipantProcessingState {
    
    inline def complete: typings.twilio.twilioStrings.complete = "complete".asInstanceOf[typings.twilio.twilioStrings.complete]
    
    inline def in_progress: typings.twilio.twilioStrings.in_progress = "in_progress".asInstanceOf[typings.twilio.twilioStrings.in_progress]
    
    inline def timeout: typings.twilio.twilioStrings.timeout = "timeout".asInstanceOf[typings.twilio.twilioStrings.timeout]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.us1
    - typings.twilio.twilioStrings.us2
    - typings.twilio.twilioStrings.au1
    - typings.twilio.twilioStrings.br1
    - typings.twilio.twilioStrings.ie1
    - typings.twilio.twilioStrings.jp1
    - typings.twilio.twilioStrings.sg1
    - typings.twilio.twilioStrings.de1
  */
  trait ConferenceParticipantRegion extends StObject
  object ConferenceParticipantRegion {
    
    inline def au1: typings.twilio.twilioStrings.au1 = "au1".asInstanceOf[typings.twilio.twilioStrings.au1]
    
    inline def br1: typings.twilio.twilioStrings.br1 = "br1".asInstanceOf[typings.twilio.twilioStrings.br1]
    
    inline def de1: typings.twilio.twilioStrings.de1 = "de1".asInstanceOf[typings.twilio.twilioStrings.de1]
    
    inline def ie1: typings.twilio.twilioStrings.ie1 = "ie1".asInstanceOf[typings.twilio.twilioStrings.ie1]
    
    inline def jp1: typings.twilio.twilioStrings.jp1 = "jp1".asInstanceOf[typings.twilio.twilioStrings.jp1]
    
    inline def sg1: typings.twilio.twilioStrings.sg1 = "sg1".asInstanceOf[typings.twilio.twilioStrings.sg1]
    
    inline def us1: typings.twilio.twilioStrings.us1 = "us1".asInstanceOf[typings.twilio.twilioStrings.us1]
    
    inline def us2: typings.twilio.twilioStrings.us2 = "us2".asInstanceOf[typings.twilio.twilioStrings.us2]
  }
  
  trait ConferenceParticipantResource extends StObject {
    
    var account_sid: String
    
    var call_direction: ConferenceParticipantCallDirection
    
    var call_sid: String
    
    var call_status: ConferenceParticipantCallStatus
    
    var call_type: ConferenceParticipantCallType
    
    var coached_participants: js.Array[String]
    
    var conference_region: ConferenceParticipantRegion
    
    var conference_sid: String
    
    var country_code: String
    
    var duration_seconds: Double
    
    var events: js.Object
    
    var from: String
    
    var is_coach: Boolean
    
    var is_moderator: Boolean
    
    var jitter_buffer_size: ConferenceParticipantJitterBufferSize
    
    var join_time: js.Date
    
    var label: String
    
    var leave_time: js.Date
    
    var metrics: js.Object
    
    var outbound_queue_length: Double
    
    var outbound_time_in_queue: Double
    
    var participant_region: ConferenceParticipantRegion
    
    var participant_sid: String
    
    var processing_state: ConferenceParticipantProcessingState
    
    var properties: js.Object
    
    var to: String
    
    var url: String
  }
  object ConferenceParticipantResource {
    
    inline def apply(
      account_sid: String,
      call_direction: ConferenceParticipantCallDirection,
      call_sid: String,
      call_status: ConferenceParticipantCallStatus,
      call_type: ConferenceParticipantCallType,
      coached_participants: js.Array[String],
      conference_region: ConferenceParticipantRegion,
      conference_sid: String,
      country_code: String,
      duration_seconds: Double,
      events: js.Object,
      from: String,
      is_coach: Boolean,
      is_moderator: Boolean,
      jitter_buffer_size: ConferenceParticipantJitterBufferSize,
      join_time: js.Date,
      label: String,
      leave_time: js.Date,
      metrics: js.Object,
      outbound_queue_length: Double,
      outbound_time_in_queue: Double,
      participant_region: ConferenceParticipantRegion,
      participant_sid: String,
      processing_state: ConferenceParticipantProcessingState,
      properties: js.Object,
      to: String,
      url: String
    ): ConferenceParticipantResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_direction = call_direction.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], call_status = call_status.asInstanceOf[js.Any], call_type = call_type.asInstanceOf[js.Any], coached_participants = coached_participants.asInstanceOf[js.Any], conference_region = conference_region.asInstanceOf[js.Any], conference_sid = conference_sid.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], duration_seconds = duration_seconds.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], is_coach = is_coach.asInstanceOf[js.Any], is_moderator = is_moderator.asInstanceOf[js.Any], jitter_buffer_size = jitter_buffer_size.asInstanceOf[js.Any], join_time = join_time.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], leave_time = leave_time.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], outbound_queue_length = outbound_queue_length.asInstanceOf[js.Any], outbound_time_in_queue = outbound_time_in_queue.asInstanceOf[js.Any], participant_region = participant_region.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], processing_state = processing_state.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConferenceParticipantResource]
    }
    
    extension [Self <: ConferenceParticipantResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_direction(value: ConferenceParticipantCallDirection): Self = StObject.set(x, "call_direction", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_status(value: ConferenceParticipantCallStatus): Self = StObject.set(x, "call_status", value.asInstanceOf[js.Any])
      
      inline def setCall_type(value: ConferenceParticipantCallType): Self = StObject.set(x, "call_type", value.asInstanceOf[js.Any])
      
      inline def setCoached_participants(value: js.Array[String]): Self = StObject.set(x, "coached_participants", value.asInstanceOf[js.Any])
      
      inline def setCoached_participantsVarargs(value: String*): Self = StObject.set(x, "coached_participants", js.Array(value*))
      
      inline def setConference_region(value: ConferenceParticipantRegion): Self = StObject.set(x, "conference_region", value.asInstanceOf[js.Any])
      
      inline def setConference_sid(value: String): Self = StObject.set(x, "conference_sid", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setDuration_seconds(value: Double): Self = StObject.set(x, "duration_seconds", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setIs_coach(value: Boolean): Self = StObject.set(x, "is_coach", value.asInstanceOf[js.Any])
      
      inline def setIs_moderator(value: Boolean): Self = StObject.set(x, "is_moderator", value.asInstanceOf[js.Any])
      
      inline def setJitter_buffer_size(value: ConferenceParticipantJitterBufferSize): Self = StObject.set(x, "jitter_buffer_size", value.asInstanceOf[js.Any])
      
      inline def setJoin_time(value: js.Date): Self = StObject.set(x, "join_time", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLeave_time(value: js.Date): Self = StObject.set(x, "leave_time", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: js.Object): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setOutbound_queue_length(value: Double): Self = StObject.set(x, "outbound_queue_length", value.asInstanceOf[js.Any])
      
      inline def setOutbound_time_in_queue(value: Double): Self = StObject.set(x, "outbound_time_in_queue", value.asInstanceOf[js.Any])
      
      inline def setParticipant_region(value: ConferenceParticipantRegion): Self = StObject.set(x, "participant_region", value.asInstanceOf[js.Any])
      
      inline def setParticipant_sid(value: String): Self = StObject.set(x, "participant_sid", value.asInstanceOf[js.Any])
      
      inline def setProcessing_state(value: ConferenceParticipantProcessingState): Self = StObject.set(x, "processing_state", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConferenceParticipantSolution extends StObject {
    
    var conferenceSid: js.UndefOr[String] = js.undefined
  }
  object ConferenceParticipantSolution {
    
    inline def apply(): ConferenceParticipantSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceParticipantSolution]
    }
    
    extension [Self <: ConferenceParticipantSolution](x: Self) {
      
      inline def setConferenceSid(value: String): Self = StObject.set(x, "conferenceSid", value.asInstanceOf[js.Any])
      
      inline def setConferenceSidUndefined: Self = StObject.set(x, "conferenceSid", js.undefined)
    }
  }
}
