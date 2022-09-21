package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customerProfilesEntityAssignmentsMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesEntityAssignments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesEntityAssignments", "CustomerProfilesEntityAssignmentsContext")
  @js.native
  open class CustomerProfilesEntityAssignmentsContext protected () extends StObject {
    /**
      * Initialize the CustomerProfilesEntityAssignmentsContext
      *
      * @param version - Version of the resource
      * @param customerProfileSid - The unique string that identifies the resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, customerProfileSid: String, sid: String) = this()
    
    /**
      * fetch a CustomerProfilesEntityAssignmentsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CustomerProfilesEntityAssignmentsInstance] = js.native
    def fetch(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ CustomerProfilesEntityAssignmentsInstance, 
          Any
        ]
    ): js.Promise[CustomerProfilesEntityAssignmentsInstance] = js.native
    
    /**
      * remove a CustomerProfilesEntityAssignmentsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ CustomerProfilesEntityAssignmentsInstance, 
          Any
        ]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesEntityAssignments", "CustomerProfilesEntityAssignmentsInstance")
  @js.native
  open class CustomerProfilesEntityAssignmentsInstance protected () extends SerializableClass {
    /**
      * Initialize the CustomerProfilesEntityAssignmentsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param customerProfileSid - The unique string that identifies the CustomerProfile resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      payload: CustomerProfilesEntityAssignmentsPayload,
      customerProfileSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: CustomerProfilesEntityAssignmentsContext = js.native
    
    var accountSid: String = js.native
    
    var customerProfileSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a CustomerProfilesEntityAssignmentsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CustomerProfilesEntityAssignmentsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CustomerProfilesEntityAssignmentsInstance] = js.native
    
    var objectSid: String = js.native
    
    /**
      * remove a CustomerProfilesEntityAssignmentsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CustomerProfilesEntityAssignmentsList
    *
    * @param version - Version of the resource
    * @param customerProfileSid - The unique string that identifies the CustomerProfile resource.
    */
  inline def CustomerProfilesEntityAssignmentsList(version: typings.twilio.trusthubV1Mod.^, customerProfileSid: String): CustomerProfilesEntityAssignmentsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("CustomerProfilesEntityAssignmentsList")(version.asInstanceOf[js.Any], customerProfileSid.asInstanceOf[js.Any])).asInstanceOf[CustomerProfilesEntityAssignmentsListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesEntityAssignments", "CustomerProfilesEntityAssignmentsPage")
  @js.native
  open class CustomerProfilesEntityAssignmentsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trusthubV1Mod.^, 
          CustomerProfilesEntityAssignmentsPayload, 
          CustomerProfilesEntityAssignmentsResource, 
          CustomerProfilesEntityAssignmentsInstance
        ] {
    /**
      * Initialize the CustomerProfilesEntityAssignmentsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CustomerProfilesEntityAssignmentsSolution
    ) = this()
    
    /**
      * Build an instance of CustomerProfilesEntityAssignmentsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CustomerProfilesEntityAssignmentsPayload): CustomerProfilesEntityAssignmentsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait CustomerProfilesEntityAssignmentsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CustomerProfilesEntityAssignmentsContext = js.native
    
    /**
      * create a CustomerProfilesEntityAssignmentsInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CustomerProfilesEntityAssignmentsListInstanceCreateOptions): js.Promise[CustomerProfilesEntityAssignmentsInstance] = js.native
    def create(
      opts: CustomerProfilesEntityAssignmentsListInstanceCreateOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ CustomerProfilesEntityAssignmentsInstance, 
          Any
        ]
    ): js.Promise[CustomerProfilesEntityAssignmentsInstance] = js.native
    
    /**
      * Streams CustomerProfilesEntityAssignmentsInstance records from the API.
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
          /* item */ CustomerProfilesEntityAssignmentsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CustomerProfilesEntityAssignmentsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CustomerProfilesEntityAssignmentsListInstanceEachOptions): Unit = js.native
    def each(
      opts: CustomerProfilesEntityAssignmentsListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CustomerProfilesEntityAssignmentsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a customer_profiles_entity_assignments
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): CustomerProfilesEntityAssignmentsContext = js.native
    
    /**
      * Retrieve a single target page of CustomerProfilesEntityAssignmentsInstance
      * records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CustomerProfilesEntityAssignmentsPage] = js.native
    def getPage(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEntityAssignmentsPage, Any]
    ): js.Promise[CustomerProfilesEntityAssignmentsPage] = js.native
    def getPage(targetUrl: String): js.Promise[CustomerProfilesEntityAssignmentsPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEntityAssignmentsPage, Any]
    ): js.Promise[CustomerProfilesEntityAssignmentsPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEntityAssignmentsPage, Any]
    ): js.Promise[CustomerProfilesEntityAssignmentsPage] = js.native
    
    /**
      * Lists CustomerProfilesEntityAssignmentsInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CustomerProfilesEntityAssignmentsInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[CustomerProfilesEntityAssignmentsInstance], 
          Any
        ]
    ): js.Promise[js.Array[CustomerProfilesEntityAssignmentsInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[CustomerProfilesEntityAssignmentsInstance], 
          Any
        ]
    ): js.Promise[js.Array[CustomerProfilesEntityAssignmentsInstance]] = js.native
    def list(opts: CustomerProfilesEntityAssignmentsListInstanceOptions): js.Promise[js.Array[CustomerProfilesEntityAssignmentsInstance]] = js.native
    def list(
      opts: CustomerProfilesEntityAssignmentsListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[CustomerProfilesEntityAssignmentsInstance], 
          Any
        ]
    ): js.Promise[js.Array[CustomerProfilesEntityAssignmentsInstance]] = js.native
    
    /**
      * Retrieve a single page of CustomerProfilesEntityAssignmentsInstance records from
      * the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CustomerProfilesEntityAssignmentsPage] = js.native
    def page(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEntityAssignmentsPage, Any]
    ): js.Promise[CustomerProfilesEntityAssignmentsPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEntityAssignmentsPage, Any]
    ): js.Promise[CustomerProfilesEntityAssignmentsPage] = js.native
    def page(opts: CustomerProfilesEntityAssignmentsListInstancePageOptions): js.Promise[CustomerProfilesEntityAssignmentsPage] = js.native
    def page(
      opts: CustomerProfilesEntityAssignmentsListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CustomerProfilesEntityAssignmentsPage, Any]
    ): js.Promise[CustomerProfilesEntityAssignmentsPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property objectSid - The sid of an object bag
    */
  trait CustomerProfilesEntityAssignmentsListInstanceCreateOptions extends StObject {
    
    var objectSid: String
  }
  object CustomerProfilesEntityAssignmentsListInstanceCreateOptions {
    
    inline def apply(objectSid: String): CustomerProfilesEntityAssignmentsListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(objectSid = objectSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesEntityAssignmentsListInstanceCreateOptions]
    }
    
    extension [Self <: CustomerProfilesEntityAssignmentsListInstanceCreateOptions](x: Self) {
      
      inline def setObjectSid(value: String): Self = StObject.set(x, "objectSid", value.asInstanceOf[js.Any])
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
  trait CustomerProfilesEntityAssignmentsListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CustomerProfilesEntityAssignmentsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CustomerProfilesEntityAssignmentsListInstanceEachOptions {
    
    inline def apply(): CustomerProfilesEntityAssignmentsListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesEntityAssignmentsListInstanceEachOptions]
    }
    
    extension [Self <: CustomerProfilesEntityAssignmentsListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CustomerProfilesEntityAssignmentsInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait CustomerProfilesEntityAssignmentsListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CustomerProfilesEntityAssignmentsListInstanceOptions {
    
    inline def apply(): CustomerProfilesEntityAssignmentsListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesEntityAssignmentsListInstanceOptions]
    }
    
    extension [Self <: CustomerProfilesEntityAssignmentsListInstanceOptions](x: Self) {
      
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
  trait CustomerProfilesEntityAssignmentsListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object CustomerProfilesEntityAssignmentsListInstancePageOptions {
    
    inline def apply(): CustomerProfilesEntityAssignmentsListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesEntityAssignmentsListInstancePageOptions]
    }
    
    extension [Self <: CustomerProfilesEntityAssignmentsListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait CustomerProfilesEntityAssignmentsPayload
    extends StObject
       with CustomerProfilesEntityAssignmentsResource
       with TwilioResponsePayload
  object CustomerProfilesEntityAssignmentsPayload {
    
    inline def apply(
      account_sid: String,
      customer_profile_sid: String,
      date_created: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      object_sid: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): CustomerProfilesEntityAssignmentsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], customer_profile_sid = customer_profile_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], object_sid = object_sid.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesEntityAssignmentsPayload]
    }
  }
  
  trait CustomerProfilesEntityAssignmentsResource extends StObject {
    
    var account_sid: String
    
    var customer_profile_sid: String
    
    var date_created: js.Date
    
    var object_sid: String
    
    var sid: String
    
    var url: String
  }
  object CustomerProfilesEntityAssignmentsResource {
    
    inline def apply(
      account_sid: String,
      customer_profile_sid: String,
      date_created: js.Date,
      object_sid: String,
      sid: String,
      url: String
    ): CustomerProfilesEntityAssignmentsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], customer_profile_sid = customer_profile_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], object_sid = object_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesEntityAssignmentsResource]
    }
    
    extension [Self <: CustomerProfilesEntityAssignmentsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCustomer_profile_sid(value: String): Self = StObject.set(x, "customer_profile_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setObject_sid(value: String): Self = StObject.set(x, "object_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomerProfilesEntityAssignmentsSolution extends StObject {
    
    var customerProfileSid: js.UndefOr[String] = js.undefined
  }
  object CustomerProfilesEntityAssignmentsSolution {
    
    inline def apply(): CustomerProfilesEntityAssignmentsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesEntityAssignmentsSolution]
    }
    
    extension [Self <: CustomerProfilesEntityAssignmentsSolution](x: Self) {
      
      inline def setCustomerProfileSid(value: String): Self = StObject.set(x, "customerProfileSid", value.asInstanceOf[js.Any])
      
      inline def setCustomerProfileSidUndefined: Self = StObject.set(x, "customerProfileSid", js.undefined)
    }
  }
}
