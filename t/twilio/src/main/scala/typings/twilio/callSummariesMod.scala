package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.trunking_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callSummariesMod {
  
  @JSImport("twilio/lib/rest/insights/v1/callSummaries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/callSummaries", "CallSummariesInstance")
  @js.native
  open class CallSummariesInstance protected () extends SerializableClass {
    /**
      * Initialize the CallSummariesContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.insightsV1Mod.^, payload: CallSummariesPayload) = this()
    
    var accountSid: String = js.native
    
    var attributes: Any = js.native
    
    var callSid: String = js.native
    
    var callState: CallSummariesCallState = js.native
    
    var callType: CallSummariesCallType = js.native
    
    var carrierEdge: Any = js.native
    
    var clientEdge: Any = js.native
    
    var connectDuration: Double = js.native
    
    var createdTime: js.Date = js.native
    
    var duration: Double = js.native
    
    var endTime: js.Date = js.native
    
    var from: Any = js.native
    
    var processingState: CallSummariesProcessingState = js.native
    
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
    * Initialize the CallSummariesList
    *
    * @param version - Version of the resource
    */
  inline def CallSummariesList(version: typings.twilio.insightsV1Mod.^): CallSummariesListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CallSummariesList")(version.asInstanceOf[js.Any]).asInstanceOf[CallSummariesListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/callSummaries", "CallSummariesPage")
  @js.native
  open class CallSummariesPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.insightsV1Mod.^, 
          CallSummariesPayload, 
          CallSummariesResource, 
          CallSummariesInstance
        ] {
    /**
      * Initialize the CallSummariesPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.insightsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CallSummariesSolution
    ) = this()
    
    /**
      * Build an instance of CallSummariesInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CallSummariesPayload): CallSummariesInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.outbound_api
    - typings.twilio.twilioStrings.outbound_dial
    - typings.twilio.twilioStrings.inbound
    - typings.twilio.twilioStrings.trunking_originating
    - typings.twilio.twilioStrings.trunking_terminating
  */
  trait CallSummariesCallDirection extends StObject
  object CallSummariesCallDirection {
    
    inline def inbound: typings.twilio.twilioStrings.inbound = "inbound".asInstanceOf[typings.twilio.twilioStrings.inbound]
    
    inline def outbound_api: typings.twilio.twilioStrings.outbound_api = "outbound_api".asInstanceOf[typings.twilio.twilioStrings.outbound_api]
    
    inline def outbound_dial: typings.twilio.twilioStrings.outbound_dial = "outbound_dial".asInstanceOf[typings.twilio.twilioStrings.outbound_dial]
    
    inline def trunking_originating: typings.twilio.twilioStrings.trunking_originating = "trunking_originating".asInstanceOf[typings.twilio.twilioStrings.trunking_originating]
    
    inline def trunking_terminating: typings.twilio.twilioStrings.trunking_terminating = "trunking_terminating".asInstanceOf[typings.twilio.twilioStrings.trunking_terminating]
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
  trait CallSummariesCallState extends StObject
  object CallSummariesCallState {
    
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
  trait CallSummariesCallType extends StObject
  object CallSummariesCallType {
    
    inline def carrier: typings.twilio.twilioStrings.carrier = "carrier".asInstanceOf[typings.twilio.twilioStrings.carrier]
    
    inline def client: typings.twilio.twilioStrings.client = "client".asInstanceOf[typings.twilio.twilioStrings.client]
    
    inline def sip: typings.twilio.twilioStrings.sip = "sip".asInstanceOf[typings.twilio.twilioStrings.sip]
    
    inline def trunking: trunking_ = "trunking".asInstanceOf[trunking_]
  }
  
  @js.native
  trait CallSummariesListInstance extends StObject {
    
    /**
      * Streams CallSummariesInstance records from the API.
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
          /* item */ CallSummariesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CallSummariesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CallSummariesListInstanceEachOptions): Unit = js.native
    def each(
      opts: CallSummariesListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CallSummariesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of CallSummariesInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CallSummariesPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CallSummariesPage, Any]): js.Promise[CallSummariesPage] = js.native
    def getPage(targetUrl: String): js.Promise[CallSummariesPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CallSummariesPage, Any]
    ): js.Promise[CallSummariesPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CallSummariesPage, Any]
    ): js.Promise[CallSummariesPage] = js.native
    
    /**
      * Lists CallSummariesInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CallSummariesInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CallSummariesInstance], Any]
    ): js.Promise[js.Array[CallSummariesInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CallSummariesInstance], Any]
    ): js.Promise[js.Array[CallSummariesInstance]] = js.native
    def list(opts: CallSummariesListInstanceOptions): js.Promise[js.Array[CallSummariesInstance]] = js.native
    def list(
      opts: CallSummariesListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CallSummariesInstance], Any]
    ): js.Promise[js.Array[CallSummariesInstance]] = js.native
    
    /**
      * Retrieve a single page of CallSummariesInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CallSummariesPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CallSummariesPage, Any]): js.Promise[CallSummariesPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CallSummariesPage, Any]
    ): js.Promise[CallSummariesPage] = js.native
    def page(opts: CallSummariesListInstancePageOptions): js.Promise[CallSummariesPage] = js.native
    def page(
      opts: CallSummariesListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CallSummariesPage, Any]
    ): js.Promise[CallSummariesPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to each
    *
    * @property abnormalSession - The abnormal_session
    * @property branded - The branded
    * @property callState - The call_state
    * @property callType - The call_type
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property direction - The direction
    * @property done - Function to be called upon completion of streaming
    * @property endTime - The end_time
    * @property from - The from
    * @property fromCarrier - The from_carrier
    * @property fromCountryCode - The from_country_code
    * @property hasTag - The has_tag
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
    * @property processingState - The processing_state
    * @property sortBy - The sort_by
    * @property startTime - The start_time
    * @property subaccount - The subaccount
    * @property to - The to
    * @property toCarrier - The to_carrier
    * @property toCountryCode - The to_country_code
    * @property verifiedCaller - The verified_caller
    */
  trait CallSummariesListInstanceEachOptions extends StObject {
    
    var abnormalSession: js.UndefOr[Boolean] = js.undefined
    
    var branded: js.UndefOr[Boolean] = js.undefined
    
    var callState: js.UndefOr[String] = js.undefined
    
    var callType: js.UndefOr[String] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CallSummariesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var endTime: js.UndefOr[String] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var fromCarrier: js.UndefOr[String] = js.undefined
    
    var fromCountryCode: js.UndefOr[String] = js.undefined
    
    var hasTag: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var processingState: js.UndefOr[CallSummariesProcessingStateRequest] = js.undefined
    
    var sortBy: js.UndefOr[CallSummariesSortBy] = js.undefined
    
    var startTime: js.UndefOr[String] = js.undefined
    
    var subaccount: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var toCarrier: js.UndefOr[String] = js.undefined
    
    var toCountryCode: js.UndefOr[String] = js.undefined
    
    var verifiedCaller: js.UndefOr[Boolean] = js.undefined
  }
  object CallSummariesListInstanceEachOptions {
    
    inline def apply(): CallSummariesListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallSummariesListInstanceEachOptions]
    }
    
    extension [Self <: CallSummariesListInstanceEachOptions](x: Self) {
      
      inline def setAbnormalSession(value: Boolean): Self = StObject.set(x, "abnormalSession", value.asInstanceOf[js.Any])
      
      inline def setAbnormalSessionUndefined: Self = StObject.set(x, "abnormalSession", js.undefined)
      
      inline def setBranded(value: Boolean): Self = StObject.set(x, "branded", value.asInstanceOf[js.Any])
      
      inline def setBrandedUndefined: Self = StObject.set(x, "branded", js.undefined)
      
      inline def setCallState(value: String): Self = StObject.set(x, "callState", value.asInstanceOf[js.Any])
      
      inline def setCallStateUndefined: Self = StObject.set(x, "callState", js.undefined)
      
      inline def setCallType(value: String): Self = StObject.set(x, "callType", value.asInstanceOf[js.Any])
      
      inline def setCallTypeUndefined: Self = StObject.set(x, "callType", js.undefined)
      
      inline def setCallback(
        value: (/* item */ CallSummariesInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromCarrier(value: String): Self = StObject.set(x, "fromCarrier", value.asInstanceOf[js.Any])
      
      inline def setFromCarrierUndefined: Self = StObject.set(x, "fromCarrier", js.undefined)
      
      inline def setFromCountryCode(value: String): Self = StObject.set(x, "fromCountryCode", value.asInstanceOf[js.Any])
      
      inline def setFromCountryCodeUndefined: Self = StObject.set(x, "fromCountryCode", js.undefined)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setHasTag(value: Boolean): Self = StObject.set(x, "hasTag", value.asInstanceOf[js.Any])
      
      inline def setHasTagUndefined: Self = StObject.set(x, "hasTag", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setProcessingState(value: CallSummariesProcessingStateRequest): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
      
      inline def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
      
      inline def setSortBy(value: CallSummariesSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
      
      inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToCarrier(value: String): Self = StObject.set(x, "toCarrier", value.asInstanceOf[js.Any])
      
      inline def setToCarrierUndefined: Self = StObject.set(x, "toCarrier", js.undefined)
      
      inline def setToCountryCode(value: String): Self = StObject.set(x, "toCountryCode", value.asInstanceOf[js.Any])
      
      inline def setToCountryCodeUndefined: Self = StObject.set(x, "toCountryCode", js.undefined)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setVerifiedCaller(value: Boolean): Self = StObject.set(x, "verifiedCaller", value.asInstanceOf[js.Any])
      
      inline def setVerifiedCallerUndefined: Self = StObject.set(x, "verifiedCaller", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property abnormalSession - The abnormal_session
    * @property branded - The branded
    * @property callState - The call_state
    * @property callType - The call_type
    * @property direction - The direction
    * @property endTime - The end_time
    * @property from - The from
    * @property fromCarrier - The from_carrier
    * @property fromCountryCode - The from_country_code
    * @property hasTag - The has_tag
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
    * @property processingState - The processing_state
    * @property sortBy - The sort_by
    * @property startTime - The start_time
    * @property subaccount - The subaccount
    * @property to - The to
    * @property toCarrier - The to_carrier
    * @property toCountryCode - The to_country_code
    * @property verifiedCaller - The verified_caller
    */
  trait CallSummariesListInstanceOptions extends StObject {
    
    var abnormalSession: js.UndefOr[Boolean] = js.undefined
    
    var branded: js.UndefOr[Boolean] = js.undefined
    
    var callState: js.UndefOr[String] = js.undefined
    
    var callType: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var endTime: js.UndefOr[String] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var fromCarrier: js.UndefOr[String] = js.undefined
    
    var fromCountryCode: js.UndefOr[String] = js.undefined
    
    var hasTag: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var processingState: js.UndefOr[CallSummariesProcessingStateRequest] = js.undefined
    
    var sortBy: js.UndefOr[CallSummariesSortBy] = js.undefined
    
    var startTime: js.UndefOr[String] = js.undefined
    
    var subaccount: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var toCarrier: js.UndefOr[String] = js.undefined
    
    var toCountryCode: js.UndefOr[String] = js.undefined
    
    var verifiedCaller: js.UndefOr[Boolean] = js.undefined
  }
  object CallSummariesListInstanceOptions {
    
    inline def apply(): CallSummariesListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallSummariesListInstanceOptions]
    }
    
    extension [Self <: CallSummariesListInstanceOptions](x: Self) {
      
      inline def setAbnormalSession(value: Boolean): Self = StObject.set(x, "abnormalSession", value.asInstanceOf[js.Any])
      
      inline def setAbnormalSessionUndefined: Self = StObject.set(x, "abnormalSession", js.undefined)
      
      inline def setBranded(value: Boolean): Self = StObject.set(x, "branded", value.asInstanceOf[js.Any])
      
      inline def setBrandedUndefined: Self = StObject.set(x, "branded", js.undefined)
      
      inline def setCallState(value: String): Self = StObject.set(x, "callState", value.asInstanceOf[js.Any])
      
      inline def setCallStateUndefined: Self = StObject.set(x, "callState", js.undefined)
      
      inline def setCallType(value: String): Self = StObject.set(x, "callType", value.asInstanceOf[js.Any])
      
      inline def setCallTypeUndefined: Self = StObject.set(x, "callType", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromCarrier(value: String): Self = StObject.set(x, "fromCarrier", value.asInstanceOf[js.Any])
      
      inline def setFromCarrierUndefined: Self = StObject.set(x, "fromCarrier", js.undefined)
      
      inline def setFromCountryCode(value: String): Self = StObject.set(x, "fromCountryCode", value.asInstanceOf[js.Any])
      
      inline def setFromCountryCodeUndefined: Self = StObject.set(x, "fromCountryCode", js.undefined)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setHasTag(value: Boolean): Self = StObject.set(x, "hasTag", value.asInstanceOf[js.Any])
      
      inline def setHasTagUndefined: Self = StObject.set(x, "hasTag", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setProcessingState(value: CallSummariesProcessingStateRequest): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
      
      inline def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
      
      inline def setSortBy(value: CallSummariesSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
      
      inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToCarrier(value: String): Self = StObject.set(x, "toCarrier", value.asInstanceOf[js.Any])
      
      inline def setToCarrierUndefined: Self = StObject.set(x, "toCarrier", js.undefined)
      
      inline def setToCountryCode(value: String): Self = StObject.set(x, "toCountryCode", value.asInstanceOf[js.Any])
      
      inline def setToCountryCodeUndefined: Self = StObject.set(x, "toCountryCode", js.undefined)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setVerifiedCaller(value: Boolean): Self = StObject.set(x, "verifiedCaller", value.asInstanceOf[js.Any])
      
      inline def setVerifiedCallerUndefined: Self = StObject.set(x, "verifiedCaller", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property abnormalSession - The abnormal_session
    * @property branded - The branded
    * @property callState - The call_state
    * @property callType - The call_type
    * @property direction - The direction
    * @property endTime - The end_time
    * @property from - The from
    * @property fromCarrier - The from_carrier
    * @property fromCountryCode - The from_country_code
    * @property hasTag - The has_tag
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property processingState - The processing_state
    * @property sortBy - The sort_by
    * @property startTime - The start_time
    * @property subaccount - The subaccount
    * @property to - The to
    * @property toCarrier - The to_carrier
    * @property toCountryCode - The to_country_code
    * @property verifiedCaller - The verified_caller
    */
  trait CallSummariesListInstancePageOptions extends StObject {
    
    var abnormalSession: js.UndefOr[Boolean] = js.undefined
    
    var branded: js.UndefOr[Boolean] = js.undefined
    
    var callState: js.UndefOr[String] = js.undefined
    
    var callType: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var endTime: js.UndefOr[String] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var fromCarrier: js.UndefOr[String] = js.undefined
    
    var fromCountryCode: js.UndefOr[String] = js.undefined
    
    var hasTag: js.UndefOr[Boolean] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var processingState: js.UndefOr[CallSummariesProcessingStateRequest] = js.undefined
    
    var sortBy: js.UndefOr[CallSummariesSortBy] = js.undefined
    
    var startTime: js.UndefOr[String] = js.undefined
    
    var subaccount: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var toCarrier: js.UndefOr[String] = js.undefined
    
    var toCountryCode: js.UndefOr[String] = js.undefined
    
    var verifiedCaller: js.UndefOr[Boolean] = js.undefined
  }
  object CallSummariesListInstancePageOptions {
    
    inline def apply(): CallSummariesListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallSummariesListInstancePageOptions]
    }
    
    extension [Self <: CallSummariesListInstancePageOptions](x: Self) {
      
      inline def setAbnormalSession(value: Boolean): Self = StObject.set(x, "abnormalSession", value.asInstanceOf[js.Any])
      
      inline def setAbnormalSessionUndefined: Self = StObject.set(x, "abnormalSession", js.undefined)
      
      inline def setBranded(value: Boolean): Self = StObject.set(x, "branded", value.asInstanceOf[js.Any])
      
      inline def setBrandedUndefined: Self = StObject.set(x, "branded", js.undefined)
      
      inline def setCallState(value: String): Self = StObject.set(x, "callState", value.asInstanceOf[js.Any])
      
      inline def setCallStateUndefined: Self = StObject.set(x, "callState", js.undefined)
      
      inline def setCallType(value: String): Self = StObject.set(x, "callType", value.asInstanceOf[js.Any])
      
      inline def setCallTypeUndefined: Self = StObject.set(x, "callType", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromCarrier(value: String): Self = StObject.set(x, "fromCarrier", value.asInstanceOf[js.Any])
      
      inline def setFromCarrierUndefined: Self = StObject.set(x, "fromCarrier", js.undefined)
      
      inline def setFromCountryCode(value: String): Self = StObject.set(x, "fromCountryCode", value.asInstanceOf[js.Any])
      
      inline def setFromCountryCodeUndefined: Self = StObject.set(x, "fromCountryCode", js.undefined)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setHasTag(value: Boolean): Self = StObject.set(x, "hasTag", value.asInstanceOf[js.Any])
      
      inline def setHasTagUndefined: Self = StObject.set(x, "hasTag", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setProcessingState(value: CallSummariesProcessingStateRequest): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
      
      inline def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
      
      inline def setSortBy(value: CallSummariesSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
      
      inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToCarrier(value: String): Self = StObject.set(x, "toCarrier", value.asInstanceOf[js.Any])
      
      inline def setToCarrierUndefined: Self = StObject.set(x, "toCarrier", js.undefined)
      
      inline def setToCountryCode(value: String): Self = StObject.set(x, "toCountryCode", value.asInstanceOf[js.Any])
      
      inline def setToCountryCodeUndefined: Self = StObject.set(x, "toCountryCode", js.undefined)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setVerifiedCaller(value: Boolean): Self = StObject.set(x, "verifiedCaller", value.asInstanceOf[js.Any])
      
      inline def setVerifiedCallerUndefined: Self = StObject.set(x, "verifiedCaller", js.undefined)
    }
  }
  
  trait CallSummariesPayload
    extends StObject
       with CallSummariesResource
       with TwilioResponsePayload
  object CallSummariesPayload {
    
    inline def apply(
      account_sid: String,
      attributes: js.Object,
      call_sid: String,
      call_state: CallSummariesCallState,
      call_type: CallSummariesCallType,
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
      processing_state: CallSummariesProcessingState,
      properties: js.Object,
      sdk_edge: js.Object,
      sip_edge: js.Object,
      start_time: js.Date,
      tags: js.Array[String],
      to: js.Object,
      trust: js.Object,
      uri: String,
      url: String
    ): CallSummariesPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], call_state = call_state.asInstanceOf[js.Any], call_type = call_type.asInstanceOf[js.Any], carrier_edge = carrier_edge.asInstanceOf[js.Any], client_edge = client_edge.asInstanceOf[js.Any], connect_duration = connect_duration.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], processing_state = processing_state.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sdk_edge = sdk_edge.asInstanceOf[js.Any], sip_edge = sip_edge.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], trust = trust.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallSummariesPayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.complete
    - typings.twilio.twilioStrings.partial
  */
  trait CallSummariesProcessingState extends StObject
  object CallSummariesProcessingState {
    
    inline def complete: typings.twilio.twilioStrings.complete = "complete".asInstanceOf[typings.twilio.twilioStrings.complete]
    
    inline def partial: typings.twilio.twilioStrings.partial = "partial".asInstanceOf[typings.twilio.twilioStrings.partial]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.started
    - typings.twilio.twilioStrings.partial
    - typings.twilio.twilioStrings.all
  */
  trait CallSummariesProcessingStateRequest extends StObject
  object CallSummariesProcessingStateRequest {
    
    inline def all: typings.twilio.twilioStrings.all = "all".asInstanceOf[typings.twilio.twilioStrings.all]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def partial: typings.twilio.twilioStrings.partial = "partial".asInstanceOf[typings.twilio.twilioStrings.partial]
    
    inline def started: typings.twilio.twilioStrings.started = "started".asInstanceOf[typings.twilio.twilioStrings.started]
  }
  
  trait CallSummariesResource extends StObject {
    
    var account_sid: String
    
    var attributes: js.Object
    
    var call_sid: String
    
    var call_state: CallSummariesCallState
    
    var call_type: CallSummariesCallType
    
    var carrier_edge: js.Object
    
    var client_edge: js.Object
    
    var connect_duration: Double
    
    var created_time: js.Date
    
    var duration: Double
    
    var end_time: js.Date
    
    var from: js.Object
    
    var processing_state: CallSummariesProcessingState
    
    var properties: js.Object
    
    var sdk_edge: js.Object
    
    var sip_edge: js.Object
    
    var start_time: js.Date
    
    var tags: js.Array[String]
    
    var to: js.Object
    
    var trust: js.Object
    
    var url: String
  }
  object CallSummariesResource {
    
    inline def apply(
      account_sid: String,
      attributes: js.Object,
      call_sid: String,
      call_state: CallSummariesCallState,
      call_type: CallSummariesCallType,
      carrier_edge: js.Object,
      client_edge: js.Object,
      connect_duration: Double,
      created_time: js.Date,
      duration: Double,
      end_time: js.Date,
      from: js.Object,
      processing_state: CallSummariesProcessingState,
      properties: js.Object,
      sdk_edge: js.Object,
      sip_edge: js.Object,
      start_time: js.Date,
      tags: js.Array[String],
      to: js.Object,
      trust: js.Object,
      url: String
    ): CallSummariesResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], call_state = call_state.asInstanceOf[js.Any], call_type = call_type.asInstanceOf[js.Any], carrier_edge = carrier_edge.asInstanceOf[js.Any], client_edge = client_edge.asInstanceOf[js.Any], connect_duration = connect_duration.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], processing_state = processing_state.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sdk_edge = sdk_edge.asInstanceOf[js.Any], sip_edge = sip_edge.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], trust = trust.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallSummariesResource]
    }
    
    extension [Self <: CallSummariesResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_state(value: CallSummariesCallState): Self = StObject.set(x, "call_state", value.asInstanceOf[js.Any])
      
      inline def setCall_type(value: CallSummariesCallType): Self = StObject.set(x, "call_type", value.asInstanceOf[js.Any])
      
      inline def setCarrier_edge(value: js.Object): Self = StObject.set(x, "carrier_edge", value.asInstanceOf[js.Any])
      
      inline def setClient_edge(value: js.Object): Self = StObject.set(x, "client_edge", value.asInstanceOf[js.Any])
      
      inline def setConnect_duration(value: Double): Self = StObject.set(x, "connect_duration", value.asInstanceOf[js.Any])
      
      inline def setCreated_time(value: js.Date): Self = StObject.set(x, "created_time", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: js.Object): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setProcessing_state(value: CallSummariesProcessingState): Self = StObject.set(x, "processing_state", value.asInstanceOf[js.Any])
      
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
  
  trait CallSummariesSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.start_time
    - typings.twilio.twilioStrings.end_time
  */
  trait CallSummariesSortBy extends StObject
  object CallSummariesSortBy {
    
    inline def end_time: typings.twilio.twilioStrings.end_time = "end_time".asInstanceOf[typings.twilio.twilioStrings.end_time]
    
    inline def start_time: typings.twilio.twilioStrings.start_time = "start_time".asInstanceOf[typings.twilio.twilioStrings.start_time]
  }
}
