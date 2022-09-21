package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemAssignmentMod {
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/itemAssignment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/itemAssignment", "ItemAssignmentContext")
  @js.native
  open class ItemAssignmentContext protected () extends StObject {
    /**
      * Initialize the ItemAssignmentContext
      *
      * @param version - Version of the resource
      * @param bundleSid - The unique string that identifies the resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.numbersV2Mod.^, bundleSid: String, sid: String) = this()
    
    /**
      * fetch a ItemAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ItemAssignmentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ItemAssignmentInstance, Any]): js.Promise[ItemAssignmentInstance] = js.native
    
    /**
      * remove a ItemAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ItemAssignmentInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/itemAssignment", "ItemAssignmentInstance")
  @js.native
  open class ItemAssignmentInstance protected () extends SerializableClass {
    /**
      * Initialize the ItemAssignmentContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param bundleSid - The unique string that identifies the Bundle resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.numbersV2Mod.^,
      payload: ItemAssignmentPayload,
      bundleSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: ItemAssignmentContext = js.native
    
    var accountSid: String = js.native
    
    var bundleSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a ItemAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ItemAssignmentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ItemAssignmentInstance] = js.native
    
    var objectSid: String = js.native
    
    /**
      * remove a ItemAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ItemAssignmentList
    *
    * @param version - Version of the resource
    * @param bundleSid - The unique string that identifies the Bundle resource.
    */
  inline def ItemAssignmentList(version: typings.twilio.numbersV2Mod.^, bundleSid: String): ItemAssignmentListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ItemAssignmentList")(version.asInstanceOf[js.Any], bundleSid.asInstanceOf[js.Any])).asInstanceOf[ItemAssignmentListInstance]
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/itemAssignment", "ItemAssignmentPage")
  @js.native
  open class ItemAssignmentPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.numbersV2Mod.^, 
          ItemAssignmentPayload, 
          ItemAssignmentResource, 
          ItemAssignmentInstance
        ] {
    /**
      * Initialize the ItemAssignmentPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.numbersV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ItemAssignmentSolution
    ) = this()
    
    /**
      * Build an instance of ItemAssignmentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ItemAssignmentPayload): ItemAssignmentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ItemAssignmentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ItemAssignmentContext = js.native
    
    /**
      * create a ItemAssignmentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ItemAssignmentListInstanceCreateOptions): js.Promise[ItemAssignmentInstance] = js.native
    def create(
      opts: ItemAssignmentListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ItemAssignmentInstance, Any]
    ): js.Promise[ItemAssignmentInstance] = js.native
    
    /**
      * Streams ItemAssignmentInstance records from the API.
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
          /* item */ ItemAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ItemAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ItemAssignmentListInstanceEachOptions): Unit = js.native
    def each(
      opts: ItemAssignmentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ItemAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a item_assignment
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ItemAssignmentContext = js.native
    
    /**
      * Retrieve a single target page of ItemAssignmentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ItemAssignmentPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ItemAssignmentPage, Any]): js.Promise[ItemAssignmentPage] = js.native
    def getPage(targetUrl: String): js.Promise[ItemAssignmentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ItemAssignmentPage, Any]
    ): js.Promise[ItemAssignmentPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ItemAssignmentPage, Any]
    ): js.Promise[ItemAssignmentPage] = js.native
    
    /**
      * Lists ItemAssignmentInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ItemAssignmentInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ItemAssignmentInstance], Any]
    ): js.Promise[js.Array[ItemAssignmentInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ItemAssignmentInstance], Any]
    ): js.Promise[js.Array[ItemAssignmentInstance]] = js.native
    def list(opts: ItemAssignmentListInstanceOptions): js.Promise[js.Array[ItemAssignmentInstance]] = js.native
    def list(
      opts: ItemAssignmentListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ItemAssignmentInstance], Any]
    ): js.Promise[js.Array[ItemAssignmentInstance]] = js.native
    
    /**
      * Retrieve a single page of ItemAssignmentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ItemAssignmentPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ItemAssignmentPage, Any]): js.Promise[ItemAssignmentPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ItemAssignmentPage, Any]
    ): js.Promise[ItemAssignmentPage] = js.native
    def page(opts: ItemAssignmentListInstancePageOptions): js.Promise[ItemAssignmentPage] = js.native
    def page(
      opts: ItemAssignmentListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ItemAssignmentPage, Any]
    ): js.Promise[ItemAssignmentPage] = js.native
    
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
  trait ItemAssignmentListInstanceCreateOptions extends StObject {
    
    var objectSid: String
  }
  object ItemAssignmentListInstanceCreateOptions {
    
    inline def apply(objectSid: String): ItemAssignmentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(objectSid = objectSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemAssignmentListInstanceCreateOptions]
    }
    
    extension [Self <: ItemAssignmentListInstanceCreateOptions](x: Self) {
      
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
  trait ItemAssignmentListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ItemAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ItemAssignmentListInstanceEachOptions {
    
    inline def apply(): ItemAssignmentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemAssignmentListInstanceEachOptions]
    }
    
    extension [Self <: ItemAssignmentListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ItemAssignmentInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ItemAssignmentListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ItemAssignmentListInstanceOptions {
    
    inline def apply(): ItemAssignmentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemAssignmentListInstanceOptions]
    }
    
    extension [Self <: ItemAssignmentListInstanceOptions](x: Self) {
      
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
  trait ItemAssignmentListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ItemAssignmentListInstancePageOptions {
    
    inline def apply(): ItemAssignmentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemAssignmentListInstancePageOptions]
    }
    
    extension [Self <: ItemAssignmentListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ItemAssignmentPayload
    extends StObject
       with ItemAssignmentResource
       with TwilioResponsePayload
  object ItemAssignmentPayload {
    
    inline def apply(
      account_sid: String,
      bundle_sid: String,
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
    ): ItemAssignmentPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], bundle_sid = bundle_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], object_sid = object_sid.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemAssignmentPayload]
    }
  }
  
  trait ItemAssignmentResource extends StObject {
    
    var account_sid: String
    
    var bundle_sid: String
    
    var date_created: js.Date
    
    var object_sid: String
    
    var sid: String
    
    var url: String
  }
  object ItemAssignmentResource {
    
    inline def apply(
      account_sid: String,
      bundle_sid: String,
      date_created: js.Date,
      object_sid: String,
      sid: String,
      url: String
    ): ItemAssignmentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], bundle_sid = bundle_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], object_sid = object_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemAssignmentResource]
    }
    
    extension [Self <: ItemAssignmentResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBundle_sid(value: String): Self = StObject.set(x, "bundle_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setObject_sid(value: String): Self = StObject.set(x, "object_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemAssignmentSolution extends StObject {
    
    var bundleSid: js.UndefOr[String] = js.undefined
  }
  object ItemAssignmentSolution {
    
    inline def apply(): ItemAssignmentSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemAssignmentSolution]
    }
    
    extension [Self <: ItemAssignmentSolution](x: Self) {
      
      inline def setBundleSid(value: String): Self = StObject.set(x, "bundleSid", value.asInstanceOf[js.Any])
      
      inline def setBundleSidUndefined: Self = StObject.set(x, "bundleSid", js.undefined)
    }
  }
}
