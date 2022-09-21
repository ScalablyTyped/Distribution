package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratePlanMod {
  
  @JSImport("twilio/lib/rest/preview/wireless/ratePlan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/wireless/ratePlan", "RatePlanContext")
  @js.native
  open class RatePlanContext protected () extends StObject {
    /**
      * Initialize the RatePlanContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - The sid
      */
    def this(version: typings.twilio.wirelessMod.^, sid: String) = this()
    
    /**
      * fetch a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RatePlanInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanInstance, Any]): js.Promise[RatePlanInstance] = js.native
    
    /**
      * remove a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[RatePlanInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanInstance, Any]): js.Promise[RatePlanInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanInstance, Any]): js.Promise[RatePlanInstance] = js.native
    def update(opts: RatePlanInstanceUpdateOptions): js.Promise[RatePlanInstance] = js.native
    def update(
      opts: RatePlanInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanInstance, Any]
    ): js.Promise[RatePlanInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/wireless/ratePlan", "RatePlanInstance")
  @js.native
  open class RatePlanInstance protected () extends SerializableClass {
    /**
      * Initialize the RatePlanContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The sid
      */
    def this(version: typings.twilio.wirelessMod.^, payload: RatePlanPayload, sid: String) = this()
    
    /* private */ var _proxy: RatePlanContext = js.native
    
    var accountSid: String = js.native
    
    var dataEnabled: Boolean = js.native
    
    var dataLimit: Double = js.native
    
    var dataMetering: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RatePlanInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RatePlanInstance] = js.native
    
    var friendlyName: String = js.native
    
    var internationalRoaming: js.Array[String] = js.native
    
    var messagingEnabled: Boolean = js.native
    
    var nationalRoamingEnabled: Boolean = js.native
    
    /**
      * remove a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[RatePlanInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RatePlanInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RatePlanInstance] = js.native
    def update(opts: RatePlanInstanceUpdateOptions): js.Promise[RatePlanInstance] = js.native
    def update(
      opts: RatePlanInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[RatePlanInstance] = js.native
    
    var url: String = js.native
    
    var voiceEnabled: Boolean = js.native
  }
  
  /**
    * Initialize the RatePlanList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def RatePlanList(version: typings.twilio.wirelessMod.^): RatePlanListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("RatePlanList")(version.asInstanceOf[js.Any]).asInstanceOf[RatePlanListInstance]
  
  @JSImport("twilio/lib/rest/preview/wireless/ratePlan", "RatePlanPage")
  @js.native
  open class RatePlanPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.wirelessMod.^, RatePlanPayload, RatePlanResource, RatePlanInstance] {
    /**
      * Initialize the RatePlanPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.wirelessMod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RatePlanSolution
    ) = this()
    
    /**
      * Build an instance of RatePlanInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RatePlanPayload): RatePlanInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - The friendly_name
    * @property uniqueName - The unique_name
    */
  trait RatePlanInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object RatePlanInstanceUpdateOptions {
    
    inline def apply(): RatePlanInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatePlanInstanceUpdateOptions]
    }
    
    extension [Self <: RatePlanInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait RatePlanListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RatePlanContext = js.native
    
    /**
      * create a RatePlanInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[RatePlanInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ RatePlanInstance, Any]): js.Promise[RatePlanInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ RatePlanInstance, Any]): js.Promise[RatePlanInstance] = js.native
    def create(opts: RatePlanListInstanceCreateOptions): js.Promise[RatePlanInstance] = js.native
    def create(
      opts: RatePlanListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ RatePlanInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ RatePlanInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ RatePlanInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: RatePlanListInstanceEachOptions): Unit = js.native
    def each(
      opts: RatePlanListInstanceEachOptions,
      callback: js.Function2[
          /* item */ RatePlanInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a rate_plan
      *
      * @param sid - The sid
      */
    def get(sid: String): RatePlanContext = js.native
    
    /**
      * Retrieve a single target page of RatePlanInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[RatePlanPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanPage, Any]): js.Promise[RatePlanPage] = js.native
    def getPage(targetUrl: String): js.Promise[RatePlanPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanPage, Any]
    ): js.Promise[RatePlanPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanPage, Any]
    ): js.Promise[RatePlanPage] = js.native
    
    /**
      * Lists RatePlanInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[RatePlanInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RatePlanInstance], Any]): js.Promise[js.Array[RatePlanInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RatePlanInstance], Any]
    ): js.Promise[js.Array[RatePlanInstance]] = js.native
    def list(opts: RatePlanListInstanceOptions): js.Promise[js.Array[RatePlanInstance]] = js.native
    def list(
      opts: RatePlanListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[RatePlanPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanPage, Any]): js.Promise[RatePlanPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanPage, Any]): js.Promise[RatePlanPage] = js.native
    def page(opts: RatePlanListInstancePageOptions): js.Promise[RatePlanPage] = js.native
    def page(
      opts: RatePlanListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RatePlanPage, Any]
    ): js.Promise[RatePlanPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property commandsEnabled - The commands_enabled
    * @property dataEnabled - The data_enabled
    * @property dataLimit - The data_limit
    * @property dataMetering - The data_metering
    * @property friendlyName - The friendly_name
    * @property internationalRoaming - The international_roaming
    * @property messagingEnabled - The messaging_enabled
    * @property nationalRoamingEnabled - The national_roaming_enabled
    * @property uniqueName - The unique_name
    * @property voiceEnabled - The voice_enabled
    */
  trait RatePlanListInstanceCreateOptions extends StObject {
    
    var commandsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var dataEnabled: js.UndefOr[Boolean] = js.undefined
    
    var dataLimit: js.UndefOr[Double] = js.undefined
    
    var dataMetering: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var internationalRoaming: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var messagingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var nationalRoamingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
    
    var voiceEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object RatePlanListInstanceCreateOptions {
    
    inline def apply(): RatePlanListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatePlanListInstanceCreateOptions]
    }
    
    extension [Self <: RatePlanListInstanceCreateOptions](x: Self) {
      
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
      
      inline def setInternationalRoaming(value: String | js.Array[String]): Self = StObject.set(x, "internationalRoaming", value.asInstanceOf[js.Any])
      
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
  trait RatePlanListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ RatePlanInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RatePlanListInstanceEachOptions {
    
    inline def apply(): RatePlanListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatePlanListInstanceEachOptions]
    }
    
    extension [Self <: RatePlanListInstanceEachOptions](x: Self) {
      
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
  trait RatePlanListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RatePlanListInstanceOptions {
    
    inline def apply(): RatePlanListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatePlanListInstanceOptions]
    }
    
    extension [Self <: RatePlanListInstanceOptions](x: Self) {
      
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
  trait RatePlanListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object RatePlanListInstancePageOptions {
    
    inline def apply(): RatePlanListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatePlanListInstancePageOptions]
    }
    
    extension [Self <: RatePlanListInstancePageOptions](x: Self) {
      
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
       with RatePlanResource
       with TwilioResponsePayload
  object RatePlanPayload {
    
    inline def apply(
      account_sid: String,
      data_enabled: Boolean,
      data_limit: Double,
      data_metering: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      international_roaming: js.Array[String],
      messaging_enabled: Boolean,
      national_roaming_enabled: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String,
      voice_enabled: Boolean
    ): RatePlanPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], data_enabled = data_enabled.asInstanceOf[js.Any], data_limit = data_limit.asInstanceOf[js.Any], data_metering = data_metering.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], international_roaming = international_roaming.asInstanceOf[js.Any], messaging_enabled = messaging_enabled.asInstanceOf[js.Any], national_roaming_enabled = national_roaming_enabled.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_enabled = voice_enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[RatePlanPayload]
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
    
    extension [Self <: RatePlanResource](x: Self) {
      
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
