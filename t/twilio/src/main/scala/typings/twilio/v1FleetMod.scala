package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.payg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1FleetMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/fleet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/fleet", "FleetContext")
  @js.native
  open class FleetContext protected () extends StObject {
    /**
      * Initialize the FleetContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, sid: String) = this()
    
    /**
      * fetch a FleetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FleetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetInstance, Any]): js.Promise[FleetInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a FleetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[FleetInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetInstance, Any]): js.Promise[FleetInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetInstance, Any]): js.Promise[FleetInstance] = js.native
    def update(opts: FleetInstanceUpdateOptions): js.Promise[FleetInstance] = js.native
    def update(
      opts: FleetInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetInstance, Any]
    ): js.Promise[FleetInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/supersim/v1/fleet", "FleetInstance")
  @js.native
  open class FleetInstance protected () extends SerializableClass {
    /**
      * Initialize the FleetContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, payload: FleetPayload, sid: String) = this()
    
    /* private */ var _proxy: FleetContext = js.native
    
    var accountSid: String = js.native
    
    var dataEnabled: Boolean = js.native
    
    var dataLimit: Double = js.native
    
    var dataMetering: FleetDataMetering = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a FleetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FleetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FleetInstance] = js.native
    
    var ipCommandsMethod: String = js.native
    
    var ipCommandsUrl: String = js.native
    
    var networkAccessProfileSid: String = js.native
    
    var sid: String = js.native
    
    var smsCommandsEnabled: Boolean = js.native
    
    var smsCommandsMethod: String = js.native
    
    var smsCommandsUrl: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a FleetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[FleetInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FleetInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FleetInstance] = js.native
    def update(opts: FleetInstanceUpdateOptions): js.Promise[FleetInstance] = js.native
    def update(
      opts: FleetInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[FleetInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the FleetList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def FleetList(version: typings.twilio.supersimV1Mod.^): FleetListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("FleetList")(version.asInstanceOf[js.Any]).asInstanceOf[FleetListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/fleet", "FleetPage")
  @js.native
  open class FleetPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.supersimV1Mod.^, FleetPayload, FleetResource, FleetInstance] {
    /**
      * Initialize the FleetPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.supersimV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FleetSolution
    ) = this()
    
    /**
      * Build an instance of FleetInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FleetPayload): FleetInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  type FleetDataMetering = payg
  
  /**
    * Options to pass to update
    *
    * @property dataLimit - The total data usage (download and upload combined) in Megabytes that each Super SIM assigned to the Fleet can consume
    * @property ipCommandsMethod - A string representing the HTTP method to use when making a request to `ip_commands_url`
    * @property ipCommandsUrl - The URL that will receive a webhook when a Super SIM in the Fleet is used to send an IP Command from your device
    * @property networkAccessProfile - The SID or unique name of the Network Access Profile of the Fleet
    * @property smsCommandsMethod - A string representing the HTTP method to use when making a request to `sms_commands_url`
    * @property smsCommandsUrl - The URL that will receive a webhook when a Super SIM in the Fleet is used to send an SMS from your device to the SMS Commands number
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait FleetInstanceUpdateOptions extends StObject {
    
    var dataLimit: js.UndefOr[Double] = js.undefined
    
    var ipCommandsMethod: js.UndefOr[String] = js.undefined
    
    var ipCommandsUrl: js.UndefOr[String] = js.undefined
    
    var networkAccessProfile: js.UndefOr[String] = js.undefined
    
    var smsCommandsMethod: js.UndefOr[String] = js.undefined
    
    var smsCommandsUrl: js.UndefOr[String] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object FleetInstanceUpdateOptions {
    
    inline def apply(): FleetInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetInstanceUpdateOptions]
    }
    
    extension [Self <: FleetInstanceUpdateOptions](x: Self) {
      
      inline def setDataLimit(value: Double): Self = StObject.set(x, "dataLimit", value.asInstanceOf[js.Any])
      
      inline def setDataLimitUndefined: Self = StObject.set(x, "dataLimit", js.undefined)
      
      inline def setIpCommandsMethod(value: String): Self = StObject.set(x, "ipCommandsMethod", value.asInstanceOf[js.Any])
      
      inline def setIpCommandsMethodUndefined: Self = StObject.set(x, "ipCommandsMethod", js.undefined)
      
      inline def setIpCommandsUrl(value: String): Self = StObject.set(x, "ipCommandsUrl", value.asInstanceOf[js.Any])
      
      inline def setIpCommandsUrlUndefined: Self = StObject.set(x, "ipCommandsUrl", js.undefined)
      
      inline def setNetworkAccessProfile(value: String): Self = StObject.set(x, "networkAccessProfile", value.asInstanceOf[js.Any])
      
      inline def setNetworkAccessProfileUndefined: Self = StObject.set(x, "networkAccessProfile", js.undefined)
      
      inline def setSmsCommandsMethod(value: String): Self = StObject.set(x, "smsCommandsMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsCommandsMethodUndefined: Self = StObject.set(x, "smsCommandsMethod", js.undefined)
      
      inline def setSmsCommandsUrl(value: String): Self = StObject.set(x, "smsCommandsUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsCommandsUrlUndefined: Self = StObject.set(x, "smsCommandsUrl", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait FleetListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FleetContext = js.native
    
    /**
      * create a FleetInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: FleetListInstanceCreateOptions): js.Promise[FleetInstance] = js.native
    def create(
      opts: FleetListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ FleetInstance, Any]
    ): js.Promise[FleetInstance] = js.native
    
    /**
      * Streams FleetInstance records from the API.
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
          /* item */ FleetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ FleetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: FleetListInstanceEachOptions): Unit = js.native
    def each(
      opts: FleetListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FleetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a fleet
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): FleetContext = js.native
    
    /**
      * Retrieve a single target page of FleetInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[FleetPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetPage, Any]): js.Promise[FleetPage] = js.native
    def getPage(targetUrl: String): js.Promise[FleetPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetPage, Any]): js.Promise[FleetPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetPage, Any]): js.Promise[FleetPage] = js.native
    
    /**
      * Lists FleetInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FleetInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FleetInstance], Any]): js.Promise[js.Array[FleetInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FleetInstance], Any]
    ): js.Promise[js.Array[FleetInstance]] = js.native
    def list(opts: FleetListInstanceOptions): js.Promise[js.Array[FleetInstance]] = js.native
    def list(
      opts: FleetListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FleetInstance], Any]
    ): js.Promise[js.Array[FleetInstance]] = js.native
    
    /**
      * Retrieve a single page of FleetInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[FleetPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetPage, Any]): js.Promise[FleetPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetPage, Any]): js.Promise[FleetPage] = js.native
    def page(opts: FleetListInstancePageOptions): js.Promise[FleetPage] = js.native
    def page(
      opts: FleetListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetPage, Any]
    ): js.Promise[FleetPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property dataEnabled - Defines whether SIMs in the Fleet are capable of using data connectivity
    * @property dataLimit - The total data usage (download and upload combined) in Megabytes that each Super SIM resource assigned to the Fleet can consume
    * @property ipCommandsMethod - A string representing the HTTP method to use when making a request to `ip_commands_url`
    * @property ipCommandsUrl - The URL that will receive a webhook when a Super SIM in the Fleet is used to send an IP Command from your device
    * @property networkAccessProfile - The SID or unique name of the Network Access Profile of the Fleet
    * @property smsCommandsEnabled - Defines whether SIMs in the Fleet are capable of sending and receiving machine-to-machine SMS via Commands
    * @property smsCommandsMethod - A string representing the HTTP method to use when making a request to `sms_commands_url`
    * @property smsCommandsUrl - The URL that will receive a webhook when a Super SIM in the Fleet is used to send an SMS from your device to the SMS Commands number
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait FleetListInstanceCreateOptions extends StObject {
    
    var dataEnabled: js.UndefOr[Boolean] = js.undefined
    
    var dataLimit: js.UndefOr[Double] = js.undefined
    
    var ipCommandsMethod: js.UndefOr[String] = js.undefined
    
    var ipCommandsUrl: js.UndefOr[String] = js.undefined
    
    var networkAccessProfile: String
    
    var smsCommandsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var smsCommandsMethod: js.UndefOr[String] = js.undefined
    
    var smsCommandsUrl: js.UndefOr[String] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object FleetListInstanceCreateOptions {
    
    inline def apply(networkAccessProfile: String): FleetListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(networkAccessProfile = networkAccessProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetListInstanceCreateOptions]
    }
    
    extension [Self <: FleetListInstanceCreateOptions](x: Self) {
      
      inline def setDataEnabled(value: Boolean): Self = StObject.set(x, "dataEnabled", value.asInstanceOf[js.Any])
      
      inline def setDataEnabledUndefined: Self = StObject.set(x, "dataEnabled", js.undefined)
      
      inline def setDataLimit(value: Double): Self = StObject.set(x, "dataLimit", value.asInstanceOf[js.Any])
      
      inline def setDataLimitUndefined: Self = StObject.set(x, "dataLimit", js.undefined)
      
      inline def setIpCommandsMethod(value: String): Self = StObject.set(x, "ipCommandsMethod", value.asInstanceOf[js.Any])
      
      inline def setIpCommandsMethodUndefined: Self = StObject.set(x, "ipCommandsMethod", js.undefined)
      
      inline def setIpCommandsUrl(value: String): Self = StObject.set(x, "ipCommandsUrl", value.asInstanceOf[js.Any])
      
      inline def setIpCommandsUrlUndefined: Self = StObject.set(x, "ipCommandsUrl", js.undefined)
      
      inline def setNetworkAccessProfile(value: String): Self = StObject.set(x, "networkAccessProfile", value.asInstanceOf[js.Any])
      
      inline def setSmsCommandsEnabled(value: Boolean): Self = StObject.set(x, "smsCommandsEnabled", value.asInstanceOf[js.Any])
      
      inline def setSmsCommandsEnabledUndefined: Self = StObject.set(x, "smsCommandsEnabled", js.undefined)
      
      inline def setSmsCommandsMethod(value: String): Self = StObject.set(x, "smsCommandsMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsCommandsMethodUndefined: Self = StObject.set(x, "smsCommandsMethod", js.undefined)
      
      inline def setSmsCommandsUrl(value: String): Self = StObject.set(x, "smsCommandsUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsCommandsUrlUndefined: Self = StObject.set(x, "smsCommandsUrl", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
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
    * @property networkAccessProfile - The SID or unique name of the Network Access Profile of the Fleet
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait FleetListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FleetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var networkAccessProfile: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FleetListInstanceEachOptions {
    
    inline def apply(): FleetListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetListInstanceEachOptions]
    }
    
    extension [Self <: FleetListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ FleetInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setNetworkAccessProfile(value: String): Self = StObject.set(x, "networkAccessProfile", value.asInstanceOf[js.Any])
      
      inline def setNetworkAccessProfileUndefined: Self = StObject.set(x, "networkAccessProfile", js.undefined)
      
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
    * @property networkAccessProfile - The SID or unique name of the Network Access Profile of the Fleet
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait FleetListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var networkAccessProfile: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FleetListInstanceOptions {
    
    inline def apply(): FleetListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetListInstanceOptions]
    }
    
    extension [Self <: FleetListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setNetworkAccessProfile(value: String): Self = StObject.set(x, "networkAccessProfile", value.asInstanceOf[js.Any])
      
      inline def setNetworkAccessProfileUndefined: Self = StObject.set(x, "networkAccessProfile", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property networkAccessProfile - The SID or unique name of the Network Access Profile of the Fleet
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait FleetListInstancePageOptions extends StObject {
    
    var networkAccessProfile: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FleetListInstancePageOptions {
    
    inline def apply(): FleetListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetListInstancePageOptions]
    }
    
    extension [Self <: FleetListInstancePageOptions](x: Self) {
      
      inline def setNetworkAccessProfile(value: String): Self = StObject.set(x, "networkAccessProfile", value.asInstanceOf[js.Any])
      
      inline def setNetworkAccessProfileUndefined: Self = StObject.set(x, "networkAccessProfile", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait FleetPayload
    extends StObject
       with FleetResource
       with TwilioResponsePayload
  object FleetPayload {
    
    inline def apply(
      account_sid: String,
      data_enabled: Boolean,
      data_limit: Double,
      data_metering: FleetDataMetering,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      ip_commands_method: String,
      ip_commands_url: String,
      network_access_profile_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      sms_commands_enabled: Boolean,
      sms_commands_method: String,
      sms_commands_url: String,
      unique_name: String,
      uri: String,
      url: String
    ): FleetPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], data_enabled = data_enabled.asInstanceOf[js.Any], data_limit = data_limit.asInstanceOf[js.Any], data_metering = data_metering.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], ip_commands_method = ip_commands_method.asInstanceOf[js.Any], ip_commands_url = ip_commands_url.asInstanceOf[js.Any], network_access_profile_sid = network_access_profile_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_commands_enabled = sms_commands_enabled.asInstanceOf[js.Any], sms_commands_method = sms_commands_method.asInstanceOf[js.Any], sms_commands_url = sms_commands_url.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetPayload]
    }
  }
  
  trait FleetResource extends StObject {
    
    var account_sid: String
    
    var data_enabled: Boolean
    
    var data_limit: Double
    
    var data_metering: FleetDataMetering
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var ip_commands_method: String
    
    var ip_commands_url: String
    
    var network_access_profile_sid: String
    
    var sid: String
    
    var sms_commands_enabled: Boolean
    
    var sms_commands_method: String
    
    var sms_commands_url: String
    
    var unique_name: String
    
    var url: String
  }
  object FleetResource {
    
    inline def apply(
      account_sid: String,
      data_enabled: Boolean,
      data_limit: Double,
      data_metering: FleetDataMetering,
      date_created: js.Date,
      date_updated: js.Date,
      ip_commands_method: String,
      ip_commands_url: String,
      network_access_profile_sid: String,
      sid: String,
      sms_commands_enabled: Boolean,
      sms_commands_method: String,
      sms_commands_url: String,
      unique_name: String,
      url: String
    ): FleetResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], data_enabled = data_enabled.asInstanceOf[js.Any], data_limit = data_limit.asInstanceOf[js.Any], data_metering = data_metering.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], ip_commands_method = ip_commands_method.asInstanceOf[js.Any], ip_commands_url = ip_commands_url.asInstanceOf[js.Any], network_access_profile_sid = network_access_profile_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_commands_enabled = sms_commands_enabled.asInstanceOf[js.Any], sms_commands_method = sms_commands_method.asInstanceOf[js.Any], sms_commands_url = sms_commands_url.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetResource]
    }
    
    extension [Self <: FleetResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setData_enabled(value: Boolean): Self = StObject.set(x, "data_enabled", value.asInstanceOf[js.Any])
      
      inline def setData_limit(value: Double): Self = StObject.set(x, "data_limit", value.asInstanceOf[js.Any])
      
      inline def setData_metering(value: FleetDataMetering): Self = StObject.set(x, "data_metering", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setIp_commands_method(value: String): Self = StObject.set(x, "ip_commands_method", value.asInstanceOf[js.Any])
      
      inline def setIp_commands_url(value: String): Self = StObject.set(x, "ip_commands_url", value.asInstanceOf[js.Any])
      
      inline def setNetwork_access_profile_sid(value: String): Self = StObject.set(x, "network_access_profile_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSms_commands_enabled(value: Boolean): Self = StObject.set(x, "sms_commands_enabled", value.asInstanceOf[js.Any])
      
      inline def setSms_commands_method(value: String): Self = StObject.set(x, "sms_commands_method", value.asInstanceOf[js.Any])
      
      inline def setSms_commands_url(value: String): Self = StObject.set(x, "sms_commands_url", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FleetSolution extends StObject
}
