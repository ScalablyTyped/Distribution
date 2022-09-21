package typings.twilio

import typings.twilio.alphaSenderMod.AlphaSenderContext
import typings.twilio.alphaSenderMod.AlphaSenderListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.servicePhoneNumberMod.PhoneNumberContext
import typings.twilio.servicePhoneNumberMod.PhoneNumberListInstance
import typings.twilio.serviceShortCodeMod.ShortCodeContext
import typings.twilio.serviceShortCodeMod.ShortCodeListInstance
import typings.twilio.usAppToPersonMod.UsAppToPersonContext
import typings.twilio.usAppToPersonMod.UsAppToPersonListInstance
import typings.twilio.usAppToPersonUsecaseMod.UsAppToPersonUsecaseListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagingV1ServiceMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/service", "ServiceContext")
  @js.native
  open class ServiceContext protected () extends StObject {
    /**
      * Initialize the ServiceContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.messagingV1Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def alphaSenders(sid: String): AlphaSenderContext = js.native
    @JSName("alphaSenders")
    var alphaSenders_Original: AlphaSenderListInstance = js.native
    
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
    
    /**
      * @param sid - sid of instance
      */
    def usAppToPerson(sid: String): UsAppToPersonContext = js.native
    
    var usAppToPersonUsecases: UsAppToPersonUsecaseListInstance = js.native
    
    @JSName("usAppToPerson")
    var usAppToPerson_Original: UsAppToPersonListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/messaging/v1/service", "ServiceInstance")
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
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.messagingV1Mod.^, payload: ServicePayload, sid: String) = this()
    
    /* private */ var _proxy: ServiceContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the alphaSenders
      */
    def alphaSenders(): AlphaSenderListInstance = js.native
    
    var areaCodeGeomatch: Boolean = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var fallbackMethod: String = js.native
    
    var fallbackToLongCode: Boolean = js.native
    
    var fallbackUrl: String = js.native
    
    /**
      * fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    
    var friendlyName: String = js.native
    
    var inboundMethod: String = js.native
    
    var inboundRequestUrl: String = js.native
    
    var links: String = js.native
    
    var mmsConverter: Boolean = js.native
    
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
    
    var scanMessageContent: ServiceScanMessageContent = js.native
    
    /**
      * Access the shortCodes
      */
    def shortCodes(): ShortCodeListInstance = js.native
    
    var sid: String = js.native
    
    var smartEncoding: Boolean = js.native
    
    var statusCallback: String = js.native
    
    var stickySender: Boolean = js.native
    
    var synchronousValidation: Boolean = js.native
    
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
    
    /**
      * Access the usAppToPerson
      */
    def usAppToPerson(): UsAppToPersonListInstance = js.native
    
    var usAppToPersonRegistered: Boolean = js.native
    
    /**
      * Access the usAppToPersonUsecases
      */
    def usAppToPersonUsecases(): UsAppToPersonUsecaseListInstance = js.native
    
    var useInboundWebhookOnNumber: Boolean = js.native
    
    var usecase: String = js.native
    
    var validityPeriod: Double = js.native
  }
  
  /**
    * Initialize the ServiceList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def ServiceList(version: typings.twilio.messagingV1Mod.^): ServiceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ServiceList")(version.asInstanceOf[js.Any]).asInstanceOf[ServiceListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/service", "ServicePage")
  @js.native
  open class ServicePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.messagingV1Mod.^, ServicePayload, ServiceResource, ServiceInstance] {
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
      version: typings.twilio.messagingV1Mod.^,
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
  
  /**
    * Options to pass to update
    *
    * @property areaCodeGeomatch - Whether to enable Area Code Geomatch on the Service Instance
    * @property fallbackMethod - The HTTP method we should use to call fallback_url
    * @property fallbackToLongCode - Whether to enable Fallback to Long Code for messages sent through the Service instance
    * @property fallbackUrl - The URL that we call using fallback_method if an error occurs while retrieving or executing the TwiML from the Inbound Request URL. This field will be overridden if the `use_inbound_webhook_on_number` field is enabled.
    * @property friendlyName - A string to describe the resource
    * @property inboundMethod - The HTTP method we should use to call inbound_request_url
    * @property inboundRequestUrl - The URL we call using inbound_method when a message is received by any phone number or short code in the Service. This field will be overridden if the `use_inbound_webhook_on_number` field is enabled.
    * @property mmsConverter - Whether to enable the MMS Converter for messages sent through the Service instance
    * @property scanMessageContent - Reserved
    * @property smartEncoding - Whether to enable Encoding for messages sent through the Service instance
    * @property statusCallback - The URL we should call to pass status updates about message delivery
    * @property stickySender - Whether to enable Sticky Sender on the Service instance
    * @property synchronousValidation - Reserved
    * @property useInboundWebhookOnNumber - If enabled, the webhook url configured on the phone number will be used and will override the `inbound_request_url`/`fallback_url` url called when an inbound message is received.
    * @property usecase - A string describing the scenario in which the Messaging Service will be used
    * @property validityPeriod - How long, in seconds, messages sent from the Service are valid
    */
  trait ServiceInstanceUpdateOptions extends StObject {
    
    var areaCodeGeomatch: js.UndefOr[Boolean] = js.undefined
    
    var fallbackMethod: js.UndefOr[String] = js.undefined
    
    var fallbackToLongCode: js.UndefOr[Boolean] = js.undefined
    
    var fallbackUrl: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var inboundMethod: js.UndefOr[String] = js.undefined
    
    var inboundRequestUrl: js.UndefOr[String] = js.undefined
    
    var mmsConverter: js.UndefOr[Boolean] = js.undefined
    
    var scanMessageContent: js.UndefOr[ServiceScanMessageContent] = js.undefined
    
    var smartEncoding: js.UndefOr[Boolean] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var stickySender: js.UndefOr[Boolean] = js.undefined
    
    var synchronousValidation: js.UndefOr[Boolean] = js.undefined
    
    var useInboundWebhookOnNumber: js.UndefOr[Boolean] = js.undefined
    
    var usecase: js.UndefOr[String] = js.undefined
    
    var validityPeriod: js.UndefOr[Double] = js.undefined
  }
  object ServiceInstanceUpdateOptions {
    
    inline def apply(): ServiceInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceInstanceUpdateOptions]
    }
    
    extension [Self <: ServiceInstanceUpdateOptions](x: Self) {
      
      inline def setAreaCodeGeomatch(value: Boolean): Self = StObject.set(x, "areaCodeGeomatch", value.asInstanceOf[js.Any])
      
      inline def setAreaCodeGeomatchUndefined: Self = StObject.set(x, "areaCodeGeomatch", js.undefined)
      
      inline def setFallbackMethod(value: String): Self = StObject.set(x, "fallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setFallbackMethodUndefined: Self = StObject.set(x, "fallbackMethod", js.undefined)
      
      inline def setFallbackToLongCode(value: Boolean): Self = StObject.set(x, "fallbackToLongCode", value.asInstanceOf[js.Any])
      
      inline def setFallbackToLongCodeUndefined: Self = StObject.set(x, "fallbackToLongCode", js.undefined)
      
      inline def setFallbackUrl(value: String): Self = StObject.set(x, "fallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setFallbackUrlUndefined: Self = StObject.set(x, "fallbackUrl", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setInboundMethod(value: String): Self = StObject.set(x, "inboundMethod", value.asInstanceOf[js.Any])
      
      inline def setInboundMethodUndefined: Self = StObject.set(x, "inboundMethod", js.undefined)
      
      inline def setInboundRequestUrl(value: String): Self = StObject.set(x, "inboundRequestUrl", value.asInstanceOf[js.Any])
      
      inline def setInboundRequestUrlUndefined: Self = StObject.set(x, "inboundRequestUrl", js.undefined)
      
      inline def setMmsConverter(value: Boolean): Self = StObject.set(x, "mmsConverter", value.asInstanceOf[js.Any])
      
      inline def setMmsConverterUndefined: Self = StObject.set(x, "mmsConverter", js.undefined)
      
      inline def setScanMessageContent(value: ServiceScanMessageContent): Self = StObject.set(x, "scanMessageContent", value.asInstanceOf[js.Any])
      
      inline def setScanMessageContentUndefined: Self = StObject.set(x, "scanMessageContent", js.undefined)
      
      inline def setSmartEncoding(value: Boolean): Self = StObject.set(x, "smartEncoding", value.asInstanceOf[js.Any])
      
      inline def setSmartEncodingUndefined: Self = StObject.set(x, "smartEncoding", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setStickySender(value: Boolean): Self = StObject.set(x, "stickySender", value.asInstanceOf[js.Any])
      
      inline def setStickySenderUndefined: Self = StObject.set(x, "stickySender", js.undefined)
      
      inline def setSynchronousValidation(value: Boolean): Self = StObject.set(x, "synchronousValidation", value.asInstanceOf[js.Any])
      
      inline def setSynchronousValidationUndefined: Self = StObject.set(x, "synchronousValidation", js.undefined)
      
      inline def setUseInboundWebhookOnNumber(value: Boolean): Self = StObject.set(x, "useInboundWebhookOnNumber", value.asInstanceOf[js.Any])
      
      inline def setUseInboundWebhookOnNumberUndefined: Self = StObject.set(x, "useInboundWebhookOnNumber", js.undefined)
      
      inline def setUsecase(value: String): Self = StObject.set(x, "usecase", value.asInstanceOf[js.Any])
      
      inline def setUsecaseUndefined: Self = StObject.set(x, "usecase", js.undefined)
      
      inline def setValidityPeriod(value: Double): Self = StObject.set(x, "validityPeriod", value.asInstanceOf[js.Any])
      
      inline def setValidityPeriodUndefined: Self = StObject.set(x, "validityPeriod", js.undefined)
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
      * @param sid - The SID that identifies the resource to fetch
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
    * @property areaCodeGeomatch - Whether to enable Area Code Geomatch on the Service Instance
    * @property fallbackMethod - The HTTP method we should use to call fallback_url
    * @property fallbackToLongCode - Whether to enable Fallback to Long Code for messages sent through the Service instance
    * @property fallbackUrl - The URL that we call using fallback_method if an error occurs while retrieving or executing the TwiML from the Inbound Request URL. This field will be overridden if the `use_inbound_webhook_on_number` field is enabled.
    * @property friendlyName - A string to describe the resource
    * @property inboundMethod - The HTTP method we should use to call inbound_request_url
    * @property inboundRequestUrl - The URL we call using inbound_method when a message is received by any phone number or short code in the Service. This field will be overridden if the `use_inbound_webhook_on_number` field is enabled.
    * @property mmsConverter - Whether to enable the MMS Converter for messages sent through the Service instance
    * @property scanMessageContent - Reserved
    * @property smartEncoding - Whether to enable Encoding for messages sent through the Service instance
    * @property statusCallback - The URL we should call to pass status updates about message delivery
    * @property stickySender - Whether to enable Sticky Sender on the Service instance
    * @property synchronousValidation - Reserved
    * @property useInboundWebhookOnNumber - If enabled, the webhook url configured on the phone number will be used and will override the `inbound_request_url`/`fallback_url` url called when an inbound message is received.
    * @property usecase - A string describing the scenario in which the Messaging Service will be used
    * @property validityPeriod - How long, in seconds, messages sent from the Service are valid
    */
  trait ServiceListInstanceCreateOptions extends StObject {
    
    var areaCodeGeomatch: js.UndefOr[Boolean] = js.undefined
    
    var fallbackMethod: js.UndefOr[String] = js.undefined
    
    var fallbackToLongCode: js.UndefOr[Boolean] = js.undefined
    
    var fallbackUrl: js.UndefOr[String] = js.undefined
    
    var friendlyName: String
    
    var inboundMethod: js.UndefOr[String] = js.undefined
    
    var inboundRequestUrl: js.UndefOr[String] = js.undefined
    
    var mmsConverter: js.UndefOr[Boolean] = js.undefined
    
    var scanMessageContent: js.UndefOr[ServiceScanMessageContent] = js.undefined
    
    var smartEncoding: js.UndefOr[Boolean] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var stickySender: js.UndefOr[Boolean] = js.undefined
    
    var synchronousValidation: js.UndefOr[Boolean] = js.undefined
    
    var useInboundWebhookOnNumber: js.UndefOr[Boolean] = js.undefined
    
    var usecase: js.UndefOr[String] = js.undefined
    
    var validityPeriod: js.UndefOr[Double] = js.undefined
  }
  object ServiceListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): ServiceListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceListInstanceCreateOptions]
    }
    
    extension [Self <: ServiceListInstanceCreateOptions](x: Self) {
      
      inline def setAreaCodeGeomatch(value: Boolean): Self = StObject.set(x, "areaCodeGeomatch", value.asInstanceOf[js.Any])
      
      inline def setAreaCodeGeomatchUndefined: Self = StObject.set(x, "areaCodeGeomatch", js.undefined)
      
      inline def setFallbackMethod(value: String): Self = StObject.set(x, "fallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setFallbackMethodUndefined: Self = StObject.set(x, "fallbackMethod", js.undefined)
      
      inline def setFallbackToLongCode(value: Boolean): Self = StObject.set(x, "fallbackToLongCode", value.asInstanceOf[js.Any])
      
      inline def setFallbackToLongCodeUndefined: Self = StObject.set(x, "fallbackToLongCode", js.undefined)
      
      inline def setFallbackUrl(value: String): Self = StObject.set(x, "fallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setFallbackUrlUndefined: Self = StObject.set(x, "fallbackUrl", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setInboundMethod(value: String): Self = StObject.set(x, "inboundMethod", value.asInstanceOf[js.Any])
      
      inline def setInboundMethodUndefined: Self = StObject.set(x, "inboundMethod", js.undefined)
      
      inline def setInboundRequestUrl(value: String): Self = StObject.set(x, "inboundRequestUrl", value.asInstanceOf[js.Any])
      
      inline def setInboundRequestUrlUndefined: Self = StObject.set(x, "inboundRequestUrl", js.undefined)
      
      inline def setMmsConverter(value: Boolean): Self = StObject.set(x, "mmsConverter", value.asInstanceOf[js.Any])
      
      inline def setMmsConverterUndefined: Self = StObject.set(x, "mmsConverter", js.undefined)
      
      inline def setScanMessageContent(value: ServiceScanMessageContent): Self = StObject.set(x, "scanMessageContent", value.asInstanceOf[js.Any])
      
      inline def setScanMessageContentUndefined: Self = StObject.set(x, "scanMessageContent", js.undefined)
      
      inline def setSmartEncoding(value: Boolean): Self = StObject.set(x, "smartEncoding", value.asInstanceOf[js.Any])
      
      inline def setSmartEncodingUndefined: Self = StObject.set(x, "smartEncoding", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setStickySender(value: Boolean): Self = StObject.set(x, "stickySender", value.asInstanceOf[js.Any])
      
      inline def setStickySenderUndefined: Self = StObject.set(x, "stickySender", js.undefined)
      
      inline def setSynchronousValidation(value: Boolean): Self = StObject.set(x, "synchronousValidation", value.asInstanceOf[js.Any])
      
      inline def setSynchronousValidationUndefined: Self = StObject.set(x, "synchronousValidation", js.undefined)
      
      inline def setUseInboundWebhookOnNumber(value: Boolean): Self = StObject.set(x, "useInboundWebhookOnNumber", value.asInstanceOf[js.Any])
      
      inline def setUseInboundWebhookOnNumberUndefined: Self = StObject.set(x, "useInboundWebhookOnNumber", js.undefined)
      
      inline def setUsecase(value: String): Self = StObject.set(x, "usecase", value.asInstanceOf[js.Any])
      
      inline def setUsecaseUndefined: Self = StObject.set(x, "usecase", js.undefined)
      
      inline def setValidityPeriod(value: Double): Self = StObject.set(x, "validityPeriod", value.asInstanceOf[js.Any])
      
      inline def setValidityPeriodUndefined: Self = StObject.set(x, "validityPeriod", js.undefined)
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
  
  trait ServicePayload
    extends StObject
       with ServiceResource
       with TwilioResponsePayload
  object ServicePayload {
    
    inline def apply(
      account_sid: String,
      area_code_geomatch: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      fallback_method: String,
      fallback_to_long_code: Boolean,
      fallback_url: String,
      first_page_uri: String,
      friendly_name: String,
      inbound_method: String,
      inbound_request_url: String,
      links: String,
      mms_converter: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      scan_message_content: ServiceScanMessageContent,
      sid: String,
      smart_encoding: Boolean,
      status_callback: String,
      sticky_sender: Boolean,
      synchronous_validation: Boolean,
      uri: String,
      url: String,
      us_app_to_person_registered: Boolean,
      use_inbound_webhook_on_number: Boolean,
      usecase: String,
      validity_period: Double
    ): ServicePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], area_code_geomatch = area_code_geomatch.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], fallback_method = fallback_method.asInstanceOf[js.Any], fallback_to_long_code = fallback_to_long_code.asInstanceOf[js.Any], fallback_url = fallback_url.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], inbound_method = inbound_method.asInstanceOf[js.Any], inbound_request_url = inbound_request_url.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], mms_converter = mms_converter.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], scan_message_content = scan_message_content.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], smart_encoding = smart_encoding.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], sticky_sender = sticky_sender.asInstanceOf[js.Any], synchronous_validation = synchronous_validation.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], us_app_to_person_registered = us_app_to_person_registered.asInstanceOf[js.Any], use_inbound_webhook_on_number = use_inbound_webhook_on_number.asInstanceOf[js.Any], usecase = usecase.asInstanceOf[js.Any], validity_period = validity_period.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServicePayload]
    }
  }
  
  trait ServiceResource extends StObject {
    
    var account_sid: String
    
    var area_code_geomatch: Boolean
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var fallback_method: String
    
    var fallback_to_long_code: Boolean
    
    var fallback_url: String
    
    var friendly_name: String
    
    var inbound_method: String
    
    var inbound_request_url: String
    
    var links: String
    
    var mms_converter: Boolean
    
    var scan_message_content: ServiceScanMessageContent
    
    var sid: String
    
    var smart_encoding: Boolean
    
    var status_callback: String
    
    var sticky_sender: Boolean
    
    var synchronous_validation: Boolean
    
    var url: String
    
    var us_app_to_person_registered: Boolean
    
    var use_inbound_webhook_on_number: Boolean
    
    var usecase: String
    
    var validity_period: Double
  }
  object ServiceResource {
    
    inline def apply(
      account_sid: String,
      area_code_geomatch: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      fallback_method: String,
      fallback_to_long_code: Boolean,
      fallback_url: String,
      friendly_name: String,
      inbound_method: String,
      inbound_request_url: String,
      links: String,
      mms_converter: Boolean,
      scan_message_content: ServiceScanMessageContent,
      sid: String,
      smart_encoding: Boolean,
      status_callback: String,
      sticky_sender: Boolean,
      synchronous_validation: Boolean,
      url: String,
      us_app_to_person_registered: Boolean,
      use_inbound_webhook_on_number: Boolean,
      usecase: String,
      validity_period: Double
    ): ServiceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], area_code_geomatch = area_code_geomatch.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], fallback_method = fallback_method.asInstanceOf[js.Any], fallback_to_long_code = fallback_to_long_code.asInstanceOf[js.Any], fallback_url = fallback_url.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], inbound_method = inbound_method.asInstanceOf[js.Any], inbound_request_url = inbound_request_url.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], mms_converter = mms_converter.asInstanceOf[js.Any], scan_message_content = scan_message_content.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], smart_encoding = smart_encoding.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], sticky_sender = sticky_sender.asInstanceOf[js.Any], synchronous_validation = synchronous_validation.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], us_app_to_person_registered = us_app_to_person_registered.asInstanceOf[js.Any], use_inbound_webhook_on_number = use_inbound_webhook_on_number.asInstanceOf[js.Any], usecase = usecase.asInstanceOf[js.Any], validity_period = validity_period.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceResource]
    }
    
    extension [Self <: ServiceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setArea_code_geomatch(value: Boolean): Self = StObject.set(x, "area_code_geomatch", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFallback_method(value: String): Self = StObject.set(x, "fallback_method", value.asInstanceOf[js.Any])
      
      inline def setFallback_to_long_code(value: Boolean): Self = StObject.set(x, "fallback_to_long_code", value.asInstanceOf[js.Any])
      
      inline def setFallback_url(value: String): Self = StObject.set(x, "fallback_url", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setInbound_method(value: String): Self = StObject.set(x, "inbound_method", value.asInstanceOf[js.Any])
      
      inline def setInbound_request_url(value: String): Self = StObject.set(x, "inbound_request_url", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMms_converter(value: Boolean): Self = StObject.set(x, "mms_converter", value.asInstanceOf[js.Any])
      
      inline def setScan_message_content(value: ServiceScanMessageContent): Self = StObject.set(x, "scan_message_content", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSmart_encoding(value: Boolean): Self = StObject.set(x, "smart_encoding", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setSticky_sender(value: Boolean): Self = StObject.set(x, "sticky_sender", value.asInstanceOf[js.Any])
      
      inline def setSynchronous_validation(value: Boolean): Self = StObject.set(x, "synchronous_validation", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUs_app_to_person_registered(value: Boolean): Self = StObject.set(x, "us_app_to_person_registered", value.asInstanceOf[js.Any])
      
      inline def setUse_inbound_webhook_on_number(value: Boolean): Self = StObject.set(x, "use_inbound_webhook_on_number", value.asInstanceOf[js.Any])
      
      inline def setUsecase(value: String): Self = StObject.set(x, "usecase", value.asInstanceOf[js.Any])
      
      inline def setValidity_period(value: Double): Self = StObject.set(x, "validity_period", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.inherit
    - typings.twilio.twilioStrings.enable
    - typings.twilio.twilioStrings.disable
  */
  trait ServiceScanMessageContent extends StObject
  object ServiceScanMessageContent {
    
    inline def disable: typings.twilio.twilioStrings.disable = "disable".asInstanceOf[typings.twilio.twilioStrings.disable]
    
    inline def enable: typings.twilio.twilioStrings.enable = "enable".asInstanceOf[typings.twilio.twilioStrings.enable]
    
    inline def inherit: typings.twilio.twilioStrings.inherit = "inherit".asInstanceOf[typings.twilio.twilioStrings.inherit]
  }
  
  trait ServiceSolution extends StObject
}
