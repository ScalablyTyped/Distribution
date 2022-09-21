package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evaluationMod {
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/evaluation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/evaluation", "EvaluationContext")
  @js.native
  open class EvaluationContext protected () extends StObject {
    /**
      * Initialize the EvaluationContext
      *
      * @param version - Version of the resource
      * @param bundleSid - The unique string that identifies the resource
      * @param sid - The unique string that identifies the Evaluation resource
      */
    def this(version: typings.twilio.numbersV2Mod.^, bundleSid: String, sid: String) = this()
    
    /**
      * fetch a EvaluationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EvaluationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ EvaluationInstance, Any]): js.Promise[EvaluationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/evaluation", "EvaluationInstance")
  @js.native
  open class EvaluationInstance protected () extends SerializableClass {
    /**
      * Initialize the EvaluationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param bundleSid - The unique string that identifies the resource
      * @param sid - The unique string that identifies the Evaluation resource
      */
    def this(version: typings.twilio.numbersV2Mod.^, payload: EvaluationPayload, bundleSid: String, sid: String) = this()
    
    /* private */ var _proxy: EvaluationContext = js.native
    
    var accountSid: String = js.native
    
    var bundleSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a EvaluationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EvaluationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EvaluationInstance] = js.native
    
    var regulationSid: String = js.native
    
    var results: js.Array[js.Object] = js.native
    
    var sid: String = js.native
    
    var status: EvaluationStatus = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the EvaluationList
    *
    * @param version - Version of the resource
    * @param bundleSid - The unique string that identifies the resource
    */
  inline def EvaluationList(version: typings.twilio.numbersV2Mod.^, bundleSid: String): EvaluationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("EvaluationList")(version.asInstanceOf[js.Any], bundleSid.asInstanceOf[js.Any])).asInstanceOf[EvaluationListInstance]
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/evaluation", "EvaluationPage")
  @js.native
  open class EvaluationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.numbersV2Mod.^, 
          EvaluationPayload, 
          EvaluationResource, 
          EvaluationInstance
        ] {
    /**
      * Initialize the EvaluationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.numbersV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: EvaluationSolution
    ) = this()
    
    /**
      * Build an instance of EvaluationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: EvaluationPayload): EvaluationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait EvaluationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): EvaluationContext = js.native
    
    /**
      * create a EvaluationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[EvaluationInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ EvaluationInstance, Any]): js.Promise[EvaluationInstance] = js.native
    
    /**
      * Streams EvaluationInstance records from the API.
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
          /* item */ EvaluationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ EvaluationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: EvaluationListInstanceEachOptions): Unit = js.native
    def each(
      opts: EvaluationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ EvaluationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a evaluation
      *
      * @param sid - The unique string that identifies the Evaluation resource
      */
    def get(sid: String): EvaluationContext = js.native
    
    /**
      * Retrieve a single target page of EvaluationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[EvaluationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ EvaluationPage, Any]): js.Promise[EvaluationPage] = js.native
    def getPage(targetUrl: String): js.Promise[EvaluationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EvaluationPage, Any]
    ): js.Promise[EvaluationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EvaluationPage, Any]
    ): js.Promise[EvaluationPage] = js.native
    
    /**
      * Lists EvaluationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[EvaluationInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EvaluationInstance], Any]): js.Promise[js.Array[EvaluationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EvaluationInstance], Any]
    ): js.Promise[js.Array[EvaluationInstance]] = js.native
    def list(opts: EvaluationListInstanceOptions): js.Promise[js.Array[EvaluationInstance]] = js.native
    def list(
      opts: EvaluationListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EvaluationInstance], Any]
    ): js.Promise[js.Array[EvaluationInstance]] = js.native
    
    /**
      * Retrieve a single page of EvaluationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[EvaluationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ EvaluationPage, Any]): js.Promise[EvaluationPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EvaluationPage, Any]): js.Promise[EvaluationPage] = js.native
    def page(opts: EvaluationListInstancePageOptions): js.Promise[EvaluationPage] = js.native
    def page(
      opts: EvaluationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EvaluationPage, Any]
    ): js.Promise[EvaluationPage] = js.native
    
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
    */
  trait EvaluationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ EvaluationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EvaluationListInstanceEachOptions {
    
    inline def apply(): EvaluationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EvaluationListInstanceEachOptions]
    }
    
    extension [Self <: EvaluationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ EvaluationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait EvaluationListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EvaluationListInstanceOptions {
    
    inline def apply(): EvaluationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EvaluationListInstanceOptions]
    }
    
    extension [Self <: EvaluationListInstanceOptions](x: Self) {
      
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
  trait EvaluationListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object EvaluationListInstancePageOptions {
    
    inline def apply(): EvaluationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EvaluationListInstancePageOptions]
    }
    
    extension [Self <: EvaluationListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait EvaluationPayload
    extends StObject
       with EvaluationResource
       with TwilioResponsePayload
  object EvaluationPayload {
    
    inline def apply(
      account_sid: String,
      bundle_sid: String,
      date_created: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      regulation_sid: String,
      results: js.Array[js.Object],
      sid: String,
      status: EvaluationStatus,
      uri: String,
      url: String
    ): EvaluationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], bundle_sid = bundle_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], regulation_sid = regulation_sid.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EvaluationPayload]
    }
  }
  
  trait EvaluationResource extends StObject {
    
    var account_sid: String
    
    var bundle_sid: String
    
    var date_created: js.Date
    
    var regulation_sid: String
    
    var results: js.Array[js.Object]
    
    var sid: String
    
    var status: EvaluationStatus
    
    var url: String
  }
  object EvaluationResource {
    
    inline def apply(
      account_sid: String,
      bundle_sid: String,
      date_created: js.Date,
      regulation_sid: String,
      results: js.Array[js.Object],
      sid: String,
      status: EvaluationStatus,
      url: String
    ): EvaluationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], bundle_sid = bundle_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], regulation_sid = regulation_sid.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EvaluationResource]
    }
    
    extension [Self <: EvaluationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBundle_sid(value: String): Self = StObject.set(x, "bundle_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setRegulation_sid(value: String): Self = StObject.set(x, "regulation_sid", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[js.Object]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: js.Object*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: EvaluationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EvaluationSolution extends StObject {
    
    var bundleSid: js.UndefOr[String] = js.undefined
  }
  object EvaluationSolution {
    
    inline def apply(): EvaluationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EvaluationSolution]
    }
    
    extension [Self <: EvaluationSolution](x: Self) {
      
      inline def setBundleSid(value: String): Self = StObject.set(x, "bundleSid", value.asInstanceOf[js.Any])
      
      inline def setBundleSidUndefined: Self = StObject.set(x, "bundleSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.compliant
    - typings.twilio.twilioStrings.noncompliant
  */
  trait EvaluationStatus extends StObject
  object EvaluationStatus {
    
    inline def compliant: typings.twilio.twilioStrings.compliant = "compliant".asInstanceOf[typings.twilio.twilioStrings.compliant]
    
    inline def noncompliant: typings.twilio.twilioStrings.noncompliant = "noncompliant".asInstanceOf[typings.twilio.twilioStrings.noncompliant]
  }
}
