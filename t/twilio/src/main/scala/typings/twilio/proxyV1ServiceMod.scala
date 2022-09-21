package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.sessionMod.SessionContext
import typings.twilio.sessionMod.SessionListInstance
import typings.twilio.v1ServicePhoneNumberMod.PhoneNumberContext
import typings.twilio.v1ServicePhoneNumberMod.PhoneNumberListInstance
import typings.twilio.v1ServiceShortCodeMod.ShortCodeContext
import typings.twilio.v1ServiceShortCodeMod.ShortCodeListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyV1ServiceMod {
  
  @JSImport("twilio/lib/rest/proxy/v1/service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/proxy/v1/service", "ServiceContext")
  @js.native
  open class ServiceContext protected () extends StObject {
    /**
      * Initialize the ServiceContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.proxyV1Mod.^, sid: String) = this()
    
    /**
      * fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def phoneNumbers(sid: String): PhoneNumberContext = js.native
    @JSName("phoneNumbers")
    var phoneNumbers_Original: PhoneNumberListInstance = js.native
    
    /**
      * remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def sessions(sid: String): SessionContext = js.native
    @JSName("sessions")
    var sessions_Original: SessionListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def shortCodes(sid: String): ShortCodeContext = js.native
    @JSName("shortCodes")
    var shortCodes_Original: ShortCodeListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ServiceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: ServiceInstanceUpdateOptions): js.Promise[ServiceInstance] = js.native
    def update(
      opts: ServiceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]
    ): js.Promise[ServiceInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/proxy/v1/service", "ServiceInstance")
  @js.native
  open class ServiceInstance protected () extends SerializableClass {
    /**
      * Initialize the ServiceContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.proxyV1Mod.^, payload: ServicePayload, sid: String) = this()
    
    /* private */ var _proxy: ServiceContext = js.native
    
    var accountSid: String = js.native
    
    var callbackUrl: String = js.native
    
    var chatInstanceSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var defaultTtl: Double = js.native
    
    /**
      * fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    
    var geoMatchLevel: ServiceGeoMatchLevel = js.native
    
    var interceptCallbackUrl: String = js.native
    
    var links: String = js.native
    
    var numberSelectionBehavior: ServiceNumberSelectionBehavior = js.native
    
    var outOfSessionCallbackUrl: String = js.native
    
    /**
      * Access the phoneNumbers
      */
    def phoneNumbers(): PhoneNumberListInstance = js.native
    
    /**
      * remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Access the sessions
      */
    def sessions(): SessionListInstance = js.native
    
    /**
      * Access the shortCodes
      */
    def shortCodes(): ShortCodeListInstance = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ServiceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: ServiceInstanceUpdateOptions): js.Promise[ServiceInstance] = js.native
    def update(
      opts: ServiceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ServiceInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ServiceList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def ServiceList(version: typings.twilio.proxyV1Mod.^): ServiceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ServiceList")(version.asInstanceOf[js.Any]).asInstanceOf[ServiceListInstance]
  
  @JSImport("twilio/lib/rest/proxy/v1/service", "ServicePage")
  @js.native
  open class ServicePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.proxyV1Mod.^, ServicePayload, ServiceResource, ServiceInstance] {
    /**
      * Initialize the ServicePage
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
      solution: ServiceSolution
    ) = this()
    
    /**
      * Build an instance of ServiceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ServicePayload): ServiceInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`area-code`
    - typings.twilio.twilioStrings.overlay
    - typings.twilio.twilioStrings.radius
    - typings.twilio.twilioStrings.country
  */
  trait ServiceGeoMatchLevel extends StObject
  object ServiceGeoMatchLevel {
    
    inline def `area-code`: typings.twilio.twilioStrings.`area-code` = "area-code".asInstanceOf[typings.twilio.twilioStrings.`area-code`]
    
    inline def country: typings.twilio.twilioStrings.country = "country".asInstanceOf[typings.twilio.twilioStrings.country]
    
    inline def overlay: typings.twilio.twilioStrings.overlay = "overlay".asInstanceOf[typings.twilio.twilioStrings.overlay]
    
    inline def radius: typings.twilio.twilioStrings.radius = "radius".asInstanceOf[typings.twilio.twilioStrings.radius]
  }
  
  /**
    * Options to pass to update
    *
    * @property callbackUrl - The URL we should call when the interaction status changes
    * @property chatInstanceSid - The SID of the Chat Service Instance
    * @property defaultTtl - Default TTL for a Session, in seconds
    * @property geoMatchLevel - Where a proxy number must be located relative to the participant identifier
    * @property interceptCallbackUrl - The URL we call on each interaction
    * @property numberSelectionBehavior - The preference for Proxy Number selection for the Service instance
    * @property outOfSessionCallbackUrl - The URL we call when an inbound call or SMS action occurs on a closed or non-existent Session
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait ServiceInstanceUpdateOptions extends StObject {
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var chatInstanceSid: js.UndefOr[String] = js.undefined
    
    var defaultTtl: js.UndefOr[Double] = js.undefined
    
    var geoMatchLevel: js.UndefOr[ServiceGeoMatchLevel] = js.undefined
    
    var interceptCallbackUrl: js.UndefOr[String] = js.undefined
    
    var numberSelectionBehavior: js.UndefOr[ServiceNumberSelectionBehavior] = js.undefined
    
    var outOfSessionCallbackUrl: js.UndefOr[String] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object ServiceInstanceUpdateOptions {
    
    inline def apply(): ServiceInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceInstanceUpdateOptions]
    }
    
    extension [Self <: ServiceInstanceUpdateOptions](x: Self) {
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setChatInstanceSid(value: String): Self = StObject.set(x, "chatInstanceSid", value.asInstanceOf[js.Any])
      
      inline def setChatInstanceSidUndefined: Self = StObject.set(x, "chatInstanceSid", js.undefined)
      
      inline def setDefaultTtl(value: Double): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
      
      inline def setDefaultTtlUndefined: Self = StObject.set(x, "defaultTtl", js.undefined)
      
      inline def setGeoMatchLevel(value: ServiceGeoMatchLevel): Self = StObject.set(x, "geoMatchLevel", value.asInstanceOf[js.Any])
      
      inline def setGeoMatchLevelUndefined: Self = StObject.set(x, "geoMatchLevel", js.undefined)
      
      inline def setInterceptCallbackUrl(value: String): Self = StObject.set(x, "interceptCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setInterceptCallbackUrlUndefined: Self = StObject.set(x, "interceptCallbackUrl", js.undefined)
      
      inline def setNumberSelectionBehavior(value: ServiceNumberSelectionBehavior): Self = StObject.set(x, "numberSelectionBehavior", value.asInstanceOf[js.Any])
      
      inline def setNumberSelectionBehaviorUndefined: Self = StObject.set(x, "numberSelectionBehavior", js.undefined)
      
      inline def setOutOfSessionCallbackUrl(value: String): Self = StObject.set(x, "outOfSessionCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setOutOfSessionCallbackUrlUndefined: Self = StObject.set(x, "outOfSessionCallbackUrl", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait ServiceListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ServiceContext = js.native
    
    /**
      * create a ServiceInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ServiceListInstanceCreateOptions): js.Promise[ServiceInstance] = js.native
    def create(
      opts: ServiceListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ServiceInstance, Any]
    ): js.Promise[ServiceInstance] = js.native
    
    /**
      * Streams ServiceInstance records from the API.
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
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ServiceListInstanceEachOptions): Unit = js.native
    def each(
      opts: ServiceListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a service
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ServiceContext = js.native
    
    /**
      * Retrieve a single target page of ServiceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ServicePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def getPage(targetUrl: String): js.Promise[ServicePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]
    ): js.Promise[ServicePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    
    /**
      * Lists ServiceInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]
    ): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(opts: ServiceListInstanceOptions): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(
      opts: ServiceListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]
    ): js.Promise[js.Array[ServiceInstance]] = js.native
    
    /**
      * Retrieve a single page of ServiceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ServicePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def page(opts: ServiceListInstancePageOptions): js.Promise[ServicePage] = js.native
    def page(
      opts: ServiceListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]
    ): js.Promise[ServicePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property callbackUrl - The URL we should call when the interaction status changes
    * @property chatInstanceSid - The SID of the Chat Service Instance
    * @property defaultTtl - Default TTL for a Session, in seconds
    * @property geoMatchLevel - Where a proxy number must be located relative to the participant identifier
    * @property interceptCallbackUrl - The URL we call on each interaction
    * @property numberSelectionBehavior - The preference for Proxy Number selection for the Service instance
    * @property outOfSessionCallbackUrl - The URL we call when an inbound call or SMS action occurs on a closed or non-existent Session
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait ServiceListInstanceCreateOptions extends StObject {
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var chatInstanceSid: js.UndefOr[String] = js.undefined
    
    var defaultTtl: js.UndefOr[Double] = js.undefined
    
    var geoMatchLevel: js.UndefOr[ServiceGeoMatchLevel] = js.undefined
    
    var interceptCallbackUrl: js.UndefOr[String] = js.undefined
    
    var numberSelectionBehavior: js.UndefOr[ServiceNumberSelectionBehavior] = js.undefined
    
    var outOfSessionCallbackUrl: js.UndefOr[String] = js.undefined
    
    var uniqueName: String
  }
  object ServiceListInstanceCreateOptions {
    
    inline def apply(uniqueName: String): ServiceListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceListInstanceCreateOptions]
    }
    
    extension [Self <: ServiceListInstanceCreateOptions](x: Self) {
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setChatInstanceSid(value: String): Self = StObject.set(x, "chatInstanceSid", value.asInstanceOf[js.Any])
      
      inline def setChatInstanceSidUndefined: Self = StObject.set(x, "chatInstanceSid", js.undefined)
      
      inline def setDefaultTtl(value: Double): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
      
      inline def setDefaultTtlUndefined: Self = StObject.set(x, "defaultTtl", js.undefined)
      
      inline def setGeoMatchLevel(value: ServiceGeoMatchLevel): Self = StObject.set(x, "geoMatchLevel", value.asInstanceOf[js.Any])
      
      inline def setGeoMatchLevelUndefined: Self = StObject.set(x, "geoMatchLevel", js.undefined)
      
      inline def setInterceptCallbackUrl(value: String): Self = StObject.set(x, "interceptCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setInterceptCallbackUrlUndefined: Self = StObject.set(x, "interceptCallbackUrl", js.undefined)
      
      inline def setNumberSelectionBehavior(value: ServiceNumberSelectionBehavior): Self = StObject.set(x, "numberSelectionBehavior", value.asInstanceOf[js.Any])
      
      inline def setNumberSelectionBehaviorUndefined: Self = StObject.set(x, "numberSelectionBehavior", js.undefined)
      
      inline def setOutOfSessionCallbackUrl(value: String): Self = StObject.set(x, "outOfSessionCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setOutOfSessionCallbackUrlUndefined: Self = StObject.set(x, "outOfSessionCallbackUrl", js.undefined)
      
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
  trait ServiceListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ServiceListInstanceEachOptions {
    
    inline def apply(): ServiceListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceEachOptions]
    }
    
    extension [Self <: ServiceListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ServiceInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ServiceListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ServiceListInstanceOptions {
    
    inline def apply(): ServiceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceOptions]
    }
    
    extension [Self <: ServiceListInstanceOptions](x: Self) {
      
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
  trait ServiceListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ServiceListInstancePageOptions {
    
    inline def apply(): ServiceListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstancePageOptions]
    }
    
    extension [Self <: ServiceListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`avoid-sticky`
    - typings.twilio.twilioStrings.`prefer-sticky`
  */
  trait ServiceNumberSelectionBehavior extends StObject
  object ServiceNumberSelectionBehavior {
    
    inline def `avoid-sticky`: typings.twilio.twilioStrings.`avoid-sticky` = "avoid-sticky".asInstanceOf[typings.twilio.twilioStrings.`avoid-sticky`]
    
    inline def `prefer-sticky`: typings.twilio.twilioStrings.`prefer-sticky` = "prefer-sticky".asInstanceOf[typings.twilio.twilioStrings.`prefer-sticky`]
  }
  
  trait ServicePayload
    extends StObject
       with ServiceResource
       with TwilioResponsePayload
  object ServicePayload {
    
    inline def apply(
      account_sid: String,
      callback_url: String,
      chat_instance_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      default_ttl: Double,
      first_page_uri: String,
      geo_match_level: ServiceGeoMatchLevel,
      intercept_callback_url: String,
      links: String,
      next_page_uri: String,
      number_selection_behavior: ServiceNumberSelectionBehavior,
      out_of_session_callback_url: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): ServicePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], callback_url = callback_url.asInstanceOf[js.Any], chat_instance_sid = chat_instance_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_ttl = default_ttl.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], geo_match_level = geo_match_level.asInstanceOf[js.Any], intercept_callback_url = intercept_callback_url.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], number_selection_behavior = number_selection_behavior.asInstanceOf[js.Any], out_of_session_callback_url = out_of_session_callback_url.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServicePayload]
    }
  }
  
  trait ServiceResource extends StObject {
    
    var account_sid: String
    
    var callback_url: String
    
    var chat_instance_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var default_ttl: Double
    
    var geo_match_level: ServiceGeoMatchLevel
    
    var intercept_callback_url: String
    
    var links: String
    
    var number_selection_behavior: ServiceNumberSelectionBehavior
    
    var out_of_session_callback_url: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object ServiceResource {
    
    inline def apply(
      account_sid: String,
      callback_url: String,
      chat_instance_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      default_ttl: Double,
      geo_match_level: ServiceGeoMatchLevel,
      intercept_callback_url: String,
      links: String,
      number_selection_behavior: ServiceNumberSelectionBehavior,
      out_of_session_callback_url: String,
      sid: String,
      unique_name: String,
      url: String
    ): ServiceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], callback_url = callback_url.asInstanceOf[js.Any], chat_instance_sid = chat_instance_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_ttl = default_ttl.asInstanceOf[js.Any], geo_match_level = geo_match_level.asInstanceOf[js.Any], intercept_callback_url = intercept_callback_url.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], number_selection_behavior = number_selection_behavior.asInstanceOf[js.Any], out_of_session_callback_url = out_of_session_callback_url.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceResource]
    }
    
    extension [Self <: ServiceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
      
      inline def setChat_instance_sid(value: String): Self = StObject.set(x, "chat_instance_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDefault_ttl(value: Double): Self = StObject.set(x, "default_ttl", value.asInstanceOf[js.Any])
      
      inline def setGeo_match_level(value: ServiceGeoMatchLevel): Self = StObject.set(x, "geo_match_level", value.asInstanceOf[js.Any])
      
      inline def setIntercept_callback_url(value: String): Self = StObject.set(x, "intercept_callback_url", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setNumber_selection_behavior(value: ServiceNumberSelectionBehavior): Self = StObject.set(x, "number_selection_behavior", value.asInstanceOf[js.Any])
      
      inline def setOut_of_session_callback_url(value: String): Self = StObject.set(x, "out_of_session_callback_url", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceSolution extends StObject
}
