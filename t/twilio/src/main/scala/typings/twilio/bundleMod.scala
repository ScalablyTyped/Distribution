package typings.twilio

import typings.twilio.bundleCopyMod.BundleCopyListInstance
import typings.twilio.evaluationMod.EvaluationContext
import typings.twilio.evaluationMod.EvaluationListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.itemAssignmentMod.ItemAssignmentContext
import typings.twilio.itemAssignmentMod.ItemAssignmentListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.replaceItemsMod.ReplaceItemsListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundleMod {
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle", "BundleContext")
  @js.native
  open class BundleContext protected () extends StObject {
    /**
      * Initialize the BundleContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource.
      */
    def this(version: typings.twilio.numbersV2Mod.^, sid: String) = this()
    
    var bundleCopies: BundleCopyListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def evaluations(sid: String): EvaluationContext = js.native
    @JSName("evaluations")
    var evaluations_Original: EvaluationListInstance = js.native
    
    /**
      * fetch a BundleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BundleInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleInstance, Any]): js.Promise[BundleInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def itemAssignments(sid: String): ItemAssignmentContext = js.native
    @JSName("itemAssignments")
    var itemAssignments_Original: ItemAssignmentListInstance = js.native
    
    /**
      * remove a BundleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleInstance, Any]): js.Promise[Boolean] = js.native
    
    var replaceItems: ReplaceItemsListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a BundleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[BundleInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleInstance, Any]): js.Promise[BundleInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleInstance, Any]): js.Promise[BundleInstance] = js.native
    def update(opts: BundleInstanceUpdateOptions): js.Promise[BundleInstance] = js.native
    def update(
      opts: BundleInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleInstance, Any]
    ): js.Promise[BundleInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle", "BundleInstance")
  @js.native
  open class BundleInstance protected () extends SerializableClass {
    /**
      * Initialize the BundleContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource.
      */
    def this(version: typings.twilio.numbersV2Mod.^, payload: BundlePayload, sid: String) = this()
    
    /* private */ var _proxy: BundleContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the bundleCopies
      */
    def bundleCopies(): BundleCopyListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var email: String = js.native
    
    /**
      * Access the evaluations
      */
    def evaluations(): EvaluationListInstance = js.native
    
    /**
      * fetch a BundleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BundleInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BundleInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * Access the itemAssignments
      */
    def itemAssignments(): ItemAssignmentListInstance = js.native
    
    var links: String = js.native
    
    var regulationSid: String = js.native
    
    /**
      * remove a BundleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Access the replaceItems
      */
    def replaceItems(): ReplaceItemsListInstance = js.native
    
    var sid: String = js.native
    
    var status: BundleStatus = js.native
    
    var statusCallback: String = js.native
    
    /**
      * update a BundleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[BundleInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BundleInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BundleInstance] = js.native
    def update(opts: BundleInstanceUpdateOptions): js.Promise[BundleInstance] = js.native
    def update(
      opts: BundleInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[BundleInstance] = js.native
    
    var url: String = js.native
    
    var validUntil: js.Date = js.native
  }
  
  /**
    * Initialize the BundleList
    *
    * @param version - Version of the resource
    */
  inline def BundleList(version: typings.twilio.numbersV2Mod.^): BundleListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("BundleList")(version.asInstanceOf[js.Any]).asInstanceOf[BundleListInstance]
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle", "BundlePage")
  @js.native
  open class BundlePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.numbersV2Mod.^, BundlePayload, BundleResource, BundleInstance] {
    /**
      * Initialize the BundlePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.numbersV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: BundleSolution
    ) = this()
    
    /**
      * Build an instance of BundleInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BundlePayload): BundleInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.individual
    - typings.twilio.twilioStrings.business
  */
  trait BundleEndUserType extends StObject
  object BundleEndUserType {
    
    inline def business: typings.twilio.twilioStrings.business = "business".asInstanceOf[typings.twilio.twilioStrings.business]
    
    inline def individual: typings.twilio.twilioStrings.individual = "individual".asInstanceOf[typings.twilio.twilioStrings.individual]
  }
  
  /**
    * Options to pass to update
    *
    * @property email - The email address
    * @property friendlyName - The string that you assigned to describe the resource
    * @property status - The verification status of the Bundle resource
    * @property statusCallback - The URL we call to inform your application of status changes.
    */
  trait BundleInstanceUpdateOptions extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[BundleStatus] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
  }
  object BundleInstanceUpdateOptions {
    
    inline def apply(): BundleInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleInstanceUpdateOptions]
    }
    
    extension [Self <: BundleInstanceUpdateOptions](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setStatus(value: BundleStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait BundleListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): BundleContext = js.native
    
    /**
      * create a BundleInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: BundleListInstanceCreateOptions): js.Promise[BundleInstance] = js.native
    def create(
      opts: BundleListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ BundleInstance, Any]
    ): js.Promise[BundleInstance] = js.native
    
    /**
      * Streams BundleInstance records from the API.
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
          /* item */ BundleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ BundleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: BundleListInstanceEachOptions): Unit = js.native
    def each(
      opts: BundleListInstanceEachOptions,
      callback: js.Function2[
          /* item */ BundleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a bundle
      *
      * @param sid - The unique string that identifies the resource.
      */
    def get(sid: String): BundleContext = js.native
    
    /**
      * Retrieve a single target page of BundleInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[BundlePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ BundlePage, Any]): js.Promise[BundlePage] = js.native
    def getPage(targetUrl: String): js.Promise[BundlePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BundlePage, Any]
    ): js.Promise[BundlePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BundlePage, Any]): js.Promise[BundlePage] = js.native
    
    /**
      * Lists BundleInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[BundleInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BundleInstance], Any]): js.Promise[js.Array[BundleInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BundleInstance], Any]
    ): js.Promise[js.Array[BundleInstance]] = js.native
    def list(opts: BundleListInstanceOptions): js.Promise[js.Array[BundleInstance]] = js.native
    def list(
      opts: BundleListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BundleInstance], Any]
    ): js.Promise[js.Array[BundleInstance]] = js.native
    
    /**
      * Retrieve a single page of BundleInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[BundlePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ BundlePage, Any]): js.Promise[BundlePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BundlePage, Any]): js.Promise[BundlePage] = js.native
    def page(opts: BundleListInstancePageOptions): js.Promise[BundlePage] = js.native
    def page(
      opts: BundleListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BundlePage, Any]
    ): js.Promise[BundlePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property email - The email address
    * @property endUserType - The type of End User of the Bundle resource
    * @property friendlyName - The string that you assigned to describe the resource
    * @property isoCountry - The ISO country code of the country
    * @property numberType - The type of phone number
    * @property regulationSid - The unique string of a regulation.
    * @property statusCallback - The URL we call to inform your application of status changes.
    */
  trait BundleListInstanceCreateOptions extends StObject {
    
    var email: String
    
    var endUserType: js.UndefOr[BundleEndUserType] = js.undefined
    
    var friendlyName: String
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var numberType: js.UndefOr[String] = js.undefined
    
    var regulationSid: js.UndefOr[String] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
  }
  object BundleListInstanceCreateOptions {
    
    inline def apply(email: String, friendlyName: String): BundleListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleListInstanceCreateOptions]
    }
    
    extension [Self <: BundleListInstanceCreateOptions](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEndUserType(value: BundleEndUserType): Self = StObject.set(x, "endUserType", value.asInstanceOf[js.Any])
      
      inline def setEndUserTypeUndefined: Self = StObject.set(x, "endUserType", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setNumberType(value: String): Self = StObject.set(x, "numberType", value.asInstanceOf[js.Any])
      
      inline def setNumberTypeUndefined: Self = StObject.set(x, "numberType", js.undefined)
      
      inline def setRegulationSid(value: String): Self = StObject.set(x, "regulationSid", value.asInstanceOf[js.Any])
      
      inline def setRegulationSidUndefined: Self = StObject.set(x, "regulationSid", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The string that you assigned to describe the resource
    * @property hasValidUntilDate - Indicates that the Bundle is a valid Bundle until a specified expiration date.
    * @property isoCountry - The ISO country code of the country
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property numberType - The type of phone number
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property regulationSid - The unique string of a regulation.
    * @property sortBy - Can be `valid-until` or `date-updated`. Defaults to `date-created`.
    * @property sortDirection - Default is `DESC`. Can be `ASC` or `DESC`.
    * @property status - The verification status of the Bundle resource
    * @property validUntilDate - Date to filter Bundles having their `valid_until_date` before or after the specified date. Can be `ValidUntilDate>=` or `ValidUntilDate<=`. Both can be used in conjunction as well.
    * @property validUntilDateAfter - Date to filter Bundles having their `valid_until_date` before or after the specified date. Can be `ValidUntilDate>=` or `ValidUntilDate<=`. Both can be used in conjunction as well.
    * @property validUntilDateBefore - Date to filter Bundles having their `valid_until_date` before or after the specified date. Can be `ValidUntilDate>=` or `ValidUntilDate<=`. Both can be used in conjunction as well.
    */
  trait BundleListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ BundleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var hasValidUntilDate: js.UndefOr[Boolean] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var numberType: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var regulationSid: js.UndefOr[String] = js.undefined
    
    var sortBy: js.UndefOr[BundleSortBy] = js.undefined
    
    var sortDirection: js.UndefOr[BundleSortDirection] = js.undefined
    
    var status: js.UndefOr[BundleStatus] = js.undefined
    
    var validUntilDate: js.UndefOr[js.Date] = js.undefined
    
    var validUntilDateAfter: js.UndefOr[js.Date] = js.undefined
    
    var validUntilDateBefore: js.UndefOr[js.Date] = js.undefined
  }
  object BundleListInstanceEachOptions {
    
    inline def apply(): BundleListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleListInstanceEachOptions]
    }
    
    extension [Self <: BundleListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ BundleInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setHasValidUntilDate(value: Boolean): Self = StObject.set(x, "hasValidUntilDate", value.asInstanceOf[js.Any])
      
      inline def setHasValidUntilDateUndefined: Self = StObject.set(x, "hasValidUntilDate", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setNumberType(value: String): Self = StObject.set(x, "numberType", value.asInstanceOf[js.Any])
      
      inline def setNumberTypeUndefined: Self = StObject.set(x, "numberType", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRegulationSid(value: String): Self = StObject.set(x, "regulationSid", value.asInstanceOf[js.Any])
      
      inline def setRegulationSidUndefined: Self = StObject.set(x, "regulationSid", js.undefined)
      
      inline def setSortBy(value: BundleSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      inline def setSortDirection(value: BundleSortDirection): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
      
      inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
      
      inline def setStatus(value: BundleStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setValidUntilDate(value: js.Date): Self = StObject.set(x, "validUntilDate", value.asInstanceOf[js.Any])
      
      inline def setValidUntilDateAfter(value: js.Date): Self = StObject.set(x, "validUntilDateAfter", value.asInstanceOf[js.Any])
      
      inline def setValidUntilDateAfterUndefined: Self = StObject.set(x, "validUntilDateAfter", js.undefined)
      
      inline def setValidUntilDateBefore(value: js.Date): Self = StObject.set(x, "validUntilDateBefore", value.asInstanceOf[js.Any])
      
      inline def setValidUntilDateBeforeUndefined: Self = StObject.set(x, "validUntilDateBefore", js.undefined)
      
      inline def setValidUntilDateUndefined: Self = StObject.set(x, "validUntilDate", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - The string that you assigned to describe the resource
    * @property hasValidUntilDate - Indicates that the Bundle is a valid Bundle until a specified expiration date.
    * @property isoCountry - The ISO country code of the country
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property numberType - The type of phone number
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property regulationSid - The unique string of a regulation.
    * @property sortBy - Can be `valid-until` or `date-updated`. Defaults to `date-created`.
    * @property sortDirection - Default is `DESC`. Can be `ASC` or `DESC`.
    * @property status - The verification status of the Bundle resource
    * @property validUntilDate - Date to filter Bundles having their `valid_until_date` before or after the specified date. Can be `ValidUntilDate>=` or `ValidUntilDate<=`. Both can be used in conjunction as well.
    * @property validUntilDateAfter - Date to filter Bundles having their `valid_until_date` before or after the specified date. Can be `ValidUntilDate>=` or `ValidUntilDate<=`. Both can be used in conjunction as well.
    * @property validUntilDateBefore - Date to filter Bundles having their `valid_until_date` before or after the specified date. Can be `ValidUntilDate>=` or `ValidUntilDate<=`. Both can be used in conjunction as well.
    */
  trait BundleListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var hasValidUntilDate: js.UndefOr[Boolean] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var numberType: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var regulationSid: js.UndefOr[String] = js.undefined
    
    var sortBy: js.UndefOr[BundleSortBy] = js.undefined
    
    var sortDirection: js.UndefOr[BundleSortDirection] = js.undefined
    
    var status: js.UndefOr[BundleStatus] = js.undefined
    
    var validUntilDate: js.UndefOr[js.Date] = js.undefined
    
    var validUntilDateAfter: js.UndefOr[js.Date] = js.undefined
    
    var validUntilDateBefore: js.UndefOr[js.Date] = js.undefined
  }
  object BundleListInstanceOptions {
    
    inline def apply(): BundleListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleListInstanceOptions]
    }
    
    extension [Self <: BundleListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setHasValidUntilDate(value: Boolean): Self = StObject.set(x, "hasValidUntilDate", value.asInstanceOf[js.Any])
      
      inline def setHasValidUntilDateUndefined: Self = StObject.set(x, "hasValidUntilDate", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setNumberType(value: String): Self = StObject.set(x, "numberType", value.asInstanceOf[js.Any])
      
      inline def setNumberTypeUndefined: Self = StObject.set(x, "numberType", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRegulationSid(value: String): Self = StObject.set(x, "regulationSid", value.asInstanceOf[js.Any])
      
      inline def setRegulationSidUndefined: Self = StObject.set(x, "regulationSid", js.undefined)
      
      inline def setSortBy(value: BundleSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      inline def setSortDirection(value: BundleSortDirection): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
      
      inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
      
      inline def setStatus(value: BundleStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setValidUntilDate(value: js.Date): Self = StObject.set(x, "validUntilDate", value.asInstanceOf[js.Any])
      
      inline def setValidUntilDateAfter(value: js.Date): Self = StObject.set(x, "validUntilDateAfter", value.asInstanceOf[js.Any])
      
      inline def setValidUntilDateAfterUndefined: Self = StObject.set(x, "validUntilDateAfter", js.undefined)
      
      inline def setValidUntilDateBefore(value: js.Date): Self = StObject.set(x, "validUntilDateBefore", value.asInstanceOf[js.Any])
      
      inline def setValidUntilDateBeforeUndefined: Self = StObject.set(x, "validUntilDateBefore", js.undefined)
      
      inline def setValidUntilDateUndefined: Self = StObject.set(x, "validUntilDate", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - The string that you assigned to describe the resource
    * @property hasValidUntilDate - Indicates that the Bundle is a valid Bundle until a specified expiration date.
    * @property isoCountry - The ISO country code of the country
    * @property numberType - The type of phone number
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property regulationSid - The unique string of a regulation.
    * @property sortBy - Can be `valid-until` or `date-updated`. Defaults to `date-created`.
    * @property sortDirection - Default is `DESC`. Can be `ASC` or `DESC`.
    * @property status - The verification status of the Bundle resource
    * @property validUntilDate - Date to filter Bundles having their `valid_until_date` before or after the specified date. Can be `ValidUntilDate>=` or `ValidUntilDate<=`. Both can be used in conjunction as well.
    * @property validUntilDateAfter - Date to filter Bundles having their `valid_until_date` before or after the specified date. Can be `ValidUntilDate>=` or `ValidUntilDate<=`. Both can be used in conjunction as well.
    * @property validUntilDateBefore - Date to filter Bundles having their `valid_until_date` before or after the specified date. Can be `ValidUntilDate>=` or `ValidUntilDate<=`. Both can be used in conjunction as well.
    */
  trait BundleListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var hasValidUntilDate: js.UndefOr[Boolean] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var numberType: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var regulationSid: js.UndefOr[String] = js.undefined
    
    var sortBy: js.UndefOr[BundleSortBy] = js.undefined
    
    var sortDirection: js.UndefOr[BundleSortDirection] = js.undefined
    
    var status: js.UndefOr[BundleStatus] = js.undefined
    
    var validUntilDate: js.UndefOr[js.Date] = js.undefined
    
    var validUntilDateAfter: js.UndefOr[js.Date] = js.undefined
    
    var validUntilDateBefore: js.UndefOr[js.Date] = js.undefined
  }
  object BundleListInstancePageOptions {
    
    inline def apply(): BundleListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleListInstancePageOptions]
    }
    
    extension [Self <: BundleListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setHasValidUntilDate(value: Boolean): Self = StObject.set(x, "hasValidUntilDate", value.asInstanceOf[js.Any])
      
      inline def setHasValidUntilDateUndefined: Self = StObject.set(x, "hasValidUntilDate", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setNumberType(value: String): Self = StObject.set(x, "numberType", value.asInstanceOf[js.Any])
      
      inline def setNumberTypeUndefined: Self = StObject.set(x, "numberType", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setRegulationSid(value: String): Self = StObject.set(x, "regulationSid", value.asInstanceOf[js.Any])
      
      inline def setRegulationSidUndefined: Self = StObject.set(x, "regulationSid", js.undefined)
      
      inline def setSortBy(value: BundleSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      inline def setSortDirection(value: BundleSortDirection): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
      
      inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
      
      inline def setStatus(value: BundleStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setValidUntilDate(value: js.Date): Self = StObject.set(x, "validUntilDate", value.asInstanceOf[js.Any])
      
      inline def setValidUntilDateAfter(value: js.Date): Self = StObject.set(x, "validUntilDateAfter", value.asInstanceOf[js.Any])
      
      inline def setValidUntilDateAfterUndefined: Self = StObject.set(x, "validUntilDateAfter", js.undefined)
      
      inline def setValidUntilDateBefore(value: js.Date): Self = StObject.set(x, "validUntilDateBefore", value.asInstanceOf[js.Any])
      
      inline def setValidUntilDateBeforeUndefined: Self = StObject.set(x, "validUntilDateBefore", js.undefined)
      
      inline def setValidUntilDateUndefined: Self = StObject.set(x, "validUntilDate", js.undefined)
    }
  }
  
  trait BundlePayload
    extends StObject
       with BundleResource
       with TwilioResponsePayload
  object BundlePayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      regulation_sid: String,
      sid: String,
      status: BundleStatus,
      status_callback: String,
      uri: String,
      url: String,
      valid_until: js.Date
    ): BundlePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], regulation_sid = regulation_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundlePayload]
    }
  }
  
  trait BundleResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var email: String
    
    var friendly_name: String
    
    var links: String
    
    var regulation_sid: String
    
    var sid: String
    
    var status: BundleStatus
    
    var status_callback: String
    
    var url: String
    
    var valid_until: js.Date
  }
  object BundleResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      friendly_name: String,
      links: String,
      regulation_sid: String,
      sid: String,
      status: BundleStatus,
      status_callback: String,
      url: String,
      valid_until: js.Date
    ): BundleResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], regulation_sid = regulation_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleResource]
    }
    
    extension [Self <: BundleResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRegulation_sid(value: String): Self = StObject.set(x, "regulation_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: BundleStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValid_until(value: js.Date): Self = StObject.set(x, "valid_until", value.asInstanceOf[js.Any])
    }
  }
  
  trait BundleSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`valid-until`
    - typings.twilio.twilioStrings.`date-updated`
  */
  trait BundleSortBy extends StObject
  object BundleSortBy {
    
    inline def `date-updated`: typings.twilio.twilioStrings.`date-updated` = "date-updated".asInstanceOf[typings.twilio.twilioStrings.`date-updated`]
    
    inline def `valid-until`: typings.twilio.twilioStrings.`valid-until` = "valid-until".asInstanceOf[typings.twilio.twilioStrings.`valid-until`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.ASC
    - typings.twilio.twilioStrings.DESC
  */
  trait BundleSortDirection extends StObject
  object BundleSortDirection {
    
    inline def ASC: typings.twilio.twilioStrings.ASC = "ASC".asInstanceOf[typings.twilio.twilioStrings.ASC]
    
    inline def DESC: typings.twilio.twilioStrings.DESC = "DESC".asInstanceOf[typings.twilio.twilioStrings.DESC]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.draft
    - typings.twilio.twilioStrings.`pending-review`
    - typings.twilio.twilioStrings.`in-review`
    - typings.twilio.twilioStrings.`twilio-rejected`
    - typings.twilio.twilioStrings.`twilio-approved`
    - typings.twilio.twilioStrings.`provisionally-approved`
  */
  trait BundleStatus extends StObject
  object BundleStatus {
    
    inline def draft: typings.twilio.twilioStrings.draft = "draft".asInstanceOf[typings.twilio.twilioStrings.draft]
    
    inline def `in-review`: typings.twilio.twilioStrings.`in-review` = "in-review".asInstanceOf[typings.twilio.twilioStrings.`in-review`]
    
    inline def `pending-review`: typings.twilio.twilioStrings.`pending-review` = "pending-review".asInstanceOf[typings.twilio.twilioStrings.`pending-review`]
    
    inline def `provisionally-approved`: typings.twilio.twilioStrings.`provisionally-approved` = "provisionally-approved".asInstanceOf[typings.twilio.twilioStrings.`provisionally-approved`]
    
    inline def `twilio-approved`: typings.twilio.twilioStrings.`twilio-approved` = "twilio-approved".asInstanceOf[typings.twilio.twilioStrings.`twilio-approved`]
    
    inline def `twilio-rejected`: typings.twilio.twilioStrings.`twilio-rejected` = "twilio-rejected".asInstanceOf[typings.twilio.twilioStrings.`twilio-rejected`]
  }
}
