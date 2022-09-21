package typings.twilio

import typings.twilio.anon.To
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verificationAttemptMod {
  
  @JSImport("twilio/lib/rest/verify/v2/verificationAttempt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/verificationAttempt", "VerificationAttemptContext")
  @js.native
  open class VerificationAttemptContext protected () extends StObject {
    /**
      * Initialize the VerificationAttemptContext
      *
      * @param version - Version of the resource
      * @param sid - Verification Attempt Sid.
      */
    def this(version: typings.twilio.verifyV2Mod.^, sid: String) = this()
    
    /**
      * fetch a VerificationAttemptInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[VerificationAttemptInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationAttemptInstance, Any]): js.Promise[VerificationAttemptInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/verificationAttempt", "VerificationAttemptInstance")
  @js.native
  open class VerificationAttemptInstance protected () extends SerializableClass {
    /**
      * Initialize the VerificationAttemptContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - Verification Attempt Sid.
      */
    def this(version: typings.twilio.verifyV2Mod.^, payload: VerificationAttemptPayload, sid: String) = this()
    
    /* private */ var _proxy: VerificationAttemptContext = js.native
    
    var accountSid: String = js.native
    
    var channel: VerificationAttemptChannels = js.native
    
    var channelData: Any = js.native
    
    var conversionStatus: VerificationAttemptConversionStatus = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a VerificationAttemptInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[VerificationAttemptInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[VerificationAttemptInstance] = js.native
    
    var price: Any = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
    
    var verificationSid: String = js.native
  }
  
  /**
    * Initialize the VerificationAttemptList
    *
    * @param version - Version of the resource
    */
  inline def VerificationAttemptList(version: typings.twilio.verifyV2Mod.^): VerificationAttemptListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("VerificationAttemptList")(version.asInstanceOf[js.Any]).asInstanceOf[VerificationAttemptListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/verificationAttempt", "VerificationAttemptPage")
  @js.native
  open class VerificationAttemptPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.verifyV2Mod.^, 
          VerificationAttemptPayload, 
          VerificationAttemptResource, 
          VerificationAttemptInstance
        ] {
    /**
      * Initialize the VerificationAttemptPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: VerificationAttemptSolution
    ) = this()
    
    /**
      * Build an instance of VerificationAttemptInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: VerificationAttemptPayload): VerificationAttemptInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.confirmed
    - typings.twilio.twilioStrings.unconfirmed
    - typings.twilio.twilioStrings.expired
  */
  trait VerificationAttemptAttemptStatus extends StObject
  object VerificationAttemptAttemptStatus {
    
    inline def confirmed: typings.twilio.twilioStrings.confirmed = "confirmed".asInstanceOf[typings.twilio.twilioStrings.confirmed]
    
    inline def expired: typings.twilio.twilioStrings.expired = "expired".asInstanceOf[typings.twilio.twilioStrings.expired]
    
    inline def unconfirmed: typings.twilio.twilioStrings.unconfirmed = "unconfirmed".asInstanceOf[typings.twilio.twilioStrings.unconfirmed]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.queued
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.busy
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.`no-answer`
    - typings.twilio.twilioStrings.ringing
    - typings.twilio.twilioStrings.canceled
  */
  trait VerificationAttemptCallStatus extends StObject
  object VerificationAttemptCallStatus {
    
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
    - typings.twilio.twilioStrings.sms
    - typings.twilio.twilioStrings.call
    - typings.twilio.twilioStrings.email
    - typings.twilio.twilioStrings.whatsapp
  */
  trait VerificationAttemptChannels extends StObject
  object VerificationAttemptChannels {
    
    inline def call: typings.twilio.twilioStrings.call = "call".asInstanceOf[typings.twilio.twilioStrings.call]
    
    inline def email: typings.twilio.twilioStrings.email = "email".asInstanceOf[typings.twilio.twilioStrings.email]
    
    inline def sms: typings.twilio.twilioStrings.sms = "sms".asInstanceOf[typings.twilio.twilioStrings.sms]
    
    inline def whatsapp: typings.twilio.twilioStrings.whatsapp = "whatsapp".asInstanceOf[typings.twilio.twilioStrings.whatsapp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.converted
    - typings.twilio.twilioStrings.unconverted
  */
  trait VerificationAttemptConversionStatus extends StObject
  object VerificationAttemptConversionStatus {
    
    inline def converted: typings.twilio.twilioStrings.converted = "converted".asInstanceOf[typings.twilio.twilioStrings.converted]
    
    inline def unconverted: typings.twilio.twilioStrings.unconverted = "unconverted".asInstanceOf[typings.twilio.twilioStrings.unconverted]
  }
  
  @js.native
  trait VerificationAttemptListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): VerificationAttemptContext = js.native
    
    /**
      * Streams VerificationAttemptInstance records from the API.
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
          /* item */ VerificationAttemptInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ VerificationAttemptInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: VerificationAttemptListInstanceEachOptions): Unit = js.native
    def each(
      opts: VerificationAttemptListInstanceEachOptions,
      callback: js.Function2[
          /* item */ VerificationAttemptInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a verification_attempt
      *
      * @param sid - Verification Attempt Sid.
      */
    def get(sid: String): VerificationAttemptContext = js.native
    
    /**
      * Retrieve a single target page of VerificationAttemptInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[VerificationAttemptPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationAttemptPage, Any]): js.Promise[VerificationAttemptPage] = js.native
    def getPage(targetUrl: String): js.Promise[VerificationAttemptPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationAttemptPage, Any]
    ): js.Promise[VerificationAttemptPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationAttemptPage, Any]
    ): js.Promise[VerificationAttemptPage] = js.native
    
    /**
      * Lists VerificationAttemptInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[VerificationAttemptInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[VerificationAttemptInstance], Any]
    ): js.Promise[js.Array[VerificationAttemptInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[VerificationAttemptInstance], Any]
    ): js.Promise[js.Array[VerificationAttemptInstance]] = js.native
    def list(opts: VerificationAttemptListInstanceOptions): js.Promise[js.Array[VerificationAttemptInstance]] = js.native
    def list(
      opts: VerificationAttemptListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[VerificationAttemptInstance], Any]
    ): js.Promise[js.Array[VerificationAttemptInstance]] = js.native
    
    /**
      * Retrieve a single page of VerificationAttemptInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[VerificationAttemptPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationAttemptPage, Any]): js.Promise[VerificationAttemptPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationAttemptPage, Any]
    ): js.Promise[VerificationAttemptPage] = js.native
    def page(opts: VerificationAttemptListInstancePageOptions): js.Promise[VerificationAttemptPage] = js.native
    def page(
      opts: VerificationAttemptListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationAttemptPage, Any]
    ): js.Promise[VerificationAttemptPage] = js.native
    
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
    * @property channel - Filter verification attempts by communication channel.
    * @property channelData.to - Filters by destination of the verification attempt.
    * @property country - Filter verification attempts by destination country.
    * @property dateCreatedAfter - Filter verification attempts after this date.
    * @property dateCreatedBefore - Filter verification attempts before this date.
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
    * @property status - Filter verification attempts by conversion status.
    * @property verificationSid - Filter attempts by verification.
    * @property verifyServiceSid - Filter verification attempts by verify service.
    */
  trait VerificationAttemptListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ VerificationAttemptInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var channel: js.UndefOr[VerificationAttemptChannels] = js.undefined
    
    var channelData: js.UndefOr[To] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[VerificationAttemptConversionStatus] = js.undefined
    
    var verificationSid: js.UndefOr[String] = js.undefined
    
    var verifyServiceSid: js.UndefOr[String] = js.undefined
  }
  object VerificationAttemptListInstanceEachOptions {
    
    inline def apply(): VerificationAttemptListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerificationAttemptListInstanceEachOptions]
    }
    
    extension [Self <: VerificationAttemptListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ VerificationAttemptInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChannel(value: VerificationAttemptChannels): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelData(value: To): Self = StObject.set(x, "channelData", value.asInstanceOf[js.Any])
      
      inline def setChannelDataUndefined: Self = StObject.set(x, "channelData", js.undefined)
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: VerificationAttemptConversionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setVerificationSid(value: String): Self = StObject.set(x, "verificationSid", value.asInstanceOf[js.Any])
      
      inline def setVerificationSidUndefined: Self = StObject.set(x, "verificationSid", js.undefined)
      
      inline def setVerifyServiceSid(value: String): Self = StObject.set(x, "verifyServiceSid", value.asInstanceOf[js.Any])
      
      inline def setVerifyServiceSidUndefined: Self = StObject.set(x, "verifyServiceSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property channel - Filter verification attempts by communication channel.
    * @property channelData.to - Filters by destination of the verification attempt.
    * @property country - Filter verification attempts by destination country.
    * @property dateCreatedAfter - Filter verification attempts after this date.
    * @property dateCreatedBefore - Filter verification attempts before this date.
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
    * @property status - Filter verification attempts by conversion status.
    * @property verificationSid - Filter attempts by verification.
    * @property verifyServiceSid - Filter verification attempts by verify service.
    */
  trait VerificationAttemptListInstanceOptions extends StObject {
    
    var channel: js.UndefOr[VerificationAttemptChannels] = js.undefined
    
    var channelData: js.UndefOr[To] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[VerificationAttemptConversionStatus] = js.undefined
    
    var verificationSid: js.UndefOr[String] = js.undefined
    
    var verifyServiceSid: js.UndefOr[String] = js.undefined
  }
  object VerificationAttemptListInstanceOptions {
    
    inline def apply(): VerificationAttemptListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerificationAttemptListInstanceOptions]
    }
    
    extension [Self <: VerificationAttemptListInstanceOptions](x: Self) {
      
      inline def setChannel(value: VerificationAttemptChannels): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelData(value: To): Self = StObject.set(x, "channelData", value.asInstanceOf[js.Any])
      
      inline def setChannelDataUndefined: Self = StObject.set(x, "channelData", js.undefined)
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: VerificationAttemptConversionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setVerificationSid(value: String): Self = StObject.set(x, "verificationSid", value.asInstanceOf[js.Any])
      
      inline def setVerificationSidUndefined: Self = StObject.set(x, "verificationSid", js.undefined)
      
      inline def setVerifyServiceSid(value: String): Self = StObject.set(x, "verifyServiceSid", value.asInstanceOf[js.Any])
      
      inline def setVerifyServiceSidUndefined: Self = StObject.set(x, "verifyServiceSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property channel - Filter verification attempts by communication channel.
    * @property channelData.to - Filters by destination of the verification attempt.
    * @property country - Filter verification attempts by destination country.
    * @property dateCreatedAfter - Filter verification attempts after this date.
    * @property dateCreatedBefore - Filter verification attempts before this date.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - Filter verification attempts by conversion status.
    * @property verificationSid - Filter attempts by verification.
    * @property verifyServiceSid - Filter verification attempts by verify service.
    */
  trait VerificationAttemptListInstancePageOptions extends StObject {
    
    var channel: js.UndefOr[VerificationAttemptChannels] = js.undefined
    
    var channelData: js.UndefOr[To] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[VerificationAttemptConversionStatus] = js.undefined
    
    var verificationSid: js.UndefOr[String] = js.undefined
    
    var verifyServiceSid: js.UndefOr[String] = js.undefined
  }
  object VerificationAttemptListInstancePageOptions {
    
    inline def apply(): VerificationAttemptListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerificationAttemptListInstancePageOptions]
    }
    
    extension [Self <: VerificationAttemptListInstancePageOptions](x: Self) {
      
      inline def setChannel(value: VerificationAttemptChannels): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelData(value: To): Self = StObject.set(x, "channelData", value.asInstanceOf[js.Any])
      
      inline def setChannelDataUndefined: Self = StObject.set(x, "channelData", js.undefined)
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: VerificationAttemptConversionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setVerificationSid(value: String): Self = StObject.set(x, "verificationSid", value.asInstanceOf[js.Any])
      
      inline def setVerificationSidUndefined: Self = StObject.set(x, "verificationSid", js.undefined)
      
      inline def setVerifyServiceSid(value: String): Self = StObject.set(x, "verifyServiceSid", value.asInstanceOf[js.Any])
      
      inline def setVerifyServiceSidUndefined: Self = StObject.set(x, "verifyServiceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.queued
    - typings.twilio.twilioStrings.sending
    - typings.twilio.twilioStrings.sent
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.delivered
    - typings.twilio.twilioStrings.undelivered
    - typings.twilio.twilioStrings.receiving
    - typings.twilio.twilioStrings.received
    - typings.twilio.twilioStrings.accepted
    - typings.twilio.twilioStrings.scheduled
    - typings.twilio.twilioStrings.read
    - typings.twilio.twilioStrings.partially_delivered
    - typings.twilio.twilioStrings.canceled
  */
  trait VerificationAttemptMessageStatus extends StObject
  object VerificationAttemptMessageStatus {
    
    inline def accepted: typings.twilio.twilioStrings.accepted = "accepted".asInstanceOf[typings.twilio.twilioStrings.accepted]
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def delivered: typings.twilio.twilioStrings.delivered = "delivered".asInstanceOf[typings.twilio.twilioStrings.delivered]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def partially_delivered: typings.twilio.twilioStrings.partially_delivered = "partially_delivered".asInstanceOf[typings.twilio.twilioStrings.partially_delivered]
    
    inline def queued: typings.twilio.twilioStrings.queued = "queued".asInstanceOf[typings.twilio.twilioStrings.queued]
    
    inline def read: typings.twilio.twilioStrings.read = "read".asInstanceOf[typings.twilio.twilioStrings.read]
    
    inline def received: typings.twilio.twilioStrings.received = "received".asInstanceOf[typings.twilio.twilioStrings.received]
    
    inline def receiving: typings.twilio.twilioStrings.receiving = "receiving".asInstanceOf[typings.twilio.twilioStrings.receiving]
    
    inline def scheduled: typings.twilio.twilioStrings.scheduled = "scheduled".asInstanceOf[typings.twilio.twilioStrings.scheduled]
    
    inline def sending: typings.twilio.twilioStrings.sending = "sending".asInstanceOf[typings.twilio.twilioStrings.sending]
    
    inline def sent: typings.twilio.twilioStrings.sent = "sent".asInstanceOf[typings.twilio.twilioStrings.sent]
    
    inline def undelivered: typings.twilio.twilioStrings.undelivered = "undelivered".asInstanceOf[typings.twilio.twilioStrings.undelivered]
  }
  
  trait VerificationAttemptPayload
    extends StObject
       with VerificationAttemptResource
       with TwilioResponsePayload
  object VerificationAttemptPayload {
    
    inline def apply(
      account_sid: String,
      channel: VerificationAttemptChannels,
      channel_data: js.Object,
      conversion_status: VerificationAttemptConversionStatus,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      price: js.Object,
      service_sid: String,
      sid: String,
      uri: String,
      url: String,
      verification_sid: String
    ): VerificationAttemptPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], channel_data = channel_data.asInstanceOf[js.Any], conversion_status = conversion_status.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification_sid = verification_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationAttemptPayload]
    }
  }
  
  trait VerificationAttemptResource extends StObject {
    
    var account_sid: String
    
    var channel: VerificationAttemptChannels
    
    var channel_data: js.Object
    
    var conversion_status: VerificationAttemptConversionStatus
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var price: js.Object
    
    var service_sid: String
    
    var sid: String
    
    var url: String
    
    var verification_sid: String
  }
  object VerificationAttemptResource {
    
    inline def apply(
      account_sid: String,
      channel: VerificationAttemptChannels,
      channel_data: js.Object,
      conversion_status: VerificationAttemptConversionStatus,
      date_created: js.Date,
      date_updated: js.Date,
      price: js.Object,
      service_sid: String,
      sid: String,
      url: String,
      verification_sid: String
    ): VerificationAttemptResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], channel_data = channel_data.asInstanceOf[js.Any], conversion_status = conversion_status.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification_sid = verification_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationAttemptResource]
    }
    
    extension [Self <: VerificationAttemptResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: VerificationAttemptChannels): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannel_data(value: js.Object): Self = StObject.set(x, "channel_data", value.asInstanceOf[js.Any])
      
      inline def setConversion_status(value: VerificationAttemptConversionStatus): Self = StObject.set(x, "conversion_status", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: js.Object): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVerification_sid(value: String): Self = StObject.set(x, "verification_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerificationAttemptSolution extends StObject
}
