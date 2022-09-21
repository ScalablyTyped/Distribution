package typings.twilio

import typings.twilio.interfacesMod.PhoneNumberCapabilities
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ServiceShortCodeMod {
  
  @JSImport("twilio/lib/rest/proxy/v1/service/shortCode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/proxy/v1/service/shortCode", "ShortCodeContext")
  @js.native
  open class ShortCodeContext protected () extends StObject {
    /**
      * Initialize the ShortCodeContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the parent Service to fetch the resource from
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.proxyV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a ShortCodeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ShortCodeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodeInstance, Any]): js.Promise[ShortCodeInstance] = js.native
    
    /**
      * remove a ShortCodeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodeInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ShortCodeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ShortCodeInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodeInstance, Any]): js.Promise[ShortCodeInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodeInstance, Any]
    ): js.Promise[ShortCodeInstance] = js.native
    def update(opts: ShortCodeInstanceUpdateOptions): js.Promise[ShortCodeInstance] = js.native
    def update(
      opts: ShortCodeInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodeInstance, Any]
    ): js.Promise[ShortCodeInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/proxy/v1/service/shortCode", "ShortCodeInstance")
  @js.native
  open class ShortCodeInstance protected () extends SerializableClass {
    /**
      * Initialize the ShortCodeContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the resource's parent Service
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.proxyV1Mod.^, payload: ShortCodePayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: ShortCodeContext = js.native
    
    var accountSid: String = js.native
    
    var capabilities: PhoneNumberCapabilities = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ShortCodeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ShortCodeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ShortCodeInstance] = js.native
    
    var isReserved: Boolean = js.native
    
    var isoCountry: String = js.native
    
    /**
      * remove a ShortCodeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var shortCode: String = js.native
    
    var sid: String = js.native
    
    /**
      * update a ShortCodeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ShortCodeInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ShortCodeInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ShortCodeInstance] = js.native
    def update(opts: ShortCodeInstanceUpdateOptions): js.Promise[ShortCodeInstance] = js.native
    def update(
      opts: ShortCodeInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ShortCodeInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ShortCodeList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the resource's parent Service
    */
  inline def ShortCodeList(version: typings.twilio.proxyV1Mod.^, serviceSid: String): ShortCodeListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ShortCodeList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[ShortCodeListInstance]
  
  @JSImport("twilio/lib/rest/proxy/v1/service/shortCode", "ShortCodePage")
  @js.native
  open class ShortCodePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.proxyV1Mod.^, ShortCodePayload, ShortCodeResource, ShortCodeInstance] {
    /**
      * Initialize the ShortCodePage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.proxyV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ShortCodeSolution
    ) = this()
    
    /**
      * Build an instance of ShortCodeInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ShortCodePayload): ShortCodeInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property isReserved - Whether the short code should be reserved for manual assignment to participants only
    */
  trait ShortCodeInstanceUpdateOptions extends StObject {
    
    var isReserved: js.UndefOr[Boolean] = js.undefined
  }
  object ShortCodeInstanceUpdateOptions {
    
    inline def apply(): ShortCodeInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortCodeInstanceUpdateOptions]
    }
    
    extension [Self <: ShortCodeInstanceUpdateOptions](x: Self) {
      
      inline def setIsReserved(value: Boolean): Self = StObject.set(x, "isReserved", value.asInstanceOf[js.Any])
      
      inline def setIsReservedUndefined: Self = StObject.set(x, "isReserved", js.undefined)
    }
  }
  
  @js.native
  trait ShortCodeListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ShortCodeContext = js.native
    
    /**
      * create a ShortCodeInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ShortCodeListInstanceCreateOptions): js.Promise[ShortCodeInstance] = js.native
    def create(
      opts: ShortCodeListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ShortCodeInstance, Any]
    ): js.Promise[ShortCodeInstance] = js.native
    
    /**
      * Streams ShortCodeInstance records from the API.
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
          /* item */ ShortCodeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ShortCodeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ShortCodeListInstanceEachOptions): Unit = js.native
    def each(
      opts: ShortCodeListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ShortCodeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a short_code
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ShortCodeContext = js.native
    
    /**
      * Retrieve a single target page of ShortCodeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ShortCodePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodePage, Any]): js.Promise[ShortCodePage] = js.native
    def getPage(targetUrl: String): js.Promise[ShortCodePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodePage, Any]
    ): js.Promise[ShortCodePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodePage, Any]
    ): js.Promise[ShortCodePage] = js.native
    
    /**
      * Lists ShortCodeInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ShortCodeInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ShortCodeInstance], Any]): js.Promise[js.Array[ShortCodeInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ShortCodeInstance], Any]
    ): js.Promise[js.Array[ShortCodeInstance]] = js.native
    def list(opts: ShortCodeListInstanceOptions): js.Promise[js.Array[ShortCodeInstance]] = js.native
    def list(
      opts: ShortCodeListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ShortCodeInstance], Any]
    ): js.Promise[js.Array[ShortCodeInstance]] = js.native
    
    /**
      * Retrieve a single page of ShortCodeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ShortCodePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodePage, Any]): js.Promise[ShortCodePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodePage, Any]): js.Promise[ShortCodePage] = js.native
    def page(opts: ShortCodeListInstancePageOptions): js.Promise[ShortCodePage] = js.native
    def page(
      opts: ShortCodeListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodePage, Any]
    ): js.Promise[ShortCodePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property sid - The SID of a Twilio ShortCode resource
    */
  trait ShortCodeListInstanceCreateOptions extends StObject {
    
    var sid: String
  }
  object ShortCodeListInstanceCreateOptions {
    
    inline def apply(sid: String): ShortCodeListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortCodeListInstanceCreateOptions]
    }
    
    extension [Self <: ShortCodeListInstanceCreateOptions](x: Self) {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
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
  trait ShortCodeListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ShortCodeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ShortCodeListInstanceEachOptions {
    
    inline def apply(): ShortCodeListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortCodeListInstanceEachOptions]
    }
    
    extension [Self <: ShortCodeListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ShortCodeInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ShortCodeListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ShortCodeListInstanceOptions {
    
    inline def apply(): ShortCodeListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortCodeListInstanceOptions]
    }
    
    extension [Self <: ShortCodeListInstanceOptions](x: Self) {
      
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
  trait ShortCodeListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ShortCodeListInstancePageOptions {
    
    inline def apply(): ShortCodeListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortCodeListInstancePageOptions]
    }
    
    extension [Self <: ShortCodeListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ShortCodePayload
    extends StObject
       with ShortCodeResource
       with TwilioResponsePayload
  object ShortCodePayload {
    
    inline def apply(
      account_sid: String,
      capabilities: PhoneNumberCapabilities,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      is_reserved: Boolean,
      iso_country: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      short_code: String,
      sid: String,
      uri: String,
      url: String
    ): ShortCodePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], is_reserved = is_reserved.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], short_code = short_code.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortCodePayload]
    }
  }
  
  trait ShortCodeResource extends StObject {
    
    var account_sid: String
    
    var capabilities: PhoneNumberCapabilities
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var is_reserved: Boolean
    
    var iso_country: String
    
    var service_sid: String
    
    var short_code: String
    
    var sid: String
    
    var url: String
  }
  object ShortCodeResource {
    
    inline def apply(
      account_sid: String,
      capabilities: PhoneNumberCapabilities,
      date_created: js.Date,
      date_updated: js.Date,
      is_reserved: Boolean,
      iso_country: String,
      service_sid: String,
      short_code: String,
      sid: String,
      url: String
    ): ShortCodeResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], is_reserved = is_reserved.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], short_code = short_code.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortCodeResource]
    }
    
    extension [Self <: ShortCodeResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: PhoneNumberCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setIs_reserved(value: Boolean): Self = StObject.set(x, "is_reserved", value.asInstanceOf[js.Any])
      
      inline def setIso_country(value: String): Self = StObject.set(x, "iso_country", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setShort_code(value: String): Self = StObject.set(x, "short_code", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShortCodeSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object ShortCodeSolution {
    
    inline def apply(): ShortCodeSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortCodeSolution]
    }
    
    extension [Self <: ShortCodeSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
