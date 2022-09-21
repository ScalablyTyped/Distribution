package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customerProfilesEvaluationsMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesEvaluations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesEvaluations", "CustomerProfilesEvaluationsContext")
  @js.native
  open class CustomerProfilesEvaluationsContext protected () extends StObject {
    /**
      * Initialize the CustomerProfilesEvaluationsContext
      *
      * @param version - Version of the resource
      * @param customerProfileSid - The unique string that identifies the resource
      * @param sid - The unique string that identifies the Evaluation resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, customerProfileSid: String, sid: String) = this()
    
    /**
      * fetch a CustomerProfilesEvaluationsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CustomerProfilesEvaluationsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEvaluationsInstance, Any]
    ): js.Promise[CustomerProfilesEvaluationsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesEvaluations", "CustomerProfilesEvaluationsInstance")
  @js.native
  open class CustomerProfilesEvaluationsInstance protected () extends SerializableClass {
    /**
      * Initialize the CustomerProfilesEvaluationsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param customerProfileSid - The unique string that identifies the resource
      * @param sid - The unique string that identifies the Evaluation resource
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      payload: CustomerProfilesEvaluationsPayload,
      customerProfileSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: CustomerProfilesEvaluationsContext = js.native
    
    var accountSid: String = js.native
    
    var customerProfileSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a CustomerProfilesEvaluationsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CustomerProfilesEvaluationsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CustomerProfilesEvaluationsInstance] = js.native
    
    var policySid: String = js.native
    
    var results: js.Array[js.Object] = js.native
    
    var sid: String = js.native
    
    var status: CustomerProfilesEvaluationsStatus = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CustomerProfilesEvaluationsList
    *
    * @param version - Version of the resource
    * @param customerProfileSid - The unique string that identifies the resource
    */
  inline def CustomerProfilesEvaluationsList(version: typings.twilio.trusthubV1Mod.^, customerProfileSid: String): CustomerProfilesEvaluationsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("CustomerProfilesEvaluationsList")(version.asInstanceOf[js.Any], customerProfileSid.asInstanceOf[js.Any])).asInstanceOf[CustomerProfilesEvaluationsListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesEvaluations", "CustomerProfilesEvaluationsPage")
  @js.native
  open class CustomerProfilesEvaluationsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trusthubV1Mod.^, 
          CustomerProfilesEvaluationsPayload, 
          CustomerProfilesEvaluationsResource, 
          CustomerProfilesEvaluationsInstance
        ] {
    /**
      * Initialize the CustomerProfilesEvaluationsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CustomerProfilesEvaluationsSolution
    ) = this()
    
    /**
      * Build an instance of CustomerProfilesEvaluationsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CustomerProfilesEvaluationsPayload): CustomerProfilesEvaluationsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait CustomerProfilesEvaluationsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CustomerProfilesEvaluationsContext = js.native
    
    /**
      * create a CustomerProfilesEvaluationsInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CustomerProfilesEvaluationsListInstanceCreateOptions): js.Promise[CustomerProfilesEvaluationsInstance] = js.native
    def create(
      opts: CustomerProfilesEvaluationsListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ CustomerProfilesEvaluationsInstance, Any]
    ): js.Promise[CustomerProfilesEvaluationsInstance] = js.native
    
    /**
      * Streams CustomerProfilesEvaluationsInstance records from the API.
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
          /* item */ CustomerProfilesEvaluationsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CustomerProfilesEvaluationsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CustomerProfilesEvaluationsListInstanceEachOptions): Unit = js.native
    def each(
      opts: CustomerProfilesEvaluationsListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CustomerProfilesEvaluationsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a customer_profiles_evaluations
      *
      * @param sid - The unique string that identifies the Evaluation resource
      */
    def get(sid: String): CustomerProfilesEvaluationsContext = js.native
    
    /**
      * Retrieve a single target page of CustomerProfilesEvaluationsInstance records
      * from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CustomerProfilesEvaluationsPage] = js.native
    def getPage(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEvaluationsPage, Any]
    ): js.Promise[CustomerProfilesEvaluationsPage] = js.native
    def getPage(targetUrl: String): js.Promise[CustomerProfilesEvaluationsPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEvaluationsPage, Any]
    ): js.Promise[CustomerProfilesEvaluationsPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEvaluationsPage, Any]
    ): js.Promise[CustomerProfilesEvaluationsPage] = js.native
    
    /**
      * Lists CustomerProfilesEvaluationsInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CustomerProfilesEvaluationsInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[CustomerProfilesEvaluationsInstance], 
          Any
        ]
    ): js.Promise[js.Array[CustomerProfilesEvaluationsInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[CustomerProfilesEvaluationsInstance], 
          Any
        ]
    ): js.Promise[js.Array[CustomerProfilesEvaluationsInstance]] = js.native
    def list(opts: CustomerProfilesEvaluationsListInstanceOptions): js.Promise[js.Array[CustomerProfilesEvaluationsInstance]] = js.native
    def list(
      opts: CustomerProfilesEvaluationsListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[CustomerProfilesEvaluationsInstance], 
          Any
        ]
    ): js.Promise[js.Array[CustomerProfilesEvaluationsInstance]] = js.native
    
    /**
      * Retrieve a single page of CustomerProfilesEvaluationsInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CustomerProfilesEvaluationsPage] = js.native
    def page(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEvaluationsPage, Any]
    ): js.Promise[CustomerProfilesEvaluationsPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEvaluationsPage, Any]
    ): js.Promise[CustomerProfilesEvaluationsPage] = js.native
    def page(opts: CustomerProfilesEvaluationsListInstancePageOptions): js.Promise[CustomerProfilesEvaluationsPage] = js.native
    def page(
      opts: CustomerProfilesEvaluationsListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEvaluationsPage, Any]
    ): js.Promise[CustomerProfilesEvaluationsPage] = js.native
    
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
  trait CustomerProfilesEvaluationsListInstanceCreateOptions extends StObject {
    
    var policySid: String
  }
  object CustomerProfilesEvaluationsListInstanceCreateOptions {
    
    inline def apply(policySid: String): CustomerProfilesEvaluationsListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(policySid = policySid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesEvaluationsListInstanceCreateOptions]
    }
    
    extension [Self <: CustomerProfilesEvaluationsListInstanceCreateOptions](x: Self) {
      
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
  trait CustomerProfilesEvaluationsListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CustomerProfilesEvaluationsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CustomerProfilesEvaluationsListInstanceEachOptions {
    
    inline def apply(): CustomerProfilesEvaluationsListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesEvaluationsListInstanceEachOptions]
    }
    
    extension [Self <: CustomerProfilesEvaluationsListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CustomerProfilesEvaluationsInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait CustomerProfilesEvaluationsListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CustomerProfilesEvaluationsListInstanceOptions {
    
    inline def apply(): CustomerProfilesEvaluationsListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesEvaluationsListInstanceOptions]
    }
    
    extension [Self <: CustomerProfilesEvaluationsListInstanceOptions](x: Self) {
      
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
  trait CustomerProfilesEvaluationsListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object CustomerProfilesEvaluationsListInstancePageOptions {
    
    inline def apply(): CustomerProfilesEvaluationsListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesEvaluationsListInstancePageOptions]
    }
    
    extension [Self <: CustomerProfilesEvaluationsListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait CustomerProfilesEvaluationsPayload
    extends StObject
       with CustomerProfilesEvaluationsResource
       with TwilioResponsePayload
  object CustomerProfilesEvaluationsPayload {
    
    inline def apply(
      account_sid: String,
      customer_profile_sid: String,
      date_created: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      policy_sid: String,
      previous_page_uri: String,
      results: js.Array[js.Object],
      sid: String,
      status: CustomerProfilesEvaluationsStatus,
      uri: String,
      url: String
    ): CustomerProfilesEvaluationsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], customer_profile_sid = customer_profile_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], policy_sid = policy_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesEvaluationsPayload]
    }
  }
  
  trait CustomerProfilesEvaluationsResource extends StObject {
    
    var account_sid: String
    
    var customer_profile_sid: String
    
    var date_created: js.Date
    
    var policy_sid: String
    
    var results: js.Array[js.Object]
    
    var sid: String
    
    var status: CustomerProfilesEvaluationsStatus
    
    var url: String
  }
  object CustomerProfilesEvaluationsResource {
    
    inline def apply(
      account_sid: String,
      customer_profile_sid: String,
      date_created: js.Date,
      policy_sid: String,
      results: js.Array[js.Object],
      sid: String,
      status: CustomerProfilesEvaluationsStatus,
      url: String
    ): CustomerProfilesEvaluationsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], customer_profile_sid = customer_profile_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], policy_sid = policy_sid.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesEvaluationsResource]
    }
    
    extension [Self <: CustomerProfilesEvaluationsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCustomer_profile_sid(value: String): Self = StObject.set(x, "customer_profile_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setPolicy_sid(value: String): Self = StObject.set(x, "policy_sid", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[js.Object]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: js.Object*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: CustomerProfilesEvaluationsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomerProfilesEvaluationsSolution extends StObject {
    
    var customerProfileSid: js.UndefOr[String] = js.undefined
  }
  object CustomerProfilesEvaluationsSolution {
    
    inline def apply(): CustomerProfilesEvaluationsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesEvaluationsSolution]
    }
    
    extension [Self <: CustomerProfilesEvaluationsSolution](x: Self) {
      
      inline def setCustomerProfileSid(value: String): Self = StObject.set(x, "customerProfileSid", value.asInstanceOf[js.Any])
      
      inline def setCustomerProfileSidUndefined: Self = StObject.set(x, "customerProfileSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.compliant
    - typings.twilio.twilioStrings.noncompliant
  */
  trait CustomerProfilesEvaluationsStatus extends StObject
  object CustomerProfilesEvaluationsStatus {
    
    inline def compliant: typings.twilio.twilioStrings.compliant = "compliant".asInstanceOf[typings.twilio.twilioStrings.compliant]
    
    inline def noncompliant: typings.twilio.twilioStrings.noncompliant = "noncompliant".asInstanceOf[typings.twilio.twilioStrings.noncompliant]
  }
}
