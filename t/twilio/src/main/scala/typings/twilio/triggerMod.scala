package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/usage/trigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/usage/trigger", "TriggerContext")
  @js.native
  open class TriggerContext protected () extends StObject {
    /**
      * Initialize the TriggerContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a TriggerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TriggerInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerInstance, Any]): js.Promise[TriggerInstance] = js.native
    
    /**
      * remove a TriggerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a TriggerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TriggerInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerInstance, Any]): js.Promise[TriggerInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerInstance, Any]): js.Promise[TriggerInstance] = js.native
    def update(opts: TriggerInstanceUpdateOptions): js.Promise[TriggerInstance] = js.native
    def update(
      opts: TriggerInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerInstance, Any]
    ): js.Promise[TriggerInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/usage/trigger", "TriggerInstance")
  @js.native
  open class TriggerInstance protected () extends SerializableClass {
    /**
      * Initialize the TriggerContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - A 34 character string that uniquely identifies this resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: TriggerPayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: TriggerContext = js.native
    
    var accountSid: String = js.native
    
    var apiVersion: String = js.native
    
    var callbackMethod: String = js.native
    
    var callbackUrl: String = js.native
    
    var currentValue: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateFired: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a TriggerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TriggerInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TriggerInstance] = js.native
    
    var friendlyName: String = js.native
    
    var recurring: TriggerRecurring = js.native
    
    /**
      * remove a TriggerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var triggerBy: TriggerTriggerField = js.native
    
    var triggerValue: String = js.native
    
    /**
      * update a TriggerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TriggerInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TriggerInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TriggerInstance] = js.native
    def update(opts: TriggerInstanceUpdateOptions): js.Promise[TriggerInstance] = js.native
    def update(
      opts: TriggerInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TriggerInstance] = js.native
    
    var uri: String = js.native
    
    var usageCategory: TriggerUsageCategory = js.native
    
    var usageRecordUri: String = js.native
  }
  
  /**
    * Initialize the TriggerList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def TriggerList(version: typings.twilio.v2010Mod.^, accountSid: String): TriggerListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TriggerList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[TriggerListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/usage/trigger", "TriggerPage")
  @js.native
  open class TriggerPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, TriggerPayload, TriggerResource, TriggerInstance] {
    /**
      * Initialize the TriggerPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TriggerSolution
    ) = this()
    
    /**
      * Build an instance of TriggerInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TriggerPayload): TriggerInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property callbackMethod - The HTTP method to use to call callback_url
    * @property callbackUrl - The URL we call when the trigger fires
    * @property friendlyName - A string to describe the resource
    */
  trait TriggerInstanceUpdateOptions extends StObject {
    
    var callbackMethod: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object TriggerInstanceUpdateOptions {
    
    inline def apply(): TriggerInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriggerInstanceUpdateOptions]
    }
    
    extension [Self <: TriggerInstanceUpdateOptions](x: Self) {
      
      inline def setCallbackMethod(value: String): Self = StObject.set(x, "callbackMethod", value.asInstanceOf[js.Any])
      
      inline def setCallbackMethodUndefined: Self = StObject.set(x, "callbackMethod", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait TriggerListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TriggerContext = js.native
    
    /**
      * create a TriggerInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: TriggerListInstanceCreateOptions): js.Promise[TriggerInstance] = js.native
    def create(
      opts: TriggerListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TriggerInstance, Any]
    ): js.Promise[TriggerInstance] = js.native
    
    /**
      * Streams TriggerInstance records from the API.
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
          /* item */ TriggerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TriggerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TriggerListInstanceEachOptions): Unit = js.native
    def each(
      opts: TriggerListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TriggerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a trigger
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): TriggerContext = js.native
    
    /**
      * Retrieve a single target page of TriggerInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TriggerPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerPage, Any]): js.Promise[TriggerPage] = js.native
    def getPage(targetUrl: String): js.Promise[TriggerPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerPage, Any]
    ): js.Promise[TriggerPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerPage, Any]): js.Promise[TriggerPage] = js.native
    
    /**
      * Lists TriggerInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TriggerInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TriggerInstance], Any]): js.Promise[js.Array[TriggerInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TriggerInstance], Any]
    ): js.Promise[js.Array[TriggerInstance]] = js.native
    def list(opts: TriggerListInstanceOptions): js.Promise[js.Array[TriggerInstance]] = js.native
    def list(
      opts: TriggerListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TriggerInstance], Any]
    ): js.Promise[js.Array[TriggerInstance]] = js.native
    
    /**
      * Retrieve a single page of TriggerInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TriggerPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerPage, Any]): js.Promise[TriggerPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerPage, Any]): js.Promise[TriggerPage] = js.native
    def page(opts: TriggerListInstancePageOptions): js.Promise[TriggerPage] = js.native
    def page(
      opts: TriggerListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TriggerPage, Any]
    ): js.Promise[TriggerPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property callbackMethod - The HTTP method to use to call callback_url
    * @property callbackUrl - The URL we call when the trigger fires
    * @property friendlyName - A string to describe the resource
    * @property recurring - The frequency of a recurring UsageTrigger
    * @property triggerBy - The field in the UsageRecord resource that fires the trigger
    * @property triggerValue - The usage value at which the trigger should fire
    * @property usageCategory - The usage category the trigger watches
    */
  trait TriggerListInstanceCreateOptions extends StObject {
    
    var callbackMethod: js.UndefOr[String] = js.undefined
    
    var callbackUrl: String
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var recurring: js.UndefOr[TriggerRecurring] = js.undefined
    
    var triggerBy: js.UndefOr[TriggerTriggerField] = js.undefined
    
    var triggerValue: String
    
    var usageCategory: TriggerUsageCategory
  }
  object TriggerListInstanceCreateOptions {
    
    inline def apply(callbackUrl: String, triggerValue: String, usageCategory: TriggerUsageCategory): TriggerListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], triggerValue = triggerValue.asInstanceOf[js.Any], usageCategory = usageCategory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerListInstanceCreateOptions]
    }
    
    extension [Self <: TriggerListInstanceCreateOptions](x: Self) {
      
      inline def setCallbackMethod(value: String): Self = StObject.set(x, "callbackMethod", value.asInstanceOf[js.Any])
      
      inline def setCallbackMethodUndefined: Self = StObject.set(x, "callbackMethod", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setRecurring(value: TriggerRecurring): Self = StObject.set(x, "recurring", value.asInstanceOf[js.Any])
      
      inline def setRecurringUndefined: Self = StObject.set(x, "recurring", js.undefined)
      
      inline def setTriggerBy(value: TriggerTriggerField): Self = StObject.set(x, "triggerBy", value.asInstanceOf[js.Any])
      
      inline def setTriggerByUndefined: Self = StObject.set(x, "triggerBy", js.undefined)
      
      inline def setTriggerValue(value: String): Self = StObject.set(x, "triggerValue", value.asInstanceOf[js.Any])
      
      inline def setUsageCategory(value: TriggerUsageCategory): Self = StObject.set(x, "usageCategory", value.asInstanceOf[js.Any])
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
    * @property recurring - The frequency of recurring UsageTriggers to read
    * @property triggerBy - The trigger field of the UsageTriggers to read
    * @property usageCategory - The usage category of the UsageTriggers to read
    */
  trait TriggerListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TriggerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var recurring: js.UndefOr[TriggerRecurring] = js.undefined
    
    var triggerBy: js.UndefOr[TriggerTriggerField] = js.undefined
    
    var usageCategory: js.UndefOr[TriggerUsageCategory] = js.undefined
  }
  object TriggerListInstanceEachOptions {
    
    inline def apply(): TriggerListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriggerListInstanceEachOptions]
    }
    
    extension [Self <: TriggerListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TriggerInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRecurring(value: TriggerRecurring): Self = StObject.set(x, "recurring", value.asInstanceOf[js.Any])
      
      inline def setRecurringUndefined: Self = StObject.set(x, "recurring", js.undefined)
      
      inline def setTriggerBy(value: TriggerTriggerField): Self = StObject.set(x, "triggerBy", value.asInstanceOf[js.Any])
      
      inline def setTriggerByUndefined: Self = StObject.set(x, "triggerBy", js.undefined)
      
      inline def setUsageCategory(value: TriggerUsageCategory): Self = StObject.set(x, "usageCategory", value.asInstanceOf[js.Any])
      
      inline def setUsageCategoryUndefined: Self = StObject.set(x, "usageCategory", js.undefined)
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
    * @property recurring - The frequency of recurring UsageTriggers to read
    * @property triggerBy - The trigger field of the UsageTriggers to read
    * @property usageCategory - The usage category of the UsageTriggers to read
    */
  trait TriggerListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var recurring: js.UndefOr[TriggerRecurring] = js.undefined
    
    var triggerBy: js.UndefOr[TriggerTriggerField] = js.undefined
    
    var usageCategory: js.UndefOr[TriggerUsageCategory] = js.undefined
  }
  object TriggerListInstanceOptions {
    
    inline def apply(): TriggerListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriggerListInstanceOptions]
    }
    
    extension [Self <: TriggerListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRecurring(value: TriggerRecurring): Self = StObject.set(x, "recurring", value.asInstanceOf[js.Any])
      
      inline def setRecurringUndefined: Self = StObject.set(x, "recurring", js.undefined)
      
      inline def setTriggerBy(value: TriggerTriggerField): Self = StObject.set(x, "triggerBy", value.asInstanceOf[js.Any])
      
      inline def setTriggerByUndefined: Self = StObject.set(x, "triggerBy", js.undefined)
      
      inline def setUsageCategory(value: TriggerUsageCategory): Self = StObject.set(x, "usageCategory", value.asInstanceOf[js.Any])
      
      inline def setUsageCategoryUndefined: Self = StObject.set(x, "usageCategory", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property recurring - The frequency of recurring UsageTriggers to read
    * @property triggerBy - The trigger field of the UsageTriggers to read
    * @property usageCategory - The usage category of the UsageTriggers to read
    */
  trait TriggerListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var recurring: js.UndefOr[TriggerRecurring] = js.undefined
    
    var triggerBy: js.UndefOr[TriggerTriggerField] = js.undefined
    
    var usageCategory: js.UndefOr[TriggerUsageCategory] = js.undefined
  }
  object TriggerListInstancePageOptions {
    
    inline def apply(): TriggerListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriggerListInstancePageOptions]
    }
    
    extension [Self <: TriggerListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setRecurring(value: TriggerRecurring): Self = StObject.set(x, "recurring", value.asInstanceOf[js.Any])
      
      inline def setRecurringUndefined: Self = StObject.set(x, "recurring", js.undefined)
      
      inline def setTriggerBy(value: TriggerTriggerField): Self = StObject.set(x, "triggerBy", value.asInstanceOf[js.Any])
      
      inline def setTriggerByUndefined: Self = StObject.set(x, "triggerBy", js.undefined)
      
      inline def setUsageCategory(value: TriggerUsageCategory): Self = StObject.set(x, "usageCategory", value.asInstanceOf[js.Any])
      
      inline def setUsageCategoryUndefined: Self = StObject.set(x, "usageCategory", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait TriggerPayload
    extends StObject
       with TriggerResource {
    
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
  object TriggerPayload {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      callback_method: String,
      callback_url: String,
      current_value: String,
      date_created: js.Date,
      date_fired: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      recurring: TriggerRecurring,
      sid: String,
      trigger_by: TriggerTriggerField,
      trigger_value: String,
      uri: String,
      usage_category: TriggerUsageCategory,
      usage_record_uri: String
    ): TriggerPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], callback_method = callback_method.asInstanceOf[js.Any], callback_url = callback_url.asInstanceOf[js.Any], current_value = current_value.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_fired = date_fired.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], recurring = recurring.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], trigger_by = trigger_by.asInstanceOf[js.Any], trigger_value = trigger_value.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], usage_category = usage_category.asInstanceOf[js.Any], usage_record_uri = usage_record_uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerPayload]
    }
    
    extension [Self <: TriggerPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.daily
    - typings.twilio.twilioStrings.monthly
    - typings.twilio.twilioStrings.yearly
    - typings.twilio.twilioStrings.alltime
  */
  trait TriggerRecurring extends StObject
  object TriggerRecurring {
    
    inline def alltime: typings.twilio.twilioStrings.alltime = "alltime".asInstanceOf[typings.twilio.twilioStrings.alltime]
    
    inline def daily: typings.twilio.twilioStrings.daily = "daily".asInstanceOf[typings.twilio.twilioStrings.daily]
    
    inline def monthly: typings.twilio.twilioStrings.monthly = "monthly".asInstanceOf[typings.twilio.twilioStrings.monthly]
    
    inline def yearly: typings.twilio.twilioStrings.yearly = "yearly".asInstanceOf[typings.twilio.twilioStrings.yearly]
  }
  
  trait TriggerResource extends StObject {
    
    var account_sid: String
    
    var api_version: String
    
    var callback_method: String
    
    var callback_url: String
    
    var current_value: String
    
    var date_created: js.Date
    
    var date_fired: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var recurring: TriggerRecurring
    
    var sid: String
    
    var trigger_by: TriggerTriggerField
    
    var trigger_value: String
    
    var uri: String
    
    var usage_category: TriggerUsageCategory
    
    var usage_record_uri: String
  }
  object TriggerResource {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      callback_method: String,
      callback_url: String,
      current_value: String,
      date_created: js.Date,
      date_fired: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      recurring: TriggerRecurring,
      sid: String,
      trigger_by: TriggerTriggerField,
      trigger_value: String,
      uri: String,
      usage_category: TriggerUsageCategory,
      usage_record_uri: String
    ): TriggerResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], callback_method = callback_method.asInstanceOf[js.Any], callback_url = callback_url.asInstanceOf[js.Any], current_value = current_value.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_fired = date_fired.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], recurring = recurring.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], trigger_by = trigger_by.asInstanceOf[js.Any], trigger_value = trigger_value.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], usage_category = usage_category.asInstanceOf[js.Any], usage_record_uri = usage_record_uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerResource]
    }
    
    extension [Self <: TriggerResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setCallback_method(value: String): Self = StObject.set(x, "callback_method", value.asInstanceOf[js.Any])
      
      inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
      
      inline def setCurrent_value(value: String): Self = StObject.set(x, "current_value", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_fired(value: js.Date): Self = StObject.set(x, "date_fired", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setRecurring(value: TriggerRecurring): Self = StObject.set(x, "recurring", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTrigger_by(value: TriggerTriggerField): Self = StObject.set(x, "trigger_by", value.asInstanceOf[js.Any])
      
      inline def setTrigger_value(value: String): Self = StObject.set(x, "trigger_value", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUsage_category(value: TriggerUsageCategory): Self = StObject.set(x, "usage_category", value.asInstanceOf[js.Any])
      
      inline def setUsage_record_uri(value: String): Self = StObject.set(x, "usage_record_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait TriggerSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object TriggerSolution {
    
    inline def apply(): TriggerSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriggerSolution]
    }
    
    extension [Self <: TriggerSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.count
    - typings.twilio.twilioStrings.usage
    - typings.twilio.twilioStrings.price
  */
  trait TriggerTriggerField extends StObject
  object TriggerTriggerField {
    
    inline def count: typings.twilio.twilioStrings.count = "count".asInstanceOf[typings.twilio.twilioStrings.count]
    
    inline def price: typings.twilio.twilioStrings.price = "price".asInstanceOf[typings.twilio.twilioStrings.price]
    
    inline def usage: typings.twilio.twilioStrings.usage = "usage".asInstanceOf[typings.twilio.twilioStrings.usage]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`a2p-registration-fees`
    - typings.twilio.twilioStrings.`agent-conference`
    - typings.twilio.twilioStrings.`amazon-polly`
    - typings.twilio.twilioStrings.`answering-machine-detection`
    - typings.twilio.twilioStrings.`authy-authentications`
    - typings.twilio.twilioStrings.`authy-calls-outbound`
    - typings.twilio.twilioStrings.`authy-monthly-fees`
    - typings.twilio.twilioStrings.`authy-phone-intelligence`
    - typings.twilio.twilioStrings.`authy-phone-verifications`
    - typings.twilio.twilioStrings.`authy-sms-outbound`
    - typings.twilio.twilioStrings.`call-progess-events`
    - typings.twilio.twilioStrings.calleridlookups
    - typings.twilio.twilioStrings.calls
    - typings.twilio.twilioStrings.`calls-client`
    - typings.twilio.twilioStrings.`calls-globalconference`
    - typings.twilio.twilioStrings.`calls-inbound`
    - typings.twilio.twilioStrings.`calls-inbound-local`
    - typings.twilio.twilioStrings.`calls-inbound-mobile`
    - typings.twilio.twilioStrings.`calls-inbound-tollfree`
    - typings.twilio.twilioStrings.`calls-outbound`
    - typings.twilio.twilioStrings.`calls-pay-verb-transactions`
    - typings.twilio.twilioStrings.`calls-recordings`
    - typings.twilio.twilioStrings.`calls-sip`
    - typings.twilio.twilioStrings.`calls-sip-inbound`
    - typings.twilio.twilioStrings.`calls-sip-outbound`
    - typings.twilio.twilioStrings.`calls-transfers`
    - typings.twilio.twilioStrings.`carrier-lookups`
    - typings.twilio.twilioStrings.conversations
    - typings.twilio.twilioStrings.`conversations-api-requests`
    - typings.twilio.twilioStrings.`conversations-conversation-events`
    - typings.twilio.twilioStrings.`conversations-endpoint-connectivity`
    - typings.twilio.twilioStrings.`conversations-events`
    - typings.twilio.twilioStrings.`conversations-participant-events`
    - typings.twilio.twilioStrings.`conversations-participants`
    - typings.twilio.twilioStrings.cps
    - typings.twilio.twilioStrings.`flex-usage`
    - typings.twilio.twilioStrings.`fraud-lookups`
    - typings.twilio.twilioStrings.`group-rooms`
    - typings.twilio.twilioStrings.`group-rooms-data-track`
    - typings.twilio.twilioStrings.`group-rooms-encrypted-media-recorded`
    - typings.twilio.twilioStrings.`group-rooms-media-downloaded`
    - typings.twilio.twilioStrings.`group-rooms-media-recorded`
    - typings.twilio.twilioStrings.`group-rooms-media-routed`
    - typings.twilio.twilioStrings.`group-rooms-media-stored`
    - typings.twilio.twilioStrings.`group-rooms-participant-minutes`
    - typings.twilio.twilioStrings.`group-rooms-recorded-minutes`
    - typings.twilio.twilioStrings.`imp-v1-usage`
    - typings.twilio.twilioStrings.lookups
    - typings.twilio.twilioStrings.marketplace
    - typings.twilio.twilioStrings.`marketplace-algorithmia-named-entity-recognition`
    - typings.twilio.twilioStrings.`marketplace-cadence-transcription`
    - typings.twilio.twilioStrings.`marketplace-cadence-translation`
    - typings.twilio.twilioStrings.`marketplace-capio-speech-to-text`
    - typings.twilio.twilioStrings.`marketplace-convriza-ababa`
    - typings.twilio.twilioStrings.`marketplace-deepgram-phrase-detector`
    - typings.twilio.twilioStrings.`marketplace-digital-segment-business-info`
    - typings.twilio.twilioStrings.`marketplace-facebook-offline-conversions`
    - typings.twilio.twilioStrings.`marketplace-google-speech-to-text`
    - typings.twilio.twilioStrings.`marketplace-ibm-watson-message-insights`
    - typings.twilio.twilioStrings.`marketplace-ibm-watson-message-sentiment`
    - typings.twilio.twilioStrings.`marketplace-ibm-watson-recording-analysis`
    - typings.twilio.twilioStrings.`marketplace-ibm-watson-tone-analyzer`
    - typings.twilio.twilioStrings.`marketplace-icehook-systems-scout`
    - typings.twilio.twilioStrings.`marketplace-infogroup-dataaxle-bizinfo`
    - typings.twilio.twilioStrings.`marketplace-keen-io-contact-center-analytics`
    - typings.twilio.twilioStrings.`marketplace-marchex-cleancall`
    - typings.twilio.twilioStrings.`marketplace-marchex-sentiment-analysis-for-sms`
    - typings.twilio.twilioStrings.`marketplace-marketplace-nextcaller-social-id`
    - typings.twilio.twilioStrings.`marketplace-mobile-commons-opt-out-classifier`
    - typings.twilio.twilioStrings.`marketplace-nexiwave-voicemail-to-text`
    - typings.twilio.twilioStrings.`marketplace-nextcaller-advanced-caller-identification`
    - typings.twilio.twilioStrings.`marketplace-nomorobo-spam-score`
    - typings.twilio.twilioStrings.`marketplace-payfone-tcpa-compliance`
    - typings.twilio.twilioStrings.`marketplace-remeeting-automatic-speech-recognition`
    - typings.twilio.twilioStrings.`marketplace-tcpa-defense-solutions-blacklist-feed`
    - typings.twilio.twilioStrings.`marketplace-telo-opencnam`
    - typings.twilio.twilioStrings.`marketplace-truecnam-true-spam`
    - typings.twilio.twilioStrings.`marketplace-twilio-caller-name-lookup-us`
    - typings.twilio.twilioStrings.`marketplace-twilio-carrier-information-lookup`
    - typings.twilio.twilioStrings.`marketplace-voicebase-pci`
    - typings.twilio.twilioStrings.`marketplace-voicebase-transcription`
    - typings.twilio.twilioStrings.`marketplace-voicebase-transcription-custom-vocabulary`
    - typings.twilio.twilioStrings.`marketplace-whitepages-pro-caller-identification`
    - typings.twilio.twilioStrings.`marketplace-whitepages-pro-phone-intelligence`
    - typings.twilio.twilioStrings.`marketplace-whitepages-pro-phone-reputation`
    - typings.twilio.twilioStrings.`marketplace-wolfarm-spoken-results`
    - typings.twilio.twilioStrings.`marketplace-wolfram-short-answer`
    - typings.twilio.twilioStrings.`marketplace-ytica-contact-center-reporting-analytics`
    - typings.twilio.twilioStrings.mediastorage
    - typings.twilio.twilioStrings.mms
    - typings.twilio.twilioStrings.`mms-inbound`
    - typings.twilio.twilioStrings.`mms-inbound-longcode`
    - typings.twilio.twilioStrings.`mms-inbound-shortcode`
    - typings.twilio.twilioStrings.`mms-messages-carrierfees`
    - typings.twilio.twilioStrings.`mms-outbound`
    - typings.twilio.twilioStrings.`mms-outbound-longcode`
    - typings.twilio.twilioStrings.`mms-outbound-shortcode`
    - typings.twilio.twilioStrings.`monitor-reads`
    - typings.twilio.twilioStrings.`monitor-storage`
    - typings.twilio.twilioStrings.`monitor-writes`
    - typings.twilio.twilioStrings.notify
    - typings.twilio.twilioStrings.`notify-actions-attempts`
    - typings.twilio.twilioStrings.`notify-channels`
    - typings.twilio.twilioStrings.`number-format-lookups`
    - typings.twilio.twilioStrings.pchat
    - typings.twilio.twilioStrings.`pchat-users`
    - typings.twilio.twilioStrings.`peer-to-peer-rooms-participant-minutes`
    - typings.twilio.twilioStrings.pfax
    - typings.twilio.twilioStrings.`pfax-minutes`
    - typings.twilio.twilioStrings.`pfax-minutes-inbound`
    - typings.twilio.twilioStrings.`pfax-minutes-outbound`
    - typings.twilio.twilioStrings.`pfax-pages`
    - typings.twilio.twilioStrings.phonenumbers
    - typings.twilio.twilioStrings.`phonenumbers-cps`
    - typings.twilio.twilioStrings.`phonenumbers-emergency`
    - typings.twilio.twilioStrings.`phonenumbers-local`
    - typings.twilio.twilioStrings.`phonenumbers-mobile`
    - typings.twilio.twilioStrings.`phonenumbers-setups`
    - typings.twilio.twilioStrings.`phonenumbers-tollfree`
    - typings.twilio.twilioStrings.premiumsupport
    - typings.twilio.twilioStrings.proxy
    - typings.twilio.twilioStrings.`proxy-active-sessions`
    - typings.twilio.twilioStrings.pstnconnectivity
    - typings.twilio.twilioStrings.pv
    - typings.twilio.twilioStrings.`pv-composition-media-downloaded`
    - typings.twilio.twilioStrings.`pv-composition-media-encrypted`
    - typings.twilio.twilioStrings.`pv-composition-media-stored`
    - typings.twilio.twilioStrings.`pv-composition-minutes`
    - typings.twilio.twilioStrings.`pv-recording-compositions`
    - typings.twilio.twilioStrings.`pv-room-participants`
    - typings.twilio.twilioStrings.`pv-room-participants-au1`
    - typings.twilio.twilioStrings.`pv-room-participants-br1`
    - typings.twilio.twilioStrings.`pv-room-participants-ie1`
    - typings.twilio.twilioStrings.`pv-room-participants-jp1`
    - typings.twilio.twilioStrings.`pv-room-participants-sg1`
    - typings.twilio.twilioStrings.`pv-room-participants-us1`
    - typings.twilio.twilioStrings.`pv-room-participants-us2`
    - typings.twilio.twilioStrings.`pv-rooms`
    - typings.twilio.twilioStrings.`pv-sip-endpoint-registrations`
    - typings.twilio.twilioStrings.recordings
    - typings.twilio.twilioStrings.recordingstorage
    - typings.twilio.twilioStrings.`rooms-group-bandwidth`
    - typings.twilio.twilioStrings.`rooms-group-minutes`
    - typings.twilio.twilioStrings.`rooms-peer-to-peer-minutes`
    - typings.twilio.twilioStrings.shortcodes
    - typings.twilio.twilioStrings.`shortcodes-customerowned`
    - typings.twilio.twilioStrings.`shortcodes-mms-enablement`
    - typings.twilio.twilioStrings.`shortcodes-mps`
    - typings.twilio.twilioStrings.`shortcodes-random`
    - typings.twilio.twilioStrings.`shortcodes-uk`
    - typings.twilio.twilioStrings.`shortcodes-vanity`
    - typings.twilio.twilioStrings.`small-group-rooms`
    - typings.twilio.twilioStrings.`small-group-rooms-data-track`
    - typings.twilio.twilioStrings.`small-group-rooms-participant-minutes`
    - typings.twilio.twilioStrings.sms
    - typings.twilio.twilioStrings.`sms-inbound`
    - typings.twilio.twilioStrings.`sms-inbound-longcode`
    - typings.twilio.twilioStrings.`sms-inbound-shortcode`
    - typings.twilio.twilioStrings.`sms-messages-carrierfees`
    - typings.twilio.twilioStrings.`sms-messages-features`
    - typings.twilio.twilioStrings.`sms-messages-features-senderid`
    - typings.twilio.twilioStrings.`sms-outbound`
    - typings.twilio.twilioStrings.`sms-outbound-content-inspection`
    - typings.twilio.twilioStrings.`sms-outbound-longcode`
    - typings.twilio.twilioStrings.`sms-outbound-shortcode`
    - typings.twilio.twilioStrings.`speech-recognition`
    - typings.twilio.twilioStrings.`studio-engagements`
    - typings.twilio.twilioStrings.sync
    - typings.twilio.twilioStrings.`sync-actions`
    - typings.twilio.twilioStrings.`sync-endpoint-hours`
    - typings.twilio.twilioStrings.`sync-endpoint-hours-above-daily-cap`
    - typings.twilio.twilioStrings.`taskrouter-tasks`
    - typings.twilio.twilioStrings.totalprice
    - typings.twilio.twilioStrings.transcriptions
    - typings.twilio.twilioStrings.`trunking-cps`
    - typings.twilio.twilioStrings.`trunking-emergency-calls`
    - typings.twilio.twilioStrings.`trunking-origination`
    - typings.twilio.twilioStrings.`trunking-origination-local`
    - typings.twilio.twilioStrings.`trunking-origination-mobile`
    - typings.twilio.twilioStrings.`trunking-origination-tollfree`
    - typings.twilio.twilioStrings.`trunking-recordings`
    - typings.twilio.twilioStrings.`trunking-secure`
    - typings.twilio.twilioStrings.`trunking-termination`
    - typings.twilio.twilioStrings.turnmegabytes
    - typings.twilio.twilioStrings.`turnmegabytes-australia`
    - typings.twilio.twilioStrings.`turnmegabytes-brasil`
    - typings.twilio.twilioStrings.`turnmegabytes-germany`
    - typings.twilio.twilioStrings.`turnmegabytes-india`
    - typings.twilio.twilioStrings.`turnmegabytes-ireland`
    - typings.twilio.twilioStrings.`turnmegabytes-japan`
    - typings.twilio.twilioStrings.`turnmegabytes-singapore`
    - typings.twilio.twilioStrings.`turnmegabytes-useast`
    - typings.twilio.twilioStrings.`turnmegabytes-uswest`
    - typings.twilio.twilioStrings.`twilio-interconnect`
    - typings.twilio.twilioStrings.`verify-push`
    - typings.twilio.twilioStrings.`verify-totp`
    - typings.twilio.twilioStrings.`verify-whatsapp-conversations-business-initiated`
    - typings.twilio.twilioStrings.`video-recordings`
    - typings.twilio.twilioStrings.`voice-insights`
    - typings.twilio.twilioStrings.`voice-insights-client-insights-on-demand-minute`
    - typings.twilio.twilioStrings.`voice-insights-ptsn-insights-on-demand-minute`
    - typings.twilio.twilioStrings.`voice-insights-sip-interface-insights-on-demand-minute`
    - typings.twilio.twilioStrings.`voice-insights-sip-trunking-insights-on-demand-minute`
    - typings.twilio.twilioStrings.wireless
    - typings.twilio.twilioStrings.`wireless-orders`
    - typings.twilio.twilioStrings.`wireless-orders-artwork`
    - typings.twilio.twilioStrings.`wireless-orders-bulk`
    - typings.twilio.twilioStrings.`wireless-orders-esim`
    - typings.twilio.twilioStrings.`wireless-orders-starter`
    - typings.twilio.twilioStrings.`wireless-usage`
    - typings.twilio.twilioStrings.`wireless-usage-commands`
    - typings.twilio.twilioStrings.`wireless-usage-commands-africa`
    - typings.twilio.twilioStrings.`wireless-usage-commands-asia`
    - typings.twilio.twilioStrings.`wireless-usage-commands-centralandsouthamerica`
    - typings.twilio.twilioStrings.`wireless-usage-commands-europe`
    - typings.twilio.twilioStrings.`wireless-usage-commands-home`
    - typings.twilio.twilioStrings.`wireless-usage-commands-northamerica`
    - typings.twilio.twilioStrings.`wireless-usage-commands-oceania`
    - typings.twilio.twilioStrings.`wireless-usage-commands-roaming`
    - typings.twilio.twilioStrings.`wireless-usage-data`
    - typings.twilio.twilioStrings.`wireless-usage-data-africa`
    - typings.twilio.twilioStrings.`wireless-usage-data-asia`
    - typings.twilio.twilioStrings.`wireless-usage-data-centralandsouthamerica`
    - typings.twilio.twilioStrings.`wireless-usage-data-custom-additionalmb`
    - typings.twilio.twilioStrings.`wireless-usage-data-custom-first5mb`
    - typings.twilio.twilioStrings.`wireless-usage-data-domestic-roaming`
    - typings.twilio.twilioStrings.`wireless-usage-data-europe`
    - typings.twilio.twilioStrings.`wireless-usage-data-individual-additionalgb`
    - typings.twilio.twilioStrings.`wireless-usage-data-individual-firstgb`
    - typings.twilio.twilioStrings.`wireless-usage-data-international-roaming-canada`
    - typings.twilio.twilioStrings.`wireless-usage-data-international-roaming-india`
    - typings.twilio.twilioStrings.`wireless-usage-data-international-roaming-mexico`
    - typings.twilio.twilioStrings.`wireless-usage-data-northamerica`
    - typings.twilio.twilioStrings.`wireless-usage-data-oceania`
    - typings.twilio.twilioStrings.`wireless-usage-data-pooled`
    - typings.twilio.twilioStrings.`wireless-usage-data-pooled-downlink`
    - typings.twilio.twilioStrings.`wireless-usage-data-pooled-uplink`
    - typings.twilio.twilioStrings.`wireless-usage-mrc`
    - typings.twilio.twilioStrings.`wireless-usage-mrc-custom`
    - typings.twilio.twilioStrings.`wireless-usage-mrc-individual`
    - typings.twilio.twilioStrings.`wireless-usage-mrc-pooled`
    - typings.twilio.twilioStrings.`wireless-usage-mrc-suspended`
    - typings.twilio.twilioStrings.`wireless-usage-sms`
    - typings.twilio.twilioStrings.`wireless-usage-voice`
  */
  trait TriggerUsageCategory extends StObject
  object TriggerUsageCategory {
    
    inline def `a2p-registration-fees`: typings.twilio.twilioStrings.`a2p-registration-fees` = "a2p-registration-fees".asInstanceOf[typings.twilio.twilioStrings.`a2p-registration-fees`]
    
    inline def `agent-conference`: typings.twilio.twilioStrings.`agent-conference` = "agent-conference".asInstanceOf[typings.twilio.twilioStrings.`agent-conference`]
    
    inline def `amazon-polly`: typings.twilio.twilioStrings.`amazon-polly` = "amazon-polly".asInstanceOf[typings.twilio.twilioStrings.`amazon-polly`]
    
    inline def `answering-machine-detection`: typings.twilio.twilioStrings.`answering-machine-detection` = "answering-machine-detection".asInstanceOf[typings.twilio.twilioStrings.`answering-machine-detection`]
    
    inline def `authy-authentications`: typings.twilio.twilioStrings.`authy-authentications` = "authy-authentications".asInstanceOf[typings.twilio.twilioStrings.`authy-authentications`]
    
    inline def `authy-calls-outbound`: typings.twilio.twilioStrings.`authy-calls-outbound` = "authy-calls-outbound".asInstanceOf[typings.twilio.twilioStrings.`authy-calls-outbound`]
    
    inline def `authy-monthly-fees`: typings.twilio.twilioStrings.`authy-monthly-fees` = "authy-monthly-fees".asInstanceOf[typings.twilio.twilioStrings.`authy-monthly-fees`]
    
    inline def `authy-phone-intelligence`: typings.twilio.twilioStrings.`authy-phone-intelligence` = "authy-phone-intelligence".asInstanceOf[typings.twilio.twilioStrings.`authy-phone-intelligence`]
    
    inline def `authy-phone-verifications`: typings.twilio.twilioStrings.`authy-phone-verifications` = "authy-phone-verifications".asInstanceOf[typings.twilio.twilioStrings.`authy-phone-verifications`]
    
    inline def `authy-sms-outbound`: typings.twilio.twilioStrings.`authy-sms-outbound` = "authy-sms-outbound".asInstanceOf[typings.twilio.twilioStrings.`authy-sms-outbound`]
    
    inline def `call-progess-events`: typings.twilio.twilioStrings.`call-progess-events` = "call-progess-events".asInstanceOf[typings.twilio.twilioStrings.`call-progess-events`]
    
    inline def calleridlookups: typings.twilio.twilioStrings.calleridlookups = "calleridlookups".asInstanceOf[typings.twilio.twilioStrings.calleridlookups]
    
    inline def calls: typings.twilio.twilioStrings.calls = "calls".asInstanceOf[typings.twilio.twilioStrings.calls]
    
    inline def `calls-client`: typings.twilio.twilioStrings.`calls-client` = "calls-client".asInstanceOf[typings.twilio.twilioStrings.`calls-client`]
    
    inline def `calls-globalconference`: typings.twilio.twilioStrings.`calls-globalconference` = "calls-globalconference".asInstanceOf[typings.twilio.twilioStrings.`calls-globalconference`]
    
    inline def `calls-inbound`: typings.twilio.twilioStrings.`calls-inbound` = "calls-inbound".asInstanceOf[typings.twilio.twilioStrings.`calls-inbound`]
    
    inline def `calls-inbound-local`: typings.twilio.twilioStrings.`calls-inbound-local` = "calls-inbound-local".asInstanceOf[typings.twilio.twilioStrings.`calls-inbound-local`]
    
    inline def `calls-inbound-mobile`: typings.twilio.twilioStrings.`calls-inbound-mobile` = "calls-inbound-mobile".asInstanceOf[typings.twilio.twilioStrings.`calls-inbound-mobile`]
    
    inline def `calls-inbound-tollfree`: typings.twilio.twilioStrings.`calls-inbound-tollfree` = "calls-inbound-tollfree".asInstanceOf[typings.twilio.twilioStrings.`calls-inbound-tollfree`]
    
    inline def `calls-outbound`: typings.twilio.twilioStrings.`calls-outbound` = "calls-outbound".asInstanceOf[typings.twilio.twilioStrings.`calls-outbound`]
    
    inline def `calls-pay-verb-transactions`: typings.twilio.twilioStrings.`calls-pay-verb-transactions` = "calls-pay-verb-transactions".asInstanceOf[typings.twilio.twilioStrings.`calls-pay-verb-transactions`]
    
    inline def `calls-recordings`: typings.twilio.twilioStrings.`calls-recordings` = "calls-recordings".asInstanceOf[typings.twilio.twilioStrings.`calls-recordings`]
    
    inline def `calls-sip`: typings.twilio.twilioStrings.`calls-sip` = "calls-sip".asInstanceOf[typings.twilio.twilioStrings.`calls-sip`]
    
    inline def `calls-sip-inbound`: typings.twilio.twilioStrings.`calls-sip-inbound` = "calls-sip-inbound".asInstanceOf[typings.twilio.twilioStrings.`calls-sip-inbound`]
    
    inline def `calls-sip-outbound`: typings.twilio.twilioStrings.`calls-sip-outbound` = "calls-sip-outbound".asInstanceOf[typings.twilio.twilioStrings.`calls-sip-outbound`]
    
    inline def `calls-transfers`: typings.twilio.twilioStrings.`calls-transfers` = "calls-transfers".asInstanceOf[typings.twilio.twilioStrings.`calls-transfers`]
    
    inline def `carrier-lookups`: typings.twilio.twilioStrings.`carrier-lookups` = "carrier-lookups".asInstanceOf[typings.twilio.twilioStrings.`carrier-lookups`]
    
    inline def conversations: typings.twilio.twilioStrings.conversations = "conversations".asInstanceOf[typings.twilio.twilioStrings.conversations]
    
    inline def `conversations-api-requests`: typings.twilio.twilioStrings.`conversations-api-requests` = "conversations-api-requests".asInstanceOf[typings.twilio.twilioStrings.`conversations-api-requests`]
    
    inline def `conversations-conversation-events`: typings.twilio.twilioStrings.`conversations-conversation-events` = "conversations-conversation-events".asInstanceOf[typings.twilio.twilioStrings.`conversations-conversation-events`]
    
    inline def `conversations-endpoint-connectivity`: typings.twilio.twilioStrings.`conversations-endpoint-connectivity` = "conversations-endpoint-connectivity".asInstanceOf[typings.twilio.twilioStrings.`conversations-endpoint-connectivity`]
    
    inline def `conversations-events`: typings.twilio.twilioStrings.`conversations-events` = "conversations-events".asInstanceOf[typings.twilio.twilioStrings.`conversations-events`]
    
    inline def `conversations-participant-events`: typings.twilio.twilioStrings.`conversations-participant-events` = "conversations-participant-events".asInstanceOf[typings.twilio.twilioStrings.`conversations-participant-events`]
    
    inline def `conversations-participants`: typings.twilio.twilioStrings.`conversations-participants` = "conversations-participants".asInstanceOf[typings.twilio.twilioStrings.`conversations-participants`]
    
    inline def cps: typings.twilio.twilioStrings.cps = "cps".asInstanceOf[typings.twilio.twilioStrings.cps]
    
    inline def `flex-usage`: typings.twilio.twilioStrings.`flex-usage` = "flex-usage".asInstanceOf[typings.twilio.twilioStrings.`flex-usage`]
    
    inline def `fraud-lookups`: typings.twilio.twilioStrings.`fraud-lookups` = "fraud-lookups".asInstanceOf[typings.twilio.twilioStrings.`fraud-lookups`]
    
    inline def `group-rooms`: typings.twilio.twilioStrings.`group-rooms` = "group-rooms".asInstanceOf[typings.twilio.twilioStrings.`group-rooms`]
    
    inline def `group-rooms-data-track`: typings.twilio.twilioStrings.`group-rooms-data-track` = "group-rooms-data-track".asInstanceOf[typings.twilio.twilioStrings.`group-rooms-data-track`]
    
    inline def `group-rooms-encrypted-media-recorded`: typings.twilio.twilioStrings.`group-rooms-encrypted-media-recorded` = "group-rooms-encrypted-media-recorded".asInstanceOf[typings.twilio.twilioStrings.`group-rooms-encrypted-media-recorded`]
    
    inline def `group-rooms-media-downloaded`: typings.twilio.twilioStrings.`group-rooms-media-downloaded` = "group-rooms-media-downloaded".asInstanceOf[typings.twilio.twilioStrings.`group-rooms-media-downloaded`]
    
    inline def `group-rooms-media-recorded`: typings.twilio.twilioStrings.`group-rooms-media-recorded` = "group-rooms-media-recorded".asInstanceOf[typings.twilio.twilioStrings.`group-rooms-media-recorded`]
    
    inline def `group-rooms-media-routed`: typings.twilio.twilioStrings.`group-rooms-media-routed` = "group-rooms-media-routed".asInstanceOf[typings.twilio.twilioStrings.`group-rooms-media-routed`]
    
    inline def `group-rooms-media-stored`: typings.twilio.twilioStrings.`group-rooms-media-stored` = "group-rooms-media-stored".asInstanceOf[typings.twilio.twilioStrings.`group-rooms-media-stored`]
    
    inline def `group-rooms-participant-minutes`: typings.twilio.twilioStrings.`group-rooms-participant-minutes` = "group-rooms-participant-minutes".asInstanceOf[typings.twilio.twilioStrings.`group-rooms-participant-minutes`]
    
    inline def `group-rooms-recorded-minutes`: typings.twilio.twilioStrings.`group-rooms-recorded-minutes` = "group-rooms-recorded-minutes".asInstanceOf[typings.twilio.twilioStrings.`group-rooms-recorded-minutes`]
    
    inline def `imp-v1-usage`: typings.twilio.twilioStrings.`imp-v1-usage` = "imp-v1-usage".asInstanceOf[typings.twilio.twilioStrings.`imp-v1-usage`]
    
    inline def lookups: typings.twilio.twilioStrings.lookups = "lookups".asInstanceOf[typings.twilio.twilioStrings.lookups]
    
    inline def marketplace: typings.twilio.twilioStrings.marketplace = "marketplace".asInstanceOf[typings.twilio.twilioStrings.marketplace]
    
    inline def `marketplace-algorithmia-named-entity-recognition`: typings.twilio.twilioStrings.`marketplace-algorithmia-named-entity-recognition` = "marketplace-algorithmia-named-entity-recognition".asInstanceOf[typings.twilio.twilioStrings.`marketplace-algorithmia-named-entity-recognition`]
    
    inline def `marketplace-cadence-transcription`: typings.twilio.twilioStrings.`marketplace-cadence-transcription` = "marketplace-cadence-transcription".asInstanceOf[typings.twilio.twilioStrings.`marketplace-cadence-transcription`]
    
    inline def `marketplace-cadence-translation`: typings.twilio.twilioStrings.`marketplace-cadence-translation` = "marketplace-cadence-translation".asInstanceOf[typings.twilio.twilioStrings.`marketplace-cadence-translation`]
    
    inline def `marketplace-capio-speech-to-text`: typings.twilio.twilioStrings.`marketplace-capio-speech-to-text` = "marketplace-capio-speech-to-text".asInstanceOf[typings.twilio.twilioStrings.`marketplace-capio-speech-to-text`]
    
    inline def `marketplace-convriza-ababa`: typings.twilio.twilioStrings.`marketplace-convriza-ababa` = "marketplace-convriza-ababa".asInstanceOf[typings.twilio.twilioStrings.`marketplace-convriza-ababa`]
    
    inline def `marketplace-deepgram-phrase-detector`: typings.twilio.twilioStrings.`marketplace-deepgram-phrase-detector` = "marketplace-deepgram-phrase-detector".asInstanceOf[typings.twilio.twilioStrings.`marketplace-deepgram-phrase-detector`]
    
    inline def `marketplace-digital-segment-business-info`: typings.twilio.twilioStrings.`marketplace-digital-segment-business-info` = "marketplace-digital-segment-business-info".asInstanceOf[typings.twilio.twilioStrings.`marketplace-digital-segment-business-info`]
    
    inline def `marketplace-facebook-offline-conversions`: typings.twilio.twilioStrings.`marketplace-facebook-offline-conversions` = "marketplace-facebook-offline-conversions".asInstanceOf[typings.twilio.twilioStrings.`marketplace-facebook-offline-conversions`]
    
    inline def `marketplace-google-speech-to-text`: typings.twilio.twilioStrings.`marketplace-google-speech-to-text` = "marketplace-google-speech-to-text".asInstanceOf[typings.twilio.twilioStrings.`marketplace-google-speech-to-text`]
    
    inline def `marketplace-ibm-watson-message-insights`: typings.twilio.twilioStrings.`marketplace-ibm-watson-message-insights` = "marketplace-ibm-watson-message-insights".asInstanceOf[typings.twilio.twilioStrings.`marketplace-ibm-watson-message-insights`]
    
    inline def `marketplace-ibm-watson-message-sentiment`: typings.twilio.twilioStrings.`marketplace-ibm-watson-message-sentiment` = "marketplace-ibm-watson-message-sentiment".asInstanceOf[typings.twilio.twilioStrings.`marketplace-ibm-watson-message-sentiment`]
    
    inline def `marketplace-ibm-watson-recording-analysis`: typings.twilio.twilioStrings.`marketplace-ibm-watson-recording-analysis` = "marketplace-ibm-watson-recording-analysis".asInstanceOf[typings.twilio.twilioStrings.`marketplace-ibm-watson-recording-analysis`]
    
    inline def `marketplace-ibm-watson-tone-analyzer`: typings.twilio.twilioStrings.`marketplace-ibm-watson-tone-analyzer` = "marketplace-ibm-watson-tone-analyzer".asInstanceOf[typings.twilio.twilioStrings.`marketplace-ibm-watson-tone-analyzer`]
    
    inline def `marketplace-icehook-systems-scout`: typings.twilio.twilioStrings.`marketplace-icehook-systems-scout` = "marketplace-icehook-systems-scout".asInstanceOf[typings.twilio.twilioStrings.`marketplace-icehook-systems-scout`]
    
    inline def `marketplace-infogroup-dataaxle-bizinfo`: typings.twilio.twilioStrings.`marketplace-infogroup-dataaxle-bizinfo` = "marketplace-infogroup-dataaxle-bizinfo".asInstanceOf[typings.twilio.twilioStrings.`marketplace-infogroup-dataaxle-bizinfo`]
    
    inline def `marketplace-keen-io-contact-center-analytics`: typings.twilio.twilioStrings.`marketplace-keen-io-contact-center-analytics` = "marketplace-keen-io-contact-center-analytics".asInstanceOf[typings.twilio.twilioStrings.`marketplace-keen-io-contact-center-analytics`]
    
    inline def `marketplace-marchex-cleancall`: typings.twilio.twilioStrings.`marketplace-marchex-cleancall` = "marketplace-marchex-cleancall".asInstanceOf[typings.twilio.twilioStrings.`marketplace-marchex-cleancall`]
    
    inline def `marketplace-marchex-sentiment-analysis-for-sms`: typings.twilio.twilioStrings.`marketplace-marchex-sentiment-analysis-for-sms` = "marketplace-marchex-sentiment-analysis-for-sms".asInstanceOf[typings.twilio.twilioStrings.`marketplace-marchex-sentiment-analysis-for-sms`]
    
    inline def `marketplace-marketplace-nextcaller-social-id`: typings.twilio.twilioStrings.`marketplace-marketplace-nextcaller-social-id` = "marketplace-marketplace-nextcaller-social-id".asInstanceOf[typings.twilio.twilioStrings.`marketplace-marketplace-nextcaller-social-id`]
    
    inline def `marketplace-mobile-commons-opt-out-classifier`: typings.twilio.twilioStrings.`marketplace-mobile-commons-opt-out-classifier` = "marketplace-mobile-commons-opt-out-classifier".asInstanceOf[typings.twilio.twilioStrings.`marketplace-mobile-commons-opt-out-classifier`]
    
    inline def `marketplace-nexiwave-voicemail-to-text`: typings.twilio.twilioStrings.`marketplace-nexiwave-voicemail-to-text` = "marketplace-nexiwave-voicemail-to-text".asInstanceOf[typings.twilio.twilioStrings.`marketplace-nexiwave-voicemail-to-text`]
    
    inline def `marketplace-nextcaller-advanced-caller-identification`: typings.twilio.twilioStrings.`marketplace-nextcaller-advanced-caller-identification` = "marketplace-nextcaller-advanced-caller-identification".asInstanceOf[typings.twilio.twilioStrings.`marketplace-nextcaller-advanced-caller-identification`]
    
    inline def `marketplace-nomorobo-spam-score`: typings.twilio.twilioStrings.`marketplace-nomorobo-spam-score` = "marketplace-nomorobo-spam-score".asInstanceOf[typings.twilio.twilioStrings.`marketplace-nomorobo-spam-score`]
    
    inline def `marketplace-payfone-tcpa-compliance`: typings.twilio.twilioStrings.`marketplace-payfone-tcpa-compliance` = "marketplace-payfone-tcpa-compliance".asInstanceOf[typings.twilio.twilioStrings.`marketplace-payfone-tcpa-compliance`]
    
    inline def `marketplace-remeeting-automatic-speech-recognition`: typings.twilio.twilioStrings.`marketplace-remeeting-automatic-speech-recognition` = "marketplace-remeeting-automatic-speech-recognition".asInstanceOf[typings.twilio.twilioStrings.`marketplace-remeeting-automatic-speech-recognition`]
    
    inline def `marketplace-tcpa-defense-solutions-blacklist-feed`: typings.twilio.twilioStrings.`marketplace-tcpa-defense-solutions-blacklist-feed` = "marketplace-tcpa-defense-solutions-blacklist-feed".asInstanceOf[typings.twilio.twilioStrings.`marketplace-tcpa-defense-solutions-blacklist-feed`]
    
    inline def `marketplace-telo-opencnam`: typings.twilio.twilioStrings.`marketplace-telo-opencnam` = "marketplace-telo-opencnam".asInstanceOf[typings.twilio.twilioStrings.`marketplace-telo-opencnam`]
    
    inline def `marketplace-truecnam-true-spam`: typings.twilio.twilioStrings.`marketplace-truecnam-true-spam` = "marketplace-truecnam-true-spam".asInstanceOf[typings.twilio.twilioStrings.`marketplace-truecnam-true-spam`]
    
    inline def `marketplace-twilio-caller-name-lookup-us`: typings.twilio.twilioStrings.`marketplace-twilio-caller-name-lookup-us` = "marketplace-twilio-caller-name-lookup-us".asInstanceOf[typings.twilio.twilioStrings.`marketplace-twilio-caller-name-lookup-us`]
    
    inline def `marketplace-twilio-carrier-information-lookup`: typings.twilio.twilioStrings.`marketplace-twilio-carrier-information-lookup` = "marketplace-twilio-carrier-information-lookup".asInstanceOf[typings.twilio.twilioStrings.`marketplace-twilio-carrier-information-lookup`]
    
    inline def `marketplace-voicebase-pci`: typings.twilio.twilioStrings.`marketplace-voicebase-pci` = "marketplace-voicebase-pci".asInstanceOf[typings.twilio.twilioStrings.`marketplace-voicebase-pci`]
    
    inline def `marketplace-voicebase-transcription`: typings.twilio.twilioStrings.`marketplace-voicebase-transcription` = "marketplace-voicebase-transcription".asInstanceOf[typings.twilio.twilioStrings.`marketplace-voicebase-transcription`]
    
    inline def `marketplace-voicebase-transcription-custom-vocabulary`: typings.twilio.twilioStrings.`marketplace-voicebase-transcription-custom-vocabulary` = "marketplace-voicebase-transcription-custom-vocabulary".asInstanceOf[typings.twilio.twilioStrings.`marketplace-voicebase-transcription-custom-vocabulary`]
    
    inline def `marketplace-whitepages-pro-caller-identification`: typings.twilio.twilioStrings.`marketplace-whitepages-pro-caller-identification` = "marketplace-whitepages-pro-caller-identification".asInstanceOf[typings.twilio.twilioStrings.`marketplace-whitepages-pro-caller-identification`]
    
    inline def `marketplace-whitepages-pro-phone-intelligence`: typings.twilio.twilioStrings.`marketplace-whitepages-pro-phone-intelligence` = "marketplace-whitepages-pro-phone-intelligence".asInstanceOf[typings.twilio.twilioStrings.`marketplace-whitepages-pro-phone-intelligence`]
    
    inline def `marketplace-whitepages-pro-phone-reputation`: typings.twilio.twilioStrings.`marketplace-whitepages-pro-phone-reputation` = "marketplace-whitepages-pro-phone-reputation".asInstanceOf[typings.twilio.twilioStrings.`marketplace-whitepages-pro-phone-reputation`]
    
    inline def `marketplace-wolfarm-spoken-results`: typings.twilio.twilioStrings.`marketplace-wolfarm-spoken-results` = "marketplace-wolfarm-spoken-results".asInstanceOf[typings.twilio.twilioStrings.`marketplace-wolfarm-spoken-results`]
    
    inline def `marketplace-wolfram-short-answer`: typings.twilio.twilioStrings.`marketplace-wolfram-short-answer` = "marketplace-wolfram-short-answer".asInstanceOf[typings.twilio.twilioStrings.`marketplace-wolfram-short-answer`]
    
    inline def `marketplace-ytica-contact-center-reporting-analytics`: typings.twilio.twilioStrings.`marketplace-ytica-contact-center-reporting-analytics` = "marketplace-ytica-contact-center-reporting-analytics".asInstanceOf[typings.twilio.twilioStrings.`marketplace-ytica-contact-center-reporting-analytics`]
    
    inline def mediastorage: typings.twilio.twilioStrings.mediastorage = "mediastorage".asInstanceOf[typings.twilio.twilioStrings.mediastorage]
    
    inline def mms: typings.twilio.twilioStrings.mms = "mms".asInstanceOf[typings.twilio.twilioStrings.mms]
    
    inline def `mms-inbound`: typings.twilio.twilioStrings.`mms-inbound` = "mms-inbound".asInstanceOf[typings.twilio.twilioStrings.`mms-inbound`]
    
    inline def `mms-inbound-longcode`: typings.twilio.twilioStrings.`mms-inbound-longcode` = "mms-inbound-longcode".asInstanceOf[typings.twilio.twilioStrings.`mms-inbound-longcode`]
    
    inline def `mms-inbound-shortcode`: typings.twilio.twilioStrings.`mms-inbound-shortcode` = "mms-inbound-shortcode".asInstanceOf[typings.twilio.twilioStrings.`mms-inbound-shortcode`]
    
    inline def `mms-messages-carrierfees`: typings.twilio.twilioStrings.`mms-messages-carrierfees` = "mms-messages-carrierfees".asInstanceOf[typings.twilio.twilioStrings.`mms-messages-carrierfees`]
    
    inline def `mms-outbound`: typings.twilio.twilioStrings.`mms-outbound` = "mms-outbound".asInstanceOf[typings.twilio.twilioStrings.`mms-outbound`]
    
    inline def `mms-outbound-longcode`: typings.twilio.twilioStrings.`mms-outbound-longcode` = "mms-outbound-longcode".asInstanceOf[typings.twilio.twilioStrings.`mms-outbound-longcode`]
    
    inline def `mms-outbound-shortcode`: typings.twilio.twilioStrings.`mms-outbound-shortcode` = "mms-outbound-shortcode".asInstanceOf[typings.twilio.twilioStrings.`mms-outbound-shortcode`]
    
    inline def `monitor-reads`: typings.twilio.twilioStrings.`monitor-reads` = "monitor-reads".asInstanceOf[typings.twilio.twilioStrings.`monitor-reads`]
    
    inline def `monitor-storage`: typings.twilio.twilioStrings.`monitor-storage` = "monitor-storage".asInstanceOf[typings.twilio.twilioStrings.`monitor-storage`]
    
    inline def `monitor-writes`: typings.twilio.twilioStrings.`monitor-writes` = "monitor-writes".asInstanceOf[typings.twilio.twilioStrings.`monitor-writes`]
    
    inline def `notify-actions-attempts`: typings.twilio.twilioStrings.`notify-actions-attempts` = "notify-actions-attempts".asInstanceOf[typings.twilio.twilioStrings.`notify-actions-attempts`]
    
    inline def `notify-channels`: typings.twilio.twilioStrings.`notify-channels` = "notify-channels".asInstanceOf[typings.twilio.twilioStrings.`notify-channels`]
    
    inline def `number-format-lookups`: typings.twilio.twilioStrings.`number-format-lookups` = "number-format-lookups".asInstanceOf[typings.twilio.twilioStrings.`number-format-lookups`]
    
    inline def pchat: typings.twilio.twilioStrings.pchat = "pchat".asInstanceOf[typings.twilio.twilioStrings.pchat]
    
    inline def `pchat-users`: typings.twilio.twilioStrings.`pchat-users` = "pchat-users".asInstanceOf[typings.twilio.twilioStrings.`pchat-users`]
    
    inline def `peer-to-peer-rooms-participant-minutes`: typings.twilio.twilioStrings.`peer-to-peer-rooms-participant-minutes` = "peer-to-peer-rooms-participant-minutes".asInstanceOf[typings.twilio.twilioStrings.`peer-to-peer-rooms-participant-minutes`]
    
    inline def pfax: typings.twilio.twilioStrings.pfax = "pfax".asInstanceOf[typings.twilio.twilioStrings.pfax]
    
    inline def `pfax-minutes`: typings.twilio.twilioStrings.`pfax-minutes` = "pfax-minutes".asInstanceOf[typings.twilio.twilioStrings.`pfax-minutes`]
    
    inline def `pfax-minutes-inbound`: typings.twilio.twilioStrings.`pfax-minutes-inbound` = "pfax-minutes-inbound".asInstanceOf[typings.twilio.twilioStrings.`pfax-minutes-inbound`]
    
    inline def `pfax-minutes-outbound`: typings.twilio.twilioStrings.`pfax-minutes-outbound` = "pfax-minutes-outbound".asInstanceOf[typings.twilio.twilioStrings.`pfax-minutes-outbound`]
    
    inline def `pfax-pages`: typings.twilio.twilioStrings.`pfax-pages` = "pfax-pages".asInstanceOf[typings.twilio.twilioStrings.`pfax-pages`]
    
    inline def phonenumbers: typings.twilio.twilioStrings.phonenumbers = "phonenumbers".asInstanceOf[typings.twilio.twilioStrings.phonenumbers]
    
    inline def `phonenumbers-cps`: typings.twilio.twilioStrings.`phonenumbers-cps` = "phonenumbers-cps".asInstanceOf[typings.twilio.twilioStrings.`phonenumbers-cps`]
    
    inline def `phonenumbers-emergency`: typings.twilio.twilioStrings.`phonenumbers-emergency` = "phonenumbers-emergency".asInstanceOf[typings.twilio.twilioStrings.`phonenumbers-emergency`]
    
    inline def `phonenumbers-local`: typings.twilio.twilioStrings.`phonenumbers-local` = "phonenumbers-local".asInstanceOf[typings.twilio.twilioStrings.`phonenumbers-local`]
    
    inline def `phonenumbers-mobile`: typings.twilio.twilioStrings.`phonenumbers-mobile` = "phonenumbers-mobile".asInstanceOf[typings.twilio.twilioStrings.`phonenumbers-mobile`]
    
    inline def `phonenumbers-setups`: typings.twilio.twilioStrings.`phonenumbers-setups` = "phonenumbers-setups".asInstanceOf[typings.twilio.twilioStrings.`phonenumbers-setups`]
    
    inline def `phonenumbers-tollfree`: typings.twilio.twilioStrings.`phonenumbers-tollfree` = "phonenumbers-tollfree".asInstanceOf[typings.twilio.twilioStrings.`phonenumbers-tollfree`]
    
    inline def premiumsupport: typings.twilio.twilioStrings.premiumsupport = "premiumsupport".asInstanceOf[typings.twilio.twilioStrings.premiumsupport]
    
    inline def proxy: typings.twilio.twilioStrings.proxy = "proxy".asInstanceOf[typings.twilio.twilioStrings.proxy]
    
    inline def `proxy-active-sessions`: typings.twilio.twilioStrings.`proxy-active-sessions` = "proxy-active-sessions".asInstanceOf[typings.twilio.twilioStrings.`proxy-active-sessions`]
    
    inline def pstnconnectivity: typings.twilio.twilioStrings.pstnconnectivity = "pstnconnectivity".asInstanceOf[typings.twilio.twilioStrings.pstnconnectivity]
    
    inline def pv: typings.twilio.twilioStrings.pv = "pv".asInstanceOf[typings.twilio.twilioStrings.pv]
    
    inline def `pv-composition-media-downloaded`: typings.twilio.twilioStrings.`pv-composition-media-downloaded` = "pv-composition-media-downloaded".asInstanceOf[typings.twilio.twilioStrings.`pv-composition-media-downloaded`]
    
    inline def `pv-composition-media-encrypted`: typings.twilio.twilioStrings.`pv-composition-media-encrypted` = "pv-composition-media-encrypted".asInstanceOf[typings.twilio.twilioStrings.`pv-composition-media-encrypted`]
    
    inline def `pv-composition-media-stored`: typings.twilio.twilioStrings.`pv-composition-media-stored` = "pv-composition-media-stored".asInstanceOf[typings.twilio.twilioStrings.`pv-composition-media-stored`]
    
    inline def `pv-composition-minutes`: typings.twilio.twilioStrings.`pv-composition-minutes` = "pv-composition-minutes".asInstanceOf[typings.twilio.twilioStrings.`pv-composition-minutes`]
    
    inline def `pv-recording-compositions`: typings.twilio.twilioStrings.`pv-recording-compositions` = "pv-recording-compositions".asInstanceOf[typings.twilio.twilioStrings.`pv-recording-compositions`]
    
    inline def `pv-room-participants`: typings.twilio.twilioStrings.`pv-room-participants` = "pv-room-participants".asInstanceOf[typings.twilio.twilioStrings.`pv-room-participants`]
    
    inline def `pv-room-participants-au1`: typings.twilio.twilioStrings.`pv-room-participants-au1` = "pv-room-participants-au1".asInstanceOf[typings.twilio.twilioStrings.`pv-room-participants-au1`]
    
    inline def `pv-room-participants-br1`: typings.twilio.twilioStrings.`pv-room-participants-br1` = "pv-room-participants-br1".asInstanceOf[typings.twilio.twilioStrings.`pv-room-participants-br1`]
    
    inline def `pv-room-participants-ie1`: typings.twilio.twilioStrings.`pv-room-participants-ie1` = "pv-room-participants-ie1".asInstanceOf[typings.twilio.twilioStrings.`pv-room-participants-ie1`]
    
    inline def `pv-room-participants-jp1`: typings.twilio.twilioStrings.`pv-room-participants-jp1` = "pv-room-participants-jp1".asInstanceOf[typings.twilio.twilioStrings.`pv-room-participants-jp1`]
    
    inline def `pv-room-participants-sg1`: typings.twilio.twilioStrings.`pv-room-participants-sg1` = "pv-room-participants-sg1".asInstanceOf[typings.twilio.twilioStrings.`pv-room-participants-sg1`]
    
    inline def `pv-room-participants-us1`: typings.twilio.twilioStrings.`pv-room-participants-us1` = "pv-room-participants-us1".asInstanceOf[typings.twilio.twilioStrings.`pv-room-participants-us1`]
    
    inline def `pv-room-participants-us2`: typings.twilio.twilioStrings.`pv-room-participants-us2` = "pv-room-participants-us2".asInstanceOf[typings.twilio.twilioStrings.`pv-room-participants-us2`]
    
    inline def `pv-rooms`: typings.twilio.twilioStrings.`pv-rooms` = "pv-rooms".asInstanceOf[typings.twilio.twilioStrings.`pv-rooms`]
    
    inline def `pv-sip-endpoint-registrations`: typings.twilio.twilioStrings.`pv-sip-endpoint-registrations` = "pv-sip-endpoint-registrations".asInstanceOf[typings.twilio.twilioStrings.`pv-sip-endpoint-registrations`]
    
    inline def recordings: typings.twilio.twilioStrings.recordings = "recordings".asInstanceOf[typings.twilio.twilioStrings.recordings]
    
    inline def recordingstorage: typings.twilio.twilioStrings.recordingstorage = "recordingstorage".asInstanceOf[typings.twilio.twilioStrings.recordingstorage]
    
    inline def `rooms-group-bandwidth`: typings.twilio.twilioStrings.`rooms-group-bandwidth` = "rooms-group-bandwidth".asInstanceOf[typings.twilio.twilioStrings.`rooms-group-bandwidth`]
    
    inline def `rooms-group-minutes`: typings.twilio.twilioStrings.`rooms-group-minutes` = "rooms-group-minutes".asInstanceOf[typings.twilio.twilioStrings.`rooms-group-minutes`]
    
    inline def `rooms-peer-to-peer-minutes`: typings.twilio.twilioStrings.`rooms-peer-to-peer-minutes` = "rooms-peer-to-peer-minutes".asInstanceOf[typings.twilio.twilioStrings.`rooms-peer-to-peer-minutes`]
    
    inline def shortcodes: typings.twilio.twilioStrings.shortcodes = "shortcodes".asInstanceOf[typings.twilio.twilioStrings.shortcodes]
    
    inline def `shortcodes-customerowned`: typings.twilio.twilioStrings.`shortcodes-customerowned` = "shortcodes-customerowned".asInstanceOf[typings.twilio.twilioStrings.`shortcodes-customerowned`]
    
    inline def `shortcodes-mms-enablement`: typings.twilio.twilioStrings.`shortcodes-mms-enablement` = "shortcodes-mms-enablement".asInstanceOf[typings.twilio.twilioStrings.`shortcodes-mms-enablement`]
    
    inline def `shortcodes-mps`: typings.twilio.twilioStrings.`shortcodes-mps` = "shortcodes-mps".asInstanceOf[typings.twilio.twilioStrings.`shortcodes-mps`]
    
    inline def `shortcodes-random`: typings.twilio.twilioStrings.`shortcodes-random` = "shortcodes-random".asInstanceOf[typings.twilio.twilioStrings.`shortcodes-random`]
    
    inline def `shortcodes-uk`: typings.twilio.twilioStrings.`shortcodes-uk` = "shortcodes-uk".asInstanceOf[typings.twilio.twilioStrings.`shortcodes-uk`]
    
    inline def `shortcodes-vanity`: typings.twilio.twilioStrings.`shortcodes-vanity` = "shortcodes-vanity".asInstanceOf[typings.twilio.twilioStrings.`shortcodes-vanity`]
    
    inline def `small-group-rooms`: typings.twilio.twilioStrings.`small-group-rooms` = "small-group-rooms".asInstanceOf[typings.twilio.twilioStrings.`small-group-rooms`]
    
    inline def `small-group-rooms-data-track`: typings.twilio.twilioStrings.`small-group-rooms-data-track` = "small-group-rooms-data-track".asInstanceOf[typings.twilio.twilioStrings.`small-group-rooms-data-track`]
    
    inline def `small-group-rooms-participant-minutes`: typings.twilio.twilioStrings.`small-group-rooms-participant-minutes` = "small-group-rooms-participant-minutes".asInstanceOf[typings.twilio.twilioStrings.`small-group-rooms-participant-minutes`]
    
    inline def sms: typings.twilio.twilioStrings.sms = "sms".asInstanceOf[typings.twilio.twilioStrings.sms]
    
    inline def `sms-inbound`: typings.twilio.twilioStrings.`sms-inbound` = "sms-inbound".asInstanceOf[typings.twilio.twilioStrings.`sms-inbound`]
    
    inline def `sms-inbound-longcode`: typings.twilio.twilioStrings.`sms-inbound-longcode` = "sms-inbound-longcode".asInstanceOf[typings.twilio.twilioStrings.`sms-inbound-longcode`]
    
    inline def `sms-inbound-shortcode`: typings.twilio.twilioStrings.`sms-inbound-shortcode` = "sms-inbound-shortcode".asInstanceOf[typings.twilio.twilioStrings.`sms-inbound-shortcode`]
    
    inline def `sms-messages-carrierfees`: typings.twilio.twilioStrings.`sms-messages-carrierfees` = "sms-messages-carrierfees".asInstanceOf[typings.twilio.twilioStrings.`sms-messages-carrierfees`]
    
    inline def `sms-messages-features`: typings.twilio.twilioStrings.`sms-messages-features` = "sms-messages-features".asInstanceOf[typings.twilio.twilioStrings.`sms-messages-features`]
    
    inline def `sms-messages-features-senderid`: typings.twilio.twilioStrings.`sms-messages-features-senderid` = "sms-messages-features-senderid".asInstanceOf[typings.twilio.twilioStrings.`sms-messages-features-senderid`]
    
    inline def `sms-outbound`: typings.twilio.twilioStrings.`sms-outbound` = "sms-outbound".asInstanceOf[typings.twilio.twilioStrings.`sms-outbound`]
    
    inline def `sms-outbound-content-inspection`: typings.twilio.twilioStrings.`sms-outbound-content-inspection` = "sms-outbound-content-inspection".asInstanceOf[typings.twilio.twilioStrings.`sms-outbound-content-inspection`]
    
    inline def `sms-outbound-longcode`: typings.twilio.twilioStrings.`sms-outbound-longcode` = "sms-outbound-longcode".asInstanceOf[typings.twilio.twilioStrings.`sms-outbound-longcode`]
    
    inline def `sms-outbound-shortcode`: typings.twilio.twilioStrings.`sms-outbound-shortcode` = "sms-outbound-shortcode".asInstanceOf[typings.twilio.twilioStrings.`sms-outbound-shortcode`]
    
    inline def `speech-recognition`: typings.twilio.twilioStrings.`speech-recognition` = "speech-recognition".asInstanceOf[typings.twilio.twilioStrings.`speech-recognition`]
    
    inline def `studio-engagements`: typings.twilio.twilioStrings.`studio-engagements` = "studio-engagements".asInstanceOf[typings.twilio.twilioStrings.`studio-engagements`]
    
    inline def sync: typings.twilio.twilioStrings.sync = "sync".asInstanceOf[typings.twilio.twilioStrings.sync]
    
    inline def `sync-actions`: typings.twilio.twilioStrings.`sync-actions` = "sync-actions".asInstanceOf[typings.twilio.twilioStrings.`sync-actions`]
    
    inline def `sync-endpoint-hours`: typings.twilio.twilioStrings.`sync-endpoint-hours` = "sync-endpoint-hours".asInstanceOf[typings.twilio.twilioStrings.`sync-endpoint-hours`]
    
    inline def `sync-endpoint-hours-above-daily-cap`: typings.twilio.twilioStrings.`sync-endpoint-hours-above-daily-cap` = "sync-endpoint-hours-above-daily-cap".asInstanceOf[typings.twilio.twilioStrings.`sync-endpoint-hours-above-daily-cap`]
    
    inline def `taskrouter-tasks`: typings.twilio.twilioStrings.`taskrouter-tasks` = "taskrouter-tasks".asInstanceOf[typings.twilio.twilioStrings.`taskrouter-tasks`]
    
    inline def totalprice: typings.twilio.twilioStrings.totalprice = "totalprice".asInstanceOf[typings.twilio.twilioStrings.totalprice]
    
    inline def transcriptions: typings.twilio.twilioStrings.transcriptions = "transcriptions".asInstanceOf[typings.twilio.twilioStrings.transcriptions]
    
    inline def `trunking-cps`: typings.twilio.twilioStrings.`trunking-cps` = "trunking-cps".asInstanceOf[typings.twilio.twilioStrings.`trunking-cps`]
    
    inline def `trunking-emergency-calls`: typings.twilio.twilioStrings.`trunking-emergency-calls` = "trunking-emergency-calls".asInstanceOf[typings.twilio.twilioStrings.`trunking-emergency-calls`]
    
    inline def `trunking-origination`: typings.twilio.twilioStrings.`trunking-origination` = "trunking-origination".asInstanceOf[typings.twilio.twilioStrings.`trunking-origination`]
    
    inline def `trunking-origination-local`: typings.twilio.twilioStrings.`trunking-origination-local` = "trunking-origination-local".asInstanceOf[typings.twilio.twilioStrings.`trunking-origination-local`]
    
    inline def `trunking-origination-mobile`: typings.twilio.twilioStrings.`trunking-origination-mobile` = "trunking-origination-mobile".asInstanceOf[typings.twilio.twilioStrings.`trunking-origination-mobile`]
    
    inline def `trunking-origination-tollfree`: typings.twilio.twilioStrings.`trunking-origination-tollfree` = "trunking-origination-tollfree".asInstanceOf[typings.twilio.twilioStrings.`trunking-origination-tollfree`]
    
    inline def `trunking-recordings`: typings.twilio.twilioStrings.`trunking-recordings` = "trunking-recordings".asInstanceOf[typings.twilio.twilioStrings.`trunking-recordings`]
    
    inline def `trunking-secure`: typings.twilio.twilioStrings.`trunking-secure` = "trunking-secure".asInstanceOf[typings.twilio.twilioStrings.`trunking-secure`]
    
    inline def `trunking-termination`: typings.twilio.twilioStrings.`trunking-termination` = "trunking-termination".asInstanceOf[typings.twilio.twilioStrings.`trunking-termination`]
    
    inline def turnmegabytes: typings.twilio.twilioStrings.turnmegabytes = "turnmegabytes".asInstanceOf[typings.twilio.twilioStrings.turnmegabytes]
    
    inline def `turnmegabytes-australia`: typings.twilio.twilioStrings.`turnmegabytes-australia` = "turnmegabytes-australia".asInstanceOf[typings.twilio.twilioStrings.`turnmegabytes-australia`]
    
    inline def `turnmegabytes-brasil`: typings.twilio.twilioStrings.`turnmegabytes-brasil` = "turnmegabytes-brasil".asInstanceOf[typings.twilio.twilioStrings.`turnmegabytes-brasil`]
    
    inline def `turnmegabytes-germany`: typings.twilio.twilioStrings.`turnmegabytes-germany` = "turnmegabytes-germany".asInstanceOf[typings.twilio.twilioStrings.`turnmegabytes-germany`]
    
    inline def `turnmegabytes-india`: typings.twilio.twilioStrings.`turnmegabytes-india` = "turnmegabytes-india".asInstanceOf[typings.twilio.twilioStrings.`turnmegabytes-india`]
    
    inline def `turnmegabytes-ireland`: typings.twilio.twilioStrings.`turnmegabytes-ireland` = "turnmegabytes-ireland".asInstanceOf[typings.twilio.twilioStrings.`turnmegabytes-ireland`]
    
    inline def `turnmegabytes-japan`: typings.twilio.twilioStrings.`turnmegabytes-japan` = "turnmegabytes-japan".asInstanceOf[typings.twilio.twilioStrings.`turnmegabytes-japan`]
    
    inline def `turnmegabytes-singapore`: typings.twilio.twilioStrings.`turnmegabytes-singapore` = "turnmegabytes-singapore".asInstanceOf[typings.twilio.twilioStrings.`turnmegabytes-singapore`]
    
    inline def `turnmegabytes-useast`: typings.twilio.twilioStrings.`turnmegabytes-useast` = "turnmegabytes-useast".asInstanceOf[typings.twilio.twilioStrings.`turnmegabytes-useast`]
    
    inline def `turnmegabytes-uswest`: typings.twilio.twilioStrings.`turnmegabytes-uswest` = "turnmegabytes-uswest".asInstanceOf[typings.twilio.twilioStrings.`turnmegabytes-uswest`]
    
    inline def `twilio-interconnect`: typings.twilio.twilioStrings.`twilio-interconnect` = "twilio-interconnect".asInstanceOf[typings.twilio.twilioStrings.`twilio-interconnect`]
    
    inline def `verify-push`: typings.twilio.twilioStrings.`verify-push` = "verify-push".asInstanceOf[typings.twilio.twilioStrings.`verify-push`]
    
    inline def `verify-totp`: typings.twilio.twilioStrings.`verify-totp` = "verify-totp".asInstanceOf[typings.twilio.twilioStrings.`verify-totp`]
    
    inline def `verify-whatsapp-conversations-business-initiated`: typings.twilio.twilioStrings.`verify-whatsapp-conversations-business-initiated` = "verify-whatsapp-conversations-business-initiated".asInstanceOf[typings.twilio.twilioStrings.`verify-whatsapp-conversations-business-initiated`]
    
    inline def `video-recordings`: typings.twilio.twilioStrings.`video-recordings` = "video-recordings".asInstanceOf[typings.twilio.twilioStrings.`video-recordings`]
    
    inline def `voice-insights`: typings.twilio.twilioStrings.`voice-insights` = "voice-insights".asInstanceOf[typings.twilio.twilioStrings.`voice-insights`]
    
    inline def `voice-insights-client-insights-on-demand-minute`: typings.twilio.twilioStrings.`voice-insights-client-insights-on-demand-minute` = "voice-insights-client-insights-on-demand-minute".asInstanceOf[typings.twilio.twilioStrings.`voice-insights-client-insights-on-demand-minute`]
    
    inline def `voice-insights-ptsn-insights-on-demand-minute`: typings.twilio.twilioStrings.`voice-insights-ptsn-insights-on-demand-minute` = "voice-insights-ptsn-insights-on-demand-minute".asInstanceOf[typings.twilio.twilioStrings.`voice-insights-ptsn-insights-on-demand-minute`]
    
    inline def `voice-insights-sip-interface-insights-on-demand-minute`: typings.twilio.twilioStrings.`voice-insights-sip-interface-insights-on-demand-minute` = "voice-insights-sip-interface-insights-on-demand-minute".asInstanceOf[typings.twilio.twilioStrings.`voice-insights-sip-interface-insights-on-demand-minute`]
    
    inline def `voice-insights-sip-trunking-insights-on-demand-minute`: typings.twilio.twilioStrings.`voice-insights-sip-trunking-insights-on-demand-minute` = "voice-insights-sip-trunking-insights-on-demand-minute".asInstanceOf[typings.twilio.twilioStrings.`voice-insights-sip-trunking-insights-on-demand-minute`]
    
    inline def wireless: typings.twilio.twilioStrings.wireless = "wireless".asInstanceOf[typings.twilio.twilioStrings.wireless]
    
    inline def `wireless-orders`: typings.twilio.twilioStrings.`wireless-orders` = "wireless-orders".asInstanceOf[typings.twilio.twilioStrings.`wireless-orders`]
    
    inline def `wireless-orders-artwork`: typings.twilio.twilioStrings.`wireless-orders-artwork` = "wireless-orders-artwork".asInstanceOf[typings.twilio.twilioStrings.`wireless-orders-artwork`]
    
    inline def `wireless-orders-bulk`: typings.twilio.twilioStrings.`wireless-orders-bulk` = "wireless-orders-bulk".asInstanceOf[typings.twilio.twilioStrings.`wireless-orders-bulk`]
    
    inline def `wireless-orders-esim`: typings.twilio.twilioStrings.`wireless-orders-esim` = "wireless-orders-esim".asInstanceOf[typings.twilio.twilioStrings.`wireless-orders-esim`]
    
    inline def `wireless-orders-starter`: typings.twilio.twilioStrings.`wireless-orders-starter` = "wireless-orders-starter".asInstanceOf[typings.twilio.twilioStrings.`wireless-orders-starter`]
    
    inline def `wireless-usage`: typings.twilio.twilioStrings.`wireless-usage` = "wireless-usage".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage`]
    
    inline def `wireless-usage-commands`: typings.twilio.twilioStrings.`wireless-usage-commands` = "wireless-usage-commands".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-commands`]
    
    inline def `wireless-usage-commands-africa`: typings.twilio.twilioStrings.`wireless-usage-commands-africa` = "wireless-usage-commands-africa".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-commands-africa`]
    
    inline def `wireless-usage-commands-asia`: typings.twilio.twilioStrings.`wireless-usage-commands-asia` = "wireless-usage-commands-asia".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-commands-asia`]
    
    inline def `wireless-usage-commands-centralandsouthamerica`: typings.twilio.twilioStrings.`wireless-usage-commands-centralandsouthamerica` = "wireless-usage-commands-centralandsouthamerica".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-commands-centralandsouthamerica`]
    
    inline def `wireless-usage-commands-europe`: typings.twilio.twilioStrings.`wireless-usage-commands-europe` = "wireless-usage-commands-europe".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-commands-europe`]
    
    inline def `wireless-usage-commands-home`: typings.twilio.twilioStrings.`wireless-usage-commands-home` = "wireless-usage-commands-home".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-commands-home`]
    
    inline def `wireless-usage-commands-northamerica`: typings.twilio.twilioStrings.`wireless-usage-commands-northamerica` = "wireless-usage-commands-northamerica".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-commands-northamerica`]
    
    inline def `wireless-usage-commands-oceania`: typings.twilio.twilioStrings.`wireless-usage-commands-oceania` = "wireless-usage-commands-oceania".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-commands-oceania`]
    
    inline def `wireless-usage-commands-roaming`: typings.twilio.twilioStrings.`wireless-usage-commands-roaming` = "wireless-usage-commands-roaming".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-commands-roaming`]
    
    inline def `wireless-usage-data`: typings.twilio.twilioStrings.`wireless-usage-data` = "wireless-usage-data".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data`]
    
    inline def `wireless-usage-data-africa`: typings.twilio.twilioStrings.`wireless-usage-data-africa` = "wireless-usage-data-africa".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-africa`]
    
    inline def `wireless-usage-data-asia`: typings.twilio.twilioStrings.`wireless-usage-data-asia` = "wireless-usage-data-asia".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-asia`]
    
    inline def `wireless-usage-data-centralandsouthamerica`: typings.twilio.twilioStrings.`wireless-usage-data-centralandsouthamerica` = "wireless-usage-data-centralandsouthamerica".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-centralandsouthamerica`]
    
    inline def `wireless-usage-data-custom-additionalmb`: typings.twilio.twilioStrings.`wireless-usage-data-custom-additionalmb` = "wireless-usage-data-custom-additionalmb".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-custom-additionalmb`]
    
    inline def `wireless-usage-data-custom-first5mb`: typings.twilio.twilioStrings.`wireless-usage-data-custom-first5mb` = "wireless-usage-data-custom-first5mb".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-custom-first5mb`]
    
    inline def `wireless-usage-data-domestic-roaming`: typings.twilio.twilioStrings.`wireless-usage-data-domestic-roaming` = "wireless-usage-data-domestic-roaming".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-domestic-roaming`]
    
    inline def `wireless-usage-data-europe`: typings.twilio.twilioStrings.`wireless-usage-data-europe` = "wireless-usage-data-europe".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-europe`]
    
    inline def `wireless-usage-data-individual-additionalgb`: typings.twilio.twilioStrings.`wireless-usage-data-individual-additionalgb` = "wireless-usage-data-individual-additionalgb".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-individual-additionalgb`]
    
    inline def `wireless-usage-data-individual-firstgb`: typings.twilio.twilioStrings.`wireless-usage-data-individual-firstgb` = "wireless-usage-data-individual-firstgb".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-individual-firstgb`]
    
    inline def `wireless-usage-data-international-roaming-canada`: typings.twilio.twilioStrings.`wireless-usage-data-international-roaming-canada` = "wireless-usage-data-international-roaming-canada".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-international-roaming-canada`]
    
    inline def `wireless-usage-data-international-roaming-india`: typings.twilio.twilioStrings.`wireless-usage-data-international-roaming-india` = "wireless-usage-data-international-roaming-india".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-international-roaming-india`]
    
    inline def `wireless-usage-data-international-roaming-mexico`: typings.twilio.twilioStrings.`wireless-usage-data-international-roaming-mexico` = "wireless-usage-data-international-roaming-mexico".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-international-roaming-mexico`]
    
    inline def `wireless-usage-data-northamerica`: typings.twilio.twilioStrings.`wireless-usage-data-northamerica` = "wireless-usage-data-northamerica".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-northamerica`]
    
    inline def `wireless-usage-data-oceania`: typings.twilio.twilioStrings.`wireless-usage-data-oceania` = "wireless-usage-data-oceania".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-oceania`]
    
    inline def `wireless-usage-data-pooled`: typings.twilio.twilioStrings.`wireless-usage-data-pooled` = "wireless-usage-data-pooled".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-pooled`]
    
    inline def `wireless-usage-data-pooled-downlink`: typings.twilio.twilioStrings.`wireless-usage-data-pooled-downlink` = "wireless-usage-data-pooled-downlink".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-pooled-downlink`]
    
    inline def `wireless-usage-data-pooled-uplink`: typings.twilio.twilioStrings.`wireless-usage-data-pooled-uplink` = "wireless-usage-data-pooled-uplink".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-data-pooled-uplink`]
    
    inline def `wireless-usage-mrc`: typings.twilio.twilioStrings.`wireless-usage-mrc` = "wireless-usage-mrc".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-mrc`]
    
    inline def `wireless-usage-mrc-custom`: typings.twilio.twilioStrings.`wireless-usage-mrc-custom` = "wireless-usage-mrc-custom".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-mrc-custom`]
    
    inline def `wireless-usage-mrc-individual`: typings.twilio.twilioStrings.`wireless-usage-mrc-individual` = "wireless-usage-mrc-individual".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-mrc-individual`]
    
    inline def `wireless-usage-mrc-pooled`: typings.twilio.twilioStrings.`wireless-usage-mrc-pooled` = "wireless-usage-mrc-pooled".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-mrc-pooled`]
    
    inline def `wireless-usage-mrc-suspended`: typings.twilio.twilioStrings.`wireless-usage-mrc-suspended` = "wireless-usage-mrc-suspended".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-mrc-suspended`]
    
    inline def `wireless-usage-sms`: typings.twilio.twilioStrings.`wireless-usage-sms` = "wireless-usage-sms".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-sms`]
    
    inline def `wireless-usage-voice`: typings.twilio.twilioStrings.`wireless-usage-voice` = "wireless-usage-voice".asInstanceOf[typings.twilio.twilioStrings.`wireless-usage-voice`]
  }
}
