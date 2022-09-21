package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usAppToPersonMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/service/usAppToPerson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/service/usAppToPerson", "UsAppToPersonContext")
  @js.native
  open class UsAppToPersonContext protected () extends StObject {
    /**
      * Initialize the UsAppToPersonContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param messagingServiceSid - The SID of the Messaging Service to fetch the resource from
      * @param sid - The SID that identifies the US A2P Compliance resource to fetch
      */
    def this(version: typings.twilio.messagingV1Mod.^, messagingServiceSid: String, sid: String) = this()
    
    /**
      * fetch a UsAppToPersonInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UsAppToPersonInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ UsAppToPersonInstance, Any]): js.Promise[UsAppToPersonInstance] = js.native
    
    /**
      * remove a UsAppToPersonInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ UsAppToPersonInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/messaging/v1/service/usAppToPerson", "UsAppToPersonInstance")
  @js.native
  open class UsAppToPersonInstance protected () extends SerializableClass {
    /**
      * Initialize the UsAppToPersonContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param messagingServiceSid - The SID of the Messaging Service the resource is associated with
      * @param sid - The SID that identifies the US A2P Compliance resource to fetch
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      payload: UsAppToPersonPayload,
      messagingServiceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: UsAppToPersonContext = js.native
    
    var accountSid: String = js.native
    
    var brandRegistrationSid: String = js.native
    
    var campaignId: String = js.native
    
    var campaignStatus: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var description: String = js.native
    
    /**
      * fetch a UsAppToPersonInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UsAppToPersonInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UsAppToPersonInstance] = js.native
    
    var hasEmbeddedLinks: Boolean = js.native
    
    var hasEmbeddedPhone: Boolean = js.native
    
    var isExternallyRegistered: Boolean = js.native
    
    var messageSamples: js.Array[String] = js.native
    
    var messagingServiceSid: String = js.native
    
    var mock: Boolean = js.native
    
    var rateLimits: Any = js.native
    
    /**
      * remove a UsAppToPersonInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
    
    var usAppToPersonUsecase: String = js.native
  }
  
  /**
    * Initialize the UsAppToPersonList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param messagingServiceSid - The SID of the Messaging Service the resource is associated with
    */
  inline def UsAppToPersonList(version: typings.twilio.messagingV1Mod.^, messagingServiceSid: String): UsAppToPersonListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("UsAppToPersonList")(version.asInstanceOf[js.Any], messagingServiceSid.asInstanceOf[js.Any])).asInstanceOf[UsAppToPersonListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/service/usAppToPerson", "UsAppToPersonPage")
  @js.native
  open class UsAppToPersonPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.messagingV1Mod.^, 
          UsAppToPersonPayload, 
          UsAppToPersonResource, 
          UsAppToPersonInstance
        ] {
    /**
      * Initialize the UsAppToPersonPage
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
      solution: UsAppToPersonSolution
    ) = this()
    
    /**
      * Build an instance of UsAppToPersonInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: UsAppToPersonPayload): UsAppToPersonInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait UsAppToPersonListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): UsAppToPersonContext = js.native
    
    /**
      * create a UsAppToPersonInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: UsAppToPersonListInstanceCreateOptions): js.Promise[UsAppToPersonInstance] = js.native
    def create(
      opts: UsAppToPersonListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ UsAppToPersonInstance, Any]
    ): js.Promise[UsAppToPersonInstance] = js.native
    
    /**
      * Streams UsAppToPersonInstance records from the API.
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
          /* item */ UsAppToPersonInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ UsAppToPersonInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: UsAppToPersonListInstanceEachOptions): Unit = js.native
    def each(
      opts: UsAppToPersonListInstanceEachOptions,
      callback: js.Function2[
          /* item */ UsAppToPersonInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a us_app_to_person
      *
      * @param sid - The SID that identifies the US A2P Compliance resource to fetch
      */
    def get(sid: String): UsAppToPersonContext = js.native
    
    /**
      * Retrieve a single target page of UsAppToPersonInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[UsAppToPersonPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ UsAppToPersonPage, Any]): js.Promise[UsAppToPersonPage] = js.native
    def getPage(targetUrl: String): js.Promise[UsAppToPersonPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UsAppToPersonPage, Any]
    ): js.Promise[UsAppToPersonPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UsAppToPersonPage, Any]
    ): js.Promise[UsAppToPersonPage] = js.native
    
    /**
      * Lists UsAppToPersonInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[UsAppToPersonInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UsAppToPersonInstance], Any]
    ): js.Promise[js.Array[UsAppToPersonInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UsAppToPersonInstance], Any]
    ): js.Promise[js.Array[UsAppToPersonInstance]] = js.native
    def list(opts: UsAppToPersonListInstanceOptions): js.Promise[js.Array[UsAppToPersonInstance]] = js.native
    def list(
      opts: UsAppToPersonListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UsAppToPersonInstance], Any]
    ): js.Promise[js.Array[UsAppToPersonInstance]] = js.native
    
    /**
      * Retrieve a single page of UsAppToPersonInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[UsAppToPersonPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ UsAppToPersonPage, Any]): js.Promise[UsAppToPersonPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UsAppToPersonPage, Any]
    ): js.Promise[UsAppToPersonPage] = js.native
    def page(opts: UsAppToPersonListInstancePageOptions): js.Promise[UsAppToPersonPage] = js.native
    def page(
      opts: UsAppToPersonListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UsAppToPersonPage, Any]
    ): js.Promise[UsAppToPersonPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property brandRegistrationSid - A2P Brand Registration SID
    * @property description - A short description of what this SMS campaign does
    * @property hasEmbeddedLinks - Indicates that this SMS campaign will send messages that contain links
    * @property hasEmbeddedPhone - Indicates that this SMS campaign will send messages that contain phone numbers
    * @property messageSamples - Message samples
    * @property usAppToPersonUsecase - A2P Campaign Use Case.
    */
  trait UsAppToPersonListInstanceCreateOptions extends StObject {
    
    var brandRegistrationSid: String
    
    var description: String
    
    var hasEmbeddedLinks: Boolean
    
    var hasEmbeddedPhone: Boolean
    
    var messageSamples: String | js.Array[String]
    
    var usAppToPersonUsecase: String
  }
  object UsAppToPersonListInstanceCreateOptions {
    
    inline def apply(
      brandRegistrationSid: String,
      description: String,
      hasEmbeddedLinks: Boolean,
      hasEmbeddedPhone: Boolean,
      messageSamples: String | js.Array[String],
      usAppToPersonUsecase: String
    ): UsAppToPersonListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(brandRegistrationSid = brandRegistrationSid.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasEmbeddedLinks = hasEmbeddedLinks.asInstanceOf[js.Any], hasEmbeddedPhone = hasEmbeddedPhone.asInstanceOf[js.Any], messageSamples = messageSamples.asInstanceOf[js.Any], usAppToPersonUsecase = usAppToPersonUsecase.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsAppToPersonListInstanceCreateOptions]
    }
    
    extension [Self <: UsAppToPersonListInstanceCreateOptions](x: Self) {
      
      inline def setBrandRegistrationSid(value: String): Self = StObject.set(x, "brandRegistrationSid", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHasEmbeddedLinks(value: Boolean): Self = StObject.set(x, "hasEmbeddedLinks", value.asInstanceOf[js.Any])
      
      inline def setHasEmbeddedPhone(value: Boolean): Self = StObject.set(x, "hasEmbeddedPhone", value.asInstanceOf[js.Any])
      
      inline def setMessageSamples(value: String | js.Array[String]): Self = StObject.set(x, "messageSamples", value.asInstanceOf[js.Any])
      
      inline def setMessageSamplesVarargs(value: String*): Self = StObject.set(x, "messageSamples", js.Array(value*))
      
      inline def setUsAppToPersonUsecase(value: String): Self = StObject.set(x, "usAppToPersonUsecase", value.asInstanceOf[js.Any])
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
  trait UsAppToPersonListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ UsAppToPersonInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object UsAppToPersonListInstanceEachOptions {
    
    inline def apply(): UsAppToPersonListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsAppToPersonListInstanceEachOptions]
    }
    
    extension [Self <: UsAppToPersonListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ UsAppToPersonInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait UsAppToPersonListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object UsAppToPersonListInstanceOptions {
    
    inline def apply(): UsAppToPersonListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsAppToPersonListInstanceOptions]
    }
    
    extension [Self <: UsAppToPersonListInstanceOptions](x: Self) {
      
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
  trait UsAppToPersonListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object UsAppToPersonListInstancePageOptions {
    
    inline def apply(): UsAppToPersonListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsAppToPersonListInstancePageOptions]
    }
    
    extension [Self <: UsAppToPersonListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait UsAppToPersonPayload
    extends StObject
       with UsAppToPersonResource
       with TwilioResponsePayload
  object UsAppToPersonPayload {
    
    inline def apply(
      account_sid: String,
      brand_registration_sid: String,
      campaign_id: String,
      campaign_status: String,
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      first_page_uri: String,
      has_embedded_links: Boolean,
      has_embedded_phone: Boolean,
      is_externally_registered: Boolean,
      message_samples: js.Array[String],
      messaging_service_sid: String,
      mock: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      rate_limits: js.Object,
      sid: String,
      uri: String,
      url: String,
      us_app_to_person_usecase: String
    ): UsAppToPersonPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], brand_registration_sid = brand_registration_sid.asInstanceOf[js.Any], campaign_id = campaign_id.asInstanceOf[js.Any], campaign_status = campaign_status.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], has_embedded_links = has_embedded_links.asInstanceOf[js.Any], has_embedded_phone = has_embedded_phone.asInstanceOf[js.Any], is_externally_registered = is_externally_registered.asInstanceOf[js.Any], message_samples = message_samples.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], mock = mock.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], rate_limits = rate_limits.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], us_app_to_person_usecase = us_app_to_person_usecase.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsAppToPersonPayload]
    }
  }
  
  trait UsAppToPersonResource extends StObject {
    
    var account_sid: String
    
    var brand_registration_sid: String
    
    var campaign_id: String
    
    var campaign_status: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var description: String
    
    var has_embedded_links: Boolean
    
    var has_embedded_phone: Boolean
    
    var is_externally_registered: Boolean
    
    var message_samples: js.Array[String]
    
    var messaging_service_sid: String
    
    var mock: Boolean
    
    var rate_limits: js.Object
    
    var sid: String
    
    var url: String
    
    var us_app_to_person_usecase: String
  }
  object UsAppToPersonResource {
    
    inline def apply(
      account_sid: String,
      brand_registration_sid: String,
      campaign_id: String,
      campaign_status: String,
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      has_embedded_links: Boolean,
      has_embedded_phone: Boolean,
      is_externally_registered: Boolean,
      message_samples: js.Array[String],
      messaging_service_sid: String,
      mock: Boolean,
      rate_limits: js.Object,
      sid: String,
      url: String,
      us_app_to_person_usecase: String
    ): UsAppToPersonResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], brand_registration_sid = brand_registration_sid.asInstanceOf[js.Any], campaign_id = campaign_id.asInstanceOf[js.Any], campaign_status = campaign_status.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has_embedded_links = has_embedded_links.asInstanceOf[js.Any], has_embedded_phone = has_embedded_phone.asInstanceOf[js.Any], is_externally_registered = is_externally_registered.asInstanceOf[js.Any], message_samples = message_samples.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], mock = mock.asInstanceOf[js.Any], rate_limits = rate_limits.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], us_app_to_person_usecase = us_app_to_person_usecase.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsAppToPersonResource]
    }
    
    extension [Self <: UsAppToPersonResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBrand_registration_sid(value: String): Self = StObject.set(x, "brand_registration_sid", value.asInstanceOf[js.Any])
      
      inline def setCampaign_id(value: String): Self = StObject.set(x, "campaign_id", value.asInstanceOf[js.Any])
      
      inline def setCampaign_status(value: String): Self = StObject.set(x, "campaign_status", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHas_embedded_links(value: Boolean): Self = StObject.set(x, "has_embedded_links", value.asInstanceOf[js.Any])
      
      inline def setHas_embedded_phone(value: Boolean): Self = StObject.set(x, "has_embedded_phone", value.asInstanceOf[js.Any])
      
      inline def setIs_externally_registered(value: Boolean): Self = StObject.set(x, "is_externally_registered", value.asInstanceOf[js.Any])
      
      inline def setMessage_samples(value: js.Array[String]): Self = StObject.set(x, "message_samples", value.asInstanceOf[js.Any])
      
      inline def setMessage_samplesVarargs(value: String*): Self = StObject.set(x, "message_samples", js.Array(value*))
      
      inline def setMessaging_service_sid(value: String): Self = StObject.set(x, "messaging_service_sid", value.asInstanceOf[js.Any])
      
      inline def setMock(value: Boolean): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setRate_limits(value: js.Object): Self = StObject.set(x, "rate_limits", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUs_app_to_person_usecase(value: String): Self = StObject.set(x, "us_app_to_person_usecase", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsAppToPersonSolution extends StObject {
    
    var messagingServiceSid: js.UndefOr[String] = js.undefined
  }
  object UsAppToPersonSolution {
    
    inline def apply(): UsAppToPersonSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsAppToPersonSolution]
    }
    
    extension [Self <: UsAppToPersonSolution](x: Self) {
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
      
      inline def setMessagingServiceSidUndefined: Self = StObject.set(x, "messagingServiceSid", js.undefined)
    }
  }
}
