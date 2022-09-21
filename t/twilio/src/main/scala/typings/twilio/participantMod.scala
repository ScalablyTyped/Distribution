package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object participantMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference/participant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference/participant", "ParticipantContext")
  @js.native
  open class ParticipantContext protected () extends StObject {
    /**
      * Initialize the ParticipantContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param conferenceSid - The SID of the conference with the participant to fetch
      * @param callSid - The Call SID or URL encoded label of the participant to fetch
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, conferenceSid: String, callSid: String) = this()
    
    /**
      * fetch a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]): js.Promise[ParticipantInstance] = js.native
    
    /**
      * remove a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]): js.Promise[Boolean] = js.native
    
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
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference/participant", "ParticipantInstance")
  @js.native
  open class ParticipantInstance protected () extends SerializableClass {
    /**
      * Initialize the ParticipantContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param conferenceSid - The SID of the conference the participant is in
      * @param callSid - The Call SID or URL encoded label of the participant to fetch
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: ParticipantPayload,
      accountSid: String,
      conferenceSid: String,
      callSid: String
    ) = this()
    
    /* private */ var _proxy: ParticipantContext = js.native
    
    var accountSid: String = js.native
    
    var callSid: String = js.native
    
    var callSidToCoach: String = js.native
    
    var coaching: Boolean = js.native
    
    var conferenceSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var endConferenceOnExit: Boolean = js.native
    
    /**
      * fetch a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ParticipantInstance] = js.native
    
    var hold: Boolean = js.native
    
    var label: String = js.native
    
    var muted: Boolean = js.native
    
    /**
      * remove a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var startConferenceOnEnter: Boolean = js.native
    
    var status: ParticipantStatus = js.native
    
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
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the ParticipantList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param conferenceSid - The SID of the conference the participant is in
    */
  inline def ParticipantList(version: typings.twilio.v2010Mod.^, accountSid: String, conferenceSid: String): ParticipantListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ParticipantList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], conferenceSid.asInstanceOf[js.Any])).asInstanceOf[ParticipantListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference/participant", "ParticipantPage")
  @js.native
  open class ParticipantPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
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
      version: typings.twilio.v2010Mod.^,
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
    * @property announceMethod - The HTTP method we should use to call announce_url
    * @property announceUrl - The URL we call using the `announce_method` for an announcement to the participant
    * @property beepOnExit - Whether to play a notification beep to the conference when the participant exit
    * @property callSidToCoach - The SID of the participant who is being `coached`
    * @property coaching - Indicates if the participant changed to coach
    * @property endConferenceOnExit - Whether to end the conference when the participant leaves
    * @property hold - Whether the participant should be on hold
    * @property holdMethod - The HTTP method we should use to call hold_url
    * @property holdUrl - The URL we call using the `hold_method` for  music that plays when the participant is on hold
    * @property muted - Whether the participant should be muted
    * @property waitMethod - The HTTP method we should use to call `wait_url`
    * @property waitUrl - URL that hosts pre-conference hold music
    */
  trait ParticipantInstanceUpdateOptions extends StObject {
    
    var announceMethod: js.UndefOr[String] = js.undefined
    
    var announceUrl: js.UndefOr[String] = js.undefined
    
    var beepOnExit: js.UndefOr[Boolean] = js.undefined
    
    var callSidToCoach: js.UndefOr[String] = js.undefined
    
    var coaching: js.UndefOr[Boolean] = js.undefined
    
    var endConferenceOnExit: js.UndefOr[Boolean] = js.undefined
    
    var hold: js.UndefOr[Boolean] = js.undefined
    
    var holdMethod: js.UndefOr[String] = js.undefined
    
    var holdUrl: js.UndefOr[String] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var waitMethod: js.UndefOr[String] = js.undefined
    
    var waitUrl: js.UndefOr[String] = js.undefined
  }
  object ParticipantInstanceUpdateOptions {
    
    inline def apply(): ParticipantInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantInstanceUpdateOptions]
    }
    
    extension [Self <: ParticipantInstanceUpdateOptions](x: Self) {
      
      inline def setAnnounceMethod(value: String): Self = StObject.set(x, "announceMethod", value.asInstanceOf[js.Any])
      
      inline def setAnnounceMethodUndefined: Self = StObject.set(x, "announceMethod", js.undefined)
      
      inline def setAnnounceUrl(value: String): Self = StObject.set(x, "announceUrl", value.asInstanceOf[js.Any])
      
      inline def setAnnounceUrlUndefined: Self = StObject.set(x, "announceUrl", js.undefined)
      
      inline def setBeepOnExit(value: Boolean): Self = StObject.set(x, "beepOnExit", value.asInstanceOf[js.Any])
      
      inline def setBeepOnExitUndefined: Self = StObject.set(x, "beepOnExit", js.undefined)
      
      inline def setCallSidToCoach(value: String): Self = StObject.set(x, "callSidToCoach", value.asInstanceOf[js.Any])
      
      inline def setCallSidToCoachUndefined: Self = StObject.set(x, "callSidToCoach", js.undefined)
      
      inline def setCoaching(value: Boolean): Self = StObject.set(x, "coaching", value.asInstanceOf[js.Any])
      
      inline def setCoachingUndefined: Self = StObject.set(x, "coaching", js.undefined)
      
      inline def setEndConferenceOnExit(value: Boolean): Self = StObject.set(x, "endConferenceOnExit", value.asInstanceOf[js.Any])
      
      inline def setEndConferenceOnExitUndefined: Self = StObject.set(x, "endConferenceOnExit", js.undefined)
      
      inline def setHold(value: Boolean): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setHoldMethod(value: String): Self = StObject.set(x, "holdMethod", value.asInstanceOf[js.Any])
      
      inline def setHoldMethodUndefined: Self = StObject.set(x, "holdMethod", js.undefined)
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setHoldUrl(value: String): Self = StObject.set(x, "holdUrl", value.asInstanceOf[js.Any])
      
      inline def setHoldUrlUndefined: Self = StObject.set(x, "holdUrl", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setWaitMethod(value: String): Self = StObject.set(x, "waitMethod", value.asInstanceOf[js.Any])
      
      inline def setWaitMethodUndefined: Self = StObject.set(x, "waitMethod", js.undefined)
      
      inline def setWaitUrl(value: String): Self = StObject.set(x, "waitUrl", value.asInstanceOf[js.Any])
      
      inline def setWaitUrlUndefined: Self = StObject.set(x, "waitUrl", js.undefined)
    }
  }
  
  @js.native
  trait ParticipantListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ParticipantContext = js.native
    
    /**
      * create a ParticipantInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ParticipantListInstanceCreateOptions): js.Promise[ParticipantInstance] = js.native
    def create(
      opts: ParticipantListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ParticipantInstance, Any]
    ): js.Promise[ParticipantInstance] = js.native
    
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
      * @param callSid - The Call SID or URL encoded label of the participant to fetch
      */
    def get(callSid: String): ParticipantContext = js.native
    
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
    * Options to pass to create
    *
    * @property beep - Whether to play a notification beep to the conference when the participant joins
    * @property byoc - BYOC trunk SID (Beta)
    * @property callReason - Reason for the call (Branded Calls Beta)
    * @property callSidToCoach - The SID of the participant who is being `coached`
    * @property callerId - The phone number, Client identifier, or username portion of SIP address that made this call.
    * @property coaching - Indicates if the participant changed to coach
    * @property conferenceRecord - Whether to record the conference the participant is joining
    * @property conferenceRecordingStatusCallback - The URL we should call using the `conference_recording_status_callback_method` when the conference recording is available
    * @property conferenceRecordingStatusCallbackEvent - The conference recording state changes that should generate a call to `conference_recording_status_callback`
    * @property conferenceRecordingStatusCallbackMethod - The HTTP method we should use to call `conference_recording_status_callback`
    * @property conferenceStatusCallback - The callback URL for conference events
    * @property conferenceStatusCallbackEvent - The conference state changes that should generate a call to `conference_status_callback`
    * @property conferenceStatusCallbackMethod - HTTP method for requesting `conference_status_callback` URL
    * @property conferenceTrim - Whether to trim leading and trailing silence from your recorded conference audio files
    * @property earlyMedia - Whether agents can hear the state of the outbound call
    * @property endConferenceOnExit - Whether to end the conference when the participant leaves
    * @property from - The phone number, Client identifier, or username portion of SIP address that made this call.
    * @property jitterBufferSize - Jitter Buffer size for the connecting participant
    * @property label - The label of this participant
    * @property maxParticipants - The maximum number of agent conference participants
    * @property muted - Whether to mute the agent
    * @property record - Whether to record the participant and their conferences
    * @property recordingChannels - Specify `mono` or `dual` recording channels
    * @property recordingStatusCallback - The URL that we should call using the `recording_status_callback_method` when the recording status changes
    * @property recordingStatusCallbackEvent - The recording state changes that should generate a call to `recording_status_callback`
    * @property recordingStatusCallbackMethod - The HTTP method we should use when we call `recording_status_callback`
    * @property recordingTrack - The track(s) to record
    * @property region - The region where we should mix the conference audio
    * @property sipAuthPassword - The SIP password for authentication
    * @property sipAuthUsername - The SIP username used for authentication
    * @property startConferenceOnEnter - Whether the conference starts when the participant joins the conference
    * @property statusCallback - The URL we should call to send status information to your application
    * @property statusCallbackEvent - Set state change events that will trigger a callback
    * @property statusCallbackMethod - The HTTP method we should use to call `status_callback`
    * @property timeLimit - The maximum duration of the call in seconds.
    * @property timeout - he number of seconds that we should wait for an answer
    * @property to - The phone number, SIP address or Client identifier that received this call.
    * @property waitMethod - The HTTP method we should use to call `wait_url`
    * @property waitUrl - URL that hosts pre-conference hold music
    */
  trait ParticipantListInstanceCreateOptions extends StObject {
    
    var beep: js.UndefOr[String] = js.undefined
    
    var byoc: js.UndefOr[String] = js.undefined
    
    var callReason: js.UndefOr[String] = js.undefined
    
    var callSidToCoach: js.UndefOr[String] = js.undefined
    
    var callerId: js.UndefOr[String] = js.undefined
    
    var coaching: js.UndefOr[Boolean] = js.undefined
    
    var conferenceRecord: js.UndefOr[String] = js.undefined
    
    var conferenceRecordingStatusCallback: js.UndefOr[String] = js.undefined
    
    var conferenceRecordingStatusCallbackEvent: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var conferenceRecordingStatusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var conferenceStatusCallback: js.UndefOr[String] = js.undefined
    
    var conferenceStatusCallbackEvent: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var conferenceStatusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var conferenceTrim: js.UndefOr[String] = js.undefined
    
    var earlyMedia: js.UndefOr[Boolean] = js.undefined
    
    var endConferenceOnExit: js.UndefOr[Boolean] = js.undefined
    
    var from: String
    
    var jitterBufferSize: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var maxParticipants: js.UndefOr[Double] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var record: js.UndefOr[Boolean] = js.undefined
    
    var recordingChannels: js.UndefOr[String] = js.undefined
    
    var recordingStatusCallback: js.UndefOr[String] = js.undefined
    
    var recordingStatusCallbackEvent: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var recordingStatusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var recordingTrack: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var sipAuthPassword: js.UndefOr[String] = js.undefined
    
    var sipAuthUsername: js.UndefOr[String] = js.undefined
    
    var startConferenceOnEnter: js.UndefOr[Boolean] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackEvent: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var timeLimit: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var to: String
    
    var waitMethod: js.UndefOr[String] = js.undefined
    
    var waitUrl: js.UndefOr[String] = js.undefined
  }
  object ParticipantListInstanceCreateOptions {
    
    inline def apply(from: String, to: String): ParticipantListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantListInstanceCreateOptions]
    }
    
    extension [Self <: ParticipantListInstanceCreateOptions](x: Self) {
      
      inline def setBeep(value: String): Self = StObject.set(x, "beep", value.asInstanceOf[js.Any])
      
      inline def setBeepUndefined: Self = StObject.set(x, "beep", js.undefined)
      
      inline def setByoc(value: String): Self = StObject.set(x, "byoc", value.asInstanceOf[js.Any])
      
      inline def setByocUndefined: Self = StObject.set(x, "byoc", js.undefined)
      
      inline def setCallReason(value: String): Self = StObject.set(x, "callReason", value.asInstanceOf[js.Any])
      
      inline def setCallReasonUndefined: Self = StObject.set(x, "callReason", js.undefined)
      
      inline def setCallSidToCoach(value: String): Self = StObject.set(x, "callSidToCoach", value.asInstanceOf[js.Any])
      
      inline def setCallSidToCoachUndefined: Self = StObject.set(x, "callSidToCoach", js.undefined)
      
      inline def setCallerId(value: String): Self = StObject.set(x, "callerId", value.asInstanceOf[js.Any])
      
      inline def setCallerIdUndefined: Self = StObject.set(x, "callerId", js.undefined)
      
      inline def setCoaching(value: Boolean): Self = StObject.set(x, "coaching", value.asInstanceOf[js.Any])
      
      inline def setCoachingUndefined: Self = StObject.set(x, "coaching", js.undefined)
      
      inline def setConferenceRecord(value: String): Self = StObject.set(x, "conferenceRecord", value.asInstanceOf[js.Any])
      
      inline def setConferenceRecordUndefined: Self = StObject.set(x, "conferenceRecord", js.undefined)
      
      inline def setConferenceRecordingStatusCallback(value: String): Self = StObject.set(x, "conferenceRecordingStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setConferenceRecordingStatusCallbackEvent(value: String | js.Array[String]): Self = StObject.set(x, "conferenceRecordingStatusCallbackEvent", value.asInstanceOf[js.Any])
      
      inline def setConferenceRecordingStatusCallbackEventUndefined: Self = StObject.set(x, "conferenceRecordingStatusCallbackEvent", js.undefined)
      
      inline def setConferenceRecordingStatusCallbackEventVarargs(value: String*): Self = StObject.set(x, "conferenceRecordingStatusCallbackEvent", js.Array(value*))
      
      inline def setConferenceRecordingStatusCallbackMethod(value: String): Self = StObject.set(x, "conferenceRecordingStatusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setConferenceRecordingStatusCallbackMethodUndefined: Self = StObject.set(x, "conferenceRecordingStatusCallbackMethod", js.undefined)
      
      inline def setConferenceRecordingStatusCallbackUndefined: Self = StObject.set(x, "conferenceRecordingStatusCallback", js.undefined)
      
      inline def setConferenceStatusCallback(value: String): Self = StObject.set(x, "conferenceStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setConferenceStatusCallbackEvent(value: String | js.Array[String]): Self = StObject.set(x, "conferenceStatusCallbackEvent", value.asInstanceOf[js.Any])
      
      inline def setConferenceStatusCallbackEventUndefined: Self = StObject.set(x, "conferenceStatusCallbackEvent", js.undefined)
      
      inline def setConferenceStatusCallbackEventVarargs(value: String*): Self = StObject.set(x, "conferenceStatusCallbackEvent", js.Array(value*))
      
      inline def setConferenceStatusCallbackMethod(value: String): Self = StObject.set(x, "conferenceStatusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setConferenceStatusCallbackMethodUndefined: Self = StObject.set(x, "conferenceStatusCallbackMethod", js.undefined)
      
      inline def setConferenceStatusCallbackUndefined: Self = StObject.set(x, "conferenceStatusCallback", js.undefined)
      
      inline def setConferenceTrim(value: String): Self = StObject.set(x, "conferenceTrim", value.asInstanceOf[js.Any])
      
      inline def setConferenceTrimUndefined: Self = StObject.set(x, "conferenceTrim", js.undefined)
      
      inline def setEarlyMedia(value: Boolean): Self = StObject.set(x, "earlyMedia", value.asInstanceOf[js.Any])
      
      inline def setEarlyMediaUndefined: Self = StObject.set(x, "earlyMedia", js.undefined)
      
      inline def setEndConferenceOnExit(value: Boolean): Self = StObject.set(x, "endConferenceOnExit", value.asInstanceOf[js.Any])
      
      inline def setEndConferenceOnExitUndefined: Self = StObject.set(x, "endConferenceOnExit", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setJitterBufferSize(value: String): Self = StObject.set(x, "jitterBufferSize", value.asInstanceOf[js.Any])
      
      inline def setJitterBufferSizeUndefined: Self = StObject.set(x, "jitterBufferSize", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMaxParticipants(value: Double): Self = StObject.set(x, "maxParticipants", value.asInstanceOf[js.Any])
      
      inline def setMaxParticipantsUndefined: Self = StObject.set(x, "maxParticipants", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setRecord(value: Boolean): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      inline def setRecordingChannels(value: String): Self = StObject.set(x, "recordingChannels", value.asInstanceOf[js.Any])
      
      inline def setRecordingChannelsUndefined: Self = StObject.set(x, "recordingChannels", js.undefined)
      
      inline def setRecordingStatusCallback(value: String): Self = StObject.set(x, "recordingStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setRecordingStatusCallbackEvent(value: String | js.Array[String]): Self = StObject.set(x, "recordingStatusCallbackEvent", value.asInstanceOf[js.Any])
      
      inline def setRecordingStatusCallbackEventUndefined: Self = StObject.set(x, "recordingStatusCallbackEvent", js.undefined)
      
      inline def setRecordingStatusCallbackEventVarargs(value: String*): Self = StObject.set(x, "recordingStatusCallbackEvent", js.Array(value*))
      
      inline def setRecordingStatusCallbackMethod(value: String): Self = StObject.set(x, "recordingStatusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setRecordingStatusCallbackMethodUndefined: Self = StObject.set(x, "recordingStatusCallbackMethod", js.undefined)
      
      inline def setRecordingStatusCallbackUndefined: Self = StObject.set(x, "recordingStatusCallback", js.undefined)
      
      inline def setRecordingTrack(value: String): Self = StObject.set(x, "recordingTrack", value.asInstanceOf[js.Any])
      
      inline def setRecordingTrackUndefined: Self = StObject.set(x, "recordingTrack", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setSipAuthPassword(value: String): Self = StObject.set(x, "sipAuthPassword", value.asInstanceOf[js.Any])
      
      inline def setSipAuthPasswordUndefined: Self = StObject.set(x, "sipAuthPassword", js.undefined)
      
      inline def setSipAuthUsername(value: String): Self = StObject.set(x, "sipAuthUsername", value.asInstanceOf[js.Any])
      
      inline def setSipAuthUsernameUndefined: Self = StObject.set(x, "sipAuthUsername", js.undefined)
      
      inline def setStartConferenceOnEnter(value: Boolean): Self = StObject.set(x, "startConferenceOnEnter", value.asInstanceOf[js.Any])
      
      inline def setStartConferenceOnEnterUndefined: Self = StObject.set(x, "startConferenceOnEnter", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackEvent(value: String | js.Array[String]): Self = StObject.set(x, "statusCallbackEvent", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackEventUndefined: Self = StObject.set(x, "statusCallbackEvent", js.undefined)
      
      inline def setStatusCallbackEventVarargs(value: String*): Self = StObject.set(x, "statusCallbackEvent", js.Array(value*))
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setWaitMethod(value: String): Self = StObject.set(x, "waitMethod", value.asInstanceOf[js.Any])
      
      inline def setWaitMethodUndefined: Self = StObject.set(x, "waitMethod", js.undefined)
      
      inline def setWaitUrl(value: String): Self = StObject.set(x, "waitUrl", value.asInstanceOf[js.Any])
      
      inline def setWaitUrlUndefined: Self = StObject.set(x, "waitUrl", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property coaching - Whether to return only participants who are coaching another call
    * @property done - Function to be called upon completion of streaming
    * @property hold - Whether to return only participants that are on hold
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property muted - Whether to return only participants that are muted
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
    
    var coaching: js.UndefOr[Boolean] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var hold: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setCoaching(value: Boolean): Self = StObject.set(x, "coaching", value.asInstanceOf[js.Any])
      
      inline def setCoachingUndefined: Self = StObject.set(x, "coaching", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setHold(value: Boolean): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property coaching - Whether to return only participants who are coaching another call
    * @property hold - Whether to return only participants that are on hold
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property muted - Whether to return only participants that are muted
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait ParticipantListInstanceOptions extends StObject {
    
    var coaching: js.UndefOr[Boolean] = js.undefined
    
    var hold: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ParticipantListInstanceOptions {
    
    inline def apply(): ParticipantListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstanceOptions]
    }
    
    extension [Self <: ParticipantListInstanceOptions](x: Self) {
      
      inline def setCoaching(value: Boolean): Self = StObject.set(x, "coaching", value.asInstanceOf[js.Any])
      
      inline def setCoachingUndefined: Self = StObject.set(x, "coaching", js.undefined)
      
      inline def setHold(value: Boolean): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property coaching - Whether to return only participants who are coaching another call
    * @property hold - Whether to return only participants that are on hold
    * @property muted - Whether to return only participants that are muted
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait ParticipantListInstancePageOptions extends StObject {
    
    var coaching: js.UndefOr[Boolean] = js.undefined
    
    var hold: js.UndefOr[Boolean] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setCoaching(value: Boolean): Self = StObject.set(x, "coaching", value.asInstanceOf[js.Any])
      
      inline def setCoachingUndefined: Self = StObject.set(x, "coaching", js.undefined)
      
      inline def setHold(value: Boolean): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait ParticipantPayload
    extends StObject
       with ParticipantResource {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
  }
  object ParticipantPayload {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      call_sid_to_coach: String,
      coaching: Boolean,
      conference_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      end_conference_on_exit: Boolean,
      first_page_uri: String,
      hold: Boolean,
      label: String,
      muted: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      start_conference_on_enter: Boolean,
      status: ParticipantStatus,
      uri: String
    ): ParticipantPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], call_sid_to_coach = call_sid_to_coach.asInstanceOf[js.Any], coaching = coaching.asInstanceOf[js.Any], conference_sid = conference_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], end_conference_on_exit = end_conference_on_exit.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], start_conference_on_enter = start_conference_on_enter.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantPayload]
    }
    
    extension [Self <: ParticipantPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParticipantResource extends StObject {
    
    var account_sid: String
    
    var call_sid: String
    
    var call_sid_to_coach: String
    
    var coaching: Boolean
    
    var conference_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var end_conference_on_exit: Boolean
    
    var hold: Boolean
    
    var label: String
    
    var muted: Boolean
    
    var start_conference_on_enter: Boolean
    
    var status: ParticipantStatus
    
    var uri: String
  }
  object ParticipantResource {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      call_sid_to_coach: String,
      coaching: Boolean,
      conference_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      end_conference_on_exit: Boolean,
      hold: Boolean,
      label: String,
      muted: Boolean,
      start_conference_on_enter: Boolean,
      status: ParticipantStatus,
      uri: String
    ): ParticipantResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], call_sid_to_coach = call_sid_to_coach.asInstanceOf[js.Any], coaching = coaching.asInstanceOf[js.Any], conference_sid = conference_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], end_conference_on_exit = end_conference_on_exit.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], start_conference_on_enter = start_conference_on_enter.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantResource]
    }
    
    extension [Self <: ParticipantResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_sid_to_coach(value: String): Self = StObject.set(x, "call_sid_to_coach", value.asInstanceOf[js.Any])
      
      inline def setCoaching(value: Boolean): Self = StObject.set(x, "coaching", value.asInstanceOf[js.Any])
      
      inline def setConference_sid(value: String): Self = StObject.set(x, "conference_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnd_conference_on_exit(value: Boolean): Self = StObject.set(x, "end_conference_on_exit", value.asInstanceOf[js.Any])
      
      inline def setHold(value: Boolean): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setStart_conference_on_enter(value: Boolean): Self = StObject.set(x, "start_conference_on_enter", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ParticipantStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParticipantSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var conferenceSid: js.UndefOr[String] = js.undefined
  }
  object ParticipantSolution {
    
    inline def apply(): ParticipantSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantSolution]
    }
    
    extension [Self <: ParticipantSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setConferenceSid(value: String): Self = StObject.set(x, "conferenceSid", value.asInstanceOf[js.Any])
      
      inline def setConferenceSidUndefined: Self = StObject.set(x, "conferenceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.queued
    - typings.twilio.twilioStrings.connecting
    - typings.twilio.twilioStrings.ringing
    - typings.twilio.twilioStrings.connected
    - typings.twilio.twilioStrings.complete
    - typings.twilio.twilioStrings.failed__
  */
  trait ParticipantStatus extends StObject
  object ParticipantStatus {
    
    inline def complete: typings.twilio.twilioStrings.complete = "complete".asInstanceOf[typings.twilio.twilioStrings.complete]
    
    inline def connected: typings.twilio.twilioStrings.connected = "connected".asInstanceOf[typings.twilio.twilioStrings.connected]
    
    inline def connecting: typings.twilio.twilioStrings.connecting = "connecting".asInstanceOf[typings.twilio.twilioStrings.connecting]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def queued: typings.twilio.twilioStrings.queued = "queued".asInstanceOf[typings.twilio.twilioStrings.queued]
    
    inline def ringing: typings.twilio.twilioStrings.ringing = "ringing".asInstanceOf[typings.twilio.twilioStrings.ringing]
  }
}
