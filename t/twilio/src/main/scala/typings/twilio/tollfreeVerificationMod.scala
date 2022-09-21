package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tollfreeVerificationMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/tollfreeVerification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/tollfreeVerification", "TollfreeVerificationContext")
  @js.native
  open class TollfreeVerificationContext protected () extends StObject {
    /**
      * Initialize the TollfreeVerificationContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - Tollfree Verification Sid
      */
    def this(version: typings.twilio.messagingV1Mod.^, sid: String) = this()
    
    /**
      * fetch a TollfreeVerificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TollfreeVerificationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TollfreeVerificationInstance, Any]): js.Promise[TollfreeVerificationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/messaging/v1/tollfreeVerification", "TollfreeVerificationInstance")
  @js.native
  open class TollfreeVerificationInstance protected () extends SerializableClass {
    /**
      * Initialize the TollfreeVerificationContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - Tollfree Verification Sid
      */
    def this(version: typings.twilio.messagingV1Mod.^, payload: TollfreeVerificationPayload, sid: String) = this()
    
    /* private */ var _proxy: TollfreeVerificationContext = js.native
    
    var accountSid: String = js.native
    
    var additionalInformation: String = js.native
    
    var businessCity: String = js.native
    
    var businessContactEmail: String = js.native
    
    var businessContactFirstName: String = js.native
    
    var businessContactLastName: String = js.native
    
    var businessContactPhone: String = js.native
    
    var businessCountry: String = js.native
    
    var businessName: String = js.native
    
    var businessPostalCode: String = js.native
    
    var businessStateProvinceRegion: String = js.native
    
    var businessStreetAddress: String = js.native
    
    var businessStreetAddress2: String = js.native
    
    var businessWebsite: String = js.native
    
    var customerProfileSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a TollfreeVerificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TollfreeVerificationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TollfreeVerificationInstance] = js.native
    
    var messageVolume: String = js.native
    
    var notificationEmail: String = js.native
    
    var optInImageUrls: js.Array[String] = js.native
    
    var optInType: TollfreeVerificationOptInType = js.native
    
    var productionMessageSample: String = js.native
    
    var regulatedItemSid: String = js.native
    
    var resourceLinks: Any = js.native
    
    var sid: String = js.native
    
    var status: TollfreeVerificationStatus = js.native
    
    var tollfreePhoneNumberSid: String = js.native
    
    var trustProductSid: String = js.native
    
    var url: String = js.native
    
    var useCaseCategories: js.Array[String] = js.native
    
    var useCaseSummary: String = js.native
  }
  
  /**
    * Initialize the TollfreeVerificationList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def TollfreeVerificationList(version: typings.twilio.messagingV1Mod.^): TollfreeVerificationListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("TollfreeVerificationList")(version.asInstanceOf[js.Any]).asInstanceOf[TollfreeVerificationListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/tollfreeVerification", "TollfreeVerificationPage")
  @js.native
  open class TollfreeVerificationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.messagingV1Mod.^, 
          TollfreeVerificationPayload, 
          TollfreeVerificationResource, 
          TollfreeVerificationInstance
        ] {
    /**
      * Initialize the TollfreeVerificationPage
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
      solution: TollfreeVerificationSolution
    ) = this()
    
    /**
      * Build an instance of TollfreeVerificationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TollfreeVerificationPayload): TollfreeVerificationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait TollfreeVerificationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TollfreeVerificationContext = js.native
    
    /**
      * create a TollfreeVerificationInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: TollfreeVerificationListInstanceCreateOptions): js.Promise[TollfreeVerificationInstance] = js.native
    def create(
      opts: TollfreeVerificationListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TollfreeVerificationInstance, Any]
    ): js.Promise[TollfreeVerificationInstance] = js.native
    
    /**
      * Streams TollfreeVerificationInstance records from the API.
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
          /* item */ TollfreeVerificationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TollfreeVerificationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TollfreeVerificationListInstanceEachOptions): Unit = js.native
    def each(
      opts: TollfreeVerificationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TollfreeVerificationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a tollfree_verification
      *
      * @param sid - Tollfree Verification Sid
      */
    def get(sid: String): TollfreeVerificationContext = js.native
    
    /**
      * Retrieve a single target page of TollfreeVerificationInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TollfreeVerificationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TollfreeVerificationPage, Any]): js.Promise[TollfreeVerificationPage] = js.native
    def getPage(targetUrl: String): js.Promise[TollfreeVerificationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TollfreeVerificationPage, Any]
    ): js.Promise[TollfreeVerificationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TollfreeVerificationPage, Any]
    ): js.Promise[TollfreeVerificationPage] = js.native
    
    /**
      * Lists TollfreeVerificationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TollfreeVerificationInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TollfreeVerificationInstance], Any]
    ): js.Promise[js.Array[TollfreeVerificationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TollfreeVerificationInstance], Any]
    ): js.Promise[js.Array[TollfreeVerificationInstance]] = js.native
    def list(opts: TollfreeVerificationListInstanceOptions): js.Promise[js.Array[TollfreeVerificationInstance]] = js.native
    def list(
      opts: TollfreeVerificationListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TollfreeVerificationInstance], Any]
    ): js.Promise[js.Array[TollfreeVerificationInstance]] = js.native
    
    /**
      * Retrieve a single page of TollfreeVerificationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TollfreeVerificationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TollfreeVerificationPage, Any]): js.Promise[TollfreeVerificationPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TollfreeVerificationPage, Any]
    ): js.Promise[TollfreeVerificationPage] = js.native
    def page(opts: TollfreeVerificationListInstancePageOptions): js.Promise[TollfreeVerificationPage] = js.native
    def page(
      opts: TollfreeVerificationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TollfreeVerificationPage, Any]
    ): js.Promise[TollfreeVerificationPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property additionalInformation - Additional information to be provided for verification
    * @property businessCity - The city of the business or organization using the Tollfree number
    * @property businessContactEmail - The email address of the contact for the business or organization using the Tollfree number
    * @property businessContactFirstName - The first name of the contact for the business or organization using the Tollfree number
    * @property businessContactLastName - The last name of the contact for the business or organization using the Tollfree number
    * @property businessContactPhone - The phone number of the contact for the business or organization using the Tollfree number
    * @property businessCountry - The country of the business or organization using the Tollfree number
    * @property businessName - The name of the business or organization using the Tollfree number
    * @property businessPostalCode - The postal code of the business or organization using the Tollfree number
    * @property businessStateProvinceRegion - The state/province/region of the business or organization using the Tollfree number
    * @property businessStreetAddress - The address of the business or organization using the Tollfree number
    * @property businessStreetAddress2 - The address of the business or organization using the Tollfree number
    * @property businessWebsite - The website of the business or organization using the Tollfree number
    * @property customerProfileSid - Customer's Profile Bundle BundleSid
    * @property messageVolume - Estimate monthly volume of messages from the Tollfree Number
    * @property notificationEmail - The email address to receive the notification about the verification result.
    * @property optInImageUrls - Link to an image that shows the opt-in workflow. Multiple images allowed and must be a publicly hosted URL
    * @property optInType - Describe how a user opts-in to text messages
    * @property productionMessageSample - An example of message content, i.e. a sample message
    * @property tollfreePhoneNumberSid - The SID of the Phone Number associated with the Tollfree Verification
    * @property useCaseCategories - The category of the use case for the Tollfree Number. List as many are applicable.
    * @property useCaseSummary - Further explaination on how messaging is used by the business or organization
    */
  trait TollfreeVerificationListInstanceCreateOptions extends StObject {
    
    var additionalInformation: js.UndefOr[String] = js.undefined
    
    var businessCity: js.UndefOr[String] = js.undefined
    
    var businessContactEmail: js.UndefOr[String] = js.undefined
    
    var businessContactFirstName: js.UndefOr[String] = js.undefined
    
    var businessContactLastName: js.UndefOr[String] = js.undefined
    
    var businessContactPhone: js.UndefOr[String] = js.undefined
    
    var businessCountry: js.UndefOr[String] = js.undefined
    
    var businessName: String
    
    var businessPostalCode: js.UndefOr[String] = js.undefined
    
    var businessStateProvinceRegion: js.UndefOr[String] = js.undefined
    
    var businessStreetAddress: js.UndefOr[String] = js.undefined
    
    var businessStreetAddress2: js.UndefOr[String] = js.undefined
    
    var businessWebsite: String
    
    var customerProfileSid: js.UndefOr[String] = js.undefined
    
    var messageVolume: String
    
    var notificationEmail: String
    
    var optInImageUrls: String | js.Array[String]
    
    var optInType: TollfreeVerificationOptInType
    
    var productionMessageSample: String
    
    var tollfreePhoneNumberSid: String
    
    var useCaseCategories: String | js.Array[String]
    
    var useCaseSummary: String
  }
  object TollfreeVerificationListInstanceCreateOptions {
    
    inline def apply(
      businessName: String,
      businessWebsite: String,
      messageVolume: String,
      notificationEmail: String,
      optInImageUrls: String | js.Array[String],
      optInType: TollfreeVerificationOptInType,
      productionMessageSample: String,
      tollfreePhoneNumberSid: String,
      useCaseCategories: String | js.Array[String],
      useCaseSummary: String
    ): TollfreeVerificationListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(businessName = businessName.asInstanceOf[js.Any], businessWebsite = businessWebsite.asInstanceOf[js.Any], messageVolume = messageVolume.asInstanceOf[js.Any], notificationEmail = notificationEmail.asInstanceOf[js.Any], optInImageUrls = optInImageUrls.asInstanceOf[js.Any], optInType = optInType.asInstanceOf[js.Any], productionMessageSample = productionMessageSample.asInstanceOf[js.Any], tollfreePhoneNumberSid = tollfreePhoneNumberSid.asInstanceOf[js.Any], useCaseCategories = useCaseCategories.asInstanceOf[js.Any], useCaseSummary = useCaseSummary.asInstanceOf[js.Any])
      __obj.asInstanceOf[TollfreeVerificationListInstanceCreateOptions]
    }
    
    extension [Self <: TollfreeVerificationListInstanceCreateOptions](x: Self) {
      
      inline def setAdditionalInformation(value: String): Self = StObject.set(x, "additionalInformation", value.asInstanceOf[js.Any])
      
      inline def setAdditionalInformationUndefined: Self = StObject.set(x, "additionalInformation", js.undefined)
      
      inline def setBusinessCity(value: String): Self = StObject.set(x, "businessCity", value.asInstanceOf[js.Any])
      
      inline def setBusinessCityUndefined: Self = StObject.set(x, "businessCity", js.undefined)
      
      inline def setBusinessContactEmail(value: String): Self = StObject.set(x, "businessContactEmail", value.asInstanceOf[js.Any])
      
      inline def setBusinessContactEmailUndefined: Self = StObject.set(x, "businessContactEmail", js.undefined)
      
      inline def setBusinessContactFirstName(value: String): Self = StObject.set(x, "businessContactFirstName", value.asInstanceOf[js.Any])
      
      inline def setBusinessContactFirstNameUndefined: Self = StObject.set(x, "businessContactFirstName", js.undefined)
      
      inline def setBusinessContactLastName(value: String): Self = StObject.set(x, "businessContactLastName", value.asInstanceOf[js.Any])
      
      inline def setBusinessContactLastNameUndefined: Self = StObject.set(x, "businessContactLastName", js.undefined)
      
      inline def setBusinessContactPhone(value: String): Self = StObject.set(x, "businessContactPhone", value.asInstanceOf[js.Any])
      
      inline def setBusinessContactPhoneUndefined: Self = StObject.set(x, "businessContactPhone", js.undefined)
      
      inline def setBusinessCountry(value: String): Self = StObject.set(x, "businessCountry", value.asInstanceOf[js.Any])
      
      inline def setBusinessCountryUndefined: Self = StObject.set(x, "businessCountry", js.undefined)
      
      inline def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
      
      inline def setBusinessPostalCode(value: String): Self = StObject.set(x, "businessPostalCode", value.asInstanceOf[js.Any])
      
      inline def setBusinessPostalCodeUndefined: Self = StObject.set(x, "businessPostalCode", js.undefined)
      
      inline def setBusinessStateProvinceRegion(value: String): Self = StObject.set(x, "businessStateProvinceRegion", value.asInstanceOf[js.Any])
      
      inline def setBusinessStateProvinceRegionUndefined: Self = StObject.set(x, "businessStateProvinceRegion", js.undefined)
      
      inline def setBusinessStreetAddress(value: String): Self = StObject.set(x, "businessStreetAddress", value.asInstanceOf[js.Any])
      
      inline def setBusinessStreetAddress2(value: String): Self = StObject.set(x, "businessStreetAddress2", value.asInstanceOf[js.Any])
      
      inline def setBusinessStreetAddress2Undefined: Self = StObject.set(x, "businessStreetAddress2", js.undefined)
      
      inline def setBusinessStreetAddressUndefined: Self = StObject.set(x, "businessStreetAddress", js.undefined)
      
      inline def setBusinessWebsite(value: String): Self = StObject.set(x, "businessWebsite", value.asInstanceOf[js.Any])
      
      inline def setCustomerProfileSid(value: String): Self = StObject.set(x, "customerProfileSid", value.asInstanceOf[js.Any])
      
      inline def setCustomerProfileSidUndefined: Self = StObject.set(x, "customerProfileSid", js.undefined)
      
      inline def setMessageVolume(value: String): Self = StObject.set(x, "messageVolume", value.asInstanceOf[js.Any])
      
      inline def setNotificationEmail(value: String): Self = StObject.set(x, "notificationEmail", value.asInstanceOf[js.Any])
      
      inline def setOptInImageUrls(value: String | js.Array[String]): Self = StObject.set(x, "optInImageUrls", value.asInstanceOf[js.Any])
      
      inline def setOptInImageUrlsVarargs(value: String*): Self = StObject.set(x, "optInImageUrls", js.Array(value*))
      
      inline def setOptInType(value: TollfreeVerificationOptInType): Self = StObject.set(x, "optInType", value.asInstanceOf[js.Any])
      
      inline def setProductionMessageSample(value: String): Self = StObject.set(x, "productionMessageSample", value.asInstanceOf[js.Any])
      
      inline def setTollfreePhoneNumberSid(value: String): Self = StObject.set(x, "tollfreePhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setUseCaseCategories(value: String | js.Array[String]): Self = StObject.set(x, "useCaseCategories", value.asInstanceOf[js.Any])
      
      inline def setUseCaseCategoriesVarargs(value: String*): Self = StObject.set(x, "useCaseCategories", js.Array(value*))
      
      inline def setUseCaseSummary(value: String): Self = StObject.set(x, "useCaseSummary", value.asInstanceOf[js.Any])
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
    * @property status - The compliance status of the Tollfree Verification record.
    * @property tollfreePhoneNumberSid - The SID of the Phone Number associated with the Tollfree Verification
    */
  trait TollfreeVerificationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TollfreeVerificationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[TollfreeVerificationStatus] = js.undefined
    
    var tollfreePhoneNumberSid: js.UndefOr[String] = js.undefined
  }
  object TollfreeVerificationListInstanceEachOptions {
    
    inline def apply(): TollfreeVerificationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TollfreeVerificationListInstanceEachOptions]
    }
    
    extension [Self <: TollfreeVerificationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TollfreeVerificationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: TollfreeVerificationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTollfreePhoneNumberSid(value: String): Self = StObject.set(x, "tollfreePhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setTollfreePhoneNumberSidUndefined: Self = StObject.set(x, "tollfreePhoneNumberSid", js.undefined)
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
    * @property status - The compliance status of the Tollfree Verification record.
    * @property tollfreePhoneNumberSid - The SID of the Phone Number associated with the Tollfree Verification
    */
  trait TollfreeVerificationListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[TollfreeVerificationStatus] = js.undefined
    
    var tollfreePhoneNumberSid: js.UndefOr[String] = js.undefined
  }
  object TollfreeVerificationListInstanceOptions {
    
    inline def apply(): TollfreeVerificationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TollfreeVerificationListInstanceOptions]
    }
    
    extension [Self <: TollfreeVerificationListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: TollfreeVerificationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTollfreePhoneNumberSid(value: String): Self = StObject.set(x, "tollfreePhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setTollfreePhoneNumberSidUndefined: Self = StObject.set(x, "tollfreePhoneNumberSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - The compliance status of the Tollfree Verification record.
    * @property tollfreePhoneNumberSid - The SID of the Phone Number associated with the Tollfree Verification
    */
  trait TollfreeVerificationListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[TollfreeVerificationStatus] = js.undefined
    
    var tollfreePhoneNumberSid: js.UndefOr[String] = js.undefined
  }
  object TollfreeVerificationListInstancePageOptions {
    
    inline def apply(): TollfreeVerificationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TollfreeVerificationListInstancePageOptions]
    }
    
    extension [Self <: TollfreeVerificationListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: TollfreeVerificationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTollfreePhoneNumberSid(value: String): Self = StObject.set(x, "tollfreePhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setTollfreePhoneNumberSidUndefined: Self = StObject.set(x, "tollfreePhoneNumberSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.VERBAL
    - typings.twilio.twilioStrings.WEB_FORM
    - typings.twilio.twilioStrings.PAPER_FORM
    - typings.twilio.twilioStrings.VIA_TEXT
    - typings.twilio.twilioStrings.MOBILE_QR_CODE
  */
  trait TollfreeVerificationOptInType extends StObject
  object TollfreeVerificationOptInType {
    
    inline def MOBILE_QR_CODE: typings.twilio.twilioStrings.MOBILE_QR_CODE = "MOBILE_QR_CODE".asInstanceOf[typings.twilio.twilioStrings.MOBILE_QR_CODE]
    
    inline def PAPER_FORM: typings.twilio.twilioStrings.PAPER_FORM = "PAPER_FORM".asInstanceOf[typings.twilio.twilioStrings.PAPER_FORM]
    
    inline def VERBAL: typings.twilio.twilioStrings.VERBAL = "VERBAL".asInstanceOf[typings.twilio.twilioStrings.VERBAL]
    
    inline def VIA_TEXT: typings.twilio.twilioStrings.VIA_TEXT = "VIA_TEXT".asInstanceOf[typings.twilio.twilioStrings.VIA_TEXT]
    
    inline def WEB_FORM: typings.twilio.twilioStrings.WEB_FORM = "WEB_FORM".asInstanceOf[typings.twilio.twilioStrings.WEB_FORM]
  }
  
  trait TollfreeVerificationPayload
    extends StObject
       with TollfreeVerificationResource
       with TwilioResponsePayload
  object TollfreeVerificationPayload {
    
    inline def apply(
      account_sid: String,
      additional_information: String,
      business_city: String,
      business_contact_email: String,
      business_contact_first_name: String,
      business_contact_last_name: String,
      business_contact_phone: String,
      business_country: String,
      business_name: String,
      business_postal_code: String,
      business_state_province_region: String,
      business_street_address: String,
      business_street_address2: String,
      business_website: String,
      customer_profile_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      message_volume: String,
      next_page_uri: String,
      notification_email: String,
      opt_in_image_urls: js.Array[String],
      opt_in_type: TollfreeVerificationOptInType,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      production_message_sample: String,
      regulated_item_sid: String,
      resource_links: js.Object,
      sid: String,
      status: TollfreeVerificationStatus,
      tollfree_phone_number_sid: String,
      trust_product_sid: String,
      uri: String,
      url: String,
      use_case_categories: js.Array[String],
      use_case_summary: String
    ): TollfreeVerificationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], additional_information = additional_information.asInstanceOf[js.Any], business_city = business_city.asInstanceOf[js.Any], business_contact_email = business_contact_email.asInstanceOf[js.Any], business_contact_first_name = business_contact_first_name.asInstanceOf[js.Any], business_contact_last_name = business_contact_last_name.asInstanceOf[js.Any], business_contact_phone = business_contact_phone.asInstanceOf[js.Any], business_country = business_country.asInstanceOf[js.Any], business_name = business_name.asInstanceOf[js.Any], business_postal_code = business_postal_code.asInstanceOf[js.Any], business_state_province_region = business_state_province_region.asInstanceOf[js.Any], business_street_address = business_street_address.asInstanceOf[js.Any], business_street_address2 = business_street_address2.asInstanceOf[js.Any], business_website = business_website.asInstanceOf[js.Any], customer_profile_sid = customer_profile_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], message_volume = message_volume.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], notification_email = notification_email.asInstanceOf[js.Any], opt_in_image_urls = opt_in_image_urls.asInstanceOf[js.Any], opt_in_type = opt_in_type.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], production_message_sample = production_message_sample.asInstanceOf[js.Any], regulated_item_sid = regulated_item_sid.asInstanceOf[js.Any], resource_links = resource_links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tollfree_phone_number_sid = tollfree_phone_number_sid.asInstanceOf[js.Any], trust_product_sid = trust_product_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_case_categories = use_case_categories.asInstanceOf[js.Any], use_case_summary = use_case_summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[TollfreeVerificationPayload]
    }
  }
  
  trait TollfreeVerificationResource extends StObject {
    
    var account_sid: String
    
    var additional_information: String
    
    var business_city: String
    
    var business_contact_email: String
    
    var business_contact_first_name: String
    
    var business_contact_last_name: String
    
    var business_contact_phone: String
    
    var business_country: String
    
    var business_name: String
    
    var business_postal_code: String
    
    var business_state_province_region: String
    
    var business_street_address: String
    
    var business_street_address2: String
    
    var business_website: String
    
    var customer_profile_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var message_volume: String
    
    var notification_email: String
    
    var opt_in_image_urls: js.Array[String]
    
    var opt_in_type: TollfreeVerificationOptInType
    
    var production_message_sample: String
    
    var regulated_item_sid: String
    
    var resource_links: js.Object
    
    var sid: String
    
    var status: TollfreeVerificationStatus
    
    var tollfree_phone_number_sid: String
    
    var trust_product_sid: String
    
    var url: String
    
    var use_case_categories: js.Array[String]
    
    var use_case_summary: String
  }
  object TollfreeVerificationResource {
    
    inline def apply(
      account_sid: String,
      additional_information: String,
      business_city: String,
      business_contact_email: String,
      business_contact_first_name: String,
      business_contact_last_name: String,
      business_contact_phone: String,
      business_country: String,
      business_name: String,
      business_postal_code: String,
      business_state_province_region: String,
      business_street_address: String,
      business_street_address2: String,
      business_website: String,
      customer_profile_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      message_volume: String,
      notification_email: String,
      opt_in_image_urls: js.Array[String],
      opt_in_type: TollfreeVerificationOptInType,
      production_message_sample: String,
      regulated_item_sid: String,
      resource_links: js.Object,
      sid: String,
      status: TollfreeVerificationStatus,
      tollfree_phone_number_sid: String,
      trust_product_sid: String,
      url: String,
      use_case_categories: js.Array[String],
      use_case_summary: String
    ): TollfreeVerificationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], additional_information = additional_information.asInstanceOf[js.Any], business_city = business_city.asInstanceOf[js.Any], business_contact_email = business_contact_email.asInstanceOf[js.Any], business_contact_first_name = business_contact_first_name.asInstanceOf[js.Any], business_contact_last_name = business_contact_last_name.asInstanceOf[js.Any], business_contact_phone = business_contact_phone.asInstanceOf[js.Any], business_country = business_country.asInstanceOf[js.Any], business_name = business_name.asInstanceOf[js.Any], business_postal_code = business_postal_code.asInstanceOf[js.Any], business_state_province_region = business_state_province_region.asInstanceOf[js.Any], business_street_address = business_street_address.asInstanceOf[js.Any], business_street_address2 = business_street_address2.asInstanceOf[js.Any], business_website = business_website.asInstanceOf[js.Any], customer_profile_sid = customer_profile_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], message_volume = message_volume.asInstanceOf[js.Any], notification_email = notification_email.asInstanceOf[js.Any], opt_in_image_urls = opt_in_image_urls.asInstanceOf[js.Any], opt_in_type = opt_in_type.asInstanceOf[js.Any], production_message_sample = production_message_sample.asInstanceOf[js.Any], regulated_item_sid = regulated_item_sid.asInstanceOf[js.Any], resource_links = resource_links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tollfree_phone_number_sid = tollfree_phone_number_sid.asInstanceOf[js.Any], trust_product_sid = trust_product_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_case_categories = use_case_categories.asInstanceOf[js.Any], use_case_summary = use_case_summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[TollfreeVerificationResource]
    }
    
    extension [Self <: TollfreeVerificationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAdditional_information(value: String): Self = StObject.set(x, "additional_information", value.asInstanceOf[js.Any])
      
      inline def setBusiness_city(value: String): Self = StObject.set(x, "business_city", value.asInstanceOf[js.Any])
      
      inline def setBusiness_contact_email(value: String): Self = StObject.set(x, "business_contact_email", value.asInstanceOf[js.Any])
      
      inline def setBusiness_contact_first_name(value: String): Self = StObject.set(x, "business_contact_first_name", value.asInstanceOf[js.Any])
      
      inline def setBusiness_contact_last_name(value: String): Self = StObject.set(x, "business_contact_last_name", value.asInstanceOf[js.Any])
      
      inline def setBusiness_contact_phone(value: String): Self = StObject.set(x, "business_contact_phone", value.asInstanceOf[js.Any])
      
      inline def setBusiness_country(value: String): Self = StObject.set(x, "business_country", value.asInstanceOf[js.Any])
      
      inline def setBusiness_name(value: String): Self = StObject.set(x, "business_name", value.asInstanceOf[js.Any])
      
      inline def setBusiness_postal_code(value: String): Self = StObject.set(x, "business_postal_code", value.asInstanceOf[js.Any])
      
      inline def setBusiness_state_province_region(value: String): Self = StObject.set(x, "business_state_province_region", value.asInstanceOf[js.Any])
      
      inline def setBusiness_street_address(value: String): Self = StObject.set(x, "business_street_address", value.asInstanceOf[js.Any])
      
      inline def setBusiness_street_address2(value: String): Self = StObject.set(x, "business_street_address2", value.asInstanceOf[js.Any])
      
      inline def setBusiness_website(value: String): Self = StObject.set(x, "business_website", value.asInstanceOf[js.Any])
      
      inline def setCustomer_profile_sid(value: String): Self = StObject.set(x, "customer_profile_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setMessage_volume(value: String): Self = StObject.set(x, "message_volume", value.asInstanceOf[js.Any])
      
      inline def setNotification_email(value: String): Self = StObject.set(x, "notification_email", value.asInstanceOf[js.Any])
      
      inline def setOpt_in_image_urls(value: js.Array[String]): Self = StObject.set(x, "opt_in_image_urls", value.asInstanceOf[js.Any])
      
      inline def setOpt_in_image_urlsVarargs(value: String*): Self = StObject.set(x, "opt_in_image_urls", js.Array(value*))
      
      inline def setOpt_in_type(value: TollfreeVerificationOptInType): Self = StObject.set(x, "opt_in_type", value.asInstanceOf[js.Any])
      
      inline def setProduction_message_sample(value: String): Self = StObject.set(x, "production_message_sample", value.asInstanceOf[js.Any])
      
      inline def setRegulated_item_sid(value: String): Self = StObject.set(x, "regulated_item_sid", value.asInstanceOf[js.Any])
      
      inline def setResource_links(value: js.Object): Self = StObject.set(x, "resource_links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: TollfreeVerificationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTollfree_phone_number_sid(value: String): Self = StObject.set(x, "tollfree_phone_number_sid", value.asInstanceOf[js.Any])
      
      inline def setTrust_product_sid(value: String): Self = StObject.set(x, "trust_product_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUse_case_categories(value: js.Array[String]): Self = StObject.set(x, "use_case_categories", value.asInstanceOf[js.Any])
      
      inline def setUse_case_categoriesVarargs(value: String*): Self = StObject.set(x, "use_case_categories", js.Array(value*))
      
      inline def setUse_case_summary(value: String): Self = StObject.set(x, "use_case_summary", value.asInstanceOf[js.Any])
    }
  }
  
  trait TollfreeVerificationSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.PENDING_REVIEW
    - typings.twilio.twilioStrings.IN_REVIEW
    - typings.twilio.twilioStrings.TWILIO_APPROVED
    - typings.twilio.twilioStrings.TWILIO_REJECTED
  */
  trait TollfreeVerificationStatus extends StObject
  object TollfreeVerificationStatus {
    
    inline def IN_REVIEW: typings.twilio.twilioStrings.IN_REVIEW = "IN_REVIEW".asInstanceOf[typings.twilio.twilioStrings.IN_REVIEW]
    
    inline def PENDING_REVIEW: typings.twilio.twilioStrings.PENDING_REVIEW = "PENDING_REVIEW".asInstanceOf[typings.twilio.twilioStrings.PENDING_REVIEW]
    
    inline def TWILIO_APPROVED: typings.twilio.twilioStrings.TWILIO_APPROVED = "TWILIO_APPROVED".asInstanceOf[typings.twilio.twilioStrings.TWILIO_APPROVED]
    
    inline def TWILIO_REJECTED: typings.twilio.twilioStrings.TWILIO_REJECTED = "TWILIO_REJECTED".asInstanceOf[typings.twilio.twilioStrings.TWILIO_REJECTED]
  }
}
