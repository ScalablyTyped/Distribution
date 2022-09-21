package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/rateLimit/bucket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/rateLimit/bucket", "BucketContext")
  @js.native
  open class BucketContext protected () extends StObject {
    /**
      * Initialize the BucketContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param rateLimitSid - Rate Limit Sid.
      * @param sid - A string that uniquely identifies this Bucket.
      */
    def this(version: typings.twilio.verifyV2Mod.^, serviceSid: String, rateLimitSid: String, sid: String) = this()
    
    /**
      * fetch a BucketInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BucketInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketInstance, Any]): js.Promise[BucketInstance] = js.native
    
    /**
      * remove a BucketInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a BucketInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[BucketInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketInstance, Any]): js.Promise[BucketInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketInstance, Any]): js.Promise[BucketInstance] = js.native
    def update(opts: BucketInstanceUpdateOptions): js.Promise[BucketInstance] = js.native
    def update(
      opts: BucketInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketInstance, Any]
    ): js.Promise[BucketInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/service/rateLimit/bucket", "BucketInstance")
  @js.native
  open class BucketInstance protected () extends SerializableClass {
    /**
      * Initialize the BucketContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param rateLimitSid - Rate Limit Sid.
      * @param sid - A string that uniquely identifies this Bucket.
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      payload: BucketPayload,
      serviceSid: String,
      rateLimitSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: BucketContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a BucketInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BucketInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BucketInstance] = js.native
    
    var interval: Double = js.native
    
    var max: Double = js.native
    
    var rateLimitSid: String = js.native
    
    /**
      * remove a BucketInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    /**
      * update a BucketInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[BucketInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BucketInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BucketInstance] = js.native
    def update(opts: BucketInstanceUpdateOptions): js.Promise[BucketInstance] = js.native
    def update(
      opts: BucketInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[BucketInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the BucketList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    * @param rateLimitSid - Rate Limit Sid.
    */
  inline def BucketList(version: typings.twilio.verifyV2Mod.^, serviceSid: String, rateLimitSid: String): BucketListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("BucketList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], rateLimitSid.asInstanceOf[js.Any])).asInstanceOf[BucketListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/rateLimit/bucket", "BucketPage")
  @js.native
  open class BucketPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, BucketPayload, BucketResource, BucketInstance] {
    /**
      * Initialize the BucketPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: BucketSolution
    ) = this()
    
    /**
      * Build an instance of BucketInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BucketPayload): BucketInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property interval - Number of seconds that the rate limit will be enforced over.
    * @property max - Max number of requests.
    */
  trait BucketInstanceUpdateOptions extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
  }
  object BucketInstanceUpdateOptions {
    
    inline def apply(): BucketInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketInstanceUpdateOptions]
    }
    
    extension [Self <: BucketInstanceUpdateOptions](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    }
  }
  
  @js.native
  trait BucketListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): BucketContext = js.native
    
    /**
      * create a BucketInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: BucketListInstanceCreateOptions): js.Promise[BucketInstance] = js.native
    def create(
      opts: BucketListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ BucketInstance, Any]
    ): js.Promise[BucketInstance] = js.native
    
    /**
      * Streams BucketInstance records from the API.
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
          /* item */ BucketInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ BucketInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: BucketListInstanceEachOptions): Unit = js.native
    def each(
      opts: BucketListInstanceEachOptions,
      callback: js.Function2[
          /* item */ BucketInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a bucket
      *
      * @param sid - A string that uniquely identifies this Bucket.
      */
    def get(sid: String): BucketContext = js.native
    
    /**
      * Retrieve a single target page of BucketInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[BucketPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketPage, Any]): js.Promise[BucketPage] = js.native
    def getPage(targetUrl: String): js.Promise[BucketPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketPage, Any]
    ): js.Promise[BucketPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketPage, Any]): js.Promise[BucketPage] = js.native
    
    /**
      * Lists BucketInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[BucketInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BucketInstance], Any]): js.Promise[js.Array[BucketInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BucketInstance], Any]
    ): js.Promise[js.Array[BucketInstance]] = js.native
    def list(opts: BucketListInstanceOptions): js.Promise[js.Array[BucketInstance]] = js.native
    def list(
      opts: BucketListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BucketInstance], Any]
    ): js.Promise[js.Array[BucketInstance]] = js.native
    
    /**
      * Retrieve a single page of BucketInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[BucketPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketPage, Any]): js.Promise[BucketPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketPage, Any]): js.Promise[BucketPage] = js.native
    def page(opts: BucketListInstancePageOptions): js.Promise[BucketPage] = js.native
    def page(
      opts: BucketListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BucketPage, Any]
    ): js.Promise[BucketPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property interval - Number of seconds that the rate limit will be enforced over.
    * @property max - Max number of requests.
    */
  trait BucketListInstanceCreateOptions extends StObject {
    
    var interval: Double
    
    var max: Double
  }
  object BucketListInstanceCreateOptions {
    
    inline def apply(interval: Double, max: Double): BucketListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketListInstanceCreateOptions]
    }
    
    extension [Self <: BucketListInstanceCreateOptions](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
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
  trait BucketListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ BucketInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object BucketListInstanceEachOptions {
    
    inline def apply(): BucketListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketListInstanceEachOptions]
    }
    
    extension [Self <: BucketListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ BucketInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait BucketListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object BucketListInstanceOptions {
    
    inline def apply(): BucketListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketListInstanceOptions]
    }
    
    extension [Self <: BucketListInstanceOptions](x: Self) {
      
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
  trait BucketListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object BucketListInstancePageOptions {
    
    inline def apply(): BucketListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketListInstancePageOptions]
    }
    
    extension [Self <: BucketListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait BucketPayload
    extends StObject
       with BucketResource
       with TwilioResponsePayload
  object BucketPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      interval: Double,
      max: Double,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      rate_limit_sid: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): BucketPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], rate_limit_sid = rate_limit_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketPayload]
    }
  }
  
  trait BucketResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var interval: Double
    
    var max: Double
    
    var rate_limit_sid: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object BucketResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      interval: Double,
      max: Double,
      rate_limit_sid: String,
      service_sid: String,
      sid: String,
      url: String
    ): BucketResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], rate_limit_sid = rate_limit_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketResource]
    }
    
    extension [Self <: BucketResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setRate_limit_sid(value: String): Self = StObject.set(x, "rate_limit_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait BucketSolution extends StObject {
    
    var rateLimitSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object BucketSolution {
    
    inline def apply(): BucketSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketSolution]
    }
    
    extension [Self <: BucketSolution](x: Self) {
      
      inline def setRateLimitSid(value: String): Self = StObject.set(x, "rateLimitSid", value.asInstanceOf[js.Any])
      
      inline def setRateLimitSidUndefined: Self = StObject.set(x, "rateLimitSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
