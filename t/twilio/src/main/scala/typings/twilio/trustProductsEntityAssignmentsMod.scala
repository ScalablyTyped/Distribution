package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trustProductsEntityAssignmentsMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsEntityAssignments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsEntityAssignments", "TrustProductsEntityAssignmentsContext")
  @js.native
  open class TrustProductsEntityAssignmentsContext protected () extends StObject {
    /**
      * Initialize the TrustProductsEntityAssignmentsContext
      *
      * @param version - Version of the resource
      * @param trustProductSid - The unique string that identifies the resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, trustProductSid: String, sid: String) = this()
    
    /**
      * fetch a TrustProductsEntityAssignmentsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrustProductsEntityAssignmentsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEntityAssignmentsInstance, Any]
    ): js.Promise[TrustProductsEntityAssignmentsInstance] = js.native
    
    /**
      * remove a TrustProductsEntityAssignmentsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEntityAssignmentsInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsEntityAssignments", "TrustProductsEntityAssignmentsInstance")
  @js.native
  open class TrustProductsEntityAssignmentsInstance protected () extends SerializableClass {
    /**
      * Initialize the TrustProductsEntityAssignmentsContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param trustProductSid - The unique string that identifies the TrustProduct resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      payload: TrustProductsEntityAssignmentsPayload,
      trustProductSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: TrustProductsEntityAssignmentsContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a TrustProductsEntityAssignmentsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrustProductsEntityAssignmentsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrustProductsEntityAssignmentsInstance] = js.native
    
    var objectSid: String = js.native
    
    /**
      * remove a TrustProductsEntityAssignmentsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var trustProductSid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the TrustProductsEntityAssignmentsList
    *
    * @param version - Version of the resource
    * @param trustProductSid - The unique string that identifies the TrustProduct resource.
    */
  inline def TrustProductsEntityAssignmentsList(version: typings.twilio.trusthubV1Mod.^, trustProductSid: String): TrustProductsEntityAssignmentsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TrustProductsEntityAssignmentsList")(version.asInstanceOf[js.Any], trustProductSid.asInstanceOf[js.Any])).asInstanceOf[TrustProductsEntityAssignmentsListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsEntityAssignments", "TrustProductsEntityAssignmentsPage")
  @js.native
  open class TrustProductsEntityAssignmentsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trusthubV1Mod.^, 
          TrustProductsEntityAssignmentsPayload, 
          TrustProductsEntityAssignmentsResource, 
          TrustProductsEntityAssignmentsInstance
        ] {
    /**
      * Initialize the TrustProductsEntityAssignmentsPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TrustProductsEntityAssignmentsSolution
    ) = this()
    
    /**
      * Build an instance of TrustProductsEntityAssignmentsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TrustProductsEntityAssignmentsPayload): TrustProductsEntityAssignmentsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait TrustProductsEntityAssignmentsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TrustProductsEntityAssignmentsContext = js.native
    
    /**
      * create a TrustProductsEntityAssignmentsInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: TrustProductsEntityAssignmentsListInstanceCreateOptions): js.Promise[TrustProductsEntityAssignmentsInstance] = js.native
    def create(
      opts: TrustProductsEntityAssignmentsListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TrustProductsEntityAssignmentsInstance, Any]
    ): js.Promise[TrustProductsEntityAssignmentsInstance] = js.native
    
    /**
      * Streams TrustProductsEntityAssignmentsInstance records from the API.
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
          /* item */ TrustProductsEntityAssignmentsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TrustProductsEntityAssignmentsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TrustProductsEntityAssignmentsListInstanceEachOptions): Unit = js.native
    def each(
      opts: TrustProductsEntityAssignmentsListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TrustProductsEntityAssignmentsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a trust_products_entity_assignments
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): TrustProductsEntityAssignmentsContext = js.native
    
    /**
      * Retrieve a single target page of TrustProductsEntityAssignmentsInstance records
      * from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TrustProductsEntityAssignmentsPage] = js.native
    def getPage(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEntityAssignmentsPage, Any]
    ): js.Promise[TrustProductsEntityAssignmentsPage] = js.native
    def getPage(targetUrl: String): js.Promise[TrustProductsEntityAssignmentsPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEntityAssignmentsPage, Any]
    ): js.Promise[TrustProductsEntityAssignmentsPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEntityAssignmentsPage, Any]
    ): js.Promise[TrustProductsEntityAssignmentsPage] = js.native
    
    /**
      * Lists TrustProductsEntityAssignmentsInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TrustProductsEntityAssignmentsInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[TrustProductsEntityAssignmentsInstance], 
          Any
        ]
    ): js.Promise[js.Array[TrustProductsEntityAssignmentsInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[TrustProductsEntityAssignmentsInstance], 
          Any
        ]
    ): js.Promise[js.Array[TrustProductsEntityAssignmentsInstance]] = js.native
    def list(opts: TrustProductsEntityAssignmentsListInstanceOptions): js.Promise[js.Array[TrustProductsEntityAssignmentsInstance]] = js.native
    def list(
      opts: TrustProductsEntityAssignmentsListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[TrustProductsEntityAssignmentsInstance], 
          Any
        ]
    ): js.Promise[js.Array[TrustProductsEntityAssignmentsInstance]] = js.native
    
    /**
      * Retrieve a single page of TrustProductsEntityAssignmentsInstance records from
      * the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TrustProductsEntityAssignmentsPage] = js.native
    def page(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEntityAssignmentsPage, Any]
    ): js.Promise[TrustProductsEntityAssignmentsPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEntityAssignmentsPage, Any]
    ): js.Promise[TrustProductsEntityAssignmentsPage] = js.native
    def page(opts: TrustProductsEntityAssignmentsListInstancePageOptions): js.Promise[TrustProductsEntityAssignmentsPage] = js.native
    def page(
      opts: TrustProductsEntityAssignmentsListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrustProductsEntityAssignmentsPage, Any]
    ): js.Promise[TrustProductsEntityAssignmentsPage] = js.native
    
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
  trait TrustProductsEntityAssignmentsListInstanceCreateOptions extends StObject {
    
    var objectSid: String
  }
  object TrustProductsEntityAssignmentsListInstanceCreateOptions {
    
    inline def apply(objectSid: String): TrustProductsEntityAssignmentsListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(objectSid = objectSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsEntityAssignmentsListInstanceCreateOptions]
    }
    
    extension [Self <: TrustProductsEntityAssignmentsListInstanceCreateOptions](x: Self) {
      
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
  trait TrustProductsEntityAssignmentsListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TrustProductsEntityAssignmentsInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TrustProductsEntityAssignmentsListInstanceEachOptions {
    
    inline def apply(): TrustProductsEntityAssignmentsListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsEntityAssignmentsListInstanceEachOptions]
    }
    
    extension [Self <: TrustProductsEntityAssignmentsListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TrustProductsEntityAssignmentsInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait TrustProductsEntityAssignmentsListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TrustProductsEntityAssignmentsListInstanceOptions {
    
    inline def apply(): TrustProductsEntityAssignmentsListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsEntityAssignmentsListInstanceOptions]
    }
    
    extension [Self <: TrustProductsEntityAssignmentsListInstanceOptions](x: Self) {
      
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
  trait TrustProductsEntityAssignmentsListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object TrustProductsEntityAssignmentsListInstancePageOptions {
    
    inline def apply(): TrustProductsEntityAssignmentsListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsEntityAssignmentsListInstancePageOptions]
    }
    
    extension [Self <: TrustProductsEntityAssignmentsListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait TrustProductsEntityAssignmentsPayload
    extends StObject
       with TrustProductsEntityAssignmentsResource
       with TwilioResponsePayload
  object TrustProductsEntityAssignmentsPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      object_sid: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      trust_product_sid: String,
      uri: String,
      url: String
    ): TrustProductsEntityAssignmentsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], object_sid = object_sid.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], trust_product_sid = trust_product_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsEntityAssignmentsPayload]
    }
  }
  
  trait TrustProductsEntityAssignmentsResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var object_sid: String
    
    var sid: String
    
    var trust_product_sid: String
    
    var url: String
  }
  object TrustProductsEntityAssignmentsResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      object_sid: String,
      sid: String,
      trust_product_sid: String,
      url: String
    ): TrustProductsEntityAssignmentsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], object_sid = object_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], trust_product_sid = trust_product_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsEntityAssignmentsResource]
    }
    
    extension [Self <: TrustProductsEntityAssignmentsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setObject_sid(value: String): Self = StObject.set(x, "object_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTrust_product_sid(value: String): Self = StObject.set(x, "trust_product_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrustProductsEntityAssignmentsSolution extends StObject {
    
    var trustProductSid: js.UndefOr[String] = js.undefined
  }
  object TrustProductsEntityAssignmentsSolution {
    
    inline def apply(): TrustProductsEntityAssignmentsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsEntityAssignmentsSolution]
    }
    
    extension [Self <: TrustProductsEntityAssignmentsSolution](x: Self) {
      
      inline def setTrustProductSid(value: String): Self = StObject.set(x, "trustProductSid", value.asInstanceOf[js.Any])
      
      inline def setTrustProductSidUndefined: Self = StObject.set(x, "trustProductSid", js.undefined)
    }
  }
}
