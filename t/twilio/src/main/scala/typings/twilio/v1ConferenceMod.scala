package typings.twilio

import typings.twilio.conferenceParticipantMod.ConferenceParticipantContext
import typings.twilio.conferenceParticipantMod.ConferenceParticipantListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ConferenceMod {
  
  @JSImport("twilio/lib/rest/insights/v1/conference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/conference", "ConferenceContext")
  @js.native
  open class ConferenceContext protected () extends StObject {
    /**
      * Initialize the ConferenceContext
      *
      * @param version - Version of the resource
      * @param conferenceSid - Conference SID.
      */
    def this(version: typings.twilio.insightsV1Mod.^, conferenceSid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def conferenceParticipants(sid: String): ConferenceParticipantContext = js.native
    @JSName("conferenceParticipants")
    var conferenceParticipants_Original: ConferenceParticipantListInstance = js.native
    
    /**
      * fetch a ConferenceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConferenceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceInstance, Any]): js.Promise[ConferenceInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/insights/v1/conference", "ConferenceInstance")
  @js.native
  open class ConferenceInstance protected () extends SerializableClass {
    /**
      * Initialize the ConferenceContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param conferenceSid - Conference SID.
      */
    def this(version: typings.twilio.insightsV1Mod.^, payload: ConferencePayload, conferenceSid: String) = this()
    
    /* private */ var _proxy: ConferenceContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the conferenceParticipants
      */
    def conferenceParticipants(): ConferenceParticipantListInstance = js.native
    
    var conferenceSid: String = js.native
    
    var connectDurationSeconds: Double = js.native
    
    var createTime: js.Date = js.native
    
    var detectedIssues: Any = js.native
    
    var durationSeconds: Double = js.native
    
    var endReason: ConferenceConferenceEndReason = js.native
    
    var endTime: js.Date = js.native
    
    var endedBy: String = js.native
    
    /**
      * fetch a ConferenceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConferenceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConferenceInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    var maxConcurrentParticipants: Double = js.native
    
    var maxParticipants: Double = js.native
    
    var mixerRegion: ConferenceRegion = js.native
    
    var mixerRegionRequested: ConferenceRegion = js.native
    
    var processingState: ConferenceProcessingState = js.native
    
    var recordingEnabled: Boolean = js.native
    
    var startTime: js.Date = js.native
    
    var status: ConferenceConferenceStatus = js.native
    
    var tagInfo: Any = js.native
    
    var tags: js.Array[ConferenceTag] = js.native
    
    var uniqueParticipants: Double = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ConferenceList
    *
    * @param version - Version of the resource
    */
  inline def ConferenceList(version: typings.twilio.insightsV1Mod.^): ConferenceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ConferenceList")(version.asInstanceOf[js.Any]).asInstanceOf[ConferenceListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/conference", "ConferencePage")
  @js.native
  open class ConferencePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.insightsV1Mod.^, 
          ConferencePayload, 
          ConferenceResource, 
          ConferenceInstance
        ] {
    /**
      * Initialize the ConferencePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.insightsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ConferenceSolution
    ) = this()
    
    /**
      * Build an instance of ConferenceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ConferencePayload): ConferenceInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.last_participant_left
    - typings.twilio.twilioStrings.conference_ended_via_api
    - typings.twilio.twilioStrings.participant_with_end_conference_on_exit_left
    - typings.twilio.twilioStrings.last_participant_kicked
    - typings.twilio.twilioStrings.participant_with_end_conference_on_exit_kicked
  */
  trait ConferenceConferenceEndReason extends StObject
  object ConferenceConferenceEndReason {
    
    inline def conference_ended_via_api: typings.twilio.twilioStrings.conference_ended_via_api = "conference_ended_via_api".asInstanceOf[typings.twilio.twilioStrings.conference_ended_via_api]
    
    inline def last_participant_kicked: typings.twilio.twilioStrings.last_participant_kicked = "last_participant_kicked".asInstanceOf[typings.twilio.twilioStrings.last_participant_kicked]
    
    inline def last_participant_left: typings.twilio.twilioStrings.last_participant_left = "last_participant_left".asInstanceOf[typings.twilio.twilioStrings.last_participant_left]
    
    inline def participant_with_end_conference_on_exit_kicked: typings.twilio.twilioStrings.participant_with_end_conference_on_exit_kicked = "participant_with_end_conference_on_exit_kicked".asInstanceOf[typings.twilio.twilioStrings.participant_with_end_conference_on_exit_kicked]
    
    inline def participant_with_end_conference_on_exit_left: typings.twilio.twilioStrings.participant_with_end_conference_on_exit_left = "participant_with_end_conference_on_exit_left".asInstanceOf[typings.twilio.twilioStrings.participant_with_end_conference_on_exit_left]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.in_progress
    - typings.twilio.twilioStrings.not_started
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.summary_timeout
  */
  trait ConferenceConferenceStatus extends StObject
  object ConferenceConferenceStatus {
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def in_progress: typings.twilio.twilioStrings.in_progress = "in_progress".asInstanceOf[typings.twilio.twilioStrings.in_progress]
    
    inline def not_started: typings.twilio.twilioStrings.not_started = "not_started".asInstanceOf[typings.twilio.twilioStrings.not_started]
    
    inline def summary_timeout: typings.twilio.twilioStrings.summary_timeout = "summary_timeout".asInstanceOf[typings.twilio.twilioStrings.summary_timeout]
  }
  
  @js.native
  trait ConferenceListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ConferenceContext = js.native
    
    /**
      * Streams ConferenceInstance records from the API.
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
          /* item */ ConferenceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ConferenceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ConferenceListInstanceEachOptions): Unit = js.native
    def each(
      opts: ConferenceListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ConferenceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a conference
      *
      * @param conferenceSid - Conference SID.
      */
    def get(conferenceSid: String): ConferenceContext = js.native
    
    /**
      * Retrieve a single target page of ConferenceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ConferencePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]): js.Promise[ConferencePage] = js.native
    def getPage(targetUrl: String): js.Promise[ConferencePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]
    ): js.Promise[ConferencePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]
    ): js.Promise[ConferencePage] = js.native
    
    /**
      * Lists ConferenceInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ConferenceInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConferenceInstance], Any]): js.Promise[js.Array[ConferenceInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConferenceInstance], Any]
    ): js.Promise[js.Array[ConferenceInstance]] = js.native
    def list(opts: ConferenceListInstanceOptions): js.Promise[js.Array[ConferenceInstance]] = js.native
    def list(
      opts: ConferenceListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConferenceInstance], Any]
    ): js.Promise[js.Array[ConferenceInstance]] = js.native
    
    /**
      * Retrieve a single page of ConferenceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ConferencePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]): js.Promise[ConferencePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]): js.Promise[ConferencePage] = js.native
    def page(opts: ConferenceListInstancePageOptions): js.Promise[ConferencePage] = js.native
    def page(
      opts: ConferenceListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]
    ): js.Promise[ConferencePage] = js.native
    
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
    * @property conferenceSid - The SID of the conference.
    * @property createdAfter - Conferences created after timestamp.
    * @property createdBefore - Conferences created before timestamp.
    * @property detectedIssues - Potential issues detected during the conference.
    * @property done - Function to be called upon completion of streaming
    * @property endReason - Conference end reason.
    * @property friendlyName - Custom label for the conference.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property mixerRegion - Region where the conference was mixed.
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property status - Conference status.
    * @property subaccount - Account SID for the subaccount.
    * @property tags - Tags applied by Twilio for common issues.
    */
  trait ConferenceListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ConferenceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var conferenceSid: js.UndefOr[String] = js.undefined
    
    var createdAfter: js.UndefOr[String] = js.undefined
    
    var createdBefore: js.UndefOr[String] = js.undefined
    
    var detectedIssues: js.UndefOr[String] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var endReason: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mixerRegion: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var subaccount: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[String] = js.undefined
  }
  object ConferenceListInstanceEachOptions {
    
    inline def apply(): ConferenceListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceListInstanceEachOptions]
    }
    
    extension [Self <: ConferenceListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ConferenceInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setConferenceSid(value: String): Self = StObject.set(x, "conferenceSid", value.asInstanceOf[js.Any])
      
      inline def setConferenceSidUndefined: Self = StObject.set(x, "conferenceSid", js.undefined)
      
      inline def setCreatedAfter(value: String): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
      
      inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
      
      inline def setCreatedBefore(value: String): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
      
      inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
      
      inline def setDetectedIssues(value: String): Self = StObject.set(x, "detectedIssues", value.asInstanceOf[js.Any])
      
      inline def setDetectedIssuesUndefined: Self = StObject.set(x, "detectedIssues", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEndReason(value: String): Self = StObject.set(x, "endReason", value.asInstanceOf[js.Any])
      
      inline def setEndReasonUndefined: Self = StObject.set(x, "endReason", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMixerRegion(value: String): Self = StObject.set(x, "mixerRegion", value.asInstanceOf[js.Any])
      
      inline def setMixerRegionUndefined: Self = StObject.set(x, "mixerRegion", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
      
      inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property conferenceSid - The SID of the conference.
    * @property createdAfter - Conferences created after timestamp.
    * @property createdBefore - Conferences created before timestamp.
    * @property detectedIssues - Potential issues detected during the conference.
    * @property endReason - Conference end reason.
    * @property friendlyName - Custom label for the conference.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property mixerRegion - Region where the conference was mixed.
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property status - Conference status.
    * @property subaccount - Account SID for the subaccount.
    * @property tags - Tags applied by Twilio for common issues.
    */
  trait ConferenceListInstanceOptions extends StObject {
    
    var conferenceSid: js.UndefOr[String] = js.undefined
    
    var createdAfter: js.UndefOr[String] = js.undefined
    
    var createdBefore: js.UndefOr[String] = js.undefined
    
    var detectedIssues: js.UndefOr[String] = js.undefined
    
    var endReason: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mixerRegion: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var subaccount: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[String] = js.undefined
  }
  object ConferenceListInstanceOptions {
    
    inline def apply(): ConferenceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceListInstanceOptions]
    }
    
    extension [Self <: ConferenceListInstanceOptions](x: Self) {
      
      inline def setConferenceSid(value: String): Self = StObject.set(x, "conferenceSid", value.asInstanceOf[js.Any])
      
      inline def setConferenceSidUndefined: Self = StObject.set(x, "conferenceSid", js.undefined)
      
      inline def setCreatedAfter(value: String): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
      
      inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
      
      inline def setCreatedBefore(value: String): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
      
      inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
      
      inline def setDetectedIssues(value: String): Self = StObject.set(x, "detectedIssues", value.asInstanceOf[js.Any])
      
      inline def setDetectedIssuesUndefined: Self = StObject.set(x, "detectedIssues", js.undefined)
      
      inline def setEndReason(value: String): Self = StObject.set(x, "endReason", value.asInstanceOf[js.Any])
      
      inline def setEndReasonUndefined: Self = StObject.set(x, "endReason", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMixerRegion(value: String): Self = StObject.set(x, "mixerRegion", value.asInstanceOf[js.Any])
      
      inline def setMixerRegionUndefined: Self = StObject.set(x, "mixerRegion", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
      
      inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property conferenceSid - The SID of the conference.
    * @property createdAfter - Conferences created after timestamp.
    * @property createdBefore - Conferences created before timestamp.
    * @property detectedIssues - Potential issues detected during the conference.
    * @property endReason - Conference end reason.
    * @property friendlyName - Custom label for the conference.
    * @property mixerRegion - Region where the conference was mixed.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - Conference status.
    * @property subaccount - Account SID for the subaccount.
    * @property tags - Tags applied by Twilio for common issues.
    */
  trait ConferenceListInstancePageOptions extends StObject {
    
    var conferenceSid: js.UndefOr[String] = js.undefined
    
    var createdAfter: js.UndefOr[String] = js.undefined
    
    var createdBefore: js.UndefOr[String] = js.undefined
    
    var detectedIssues: js.UndefOr[String] = js.undefined
    
    var endReason: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var mixerRegion: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var subaccount: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[String] = js.undefined
  }
  object ConferenceListInstancePageOptions {
    
    inline def apply(): ConferenceListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceListInstancePageOptions]
    }
    
    extension [Self <: ConferenceListInstancePageOptions](x: Self) {
      
      inline def setConferenceSid(value: String): Self = StObject.set(x, "conferenceSid", value.asInstanceOf[js.Any])
      
      inline def setConferenceSidUndefined: Self = StObject.set(x, "conferenceSid", js.undefined)
      
      inline def setCreatedAfter(value: String): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
      
      inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
      
      inline def setCreatedBefore(value: String): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
      
      inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
      
      inline def setDetectedIssues(value: String): Self = StObject.set(x, "detectedIssues", value.asInstanceOf[js.Any])
      
      inline def setDetectedIssuesUndefined: Self = StObject.set(x, "detectedIssues", js.undefined)
      
      inline def setEndReason(value: String): Self = StObject.set(x, "endReason", value.asInstanceOf[js.Any])
      
      inline def setEndReasonUndefined: Self = StObject.set(x, "endReason", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setMixerRegion(value: String): Self = StObject.set(x, "mixerRegion", value.asInstanceOf[js.Any])
      
      inline def setMixerRegionUndefined: Self = StObject.set(x, "mixerRegion", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
      
      inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ConferencePayload
    extends StObject
       with ConferenceResource
       with TwilioResponsePayload
  object ConferencePayload {
    
    inline def apply(
      account_sid: String,
      conference_sid: String,
      connect_duration_seconds: Double,
      create_time: js.Date,
      detected_issues: js.Object,
      duration_seconds: Double,
      end_reason: ConferenceConferenceEndReason,
      end_time: js.Date,
      ended_by: String,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      max_concurrent_participants: Double,
      max_participants: Double,
      mixer_region: ConferenceRegion,
      mixer_region_requested: ConferenceRegion,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      processing_state: ConferenceProcessingState,
      recording_enabled: Boolean,
      start_time: js.Date,
      status: ConferenceConferenceStatus,
      tag_info: js.Object,
      tags: js.Array[ConferenceTag],
      unique_participants: Double,
      uri: String,
      url: String
    ): ConferencePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], conference_sid = conference_sid.asInstanceOf[js.Any], connect_duration_seconds = connect_duration_seconds.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], detected_issues = detected_issues.asInstanceOf[js.Any], duration_seconds = duration_seconds.asInstanceOf[js.Any], end_reason = end_reason.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], ended_by = ended_by.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], max_concurrent_participants = max_concurrent_participants.asInstanceOf[js.Any], max_participants = max_participants.asInstanceOf[js.Any], mixer_region = mixer_region.asInstanceOf[js.Any], mixer_region_requested = mixer_region_requested.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], processing_state = processing_state.asInstanceOf[js.Any], recording_enabled = recording_enabled.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag_info = tag_info.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unique_participants = unique_participants.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConferencePayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.complete
    - typings.twilio.twilioStrings.in_progress
    - typings.twilio.twilioStrings.timeout
  */
  trait ConferenceProcessingState extends StObject
  object ConferenceProcessingState {
    
    inline def complete: typings.twilio.twilioStrings.complete = "complete".asInstanceOf[typings.twilio.twilioStrings.complete]
    
    inline def in_progress: typings.twilio.twilioStrings.in_progress = "in_progress".asInstanceOf[typings.twilio.twilioStrings.in_progress]
    
    inline def timeout: typings.twilio.twilioStrings.timeout = "timeout".asInstanceOf[typings.twilio.twilioStrings.timeout]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.us1
    - typings.twilio.twilioStrings.au1
    - typings.twilio.twilioStrings.br1
    - typings.twilio.twilioStrings.ie1
    - typings.twilio.twilioStrings.jp1
    - typings.twilio.twilioStrings.sg1
    - typings.twilio.twilioStrings.de1
  */
  trait ConferenceRegion extends StObject
  object ConferenceRegion {
    
    inline def au1: typings.twilio.twilioStrings.au1 = "au1".asInstanceOf[typings.twilio.twilioStrings.au1]
    
    inline def br1: typings.twilio.twilioStrings.br1 = "br1".asInstanceOf[typings.twilio.twilioStrings.br1]
    
    inline def de1: typings.twilio.twilioStrings.de1 = "de1".asInstanceOf[typings.twilio.twilioStrings.de1]
    
    inline def ie1: typings.twilio.twilioStrings.ie1 = "ie1".asInstanceOf[typings.twilio.twilioStrings.ie1]
    
    inline def jp1: typings.twilio.twilioStrings.jp1 = "jp1".asInstanceOf[typings.twilio.twilioStrings.jp1]
    
    inline def sg1: typings.twilio.twilioStrings.sg1 = "sg1".asInstanceOf[typings.twilio.twilioStrings.sg1]
    
    inline def us1: typings.twilio.twilioStrings.us1 = "us1".asInstanceOf[typings.twilio.twilioStrings.us1]
  }
  
  trait ConferenceResource extends StObject {
    
    var account_sid: String
    
    var conference_sid: String
    
    var connect_duration_seconds: Double
    
    var create_time: js.Date
    
    var detected_issues: js.Object
    
    var duration_seconds: Double
    
    var end_reason: ConferenceConferenceEndReason
    
    var end_time: js.Date
    
    var ended_by: String
    
    var friendly_name: String
    
    var links: String
    
    var max_concurrent_participants: Double
    
    var max_participants: Double
    
    var mixer_region: ConferenceRegion
    
    var mixer_region_requested: ConferenceRegion
    
    var processing_state: ConferenceProcessingState
    
    var recording_enabled: Boolean
    
    var start_time: js.Date
    
    var status: ConferenceConferenceStatus
    
    var tag_info: js.Object
    
    var tags: js.Array[ConferenceTag]
    
    var unique_participants: Double
    
    var url: String
  }
  object ConferenceResource {
    
    inline def apply(
      account_sid: String,
      conference_sid: String,
      connect_duration_seconds: Double,
      create_time: js.Date,
      detected_issues: js.Object,
      duration_seconds: Double,
      end_reason: ConferenceConferenceEndReason,
      end_time: js.Date,
      ended_by: String,
      friendly_name: String,
      links: String,
      max_concurrent_participants: Double,
      max_participants: Double,
      mixer_region: ConferenceRegion,
      mixer_region_requested: ConferenceRegion,
      processing_state: ConferenceProcessingState,
      recording_enabled: Boolean,
      start_time: js.Date,
      status: ConferenceConferenceStatus,
      tag_info: js.Object,
      tags: js.Array[ConferenceTag],
      unique_participants: Double,
      url: String
    ): ConferenceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], conference_sid = conference_sid.asInstanceOf[js.Any], connect_duration_seconds = connect_duration_seconds.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], detected_issues = detected_issues.asInstanceOf[js.Any], duration_seconds = duration_seconds.asInstanceOf[js.Any], end_reason = end_reason.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], ended_by = ended_by.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], max_concurrent_participants = max_concurrent_participants.asInstanceOf[js.Any], max_participants = max_participants.asInstanceOf[js.Any], mixer_region = mixer_region.asInstanceOf[js.Any], mixer_region_requested = mixer_region_requested.asInstanceOf[js.Any], processing_state = processing_state.asInstanceOf[js.Any], recording_enabled = recording_enabled.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag_info = tag_info.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unique_participants = unique_participants.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConferenceResource]
    }
    
    extension [Self <: ConferenceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setConference_sid(value: String): Self = StObject.set(x, "conference_sid", value.asInstanceOf[js.Any])
      
      inline def setConnect_duration_seconds(value: Double): Self = StObject.set(x, "connect_duration_seconds", value.asInstanceOf[js.Any])
      
      inline def setCreate_time(value: js.Date): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      inline def setDetected_issues(value: js.Object): Self = StObject.set(x, "detected_issues", value.asInstanceOf[js.Any])
      
      inline def setDuration_seconds(value: Double): Self = StObject.set(x, "duration_seconds", value.asInstanceOf[js.Any])
      
      inline def setEnd_reason(value: ConferenceConferenceEndReason): Self = StObject.set(x, "end_reason", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setEnded_by(value: String): Self = StObject.set(x, "ended_by", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMax_concurrent_participants(value: Double): Self = StObject.set(x, "max_concurrent_participants", value.asInstanceOf[js.Any])
      
      inline def setMax_participants(value: Double): Self = StObject.set(x, "max_participants", value.asInstanceOf[js.Any])
      
      inline def setMixer_region(value: ConferenceRegion): Self = StObject.set(x, "mixer_region", value.asInstanceOf[js.Any])
      
      inline def setMixer_region_requested(value: ConferenceRegion): Self = StObject.set(x, "mixer_region_requested", value.asInstanceOf[js.Any])
      
      inline def setProcessing_state(value: ConferenceProcessingState): Self = StObject.set(x, "processing_state", value.asInstanceOf[js.Any])
      
      inline def setRecording_enabled(value: Boolean): Self = StObject.set(x, "recording_enabled", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: js.Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ConferenceConferenceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTag_info(value: js.Object): Self = StObject.set(x, "tag_info", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[ConferenceTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: ConferenceTag*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setUnique_participants(value: Double): Self = StObject.set(x, "unique_participants", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConferenceSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.invalid_requested_region
    - typings.twilio.twilioStrings.duplicate_identity
    - typings.twilio.twilioStrings.start_failure
    - typings.twilio.twilioStrings.region_configuration_issues
    - typings.twilio.twilioStrings.quality_warnings
    - typings.twilio.twilioStrings.participant_behavior_issues
    - typings.twilio.twilioStrings.high_packet_loss
    - typings.twilio.twilioStrings.high_jitter
    - typings.twilio.twilioStrings.high_latency
    - typings.twilio.twilioStrings.low_mos
    - typings.twilio.twilioStrings.detected_silence
  */
  trait ConferenceTag extends StObject
  object ConferenceTag {
    
    inline def detected_silence: typings.twilio.twilioStrings.detected_silence = "detected_silence".asInstanceOf[typings.twilio.twilioStrings.detected_silence]
    
    inline def duplicate_identity: typings.twilio.twilioStrings.duplicate_identity = "duplicate_identity".asInstanceOf[typings.twilio.twilioStrings.duplicate_identity]
    
    inline def high_jitter: typings.twilio.twilioStrings.high_jitter = "high_jitter".asInstanceOf[typings.twilio.twilioStrings.high_jitter]
    
    inline def high_latency: typings.twilio.twilioStrings.high_latency = "high_latency".asInstanceOf[typings.twilio.twilioStrings.high_latency]
    
    inline def high_packet_loss: typings.twilio.twilioStrings.high_packet_loss = "high_packet_loss".asInstanceOf[typings.twilio.twilioStrings.high_packet_loss]
    
    inline def invalid_requested_region: typings.twilio.twilioStrings.invalid_requested_region = "invalid_requested_region".asInstanceOf[typings.twilio.twilioStrings.invalid_requested_region]
    
    inline def low_mos: typings.twilio.twilioStrings.low_mos = "low_mos".asInstanceOf[typings.twilio.twilioStrings.low_mos]
    
    inline def participant_behavior_issues: typings.twilio.twilioStrings.participant_behavior_issues = "participant_behavior_issues".asInstanceOf[typings.twilio.twilioStrings.participant_behavior_issues]
    
    inline def quality_warnings: typings.twilio.twilioStrings.quality_warnings = "quality_warnings".asInstanceOf[typings.twilio.twilioStrings.quality_warnings]
    
    inline def region_configuration_issues: typings.twilio.twilioStrings.region_configuration_issues = "region_configuration_issues".asInstanceOf[typings.twilio.twilioStrings.region_configuration_issues]
    
    inline def start_failure: typings.twilio.twilioStrings.start_failure = "start_failure".asInstanceOf[typings.twilio.twilioStrings.start_failure]
  }
}
