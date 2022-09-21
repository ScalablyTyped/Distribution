package typings.twilio

import typings.twilio.bucketMod.BucketContext
import typings.twilio.bucketMod.BucketListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rateLimitMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/rateLimit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/rateLimit", "RateLimitContext")
  @js.native
  open class RateLimitContext protected () extends StObject {
    /**
      * Initialize the RateLimitContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.verifyV2Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def buckets(sid: String): BucketContext = js.native
    @JSName("buckets")
    var buckets_Original: BucketListInstance = js.native
    
    /**
      * fetch a RateLimitInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RateLimitInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitInstance, Any]): js.Promise[RateLimitInstance] = js.native
    
    /**
      * remove a RateLimitInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a RateLimitInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[RateLimitInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitInstance, Any]): js.Promise[RateLimitInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitInstance, Any]
    ): js.Promise[RateLimitInstance] = js.native
    def update(opts: RateLimitInstanceUpdateOptions): js.Promise[RateLimitInstance] = js.native
    def update(
      opts: RateLimitInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitInstance, Any]
    ): js.Promise[RateLimitInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/service/rateLimit", "RateLimitInstance")
  @js.native
  open class RateLimitInstance protected () extends SerializableClass {
    /**
      * Initialize the RateLimitContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.verifyV2Mod.^, payload: RateLimitPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: RateLimitContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the buckets
      */
    def buckets(): BucketListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var description: String = js.native
    
    /**
      * fetch a RateLimitInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RateLimitInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RateLimitInstance] = js.native
    
    var links: String = js.native
    
    /**
      * remove a RateLimitInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a RateLimitInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[RateLimitInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RateLimitInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RateLimitInstance] = js.native
    def update(opts: RateLimitInstanceUpdateOptions): js.Promise[RateLimitInstance] = js.native
    def update(
      opts: RateLimitInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[RateLimitInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the RateLimitList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    */
  inline def RateLimitList(version: typings.twilio.verifyV2Mod.^, serviceSid: String): RateLimitListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("RateLimitList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[RateLimitListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/rateLimit", "RateLimitPage")
  @js.native
  open class RateLimitPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, RateLimitPayload, RateLimitResource, RateLimitInstance] {
    /**
      * Initialize the RateLimitPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RateLimitSolution
    ) = this()
    
    /**
      * Build an instance of RateLimitInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RateLimitPayload): RateLimitInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property description - Description of this Rate Limit
    */
  trait RateLimitInstanceUpdateOptions extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
  }
  object RateLimitInstanceUpdateOptions {
    
    inline def apply(): RateLimitInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateLimitInstanceUpdateOptions]
    }
    
    extension [Self <: RateLimitInstanceUpdateOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  @js.native
  trait RateLimitListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RateLimitContext = js.native
    
    /**
      * create a RateLimitInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: RateLimitListInstanceCreateOptions): js.Promise[RateLimitInstance] = js.native
    def create(
      opts: RateLimitListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ RateLimitInstance, Any]
    ): js.Promise[RateLimitInstance] = js.native
    
    /**
      * Streams RateLimitInstance records from the API.
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
          /* item */ RateLimitInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ RateLimitInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: RateLimitListInstanceEachOptions): Unit = js.native
    def each(
      opts: RateLimitListInstanceEachOptions,
      callback: js.Function2[
          /* item */ RateLimitInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a rate_limit
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): RateLimitContext = js.native
    
    /**
      * Retrieve a single target page of RateLimitInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[RateLimitPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitPage, Any]): js.Promise[RateLimitPage] = js.native
    def getPage(targetUrl: String): js.Promise[RateLimitPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitPage, Any]
    ): js.Promise[RateLimitPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitPage, Any]
    ): js.Promise[RateLimitPage] = js.native
    
    /**
      * Lists RateLimitInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[RateLimitInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RateLimitInstance], Any]): js.Promise[js.Array[RateLimitInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RateLimitInstance], Any]
    ): js.Promise[js.Array[RateLimitInstance]] = js.native
    def list(opts: RateLimitListInstanceOptions): js.Promise[js.Array[RateLimitInstance]] = js.native
    def list(
      opts: RateLimitListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RateLimitInstance], Any]
    ): js.Promise[js.Array[RateLimitInstance]] = js.native
    
    /**
      * Retrieve a single page of RateLimitInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[RateLimitPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitPage, Any]): js.Promise[RateLimitPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitPage, Any]): js.Promise[RateLimitPage] = js.native
    def page(opts: RateLimitListInstancePageOptions): js.Promise[RateLimitPage] = js.native
    def page(
      opts: RateLimitListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RateLimitPage, Any]
    ): js.Promise[RateLimitPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property description - Description of this Rate Limit
    * @property uniqueName - A unique, developer assigned name of this Rate Limit.
    */
  trait RateLimitListInstanceCreateOptions extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var uniqueName: String
  }
  object RateLimitListInstanceCreateOptions {
    
    inline def apply(uniqueName: String): RateLimitListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateLimitListInstanceCreateOptions]
    }
    
    extension [Self <: RateLimitListInstanceCreateOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
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
  trait RateLimitListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ RateLimitInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RateLimitListInstanceEachOptions {
    
    inline def apply(): RateLimitListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateLimitListInstanceEachOptions]
    }
    
    extension [Self <: RateLimitListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ RateLimitInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait RateLimitListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RateLimitListInstanceOptions {
    
    inline def apply(): RateLimitListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateLimitListInstanceOptions]
    }
    
    extension [Self <: RateLimitListInstanceOptions](x: Self) {
      
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
  trait RateLimitListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object RateLimitListInstancePageOptions {
    
    inline def apply(): RateLimitListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateLimitListInstancePageOptions]
    }
    
    extension [Self <: RateLimitListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait RateLimitPayload
    extends StObject
       with RateLimitResource
       with TwilioResponsePayload
  object RateLimitPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): RateLimitPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateLimitPayload]
    }
  }
  
  trait RateLimitResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var description: String
    
    var links: String
    
    var service_sid: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object RateLimitResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      links: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      url: String
    ): RateLimitResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateLimitResource]
    }
    
    extension [Self <: RateLimitResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RateLimitSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object RateLimitSolution {
    
    inline def apply(): RateLimitSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateLimitSolution]
    }
    
    extension [Self <: RateLimitSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
