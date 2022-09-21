package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.PhoneNumberCapabilities
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incomingPhoneNumberTollFreeMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/tollFree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/tollFree", "TollFreeInstance")
  @js.native
  open class TollFreeInstance protected () extends SerializableClass {
    /**
      * Initialize the TollFreeContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: TollFreePayload, accountSid: String) = this()
    
    var accountSid: String = js.native
    
    var addressRequirements: TollFreeAddressRequirement = js.native
    
    var addressSid: String = js.native
    
    var apiVersion: String = js.native
    
    var beta: Boolean = js.native
    
    var bundleSid: String = js.native
    
    var capabilities: PhoneNumberCapabilities = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var emergencyAddressSid: String = js.native
    
    var emergencyAddressStatus: TollFreeEmergencyAddressStatus = js.native
    
    var emergencyStatus: TollFreeEmergencyStatus = js.native
    
    var friendlyName: String = js.native
    
    var identitySid: String = js.native
    
    var origin: String = js.native
    
    var phoneNumber: String = js.native
    
    var sid: String = js.native
    
    var smsApplicationSid: String = js.native
    
    var smsFallbackMethod: String = js.native
    
    var smsFallbackUrl: String = js.native
    
    var smsMethod: String = js.native
    
    var smsUrl: String = js.native
    
    var status: String = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    var trunkSid: String = js.native
    
    var uri: String = js.native
    
    var voiceApplicationSid: String = js.native
    
    var voiceCallerIdLookup: Boolean = js.native
    
    var voiceFallbackMethod: String = js.native
    
    var voiceFallbackUrl: String = js.native
    
    var voiceMethod: String = js.native
    
    var voiceReceiveMode: TollFreeVoiceReceiveMode = js.native
    
    var voiceUrl: String = js.native
  }
  
  /**
    * Initialize the TollFreeList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    */
  inline def TollFreeList(version: typings.twilio.v2010Mod.^, accountSid: String): TollFreeListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TollFreeList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[TollFreeListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/tollFree", "TollFreePage")
  @js.native
  open class TollFreePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, TollFreePayload, TollFreeResource, TollFreeInstance] {
    /**
      * Initialize the TollFreePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TollFreeSolution
    ) = this()
    
    /**
      * Build an instance of TollFreeInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TollFreePayload): TollFreeInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.none
    - typings.twilio.twilioStrings.any
    - typings.twilio.twilioStrings.local
    - typings.twilio.twilioStrings.foreign
  */
  trait TollFreeAddressRequirement extends StObject
  object TollFreeAddressRequirement {
    
    inline def any: typings.twilio.twilioStrings.any = "any".asInstanceOf[typings.twilio.twilioStrings.any]
    
    inline def foreign: typings.twilio.twilioStrings.foreign = "foreign".asInstanceOf[typings.twilio.twilioStrings.foreign]
    
    inline def local: typings.twilio.twilioStrings.local = "local".asInstanceOf[typings.twilio.twilioStrings.local]
    
    inline def none: typings.twilio.twilioStrings.none = "none".asInstanceOf[typings.twilio.twilioStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.registered
    - typings.twilio.twilioStrings.unregistered
    - typings.twilio.twilioStrings.`pending-registration`
    - typings.twilio.twilioStrings.`registration-failure`
    - typings.twilio.twilioStrings.`pending-unregistration`
    - typings.twilio.twilioStrings.`unregistration-failure`
  */
  trait TollFreeEmergencyAddressStatus extends StObject
  object TollFreeEmergencyAddressStatus {
    
    inline def `pending-registration`: typings.twilio.twilioStrings.`pending-registration` = "pending-registration".asInstanceOf[typings.twilio.twilioStrings.`pending-registration`]
    
    inline def `pending-unregistration`: typings.twilio.twilioStrings.`pending-unregistration` = "pending-unregistration".asInstanceOf[typings.twilio.twilioStrings.`pending-unregistration`]
    
    inline def registered: typings.twilio.twilioStrings.registered = "registered".asInstanceOf[typings.twilio.twilioStrings.registered]
    
    inline def `registration-failure`: typings.twilio.twilioStrings.`registration-failure` = "registration-failure".asInstanceOf[typings.twilio.twilioStrings.`registration-failure`]
    
    inline def unregistered: typings.twilio.twilioStrings.unregistered = "unregistered".asInstanceOf[typings.twilio.twilioStrings.unregistered]
    
    inline def `unregistration-failure`: typings.twilio.twilioStrings.`unregistration-failure` = "unregistration-failure".asInstanceOf[typings.twilio.twilioStrings.`unregistration-failure`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.Active
    - typings.twilio.twilioStrings.Inactive
  */
  trait TollFreeEmergencyStatus extends StObject
  object TollFreeEmergencyStatus {
    
    inline def Active: typings.twilio.twilioStrings.Active = "Active".asInstanceOf[typings.twilio.twilioStrings.Active]
    
    inline def Inactive: typings.twilio.twilioStrings.Inactive = "Inactive".asInstanceOf[typings.twilio.twilioStrings.Inactive]
  }
  
  @js.native
  trait TollFreeListInstance extends StObject {
    
    /**
      * create a TollFreeInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: TollFreeListInstanceCreateOptions): js.Promise[TollFreeInstance] = js.native
    def create(
      opts: TollFreeListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TollFreeInstance, Any]
    ): js.Promise[TollFreeInstance] = js.native
    
    /**
      * Streams TollFreeInstance records from the API.
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
          /* item */ TollFreeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TollFreeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TollFreeListInstanceEachOptions): Unit = js.native
    def each(
      opts: TollFreeListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TollFreeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of TollFreeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TollFreePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TollFreePage, Any]): js.Promise[TollFreePage] = js.native
    def getPage(targetUrl: String): js.Promise[TollFreePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TollFreePage, Any]
    ): js.Promise[TollFreePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TollFreePage, Any]
    ): js.Promise[TollFreePage] = js.native
    
    /**
      * Lists TollFreeInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TollFreeInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TollFreeInstance], Any]): js.Promise[js.Array[TollFreeInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TollFreeInstance], Any]
    ): js.Promise[js.Array[TollFreeInstance]] = js.native
    def list(opts: TollFreeListInstanceOptions): js.Promise[js.Array[TollFreeInstance]] = js.native
    def list(
      opts: TollFreeListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TollFreeInstance], Any]
    ): js.Promise[js.Array[TollFreeInstance]] = js.native
    
    /**
      * Retrieve a single page of TollFreeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TollFreePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TollFreePage, Any]): js.Promise[TollFreePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TollFreePage, Any]): js.Promise[TollFreePage] = js.native
    def page(opts: TollFreeListInstancePageOptions): js.Promise[TollFreePage] = js.native
    def page(
      opts: TollFreeListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TollFreePage, Any]
    ): js.Promise[TollFreePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property addressSid - The SID of the Address resource associated with the phone number
    * @property apiVersion - The API version to use for incoming calls made to the new phone number
    * @property bundleSid - The SID of the Bundle resource associated with number
    * @property emergencyAddressSid - The emergency address configuration to use for emergency calling
    * @property emergencyStatus - Displays if emergency calling is enabled for this number.
    * @property friendlyName - A string to describe the new phone number
    * @property identitySid - The SID of the Identity resource to associate with the new phone number
    * @property phoneNumber - The phone number to purchase in E.164 format
    * @property smsApplicationSid - The SID of the application to handle SMS messages
    * @property smsFallbackMethod - HTTP method used with sms_fallback_url
    * @property smsFallbackUrl - The URL we call when an error occurs while executing TwiML
    * @property smsMethod - The HTTP method to use with sms_url
    * @property smsUrl - The URL we should call when the new phone number receives an incoming SMS message
    * @property statusCallback - The URL to send status information to your application
    * @property statusCallbackMethod - The HTTP method we should use to call status_callback
    * @property trunkSid - SID of the trunk to handle calls to the new phone number
    * @property voiceApplicationSid - The SID of the application to handle the new phone number
    * @property voiceCallerIdLookup - Whether to lookup the caller's name
    * @property voiceFallbackMethod - The HTTP method used with voice_fallback_url
    * @property voiceFallbackUrl - The URL we will call when an error occurs in TwiML
    * @property voiceMethod - The HTTP method used with the voice_url
    * @property voiceReceiveMode - Incoming call type: fax or voice
    * @property voiceUrl - The URL we should call when the phone number receives a call
    */
  trait TollFreeListInstanceCreateOptions extends StObject {
    
    var addressSid: js.UndefOr[String] = js.undefined
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var bundleSid: js.UndefOr[String] = js.undefined
    
    var emergencyAddressSid: js.UndefOr[String] = js.undefined
    
    var emergencyStatus: js.UndefOr[TollFreeEmergencyStatus] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var identitySid: js.UndefOr[String] = js.undefined
    
    var phoneNumber: String
    
    var smsApplicationSid: js.UndefOr[String] = js.undefined
    
    var smsFallbackMethod: js.UndefOr[String] = js.undefined
    
    var smsFallbackUrl: js.UndefOr[String] = js.undefined
    
    var smsMethod: js.UndefOr[String] = js.undefined
    
    var smsUrl: js.UndefOr[String] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var trunkSid: js.UndefOr[String] = js.undefined
    
    var voiceApplicationSid: js.UndefOr[String] = js.undefined
    
    var voiceCallerIdLookup: js.UndefOr[Boolean] = js.undefined
    
    var voiceFallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceFallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceMethod: js.UndefOr[String] = js.undefined
    
    var voiceReceiveMode: js.UndefOr[TollFreeVoiceReceiveMode] = js.undefined
    
    var voiceUrl: js.UndefOr[String] = js.undefined
  }
  object TollFreeListInstanceCreateOptions {
    
    inline def apply(phoneNumber: String): TollFreeListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[TollFreeListInstanceCreateOptions]
    }
    
    extension [Self <: TollFreeListInstanceCreateOptions](x: Self) {
      
      inline def setAddressSid(value: String): Self = StObject.set(x, "addressSid", value.asInstanceOf[js.Any])
      
      inline def setAddressSidUndefined: Self = StObject.set(x, "addressSid", js.undefined)
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setBundleSid(value: String): Self = StObject.set(x, "bundleSid", value.asInstanceOf[js.Any])
      
      inline def setBundleSidUndefined: Self = StObject.set(x, "bundleSid", js.undefined)
      
      inline def setEmergencyAddressSid(value: String): Self = StObject.set(x, "emergencyAddressSid", value.asInstanceOf[js.Any])
      
      inline def setEmergencyAddressSidUndefined: Self = StObject.set(x, "emergencyAddressSid", js.undefined)
      
      inline def setEmergencyStatus(value: TollFreeEmergencyStatus): Self = StObject.set(x, "emergencyStatus", value.asInstanceOf[js.Any])
      
      inline def setEmergencyStatusUndefined: Self = StObject.set(x, "emergencyStatus", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIdentitySid(value: String): Self = StObject.set(x, "identitySid", value.asInstanceOf[js.Any])
      
      inline def setIdentitySidUndefined: Self = StObject.set(x, "identitySid", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setSmsApplicationSid(value: String): Self = StObject.set(x, "smsApplicationSid", value.asInstanceOf[js.Any])
      
      inline def setSmsApplicationSidUndefined: Self = StObject.set(x, "smsApplicationSid", js.undefined)
      
      inline def setSmsFallbackMethod(value: String): Self = StObject.set(x, "smsFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackMethodUndefined: Self = StObject.set(x, "smsFallbackMethod", js.undefined)
      
      inline def setSmsFallbackUrl(value: String): Self = StObject.set(x, "smsFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackUrlUndefined: Self = StObject.set(x, "smsFallbackUrl", js.undefined)
      
      inline def setSmsMethod(value: String): Self = StObject.set(x, "smsMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsMethodUndefined: Self = StObject.set(x, "smsMethod", js.undefined)
      
      inline def setSmsUrl(value: String): Self = StObject.set(x, "smsUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsUrlUndefined: Self = StObject.set(x, "smsUrl", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setTrunkSid(value: String): Self = StObject.set(x, "trunkSid", value.asInstanceOf[js.Any])
      
      inline def setTrunkSidUndefined: Self = StObject.set(x, "trunkSid", js.undefined)
      
      inline def setVoiceApplicationSid(value: String): Self = StObject.set(x, "voiceApplicationSid", value.asInstanceOf[js.Any])
      
      inline def setVoiceApplicationSidUndefined: Self = StObject.set(x, "voiceApplicationSid", js.undefined)
      
      inline def setVoiceCallerIdLookup(value: Boolean): Self = StObject.set(x, "voiceCallerIdLookup", value.asInstanceOf[js.Any])
      
      inline def setVoiceCallerIdLookupUndefined: Self = StObject.set(x, "voiceCallerIdLookup", js.undefined)
      
      inline def setVoiceFallbackMethod(value: String): Self = StObject.set(x, "voiceFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackMethodUndefined: Self = StObject.set(x, "voiceFallbackMethod", js.undefined)
      
      inline def setVoiceFallbackUrl(value: String): Self = StObject.set(x, "voiceFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackUrlUndefined: Self = StObject.set(x, "voiceFallbackUrl", js.undefined)
      
      inline def setVoiceMethod(value: String): Self = StObject.set(x, "voiceMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceMethodUndefined: Self = StObject.set(x, "voiceMethod", js.undefined)
      
      inline def setVoiceReceiveMode(value: TollFreeVoiceReceiveMode): Self = StObject.set(x, "voiceReceiveMode", value.asInstanceOf[js.Any])
      
      inline def setVoiceReceiveModeUndefined: Self = StObject.set(x, "voiceReceiveMode", js.undefined)
      
      inline def setVoiceUrl(value: String): Self = StObject.set(x, "voiceUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceUrlUndefined: Self = StObject.set(x, "voiceUrl", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property beta - Whether to include new phone numbers
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - A string that identifies the resources to read
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property origin - Include phone numbers based on their origin. By default, phone numbers of all origin are included.
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property phoneNumber - The phone numbers of the resources to read
    */
  trait TollFreeListInstanceEachOptions extends StObject {
    
    var beta: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TollFreeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
  }
  object TollFreeListInstanceEachOptions {
    
    inline def apply(): TollFreeListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TollFreeListInstanceEachOptions]
    }
    
    extension [Self <: TollFreeListInstanceEachOptions](x: Self) {
      
      inline def setBeta(value: Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
      
      inline def setCallback(
        value: (/* item */ TollFreeInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property beta - Whether to include new phone numbers
    * @property friendlyName - A string that identifies the resources to read
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property origin - Include phone numbers based on their origin. By default, phone numbers of all origin are included.
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property phoneNumber - The phone numbers of the resources to read
    */
  trait TollFreeListInstanceOptions extends StObject {
    
    var beta: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
  }
  object TollFreeListInstanceOptions {
    
    inline def apply(): TollFreeListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TollFreeListInstanceOptions]
    }
    
    extension [Self <: TollFreeListInstanceOptions](x: Self) {
      
      inline def setBeta(value: Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property beta - Whether to include new phone numbers
    * @property friendlyName - A string that identifies the resources to read
    * @property origin - Include phone numbers based on their origin. By default, phone numbers of all origin are included.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property phoneNumber - The phone numbers of the resources to read
    */
  trait TollFreeListInstancePageOptions extends StObject {
    
    var beta: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
  }
  object TollFreeListInstancePageOptions {
    
    inline def apply(): TollFreeListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TollFreeListInstancePageOptions]
    }
    
    extension [Self <: TollFreeListInstancePageOptions](x: Self) {
      
      inline def setBeta(value: Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait TollFreePayload
    extends StObject
       with TollFreeResource {
    
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
  object TollFreePayload {
    
    inline def apply(
      account_sid: String,
      address_requirements: TollFreeAddressRequirement,
      address_sid: String,
      api_version: String,
      beta: Boolean,
      bundle_sid: String,
      capabilities: PhoneNumberCapabilities,
      date_created: js.Date,
      date_updated: js.Date,
      emergency_address_sid: String,
      emergency_address_status: TollFreeEmergencyAddressStatus,
      emergency_status: TollFreeEmergencyStatus,
      first_page_uri: String,
      friendly_name: String,
      identity_sid: String,
      next_page_uri: String,
      origin: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      sid: String,
      sms_application_sid: String,
      sms_fallback_method: String,
      sms_fallback_url: String,
      sms_method: String,
      sms_url: String,
      status: String,
      status_callback: String,
      status_callback_method: String,
      trunk_sid: String,
      uri: String,
      voice_application_sid: String,
      voice_caller_id_lookup: Boolean,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_receive_mode: TollFreeVoiceReceiveMode,
      voice_url: String
    ): TollFreePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_requirements = address_requirements.asInstanceOf[js.Any], address_sid = address_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], bundle_sid = bundle_sid.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], emergency_address_sid = emergency_address_sid.asInstanceOf[js.Any], emergency_address_status = emergency_address_status.asInstanceOf[js.Any], emergency_status = emergency_status.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity_sid = identity_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_application_sid = sms_application_sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], trunk_sid = trunk_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], voice_application_sid = voice_application_sid.asInstanceOf[js.Any], voice_caller_id_lookup = voice_caller_id_lookup.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_receive_mode = voice_receive_mode.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TollFreePayload]
    }
    
    extension [Self <: TollFreePayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait TollFreeResource extends StObject {
    
    var account_sid: String
    
    var address_requirements: TollFreeAddressRequirement
    
    var address_sid: String
    
    var api_version: String
    
    var beta: Boolean
    
    var bundle_sid: String
    
    var capabilities: PhoneNumberCapabilities
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var emergency_address_sid: String
    
    var emergency_address_status: TollFreeEmergencyAddressStatus
    
    var emergency_status: TollFreeEmergencyStatus
    
    var friendly_name: String
    
    var identity_sid: String
    
    var origin: String
    
    var phone_number: String
    
    var sid: String
    
    var sms_application_sid: String
    
    var sms_fallback_method: String
    
    var sms_fallback_url: String
    
    var sms_method: String
    
    var sms_url: String
    
    var status: String
    
    var status_callback: String
    
    var status_callback_method: String
    
    var trunk_sid: String
    
    var uri: String
    
    var voice_application_sid: String
    
    var voice_caller_id_lookup: Boolean
    
    var voice_fallback_method: String
    
    var voice_fallback_url: String
    
    var voice_method: String
    
    var voice_receive_mode: TollFreeVoiceReceiveMode
    
    var voice_url: String
  }
  object TollFreeResource {
    
    inline def apply(
      account_sid: String,
      address_requirements: TollFreeAddressRequirement,
      address_sid: String,
      api_version: String,
      beta: Boolean,
      bundle_sid: String,
      capabilities: PhoneNumberCapabilities,
      date_created: js.Date,
      date_updated: js.Date,
      emergency_address_sid: String,
      emergency_address_status: TollFreeEmergencyAddressStatus,
      emergency_status: TollFreeEmergencyStatus,
      friendly_name: String,
      identity_sid: String,
      origin: String,
      phone_number: String,
      sid: String,
      sms_application_sid: String,
      sms_fallback_method: String,
      sms_fallback_url: String,
      sms_method: String,
      sms_url: String,
      status: String,
      status_callback: String,
      status_callback_method: String,
      trunk_sid: String,
      uri: String,
      voice_application_sid: String,
      voice_caller_id_lookup: Boolean,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_receive_mode: TollFreeVoiceReceiveMode,
      voice_url: String
    ): TollFreeResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_requirements = address_requirements.asInstanceOf[js.Any], address_sid = address_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], bundle_sid = bundle_sid.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], emergency_address_sid = emergency_address_sid.asInstanceOf[js.Any], emergency_address_status = emergency_address_status.asInstanceOf[js.Any], emergency_status = emergency_status.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity_sid = identity_sid.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_application_sid = sms_application_sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], trunk_sid = trunk_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], voice_application_sid = voice_application_sid.asInstanceOf[js.Any], voice_caller_id_lookup = voice_caller_id_lookup.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_receive_mode = voice_receive_mode.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TollFreeResource]
    }
    
    extension [Self <: TollFreeResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAddress_requirements(value: TollFreeAddressRequirement): Self = StObject.set(x, "address_requirements", value.asInstanceOf[js.Any])
      
      inline def setAddress_sid(value: String): Self = StObject.set(x, "address_sid", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setBeta(value: Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setBundle_sid(value: String): Self = StObject.set(x, "bundle_sid", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: PhoneNumberCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmergency_address_sid(value: String): Self = StObject.set(x, "emergency_address_sid", value.asInstanceOf[js.Any])
      
      inline def setEmergency_address_status(value: TollFreeEmergencyAddressStatus): Self = StObject.set(x, "emergency_address_status", value.asInstanceOf[js.Any])
      
      inline def setEmergency_status(value: TollFreeEmergencyStatus): Self = StObject.set(x, "emergency_status", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIdentity_sid(value: String): Self = StObject.set(x, "identity_sid", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSms_application_sid(value: String): Self = StObject.set(x, "sms_application_sid", value.asInstanceOf[js.Any])
      
      inline def setSms_fallback_method(value: String): Self = StObject.set(x, "sms_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setSms_fallback_url(value: String): Self = StObject.set(x, "sms_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setSms_method(value: String): Self = StObject.set(x, "sms_method", value.asInstanceOf[js.Any])
      
      inline def setSms_url(value: String): Self = StObject.set(x, "sms_url", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setTrunk_sid(value: String): Self = StObject.set(x, "trunk_sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setVoice_application_sid(value: String): Self = StObject.set(x, "voice_application_sid", value.asInstanceOf[js.Any])
      
      inline def setVoice_caller_id_lookup(value: Boolean): Self = StObject.set(x, "voice_caller_id_lookup", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_method(value: String): Self = StObject.set(x, "voice_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_url(value: String): Self = StObject.set(x, "voice_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setVoice_method(value: String): Self = StObject.set(x, "voice_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_receive_mode(value: TollFreeVoiceReceiveMode): Self = StObject.set(x, "voice_receive_mode", value.asInstanceOf[js.Any])
      
      inline def setVoice_url(value: String): Self = StObject.set(x, "voice_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TollFreeSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object TollFreeSolution {
    
    inline def apply(): TollFreeSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TollFreeSolution]
    }
    
    extension [Self <: TollFreeSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.voice
    - typings.twilio.twilioStrings.fax
  */
  trait TollFreeVoiceReceiveMode extends StObject
  object TollFreeVoiceReceiveMode {
    
    inline def fax: typings.twilio.twilioStrings.fax = "fax".asInstanceOf[typings.twilio.twilioStrings.fax]
    
    inline def voice: typings.twilio.twilioStrings.voice = "voice".asInstanceOf[typings.twilio.twilioStrings.voice]
  }
}
