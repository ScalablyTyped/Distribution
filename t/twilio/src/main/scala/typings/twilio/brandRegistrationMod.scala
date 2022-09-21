package typings.twilio

import typings.twilio.brandVettingMod.BrandVettingContext
import typings.twilio.brandVettingMod.BrandVettingListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brandRegistrationMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/brandRegistration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/brandRegistration", "BrandRegistrationContext")
  @js.native
  open class BrandRegistrationContext protected () extends StObject {
    /**
      * Initialize the BrandRegistrationContext
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
    def brandVettings(sid: String): BrandVettingContext = js.native
    @JSName("brandVettings")
    var brandVettings_Original: BrandVettingListInstance = js.native
    
    /**
      * fetch a BrandRegistrationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BrandRegistrationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandRegistrationInstance, Any]): js.Promise[BrandRegistrationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a BrandRegistrationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[BrandRegistrationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandRegistrationInstance, Any]): js.Promise[BrandRegistrationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/messaging/v1/brandRegistration", "BrandRegistrationInstance")
  @js.native
  open class BrandRegistrationInstance protected () extends SerializableClass {
    /**
      * Initialize the BrandRegistrationContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.messagingV1Mod.^, payload: BrandRegistrationPayload, sid: String) = this()
    
    /* private */ var _proxy: BrandRegistrationContext = js.native
    
    var a2PProfileBundleSid: String = js.native
    
    var accountSid: String = js.native
    
    var brandFeedback: js.Array[BrandRegistrationBrandFeedback] = js.native
    
    var brandScore: Double = js.native
    
    var brandType: String = js.native
    
    /**
      * Access the brandVettings
      */
    def brandVettings(): BrandVettingListInstance = js.native
    
    var customerProfileBundleSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var failureReason: String = js.native
    
    /**
      * fetch a BrandRegistrationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BrandRegistrationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BrandRegistrationInstance] = js.native
    
    var governmentEntity: Boolean = js.native
    
    var identityStatus: BrandRegistrationIdentityStatus = js.native
    
    var links: String = js.native
    
    var mock: Boolean = js.native
    
    var russell3000: Boolean = js.native
    
    var sid: String = js.native
    
    var skipAutomaticSecVet: Boolean = js.native
    
    var status: BrandRegistrationStatus = js.native
    
    var taxExemptStatus: String = js.native
    
    var tcrId: String = js.native
    
    /**
      * update a BrandRegistrationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[BrandRegistrationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BrandRegistrationInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the BrandRegistrationList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def BrandRegistrationList(version: typings.twilio.messagingV1Mod.^): BrandRegistrationListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("BrandRegistrationList")(version.asInstanceOf[js.Any]).asInstanceOf[BrandRegistrationListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/brandRegistration", "BrandRegistrationPage")
  @js.native
  open class BrandRegistrationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.messagingV1Mod.^, 
          BrandRegistrationPayload, 
          BrandRegistrationResource, 
          BrandRegistrationInstance
        ] {
    /**
      * Initialize the BrandRegistrationPage
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
      solution: BrandRegistrationSolution
    ) = this()
    
    /**
      * Build an instance of BrandRegistrationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BrandRegistrationPayload): BrandRegistrationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.TAX_ID
    - typings.twilio.twilioStrings.STOCK_SYMBOL
    - typings.twilio.twilioStrings.NONPROFIT
    - typings.twilio.twilioStrings.GOVERNMENT_ENTITY
    - typings.twilio.twilioStrings.OTHERS
  */
  trait BrandRegistrationBrandFeedback extends StObject
  object BrandRegistrationBrandFeedback {
    
    inline def GOVERNMENT_ENTITY: typings.twilio.twilioStrings.GOVERNMENT_ENTITY = "GOVERNMENT_ENTITY".asInstanceOf[typings.twilio.twilioStrings.GOVERNMENT_ENTITY]
    
    inline def NONPROFIT: typings.twilio.twilioStrings.NONPROFIT = "NONPROFIT".asInstanceOf[typings.twilio.twilioStrings.NONPROFIT]
    
    inline def OTHERS: typings.twilio.twilioStrings.OTHERS = "OTHERS".asInstanceOf[typings.twilio.twilioStrings.OTHERS]
    
    inline def STOCK_SYMBOL: typings.twilio.twilioStrings.STOCK_SYMBOL = "STOCK_SYMBOL".asInstanceOf[typings.twilio.twilioStrings.STOCK_SYMBOL]
    
    inline def TAX_ID: typings.twilio.twilioStrings.TAX_ID = "TAX_ID".asInstanceOf[typings.twilio.twilioStrings.TAX_ID]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.SELF_DECLARED
    - typings.twilio.twilioStrings.UNVERIFIED
    - typings.twilio.twilioStrings.VERIFIED
    - typings.twilio.twilioStrings.VETTED_VERIFIED
  */
  trait BrandRegistrationIdentityStatus extends StObject
  object BrandRegistrationIdentityStatus {
    
    inline def SELF_DECLARED: typings.twilio.twilioStrings.SELF_DECLARED = "SELF_DECLARED".asInstanceOf[typings.twilio.twilioStrings.SELF_DECLARED]
    
    inline def UNVERIFIED: typings.twilio.twilioStrings.UNVERIFIED = "UNVERIFIED".asInstanceOf[typings.twilio.twilioStrings.UNVERIFIED]
    
    inline def VERIFIED: typings.twilio.twilioStrings.VERIFIED = "VERIFIED".asInstanceOf[typings.twilio.twilioStrings.VERIFIED]
    
    inline def VETTED_VERIFIED: typings.twilio.twilioStrings.VETTED_VERIFIED = "VETTED_VERIFIED".asInstanceOf[typings.twilio.twilioStrings.VETTED_VERIFIED]
  }
  
  @js.native
  trait BrandRegistrationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): BrandRegistrationContext = js.native
    
    /**
      * create a BrandRegistrationInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: BrandRegistrationListInstanceCreateOptions): js.Promise[BrandRegistrationInstance] = js.native
    def create(
      opts: BrandRegistrationListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ BrandRegistrationInstance, Any]
    ): js.Promise[BrandRegistrationInstance] = js.native
    
    /**
      * Streams BrandRegistrationInstance records from the API.
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
          /* item */ BrandRegistrationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ BrandRegistrationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: BrandRegistrationListInstanceEachOptions): Unit = js.native
    def each(
      opts: BrandRegistrationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ BrandRegistrationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a brand_registration
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): BrandRegistrationContext = js.native
    
    /**
      * Retrieve a single target page of BrandRegistrationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[BrandRegistrationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandRegistrationPage, Any]): js.Promise[BrandRegistrationPage] = js.native
    def getPage(targetUrl: String): js.Promise[BrandRegistrationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandRegistrationPage, Any]
    ): js.Promise[BrandRegistrationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandRegistrationPage, Any]
    ): js.Promise[BrandRegistrationPage] = js.native
    
    /**
      * Lists BrandRegistrationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[BrandRegistrationInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BrandRegistrationInstance], Any]
    ): js.Promise[js.Array[BrandRegistrationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BrandRegistrationInstance], Any]
    ): js.Promise[js.Array[BrandRegistrationInstance]] = js.native
    def list(opts: BrandRegistrationListInstanceOptions): js.Promise[js.Array[BrandRegistrationInstance]] = js.native
    def list(
      opts: BrandRegistrationListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BrandRegistrationInstance], Any]
    ): js.Promise[js.Array[BrandRegistrationInstance]] = js.native
    
    /**
      * Retrieve a single page of BrandRegistrationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[BrandRegistrationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandRegistrationPage, Any]): js.Promise[BrandRegistrationPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandRegistrationPage, Any]
    ): js.Promise[BrandRegistrationPage] = js.native
    def page(opts: BrandRegistrationListInstancePageOptions): js.Promise[BrandRegistrationPage] = js.native
    def page(
      opts: BrandRegistrationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandRegistrationPage, Any]
    ): js.Promise[BrandRegistrationPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property a2PProfileBundleSid - A2P Messaging Profile Bundle Sid
    * @property brandType - Type of brand being created. One of: "STANDARD", "STARTER".
    * @property customerProfileBundleSid - Customer Profile Bundle Sid
    * @property mock - A boolean that specifies whether brand should be a mock or not. If true, brand will be registered as a mock brand. Defaults to false if no value is provided.
    * @property skipAutomaticSecVet - Skip Automatic Secondary Vetting
    */
  trait BrandRegistrationListInstanceCreateOptions extends StObject {
    
    var a2PProfileBundleSid: String
    
    var brandType: js.UndefOr[String] = js.undefined
    
    var customerProfileBundleSid: String
    
    var mock: js.UndefOr[Boolean] = js.undefined
    
    var skipAutomaticSecVet: js.UndefOr[Boolean] = js.undefined
  }
  object BrandRegistrationListInstanceCreateOptions {
    
    inline def apply(a2PProfileBundleSid: String, customerProfileBundleSid: String): BrandRegistrationListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(a2PProfileBundleSid = a2PProfileBundleSid.asInstanceOf[js.Any], customerProfileBundleSid = customerProfileBundleSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandRegistrationListInstanceCreateOptions]
    }
    
    extension [Self <: BrandRegistrationListInstanceCreateOptions](x: Self) {
      
      inline def setA2PProfileBundleSid(value: String): Self = StObject.set(x, "a2PProfileBundleSid", value.asInstanceOf[js.Any])
      
      inline def setBrandType(value: String): Self = StObject.set(x, "brandType", value.asInstanceOf[js.Any])
      
      inline def setBrandTypeUndefined: Self = StObject.set(x, "brandType", js.undefined)
      
      inline def setCustomerProfileBundleSid(value: String): Self = StObject.set(x, "customerProfileBundleSid", value.asInstanceOf[js.Any])
      
      inline def setMock(value: Boolean): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setMockUndefined: Self = StObject.set(x, "mock", js.undefined)
      
      inline def setSkipAutomaticSecVet(value: Boolean): Self = StObject.set(x, "skipAutomaticSecVet", value.asInstanceOf[js.Any])
      
      inline def setSkipAutomaticSecVetUndefined: Self = StObject.set(x, "skipAutomaticSecVet", js.undefined)
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
  trait BrandRegistrationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ BrandRegistrationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object BrandRegistrationListInstanceEachOptions {
    
    inline def apply(): BrandRegistrationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrandRegistrationListInstanceEachOptions]
    }
    
    extension [Self <: BrandRegistrationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ BrandRegistrationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait BrandRegistrationListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object BrandRegistrationListInstanceOptions {
    
    inline def apply(): BrandRegistrationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrandRegistrationListInstanceOptions]
    }
    
    extension [Self <: BrandRegistrationListInstanceOptions](x: Self) {
      
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
  trait BrandRegistrationListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object BrandRegistrationListInstancePageOptions {
    
    inline def apply(): BrandRegistrationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrandRegistrationListInstancePageOptions]
    }
    
    extension [Self <: BrandRegistrationListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait BrandRegistrationPayload
    extends StObject
       with BrandRegistrationResource
       with TwilioResponsePayload
  object BrandRegistrationPayload {
    
    inline def apply(
      a2p_profile_bundle_sid: String,
      account_sid: String,
      brand_feedback: js.Array[BrandRegistrationBrandFeedback],
      brand_score: Double,
      brand_type: String,
      customer_profile_bundle_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      failure_reason: String,
      first_page_uri: String,
      government_entity: Boolean,
      identity_status: BrandRegistrationIdentityStatus,
      links: String,
      mock: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      russell_3000: Boolean,
      sid: String,
      skip_automatic_sec_vet: Boolean,
      status: BrandRegistrationStatus,
      tax_exempt_status: String,
      tcr_id: String,
      uri: String,
      url: String
    ): BrandRegistrationPayload = {
      val __obj = js.Dynamic.literal(a2p_profile_bundle_sid = a2p_profile_bundle_sid.asInstanceOf[js.Any], account_sid = account_sid.asInstanceOf[js.Any], brand_feedback = brand_feedback.asInstanceOf[js.Any], brand_score = brand_score.asInstanceOf[js.Any], brand_type = brand_type.asInstanceOf[js.Any], customer_profile_bundle_sid = customer_profile_bundle_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], failure_reason = failure_reason.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], government_entity = government_entity.asInstanceOf[js.Any], identity_status = identity_status.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], mock = mock.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], russell_3000 = russell_3000.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], skip_automatic_sec_vet = skip_automatic_sec_vet.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tax_exempt_status = tax_exempt_status.asInstanceOf[js.Any], tcr_id = tcr_id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandRegistrationPayload]
    }
  }
  
  trait BrandRegistrationResource extends StObject {
    
    var a2p_profile_bundle_sid: String
    
    var account_sid: String
    
    var brand_feedback: js.Array[BrandRegistrationBrandFeedback]
    
    var brand_score: Double
    
    var brand_type: String
    
    var customer_profile_bundle_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var failure_reason: String
    
    var government_entity: Boolean
    
    var identity_status: BrandRegistrationIdentityStatus
    
    var links: String
    
    var mock: Boolean
    
    var russell_3000: Boolean
    
    var sid: String
    
    var skip_automatic_sec_vet: Boolean
    
    var status: BrandRegistrationStatus
    
    var tax_exempt_status: String
    
    var tcr_id: String
    
    var url: String
  }
  object BrandRegistrationResource {
    
    inline def apply(
      a2p_profile_bundle_sid: String,
      account_sid: String,
      brand_feedback: js.Array[BrandRegistrationBrandFeedback],
      brand_score: Double,
      brand_type: String,
      customer_profile_bundle_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      failure_reason: String,
      government_entity: Boolean,
      identity_status: BrandRegistrationIdentityStatus,
      links: String,
      mock: Boolean,
      russell_3000: Boolean,
      sid: String,
      skip_automatic_sec_vet: Boolean,
      status: BrandRegistrationStatus,
      tax_exempt_status: String,
      tcr_id: String,
      url: String
    ): BrandRegistrationResource = {
      val __obj = js.Dynamic.literal(a2p_profile_bundle_sid = a2p_profile_bundle_sid.asInstanceOf[js.Any], account_sid = account_sid.asInstanceOf[js.Any], brand_feedback = brand_feedback.asInstanceOf[js.Any], brand_score = brand_score.asInstanceOf[js.Any], brand_type = brand_type.asInstanceOf[js.Any], customer_profile_bundle_sid = customer_profile_bundle_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], failure_reason = failure_reason.asInstanceOf[js.Any], government_entity = government_entity.asInstanceOf[js.Any], identity_status = identity_status.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], mock = mock.asInstanceOf[js.Any], russell_3000 = russell_3000.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], skip_automatic_sec_vet = skip_automatic_sec_vet.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tax_exempt_status = tax_exempt_status.asInstanceOf[js.Any], tcr_id = tcr_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandRegistrationResource]
    }
    
    extension [Self <: BrandRegistrationResource](x: Self) {
      
      inline def setA2p_profile_bundle_sid(value: String): Self = StObject.set(x, "a2p_profile_bundle_sid", value.asInstanceOf[js.Any])
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBrand_feedback(value: js.Array[BrandRegistrationBrandFeedback]): Self = StObject.set(x, "brand_feedback", value.asInstanceOf[js.Any])
      
      inline def setBrand_feedbackVarargs(value: BrandRegistrationBrandFeedback*): Self = StObject.set(x, "brand_feedback", js.Array(value*))
      
      inline def setBrand_score(value: Double): Self = StObject.set(x, "brand_score", value.asInstanceOf[js.Any])
      
      inline def setBrand_type(value: String): Self = StObject.set(x, "brand_type", value.asInstanceOf[js.Any])
      
      inline def setCustomer_profile_bundle_sid(value: String): Self = StObject.set(x, "customer_profile_bundle_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFailure_reason(value: String): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
      
      inline def setGovernment_entity(value: Boolean): Self = StObject.set(x, "government_entity", value.asInstanceOf[js.Any])
      
      inline def setIdentity_status(value: BrandRegistrationIdentityStatus): Self = StObject.set(x, "identity_status", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMock(value: Boolean): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setRussell_3000(value: Boolean): Self = StObject.set(x, "russell_3000", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSkip_automatic_sec_vet(value: Boolean): Self = StObject.set(x, "skip_automatic_sec_vet", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: BrandRegistrationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTax_exempt_status(value: String): Self = StObject.set(x, "tax_exempt_status", value.asInstanceOf[js.Any])
      
      inline def setTcr_id(value: String): Self = StObject.set(x, "tcr_id", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrandRegistrationSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.PENDING
    - typings.twilio.twilioStrings.APPROVED
    - typings.twilio.twilioStrings.FAILED
    - typings.twilio.twilioStrings.IN_REVIEW
    - typings.twilio.twilioStrings.DELETED
  */
  trait BrandRegistrationStatus extends StObject
  object BrandRegistrationStatus {
    
    inline def APPROVED: typings.twilio.twilioStrings.APPROVED = "APPROVED".asInstanceOf[typings.twilio.twilioStrings.APPROVED]
    
    inline def DELETED: typings.twilio.twilioStrings.DELETED = "DELETED".asInstanceOf[typings.twilio.twilioStrings.DELETED]
    
    inline def FAILED: typings.twilio.twilioStrings.FAILED = "FAILED".asInstanceOf[typings.twilio.twilioStrings.FAILED]
    
    inline def IN_REVIEW: typings.twilio.twilioStrings.IN_REVIEW = "IN_REVIEW".asInstanceOf[typings.twilio.twilioStrings.IN_REVIEW]
    
    inline def PENDING: typings.twilio.twilioStrings.PENDING = "PENDING".asInstanceOf[typings.twilio.twilioStrings.PENDING]
  }
}
