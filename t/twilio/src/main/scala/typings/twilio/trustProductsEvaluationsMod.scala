package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trustProductsEvaluationsMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsEvaluations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsEvaluations", "TrustProductsEvaluationsContext")
  @js.native
  open class TrustProductsEvaluationsContext protected () extends StObject {
    /**
      * Initialize the TrustProductsEvaluationsContext
      *
      * @param version - Version of the resource
      * @param trustProductSid - The unique string that identifies the resource
      * @param sid - The unique string that identifies the Evaluation resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, trustProductSid: String, sid: String) = this()
    
    /**
      * fetch a TrustProductsEvaluationsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrustProductsEvaluationsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEvaluationsInstance, Any]
    ): js.Promise[TrustProductsEvaluationsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsEvaluations", "TrustProductsEvaluationsInstance")
  @js.native
  open class TrustProductsEvaluationsInstance protected () extends SerializableClass {
    /**
      * Initialize the TrustProductsEvaluationsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param trustProductSid - The unique string that identifies the resource
      * @param sid - The unique string that identifies the Evaluation resource
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      payload: TrustProductsEvaluationsPayload,
      trustProductSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: TrustProductsEvaluationsContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a TrustProductsEvaluationsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrustProductsEvaluationsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrustProductsEvaluationsInstance] = js.native
    
    var policySid: String = js.native
    
    var results: js.Array[js.Object] = js.native
    
    var sid: String = js.native
    
    var status: TrustProductsEvaluationsStatus = js.native
    
    var trustProductSid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the TrustProductsEvaluationsList
    *
    * @param version - Version of the resource
    * @param trustProductSid - The unique string that identifies the resource
    */
  inline def TrustProductsEvaluationsList(version: typings.twilio.trusthubV1Mod.^, trustProductSid: String): TrustProductsEvaluationsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TrustProductsEvaluationsList")(version.asInstanceOf[js.Any], trustProductSid.asInstanceOf[js.Any])).asInstanceOf[TrustProductsEvaluationsListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsEvaluations", "TrustProductsEvaluationsPage")
  @js.native
  open class TrustProductsEvaluationsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trusthubV1Mod.^, 
          TrustProductsEvaluationsPayload, 
          TrustProductsEvaluationsResource, 
          TrustProductsEvaluationsInstance
        ] {
    /**
      * Initialize the TrustProductsEvaluationsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TrustProductsEvaluationsSolution
    ) = this()
    
    /**
      * Build an instance of TrustProductsEvaluationsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TrustProductsEvaluationsPayload): TrustProductsEvaluationsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait TrustProductsEvaluationsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TrustProductsEvaluationsContext = js.native
    
    /**
      * create a TrustProductsEvaluationsInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: TrustProductsEvaluationsListInstanceCreateOptions): js.Promise[TrustProductsEvaluationsInstance] = js.native
    def create(
      opts: TrustProductsEvaluationsListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TrustProductsEvaluationsInstance, Any]
    ): js.Promise[TrustProductsEvaluationsInstance] = js.native
    
    /**
      * Streams TrustProductsEvaluationsInstance records from the API.
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
          /* item */ TrustProductsEvaluationsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TrustProductsEvaluationsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TrustProductsEvaluationsListInstanceEachOptions): Unit = js.native
    def each(
      opts: TrustProductsEvaluationsListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TrustProductsEvaluationsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a trust_products_evaluations
      *
      * @param sid - The unique string that identifies the Evaluation resource
      */
    def get(sid: String): TrustProductsEvaluationsContext = js.native
    
    /**
      * Retrieve a single target page of TrustProductsEvaluationsInstance records from
      * the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TrustProductsEvaluationsPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEvaluationsPage, Any]): js.Promise[TrustProductsEvaluationsPage] = js.native
    def getPage(targetUrl: String): js.Promise[TrustProductsEvaluationsPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEvaluationsPage, Any]
    ): js.Promise[TrustProductsEvaluationsPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEvaluationsPage, Any]
    ): js.Promise[TrustProductsEvaluationsPage] = js.native
    
    /**
      * Lists TrustProductsEvaluationsInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TrustProductsEvaluationsInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[TrustProductsEvaluationsInstance], 
          Any
        ]
    ): js.Promise[js.Array[TrustProductsEvaluationsInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[TrustProductsEvaluationsInstance], 
          Any
        ]
    ): js.Promise[js.Array[TrustProductsEvaluationsInstance]] = js.native
    def list(opts: TrustProductsEvaluationsListInstanceOptions): js.Promise[js.Array[TrustProductsEvaluationsInstance]] = js.native
    def list(
      opts: TrustProductsEvaluationsListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[TrustProductsEvaluationsInstance], 
          Any
        ]
    ): js.Promise[js.Array[TrustProductsEvaluationsInstance]] = js.native
    
    /**
      * Retrieve a single page of TrustProductsEvaluationsInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TrustProductsEvaluationsPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEvaluationsPage, Any]): js.Promise[TrustProductsEvaluationsPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEvaluationsPage, Any]
    ): js.Promise[TrustProductsEvaluationsPage] = js.native
    def page(opts: TrustProductsEvaluationsListInstancePageOptions): js.Promise[TrustProductsEvaluationsPage] = js.native
    def page(
      opts: TrustProductsEvaluationsListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEvaluationsPage, Any]
    ): js.Promise[TrustProductsEvaluationsPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property policySid - The unique string of a policy
    */
  trait TrustProductsEvaluationsListInstanceCreateOptions extends StObject {
    
    var policySid: String
  }
  object TrustProductsEvaluationsListInstanceCreateOptions {
    
    inline def apply(policySid: String): TrustProductsEvaluationsListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(policySid = policySid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsEvaluationsListInstanceCreateOptions]
    }
    
    extension [Self <: TrustProductsEvaluationsListInstanceCreateOptions](x: Self) {
      
      inline def setPolicySid(value: String): Self = StObject.set(x, "policySid", value.asInstanceOf[js.Any])
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
  trait TrustProductsEvaluationsListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TrustProductsEvaluationsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TrustProductsEvaluationsListInstanceEachOptions {
    
    inline def apply(): TrustProductsEvaluationsListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsEvaluationsListInstanceEachOptions]
    }
    
    extension [Self <: TrustProductsEvaluationsListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TrustProductsEvaluationsInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait TrustProductsEvaluationsListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TrustProductsEvaluationsListInstanceOptions {
    
    inline def apply(): TrustProductsEvaluationsListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsEvaluationsListInstanceOptions]
    }
    
    extension [Self <: TrustProductsEvaluationsListInstanceOptions](x: Self) {
      
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
  trait TrustProductsEvaluationsListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object TrustProductsEvaluationsListInstancePageOptions {
    
    inline def apply(): TrustProductsEvaluationsListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsEvaluationsListInstancePageOptions]
    }
    
    extension [Self <: TrustProductsEvaluationsListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait TrustProductsEvaluationsPayload
    extends StObject
       with TrustProductsEvaluationsResource
       with TwilioResponsePayload
  object TrustProductsEvaluationsPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      policy_sid: String,
      previous_page_uri: String,
      results: js.Array[js.Object],
      sid: String,
      status: TrustProductsEvaluationsStatus,
      trust_product_sid: String,
      uri: String,
      url: String
    ): TrustProductsEvaluationsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], policy_sid = policy_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], trust_product_sid = trust_product_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsEvaluationsPayload]
    }
  }
  
  trait TrustProductsEvaluationsResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var policy_sid: String
    
    var results: js.Array[js.Object]
    
    var sid: String
    
    var status: TrustProductsEvaluationsStatus
    
    var trust_product_sid: String
    
    var url: String
  }
  object TrustProductsEvaluationsResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      policy_sid: String,
      results: js.Array[js.Object],
      sid: String,
      status: TrustProductsEvaluationsStatus,
      trust_product_sid: String,
      url: String
    ): TrustProductsEvaluationsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], policy_sid = policy_sid.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], trust_product_sid = trust_product_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsEvaluationsResource]
    }
    
    extension [Self <: TrustProductsEvaluationsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setPolicy_sid(value: String): Self = StObject.set(x, "policy_sid", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[js.Object]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: js.Object*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: TrustProductsEvaluationsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTrust_product_sid(value: String): Self = StObject.set(x, "trust_product_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrustProductsEvaluationsSolution extends StObject {
    
    var trustProductSid: js.UndefOr[String] = js.undefined
  }
  object TrustProductsEvaluationsSolution {
    
    inline def apply(): TrustProductsEvaluationsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsEvaluationsSolution]
    }
    
    extension [Self <: TrustProductsEvaluationsSolution](x: Self) {
      
      inline def setTrustProductSid(value: String): Self = StObject.set(x, "trustProductSid", value.asInstanceOf[js.Any])
      
      inline def setTrustProductSidUndefined: Self = StObject.set(x, "trustProductSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.compliant
    - typings.twilio.twilioStrings.noncompliant
  */
  trait TrustProductsEvaluationsStatus extends StObject
  object TrustProductsEvaluationsStatus {
    
    inline def compliant: typings.twilio.twilioStrings.compliant = "compliant".asInstanceOf[typings.twilio.twilioStrings.compliant]
    
    inline def noncompliant: typings.twilio.twilioStrings.noncompliant = "noncompliant".asInstanceOf[typings.twilio.twilioStrings.noncompliant]
  }
}
