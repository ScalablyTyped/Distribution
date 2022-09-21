package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.eventMod.EventListInstance
import typings.twilio.feedbackMod.FeedbackContext
import typings.twilio.feedbackMod.FeedbackListInstance
import typings.twilio.feedbackSummaryMod.FeedbackSummaryListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.notificationMod.NotificationContext
import typings.twilio.notificationMod.NotificationListInstance
import typings.twilio.paymentMod.PaymentContext
import typings.twilio.paymentMod.PaymentListInstance
import typings.twilio.recordingMod.RecordingContext
import typings.twilio.recordingMod.RecordingListInstance
import typings.twilio.siprecMod.SiprecContext
import typings.twilio.siprecMod.SiprecListInstance
import typings.twilio.streamMod.StreamContext
import typings.twilio.streamMod.StreamListInstance
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/call", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/call", "CallContext")
  @js.native
  open class CallContext protected () extends StObject {
    /**
      * Initialize the CallContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource(s) to fetch
      * @param sid - The SID of the Call resource to fetch
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    var events: EventListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def feedback(sid: String): FeedbackContext = js.native
    @JSName("feedback")
    var feedback_Original: FeedbackListInstance = js.native
    
    /**
      * fetch a CallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CallInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CallInstance, Any]): js.Promise[CallInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def notifications(sid: String): NotificationContext = js.native
    @JSName("notifications")
    var notifications_Original: NotificationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def payments(sid: String): PaymentContext = js.native
    @JSName("payments")
    var payments_Original: PaymentListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def recordings(sid: String): RecordingContext = js.native
    @JSName("recordings")
    var recordings_Original: RecordingListInstance = js.native
    
    /**
      * remove a CallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ CallInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def siprec(sid: String): SiprecContext = js.native
    @JSName("siprec")
    var siprec_Original: SiprecListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def streams(sid: String): StreamContext = js.native
    @JSName("streams")
    var streams_Original: StreamListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a CallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[CallInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ CallInstance, Any]): js.Promise[CallInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CallInstance, Any]): js.Promise[CallInstance] = js.native
    def update(opts: CallInstanceUpdateOptions): js.Promise[CallInstance] = js.native
    def update(
      opts: CallInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CallInstance, Any]
    ): js.Promise[CallInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/call", "CallInstance")
  @js.native
  open class CallInstance protected () extends SerializableClass {
    /**
      * Initialize the CallContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created this resource
      * @param sid - The SID of the Call resource to fetch
      */
    def this(version: typings.twilio.v2010Mod.^, payload: CallPayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: CallContext = js.native
    
    var accountSid: String = js.native
    
    var answeredBy: String = js.native
    
    var apiVersion: String = js.native
    
    var callerName: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var direction: String = js.native
    
    var duration: String = js.native
    
    var endTime: js.Date = js.native
    
    /**
      * Access the events
      */
    def events(): EventListInstance = js.native
    
    /**
      * Access the feedback
      */
    def feedback(): FeedbackListInstance = js.native
    
    /**
      * fetch a CallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CallInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CallInstance] = js.native
    
    var forwardedFrom: String = js.native
    
    var from: String = js.native
    
    var fromFormatted: String = js.native
    
    var groupSid: String = js.native
    
    /**
      * Access the notifications
      */
    def notifications(): NotificationListInstance = js.native
    
    var parentCallSid: String = js.native
    
    /**
      * Access the payments
      */
    def payments(): PaymentListInstance = js.native
    
    var phoneNumberSid: String = js.native
    
    var price: String = js.native
    
    var priceUnit: String = js.native
    
    var queueTime: String = js.native
    
    /**
      * Access the recordings
      */
    def recordings(): RecordingListInstance = js.native
    
    /**
      * remove a CallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * Access the siprec
      */
    def siprec(): SiprecListInstance = js.native
    
    var startTime: js.Date = js.native
    
    var status: CallStatus = js.native
    
    /**
      * Access the streams
      */
    def streams(): StreamListInstance = js.native
    
    var subresourceUris: String = js.native
    
    var to: String = js.native
    
    var toFormatted: String = js.native
    
    var trunkSid: String = js.native
    
    /**
      * update a CallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[CallInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CallInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CallInstance] = js.native
    def update(opts: CallInstanceUpdateOptions): js.Promise[CallInstance] = js.native
    def update(
      opts: CallInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[CallInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the CallList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created this resource
    */
  inline def CallList(version: typings.twilio.v2010Mod.^, accountSid: String): CallListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("CallList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[CallListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/call", "CallPage")
  @js.native
  open class CallPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, CallPayload, CallResource, CallInstance] {
    /**
      * Initialize the CallPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CallSolution
    ) = this()
    
    /**
      * Build an instance of CallInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CallPayload): CallInstance = js.native
    
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
  trait CallEvent extends StObject
  object CallEvent {
    
    inline def answered: typings.twilio.twilioStrings.answered = "answered".asInstanceOf[typings.twilio.twilioStrings.answered]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def initiated: typings.twilio.twilioStrings.initiated = "initiated".asInstanceOf[typings.twilio.twilioStrings.initiated]
    
    inline def ringing: typings.twilio.twilioStrings.ringing = "ringing".asInstanceOf[typings.twilio.twilioStrings.ringing]
  }
  
  /**
    * Options to pass to update
    *
    * @property fallbackMethod - HTTP Method to use with fallback_url
    * @property fallbackUrl - Fallback URL in case of error
    * @property method - HTTP method to use to fetch TwiML
    * @property status - The new status to update the call with.
    * @property statusCallback - The URL we should call to send status information to your application
    * @property statusCallbackMethod - HTTP Method to use to call status_callback
    * @property timeLimit - The maximum duration of the call in seconds.
    * @property twiml - TwiML instructions for the call
    * @property url - The absolute URL that returns TwiML for this call
    */
  trait CallInstanceUpdateOptions extends StObject {
    
    var fallbackMethod: js.UndefOr[String] = js.undefined
    
    var fallbackUrl: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CallUpdateStatus] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var timeLimit: js.UndefOr[Double] = js.undefined
    
    var twiml: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object CallInstanceUpdateOptions {
    
    inline def apply(): CallInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallInstanceUpdateOptions]
    }
    
    extension [Self <: CallInstanceUpdateOptions](x: Self) {
      
      inline def setFallbackMethod(value: String): Self = StObject.set(x, "fallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setFallbackMethodUndefined: Self = StObject.set(x, "fallbackMethod", js.undefined)
      
      inline def setFallbackUrl(value: String): Self = StObject.set(x, "fallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setFallbackUrlUndefined: Self = StObject.set(x, "fallbackUrl", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setStatus(value: CallUpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
      
      inline def setTwiml(value: String): Self = StObject.set(x, "twiml", value.asInstanceOf[js.Any])
      
      inline def setTwimlUndefined: Self = StObject.set(x, "twiml", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait CallListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CallContext = js.native
    
    /**
      * create a CallInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CallListInstanceCreateOptions): js.Promise[CallInstance] = js.native
    def create(
      opts: CallListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ CallInstance, Any]
    ): js.Promise[CallInstance] = js.native
    
    /**
      * Streams CallInstance records from the API.
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
          /* item */ CallInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CallInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CallListInstanceEachOptions): Unit = js.native
    def each(
      opts: CallListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CallInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    var feedbackSummaries: js.UndefOr[FeedbackSummaryListInstance] = js.native
    
    /**
      * Constructs a call
      *
      * @param sid - The SID of the Call resource to fetch
      */
    def get(sid: String): CallContext = js.native
    
    /**
      * Retrieve a single target page of CallInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CallPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CallPage, Any]): js.Promise[CallPage] = js.native
    def getPage(targetUrl: String): js.Promise[CallPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ CallPage, Any]): js.Promise[CallPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CallPage, Any]): js.Promise[CallPage] = js.native
    
    /**
      * Lists CallInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CallInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CallInstance], Any]): js.Promise[js.Array[CallInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CallInstance], Any]
    ): js.Promise[js.Array[CallInstance]] = js.native
    def list(opts: CallListInstanceOptions): js.Promise[js.Array[CallInstance]] = js.native
    def list(
      opts: CallListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CallInstance], Any]
    ): js.Promise[js.Array[CallInstance]] = js.native
    
    /**
      * Retrieve a single page of CallInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CallPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CallPage, Any]): js.Promise[CallPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CallPage, Any]): js.Promise[CallPage] = js.native
    def page(opts: CallListInstancePageOptions): js.Promise[CallPage] = js.native
    def page(
      opts: CallListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CallPage, Any]
    ): js.Promise[CallPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property applicationSid - The SID of the Application resource that will handle the call
    * @property asyncAmd - Enable asynchronous AMD
    * @property asyncAmdStatusCallback - The URL we should call to send amd status information to your application
    * @property asyncAmdStatusCallbackMethod - HTTP Method to use with async_amd_status_callback
    * @property byoc - BYOC trunk SID (Beta)
    * @property callReason - Reason for the call (Branded Calls Beta)
    * @property callToken - A token string needed to invoke a forwarded call with a CallerId recieved on a previous incoming call
    * @property callerId - The phone number, SIP address, or Client identifier that made this call. Phone numbers are in E.164 format (e.g., +16175551212). SIP addresses are formatted as `name@company.com`.
    * @property fallbackMethod - HTTP Method to use with fallback_url
    * @property fallbackUrl - Fallback URL in case of error
    * @property from - Twilio number from which to originate the call
    * @property machineDetection - Enable machine detection or end of greeting detection
    * @property machineDetectionSilenceTimeout - Number of milliseconds of initial silence
    * @property machineDetectionSpeechEndThreshold - Number of milliseconds of silence after speech activity
    * @property machineDetectionSpeechThreshold - Number of milliseconds for measuring stick for the length of the speech activity
    * @property machineDetectionTimeout - Number of seconds to wait for machine detection
    * @property method - HTTP method to use to fetch TwiML
    * @property record - Whether to record the call
    * @property recordingChannels - The number of channels in the final recording
    * @property recordingStatusCallback - The URL that we call when the recording is available to be accessed
    * @property recordingStatusCallbackEvent - The recording status events that will trigger calls to the URL specified in `recording_status_callback`
    * @property recordingStatusCallbackMethod - The HTTP method we should use when calling the `recording_status_callback` URL
    * @property recordingTrack - Which track(s) to record
    * @property sendDigits - The digits to dial after connecting to the number
    * @property sipAuthPassword - The password required to authenticate the user account specified in `sip_auth_username`.
    * @property sipAuthUsername - The username used to authenticate the caller making a SIP call
    * @property statusCallback - The URL we should call to send status information to your application
    * @property statusCallbackEvent - The call progress events that we send to the `status_callback` URL.
    * @property statusCallbackMethod - HTTP Method to use with status_callback
    * @property timeLimit - The maximum duration of the call in seconds.
    * @property timeout - Number of seconds to wait for an answer
    * @property to - Phone number, SIP address, or client identifier to call
    * @property trim - Set this parameter to control trimming of silence on the recording.
    * @property twiml - TwiML instructions for the call
    * @property url - The absolute URL that returns TwiML for this call
    */
  trait CallListInstanceCreateOptions extends StObject {
    
    var applicationSid: js.UndefOr[String] = js.undefined
    
    var asyncAmd: js.UndefOr[String] = js.undefined
    
    var asyncAmdStatusCallback: js.UndefOr[String] = js.undefined
    
    var asyncAmdStatusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var byoc: js.UndefOr[String] = js.undefined
    
    var callReason: js.UndefOr[String] = js.undefined
    
    var callToken: js.UndefOr[String] = js.undefined
    
    var callerId: js.UndefOr[String] = js.undefined
    
    var fallbackMethod: js.UndefOr[String] = js.undefined
    
    var fallbackUrl: js.UndefOr[String] = js.undefined
    
    var from: String
    
    var machineDetection: js.UndefOr[String] = js.undefined
    
    var machineDetectionSilenceTimeout: js.UndefOr[Double] = js.undefined
    
    var machineDetectionSpeechEndThreshold: js.UndefOr[Double] = js.undefined
    
    var machineDetectionSpeechThreshold: js.UndefOr[Double] = js.undefined
    
    var machineDetectionTimeout: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var record: js.UndefOr[Boolean] = js.undefined
    
    var recordingChannels: js.UndefOr[String] = js.undefined
    
    var recordingStatusCallback: js.UndefOr[String] = js.undefined
    
    var recordingStatusCallbackEvent: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var recordingStatusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var recordingTrack: js.UndefOr[String] = js.undefined
    
    var sendDigits: js.UndefOr[String] = js.undefined
    
    var sipAuthPassword: js.UndefOr[String] = js.undefined
    
    var sipAuthUsername: js.UndefOr[String] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackEvent: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var timeLimit: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var to: String
    
    var trim: js.UndefOr[String] = js.undefined
    
    var twiml: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object CallListInstanceCreateOptions {
    
    inline def apply(from: String, to: String): CallListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallListInstanceCreateOptions]
    }
    
    extension [Self <: CallListInstanceCreateOptions](x: Self) {
      
      inline def setApplicationSid(value: String): Self = StObject.set(x, "applicationSid", value.asInstanceOf[js.Any])
      
      inline def setApplicationSidUndefined: Self = StObject.set(x, "applicationSid", js.undefined)
      
      inline def setAsyncAmd(value: String): Self = StObject.set(x, "asyncAmd", value.asInstanceOf[js.Any])
      
      inline def setAsyncAmdStatusCallback(value: String): Self = StObject.set(x, "asyncAmdStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setAsyncAmdStatusCallbackMethod(value: String): Self = StObject.set(x, "asyncAmdStatusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setAsyncAmdStatusCallbackMethodUndefined: Self = StObject.set(x, "asyncAmdStatusCallbackMethod", js.undefined)
      
      inline def setAsyncAmdStatusCallbackUndefined: Self = StObject.set(x, "asyncAmdStatusCallback", js.undefined)
      
      inline def setAsyncAmdUndefined: Self = StObject.set(x, "asyncAmd", js.undefined)
      
      inline def setByoc(value: String): Self = StObject.set(x, "byoc", value.asInstanceOf[js.Any])
      
      inline def setByocUndefined: Self = StObject.set(x, "byoc", js.undefined)
      
      inline def setCallReason(value: String): Self = StObject.set(x, "callReason", value.asInstanceOf[js.Any])
      
      inline def setCallReasonUndefined: Self = StObject.set(x, "callReason", js.undefined)
      
      inline def setCallToken(value: String): Self = StObject.set(x, "callToken", value.asInstanceOf[js.Any])
      
      inline def setCallTokenUndefined: Self = StObject.set(x, "callToken", js.undefined)
      
      inline def setCallerId(value: String): Self = StObject.set(x, "callerId", value.asInstanceOf[js.Any])
      
      inline def setCallerIdUndefined: Self = StObject.set(x, "callerId", js.undefined)
      
      inline def setFallbackMethod(value: String): Self = StObject.set(x, "fallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setFallbackMethodUndefined: Self = StObject.set(x, "fallbackMethod", js.undefined)
      
      inline def setFallbackUrl(value: String): Self = StObject.set(x, "fallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setFallbackUrlUndefined: Self = StObject.set(x, "fallbackUrl", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMachineDetection(value: String): Self = StObject.set(x, "machineDetection", value.asInstanceOf[js.Any])
      
      inline def setMachineDetectionSilenceTimeout(value: Double): Self = StObject.set(x, "machineDetectionSilenceTimeout", value.asInstanceOf[js.Any])
      
      inline def setMachineDetectionSilenceTimeoutUndefined: Self = StObject.set(x, "machineDetectionSilenceTimeout", js.undefined)
      
      inline def setMachineDetectionSpeechEndThreshold(value: Double): Self = StObject.set(x, "machineDetectionSpeechEndThreshold", value.asInstanceOf[js.Any])
      
      inline def setMachineDetectionSpeechEndThresholdUndefined: Self = StObject.set(x, "machineDetectionSpeechEndThreshold", js.undefined)
      
      inline def setMachineDetectionSpeechThreshold(value: Double): Self = StObject.set(x, "machineDetectionSpeechThreshold", value.asInstanceOf[js.Any])
      
      inline def setMachineDetectionSpeechThresholdUndefined: Self = StObject.set(x, "machineDetectionSpeechThreshold", js.undefined)
      
      inline def setMachineDetectionTimeout(value: Double): Self = StObject.set(x, "machineDetectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setMachineDetectionTimeoutUndefined: Self = StObject.set(x, "machineDetectionTimeout", js.undefined)
      
      inline def setMachineDetectionUndefined: Self = StObject.set(x, "machineDetection", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
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
      
      inline def setSendDigits(value: String): Self = StObject.set(x, "sendDigits", value.asInstanceOf[js.Any])
      
      inline def setSendDigitsUndefined: Self = StObject.set(x, "sendDigits", js.undefined)
      
      inline def setSipAuthPassword(value: String): Self = StObject.set(x, "sipAuthPassword", value.asInstanceOf[js.Any])
      
      inline def setSipAuthPasswordUndefined: Self = StObject.set(x, "sipAuthPassword", js.undefined)
      
      inline def setSipAuthUsername(value: String): Self = StObject.set(x, "sipAuthUsername", value.asInstanceOf[js.Any])
      
      inline def setSipAuthUsernameUndefined: Self = StObject.set(x, "sipAuthUsername", js.undefined)
      
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
      
      inline def setTrim(value: String): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setTwiml(value: String): Self = StObject.set(x, "twiml", value.asInstanceOf[js.Any])
      
      inline def setTwimlUndefined: Self = StObject.set(x, "twiml", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property endTime - Only include calls that ended on this date
    * @property endTimeAfter - Only include calls that ended on this date
    * @property endTimeBefore - Only include calls that ended on this date
    * @property from - Phone number or Client identifier to filter `from` on
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
    * @property parentCallSid - Parent call SID to filter on
    * @property startTime - Only include calls that started on this date
    * @property startTimeAfter - Only include calls that started on this date
    * @property startTimeBefore - Only include calls that started on this date
    * @property status - The status of the resources to read
    * @property to - Phone number or Client identifier of calls to include
    */
  trait CallListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CallInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var endTime: js.UndefOr[js.Date] = js.undefined
    
    var endTimeAfter: js.UndefOr[js.Date] = js.undefined
    
    var endTimeBefore: js.UndefOr[js.Date] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var parentCallSid: js.UndefOr[String] = js.undefined
    
    var startTime: js.UndefOr[js.Date] = js.undefined
    
    var startTimeAfter: js.UndefOr[js.Date] = js.undefined
    
    var startTimeBefore: js.UndefOr[js.Date] = js.undefined
    
    var status: js.UndefOr[CallStatus] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object CallListInstanceEachOptions {
    
    inline def apply(): CallListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallListInstanceEachOptions]
    }
    
    extension [Self <: CallListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CallInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeAfter(value: js.Date): Self = StObject.set(x, "endTimeAfter", value.asInstanceOf[js.Any])
      
      inline def setEndTimeAfterUndefined: Self = StObject.set(x, "endTimeAfter", js.undefined)
      
      inline def setEndTimeBefore(value: js.Date): Self = StObject.set(x, "endTimeBefore", value.asInstanceOf[js.Any])
      
      inline def setEndTimeBeforeUndefined: Self = StObject.set(x, "endTimeBefore", js.undefined)
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setParentCallSid(value: String): Self = StObject.set(x, "parentCallSid", value.asInstanceOf[js.Any])
      
      inline def setParentCallSidUndefined: Self = StObject.set(x, "parentCallSid", js.undefined)
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeAfter(value: js.Date): Self = StObject.set(x, "startTimeAfter", value.asInstanceOf[js.Any])
      
      inline def setStartTimeAfterUndefined: Self = StObject.set(x, "startTimeAfter", js.undefined)
      
      inline def setStartTimeBefore(value: js.Date): Self = StObject.set(x, "startTimeBefore", value.asInstanceOf[js.Any])
      
      inline def setStartTimeBeforeUndefined: Self = StObject.set(x, "startTimeBefore", js.undefined)
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setStatus(value: CallStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property endTime - Only include calls that ended on this date
    * @property endTimeAfter - Only include calls that ended on this date
    * @property endTimeBefore - Only include calls that ended on this date
    * @property from - Phone number or Client identifier to filter `from` on
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
    * @property parentCallSid - Parent call SID to filter on
    * @property startTime - Only include calls that started on this date
    * @property startTimeAfter - Only include calls that started on this date
    * @property startTimeBefore - Only include calls that started on this date
    * @property status - The status of the resources to read
    * @property to - Phone number or Client identifier of calls to include
    */
  trait CallListInstanceOptions extends StObject {
    
    var endTime: js.UndefOr[js.Date] = js.undefined
    
    var endTimeAfter: js.UndefOr[js.Date] = js.undefined
    
    var endTimeBefore: js.UndefOr[js.Date] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var parentCallSid: js.UndefOr[String] = js.undefined
    
    var startTime: js.UndefOr[js.Date] = js.undefined
    
    var startTimeAfter: js.UndefOr[js.Date] = js.undefined
    
    var startTimeBefore: js.UndefOr[js.Date] = js.undefined
    
    var status: js.UndefOr[CallStatus] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object CallListInstanceOptions {
    
    inline def apply(): CallListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallListInstanceOptions]
    }
    
    extension [Self <: CallListInstanceOptions](x: Self) {
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeAfter(value: js.Date): Self = StObject.set(x, "endTimeAfter", value.asInstanceOf[js.Any])
      
      inline def setEndTimeAfterUndefined: Self = StObject.set(x, "endTimeAfter", js.undefined)
      
      inline def setEndTimeBefore(value: js.Date): Self = StObject.set(x, "endTimeBefore", value.asInstanceOf[js.Any])
      
      inline def setEndTimeBeforeUndefined: Self = StObject.set(x, "endTimeBefore", js.undefined)
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setParentCallSid(value: String): Self = StObject.set(x, "parentCallSid", value.asInstanceOf[js.Any])
      
      inline def setParentCallSidUndefined: Self = StObject.set(x, "parentCallSid", js.undefined)
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeAfter(value: js.Date): Self = StObject.set(x, "startTimeAfter", value.asInstanceOf[js.Any])
      
      inline def setStartTimeAfterUndefined: Self = StObject.set(x, "startTimeAfter", js.undefined)
      
      inline def setStartTimeBefore(value: js.Date): Self = StObject.set(x, "startTimeBefore", value.asInstanceOf[js.Any])
      
      inline def setStartTimeBeforeUndefined: Self = StObject.set(x, "startTimeBefore", js.undefined)
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setStatus(value: CallStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property endTime - Only include calls that ended on this date
    * @property endTimeAfter - Only include calls that ended on this date
    * @property endTimeBefore - Only include calls that ended on this date
    * @property from - Phone number or Client identifier to filter `from` on
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property parentCallSid - Parent call SID to filter on
    * @property startTime - Only include calls that started on this date
    * @property startTimeAfter - Only include calls that started on this date
    * @property startTimeBefore - Only include calls that started on this date
    * @property status - The status of the resources to read
    * @property to - Phone number or Client identifier of calls to include
    */
  trait CallListInstancePageOptions extends StObject {
    
    var endTime: js.UndefOr[js.Date] = js.undefined
    
    var endTimeAfter: js.UndefOr[js.Date] = js.undefined
    
    var endTimeBefore: js.UndefOr[js.Date] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var parentCallSid: js.UndefOr[String] = js.undefined
    
    var startTime: js.UndefOr[js.Date] = js.undefined
    
    var startTimeAfter: js.UndefOr[js.Date] = js.undefined
    
    var startTimeBefore: js.UndefOr[js.Date] = js.undefined
    
    var status: js.UndefOr[CallStatus] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object CallListInstancePageOptions {
    
    inline def apply(): CallListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallListInstancePageOptions]
    }
    
    extension [Self <: CallListInstancePageOptions](x: Self) {
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeAfter(value: js.Date): Self = StObject.set(x, "endTimeAfter", value.asInstanceOf[js.Any])
      
      inline def setEndTimeAfterUndefined: Self = StObject.set(x, "endTimeAfter", js.undefined)
      
      inline def setEndTimeBefore(value: js.Date): Self = StObject.set(x, "endTimeBefore", value.asInstanceOf[js.Any])
      
      inline def setEndTimeBeforeUndefined: Self = StObject.set(x, "endTimeBefore", js.undefined)
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setParentCallSid(value: String): Self = StObject.set(x, "parentCallSid", value.asInstanceOf[js.Any])
      
      inline def setParentCallSidUndefined: Self = StObject.set(x, "parentCallSid", js.undefined)
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeAfter(value: js.Date): Self = StObject.set(x, "startTimeAfter", value.asInstanceOf[js.Any])
      
      inline def setStartTimeAfterUndefined: Self = StObject.set(x, "startTimeAfter", js.undefined)
      
      inline def setStartTimeBefore(value: js.Date): Self = StObject.set(x, "startTimeBefore", value.asInstanceOf[js.Any])
      
      inline def setStartTimeBeforeUndefined: Self = StObject.set(x, "startTimeBefore", js.undefined)
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setStatus(value: CallStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait CallPayload
    extends StObject
       with CallResource {
    
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
  object CallPayload {
    
    inline def apply(
      account_sid: String,
      answered_by: String,
      api_version: String,
      caller_name: String,
      date_created: js.Date,
      date_updated: js.Date,
      direction: String,
      duration: String,
      end_time: js.Date,
      first_page_uri: String,
      forwarded_from: String,
      from: String,
      from_formatted: String,
      group_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      parent_call_sid: String,
      phone_number_sid: String,
      previous_page_uri: String,
      price: String,
      price_unit: String,
      queue_time: String,
      sid: String,
      start_time: js.Date,
      status: CallStatus,
      subresource_uris: String,
      to: String,
      to_formatted: String,
      trunk_sid: String,
      uri: String
    ): CallPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], answered_by = answered_by.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], caller_name = caller_name.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], forwarded_from = forwarded_from.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], from_formatted = from_formatted.asInstanceOf[js.Any], group_sid = group_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], parent_call_sid = parent_call_sid.asInstanceOf[js.Any], phone_number_sid = phone_number_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], queue_time = queue_time.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], to_formatted = to_formatted.asInstanceOf[js.Any], trunk_sid = trunk_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallPayload]
    }
    
    extension [Self <: CallPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallResource extends StObject {
    
    var account_sid: String
    
    var answered_by: String
    
    var api_version: String
    
    var caller_name: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var direction: String
    
    var duration: String
    
    var end_time: js.Date
    
    var forwarded_from: String
    
    var from: String
    
    var from_formatted: String
    
    var group_sid: String
    
    var parent_call_sid: String
    
    var phone_number_sid: String
    
    var price: String
    
    var price_unit: String
    
    var queue_time: String
    
    var sid: String
    
    var start_time: js.Date
    
    var status: CallStatus
    
    var subresource_uris: String
    
    var to: String
    
    var to_formatted: String
    
    var trunk_sid: String
    
    var uri: String
  }
  object CallResource {
    
    inline def apply(
      account_sid: String,
      answered_by: String,
      api_version: String,
      caller_name: String,
      date_created: js.Date,
      date_updated: js.Date,
      direction: String,
      duration: String,
      end_time: js.Date,
      forwarded_from: String,
      from: String,
      from_formatted: String,
      group_sid: String,
      parent_call_sid: String,
      phone_number_sid: String,
      price: String,
      price_unit: String,
      queue_time: String,
      sid: String,
      start_time: js.Date,
      status: CallStatus,
      subresource_uris: String,
      to: String,
      to_formatted: String,
      trunk_sid: String,
      uri: String
    ): CallResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], answered_by = answered_by.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], caller_name = caller_name.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], forwarded_from = forwarded_from.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], from_formatted = from_formatted.asInstanceOf[js.Any], group_sid = group_sid.asInstanceOf[js.Any], parent_call_sid = parent_call_sid.asInstanceOf[js.Any], phone_number_sid = phone_number_sid.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], queue_time = queue_time.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], to_formatted = to_formatted.asInstanceOf[js.Any], trunk_sid = trunk_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallResource]
    }
    
    extension [Self <: CallResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAnswered_by(value: String): Self = StObject.set(x, "answered_by", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setCaller_name(value: String): Self = StObject.set(x, "caller_name", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setForwarded_from(value: String): Self = StObject.set(x, "forwarded_from", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFrom_formatted(value: String): Self = StObject.set(x, "from_formatted", value.asInstanceOf[js.Any])
      
      inline def setGroup_sid(value: String): Self = StObject.set(x, "group_sid", value.asInstanceOf[js.Any])
      
      inline def setParent_call_sid(value: String): Self = StObject.set(x, "parent_call_sid", value.asInstanceOf[js.Any])
      
      inline def setPhone_number_sid(value: String): Self = StObject.set(x, "phone_number_sid", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPrice_unit(value: String): Self = StObject.set(x, "price_unit", value.asInstanceOf[js.Any])
      
      inline def setQueue_time(value: String): Self = StObject.set(x, "queue_time", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: js.Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: CallStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setTo_formatted(value: String): Self = StObject.set(x, "to_formatted", value.asInstanceOf[js.Any])
      
      inline def setTrunk_sid(value: String): Self = StObject.set(x, "trunk_sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object CallSolution {
    
    inline def apply(): CallSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallSolution]
    }
    
    extension [Self <: CallSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.queued
    - typings.twilio.twilioStrings.ringing
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.busy
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.`no-answer`
    - typings.twilio.twilioStrings.canceled
  */
  trait CallStatus extends StObject
  object CallStatus {
    
    inline def busy: typings.twilio.twilioStrings.busy = "busy".asInstanceOf[typings.twilio.twilioStrings.busy]
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def `in-progress`: typings.twilio.twilioStrings.`in-progress` = "in-progress".asInstanceOf[typings.twilio.twilioStrings.`in-progress`]
    
    inline def `no-answer`: typings.twilio.twilioStrings.`no-answer` = "no-answer".asInstanceOf[typings.twilio.twilioStrings.`no-answer`]
    
    inline def queued: typings.twilio.twilioStrings.queued = "queued".asInstanceOf[typings.twilio.twilioStrings.queued]
    
    inline def ringing: typings.twilio.twilioStrings.ringing = "ringing".asInstanceOf[typings.twilio.twilioStrings.ringing]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.canceled
    - typings.twilio.twilioStrings.completed_
  */
  trait CallUpdateStatus extends StObject
  object CallUpdateStatus {
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
  }
}
