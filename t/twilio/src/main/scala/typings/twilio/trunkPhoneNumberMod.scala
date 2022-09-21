package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trunkPhoneNumberMod {
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/phoneNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/phoneNumber", "PhoneNumberContext")
  @js.native
  open class PhoneNumberContext protected () extends StObject {
    /**
      * Initialize the PhoneNumberContext
      *
      * @param version - Version of the resource
      * @param trunkSid - The SID of the Trunk from which to fetch the PhoneNumber resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trunkingV1Mod.^, trunkSid: String, sid: String) = this()
    
    /**
      * fetch a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PhoneNumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberInstance, Any]): js.Promise[PhoneNumberInstance] = js.native
    
    /**
      * remove a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/phoneNumber", "PhoneNumberInstance")
  @js.native
  open class PhoneNumberInstance protected () extends SerializableClass {
    /**
      * Initialize the PhoneNumberContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param trunkSid - The SID of the Trunk that handles calls to the phone number
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.trunkingV1Mod.^,
      payload: PhoneNumberPayload,
      trunkSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: PhoneNumberContext = js.native
    
    var accountSid: String = js.native
    
    var addressRequirements: PhoneNumberAddressRequirement = js.native
    
    var apiVersion: String = js.native
    
    var beta: Boolean = js.native
    
    var capabilities: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PhoneNumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PhoneNumberInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    var phoneNumber: String = js.native
    
    /**
      * remove a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var smsApplicationSid: String = js.native
    
    var smsFallbackMethod: String = js.native
    
    var smsFallbackUrl: String = js.native
    
    var smsMethod: String = js.native
    
    var smsUrl: String = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    var trunkSid: String = js.native
    
    var url: String = js.native
    
    var voiceApplicationSid: String = js.native
    
    var voiceCallerIdLookup: Boolean = js.native
    
    var voiceFallbackMethod: String = js.native
    
    var voiceFallbackUrl: String = js.native
    
    var voiceMethod: String = js.native
    
    var voiceUrl: String = js.native
  }
  
  /**
    * Initialize the PhoneNumberList
    *
    * @param version - Version of the resource
    * @param trunkSid - The SID of the Trunk that handles calls to the phone number
    */
  inline def PhoneNumberList(version: typings.twilio.trunkingV1Mod.^, trunkSid: String): PhoneNumberListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("PhoneNumberList")(version.asInstanceOf[js.Any], trunkSid.asInstanceOf[js.Any])).asInstanceOf[PhoneNumberListInstance]
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/phoneNumber", "PhoneNumberPage")
  @js.native
  open class PhoneNumberPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trunkingV1Mod.^, 
          PhoneNumberPayload, 
          PhoneNumberResource, 
          PhoneNumberInstance
        ] {
    /**
      * Initialize the PhoneNumberPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trunkingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: PhoneNumberSolution
    ) = this()
    
    /**
      * Build an instance of PhoneNumberInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: PhoneNumberPayload): PhoneNumberInstance = js.native
    
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
  trait PhoneNumberAddressRequirement extends StObject
  object PhoneNumberAddressRequirement {
    
    inline def any: typings.twilio.twilioStrings.any = "any".asInstanceOf[typings.twilio.twilioStrings.any]
    
    inline def foreign: typings.twilio.twilioStrings.foreign = "foreign".asInstanceOf[typings.twilio.twilioStrings.foreign]
    
    inline def local: typings.twilio.twilioStrings.local = "local".asInstanceOf[typings.twilio.twilioStrings.local]
    
    inline def none: typings.twilio.twilioStrings.none = "none".asInstanceOf[typings.twilio.twilioStrings.none]
  }
  
  @js.native
  trait PhoneNumberListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): PhoneNumberContext = js.native
    
    /**
      * create a PhoneNumberInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: PhoneNumberListInstanceCreateOptions): js.Promise[PhoneNumberInstance] = js.native
    def create(
      opts: PhoneNumberListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ PhoneNumberInstance, Any]
    ): js.Promise[PhoneNumberInstance] = js.native
    
    /**
      * Streams PhoneNumberInstance records from the API.
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
          /* item */ PhoneNumberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ PhoneNumberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: PhoneNumberListInstanceEachOptions): Unit = js.native
    def each(
      opts: PhoneNumberListInstanceEachOptions,
      callback: js.Function2[
          /* item */ PhoneNumberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a phone_number
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): PhoneNumberContext = js.native
    
    /**
      * Retrieve a single target page of PhoneNumberInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[PhoneNumberPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberPage, Any]): js.Promise[PhoneNumberPage] = js.native
    def getPage(targetUrl: String): js.Promise[PhoneNumberPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberPage, Any]
    ): js.Promise[PhoneNumberPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberPage, Any]
    ): js.Promise[PhoneNumberPage] = js.native
    
    /**
      * Lists PhoneNumberInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[PhoneNumberInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PhoneNumberInstance], Any]
    ): js.Promise[js.Array[PhoneNumberInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PhoneNumberInstance], Any]
    ): js.Promise[js.Array[PhoneNumberInstance]] = js.native
    def list(opts: PhoneNumberListInstanceOptions): js.Promise[js.Array[PhoneNumberInstance]] = js.native
    def list(
      opts: PhoneNumberListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PhoneNumberInstance], Any]
    ): js.Promise[js.Array[PhoneNumberInstance]] = js.native
    
    /**
      * Retrieve a single page of PhoneNumberInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[PhoneNumberPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberPage, Any]): js.Promise[PhoneNumberPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberPage, Any]): js.Promise[PhoneNumberPage] = js.native
    def page(opts: PhoneNumberListInstancePageOptions): js.Promise[PhoneNumberPage] = js.native
    def page(
      opts: PhoneNumberListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberPage, Any]
    ): js.Promise[PhoneNumberPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property phoneNumberSid - The SID of the Incoming Phone Number that you want to associate with the trunk
    */
  trait PhoneNumberListInstanceCreateOptions extends StObject {
    
    var phoneNumberSid: String
  }
  object PhoneNumberListInstanceCreateOptions {
    
    inline def apply(phoneNumberSid: String): PhoneNumberListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(phoneNumberSid = phoneNumberSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberListInstanceCreateOptions]
    }
    
    extension [Self <: PhoneNumberListInstanceCreateOptions](x: Self) {
      
      inline def setPhoneNumberSid(value: String): Self = StObject.set(x, "phoneNumberSid", value.asInstanceOf[js.Any])
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
  trait PhoneNumberListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ PhoneNumberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PhoneNumberListInstanceEachOptions {
    
    inline def apply(): PhoneNumberListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneNumberListInstanceEachOptions]
    }
    
    extension [Self <: PhoneNumberListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ PhoneNumberInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait PhoneNumberListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PhoneNumberListInstanceOptions {
    
    inline def apply(): PhoneNumberListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneNumberListInstanceOptions]
    }
    
    extension [Self <: PhoneNumberListInstanceOptions](x: Self) {
      
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
  trait PhoneNumberListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object PhoneNumberListInstancePageOptions {
    
    inline def apply(): PhoneNumberListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneNumberListInstancePageOptions]
    }
    
    extension [Self <: PhoneNumberListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait PhoneNumberPayload
    extends StObject
       with PhoneNumberResource
       with TwilioResponsePayload
  object PhoneNumberPayload {
    
    inline def apply(
      account_sid: String,
      address_requirements: PhoneNumberAddressRequirement,
      api_version: String,
      beta: Boolean,
      capabilities: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
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
      url: String,
      voice_application_sid: String,
      voice_caller_id_lookup: Boolean,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_url: String
    ): PhoneNumberPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_requirements = address_requirements.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_application_sid = sms_application_sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], trunk_sid = trunk_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_application_sid = voice_application_sid.asInstanceOf[js.Any], voice_caller_id_lookup = voice_caller_id_lookup.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberPayload]
    }
  }
  
  trait PhoneNumberResource extends StObject {
    
    var account_sid: String
    
    var address_requirements: PhoneNumberAddressRequirement
    
    var api_version: String
    
    var beta: Boolean
    
    var capabilities: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
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
    
    var url: String
    
    var voice_application_sid: String
    
    var voice_caller_id_lookup: Boolean
    
    var voice_fallback_method: String
    
    var voice_fallback_url: String
    
    var voice_method: String
    
    var voice_url: String
  }
  object PhoneNumberResource {
    
    inline def apply(
      account_sid: String,
      address_requirements: PhoneNumberAddressRequirement,
      api_version: String,
      beta: Boolean,
      capabilities: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
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
      url: String,
      voice_application_sid: String,
      voice_caller_id_lookup: Boolean,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_url: String
    ): PhoneNumberResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_requirements = address_requirements.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_application_sid = sms_application_sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], trunk_sid = trunk_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_application_sid = voice_application_sid.asInstanceOf[js.Any], voice_caller_id_lookup = voice_caller_id_lookup.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberResource]
    }
    
    extension [Self <: PhoneNumberResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAddress_requirements(value: PhoneNumberAddressRequirement): Self = StObject.set(x, "address_requirements", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setBeta(value: Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: js.Object): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
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
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVoice_application_sid(value: String): Self = StObject.set(x, "voice_application_sid", value.asInstanceOf[js.Any])
      
      inline def setVoice_caller_id_lookup(value: Boolean): Self = StObject.set(x, "voice_caller_id_lookup", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_method(value: String): Self = StObject.set(x, "voice_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_url(value: String): Self = StObject.set(x, "voice_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setVoice_method(value: String): Self = StObject.set(x, "voice_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_url(value: String): Self = StObject.set(x, "voice_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhoneNumberSolution extends StObject {
    
    var trunkSid: js.UndefOr[String] = js.undefined
  }
  object PhoneNumberSolution {
    
    inline def apply(): PhoneNumberSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneNumberSolution]
    }
    
    extension [Self <: PhoneNumberSolution](x: Self) {
      
      inline def setTrunkSid(value: String): Self = StObject.set(x, "trunkSid", value.asInstanceOf[js.Any])
      
      inline def setTrunkSidUndefined: Self = StObject.set(x, "trunkSid", js.undefined)
    }
  }
}
