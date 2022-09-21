package typings.twilio

import typings.twilio.customerProfilesChannelEndpointAssignmentMod.CustomerProfilesChannelEndpointAssignmentContext
import typings.twilio.customerProfilesChannelEndpointAssignmentMod.CustomerProfilesChannelEndpointAssignmentListInstance
import typings.twilio.customerProfilesEntityAssignmentsMod.CustomerProfilesEntityAssignmentsContext
import typings.twilio.customerProfilesEntityAssignmentsMod.CustomerProfilesEntityAssignmentsListInstance
import typings.twilio.customerProfilesEvaluationsMod.CustomerProfilesEvaluationsContext
import typings.twilio.customerProfilesEvaluationsMod.CustomerProfilesEvaluationsListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customerProfilesMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles", "CustomerProfilesContext")
  @js.native
  open class CustomerProfilesContext protected () extends StObject {
    /**
      * Initialize the CustomerProfilesContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource.
      */
    def this(version: typings.twilio.trusthubV1Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def customerProfilesChannelEndpointAssignment(sid: String): CustomerProfilesChannelEndpointAssignmentContext = js.native
    @JSName("customerProfilesChannelEndpointAssignment")
    var customerProfilesChannelEndpointAssignment_Original: CustomerProfilesChannelEndpointAssignmentListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def customerProfilesEntityAssignments(sid: String): CustomerProfilesEntityAssignmentsContext = js.native
    @JSName("customerProfilesEntityAssignments")
    var customerProfilesEntityAssignments_Original: CustomerProfilesEntityAssignmentsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def customerProfilesEvaluations(sid: String): CustomerProfilesEvaluationsContext = js.native
    @JSName("customerProfilesEvaluations")
    var customerProfilesEvaluations_Original: CustomerProfilesEvaluationsListInstance = js.native
    
    /**
      * fetch a CustomerProfilesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CustomerProfilesInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesInstance, Any]): js.Promise[CustomerProfilesInstance] = js.native
    
    /**
      * remove a CustomerProfilesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a CustomerProfilesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[CustomerProfilesInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesInstance, Any]): js.Promise[CustomerProfilesInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesInstance, Any]
    ): js.Promise[CustomerProfilesInstance] = js.native
    def update(opts: CustomerProfilesInstanceUpdateOptions): js.Promise[CustomerProfilesInstance] = js.native
    def update(
      opts: CustomerProfilesInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesInstance, Any]
    ): js.Promise[CustomerProfilesInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles", "CustomerProfilesInstance")
  @js.native
  open class CustomerProfilesInstance protected () extends SerializableClass {
    /**
      * Initialize the CustomerProfilesContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource.
      */
    def this(version: typings.twilio.trusthubV1Mod.^, payload: CustomerProfilesPayload, sid: String) = this()
    
    /* private */ var _proxy: CustomerProfilesContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the customerProfilesChannelEndpointAssignment
      */
    def customerProfilesChannelEndpointAssignment(): CustomerProfilesChannelEndpointAssignmentListInstance = js.native
    
    /**
      * Access the customerProfilesEntityAssignments
      */
    def customerProfilesEntityAssignments(): CustomerProfilesEntityAssignmentsListInstance = js.native
    
    /**
      * Access the customerProfilesEvaluations
      */
    def customerProfilesEvaluations(): CustomerProfilesEvaluationsListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var email: String = js.native
    
    /**
      * fetch a CustomerProfilesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CustomerProfilesInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CustomerProfilesInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    var policySid: String = js.native
    
    /**
      * remove a CustomerProfilesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var status: CustomerProfilesStatus = js.native
    
    var statusCallback: String = js.native
    
    /**
      * update a CustomerProfilesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[CustomerProfilesInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CustomerProfilesInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CustomerProfilesInstance] = js.native
    def update(opts: CustomerProfilesInstanceUpdateOptions): js.Promise[CustomerProfilesInstance] = js.native
    def update(
      opts: CustomerProfilesInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[CustomerProfilesInstance] = js.native
    
    var url: String = js.native
    
    var validUntil: js.Date = js.native
  }
  
  /**
    * Initialize the CustomerProfilesList
    *
    * @param version - Version of the resource
    */
  inline def CustomerProfilesList(version: typings.twilio.trusthubV1Mod.^): CustomerProfilesListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomerProfilesList")(version.asInstanceOf[js.Any]).asInstanceOf[CustomerProfilesListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles", "CustomerProfilesPage")
  @js.native
  open class CustomerProfilesPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trusthubV1Mod.^, 
          CustomerProfilesPayload, 
          CustomerProfilesResource, 
          CustomerProfilesInstance
        ] {
    /**
      * Initialize the CustomerProfilesPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CustomerProfilesSolution
    ) = this()
    
    /**
      * Build an instance of CustomerProfilesInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CustomerProfilesPayload): CustomerProfilesInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.individual
    - typings.twilio.twilioStrings.business
  */
  trait CustomerProfilesEndUserType extends StObject
  object CustomerProfilesEndUserType {
    
    inline def business: typings.twilio.twilioStrings.business = "business".asInstanceOf[typings.twilio.twilioStrings.business]
    
    inline def individual: typings.twilio.twilioStrings.individual = "individual".asInstanceOf[typings.twilio.twilioStrings.individual]
  }
  
  /**
    * Options to pass to update
    *
    * @property email - The email address
    * @property friendlyName - The string that you assigned to describe the resource
    * @property status - The verification status of the Customer-Profile resource
    * @property statusCallback - The URL we call to inform your application of status changes.
    */
  trait CustomerProfilesInstanceUpdateOptions extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CustomerProfilesStatus] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
  }
  object CustomerProfilesInstanceUpdateOptions {
    
    inline def apply(): CustomerProfilesInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesInstanceUpdateOptions]
    }
    
    extension [Self <: CustomerProfilesInstanceUpdateOptions](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setStatus(value: CustomerProfilesStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait CustomerProfilesListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CustomerProfilesContext = js.native
    
    /**
      * create a CustomerProfilesInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CustomerProfilesListInstanceCreateOptions): js.Promise[CustomerProfilesInstance] = js.native
    def create(
      opts: CustomerProfilesListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ CustomerProfilesInstance, Any]
    ): js.Promise[CustomerProfilesInstance] = js.native
    
    /**
      * Streams CustomerProfilesInstance records from the API.
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
          /* item */ CustomerProfilesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CustomerProfilesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CustomerProfilesListInstanceEachOptions): Unit = js.native
    def each(
      opts: CustomerProfilesListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CustomerProfilesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a customer_profiles
      *
      * @param sid - The unique string that identifies the resource.
      */
    def get(sid: String): CustomerProfilesContext = js.native
    
    /**
      * Retrieve a single target page of CustomerProfilesInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CustomerProfilesPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesPage, Any]): js.Promise[CustomerProfilesPage] = js.native
    def getPage(targetUrl: String): js.Promise[CustomerProfilesPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesPage, Any]
    ): js.Promise[CustomerProfilesPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesPage, Any]
    ): js.Promise[CustomerProfilesPage] = js.native
    
    /**
      * Lists CustomerProfilesInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CustomerProfilesInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CustomerProfilesInstance], Any]
    ): js.Promise[js.Array[CustomerProfilesInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CustomerProfilesInstance], Any]
    ): js.Promise[js.Array[CustomerProfilesInstance]] = js.native
    def list(opts: CustomerProfilesListInstanceOptions): js.Promise[js.Array[CustomerProfilesInstance]] = js.native
    def list(
      opts: CustomerProfilesListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CustomerProfilesInstance], Any]
    ): js.Promise[js.Array[CustomerProfilesInstance]] = js.native
    
    /**
      * Retrieve a single page of CustomerProfilesInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CustomerProfilesPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesPage, Any]): js.Promise[CustomerProfilesPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesPage, Any]
    ): js.Promise[CustomerProfilesPage] = js.native
    def page(opts: CustomerProfilesListInstancePageOptions): js.Promise[CustomerProfilesPage] = js.native
    def page(
      opts: CustomerProfilesListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesPage, Any]
    ): js.Promise[CustomerProfilesPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property email - The email address
    * @property friendlyName - The string that you assigned to describe the resource
    * @property policySid - The unique string of a policy.
    * @property statusCallback - The URL we call to inform your application of status changes.
    */
  trait CustomerProfilesListInstanceCreateOptions extends StObject {
    
    var email: String
    
    var friendlyName: String
    
    var policySid: String
    
    var statusCallback: js.UndefOr[String] = js.undefined
  }
  object CustomerProfilesListInstanceCreateOptions {
    
    inline def apply(email: String, friendlyName: String, policySid: String): CustomerProfilesListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], policySid = policySid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesListInstanceCreateOptions]
    }
    
    extension [Self <: CustomerProfilesListInstanceCreateOptions](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setPolicySid(value: String): Self = StObject.set(x, "policySid", value.asInstanceOf[js.Any])
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The string that you assigned to describe the resource
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
    * @property policySid - The unique string of a policy.
    * @property status - The verification status of the Customer-Profile resource
    */
  trait CustomerProfilesListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CustomerProfilesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var policySid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CustomerProfilesStatus] = js.undefined
  }
  object CustomerProfilesListInstanceEachOptions {
    
    inline def apply(): CustomerProfilesListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesListInstanceEachOptions]
    }
    
    extension [Self <: CustomerProfilesListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CustomerProfilesInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPolicySid(value: String): Self = StObject.set(x, "policySid", value.asInstanceOf[js.Any])
      
      inline def setPolicySidUndefined: Self = StObject.set(x, "policySid", js.undefined)
      
      inline def setStatus(value: CustomerProfilesStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - The string that you assigned to describe the resource
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
    * @property policySid - The unique string of a policy.
    * @property status - The verification status of the Customer-Profile resource
    */
  trait CustomerProfilesListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var policySid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CustomerProfilesStatus] = js.undefined
  }
  object CustomerProfilesListInstanceOptions {
    
    inline def apply(): CustomerProfilesListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesListInstanceOptions]
    }
    
    extension [Self <: CustomerProfilesListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPolicySid(value: String): Self = StObject.set(x, "policySid", value.asInstanceOf[js.Any])
      
      inline def setPolicySidUndefined: Self = StObject.set(x, "policySid", js.undefined)
      
      inline def setStatus(value: CustomerProfilesStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - The string that you assigned to describe the resource
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property policySid - The unique string of a policy.
    * @property status - The verification status of the Customer-Profile resource
    */
  trait CustomerProfilesListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var policySid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CustomerProfilesStatus] = js.undefined
  }
  object CustomerProfilesListInstancePageOptions {
    
    inline def apply(): CustomerProfilesListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesListInstancePageOptions]
    }
    
    extension [Self <: CustomerProfilesListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPolicySid(value: String): Self = StObject.set(x, "policySid", value.asInstanceOf[js.Any])
      
      inline def setPolicySidUndefined: Self = StObject.set(x, "policySid", js.undefined)
      
      inline def setStatus(value: CustomerProfilesStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait CustomerProfilesPayload
    extends StObject
       with CustomerProfilesResource
       with TwilioResponsePayload
  object CustomerProfilesPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      policy_sid: String,
      previous_page_uri: String,
      sid: String,
      status: CustomerProfilesStatus,
      status_callback: String,
      uri: String,
      url: String,
      valid_until: js.Date
    ): CustomerProfilesPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], policy_sid = policy_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesPayload]
    }
  }
  
  trait CustomerProfilesResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var email: String
    
    var friendly_name: String
    
    var links: String
    
    var policy_sid: String
    
    var sid: String
    
    var status: CustomerProfilesStatus
    
    var status_callback: String
    
    var url: String
    
    var valid_until: js.Date
  }
  object CustomerProfilesResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      friendly_name: String,
      links: String,
      policy_sid: String,
      sid: String,
      status: CustomerProfilesStatus,
      status_callback: String,
      url: String,
      valid_until: js.Date
    ): CustomerProfilesResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], policy_sid = policy_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesResource]
    }
    
    extension [Self <: CustomerProfilesResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setPolicy_sid(value: String): Self = StObject.set(x, "policy_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: CustomerProfilesStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValid_until(value: js.Date): Self = StObject.set(x, "valid_until", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomerProfilesSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.draft
    - typings.twilio.twilioStrings.`pending-review`
    - typings.twilio.twilioStrings.`in-review`
    - typings.twilio.twilioStrings.`twilio-rejected`
    - typings.twilio.twilioStrings.`twilio-approved`
  */
  trait CustomerProfilesStatus extends StObject
  object CustomerProfilesStatus {
    
    inline def draft: typings.twilio.twilioStrings.draft = "draft".asInstanceOf[typings.twilio.twilioStrings.draft]
    
    inline def `in-review`: typings.twilio.twilioStrings.`in-review` = "in-review".asInstanceOf[typings.twilio.twilioStrings.`in-review`]
    
    inline def `pending-review`: typings.twilio.twilioStrings.`pending-review` = "pending-review".asInstanceOf[typings.twilio.twilioStrings.`pending-review`]
    
    inline def `twilio-approved`: typings.twilio.twilioStrings.`twilio-approved` = "twilio-approved".asInstanceOf[typings.twilio.twilioStrings.`twilio-approved`]
    
    inline def `twilio-rejected`: typings.twilio.twilioStrings.`twilio-rejected` = "twilio-rejected".asInstanceOf[typings.twilio.twilioStrings.`twilio-rejected`]
  }
}
