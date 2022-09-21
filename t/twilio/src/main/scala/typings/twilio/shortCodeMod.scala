package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortCodeMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/shortCode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/shortCode", "ShortCodeContext")
  @js.native
  open class ShortCodeContext protected () extends StObject {
    /**
      * Initialize the ShortCodeContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource(s) to fetch
      * @param sid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a ShortCodeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ShortCodeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ShortCodeInstance, Any]): js.Promise[ShortCodeInstance] = js.native
    
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
  
  @JSImport("twilio/lib/rest/api/v2010/account/shortCode", "ShortCodeInstance")
  @js.native
  open class ShortCodeInstance protected () extends SerializableClass {
    /**
      * Initialize the ShortCodeContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created this resource
      * @param sid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: ShortCodePayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: ShortCodeContext = js.native
    
    var accountSid: String = js.native
    
    var apiVersion: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ShortCodeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ShortCodeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ShortCodeInstance] = js.native
    
    var friendlyName: String = js.native
    
    var shortCode: String = js.native
    
    var sid: String = js.native
    
    var smsFallbackMethod: String = js.native
    
    var smsFallbackUrl: String = js.native
    
    var smsMethod: String = js.native
    
    var smsUrl: String = js.native
    
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
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the ShortCodeList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created this resource
    */
  inline def ShortCodeList(version: typings.twilio.v2010Mod.^, accountSid: String): ShortCodeListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ShortCodeList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[ShortCodeListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/shortCode", "ShortCodePage")
  @js.native
  open class ShortCodePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, ShortCodePayload, ShortCodeResource, ShortCodeInstance] {
    /**
      * Initialize the ShortCodePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
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
    * @property apiVersion - The API version to use to start a new TwiML session
    * @property friendlyName - A string to describe this resource
    * @property smsFallbackMethod - HTTP method Twilio will use with sms_fallback_url
    * @property smsFallbackUrl - URL Twilio will request if an error occurs in executing TwiML
    * @property smsMethod - HTTP method to use when requesting the sms url
    * @property smsUrl - URL Twilio will request when receiving an SMS
    */
  trait ShortCodeInstanceUpdateOptions extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var smsFallbackMethod: js.UndefOr[String] = js.undefined
    
    var smsFallbackUrl: js.UndefOr[String] = js.undefined
    
    var smsMethod: js.UndefOr[String] = js.undefined
    
    var smsUrl: js.UndefOr[String] = js.undefined
  }
  object ShortCodeInstanceUpdateOptions {
    
    inline def apply(): ShortCodeInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortCodeInstanceUpdateOptions]
    }
    
    extension [Self <: ShortCodeInstanceUpdateOptions](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setSmsFallbackMethod(value: String): Self = StObject.set(x, "smsFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackMethodUndefined: Self = StObject.set(x, "smsFallbackMethod", js.undefined)
      
      inline def setSmsFallbackUrl(value: String): Self = StObject.set(x, "smsFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackUrlUndefined: Self = StObject.set(x, "smsFallbackUrl", js.undefined)
      
      inline def setSmsMethod(value: String): Self = StObject.set(x, "smsMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsMethodUndefined: Self = StObject.set(x, "smsMethod", js.undefined)
      
      inline def setSmsUrl(value: String): Self = StObject.set(x, "smsUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsUrlUndefined: Self = StObject.set(x, "smsUrl", js.undefined)
    }
  }
  
  @js.native
  trait ShortCodeListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ShortCodeContext = js.native
    
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
      * @param sid - The unique string that identifies this resource
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
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The string that identifies the ShortCode resources to read
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
    * @property shortCode - Filter by ShortCode
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
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var shortCode: js.UndefOr[String] = js.undefined
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
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setShortCode(value: String): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
      
      inline def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - The string that identifies the ShortCode resources to read
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
    * @property shortCode - Filter by ShortCode
    */
  trait ShortCodeListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var shortCode: js.UndefOr[String] = js.undefined
  }
  object ShortCodeListInstanceOptions {
    
    inline def apply(): ShortCodeListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortCodeListInstanceOptions]
    }
    
    extension [Self <: ShortCodeListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setShortCode(value: String): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
      
      inline def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - The string that identifies the ShortCode resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property shortCode - Filter by ShortCode
    */
  trait ShortCodeListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var shortCode: js.UndefOr[String] = js.undefined
  }
  object ShortCodeListInstancePageOptions {
    
    inline def apply(): ShortCodeListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortCodeListInstancePageOptions]
    }
    
    extension [Self <: ShortCodeListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setShortCode(value: String): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
      
      inline def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait ShortCodePayload
    extends StObject
       with ShortCodeResource {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
  }
  object ShortCodePayload {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      short_code: String,
      sid: String,
      sms_fallback_method: String,
      sms_fallback_url: String,
      sms_method: String,
      sms_url: String,
      uri: String
    ): ShortCodePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], short_code = short_code.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortCodePayload]
    }
    
    extension [Self <: ShortCodePayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShortCodeResource extends StObject {
    
    var account_sid: String
    
    var api_version: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var short_code: String
    
    var sid: String
    
    var sms_fallback_method: String
    
    var sms_fallback_url: String
    
    var sms_method: String
    
    var sms_url: String
    
    var uri: String
  }
  object ShortCodeResource {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      short_code: String,
      sid: String,
      sms_fallback_method: String,
      sms_fallback_url: String,
      sms_method: String,
      sms_url: String,
      uri: String
    ): ShortCodeResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], short_code = short_code.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortCodeResource]
    }
    
    extension [Self <: ShortCodeResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setShort_code(value: String): Self = StObject.set(x, "short_code", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSms_fallback_method(value: String): Self = StObject.set(x, "sms_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setSms_fallback_url(value: String): Self = StObject.set(x, "sms_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setSms_method(value: String): Self = StObject.set(x, "sms_method", value.asInstanceOf[js.Any])
      
      inline def setSms_url(value: String): Self = StObject.set(x, "sms_url", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShortCodeSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object ShortCodeSolution {
    
    inline def apply(): ShortCodeSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortCodeSolution]
    }
    
    extension [Self <: ShortCodeSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
