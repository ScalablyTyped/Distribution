package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.trustProductsChannelEndpointAssignmentMod.TrustProductsChannelEndpointAssignmentContext
import typings.twilio.trustProductsChannelEndpointAssignmentMod.TrustProductsChannelEndpointAssignmentListInstance
import typings.twilio.trustProductsEntityAssignmentsMod.TrustProductsEntityAssignmentsContext
import typings.twilio.trustProductsEntityAssignmentsMod.TrustProductsEntityAssignmentsListInstance
import typings.twilio.trustProductsEvaluationsMod.TrustProductsEvaluationsContext
import typings.twilio.trustProductsEvaluationsMod.TrustProductsEvaluationsListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trustProductsMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts", "TrustProductsContext")
  @js.native
  open class TrustProductsContext protected () extends StObject {
    /**
      * Initialize the TrustProductsContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource.
      */
    def this(version: typings.twilio.trusthubV1Mod.^, sid: String) = this()
    
    /**
      * fetch a TrustProductsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrustProductsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsInstance, Any]): js.Promise[TrustProductsInstance] = js.native
    
    /**
      * remove a TrustProductsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * @param sid - sid of instance
      */
    def trustProductsChannelEndpointAssignment(sid: String): TrustProductsChannelEndpointAssignmentContext = js.native
    @JSName("trustProductsChannelEndpointAssignment")
    var trustProductsChannelEndpointAssignment_Original: TrustProductsChannelEndpointAssignmentListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def trustProductsEntityAssignments(sid: String): TrustProductsEntityAssignmentsContext = js.native
    @JSName("trustProductsEntityAssignments")
    var trustProductsEntityAssignments_Original: TrustProductsEntityAssignmentsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def trustProductsEvaluations(sid: String): TrustProductsEvaluationsContext = js.native
    @JSName("trustProductsEvaluations")
    var trustProductsEvaluations_Original: TrustProductsEvaluationsListInstance = js.native
    
    /**
      * update a TrustProductsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TrustProductsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsInstance, Any]): js.Promise[TrustProductsInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsInstance, Any]
    ): js.Promise[TrustProductsInstance] = js.native
    def update(opts: TrustProductsInstanceUpdateOptions): js.Promise[TrustProductsInstance] = js.native
    def update(
      opts: TrustProductsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsInstance, Any]
    ): js.Promise[TrustProductsInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts", "TrustProductsInstance")
  @js.native
  open class TrustProductsInstance protected () extends SerializableClass {
    /**
      * Initialize the TrustProductsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource.
      */
    def this(version: typings.twilio.trusthubV1Mod.^, payload: TrustProductsPayload, sid: String) = this()
    
    /* private */ var _proxy: TrustProductsContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var email: String = js.native
    
    /**
      * fetch a TrustProductsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrustProductsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrustProductsInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    var policySid: String = js.native
    
    /**
      * remove a TrustProductsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var status: TrustProductsStatus = js.native
    
    var statusCallback: String = js.native
    
    /**
      * Access the trustProductsChannelEndpointAssignment
      */
    def trustProductsChannelEndpointAssignment(): TrustProductsChannelEndpointAssignmentListInstance = js.native
    
    /**
      * Access the trustProductsEntityAssignments
      */
    def trustProductsEntityAssignments(): TrustProductsEntityAssignmentsListInstance = js.native
    
    /**
      * Access the trustProductsEvaluations
      */
    def trustProductsEvaluations(): TrustProductsEvaluationsListInstance = js.native
    
    /**
      * update a TrustProductsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TrustProductsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrustProductsInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrustProductsInstance] = js.native
    def update(opts: TrustProductsInstanceUpdateOptions): js.Promise[TrustProductsInstance] = js.native
    def update(
      opts: TrustProductsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TrustProductsInstance] = js.native
    
    var url: String = js.native
    
    var validUntil: js.Date = js.native
  }
  
  /**
    * Initialize the TrustProductsList
    *
    * @param version - Version of the resource
    */
  inline def TrustProductsList(version: typings.twilio.trusthubV1Mod.^): TrustProductsListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("TrustProductsList")(version.asInstanceOf[js.Any]).asInstanceOf[TrustProductsListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts", "TrustProductsPage")
  @js.native
  open class TrustProductsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trusthubV1Mod.^, 
          TrustProductsPayload, 
          TrustProductsResource, 
          TrustProductsInstance
        ] {
    /**
      * Initialize the TrustProductsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TrustProductsSolution
    ) = this()
    
    /**
      * Build an instance of TrustProductsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TrustProductsPayload): TrustProductsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.individual
    - typings.twilio.twilioStrings.business
  */
  trait TrustProductsEndUserType extends StObject
  object TrustProductsEndUserType {
    
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
  trait TrustProductsInstanceUpdateOptions extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[TrustProductsStatus] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
  }
  object TrustProductsInstanceUpdateOptions {
    
    inline def apply(): TrustProductsInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsInstanceUpdateOptions]
    }
    
    extension [Self <: TrustProductsInstanceUpdateOptions](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setStatus(value: TrustProductsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait TrustProductsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TrustProductsContext = js.native
    
    /**
      * create a TrustProductsInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: TrustProductsListInstanceCreateOptions): js.Promise[TrustProductsInstance] = js.native
    def create(
      opts: TrustProductsListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TrustProductsInstance, Any]
    ): js.Promise[TrustProductsInstance] = js.native
    
    /**
      * Streams TrustProductsInstance records from the API.
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
          /* item */ TrustProductsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TrustProductsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TrustProductsListInstanceEachOptions): Unit = js.native
    def each(
      opts: TrustProductsListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TrustProductsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a trust_products
      *
      * @param sid - The unique string that identifies the resource.
      */
    def get(sid: String): TrustProductsContext = js.native
    
    /**
      * Retrieve a single target page of TrustProductsInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TrustProductsPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsPage, Any]): js.Promise[TrustProductsPage] = js.native
    def getPage(targetUrl: String): js.Promise[TrustProductsPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsPage, Any]
    ): js.Promise[TrustProductsPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsPage, Any]
    ): js.Promise[TrustProductsPage] = js.native
    
    /**
      * Lists TrustProductsInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TrustProductsInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TrustProductsInstance], Any]
    ): js.Promise[js.Array[TrustProductsInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TrustProductsInstance], Any]
    ): js.Promise[js.Array[TrustProductsInstance]] = js.native
    def list(opts: TrustProductsListInstanceOptions): js.Promise[js.Array[TrustProductsInstance]] = js.native
    def list(
      opts: TrustProductsListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TrustProductsInstance], Any]
    ): js.Promise[js.Array[TrustProductsInstance]] = js.native
    
    /**
      * Retrieve a single page of TrustProductsInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TrustProductsPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsPage, Any]): js.Promise[TrustProductsPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsPage, Any]
    ): js.Promise[TrustProductsPage] = js.native
    def page(opts: TrustProductsListInstancePageOptions): js.Promise[TrustProductsPage] = js.native
    def page(
      opts: TrustProductsListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsPage, Any]
    ): js.Promise[TrustProductsPage] = js.native
    
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
  trait TrustProductsListInstanceCreateOptions extends StObject {
    
    var email: String
    
    var friendlyName: String
    
    var policySid: String
    
    var statusCallback: js.UndefOr[String] = js.undefined
  }
  object TrustProductsListInstanceCreateOptions {
    
    inline def apply(email: String, friendlyName: String, policySid: String): TrustProductsListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], policySid = policySid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsListInstanceCreateOptions]
    }
    
    extension [Self <: TrustProductsListInstanceCreateOptions](x: Self) {
      
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
  trait TrustProductsListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TrustProductsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var policySid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[TrustProductsStatus] = js.undefined
  }
  object TrustProductsListInstanceEachOptions {
    
    inline def apply(): TrustProductsListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsListInstanceEachOptions]
    }
    
    extension [Self <: TrustProductsListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TrustProductsInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
      
      inline def setStatus(value: TrustProductsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
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
  trait TrustProductsListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var policySid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[TrustProductsStatus] = js.undefined
  }
  object TrustProductsListInstanceOptions {
    
    inline def apply(): TrustProductsListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsListInstanceOptions]
    }
    
    extension [Self <: TrustProductsListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPolicySid(value: String): Self = StObject.set(x, "policySid", value.asInstanceOf[js.Any])
      
      inline def setPolicySidUndefined: Self = StObject.set(x, "policySid", js.undefined)
      
      inline def setStatus(value: TrustProductsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
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
  trait TrustProductsListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var policySid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[TrustProductsStatus] = js.undefined
  }
  object TrustProductsListInstancePageOptions {
    
    inline def apply(): TrustProductsListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsListInstancePageOptions]
    }
    
    extension [Self <: TrustProductsListInstancePageOptions](x: Self) {
      
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
      
      inline def setStatus(value: TrustProductsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait TrustProductsPayload
    extends StObject
       with TrustProductsResource
       with TwilioResponsePayload
  object TrustProductsPayload {
    
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
      status: TrustProductsStatus,
      status_callback: String,
      uri: String,
      url: String,
      valid_until: js.Date
    ): TrustProductsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], policy_sid = policy_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsPayload]
    }
  }
  
  trait TrustProductsResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var email: String
    
    var friendly_name: String
    
    var links: String
    
    var policy_sid: String
    
    var sid: String
    
    var status: TrustProductsStatus
    
    var status_callback: String
    
    var url: String
    
    var valid_until: js.Date
  }
  object TrustProductsResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      friendly_name: String,
      links: String,
      policy_sid: String,
      sid: String,
      status: TrustProductsStatus,
      status_callback: String,
      url: String,
      valid_until: js.Date
    ): TrustProductsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], policy_sid = policy_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsResource]
    }
    
    extension [Self <: TrustProductsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setPolicy_sid(value: String): Self = StObject.set(x, "policy_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: TrustProductsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValid_until(value: js.Date): Self = StObject.set(x, "valid_until", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrustProductsSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.draft
    - typings.twilio.twilioStrings.`pending-review`
    - typings.twilio.twilioStrings.`in-review`
    - typings.twilio.twilioStrings.`twilio-rejected`
    - typings.twilio.twilioStrings.`twilio-approved`
  */
  trait TrustProductsStatus extends StObject
  object TrustProductsStatus {
    
    inline def draft: typings.twilio.twilioStrings.draft = "draft".asInstanceOf[typings.twilio.twilioStrings.draft]
    
    inline def `in-review`: typings.twilio.twilioStrings.`in-review` = "in-review".asInstanceOf[typings.twilio.twilioStrings.`in-review`]
    
    inline def `pending-review`: typings.twilio.twilioStrings.`pending-review` = "pending-review".asInstanceOf[typings.twilio.twilioStrings.`pending-review`]
    
    inline def `twilio-approved`: typings.twilio.twilioStrings.`twilio-approved` = "twilio-approved".asInstanceOf[typings.twilio.twilioStrings.`twilio-approved`]
    
    inline def `twilio-rejected`: typings.twilio.twilioStrings.`twilio-rejected` = "twilio-rejected".asInstanceOf[typings.twilio.twilioStrings.`twilio-rejected`]
  }
}
