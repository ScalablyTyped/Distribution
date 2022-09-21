package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.authTypesMod.AuthTypesListInstance
import typings.twilio.credentialListMappingMod.CredentialListMappingContext
import typings.twilio.credentialListMappingMod.CredentialListMappingListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.ipAccessControlListMappingMod.IpAccessControlListMappingContext
import typings.twilio.ipAccessControlListMappingMod.IpAccessControlListMappingListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sipDomainMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain", "DomainContext")
  @js.native
  open class DomainContext protected () extends StObject {
    /**
      * Initialize the DomainContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    var auth: AuthTypesListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def credentialListMappings(sid: String): CredentialListMappingContext = js.native
    @JSName("credentialListMappings")
    var credentialListMappings_Original: CredentialListMappingListInstance = js.native
    
    /**
      * fetch a DomainInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DomainInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainInstance, Any]): js.Promise[DomainInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def ipAccessControlListMappings(sid: String): IpAccessControlListMappingContext = js.native
    @JSName("ipAccessControlListMappings")
    var ipAccessControlListMappings_Original: IpAccessControlListMappingListInstance = js.native
    
    /**
      * remove a DomainInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a DomainInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[DomainInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainInstance, Any]): js.Promise[DomainInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainInstance, Any]): js.Promise[DomainInstance] = js.native
    def update(opts: DomainInstanceUpdateOptions): js.Promise[DomainInstance] = js.native
    def update(
      opts: DomainInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainInstance, Any]
    ): js.Promise[DomainInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain", "DomainInstance")
  @js.native
  open class DomainInstance protected () extends SerializableClass {
    /**
      * Initialize the DomainContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - A 34 character string that uniquely identifies this resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: DomainPayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: DomainContext = js.native
    
    var accountSid: String = js.native
    
    var apiVersion: String = js.native
    
    /**
      * Access the auth
      */
    def auth(): AuthTypesListInstance = js.native
    
    var authType: String = js.native
    
    var byocTrunkSid: String = js.native
    
    /**
      * Access the credentialListMappings
      */
    def credentialListMappings(): CredentialListMappingListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var domainName: String = js.native
    
    var emergencyCallerSid: String = js.native
    
    var emergencyCallingEnabled: Boolean = js.native
    
    /**
      * fetch a DomainInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DomainInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DomainInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * Access the ipAccessControlListMappings
      */
    def ipAccessControlListMappings(): IpAccessControlListMappingListInstance = js.native
    
    /**
      * remove a DomainInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var secure: Boolean = js.native
    
    var sid: String = js.native
    
    var sipRegistration: Boolean = js.native
    
    var subresourceUris: String = js.native
    
    /**
      * update a DomainInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[DomainInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DomainInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DomainInstance] = js.native
    def update(opts: DomainInstanceUpdateOptions): js.Promise[DomainInstance] = js.native
    def update(
      opts: DomainInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[DomainInstance] = js.native
    
    var uri: String = js.native
    
    var voiceFallbackMethod: String = js.native
    
    var voiceFallbackUrl: String = js.native
    
    var voiceMethod: String = js.native
    
    var voiceStatusCallbackMethod: String = js.native
    
    var voiceStatusCallbackUrl: String = js.native
    
    var voiceUrl: String = js.native
  }
  
  /**
    * Initialize the DomainList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def DomainList(version: typings.twilio.v2010Mod.^, accountSid: String): DomainListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DomainList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[DomainListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain", "DomainPage")
  @js.native
  open class DomainPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, DomainPayload, DomainResource, DomainInstance] {
    /**
      * Initialize the DomainPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: DomainSolution
    ) = this()
    
    /**
      * Build an instance of DomainInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DomainPayload): DomainInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property byocTrunkSid - The SID of the BYOC Trunk resource.
    * @property domainName - The unique address on Twilio to route SIP traffic
    * @property emergencyCallerSid - Whether an emergency caller sid is configured for the domain.
    * @property emergencyCallingEnabled - Whether emergency calling is enabled for the domain.
    * @property friendlyName - A string to describe the resource
    * @property secure - Whether secure SIP is enabled for the domain
    * @property sipRegistration - Whether SIP registration is allowed
    * @property voiceFallbackMethod - The HTTP method used with voice_fallback_url
    * @property voiceFallbackUrl - The URL we should call when an error occurs in executing TwiML
    * @property voiceMethod - The HTTP method we should use with voice_url
    * @property voiceStatusCallbackMethod - The HTTP method we should use to call voice_status_callback_url
    * @property voiceStatusCallbackUrl - The URL that we should call to pass status updates
    * @property voiceUrl - The URL we should call when receiving a call
    */
  trait DomainInstanceUpdateOptions extends StObject {
    
    var byocTrunkSid: js.UndefOr[String] = js.undefined
    
    var domainName: js.UndefOr[String] = js.undefined
    
    var emergencyCallerSid: js.UndefOr[String] = js.undefined
    
    var emergencyCallingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var sipRegistration: js.UndefOr[Boolean] = js.undefined
    
    var voiceFallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceFallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceMethod: js.UndefOr[String] = js.undefined
    
    var voiceStatusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceStatusCallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceUrl: js.UndefOr[String] = js.undefined
  }
  object DomainInstanceUpdateOptions {
    
    inline def apply(): DomainInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainInstanceUpdateOptions]
    }
    
    extension [Self <: DomainInstanceUpdateOptions](x: Self) {
      
      inline def setByocTrunkSid(value: String): Self = StObject.set(x, "byocTrunkSid", value.asInstanceOf[js.Any])
      
      inline def setByocTrunkSidUndefined: Self = StObject.set(x, "byocTrunkSid", js.undefined)
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setEmergencyCallerSid(value: String): Self = StObject.set(x, "emergencyCallerSid", value.asInstanceOf[js.Any])
      
      inline def setEmergencyCallerSidUndefined: Self = StObject.set(x, "emergencyCallerSid", js.undefined)
      
      inline def setEmergencyCallingEnabled(value: Boolean): Self = StObject.set(x, "emergencyCallingEnabled", value.asInstanceOf[js.Any])
      
      inline def setEmergencyCallingEnabledUndefined: Self = StObject.set(x, "emergencyCallingEnabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSipRegistration(value: Boolean): Self = StObject.set(x, "sipRegistration", value.asInstanceOf[js.Any])
      
      inline def setSipRegistrationUndefined: Self = StObject.set(x, "sipRegistration", js.undefined)
      
      inline def setVoiceFallbackMethod(value: String): Self = StObject.set(x, "voiceFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackMethodUndefined: Self = StObject.set(x, "voiceFallbackMethod", js.undefined)
      
      inline def setVoiceFallbackUrl(value: String): Self = StObject.set(x, "voiceFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackUrlUndefined: Self = StObject.set(x, "voiceFallbackUrl", js.undefined)
      
      inline def setVoiceMethod(value: String): Self = StObject.set(x, "voiceMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceMethodUndefined: Self = StObject.set(x, "voiceMethod", js.undefined)
      
      inline def setVoiceStatusCallbackMethod(value: String): Self = StObject.set(x, "voiceStatusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceStatusCallbackMethodUndefined: Self = StObject.set(x, "voiceStatusCallbackMethod", js.undefined)
      
      inline def setVoiceStatusCallbackUrl(value: String): Self = StObject.set(x, "voiceStatusCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceStatusCallbackUrlUndefined: Self = StObject.set(x, "voiceStatusCallbackUrl", js.undefined)
      
      inline def setVoiceUrl(value: String): Self = StObject.set(x, "voiceUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceUrlUndefined: Self = StObject.set(x, "voiceUrl", js.undefined)
    }
  }
  
  @js.native
  trait DomainListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DomainContext = js.native
    
    /**
      * create a DomainInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: DomainListInstanceCreateOptions): js.Promise[DomainInstance] = js.native
    def create(
      opts: DomainListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ DomainInstance, Any]
    ): js.Promise[DomainInstance] = js.native
    
    /**
      * Streams DomainInstance records from the API.
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
          /* item */ DomainInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DomainInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DomainListInstanceEachOptions): Unit = js.native
    def each(
      opts: DomainListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DomainInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a domain
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): DomainContext = js.native
    
    /**
      * Retrieve a single target page of DomainInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DomainPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainPage, Any]): js.Promise[DomainPage] = js.native
    def getPage(targetUrl: String): js.Promise[DomainPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainPage, Any]
    ): js.Promise[DomainPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainPage, Any]): js.Promise[DomainPage] = js.native
    
    /**
      * Lists DomainInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DomainInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DomainInstance], Any]): js.Promise[js.Array[DomainInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DomainInstance], Any]
    ): js.Promise[js.Array[DomainInstance]] = js.native
    def list(opts: DomainListInstanceOptions): js.Promise[js.Array[DomainInstance]] = js.native
    def list(
      opts: DomainListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DomainInstance], Any]
    ): js.Promise[js.Array[DomainInstance]] = js.native
    
    /**
      * Retrieve a single page of DomainInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DomainPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainPage, Any]): js.Promise[DomainPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainPage, Any]): js.Promise[DomainPage] = js.native
    def page(opts: DomainListInstancePageOptions): js.Promise[DomainPage] = js.native
    def page(
      opts: DomainListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DomainPage, Any]
    ): js.Promise[DomainPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property byocTrunkSid - The SID of the BYOC Trunk resource.
    * @property domainName - The unique address on Twilio to route SIP traffic
    * @property emergencyCallerSid - Whether an emergency caller sid is configured for the domain.
    * @property emergencyCallingEnabled - Whether emergency calling is enabled for the domain.
    * @property friendlyName - A string to describe the resource
    * @property secure - Whether secure SIP is enabled for the domain
    * @property sipRegistration - Whether SIP registration is allowed
    * @property voiceFallbackMethod - The HTTP method to use with voice_fallback_url
    * @property voiceFallbackUrl - The URL we should call when an error occurs in executing TwiML
    * @property voiceMethod - The HTTP method to use with voice_url
    * @property voiceStatusCallbackMethod - The HTTP method we should use to call `voice_status_callback_url`
    * @property voiceStatusCallbackUrl - The URL that we should call to pass status updates
    * @property voiceUrl - The URL we should call when receiving a call
    */
  trait DomainListInstanceCreateOptions extends StObject {
    
    var byocTrunkSid: js.UndefOr[String] = js.undefined
    
    var domainName: String
    
    var emergencyCallerSid: js.UndefOr[String] = js.undefined
    
    var emergencyCallingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var sipRegistration: js.UndefOr[Boolean] = js.undefined
    
    var voiceFallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceFallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceMethod: js.UndefOr[String] = js.undefined
    
    var voiceStatusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceStatusCallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceUrl: js.UndefOr[String] = js.undefined
  }
  object DomainListInstanceCreateOptions {
    
    inline def apply(domainName: String): DomainListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainListInstanceCreateOptions]
    }
    
    extension [Self <: DomainListInstanceCreateOptions](x: Self) {
      
      inline def setByocTrunkSid(value: String): Self = StObject.set(x, "byocTrunkSid", value.asInstanceOf[js.Any])
      
      inline def setByocTrunkSidUndefined: Self = StObject.set(x, "byocTrunkSid", js.undefined)
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setEmergencyCallerSid(value: String): Self = StObject.set(x, "emergencyCallerSid", value.asInstanceOf[js.Any])
      
      inline def setEmergencyCallerSidUndefined: Self = StObject.set(x, "emergencyCallerSid", js.undefined)
      
      inline def setEmergencyCallingEnabled(value: Boolean): Self = StObject.set(x, "emergencyCallingEnabled", value.asInstanceOf[js.Any])
      
      inline def setEmergencyCallingEnabledUndefined: Self = StObject.set(x, "emergencyCallingEnabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSipRegistration(value: Boolean): Self = StObject.set(x, "sipRegistration", value.asInstanceOf[js.Any])
      
      inline def setSipRegistrationUndefined: Self = StObject.set(x, "sipRegistration", js.undefined)
      
      inline def setVoiceFallbackMethod(value: String): Self = StObject.set(x, "voiceFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackMethodUndefined: Self = StObject.set(x, "voiceFallbackMethod", js.undefined)
      
      inline def setVoiceFallbackUrl(value: String): Self = StObject.set(x, "voiceFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackUrlUndefined: Self = StObject.set(x, "voiceFallbackUrl", js.undefined)
      
      inline def setVoiceMethod(value: String): Self = StObject.set(x, "voiceMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceMethodUndefined: Self = StObject.set(x, "voiceMethod", js.undefined)
      
      inline def setVoiceStatusCallbackMethod(value: String): Self = StObject.set(x, "voiceStatusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceStatusCallbackMethodUndefined: Self = StObject.set(x, "voiceStatusCallbackMethod", js.undefined)
      
      inline def setVoiceStatusCallbackUrl(value: String): Self = StObject.set(x, "voiceStatusCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceStatusCallbackUrlUndefined: Self = StObject.set(x, "voiceStatusCallbackUrl", js.undefined)
      
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
  trait DomainListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DomainInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DomainListInstanceEachOptions {
    
    inline def apply(): DomainListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainListInstanceEachOptions]
    }
    
    extension [Self <: DomainListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ DomainInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait DomainListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DomainListInstanceOptions {
    
    inline def apply(): DomainListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainListInstanceOptions]
    }
    
    extension [Self <: DomainListInstanceOptions](x: Self) {
      
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
  trait DomainListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DomainListInstancePageOptions {
    
    inline def apply(): DomainListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainListInstancePageOptions]
    }
    
    extension [Self <: DomainListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait DomainPayload
    extends StObject
       with DomainResource {
    
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
  object DomainPayload {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      auth_type: String,
      byoc_trunk_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      domain_name: String,
      emergency_caller_sid: String,
      emergency_calling_enabled: Boolean,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      secure: Boolean,
      sid: String,
      sip_registration: Boolean,
      subresource_uris: String,
      uri: String,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_status_callback_method: String,
      voice_status_callback_url: String,
      voice_url: String
    ): DomainPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], auth_type = auth_type.asInstanceOf[js.Any], byoc_trunk_sid = byoc_trunk_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], domain_name = domain_name.asInstanceOf[js.Any], emergency_caller_sid = emergency_caller_sid.asInstanceOf[js.Any], emergency_calling_enabled = emergency_calling_enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sip_registration = sip_registration.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_status_callback_method = voice_status_callback_method.asInstanceOf[js.Any], voice_status_callback_url = voice_status_callback_url.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainPayload]
    }
    
    extension [Self <: DomainPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainResource extends StObject {
    
    var account_sid: String
    
    var api_version: String
    
    var auth_type: String
    
    var byoc_trunk_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var domain_name: String
    
    var emergency_caller_sid: String
    
    var emergency_calling_enabled: Boolean
    
    var friendly_name: String
    
    var secure: Boolean
    
    var sid: String
    
    var sip_registration: Boolean
    
    var subresource_uris: String
    
    var uri: String
    
    var voice_fallback_method: String
    
    var voice_fallback_url: String
    
    var voice_method: String
    
    var voice_status_callback_method: String
    
    var voice_status_callback_url: String
    
    var voice_url: String
  }
  object DomainResource {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      auth_type: String,
      byoc_trunk_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      domain_name: String,
      emergency_caller_sid: String,
      emergency_calling_enabled: Boolean,
      friendly_name: String,
      secure: Boolean,
      sid: String,
      sip_registration: Boolean,
      subresource_uris: String,
      uri: String,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_status_callback_method: String,
      voice_status_callback_url: String,
      voice_url: String
    ): DomainResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], auth_type = auth_type.asInstanceOf[js.Any], byoc_trunk_sid = byoc_trunk_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], domain_name = domain_name.asInstanceOf[js.Any], emergency_caller_sid = emergency_caller_sid.asInstanceOf[js.Any], emergency_calling_enabled = emergency_calling_enabled.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sip_registration = sip_registration.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_status_callback_method = voice_status_callback_method.asInstanceOf[js.Any], voice_status_callback_url = voice_status_callback_url.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainResource]
    }
    
    extension [Self <: DomainResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setAuth_type(value: String): Self = StObject.set(x, "auth_type", value.asInstanceOf[js.Any])
      
      inline def setByoc_trunk_sid(value: String): Self = StObject.set(x, "byoc_trunk_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDomain_name(value: String): Self = StObject.set(x, "domain_name", value.asInstanceOf[js.Any])
      
      inline def setEmergency_caller_sid(value: String): Self = StObject.set(x, "emergency_caller_sid", value.asInstanceOf[js.Any])
      
      inline def setEmergency_calling_enabled(value: Boolean): Self = StObject.set(x, "emergency_calling_enabled", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSip_registration(value: Boolean): Self = StObject.set(x, "sip_registration", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_method(value: String): Self = StObject.set(x, "voice_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_url(value: String): Self = StObject.set(x, "voice_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setVoice_method(value: String): Self = StObject.set(x, "voice_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_status_callback_method(value: String): Self = StObject.set(x, "voice_status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_status_callback_url(value: String): Self = StObject.set(x, "voice_status_callback_url", value.asInstanceOf[js.Any])
      
      inline def setVoice_url(value: String): Self = StObject.set(x, "voice_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object DomainSolution {
    
    inline def apply(): DomainSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainSolution]
    }
    
    extension [Self <: DomainSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
