package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/application", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/application", "ApplicationContext")
  @js.native
  open class ApplicationContext protected () extends StObject {
    /**
      * Initialize the ApplicationContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a ApplicationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ApplicationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationInstance, Any]): js.Promise[ApplicationInstance] = js.native
    
    /**
      * remove a ApplicationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ApplicationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ApplicationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationInstance, Any]): js.Promise[ApplicationInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationInstance, Any]
    ): js.Promise[ApplicationInstance] = js.native
    def update(opts: ApplicationInstanceUpdateOptions): js.Promise[ApplicationInstance] = js.native
    def update(
      opts: ApplicationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationInstance, Any]
    ): js.Promise[ApplicationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/application", "ApplicationInstance")
  @js.native
  open class ApplicationInstance protected () extends SerializableClass {
    /**
      * Initialize the ApplicationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: ApplicationPayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: ApplicationContext = js.native
    
    var accountSid: String = js.native
    
    var apiVersion: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ApplicationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ApplicationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ApplicationInstance] = js.native
    
    var friendlyName: String = js.native
    
    var messageStatusCallback: String = js.native
    
    /**
      * remove a ApplicationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var smsFallbackMethod: String = js.native
    
    var smsFallbackUrl: String = js.native
    
    var smsMethod: String = js.native
    
    var smsStatusCallback: String = js.native
    
    var smsUrl: String = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    /**
      * update a ApplicationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ApplicationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ApplicationInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ApplicationInstance] = js.native
    def update(opts: ApplicationInstanceUpdateOptions): js.Promise[ApplicationInstance] = js.native
    def update(
      opts: ApplicationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ApplicationInstance] = js.native
    
    var uri: String = js.native
    
    var voiceCallerIdLookup: Boolean = js.native
    
    var voiceFallbackMethod: String = js.native
    
    var voiceFallbackUrl: String = js.native
    
    var voiceMethod: String = js.native
    
    var voiceUrl: String = js.native
  }
  
  /**
    * Initialize the ApplicationList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    */
  inline def ApplicationList(version: typings.twilio.v2010Mod.^, accountSid: String): ApplicationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplicationList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[ApplicationListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/application", "ApplicationPage")
  @js.native
  open class ApplicationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          ApplicationPayload, 
          ApplicationResource, 
          ApplicationInstance
        ] {
    /**
      * Initialize the ApplicationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ApplicationSolution
    ) = this()
    
    /**
      * Build an instance of ApplicationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ApplicationPayload): ApplicationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property apiVersion - The API version to use to start a new TwiML session
    * @property friendlyName - A string to describe the resource
    * @property messageStatusCallback - The URL to send message status information to your application
    * @property smsFallbackMethod - The HTTP method to use with sms_fallback_url
    * @property smsFallbackUrl - The URL to call when an error occurs while retrieving or executing the TwiML
    * @property smsMethod - The HTTP method to use with sms_url
    * @property smsStatusCallback - Same as message_status_callback. Deprecated, included for backwards compatibility.
    * @property smsUrl - The URL to call when the phone number receives an incoming SMS message
    * @property statusCallback - The URL to send status information to your application
    * @property statusCallbackMethod - The HTTP method to use to call status_callback
    * @property voiceCallerIdLookup - Whether to lookup the caller's name
    * @property voiceFallbackMethod - The HTTP method to use with voice_fallback_url
    * @property voiceFallbackUrl - The URL to call when a TwiML error occurs
    * @property voiceMethod - The HTTP method to use with the voice_url
    * @property voiceUrl - The URL to call when the phone number receives a call
    */
  trait ApplicationInstanceUpdateOptions extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var messageStatusCallback: js.UndefOr[String] = js.undefined
    
    var smsFallbackMethod: js.UndefOr[String] = js.undefined
    
    var smsFallbackUrl: js.UndefOr[String] = js.undefined
    
    var smsMethod: js.UndefOr[String] = js.undefined
    
    var smsStatusCallback: js.UndefOr[String] = js.undefined
    
    var smsUrl: js.UndefOr[String] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceCallerIdLookup: js.UndefOr[Boolean] = js.undefined
    
    var voiceFallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceFallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceMethod: js.UndefOr[String] = js.undefined
    
    var voiceUrl: js.UndefOr[String] = js.undefined
  }
  object ApplicationInstanceUpdateOptions {
    
    inline def apply(): ApplicationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationInstanceUpdateOptions]
    }
    
    extension [Self <: ApplicationInstanceUpdateOptions](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setMessageStatusCallback(value: String): Self = StObject.set(x, "messageStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setMessageStatusCallbackUndefined: Self = StObject.set(x, "messageStatusCallback", js.undefined)
      
      inline def setSmsFallbackMethod(value: String): Self = StObject.set(x, "smsFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackMethodUndefined: Self = StObject.set(x, "smsFallbackMethod", js.undefined)
      
      inline def setSmsFallbackUrl(value: String): Self = StObject.set(x, "smsFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackUrlUndefined: Self = StObject.set(x, "smsFallbackUrl", js.undefined)
      
      inline def setSmsMethod(value: String): Self = StObject.set(x, "smsMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsMethodUndefined: Self = StObject.set(x, "smsMethod", js.undefined)
      
      inline def setSmsStatusCallback(value: String): Self = StObject.set(x, "smsStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setSmsStatusCallbackUndefined: Self = StObject.set(x, "smsStatusCallback", js.undefined)
      
      inline def setSmsUrl(value: String): Self = StObject.set(x, "smsUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsUrlUndefined: Self = StObject.set(x, "smsUrl", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setVoiceCallerIdLookup(value: Boolean): Self = StObject.set(x, "voiceCallerIdLookup", value.asInstanceOf[js.Any])
      
      inline def setVoiceCallerIdLookupUndefined: Self = StObject.set(x, "voiceCallerIdLookup", js.undefined)
      
      inline def setVoiceFallbackMethod(value: String): Self = StObject.set(x, "voiceFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackMethodUndefined: Self = StObject.set(x, "voiceFallbackMethod", js.undefined)
      
      inline def setVoiceFallbackUrl(value: String): Self = StObject.set(x, "voiceFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackUrlUndefined: Self = StObject.set(x, "voiceFallbackUrl", js.undefined)
      
      inline def setVoiceMethod(value: String): Self = StObject.set(x, "voiceMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceMethodUndefined: Self = StObject.set(x, "voiceMethod", js.undefined)
      
      inline def setVoiceUrl(value: String): Self = StObject.set(x, "voiceUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceUrlUndefined: Self = StObject.set(x, "voiceUrl", js.undefined)
    }
  }
  
  @js.native
  trait ApplicationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ApplicationContext = js.native
    
    /**
      * create a ApplicationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[ApplicationInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ ApplicationInstance, Any]): js.Promise[ApplicationInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ApplicationInstance, Any]
    ): js.Promise[ApplicationInstance] = js.native
    def create(opts: ApplicationListInstanceCreateOptions): js.Promise[ApplicationInstance] = js.native
    def create(
      opts: ApplicationListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ApplicationInstance, Any]
    ): js.Promise[ApplicationInstance] = js.native
    
    /**
      * Streams ApplicationInstance records from the API.
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
          /* item */ ApplicationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ApplicationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ApplicationListInstanceEachOptions): Unit = js.native
    def each(
      opts: ApplicationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ApplicationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a application
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ApplicationContext = js.native
    
    /**
      * Retrieve a single target page of ApplicationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ApplicationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationPage, Any]): js.Promise[ApplicationPage] = js.native
    def getPage(targetUrl: String): js.Promise[ApplicationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationPage, Any]
    ): js.Promise[ApplicationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationPage, Any]
    ): js.Promise[ApplicationPage] = js.native
    
    /**
      * Lists ApplicationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ApplicationInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ApplicationInstance], Any]
    ): js.Promise[js.Array[ApplicationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ApplicationInstance], Any]
    ): js.Promise[js.Array[ApplicationInstance]] = js.native
    def list(opts: ApplicationListInstanceOptions): js.Promise[js.Array[ApplicationInstance]] = js.native
    def list(
      opts: ApplicationListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ApplicationInstance], Any]
    ): js.Promise[js.Array[ApplicationInstance]] = js.native
    
    /**
      * Retrieve a single page of ApplicationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ApplicationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationPage, Any]): js.Promise[ApplicationPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationPage, Any]): js.Promise[ApplicationPage] = js.native
    def page(opts: ApplicationListInstancePageOptions): js.Promise[ApplicationPage] = js.native
    def page(
      opts: ApplicationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ApplicationPage, Any]
    ): js.Promise[ApplicationPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property apiVersion - The API version to use to start a new TwiML session
    * @property friendlyName - A string to describe the new resource
    * @property messageStatusCallback - The URL to send message status information to your application
    * @property smsFallbackMethod - The HTTP method to use with sms_fallback_url
    * @property smsFallbackUrl - The URL to call when an error occurs while retrieving or executing the TwiML
    * @property smsMethod - The HTTP method to use with sms_url
    * @property smsStatusCallback - The URL to send status information to your application
    * @property smsUrl - The URL to call when the phone number receives an incoming SMS message
    * @property statusCallback - The URL to send status information to your application
    * @property statusCallbackMethod - The HTTP method to use to call status_callback
    * @property voiceCallerIdLookup - Whether to lookup the caller's name
    * @property voiceFallbackMethod - The HTTP method to use with voice_fallback_url
    * @property voiceFallbackUrl - The URL to call when a TwiML error occurs
    * @property voiceMethod - The HTTP method to use with the voice_url
    * @property voiceUrl - The URL to call when the phone number receives a call
    */
  trait ApplicationListInstanceCreateOptions extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var messageStatusCallback: js.UndefOr[String] = js.undefined
    
    var smsFallbackMethod: js.UndefOr[String] = js.undefined
    
    var smsFallbackUrl: js.UndefOr[String] = js.undefined
    
    var smsMethod: js.UndefOr[String] = js.undefined
    
    var smsStatusCallback: js.UndefOr[String] = js.undefined
    
    var smsUrl: js.UndefOr[String] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceCallerIdLookup: js.UndefOr[Boolean] = js.undefined
    
    var voiceFallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceFallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceMethod: js.UndefOr[String] = js.undefined
    
    var voiceUrl: js.UndefOr[String] = js.undefined
  }
  object ApplicationListInstanceCreateOptions {
    
    inline def apply(): ApplicationListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationListInstanceCreateOptions]
    }
    
    extension [Self <: ApplicationListInstanceCreateOptions](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setMessageStatusCallback(value: String): Self = StObject.set(x, "messageStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setMessageStatusCallbackUndefined: Self = StObject.set(x, "messageStatusCallback", js.undefined)
      
      inline def setSmsFallbackMethod(value: String): Self = StObject.set(x, "smsFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackMethodUndefined: Self = StObject.set(x, "smsFallbackMethod", js.undefined)
      
      inline def setSmsFallbackUrl(value: String): Self = StObject.set(x, "smsFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackUrlUndefined: Self = StObject.set(x, "smsFallbackUrl", js.undefined)
      
      inline def setSmsMethod(value: String): Self = StObject.set(x, "smsMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsMethodUndefined: Self = StObject.set(x, "smsMethod", js.undefined)
      
      inline def setSmsStatusCallback(value: String): Self = StObject.set(x, "smsStatusCallback", value.asInstanceOf[js.Any])
      
      inline def setSmsStatusCallbackUndefined: Self = StObject.set(x, "smsStatusCallback", js.undefined)
      
      inline def setSmsUrl(value: String): Self = StObject.set(x, "smsUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsUrlUndefined: Self = StObject.set(x, "smsUrl", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setVoiceCallerIdLookup(value: Boolean): Self = StObject.set(x, "voiceCallerIdLookup", value.asInstanceOf[js.Any])
      
      inline def setVoiceCallerIdLookupUndefined: Self = StObject.set(x, "voiceCallerIdLookup", js.undefined)
      
      inline def setVoiceFallbackMethod(value: String): Self = StObject.set(x, "voiceFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackMethodUndefined: Self = StObject.set(x, "voiceFallbackMethod", js.undefined)
      
      inline def setVoiceFallbackUrl(value: String): Self = StObject.set(x, "voiceFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackUrlUndefined: Self = StObject.set(x, "voiceFallbackUrl", js.undefined)
      
      inline def setVoiceMethod(value: String): Self = StObject.set(x, "voiceMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceMethodUndefined: Self = StObject.set(x, "voiceMethod", js.undefined)
      
      inline def setVoiceUrl(value: String): Self = StObject.set(x, "voiceUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceUrlUndefined: Self = StObject.set(x, "voiceUrl", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The string that identifies the Application resources to read
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
  trait ApplicationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ApplicationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ApplicationListInstanceEachOptions {
    
    inline def apply(): ApplicationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationListInstanceEachOptions]
    }
    
    extension [Self <: ApplicationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ApplicationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - The string that identifies the Application resources to read
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
  trait ApplicationListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ApplicationListInstanceOptions {
    
    inline def apply(): ApplicationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationListInstanceOptions]
    }
    
    extension [Self <: ApplicationListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - The string that identifies the Application resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait ApplicationListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ApplicationListInstancePageOptions {
    
    inline def apply(): ApplicationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationListInstancePageOptions]
    }
    
    extension [Self <: ApplicationListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait ApplicationPayload
    extends StObject
       with ApplicationResource {
    
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
  object ApplicationPayload {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      message_status_callback: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      sms_fallback_method: String,
      sms_fallback_url: String,
      sms_method: String,
      sms_status_callback: String,
      sms_url: String,
      status_callback: String,
      status_callback_method: String,
      uri: String,
      voice_caller_id_lookup: Boolean,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_url: String
    ): ApplicationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], message_status_callback = message_status_callback.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_status_callback = sms_status_callback.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], voice_caller_id_lookup = voice_caller_id_lookup.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationPayload]
    }
    
    extension [Self <: ApplicationPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplicationResource extends StObject {
    
    var account_sid: String
    
    var api_version: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var message_status_callback: String
    
    var sid: String
    
    var sms_fallback_method: String
    
    var sms_fallback_url: String
    
    var sms_method: String
    
    var sms_status_callback: String
    
    var sms_url: String
    
    var status_callback: String
    
    var status_callback_method: String
    
    var uri: String
    
    var voice_caller_id_lookup: Boolean
    
    var voice_fallback_method: String
    
    var voice_fallback_url: String
    
    var voice_method: String
    
    var voice_url: String
  }
  object ApplicationResource {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      message_status_callback: String,
      sid: String,
      sms_fallback_method: String,
      sms_fallback_url: String,
      sms_method: String,
      sms_status_callback: String,
      sms_url: String,
      status_callback: String,
      status_callback_method: String,
      uri: String,
      voice_caller_id_lookup: Boolean,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_url: String
    ): ApplicationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], message_status_callback = message_status_callback.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_status_callback = sms_status_callback.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], voice_caller_id_lookup = voice_caller_id_lookup.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationResource]
    }
    
    extension [Self <: ApplicationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setMessage_status_callback(value: String): Self = StObject.set(x, "message_status_callback", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSms_fallback_method(value: String): Self = StObject.set(x, "sms_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setSms_fallback_url(value: String): Self = StObject.set(x, "sms_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setSms_method(value: String): Self = StObject.set(x, "sms_method", value.asInstanceOf[js.Any])
      
      inline def setSms_status_callback(value: String): Self = StObject.set(x, "sms_status_callback", value.asInstanceOf[js.Any])
      
      inline def setSms_url(value: String): Self = StObject.set(x, "sms_url", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setVoice_caller_id_lookup(value: Boolean): Self = StObject.set(x, "voice_caller_id_lookup", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_method(value: String): Self = StObject.set(x, "voice_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_url(value: String): Self = StObject.set(x, "voice_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setVoice_method(value: String): Self = StObject.set(x, "voice_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_url(value: String): Self = StObject.set(x, "voice_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplicationSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object ApplicationSolution {
    
    inline def apply(): ApplicationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationSolution]
    }
    
    extension [Self <: ApplicationSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
