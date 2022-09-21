package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.`campaign-verify`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brandVettingMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/brandRegistration/brandVetting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/brandRegistration/brandVetting", "BrandVettingContext")
  @js.native
  open class BrandVettingContext protected () extends StObject {
    /**
      * Initialize the BrandVettingContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param brandSid - A2P BrandRegistration Sid
      * @param brandVettingSid - SID for third-party vetting record
      */
    def this(version: typings.twilio.messagingV1Mod.^, brandSid: String, brandVettingSid: String) = this()
    
    /**
      * fetch a BrandVettingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BrandVettingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandVettingInstance, Any]): js.Promise[BrandVettingInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/messaging/v1/brandRegistration/brandVetting", "BrandVettingInstance")
  @js.native
  open class BrandVettingInstance protected () extends SerializableClass {
    /**
      * Initialize the BrandVettingContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param brandSid - A2P BrandRegistration Sid
      * @param brandVettingSid - SID for third-party vetting record
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      payload: BrandVettingPayload,
      brandSid: String,
      brandVettingSid: String
    ) = this()
    
    /* private */ var _proxy: BrandVettingContext = js.native
    
    var accountSid: String = js.native
    
    var brandSid: String = js.native
    
    var brandVettingSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a BrandVettingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BrandVettingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BrandVettingInstance] = js.native
    
    var url: String = js.native
    
    var vettingClass: String = js.native
    
    var vettingId: String = js.native
    
    var vettingProvider: BrandVettingVettingProvider = js.native
    
    var vettingStatus: String = js.native
  }
  
  /**
    * Initialize the BrandVettingList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param brandSid - A2P BrandRegistration Sid
    */
  inline def BrandVettingList(version: typings.twilio.messagingV1Mod.^, brandSid: String): BrandVettingListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("BrandVettingList")(version.asInstanceOf[js.Any], brandSid.asInstanceOf[js.Any])).asInstanceOf[BrandVettingListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/brandRegistration/brandVetting", "BrandVettingPage")
  @js.native
  open class BrandVettingPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.messagingV1Mod.^, 
          BrandVettingPayload, 
          BrandVettingResource, 
          BrandVettingInstance
        ] {
    /**
      * Initialize the BrandVettingPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: BrandVettingSolution
    ) = this()
    
    /**
      * Build an instance of BrandVettingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BrandVettingPayload): BrandVettingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait BrandVettingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): BrandVettingContext = js.native
    
    /**
      * create a BrandVettingInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: BrandVettingListInstanceCreateOptions): js.Promise[BrandVettingInstance] = js.native
    def create(
      opts: BrandVettingListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ BrandVettingInstance, Any]
    ): js.Promise[BrandVettingInstance] = js.native
    
    /**
      * Streams BrandVettingInstance records from the API.
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
          /* item */ BrandVettingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ BrandVettingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: BrandVettingListInstanceEachOptions): Unit = js.native
    def each(
      opts: BrandVettingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ BrandVettingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a brand_vetting
      *
      * @param brandVettingSid - SID for third-party vetting record
      */
    def get(brandVettingSid: String): BrandVettingContext = js.native
    
    /**
      * Retrieve a single target page of BrandVettingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[BrandVettingPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandVettingPage, Any]): js.Promise[BrandVettingPage] = js.native
    def getPage(targetUrl: String): js.Promise[BrandVettingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandVettingPage, Any]
    ): js.Promise[BrandVettingPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandVettingPage, Any]
    ): js.Promise[BrandVettingPage] = js.native
    
    /**
      * Lists BrandVettingInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[BrandVettingInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BrandVettingInstance], Any]
    ): js.Promise[js.Array[BrandVettingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BrandVettingInstance], Any]
    ): js.Promise[js.Array[BrandVettingInstance]] = js.native
    def list(opts: BrandVettingListInstanceOptions): js.Promise[js.Array[BrandVettingInstance]] = js.native
    def list(
      opts: BrandVettingListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BrandVettingInstance], Any]
    ): js.Promise[js.Array[BrandVettingInstance]] = js.native
    
    /**
      * Retrieve a single page of BrandVettingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[BrandVettingPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandVettingPage, Any]): js.Promise[BrandVettingPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandVettingPage, Any]): js.Promise[BrandVettingPage] = js.native
    def page(opts: BrandVettingListInstancePageOptions): js.Promise[BrandVettingPage] = js.native
    def page(
      opts: BrandVettingListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandVettingPage, Any]
    ): js.Promise[BrandVettingPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property vettingId - The unique ID of the vetting
    * @property vettingProvider - Third-party provider of the vettings to create
    */
  trait BrandVettingListInstanceCreateOptions extends StObject {
    
    var vettingId: js.UndefOr[String] = js.undefined
    
    var vettingProvider: BrandVettingVettingProvider
  }
  object BrandVettingListInstanceCreateOptions {
    
    inline def apply(vettingProvider: BrandVettingVettingProvider): BrandVettingListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(vettingProvider = vettingProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandVettingListInstanceCreateOptions]
    }
    
    extension [Self <: BrandVettingListInstanceCreateOptions](x: Self) {
      
      inline def setVettingId(value: String): Self = StObject.set(x, "vettingId", value.asInstanceOf[js.Any])
      
      inline def setVettingIdUndefined: Self = StObject.set(x, "vettingId", js.undefined)
      
      inline def setVettingProvider(value: BrandVettingVettingProvider): Self = StObject.set(x, "vettingProvider", value.asInstanceOf[js.Any])
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
    * @property vettingProvider - Third-party provider of the vettings to create
    */
  trait BrandVettingListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ BrandVettingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var vettingProvider: js.UndefOr[BrandVettingVettingProvider] = js.undefined
  }
  object BrandVettingListInstanceEachOptions {
    
    inline def apply(): BrandVettingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrandVettingListInstanceEachOptions]
    }
    
    extension [Self <: BrandVettingListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ BrandVettingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setVettingProvider(value: BrandVettingVettingProvider): Self = StObject.set(x, "vettingProvider", value.asInstanceOf[js.Any])
      
      inline def setVettingProviderUndefined: Self = StObject.set(x, "vettingProvider", js.undefined)
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
    * @property vettingProvider - Third-party provider of the vettings to create
    */
  trait BrandVettingListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var vettingProvider: js.UndefOr[BrandVettingVettingProvider] = js.undefined
  }
  object BrandVettingListInstanceOptions {
    
    inline def apply(): BrandVettingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrandVettingListInstanceOptions]
    }
    
    extension [Self <: BrandVettingListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setVettingProvider(value: BrandVettingVettingProvider): Self = StObject.set(x, "vettingProvider", value.asInstanceOf[js.Any])
      
      inline def setVettingProviderUndefined: Self = StObject.set(x, "vettingProvider", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property vettingProvider - Third-party provider of the vettings to create
    */
  trait BrandVettingListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var vettingProvider: js.UndefOr[BrandVettingVettingProvider] = js.undefined
  }
  object BrandVettingListInstancePageOptions {
    
    inline def apply(): BrandVettingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrandVettingListInstancePageOptions]
    }
    
    extension [Self <: BrandVettingListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setVettingProvider(value: BrandVettingVettingProvider): Self = StObject.set(x, "vettingProvider", value.asInstanceOf[js.Any])
      
      inline def setVettingProviderUndefined: Self = StObject.set(x, "vettingProvider", js.undefined)
    }
  }
  
  trait BrandVettingPayload
    extends StObject
       with BrandVettingResource
       with TwilioResponsePayload
  object BrandVettingPayload {
    
    inline def apply(
      account_sid: String,
      brand_sid: String,
      brand_vetting_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String,
      vetting_class: String,
      vetting_id: String,
      vetting_provider: BrandVettingVettingProvider,
      vetting_status: String
    ): BrandVettingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], brand_sid = brand_sid.asInstanceOf[js.Any], brand_vetting_sid = brand_vetting_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vetting_class = vetting_class.asInstanceOf[js.Any], vetting_id = vetting_id.asInstanceOf[js.Any], vetting_provider = vetting_provider.asInstanceOf[js.Any], vetting_status = vetting_status.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandVettingPayload]
    }
  }
  
  trait BrandVettingResource extends StObject {
    
    var account_sid: String
    
    var brand_sid: String
    
    var brand_vetting_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var url: String
    
    var vetting_class: String
    
    var vetting_id: String
    
    var vetting_provider: BrandVettingVettingProvider
    
    var vetting_status: String
  }
  object BrandVettingResource {
    
    inline def apply(
      account_sid: String,
      brand_sid: String,
      brand_vetting_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      url: String,
      vetting_class: String,
      vetting_id: String,
      vetting_provider: BrandVettingVettingProvider,
      vetting_status: String
    ): BrandVettingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], brand_sid = brand_sid.asInstanceOf[js.Any], brand_vetting_sid = brand_vetting_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vetting_class = vetting_class.asInstanceOf[js.Any], vetting_id = vetting_id.asInstanceOf[js.Any], vetting_provider = vetting_provider.asInstanceOf[js.Any], vetting_status = vetting_status.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandVettingResource]
    }
    
    extension [Self <: BrandVettingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBrand_sid(value: String): Self = StObject.set(x, "brand_sid", value.asInstanceOf[js.Any])
      
      inline def setBrand_vetting_sid(value: String): Self = StObject.set(x, "brand_vetting_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVetting_class(value: String): Self = StObject.set(x, "vetting_class", value.asInstanceOf[js.Any])
      
      inline def setVetting_id(value: String): Self = StObject.set(x, "vetting_id", value.asInstanceOf[js.Any])
      
      inline def setVetting_provider(value: BrandVettingVettingProvider): Self = StObject.set(x, "vetting_provider", value.asInstanceOf[js.Any])
      
      inline def setVetting_status(value: String): Self = StObject.set(x, "vetting_status", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrandVettingSolution extends StObject {
    
    var brandSid: js.UndefOr[String] = js.undefined
  }
  object BrandVettingSolution {
    
    inline def apply(): BrandVettingSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrandVettingSolution]
    }
    
    extension [Self <: BrandVettingSolution](x: Self) {
      
      inline def setBrandSid(value: String): Self = StObject.set(x, "brandSid", value.asInstanceOf[js.Any])
      
      inline def setBrandSidUndefined: Self = StObject.set(x, "brandSid", js.undefined)
    }
  }
  
  type BrandVettingVettingProvider = `campaign-verify`
}
