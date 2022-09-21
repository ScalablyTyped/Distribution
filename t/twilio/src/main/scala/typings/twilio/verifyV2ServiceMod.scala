package typings.twilio

import typings.twilio.anon.ApnCredentialSid
import typings.twilio.anon.CodeLength
import typings.twilio.entityMod.EntityContext
import typings.twilio.entityMod.EntityListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.messagingConfigurationMod.MessagingConfigurationContext
import typings.twilio.messagingConfigurationMod.MessagingConfigurationListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.rateLimitMod.RateLimitContext
import typings.twilio.rateLimitMod.RateLimitListInstance
import typings.twilio.serviceAccessTokenMod.AccessTokenContext
import typings.twilio.serviceAccessTokenMod.AccessTokenListInstance
import typings.twilio.serviceWebhookMod.WebhookContext
import typings.twilio.serviceWebhookMod.WebhookListInstance
import typings.twilio.verificationCheckMod.VerificationCheckListInstance
import typings.twilio.verificationMod.VerificationContext
import typings.twilio.verificationMod.VerificationListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verifyV2ServiceMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service", "ServiceContext")
  @js.native
  open class ServiceContext protected () extends StObject {
    /**
      * Initialize the ServiceContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.verifyV2Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def accessTokens(sid: String): AccessTokenContext = js.native
    @JSName("accessTokens")
    var accessTokens_Original: AccessTokenListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def entities(sid: String): EntityContext = js.native
    @JSName("entities")
    var entities_Original: EntityListInstance = js.native
    
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
    def messagingConfigurations(sid: String): MessagingConfigurationContext = js.native
    @JSName("messagingConfigurations")
    var messagingConfigurations_Original: MessagingConfigurationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def rateLimits(sid: String): RateLimitContext = js.native
    @JSName("rateLimits")
    var rateLimits_Original: RateLimitListInstance = js.native
    
    /**
      * remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[Boolean] = js.native
    
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
    
    var verificationChecks: VerificationCheckListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def verifications(sid: String): VerificationContext = js.native
    @JSName("verifications")
    var verifications_Original: VerificationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def webhooks(sid: String): WebhookContext = js.native
    @JSName("webhooks")
    var webhooks_Original: WebhookListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/service", "ServiceInstance")
  @js.native
  open class ServiceInstance protected () extends SerializableClass {
    /**
      * Initialize the ServiceContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.verifyV2Mod.^, payload: ServicePayload, sid: String) = this()
    
    /* private */ var _proxy: ServiceContext = js.native
    
    /**
      * Access the accessTokens
      */
    def accessTokens(): AccessTokenListInstance = js.native
    
    var accountSid: String = js.native
    
    var codeLength: Double = js.native
    
    var customCodeEnabled: Boolean = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var defaultTemplateSid: String = js.native
    
    var doNotShareWarningEnabled: Boolean = js.native
    
    var dtmfInputRequired: Boolean = js.native
    
    /**
      * Access the entities
      */
    def entities(): EntityListInstance = js.native
    
    /**
      * fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    var lookupEnabled: Boolean = js.native
    
    /**
      * Access the messagingConfigurations
      */
    def messagingConfigurations(): MessagingConfigurationListInstance = js.native
    
    var psd2Enabled: Boolean = js.native
    
    var push: Any = js.native
    
    /**
      * Access the rateLimits
      */
    def rateLimits(): RateLimitListInstance = js.native
    
    /**
      * remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var skipSmsToLandlines: Boolean = js.native
    
    var totp: Any = js.native
    
    var ttsName: String = js.native
    
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
      * Access the verificationChecks
      */
    def verificationChecks(): VerificationCheckListInstance = js.native
    
    /**
      * Access the verifications
      */
    def verifications(): VerificationListInstance = js.native
    
    /**
      * Access the webhooks
      */
    def webhooks(): WebhookListInstance = js.native
  }
  
  /**
    * Initialize the ServiceList
    *
    * @param version - Version of the resource
    */
  inline def ServiceList(version: typings.twilio.verifyV2Mod.^): ServiceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ServiceList")(version.asInstanceOf[js.Any]).asInstanceOf[ServiceListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service", "ServicePage")
  @js.native
  open class ServicePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, ServicePayload, ServiceResource, ServiceInstance] {
    /**
      * Initialize the ServicePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
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
    * @property codeLength - The length of the verification code to generate
    * @property customCodeEnabled - Whether to allow sending verifications with a custom code.
    * @property defaultTemplateSid - The verification template SMS messages.
    * @property doNotShareWarningEnabled - Whether to add a privacy warning at the end of an SMS.
    * @property dtmfInputRequired - Whether to ask the user to press a number before delivering the verify code in a phone call
    * @property friendlyName - A string to describe the verification service
    * @property lookupEnabled - Whether to perform a lookup with each verification
    * @property psd2Enabled - Whether to pass PSD2 transaction parameters when starting a verification
    * @property push.apnCredentialSid - Optional. Set APN Credential for this service.
    * @property push.fcmCredentialSid - Optional. Set FCM Credential for this service.
    * @property push.includeDate - Optional. Include the date in the Challenge's response. Default: false. **Deprecated** do not use this parameter.
    * @property skipSmsToLandlines - Whether to skip sending SMS verifications to landlines
    * @property totp.codeLength - Optional. Number of digits for generated TOTP codes
    * @property totp.issuer - Optional. Set TOTP Issuer for this service.
    * @property totp.skew - Optional. The number of past and future time-steps valid at a given time
    * @property totp.timeStep - Optional. How often, in seconds, are TOTP codes generated
    * @property ttsName - The name of an alternative text-to-speech service to use in phone calls
    */
  trait ServiceInstanceUpdateOptions extends StObject {
    
    var codeLength: js.UndefOr[Double] = js.undefined
    
    var customCodeEnabled: js.UndefOr[Boolean] = js.undefined
    
    var defaultTemplateSid: js.UndefOr[String] = js.undefined
    
    var doNotShareWarningEnabled: js.UndefOr[Boolean] = js.undefined
    
    var dtmfInputRequired: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var lookupEnabled: js.UndefOr[Boolean] = js.undefined
    
    var psd2Enabled: js.UndefOr[Boolean] = js.undefined
    
    var push: js.UndefOr[ApnCredentialSid] = js.undefined
    
    var skipSmsToLandlines: js.UndefOr[Boolean] = js.undefined
    
    var totp: js.UndefOr[CodeLength] = js.undefined
    
    var ttsName: js.UndefOr[String] = js.undefined
  }
  object ServiceInstanceUpdateOptions {
    
    inline def apply(): ServiceInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceInstanceUpdateOptions]
    }
    
    extension [Self <: ServiceInstanceUpdateOptions](x: Self) {
      
      inline def setCodeLength(value: Double): Self = StObject.set(x, "codeLength", value.asInstanceOf[js.Any])
      
      inline def setCodeLengthUndefined: Self = StObject.set(x, "codeLength", js.undefined)
      
      inline def setCustomCodeEnabled(value: Boolean): Self = StObject.set(x, "customCodeEnabled", value.asInstanceOf[js.Any])
      
      inline def setCustomCodeEnabledUndefined: Self = StObject.set(x, "customCodeEnabled", js.undefined)
      
      inline def setDefaultTemplateSid(value: String): Self = StObject.set(x, "defaultTemplateSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultTemplateSidUndefined: Self = StObject.set(x, "defaultTemplateSid", js.undefined)
      
      inline def setDoNotShareWarningEnabled(value: Boolean): Self = StObject.set(x, "doNotShareWarningEnabled", value.asInstanceOf[js.Any])
      
      inline def setDoNotShareWarningEnabledUndefined: Self = StObject.set(x, "doNotShareWarningEnabled", js.undefined)
      
      inline def setDtmfInputRequired(value: Boolean): Self = StObject.set(x, "dtmfInputRequired", value.asInstanceOf[js.Any])
      
      inline def setDtmfInputRequiredUndefined: Self = StObject.set(x, "dtmfInputRequired", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLookupEnabled(value: Boolean): Self = StObject.set(x, "lookupEnabled", value.asInstanceOf[js.Any])
      
      inline def setLookupEnabledUndefined: Self = StObject.set(x, "lookupEnabled", js.undefined)
      
      inline def setPsd2Enabled(value: Boolean): Self = StObject.set(x, "psd2Enabled", value.asInstanceOf[js.Any])
      
      inline def setPsd2EnabledUndefined: Self = StObject.set(x, "psd2Enabled", js.undefined)
      
      inline def setPush(value: ApnCredentialSid): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setSkipSmsToLandlines(value: Boolean): Self = StObject.set(x, "skipSmsToLandlines", value.asInstanceOf[js.Any])
      
      inline def setSkipSmsToLandlinesUndefined: Self = StObject.set(x, "skipSmsToLandlines", js.undefined)
      
      inline def setTotp(value: CodeLength): Self = StObject.set(x, "totp", value.asInstanceOf[js.Any])
      
      inline def setTotpUndefined: Self = StObject.set(x, "totp", js.undefined)
      
      inline def setTtsName(value: String): Self = StObject.set(x, "ttsName", value.asInstanceOf[js.Any])
      
      inline def setTtsNameUndefined: Self = StObject.set(x, "ttsName", js.undefined)
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
    * @property codeLength - The length of the verification code to generate
    * @property customCodeEnabled - Whether to allow sending verifications with a custom code.
    * @property defaultTemplateSid - The verification template SMS messages.
    * @property doNotShareWarningEnabled - Whether to add a security warning at the end of an SMS.
    * @property dtmfInputRequired - Whether to ask the user to press a number before delivering the verify code in a phone call
    * @property friendlyName - A string to describe the verification service
    * @property lookupEnabled - Whether to perform a lookup with each verification
    * @property psd2Enabled - Whether to pass PSD2 transaction parameters when starting a verification
    * @property push.apnCredentialSid - Optional. Set APN Credential for this service.
    * @property push.fcmCredentialSid - Optional. Set FCM Credential for this service.
    * @property push.includeDate - Optional. Include the date in the Challenge's response. Default: false. **Deprecated** do not use this parameter.
    * @property skipSmsToLandlines - Whether to skip sending SMS verifications to landlines
    * @property totp.codeLength - Optional. Number of digits for generated TOTP codes
    * @property totp.issuer - Optional. Set TOTP Issuer for this service.
    * @property totp.skew - Optional. The number of past and future time-steps valid at a given time
    * @property totp.timeStep - Optional. How often, in seconds, are TOTP codes generated
    * @property ttsName - The name of an alternative text-to-speech service to use in phone calls
    */
  trait ServiceListInstanceCreateOptions extends StObject {
    
    var codeLength: js.UndefOr[Double] = js.undefined
    
    var customCodeEnabled: js.UndefOr[Boolean] = js.undefined
    
    var defaultTemplateSid: js.UndefOr[String] = js.undefined
    
    var doNotShareWarningEnabled: js.UndefOr[Boolean] = js.undefined
    
    var dtmfInputRequired: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: String
    
    var lookupEnabled: js.UndefOr[Boolean] = js.undefined
    
    var psd2Enabled: js.UndefOr[Boolean] = js.undefined
    
    var push: js.UndefOr[ApnCredentialSid] = js.undefined
    
    var skipSmsToLandlines: js.UndefOr[Boolean] = js.undefined
    
    var totp: js.UndefOr[CodeLength] = js.undefined
    
    var ttsName: js.UndefOr[String] = js.undefined
  }
  object ServiceListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): ServiceListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceListInstanceCreateOptions]
    }
    
    extension [Self <: ServiceListInstanceCreateOptions](x: Self) {
      
      inline def setCodeLength(value: Double): Self = StObject.set(x, "codeLength", value.asInstanceOf[js.Any])
      
      inline def setCodeLengthUndefined: Self = StObject.set(x, "codeLength", js.undefined)
      
      inline def setCustomCodeEnabled(value: Boolean): Self = StObject.set(x, "customCodeEnabled", value.asInstanceOf[js.Any])
      
      inline def setCustomCodeEnabledUndefined: Self = StObject.set(x, "customCodeEnabled", js.undefined)
      
      inline def setDefaultTemplateSid(value: String): Self = StObject.set(x, "defaultTemplateSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultTemplateSidUndefined: Self = StObject.set(x, "defaultTemplateSid", js.undefined)
      
      inline def setDoNotShareWarningEnabled(value: Boolean): Self = StObject.set(x, "doNotShareWarningEnabled", value.asInstanceOf[js.Any])
      
      inline def setDoNotShareWarningEnabledUndefined: Self = StObject.set(x, "doNotShareWarningEnabled", js.undefined)
      
      inline def setDtmfInputRequired(value: Boolean): Self = StObject.set(x, "dtmfInputRequired", value.asInstanceOf[js.Any])
      
      inline def setDtmfInputRequiredUndefined: Self = StObject.set(x, "dtmfInputRequired", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setLookupEnabled(value: Boolean): Self = StObject.set(x, "lookupEnabled", value.asInstanceOf[js.Any])
      
      inline def setLookupEnabledUndefined: Self = StObject.set(x, "lookupEnabled", js.undefined)
      
      inline def setPsd2Enabled(value: Boolean): Self = StObject.set(x, "psd2Enabled", value.asInstanceOf[js.Any])
      
      inline def setPsd2EnabledUndefined: Self = StObject.set(x, "psd2Enabled", js.undefined)
      
      inline def setPush(value: ApnCredentialSid): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setSkipSmsToLandlines(value: Boolean): Self = StObject.set(x, "skipSmsToLandlines", value.asInstanceOf[js.Any])
      
      inline def setSkipSmsToLandlinesUndefined: Self = StObject.set(x, "skipSmsToLandlines", js.undefined)
      
      inline def setTotp(value: CodeLength): Self = StObject.set(x, "totp", value.asInstanceOf[js.Any])
      
      inline def setTotpUndefined: Self = StObject.set(x, "totp", js.undefined)
      
      inline def setTtsName(value: String): Self = StObject.set(x, "ttsName", value.asInstanceOf[js.Any])
      
      inline def setTtsNameUndefined: Self = StObject.set(x, "ttsName", js.undefined)
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
      code_length: Double,
      custom_code_enabled: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      default_template_sid: String,
      do_not_share_warning_enabled: Boolean,
      dtmf_input_required: Boolean,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      lookup_enabled: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      psd2_enabled: Boolean,
      push: js.Object,
      sid: String,
      skip_sms_to_landlines: Boolean,
      totp: js.Object,
      tts_name: String,
      uri: String,
      url: String
    ): ServicePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], code_length = code_length.asInstanceOf[js.Any], custom_code_enabled = custom_code_enabled.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_template_sid = default_template_sid.asInstanceOf[js.Any], do_not_share_warning_enabled = do_not_share_warning_enabled.asInstanceOf[js.Any], dtmf_input_required = dtmf_input_required.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], lookup_enabled = lookup_enabled.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], psd2_enabled = psd2_enabled.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], skip_sms_to_landlines = skip_sms_to_landlines.asInstanceOf[js.Any], totp = totp.asInstanceOf[js.Any], tts_name = tts_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServicePayload]
    }
  }
  
  trait ServiceResource extends StObject {
    
    var account_sid: String
    
    var code_length: Double
    
    var custom_code_enabled: Boolean
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var default_template_sid: String
    
    var do_not_share_warning_enabled: Boolean
    
    var dtmf_input_required: Boolean
    
    var friendly_name: String
    
    var links: String
    
    var lookup_enabled: Boolean
    
    var psd2_enabled: Boolean
    
    var push: js.Object
    
    var sid: String
    
    var skip_sms_to_landlines: Boolean
    
    var totp: js.Object
    
    var tts_name: String
    
    var url: String
  }
  object ServiceResource {
    
    inline def apply(
      account_sid: String,
      code_length: Double,
      custom_code_enabled: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      default_template_sid: String,
      do_not_share_warning_enabled: Boolean,
      dtmf_input_required: Boolean,
      friendly_name: String,
      links: String,
      lookup_enabled: Boolean,
      psd2_enabled: Boolean,
      push: js.Object,
      sid: String,
      skip_sms_to_landlines: Boolean,
      totp: js.Object,
      tts_name: String,
      url: String
    ): ServiceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], code_length = code_length.asInstanceOf[js.Any], custom_code_enabled = custom_code_enabled.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_template_sid = default_template_sid.asInstanceOf[js.Any], do_not_share_warning_enabled = do_not_share_warning_enabled.asInstanceOf[js.Any], dtmf_input_required = dtmf_input_required.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], lookup_enabled = lookup_enabled.asInstanceOf[js.Any], psd2_enabled = psd2_enabled.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], skip_sms_to_landlines = skip_sms_to_landlines.asInstanceOf[js.Any], totp = totp.asInstanceOf[js.Any], tts_name = tts_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceResource]
    }
    
    extension [Self <: ServiceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCode_length(value: Double): Self = StObject.set(x, "code_length", value.asInstanceOf[js.Any])
      
      inline def setCustom_code_enabled(value: Boolean): Self = StObject.set(x, "custom_code_enabled", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDefault_template_sid(value: String): Self = StObject.set(x, "default_template_sid", value.asInstanceOf[js.Any])
      
      inline def setDo_not_share_warning_enabled(value: Boolean): Self = StObject.set(x, "do_not_share_warning_enabled", value.asInstanceOf[js.Any])
      
      inline def setDtmf_input_required(value: Boolean): Self = StObject.set(x, "dtmf_input_required", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLookup_enabled(value: Boolean): Self = StObject.set(x, "lookup_enabled", value.asInstanceOf[js.Any])
      
      inline def setPsd2_enabled(value: Boolean): Self = StObject.set(x, "psd2_enabled", value.asInstanceOf[js.Any])
      
      inline def setPush(value: js.Object): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSkip_sms_to_landlines(value: Boolean): Self = StObject.set(x, "skip_sms_to_landlines", value.asInstanceOf[js.Any])
      
      inline def setTotp(value: js.Object): Self = StObject.set(x, "totp", value.asInstanceOf[js.Any])
      
      inline def setTts_name(value: String): Self = StObject.set(x, "tts_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceSolution extends StObject
}
