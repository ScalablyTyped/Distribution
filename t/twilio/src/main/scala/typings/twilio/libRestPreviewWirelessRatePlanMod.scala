package typings.twilio

import typings.twilio.anon.DataEnabled
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewWirelessMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewWirelessRatePlanMod {
  
  @JSImport("twilio/lib/rest/preview/wireless/ratePlan", "RatePlanContextImpl")
  @js.native
  open class RatePlanContextImpl protected ()
    extends StObject
       with RatePlanContext {
    def this(_version: default, sid: String) = this()
    
    /* protected */ var _solution: RatePlanContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[RatePlanInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[RatePlanInstance], Any]
    ): js.Promise[RatePlanInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[RatePlanInstance], Any]
    ): js.Promise[RatePlanInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/wireless/ratePlan", "RatePlanInstance")
  @js.native
  open class RatePlanInstance protected () extends StObject {
    def this(_version: default, payload: RatePlanResource) = this()
    def this(_version: default, payload: RatePlanResource, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[RatePlanContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: RatePlanContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var dataEnabled: Boolean = js.native
    
    var dataLimit: Double = js.native
    
    var dataMetering: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Fetch a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed RatePlanInstance
      */
    def fetch(): js.Promise[RatePlanInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[RatePlanInstance] = js.native
    
    var friendlyName: String = js.native
    
    var internationalRoaming: js.Array[String] = js.native
    
    var messagingEnabled: Boolean = js.native
    
    var nationalRoamingEnabled: Boolean = js.native
    
    /**
      * Remove a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): DataEnabled = js.native
    
    var uniqueName: String = js.native
    
    /**
      * Update a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed RatePlanInstance
      */
    def update(): js.Promise[RatePlanInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[RatePlanInstance] = js.native
    /**
      * Update a RatePlanInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed RatePlanInstance
      */
    def update(params: RatePlanContextUpdateOptions): js.Promise[RatePlanInstance] = js.native
    def update(
      params: RatePlanContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[RatePlanInstance] = js.native
    
    var url: String = js.native
    
    var voiceEnabled: Boolean = js.native
  }
  
  @js.native
  trait RatePlanListInstance extends StObject {
    
    def apply(sid: String): RatePlanContext = js.native
    
    var _solution: RatePlanSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed RatePlanInstance
      */
    def create(): js.Promise[RatePlanInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[RatePlanInstance], Any]): js.Promise[RatePlanInstance] = js.native
    /**
      * Create a RatePlanInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed RatePlanInstance
      */
    def create(params: RatePlanListInstanceCreateOptions): js.Promise[RatePlanInstance] = js.native
    def create(
      params: RatePlanListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[RatePlanInstance], Any]
    ): js.Promise[RatePlanInstance] = js.native
    
    /**
      * Streams RatePlanInstance records from the API.
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
      * @param { RatePlanListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ RatePlanInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: RatePlanListInstanceEachOptions): Unit = js.native
    def each(
      params: RatePlanListInstanceEachOptions,
      callback: js.Function2[
          /* item */ RatePlanInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): RatePlanContext = js.native
    
    /**
      * Retrieve a single target page of RatePlanInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[RatePlanPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanPage, Any]
    ): js.Promise[RatePlanPage] = js.native
    
    /**
      * Lists RatePlanInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { RatePlanListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[RatePlanInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RatePlanInstance], Any]): js.Promise[js.Array[RatePlanInstance]] = js.native
    def list(params: RatePlanListInstanceOptions): js.Promise[js.Array[RatePlanInstance]] = js.native
    def list(
      params: RatePlanListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RatePlanInstance], Any]
    ): js.Promise[js.Array[RatePlanInstance]] = js.native
    
    /**
      * Retrieve a single page of RatePlanInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { RatePlanListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[RatePlanPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanPage, Any]): js.Promise[RatePlanPage] = js.native
    def page(params: RatePlanListInstancePageOptions): js.Promise[RatePlanPage] = js.native
    def page(
      params: RatePlanListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanPage, Any]
    ): js.Promise[RatePlanPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object RatePlanListInstance {
    
    @JSImport("twilio/lib/rest/preview/wireless/ratePlan", "RatePlanListInstance")
    @js.native
    def apply(version: default): RatePlanListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/wireless/ratePlan", "RatePlanPage")
  @js.native
  open class RatePlanPage protected ()
    extends typings.twilio.libBasePageMod.default[default, RatePlanPayload, RatePlanResource, RatePlanInstance] {
    /**
      * Initialize the RatePlanPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: RatePlanSolution
    ) = this()
    
    /**
      * Build an instance of RatePlanInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RatePlanResource): RatePlanInstance = js.native
  }
  
  @js.native
  trait RatePlanContext extends StObject {
    
    /**
      * Fetch a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed RatePlanInstance
      */
    def fetch(): js.Promise[RatePlanInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[RatePlanInstance], Any]): js.Promise[RatePlanInstance] = js.native
    
    /**
      * Remove a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed RatePlanInstance
      */
    def update(): js.Promise[RatePlanInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[RatePlanInstance], Any]): js.Promise[RatePlanInstance] = js.native
    /**
      * Update a RatePlanInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed RatePlanInstance
      */
    def update(params: RatePlanContextUpdateOptions): js.Promise[RatePlanInstance] = js.native
    def update(
      params: RatePlanContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[RatePlanInstance], Any]
    ): js.Promise[RatePlanInstance] = js.native
  }
  
  trait RatePlanContextSolution extends StObject {
    
    var sid: String
  }
  object RatePlanContextSolution {
    
    inline def apply(sid: String): RatePlanContextSolution = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RatePlanContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatePlanContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait RatePlanContextUpdateOptions extends StObject {
    
    /**  */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /**  */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object RatePlanContextUpdateOptions {
    
    inline def apply(): RatePlanContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatePlanContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatePlanContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait RatePlanListInstanceCreateOptions extends StObject {
    
    /**  */
    var commandsEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**  */
    var dataEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**  */
    var dataLimit: js.UndefOr[Double] = js.undefined
    
    /**  */
    var dataMetering: js.UndefOr[String] = js.undefined
    
    /**  */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /**  */
    var internationalRoaming: js.UndefOr[js.Array[String]] = js.undefined
    
    /**  */
    var messagingEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**  */
    var nationalRoamingEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**  */
    var uniqueName: js.UndefOr[String] = js.undefined
    
    /**  */
    var voiceEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object RatePlanListInstanceCreateOptions {
    
    inline def apply(): RatePlanListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatePlanListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatePlanListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setCommandsEnabled(value: Boolean): Self = StObject.set(x, "commandsEnabled", value.asInstanceOf[js.Any])
      
      inline def setCommandsEnabledUndefined: Self = StObject.set(x, "commandsEnabled", js.undefined)
      
      inline def setDataEnabled(value: Boolean): Self = StObject.set(x, "dataEnabled", value.asInstanceOf[js.Any])
      
      inline def setDataEnabledUndefined: Self = StObject.set(x, "dataEnabled", js.undefined)
      
      inline def setDataLimit(value: Double): Self = StObject.set(x, "dataLimit", value.asInstanceOf[js.Any])
      
      inline def setDataLimitUndefined: Self = StObject.set(x, "dataLimit", js.undefined)
      
      inline def setDataMetering(value: String): Self = StObject.set(x, "dataMetering", value.asInstanceOf[js.Any])
      
      inline def setDataMeteringUndefined: Self = StObject.set(x, "dataMetering", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setInternationalRoaming(value: js.Array[String]): Self = StObject.set(x, "internationalRoaming", value.asInstanceOf[js.Any])
      
      inline def setInternationalRoamingUndefined: Self = StObject.set(x, "internationalRoaming", js.undefined)
      
      inline def setInternationalRoamingVarargs(value: String*): Self = StObject.set(x, "internationalRoaming", js.Array(value*))
      
      inline def setMessagingEnabled(value: Boolean): Self = StObject.set(x, "messagingEnabled", value.asInstanceOf[js.Any])
      
      inline def setMessagingEnabledUndefined: Self = StObject.set(x, "messagingEnabled", js.undefined)
      
      inline def setNationalRoamingEnabled(value: Boolean): Self = StObject.set(x, "nationalRoamingEnabled", value.asInstanceOf[js.Any])
      
      inline def setNationalRoamingEnabledUndefined: Self = StObject.set(x, "nationalRoamingEnabled", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
      
      inline def setVoiceEnabled(value: Boolean): Self = StObject.set(x, "voiceEnabled", value.asInstanceOf[js.Any])
      
      inline def setVoiceEnabledUndefined: Self = StObject.set(x, "voiceEnabled", js.undefined)
    }
  }
  
  trait RatePlanListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ RatePlanInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RatePlanListInstanceEachOptions {
    
    inline def apply(): RatePlanListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatePlanListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatePlanListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ RatePlanInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait RatePlanListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RatePlanListInstanceOptions {
    
    inline def apply(): RatePlanListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatePlanListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatePlanListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait RatePlanListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object RatePlanListInstancePageOptions {
    
    inline def apply(): RatePlanListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatePlanListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatePlanListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait RatePlanPayload
    extends StObject
       with TwilioResponsePayload {
    
    var rate_plans: js.Array[RatePlanResource]
  }
  object RatePlanPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      rate_plans: js.Array[RatePlanResource],
      uri: String
    ): RatePlanPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], rate_plans = rate_plans.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RatePlanPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatePlanPayload] (val x: Self) extends AnyVal {
      
      inline def setRate_plans(value: js.Array[RatePlanResource]): Self = StObject.set(x, "rate_plans", value.asInstanceOf[js.Any])
      
      inline def setRate_plansVarargs(value: RatePlanResource*): Self = StObject.set(x, "rate_plans", js.Array(value*))
    }
  }
  
  trait RatePlanResource extends StObject {
    
    var account_sid: String
    
    var data_enabled: Boolean
    
    var data_limit: Double
    
    var data_metering: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var international_roaming: js.Array[String]
    
    var messaging_enabled: Boolean
    
    var national_roaming_enabled: Boolean
    
    var sid: String
    
    var unique_name: String
    
    var url: String
    
    var voice_enabled: Boolean
  }
  object RatePlanResource {
    
    inline def apply(
      account_sid: String,
      data_enabled: Boolean,
      data_limit: Double,
      data_metering: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      international_roaming: js.Array[String],
      messaging_enabled: Boolean,
      national_roaming_enabled: Boolean,
      sid: String,
      unique_name: String,
      url: String,
      voice_enabled: Boolean
    ): RatePlanResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], data_enabled = data_enabled.asInstanceOf[js.Any], data_limit = data_limit.asInstanceOf[js.Any], data_metering = data_metering.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], international_roaming = international_roaming.asInstanceOf[js.Any], messaging_enabled = messaging_enabled.asInstanceOf[js.Any], national_roaming_enabled = national_roaming_enabled.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_enabled = voice_enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[RatePlanResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatePlanResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setData_enabled(value: Boolean): Self = StObject.set(x, "data_enabled", value.asInstanceOf[js.Any])
      
      inline def setData_limit(value: Double): Self = StObject.set(x, "data_limit", value.asInstanceOf[js.Any])
      
      inline def setData_metering(value: String): Self = StObject.set(x, "data_metering", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setInternational_roaming(value: js.Array[String]): Self = StObject.set(x, "international_roaming", value.asInstanceOf[js.Any])
      
      inline def setInternational_roamingVarargs(value: String*): Self = StObject.set(x, "international_roaming", js.Array(value*))
      
      inline def setMessaging_enabled(value: Boolean): Self = StObject.set(x, "messaging_enabled", value.asInstanceOf[js.Any])
      
      inline def setNational_roaming_enabled(value: Boolean): Self = StObject.set(x, "national_roaming_enabled", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVoice_enabled(value: Boolean): Self = StObject.set(x, "voice_enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait RatePlanSolution extends StObject
}
