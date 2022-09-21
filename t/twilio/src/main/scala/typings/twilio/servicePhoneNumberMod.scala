package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicePhoneNumberMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/service/phoneNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/service/phoneNumber", "PhoneNumberContext")
  @js.native
  open class PhoneNumberContext protected () extends StObject {
    /**
      * Initialize the PhoneNumberContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the resource from
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.messagingV1Mod.^, serviceSid: String, sid: String) = this()
    
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
  
  @JSImport("twilio/lib/rest/messaging/v1/service/phoneNumber", "PhoneNumberInstance")
  @js.native
  open class PhoneNumberInstance protected () extends SerializableClass {
    /**
      * Initialize the PhoneNumberContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      payload: PhoneNumberPayload,
      serviceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: PhoneNumberContext = js.native
    
    var accountSid: String = js.native
    
    var capabilities: js.Array[String] = js.native
    
    var countryCode: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PhoneNumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PhoneNumberInstance] = js.native
    
    var phoneNumber: String = js.native
    
    /**
      * remove a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the PhoneNumberList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    */
  inline def PhoneNumberList(version: typings.twilio.messagingV1Mod.^, serviceSid: String): PhoneNumberListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("PhoneNumberList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[PhoneNumberListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/service/phoneNumber", "PhoneNumberPage")
  @js.native
  open class PhoneNumberPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.messagingV1Mod.^, 
          PhoneNumberPayload, 
          PhoneNumberResource, 
          PhoneNumberInstance
        ] {
    /**
      * Initialize the PhoneNumberPage
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
      * @param sid - The SID that identifies the resource to fetch
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
    * @property phoneNumberSid - The SID of the Phone Number being added to the Service
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
      capabilities: js.Array[String],
      country_code: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): PhoneNumberPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberPayload]
    }
  }
  
  trait PhoneNumberResource extends StObject {
    
    var account_sid: String
    
    var capabilities: js.Array[String]
    
    var country_code: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var phone_number: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object PhoneNumberResource {
    
    inline def apply(
      account_sid: String,
      capabilities: js.Array[String],
      country_code: String,
      date_created: js.Date,
      date_updated: js.Date,
      phone_number: String,
      service_sid: String,
      sid: String,
      url: String
    ): PhoneNumberResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberResource]
    }
    
    extension [Self <: PhoneNumberResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value*))
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhoneNumberSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object PhoneNumberSolution {
    
    inline def apply(): PhoneNumberSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneNumberSolution]
    }
    
    extension [Self <: PhoneNumberSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
