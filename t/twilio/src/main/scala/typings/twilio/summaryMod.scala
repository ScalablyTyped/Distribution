package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.trunking_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object summaryMod {
  
  @JSImport("twilio/lib/rest/insights/v1/call/summary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/call/summary", "CallSummaryContext")
  @js.native
  open class CallSummaryContext protected () extends StObject {
    /**
      * Initialize the CallSummaryContext
      *
      * @param version - Version of the resource
      * @param callSid - The call_sid
      */
    def this(version: typings.twilio.insightsV1Mod.^, callSid: String) = this()
    
    /**
      * fetch a CallSummaryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CallSummaryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CallSummaryInstance, Any]): js.Promise[CallSummaryInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CallSummaryInstance, Any]
    ): js.Promise[CallSummaryInstance] = js.native
    def fetch(opts: CallSummaryInstanceFetchOptions): js.Promise[CallSummaryInstance] = js.native
    def fetch(
      opts: CallSummaryInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CallSummaryInstance, Any]
    ): js.Promise[CallSummaryInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/insights/v1/call/summary", "CallSummaryInstance")
  @js.native
  open class CallSummaryInstance protected () extends SerializableClass {
    /**
      * Initialize the CallSummaryContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param callSid - The call_sid
      */
    def this(version: typings.twilio.insightsV1Mod.^, payload: CallSummaryPayload, callSid: String) = this()
    
    /* private */ var _proxy: CallSummaryContext = js.native
    
    var accountSid: String = js.native
    
    var annotation: Any = js.native
    
    var attributes: Any = js.native
    
    var callSid: String = js.native
    
    var callState: CallSummaryCallState = js.native
    
    var callType: CallSummaryCallType = js.native
    
    var carrierEdge: Any = js.native
    
    var clientEdge: Any = js.native
    
    var connectDuration: Double = js.native
    
    var createdTime: js.Date = js.native
    
    var duration: Double = js.native
    
    var endTime: js.Date = js.native
    
    /**
      * fetch a CallSummaryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CallSummaryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CallSummaryInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CallSummaryInstance] = js.native
    def fetch(opts: CallSummaryInstanceFetchOptions): js.Promise[CallSummaryInstance] = js.native
    def fetch(
      opts: CallSummaryInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[CallSummaryInstance] = js.native
    
    var from: Any = js.native
    
    var processingState: CallSummaryProcessingState = js.native
    
    var properties: Any = js.native
    
    var sdkEdge: Any = js.native
    
    var sipEdge: Any = js.native
    
    var startTime: js.Date = js.native
    
    var tags: js.Array[String] = js.native
    
    var to: Any = js.native
    
    var trust: Any = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CallSummaryList
    *
    * @param version - Version of the resource
    * @param callSid - The call_sid
    */
  inline def CallSummaryList(version: typings.twilio.insightsV1Mod.^, callSid: String): CallSummaryListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("CallSummaryList")(version.asInstanceOf[js.Any], callSid.asInstanceOf[js.Any])).asInstanceOf[CallSummaryListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/call/summary", "CallSummaryPage")
  @js.native
  open class CallSummaryPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.insightsV1Mod.^, 
          CallSummaryPayload, 
          CallSummaryResource, 
          CallSummaryInstance
        ] {
    /**
      * Initialize the CallSummaryPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.insightsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CallSummarySolution
    ) = this()
    
    /**
      * Build an instance of CallSummaryInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CallSummaryPayload): CallSummaryInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.ringing
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.busy
    - typings.twilio.twilioStrings.fail
    - typings.twilio.twilioStrings.noanswer
    - typings.twilio.twilioStrings.canceled
    - typings.twilio.twilioStrings.answered
    - typings.twilio.twilioStrings.undialed
  */
  trait CallSummaryCallState extends StObject
  object CallSummaryCallState {
    
    inline def answered: typings.twilio.twilioStrings.answered = "answered".asInstanceOf[typings.twilio.twilioStrings.answered]
    
    inline def busy: typings.twilio.twilioStrings.busy = "busy".asInstanceOf[typings.twilio.twilioStrings.busy]
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def fail: typings.twilio.twilioStrings.fail = "fail".asInstanceOf[typings.twilio.twilioStrings.fail]
    
    inline def noanswer: typings.twilio.twilioStrings.noanswer = "noanswer".asInstanceOf[typings.twilio.twilioStrings.noanswer]
    
    inline def ringing: typings.twilio.twilioStrings.ringing = "ringing".asInstanceOf[typings.twilio.twilioStrings.ringing]
    
    inline def undialed: typings.twilio.twilioStrings.undialed = "undialed".asInstanceOf[typings.twilio.twilioStrings.undialed]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.carrier
    - typings.twilio.twilioStrings.sip
    - typings.twilio.twilioStrings.trunking_
    - typings.twilio.twilioStrings.client
  */
  trait CallSummaryCallType extends StObject
  object CallSummaryCallType {
    
    inline def carrier: typings.twilio.twilioStrings.carrier = "carrier".asInstanceOf[typings.twilio.twilioStrings.carrier]
    
    inline def client: typings.twilio.twilioStrings.client = "client".asInstanceOf[typings.twilio.twilioStrings.client]
    
    inline def sip: typings.twilio.twilioStrings.sip = "sip".asInstanceOf[typings.twilio.twilioStrings.sip]
    
    inline def trunking: trunking_ = "trunking".asInstanceOf[trunking_]
  }
  
  /**
    * Options to pass to fetch
    *
    * @property processingState - The processing_state
    */
  trait CallSummaryInstanceFetchOptions extends StObject {
    
    var processingState: js.UndefOr[CallSummaryProcessingState] = js.undefined
  }
  object CallSummaryInstanceFetchOptions {
    
    inline def apply(): CallSummaryInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallSummaryInstanceFetchOptions]
    }
    
    extension [Self <: CallSummaryInstanceFetchOptions](x: Self) {
      
      inline def setProcessingState(value: CallSummaryProcessingState): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
      
      inline def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
    }
  }
  
  @js.native
  trait CallSummaryListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CallSummaryContext = js.native
    
    /**
      * Constructs a call_summary
      */
    def get(): CallSummaryContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait CallSummaryPayload
    extends StObject
       with CallSummaryResource
       with TwilioResponsePayload
  object CallSummaryPayload {
    
    inline def apply(
      account_sid: String,
      annotation: js.Object,
      attributes: js.Object,
      call_sid: String,
      call_state: CallSummaryCallState,
      call_type: CallSummaryCallType,
      carrier_edge: js.Object,
      client_edge: js.Object,
      connect_duration: Double,
      created_time: js.Date,
      duration: Double,
      end_time: js.Date,
      first_page_uri: String,
      from: js.Object,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      processing_state: CallSummaryProcessingState,
      properties: js.Object,
      sdk_edge: js.Object,
      sip_edge: js.Object,
      start_time: js.Date,
      tags: js.Array[String],
      to: js.Object,
      trust: js.Object,
      uri: String,
      url: String
    ): CallSummaryPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], annotation = annotation.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], call_state = call_state.asInstanceOf[js.Any], call_type = call_type.asInstanceOf[js.Any], carrier_edge = carrier_edge.asInstanceOf[js.Any], client_edge = client_edge.asInstanceOf[js.Any], connect_duration = connect_duration.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], processing_state = processing_state.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sdk_edge = sdk_edge.asInstanceOf[js.Any], sip_edge = sip_edge.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], trust = trust.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallSummaryPayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.complete
    - typings.twilio.twilioStrings.partial
  */
  trait CallSummaryProcessingState extends StObject
  object CallSummaryProcessingState {
    
    inline def complete: typings.twilio.twilioStrings.complete = "complete".asInstanceOf[typings.twilio.twilioStrings.complete]
    
    inline def partial: typings.twilio.twilioStrings.partial = "partial".asInstanceOf[typings.twilio.twilioStrings.partial]
  }
  
  trait CallSummaryResource extends StObject {
    
    var account_sid: String
    
    var annotation: js.Object
    
    var attributes: js.Object
    
    var call_sid: String
    
    var call_state: CallSummaryCallState
    
    var call_type: CallSummaryCallType
    
    var carrier_edge: js.Object
    
    var client_edge: js.Object
    
    var connect_duration: Double
    
    var created_time: js.Date
    
    var duration: Double
    
    var end_time: js.Date
    
    var from: js.Object
    
    var processing_state: CallSummaryProcessingState
    
    var properties: js.Object
    
    var sdk_edge: js.Object
    
    var sip_edge: js.Object
    
    var start_time: js.Date
    
    var tags: js.Array[String]
    
    var to: js.Object
    
    var trust: js.Object
    
    var url: String
  }
  object CallSummaryResource {
    
    inline def apply(
      account_sid: String,
      annotation: js.Object,
      attributes: js.Object,
      call_sid: String,
      call_state: CallSummaryCallState,
      call_type: CallSummaryCallType,
      carrier_edge: js.Object,
      client_edge: js.Object,
      connect_duration: Double,
      created_time: js.Date,
      duration: Double,
      end_time: js.Date,
      from: js.Object,
      processing_state: CallSummaryProcessingState,
      properties: js.Object,
      sdk_edge: js.Object,
      sip_edge: js.Object,
      start_time: js.Date,
      tags: js.Array[String],
      to: js.Object,
      trust: js.Object,
      url: String
    ): CallSummaryResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], annotation = annotation.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], call_state = call_state.asInstanceOf[js.Any], call_type = call_type.asInstanceOf[js.Any], carrier_edge = carrier_edge.asInstanceOf[js.Any], client_edge = client_edge.asInstanceOf[js.Any], connect_duration = connect_duration.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], processing_state = processing_state.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sdk_edge = sdk_edge.asInstanceOf[js.Any], sip_edge = sip_edge.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], trust = trust.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallSummaryResource]
    }
    
    extension [Self <: CallSummaryResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAnnotation(value: js.Object): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_state(value: CallSummaryCallState): Self = StObject.set(x, "call_state", value.asInstanceOf[js.Any])
      
      inline def setCall_type(value: CallSummaryCallType): Self = StObject.set(x, "call_type", value.asInstanceOf[js.Any])
      
      inline def setCarrier_edge(value: js.Object): Self = StObject.set(x, "carrier_edge", value.asInstanceOf[js.Any])
      
      inline def setClient_edge(value: js.Object): Self = StObject.set(x, "client_edge", value.asInstanceOf[js.Any])
      
      inline def setConnect_duration(value: Double): Self = StObject.set(x, "connect_duration", value.asInstanceOf[js.Any])
      
      inline def setCreated_time(value: js.Date): Self = StObject.set(x, "created_time", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: js.Object): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setProcessing_state(value: CallSummaryProcessingState): Self = StObject.set(x, "processing_state", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSdk_edge(value: js.Object): Self = StObject.set(x, "sdk_edge", value.asInstanceOf[js.Any])
      
      inline def setSip_edge(value: js.Object): Self = StObject.set(x, "sip_edge", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: js.Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTo(value: js.Object): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setTrust(value: js.Object): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallSummarySolution extends StObject {
    
    var callSid: js.UndefOr[String] = js.undefined
  }
  object CallSummarySolution {
    
    inline def apply(): CallSummarySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallSummarySolution]
    }
    
    extension [Self <: CallSummarySolution](x: Self) {
      
      inline def setCallSid(value: String): Self = StObject.set(x, "callSid", value.asInstanceOf[js.Any])
      
      inline def setCallSidUndefined: Self = StObject.set(x, "callSid", js.undefined)
    }
  }
}
