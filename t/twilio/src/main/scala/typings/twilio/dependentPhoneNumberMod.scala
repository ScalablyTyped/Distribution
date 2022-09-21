package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependentPhoneNumberMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/address/dependentPhoneNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/address/dependentPhoneNumber", "DependentPhoneNumberInstance")
  @js.native
  open class DependentPhoneNumberInstance protected () extends SerializableClass {
    /**
      * Initialize the DependentPhoneNumberContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param addressSid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: DependentPhoneNumberPayload,
      accountSid: String,
      addressSid: String
    ) = this()
    
    var accountSid: String = js.native
    
    var addressRequirements: DependentPhoneNumberAddressRequirement = js.native
    
    var apiVersion: String = js.native
    
    var capabilities: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var emergencyAddressSid: String = js.native
    
    var emergencyStatus: DependentPhoneNumberEmergencyStatus = js.native
    
    var friendlyName: String = js.native
    
    var phoneNumber: String = js.native
    
    var sid: String = js.native
    
    var smsApplicationSid: String = js.native
    
    var smsFallbackMethod: String = js.native
    
    var smsFallbackUrl: String = js.native
    
    var smsMethod: String = js.native
    
    var smsUrl: String = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    var trunkSid: String = js.native
    
    var uri: String = js.native
    
    var voiceApplicationSid: String = js.native
    
    var voiceCallerIdLookup: Boolean = js.native
    
    var voiceFallbackMethod: String = js.native
    
    var voiceFallbackUrl: String = js.native
    
    var voiceMethod: String = js.native
    
    var voiceUrl: String = js.native
  }
  
  /**
    * Initialize the DependentPhoneNumberList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param addressSid - The unique string that identifies the resource
    */
  inline def DependentPhoneNumberList(version: typings.twilio.v2010Mod.^, accountSid: String, addressSid: String): DependentPhoneNumberListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DependentPhoneNumberList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], addressSid.asInstanceOf[js.Any])).asInstanceOf[DependentPhoneNumberListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/address/dependentPhoneNumber", "DependentPhoneNumberPage")
  @js.native
  open class DependentPhoneNumberPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          DependentPhoneNumberPayload, 
          DependentPhoneNumberResource, 
          DependentPhoneNumberInstance
        ] {
    /**
      * Initialize the DependentPhoneNumberPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: DependentPhoneNumberSolution
    ) = this()
    
    /**
      * Build an instance of DependentPhoneNumberInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DependentPhoneNumberPayload): DependentPhoneNumberInstance = js.native
    
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
  trait DependentPhoneNumberAddressRequirement extends StObject
  object DependentPhoneNumberAddressRequirement {
    
    inline def any: typings.twilio.twilioStrings.any = "any".asInstanceOf[typings.twilio.twilioStrings.any]
    
    inline def foreign: typings.twilio.twilioStrings.foreign = "foreign".asInstanceOf[typings.twilio.twilioStrings.foreign]
    
    inline def local: typings.twilio.twilioStrings.local = "local".asInstanceOf[typings.twilio.twilioStrings.local]
    
    inline def none: typings.twilio.twilioStrings.none = "none".asInstanceOf[typings.twilio.twilioStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.Active
    - typings.twilio.twilioStrings.Inactive
  */
  trait DependentPhoneNumberEmergencyStatus extends StObject
  object DependentPhoneNumberEmergencyStatus {
    
    inline def Active: typings.twilio.twilioStrings.Active = "Active".asInstanceOf[typings.twilio.twilioStrings.Active]
    
    inline def Inactive: typings.twilio.twilioStrings.Inactive = "Inactive".asInstanceOf[typings.twilio.twilioStrings.Inactive]
  }
  
  @js.native
  trait DependentPhoneNumberListInstance extends StObject {
    
    /**
      * Streams DependentPhoneNumberInstance records from the API.
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
          /* item */ DependentPhoneNumberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DependentPhoneNumberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DependentPhoneNumberListInstanceEachOptions): Unit = js.native
    def each(
      opts: DependentPhoneNumberListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DependentPhoneNumberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of DependentPhoneNumberInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DependentPhoneNumberPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentPhoneNumberPage, Any]): js.Promise[DependentPhoneNumberPage] = js.native
    def getPage(targetUrl: String): js.Promise[DependentPhoneNumberPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentPhoneNumberPage, Any]
    ): js.Promise[DependentPhoneNumberPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentPhoneNumberPage, Any]
    ): js.Promise[DependentPhoneNumberPage] = js.native
    
    /**
      * Lists DependentPhoneNumberInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DependentPhoneNumberInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DependentPhoneNumberInstance], Any]
    ): js.Promise[js.Array[DependentPhoneNumberInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DependentPhoneNumberInstance], Any]
    ): js.Promise[js.Array[DependentPhoneNumberInstance]] = js.native
    def list(opts: DependentPhoneNumberListInstanceOptions): js.Promise[js.Array[DependentPhoneNumberInstance]] = js.native
    def list(
      opts: DependentPhoneNumberListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DependentPhoneNumberInstance], Any]
    ): js.Promise[js.Array[DependentPhoneNumberInstance]] = js.native
    
    /**
      * Retrieve a single page of DependentPhoneNumberInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DependentPhoneNumberPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentPhoneNumberPage, Any]): js.Promise[DependentPhoneNumberPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentPhoneNumberPage, Any]
    ): js.Promise[DependentPhoneNumberPage] = js.native
    def page(opts: DependentPhoneNumberListInstancePageOptions): js.Promise[DependentPhoneNumberPage] = js.native
    def page(
      opts: DependentPhoneNumberListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentPhoneNumberPage, Any]
    ): js.Promise[DependentPhoneNumberPage] = js.native
    
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
  trait DependentPhoneNumberListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DependentPhoneNumberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DependentPhoneNumberListInstanceEachOptions {
    
    inline def apply(): DependentPhoneNumberListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentPhoneNumberListInstanceEachOptions]
    }
    
    extension [Self <: DependentPhoneNumberListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ DependentPhoneNumberInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait DependentPhoneNumberListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DependentPhoneNumberListInstanceOptions {
    
    inline def apply(): DependentPhoneNumberListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentPhoneNumberListInstanceOptions]
    }
    
    extension [Self <: DependentPhoneNumberListInstanceOptions](x: Self) {
      
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
  trait DependentPhoneNumberListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DependentPhoneNumberListInstancePageOptions {
    
    inline def apply(): DependentPhoneNumberListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentPhoneNumberListInstancePageOptions]
    }
    
    extension [Self <: DependentPhoneNumberListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait DependentPhoneNumberPayload
    extends StObject
       with DependentPhoneNumberResource {
    
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
  object DependentPhoneNumberPayload {
    
    inline def apply(
      account_sid: String,
      address_requirements: DependentPhoneNumberAddressRequirement,
      api_version: String,
      capabilities: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      emergency_address_sid: String,
      emergency_status: DependentPhoneNumberEmergencyStatus,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
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
      status_callback: String,
      status_callback_method: String,
      trunk_sid: String,
      uri: String,
      voice_application_sid: String,
      voice_caller_id_lookup: Boolean,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_url: String
    ): DependentPhoneNumberPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_requirements = address_requirements.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], emergency_address_sid = emergency_address_sid.asInstanceOf[js.Any], emergency_status = emergency_status.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_application_sid = sms_application_sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], trunk_sid = trunk_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], voice_application_sid = voice_application_sid.asInstanceOf[js.Any], voice_caller_id_lookup = voice_caller_id_lookup.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependentPhoneNumberPayload]
    }
    
    extension [Self <: DependentPhoneNumberPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependentPhoneNumberResource extends StObject {
    
    var account_sid: String
    
    var address_requirements: DependentPhoneNumberAddressRequirement
    
    var api_version: String
    
    var capabilities: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var emergency_address_sid: String
    
    var emergency_status: DependentPhoneNumberEmergencyStatus
    
    var friendly_name: String
    
    var phone_number: String
    
    var sid: String
    
    var sms_application_sid: String
    
    var sms_fallback_method: String
    
    var sms_fallback_url: String
    
    var sms_method: String
    
    var sms_url: String
    
    var status_callback: String
    
    var status_callback_method: String
    
    var trunk_sid: String
    
    var uri: String
    
    var voice_application_sid: String
    
    var voice_caller_id_lookup: Boolean
    
    var voice_fallback_method: String
    
    var voice_fallback_url: String
    
    var voice_method: String
    
    var voice_url: String
  }
  object DependentPhoneNumberResource {
    
    inline def apply(
      account_sid: String,
      address_requirements: DependentPhoneNumberAddressRequirement,
      api_version: String,
      capabilities: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      emergency_address_sid: String,
      emergency_status: DependentPhoneNumberEmergencyStatus,
      friendly_name: String,
      phone_number: String,
      sid: String,
      sms_application_sid: String,
      sms_fallback_method: String,
      sms_fallback_url: String,
      sms_method: String,
      sms_url: String,
      status_callback: String,
      status_callback_method: String,
      trunk_sid: String,
      uri: String,
      voice_application_sid: String,
      voice_caller_id_lookup: Boolean,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_url: String
    ): DependentPhoneNumberResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_requirements = address_requirements.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], emergency_address_sid = emergency_address_sid.asInstanceOf[js.Any], emergency_status = emergency_status.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_application_sid = sms_application_sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], trunk_sid = trunk_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], voice_application_sid = voice_application_sid.asInstanceOf[js.Any], voice_caller_id_lookup = voice_caller_id_lookup.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependentPhoneNumberResource]
    }
    
    extension [Self <: DependentPhoneNumberResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAddress_requirements(value: DependentPhoneNumberAddressRequirement): Self = StObject.set(x, "address_requirements", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: js.Object): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmergency_address_sid(value: String): Self = StObject.set(x, "emergency_address_sid", value.asInstanceOf[js.Any])
      
      inline def setEmergency_status(value: DependentPhoneNumberEmergencyStatus): Self = StObject.set(x, "emergency_status", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSms_application_sid(value: String): Self = StObject.set(x, "sms_application_sid", value.asInstanceOf[js.Any])
      
      inline def setSms_fallback_method(value: String): Self = StObject.set(x, "sms_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setSms_fallback_url(value: String): Self = StObject.set(x, "sms_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setSms_method(value: String): Self = StObject.set(x, "sms_method", value.asInstanceOf[js.Any])
      
      inline def setSms_url(value: String): Self = StObject.set(x, "sms_url", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setTrunk_sid(value: String): Self = StObject.set(x, "trunk_sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setVoice_application_sid(value: String): Self = StObject.set(x, "voice_application_sid", value.asInstanceOf[js.Any])
      
      inline def setVoice_caller_id_lookup(value: Boolean): Self = StObject.set(x, "voice_caller_id_lookup", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_method(value: String): Self = StObject.set(x, "voice_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_url(value: String): Self = StObject.set(x, "voice_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setVoice_method(value: String): Self = StObject.set(x, "voice_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_url(value: String): Self = StObject.set(x, "voice_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependentPhoneNumberSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var addressSid: js.UndefOr[String] = js.undefined
  }
  object DependentPhoneNumberSolution {
    
    inline def apply(): DependentPhoneNumberSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentPhoneNumberSolution]
    }
    
    extension [Self <: DependentPhoneNumberSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setAddressSid(value: String): Self = StObject.set(x, "addressSid", value.asInstanceOf[js.Any])
      
      inline def setAddressSidUndefined: Self = StObject.set(x, "addressSid", js.undefined)
    }
  }
}
