package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundleCopyMod {
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/bundleCopy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/bundleCopy", "BundleCopyInstance")
  @js.native
  open class BundleCopyInstance protected () extends SerializableClass {
    /**
      * Initialize the BundleCopyContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param bundleSid - The unique string that identifies the resource.
      */
    def this(version: typings.twilio.numbersV2Mod.^, payload: BundleCopyPayload, bundleSid: String) = this()
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var email: String = js.native
    
    var friendlyName: String = js.native
    
    var regulationSid: String = js.native
    
    var sid: String = js.native
    
    var status: BundleCopyStatus = js.native
    
    var statusCallback: String = js.native
    
    var validUntil: js.Date = js.native
  }
  
  /**
    * Initialize the BundleCopyList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param bundleSid - The unique string that identifies the resource.
    */
  inline def BundleCopyList(version: typings.twilio.numbersV2Mod.^, bundleSid: String): BundleCopyListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("BundleCopyList")(version.asInstanceOf[js.Any], bundleSid.asInstanceOf[js.Any])).asInstanceOf[BundleCopyListInstance]
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/bundle/bundleCopy", "BundleCopyPage")
  @js.native
  open class BundleCopyPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.numbersV2Mod.^, 
          BundleCopyPayload, 
          BundleCopyResource, 
          BundleCopyInstance
        ] {
    /**
      * Initialize the BundleCopyPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.numbersV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: BundleCopySolution
    ) = this()
    
    /**
      * Build an instance of BundleCopyInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BundleCopyPayload): BundleCopyInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.individual
    - typings.twilio.twilioStrings.business
  */
  trait BundleCopyEndUserType extends StObject
  object BundleCopyEndUserType {
    
    inline def business: typings.twilio.twilioStrings.business = "business".asInstanceOf[typings.twilio.twilioStrings.business]
    
    inline def individual: typings.twilio.twilioStrings.individual = "individual".asInstanceOf[typings.twilio.twilioStrings.individual]
  }
  
  @js.native
  trait BundleCopyListInstance extends StObject {
    
    /**
      * create a BundleCopyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[BundleCopyInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ BundleCopyInstance, Any]): js.Promise[BundleCopyInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ BundleCopyInstance, Any]
    ): js.Promise[BundleCopyInstance] = js.native
    def create(opts: BundleCopyListInstanceCreateOptions): js.Promise[BundleCopyInstance] = js.native
    def create(
      opts: BundleCopyListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ BundleCopyInstance, Any]
    ): js.Promise[BundleCopyInstance] = js.native
    
    /**
      * Streams BundleCopyInstance records from the API.
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
          /* item */ BundleCopyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ BundleCopyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: BundleCopyListInstanceEachOptions): Unit = js.native
    def each(
      opts: BundleCopyListInstanceEachOptions,
      callback: js.Function2[
          /* item */ BundleCopyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of BundleCopyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[BundleCopyPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleCopyPage, Any]): js.Promise[BundleCopyPage] = js.native
    def getPage(targetUrl: String): js.Promise[BundleCopyPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleCopyPage, Any]
    ): js.Promise[BundleCopyPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleCopyPage, Any]
    ): js.Promise[BundleCopyPage] = js.native
    
    /**
      * Lists BundleCopyInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[BundleCopyInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BundleCopyInstance], Any]): js.Promise[js.Array[BundleCopyInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BundleCopyInstance], Any]
    ): js.Promise[js.Array[BundleCopyInstance]] = js.native
    def list(opts: BundleCopyListInstanceOptions): js.Promise[js.Array[BundleCopyInstance]] = js.native
    def list(
      opts: BundleCopyListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BundleCopyInstance], Any]
    ): js.Promise[js.Array[BundleCopyInstance]] = js.native
    
    /**
      * Retrieve a single page of BundleCopyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[BundleCopyPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleCopyPage, Any]): js.Promise[BundleCopyPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleCopyPage, Any]): js.Promise[BundleCopyPage] = js.native
    def page(opts: BundleCopyListInstancePageOptions): js.Promise[BundleCopyPage] = js.native
    def page(
      opts: BundleCopyListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BundleCopyPage, Any]
    ): js.Promise[BundleCopyPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - The string that you assigned to describe the copied bundle
    */
  trait BundleCopyListInstanceCreateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object BundleCopyListInstanceCreateOptions {
    
    inline def apply(): BundleCopyListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleCopyListInstanceCreateOptions]
    }
    
    extension [Self <: BundleCopyListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
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
  trait BundleCopyListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ BundleCopyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object BundleCopyListInstanceEachOptions {
    
    inline def apply(): BundleCopyListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleCopyListInstanceEachOptions]
    }
    
    extension [Self <: BundleCopyListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ BundleCopyInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait BundleCopyListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object BundleCopyListInstanceOptions {
    
    inline def apply(): BundleCopyListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleCopyListInstanceOptions]
    }
    
    extension [Self <: BundleCopyListInstanceOptions](x: Self) {
      
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
  trait BundleCopyListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object BundleCopyListInstancePageOptions {
    
    inline def apply(): BundleCopyListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleCopyListInstancePageOptions]
    }
    
    extension [Self <: BundleCopyListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait BundleCopyPayload
    extends StObject
       with BundleCopyResource
       with TwilioResponsePayload
  object BundleCopyPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      regulation_sid: String,
      sid: String,
      status: BundleCopyStatus,
      status_callback: String,
      uri: String,
      valid_until: js.Date
    ): BundleCopyPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], regulation_sid = regulation_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleCopyPayload]
    }
  }
  
  trait BundleCopyResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var email: String
    
    var friendly_name: String
    
    var regulation_sid: String
    
    var sid: String
    
    var status: BundleCopyStatus
    
    var status_callback: String
    
    var valid_until: js.Date
  }
  object BundleCopyResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      friendly_name: String,
      regulation_sid: String,
      sid: String,
      status: BundleCopyStatus,
      status_callback: String,
      valid_until: js.Date
    ): BundleCopyResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], regulation_sid = regulation_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleCopyResource]
    }
    
    extension [Self <: BundleCopyResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setRegulation_sid(value: String): Self = StObject.set(x, "regulation_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: BundleCopyStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setValid_until(value: js.Date): Self = StObject.set(x, "valid_until", value.asInstanceOf[js.Any])
    }
  }
  
  trait BundleCopySolution extends StObject {
    
    var bundleSid: js.UndefOr[String] = js.undefined
  }
  object BundleCopySolution {
    
    inline def apply(): BundleCopySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleCopySolution]
    }
    
    extension [Self <: BundleCopySolution](x: Self) {
      
      inline def setBundleSid(value: String): Self = StObject.set(x, "bundleSid", value.asInstanceOf[js.Any])
      
      inline def setBundleSidUndefined: Self = StObject.set(x, "bundleSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.draft
    - typings.twilio.twilioStrings.`pending-review`
    - typings.twilio.twilioStrings.`in-review`
    - typings.twilio.twilioStrings.`twilio-rejected`
    - typings.twilio.twilioStrings.`twilio-approved`
    - typings.twilio.twilioStrings.`provisionally-approved`
  */
  trait BundleCopyStatus extends StObject
  object BundleCopyStatus {
    
    inline def draft: typings.twilio.twilioStrings.draft = "draft".asInstanceOf[typings.twilio.twilioStrings.draft]
    
    inline def `in-review`: typings.twilio.twilioStrings.`in-review` = "in-review".asInstanceOf[typings.twilio.twilioStrings.`in-review`]
    
    inline def `pending-review`: typings.twilio.twilioStrings.`pending-review` = "pending-review".asInstanceOf[typings.twilio.twilioStrings.`pending-review`]
    
    inline def `provisionally-approved`: typings.twilio.twilioStrings.`provisionally-approved` = "provisionally-approved".asInstanceOf[typings.twilio.twilioStrings.`provisionally-approved`]
    
    inline def `twilio-approved`: typings.twilio.twilioStrings.`twilio-approved` = "twilio-approved".asInstanceOf[typings.twilio.twilioStrings.`twilio-approved`]
    
    inline def `twilio-rejected`: typings.twilio.twilioStrings.`twilio-rejected` = "twilio-rejected".asInstanceOf[typings.twilio.twilioStrings.`twilio-rejected`]
  }
}
