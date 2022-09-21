package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.pending_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerReservationMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/reservation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/reservation", "ReservationContext")
  @js.native
  open class ReservationContext protected () extends StObject {
    /**
      * Initialize the ReservationContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the WorkerReservation resource to fetch
      * @param workerSid - The SID of the reserved Worker resource with the WorkerReservation resource to fetch
      * @param sid - The SID of the WorkerReservation resource to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, workerSid: String, sid: String) = this()
    
    /**
      * fetch a ReservationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ReservationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ReservationInstance, Any]): js.Promise[ReservationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ReservationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ReservationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ReservationInstance, Any]): js.Promise[ReservationInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ReservationInstance, Any]
    ): js.Promise[ReservationInstance] = js.native
    def update(opts: ReservationInstanceUpdateOptions): js.Promise[ReservationInstance] = js.native
    def update(
      opts: ReservationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ReservationInstance, Any]
    ): js.Promise[ReservationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/reservation", "ReservationInstance")
  @js.native
  open class ReservationInstance protected () extends SerializableClass {
    /**
      * Initialize the ReservationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that this worker is contained within.
      * @param workerSid - The SID of the reserved Worker resource
      * @param sid - The SID of the WorkerReservation resource to fetch
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: ReservationPayload,
      workspaceSid: String,
      workerSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: ReservationContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ReservationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ReservationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ReservationInstance] = js.native
    
    var links: String = js.native
    
    var reservationStatus: ReservationStatus = js.native
    
    var sid: String = js.native
    
    var taskSid: String = js.native
    
    /**
      * update a ReservationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ReservationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ReservationInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ReservationInstance] = js.native
    def update(opts: ReservationInstanceUpdateOptions): js.Promise[ReservationInstance] = js.native
    def update(
      opts: ReservationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ReservationInstance] = js.native
    
    var url: String = js.native
    
    var workerName: String = js.native
    
    var workerSid: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the ReservationList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that this worker is contained within.
    * @param workerSid - The SID of the reserved Worker resource
    */
  inline def ReservationList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, workerSid: String): ReservationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ReservationList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any])).asInstanceOf[ReservationListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/worker/reservation", "ReservationPage")
  @js.native
  open class ReservationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.taskrouterV1Mod.^, 
          ReservationPayload, 
          ReservationResource, 
          ReservationInstance
        ] {
    /**
      * Initialize the ReservationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ReservationSolution
    ) = this()
    
    /**
      * Build an instance of ReservationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ReservationPayload): ReservationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.initiated
    - typings.twilio.twilioStrings.ringing
    - typings.twilio.twilioStrings.answered
    - typings.twilio.twilioStrings.completed_
  */
  trait ReservationCallStatus extends StObject
  object ReservationCallStatus {
    
    inline def answered: typings.twilio.twilioStrings.answered = "answered".asInstanceOf[typings.twilio.twilioStrings.answered]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def initiated: typings.twilio.twilioStrings.initiated = "initiated".asInstanceOf[typings.twilio.twilioStrings.initiated]
    
    inline def ringing: typings.twilio.twilioStrings.ringing = "ringing".asInstanceOf[typings.twilio.twilioStrings.ringing]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.start
    - typings.twilio.twilioStrings.end
    - typings.twilio.twilioStrings.join
    - typings.twilio.twilioStrings.leave
    - typings.twilio.twilioStrings.mute
    - typings.twilio.twilioStrings.hold
    - typings.twilio.twilioStrings.speaker
  */
  trait ReservationConferenceEvent extends StObject
  object ReservationConferenceEvent {
    
    inline def end: typings.twilio.twilioStrings.end = "end".asInstanceOf[typings.twilio.twilioStrings.end]
    
    inline def hold: typings.twilio.twilioStrings.hold = "hold".asInstanceOf[typings.twilio.twilioStrings.hold]
    
    inline def join: typings.twilio.twilioStrings.join = "join".asInstanceOf[typings.twilio.twilioStrings.join]
    
    inline def leave: typings.twilio.twilioStrings.leave = "leave".asInstanceOf[typings.twilio.twilioStrings.leave]
    
    inline def mute: typings.twilio.twilioStrings.mute = "mute".asInstanceOf[typings.twilio.twilioStrings.mute]
    
    inline def speaker: typings.twilio.twilioStrings.speaker = "speaker".asInstanceOf[typings.twilio.twilioStrings.speaker]
    
    inline def start: typings.twilio.twilioStrings.start = "start".asInstanceOf[typings.twilio.twilioStrings.start]
  }
  
  /**
    * Options to pass to update
    *
    * @property beep - Whether to play a notification beep when the participant joins
    * @property beepOnCustomerEntrance - Whether to play a notification beep when the customer joins
    * @property callAccept - Whether to accept a reservation when executing a Call instruction
    * @property callFrom - The Caller ID of the outbound call when executing a Call instruction
    * @property callRecord - Whether to record both legs of a call when executing a Call instruction
    * @property callStatusCallbackUrl - The URL to call for the completed call event when executing a Call instruction
    * @property callTimeout - The timeout for a call when executing a Call instruction
    * @property callTo - The contact URI of the worker when executing a Call instruction
    * @property callUrl - TwiML URI executed on answering the worker's leg as a result of the Call instruction
    * @property conferenceRecord - Whether to record the conference the participant is joining
    * @property conferenceRecordingStatusCallback - The URL we should call using the `conference_recording_status_callback_method` when the conference recording is available
    * @property conferenceRecordingStatusCallbackMethod - The HTTP method we should use to call `conference_recording_status_callback`
    * @property conferenceStatusCallback - The callback URL for conference events
    * @property conferenceStatusCallbackEvent - The conference status events that we will send to conference_status_callback
    * @property conferenceStatusCallbackMethod - HTTP method for requesting `conference_status_callback` URL
    * @property conferenceTrim - Whether to trim leading and trailing silence from your recorded conference audio files
    * @property dequeueFrom - The caller ID of the call to the worker when executing a Dequeue instruction
    * @property dequeuePostWorkActivitySid - The SID of the Activity resource to start after executing a Dequeue instruction
    * @property dequeueRecord - Whether to record both legs of a call when executing a Dequeue instruction
    * @property dequeueStatusCallbackEvent - The call progress events sent via webhooks as a result of a Dequeue instruction
    * @property dequeueStatusCallbackUrl - The callback URL for completed call event when executing a Dequeue instruction
    * @property dequeueTimeout - The timeout for call when executing a Dequeue instruction
    * @property dequeueTo - The contact URI of the worker when executing a Dequeue instruction
    * @property earlyMedia - Whether agents can hear the state of the outbound call
    * @property endConferenceOnCustomerExit - Whether to end the conference when the customer leaves
    * @property endConferenceOnExit - Whether to end the conference when the agent leaves
    * @property from - The caller ID of the call to the worker when executing a Conference instruction
    * @property ifMatch - The If-Match HTTP request header
    * @property instruction - The assignment instruction for the reservation
    * @property maxParticipants - The maximum number of agent conference participants
    * @property muted - Whether to mute the agent
    * @property postWorkActivitySid - The new worker activity SID after executing a Conference instruction
    * @property record - Whether to record the participant and their conferences
    * @property recordingChannels - Specify `mono` or `dual` recording channels
    * @property recordingStatusCallback - The URL that we should call using the `recording_status_callback_method` when the recording status changes
    * @property recordingStatusCallbackMethod - The HTTP method we should use when we call `recording_status_callback`
    * @property redirectAccept - Whether the reservation should be accepted when executing a Redirect instruction
    * @property redirectCallSid - The Call SID of the call parked in the queue when executing a Redirect instruction
    * @property redirectUrl - TwiML URI to redirect the call to when executing the Redirect instruction
    * @property region - The region where we should mix the conference audio
    * @property reservationStatus - The new status of the reservation
    * @property sipAuthPassword - The SIP password for authentication
    * @property sipAuthUsername - The SIP username used for authentication
    * @property startConferenceOnEnter - Whether the conference starts when the participant joins the conference
    * @property statusCallback - The URL we should call to send status information to your application
    * @property statusCallbackEvent - The call progress events that we will send to status_callback
    * @property statusCallbackMethod - The HTTP method we should use to call status_callback
    * @property timeout - The timeout for a call when executing a Conference instruction
    * @property to - The Contact URI of the worker when executing a Conference instruction
    * @property waitMethod - The HTTP method we should use to call `wait_url`
    * @property waitUrl - URL that hosts pre-conference hold music
    * @property workerActivitySid - The new worker activity SID if rejecting a reservation
    */
  trait ReservationInstanceUpdateOptions extends StObject {
    
    var beep: js.UndefOr[String] = js.undefined
    
    var beepOnCustomerEntrance: js.UndefOr[Boolean] = js.undefined
    
    var callAccept: js.UndefOr[Boolean] = js.undefined
    
    var callFrom: js.UndefOr[String] = js.undefined
    
    var callRecord: js.UndefOr[String] = js.undefined
    
    var callStatusCallbackUrl: js.UndefOr[String] = js.undefined
    
    var callTimeout: js.UndefOr[Double] = js.undefined
    
    var callTo: js.UndefOr[String] = js.undefined
    
    var callUrl: js.UndefOr[String] = js.undefined
    
    var conferenceRecord: js.UndefOr[String] = js.undefined
    
    var conferenceRecordingStatusCallback: js.UndefOr[String] = js.undefined
    
    var conferenceRecordingStatusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var conferenceStatusCallback: js.UndefOr[String] = js.undefined
    
    var conferenceStatusCallbackEvent: js.UndefOr[ReservationConferenceEvent | js.Array[ReservationConferenceEvent]] = js.undefined
    
    var conferenceStatusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var conferenceTrim: js.UndefOr[String] = js.undefined
    
    var dequeueFrom: js.UndefOr[String] = js.undefined
    
    var dequeuePostWorkActivitySid: js.UndefOr[String] = js.undefined
    
    var dequeueRecord: js.UndefOr[String] = js.undefined
    
    var dequeueStatusCallbackEvent: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var dequeueStatusCallbackUrl: js.UndefOr[String] = js.undefined
    
    var dequeueTimeout: js.UndefOr[Double] = js.undefined
    
    var dequeueTo: js.UndefOr[String] = js.undefined
    
    var earlyMedia: js.UndefOr[Boolean] = js.undefined
    
    var endConferenceOnCustomerExit: js.UndefOr[Boolean] = js.undefined
    
    var endConferenceOnExit: js.UndefOr[Boolean] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var ifMatch: js.UndefOr[String] = js.undefined
    
    var instruction: js.UndefOr[String] = js.undefined
    
    var maxParticipants: js.UndefOr[Double] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var postWorkActivitySid: js.UndefOr[String] = js.undefined
    
    var record: js.UndefOr[Boolean] = js.undefined
    
    var recordingChannels: js.UndefOr[String] = js.undefined
    
    var recordingStatusCallback: js.UndefOr[String] = js.undefined
    
    var recordingStatusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var redirectAccept: js.UndefOr[Boolean] = js.undefined
    
    var redirectCallSid: js.UndefOr[String] = js.undefined
    
    var redirectUrl: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var reservationStatus: js.UndefOr[ReservationStatus] = js.undefined
    
    var sipAuthPassword: js.UndefOr[String] = js.undefined
    
    var sipAuthUsername: js.UndefOr[String] = js.undefined
    
    var startConferenceOnEnter: js.UndefOr[Boolean] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackEvent: js.UndefOr[ReservationCallStatus | js.Array[ReservationCallStatus]] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var waitMethod: js.UndefOr[String] = js.undefined
    
    var waitUrl: js.UndefOr[String] = js.undefined
    
    var workerActivitySid: js.UndefOr[String] = js.undefined
  }
  object ReservationInstanceUpdateOptions {
    
    inline def apply(): ReservationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReservationInstanceUpdateOptions]
    }
    
    extension [Self <: ReservationInstanceUpdateOptions](x: Self) {
      
      inline def setBeep(value: String): Self = StObject.set(x, "beep", value.asInstanceOf[js.Any])
      
      inline def setBeepOnCustomerEntrance(value: Boolean): Self = StObject.set(x, "beepOnCustomerEntrance", value.asInstanceOf[js.Any])
      
      inline def setBeepOnCustomerEntranceUndefined: Self = StObject.set(x, "beepOnCustomerEntrance", js.undefined)
      
      inline def setBeepUndefined: Self = StObject.set(x, "beep", js.undefined)
      
      inline def setCallAccept(value: Boolean): Self = StObject.set(x, "callAccept", value.asInstanceOf[js.Any])
      
      inline def setCallAcceptUndefined: Self = StObject.set(x, "callAccept", js.undefined)
      
      inline def setCallFrom(value: String): Self = StObject.set(x, "callFrom", value.asInstanceOf[js.Any])
      
      inline def setCallFromUndefined: Self = StObject.set(x, "callFrom", js.undefined)
      
      inline def setCallRecord(value: String): Self = StObject.set(x, "callRecord", value.asInstanceOf[js.Any])
      
      inline def setCallRecordUndefined: Self = StObject.set(x, "callRecord", js.undefined)
      
      inline def setCallStatusCallbackUrl(value: String): Self = StObject.set(x, "callStatusCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallStatusCallbackUrlUndefined: Self = StObject.set(x, "callStatusCallbackUrl", js.undefined)
      
      inline def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
      
      inline def setCallTimeoutUndefined: Self = StObject.set(x, "callTimeout", js.undefined)
      
      inline def setCallTo(value: String): Self = StObject.set(x, "callTo", value.asInstanceOf[js.Any])
      
      inline def setCallToUndefined: Self = StObject.set(x, "callTo", js.undefined)
      
      inline def setCallUrl(value: String): Self = StObject.set(x, "callUrl", value.asInstanceOf[js.Any])
      
      inline def setCallUrlUndefined: Self = StObject.set(x, "callUrl", js.undefined)
      
      inline def setConferenceRecord(value: String): Self = StObject.set(x, "conferenceRecord", value.asInstanceOf[js.Any])
      
      inline def setConferenceRecordUndefined: Self = StObject.set(x, "conferenceRecord", js.undefined)
      
      inline def setConferenceRecordingStatusCallback(value: String): Self = StObject.set(x, "conferenceRecordingStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setConferenceRecordingStatusCallbackMethod(value: String): Self = StObject.set(x, "conferenceRecordingStatusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setConferenceRecordingStatusCallbackMethodUndefined: Self = StObject.set(x, "conferenceRecordingStatusCallbackMethod", js.undefined)
      
      inline def setConferenceRecordingStatusCallbackUndefined: Self = StObject.set(x, "conferenceRecordingStatusCallback", js.undefined)
      
      inline def setConferenceStatusCallback(value: String): Self = StObject.set(x, "conferenceStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setConferenceStatusCallbackEvent(value: ReservationConferenceEvent | js.Array[ReservationConferenceEvent]): Self = StObject.set(x, "conferenceStatusCallbackEvent", value.asInstanceOf[js.Any])
      
      inline def setConferenceStatusCallbackEventUndefined: Self = StObject.set(x, "conferenceStatusCallbackEvent", js.undefined)
      
      inline def setConferenceStatusCallbackEventVarargs(value: ReservationConferenceEvent*): Self = StObject.set(x, "conferenceStatusCallbackEvent", js.Array(value*))
      
      inline def setConferenceStatusCallbackMethod(value: String): Self = StObject.set(x, "conferenceStatusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setConferenceStatusCallbackMethodUndefined: Self = StObject.set(x, "conferenceStatusCallbackMethod", js.undefined)
      
      inline def setConferenceStatusCallbackUndefined: Self = StObject.set(x, "conferenceStatusCallback", js.undefined)
      
      inline def setConferenceTrim(value: String): Self = StObject.set(x, "conferenceTrim", value.asInstanceOf[js.Any])
      
      inline def setConferenceTrimUndefined: Self = StObject.set(x, "conferenceTrim", js.undefined)
      
      inline def setDequeueFrom(value: String): Self = StObject.set(x, "dequeueFrom", value.asInstanceOf[js.Any])
      
      inline def setDequeueFromUndefined: Self = StObject.set(x, "dequeueFrom", js.undefined)
      
      inline def setDequeuePostWorkActivitySid(value: String): Self = StObject.set(x, "dequeuePostWorkActivitySid", value.asInstanceOf[js.Any])
      
      inline def setDequeuePostWorkActivitySidUndefined: Self = StObject.set(x, "dequeuePostWorkActivitySid", js.undefined)
      
      inline def setDequeueRecord(value: String): Self = StObject.set(x, "dequeueRecord", value.asInstanceOf[js.Any])
      
      inline def setDequeueRecordUndefined: Self = StObject.set(x, "dequeueRecord", js.undefined)
      
      inline def setDequeueStatusCallbackEvent(value: String | js.Array[String]): Self = StObject.set(x, "dequeueStatusCallbackEvent", value.asInstanceOf[js.Any])
      
      inline def setDequeueStatusCallbackEventUndefined: Self = StObject.set(x, "dequeueStatusCallbackEvent", js.undefined)
      
      inline def setDequeueStatusCallbackEventVarargs(value: String*): Self = StObject.set(x, "dequeueStatusCallbackEvent", js.Array(value*))
      
      inline def setDequeueStatusCallbackUrl(value: String): Self = StObject.set(x, "dequeueStatusCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setDequeueStatusCallbackUrlUndefined: Self = StObject.set(x, "dequeueStatusCallbackUrl", js.undefined)
      
      inline def setDequeueTimeout(value: Double): Self = StObject.set(x, "dequeueTimeout", value.asInstanceOf[js.Any])
      
      inline def setDequeueTimeoutUndefined: Self = StObject.set(x, "dequeueTimeout", js.undefined)
      
      inline def setDequeueTo(value: String): Self = StObject.set(x, "dequeueTo", value.asInstanceOf[js.Any])
      
      inline def setDequeueToUndefined: Self = StObject.set(x, "dequeueTo", js.undefined)
      
      inline def setEarlyMedia(value: Boolean): Self = StObject.set(x, "earlyMedia", value.asInstanceOf[js.Any])
      
      inline def setEarlyMediaUndefined: Self = StObject.set(x, "earlyMedia", js.undefined)
      
      inline def setEndConferenceOnCustomerExit(value: Boolean): Self = StObject.set(x, "endConferenceOnCustomerExit", value.asInstanceOf[js.Any])
      
      inline def setEndConferenceOnCustomerExitUndefined: Self = StObject.set(x, "endConferenceOnCustomerExit", js.undefined)
      
      inline def setEndConferenceOnExit(value: Boolean): Self = StObject.set(x, "endConferenceOnExit", value.asInstanceOf[js.Any])
      
      inline def setEndConferenceOnExitUndefined: Self = StObject.set(x, "endConferenceOnExit", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
      
      inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
      
      inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
      
      inline def setMaxParticipants(value: Double): Self = StObject.set(x, "maxParticipants", value.asInstanceOf[js.Any])
      
      inline def setMaxParticipantsUndefined: Self = StObject.set(x, "maxParticipants", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setPostWorkActivitySid(value: String): Self = StObject.set(x, "postWorkActivitySid", value.asInstanceOf[js.Any])
      
      inline def setPostWorkActivitySidUndefined: Self = StObject.set(x, "postWorkActivitySid", js.undefined)
      
      inline def setRecord(value: Boolean): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      inline def setRecordingChannels(value: String): Self = StObject.set(x, "recordingChannels", value.asInstanceOf[js.Any])
      
      inline def setRecordingChannelsUndefined: Self = StObject.set(x, "recordingChannels", js.undefined)
      
      inline def setRecordingStatusCallback(value: String): Self = StObject.set(x, "recordingStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setRecordingStatusCallbackMethod(value: String): Self = StObject.set(x, "recordingStatusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setRecordingStatusCallbackMethodUndefined: Self = StObject.set(x, "recordingStatusCallbackMethod", js.undefined)
      
      inline def setRecordingStatusCallbackUndefined: Self = StObject.set(x, "recordingStatusCallback", js.undefined)
      
      inline def setRedirectAccept(value: Boolean): Self = StObject.set(x, "redirectAccept", value.asInstanceOf[js.Any])
      
      inline def setRedirectAcceptUndefined: Self = StObject.set(x, "redirectAccept", js.undefined)
      
      inline def setRedirectCallSid(value: String): Self = StObject.set(x, "redirectCallSid", value.asInstanceOf[js.Any])
      
      inline def setRedirectCallSidUndefined: Self = StObject.set(x, "redirectCallSid", js.undefined)
      
      inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
      
      inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setReservationStatus(value: ReservationStatus): Self = StObject.set(x, "reservationStatus", value.asInstanceOf[js.Any])
      
      inline def setReservationStatusUndefined: Self = StObject.set(x, "reservationStatus", js.undefined)
      
      inline def setSipAuthPassword(value: String): Self = StObject.set(x, "sipAuthPassword", value.asInstanceOf[js.Any])
      
      inline def setSipAuthPasswordUndefined: Self = StObject.set(x, "sipAuthPassword", js.undefined)
      
      inline def setSipAuthUsername(value: String): Self = StObject.set(x, "sipAuthUsername", value.asInstanceOf[js.Any])
      
      inline def setSipAuthUsernameUndefined: Self = StObject.set(x, "sipAuthUsername", js.undefined)
      
      inline def setStartConferenceOnEnter(value: Boolean): Self = StObject.set(x, "startConferenceOnEnter", value.asInstanceOf[js.Any])
      
      inline def setStartConferenceOnEnterUndefined: Self = StObject.set(x, "startConferenceOnEnter", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackEvent(value: ReservationCallStatus | js.Array[ReservationCallStatus]): Self = StObject.set(x, "statusCallbackEvent", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackEventUndefined: Self = StObject.set(x, "statusCallbackEvent", js.undefined)
      
      inline def setStatusCallbackEventVarargs(value: ReservationCallStatus*): Self = StObject.set(x, "statusCallbackEvent", js.Array(value*))
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setWaitMethod(value: String): Self = StObject.set(x, "waitMethod", value.asInstanceOf[js.Any])
      
      inline def setWaitMethodUndefined: Self = StObject.set(x, "waitMethod", js.undefined)
      
      inline def setWaitUrl(value: String): Self = StObject.set(x, "waitUrl", value.asInstanceOf[js.Any])
      
      inline def setWaitUrlUndefined: Self = StObject.set(x, "waitUrl", js.undefined)
      
      inline def setWorkerActivitySid(value: String): Self = StObject.set(x, "workerActivitySid", value.asInstanceOf[js.Any])
      
      inline def setWorkerActivitySidUndefined: Self = StObject.set(x, "workerActivitySid", js.undefined)
    }
  }
  
  @js.native
  trait ReservationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ReservationContext = js.native
    
    /**
      * Streams ReservationInstance records from the API.
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
          /* item */ ReservationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ReservationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ReservationListInstanceEachOptions): Unit = js.native
    def each(
      opts: ReservationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ReservationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a reservation
      *
      * @param sid - The SID of the WorkerReservation resource to fetch
      */
    def get(sid: String): ReservationContext = js.native
    
    /**
      * Retrieve a single target page of ReservationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ReservationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ReservationPage, Any]): js.Promise[ReservationPage] = js.native
    def getPage(targetUrl: String): js.Promise[ReservationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ReservationPage, Any]
    ): js.Promise[ReservationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ReservationPage, Any]
    ): js.Promise[ReservationPage] = js.native
    
    /**
      * Lists ReservationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ReservationInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ReservationInstance], Any]
    ): js.Promise[js.Array[ReservationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ReservationInstance], Any]
    ): js.Promise[js.Array[ReservationInstance]] = js.native
    def list(opts: ReservationListInstanceOptions): js.Promise[js.Array[ReservationInstance]] = js.native
    def list(
      opts: ReservationListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ReservationInstance], Any]
    ): js.Promise[js.Array[ReservationInstance]] = js.native
    
    /**
      * Retrieve a single page of ReservationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ReservationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ReservationPage, Any]): js.Promise[ReservationPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ReservationPage, Any]): js.Promise[ReservationPage] = js.native
    def page(opts: ReservationListInstancePageOptions): js.Promise[ReservationPage] = js.native
    def page(
      opts: ReservationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ReservationPage, Any]
    ): js.Promise[ReservationPage] = js.native
    
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
    * @property reservationStatus - Returns the list of reservations for a worker with a specified ReservationStatus
    */
  trait ReservationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ReservationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var reservationStatus: js.UndefOr[ReservationStatus] = js.undefined
  }
  object ReservationListInstanceEachOptions {
    
    inline def apply(): ReservationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReservationListInstanceEachOptions]
    }
    
    extension [Self <: ReservationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ReservationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setReservationStatus(value: ReservationStatus): Self = StObject.set(x, "reservationStatus", value.asInstanceOf[js.Any])
      
      inline def setReservationStatusUndefined: Self = StObject.set(x, "reservationStatus", js.undefined)
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
    * @property reservationStatus - Returns the list of reservations for a worker with a specified ReservationStatus
    */
  trait ReservationListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var reservationStatus: js.UndefOr[ReservationStatus] = js.undefined
  }
  object ReservationListInstanceOptions {
    
    inline def apply(): ReservationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReservationListInstanceOptions]
    }
    
    extension [Self <: ReservationListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setReservationStatus(value: ReservationStatus): Self = StObject.set(x, "reservationStatus", value.asInstanceOf[js.Any])
      
      inline def setReservationStatusUndefined: Self = StObject.set(x, "reservationStatus", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property reservationStatus - Returns the list of reservations for a worker with a specified ReservationStatus
    */
  trait ReservationListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var reservationStatus: js.UndefOr[ReservationStatus] = js.undefined
  }
  object ReservationListInstancePageOptions {
    
    inline def apply(): ReservationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReservationListInstancePageOptions]
    }
    
    extension [Self <: ReservationListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setReservationStatus(value: ReservationStatus): Self = StObject.set(x, "reservationStatus", value.asInstanceOf[js.Any])
      
      inline def setReservationStatusUndefined: Self = StObject.set(x, "reservationStatus", js.undefined)
    }
  }
  
  trait ReservationPayload
    extends StObject
       with ReservationResource
       with TwilioResponsePayload
  object ReservationPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      reservation_status: ReservationStatus,
      sid: String,
      task_sid: String,
      uri: String,
      url: String,
      worker_name: String,
      worker_sid: String,
      workspace_sid: String
    ): ReservationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reservation_status = reservation_status.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], worker_name = worker_name.asInstanceOf[js.Any], worker_sid = worker_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReservationPayload]
    }
  }
  
  trait ReservationResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var links: String
    
    var reservation_status: ReservationStatus
    
    var sid: String
    
    var task_sid: String
    
    var url: String
    
    var worker_name: String
    
    var worker_sid: String
    
    var workspace_sid: String
  }
  object ReservationResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      links: String,
      reservation_status: ReservationStatus,
      sid: String,
      task_sid: String,
      url: String,
      worker_name: String,
      worker_sid: String,
      workspace_sid: String
    ): ReservationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], reservation_status = reservation_status.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], worker_name = worker_name.asInstanceOf[js.Any], worker_sid = worker_sid.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReservationResource]
    }
    
    extension [Self <: ReservationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setReservation_status(value: ReservationStatus): Self = StObject.set(x, "reservation_status", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTask_sid(value: String): Self = StObject.set(x, "task_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorker_name(value: String): Self = StObject.set(x, "worker_name", value.asInstanceOf[js.Any])
      
      inline def setWorker_sid(value: String): Self = StObject.set(x, "worker_sid", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReservationSolution extends StObject {
    
    var workerSid: js.UndefOr[String] = js.undefined
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object ReservationSolution {
    
    inline def apply(): ReservationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReservationSolution]
    }
    
    extension [Self <: ReservationSolution](x: Self) {
      
      inline def setWorkerSid(value: String): Self = StObject.set(x, "workerSid", value.asInstanceOf[js.Any])
      
      inline def setWorkerSidUndefined: Self = StObject.set(x, "workerSid", js.undefined)
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.pending_
    - typings.twilio.twilioStrings.accepted
    - typings.twilio.twilioStrings.rejected
    - typings.twilio.twilioStrings.timeout
    - typings.twilio.twilioStrings.canceled
    - typings.twilio.twilioStrings.rescinded
    - typings.twilio.twilioStrings.wrapping
    - typings.twilio.twilioStrings.completed_
  */
  trait ReservationStatus extends StObject
  object ReservationStatus {
    
    inline def accepted: typings.twilio.twilioStrings.accepted = "accepted".asInstanceOf[typings.twilio.twilioStrings.accepted]
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def pending: pending_ = "pending".asInstanceOf[pending_]
    
    inline def rejected: typings.twilio.twilioStrings.rejected = "rejected".asInstanceOf[typings.twilio.twilioStrings.rejected]
    
    inline def rescinded: typings.twilio.twilioStrings.rescinded = "rescinded".asInstanceOf[typings.twilio.twilioStrings.rescinded]
    
    inline def timeout: typings.twilio.twilioStrings.timeout = "timeout".asInstanceOf[typings.twilio.twilioStrings.timeout]
    
    inline def wrapping: typings.twilio.twilioStrings.wrapping = "wrapping".asInstanceOf[typings.twilio.twilioStrings.wrapping]
  }
}
