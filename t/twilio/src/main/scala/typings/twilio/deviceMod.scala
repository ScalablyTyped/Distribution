package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceMod {
  
  @JSImport("twilio/lib/rest/microvisor/v1/device", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/microvisor/v1/device", "DeviceContext")
  @js.native
  open class DeviceContext protected () extends StObject {
    /**
      * Initialize the DeviceContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - A string that uniquely identifies this Device.
      */
    def this(version: typings.twilio.microvisorV1Mod.^, sid: String) = this()
    
    /**
      * fetch a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeviceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeviceInstance, Any]): js.Promise[DeviceInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[DeviceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeviceInstance, Any]): js.Promise[DeviceInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DeviceInstance, Any]): js.Promise[DeviceInstance] = js.native
    def update(opts: DeviceInstanceUpdateOptions): js.Promise[DeviceInstance] = js.native
    def update(
      opts: DeviceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeviceInstance, Any]
    ): js.Promise[DeviceInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/microvisor/v1/device", "DeviceInstance")
  @js.native
  open class DeviceInstance protected () extends SerializableClass {
    /**
      * Initialize the DeviceContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - A string that uniquely identifies this Device.
      */
    def this(version: typings.twilio.microvisorV1Mod.^, payload: DevicePayload, sid: String) = this()
    
    /* private */ var _proxy: DeviceContext = js.native
    
    var accountSid: String = js.native
    
    var app: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeviceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeviceInstance] = js.native
    
    var logging: Any = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[DeviceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeviceInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeviceInstance] = js.native
    def update(opts: DeviceInstanceUpdateOptions): js.Promise[DeviceInstance] = js.native
    def update(
      opts: DeviceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[DeviceInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the DeviceList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def DeviceList(version: typings.twilio.microvisorV1Mod.^): DeviceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("DeviceList")(version.asInstanceOf[js.Any]).asInstanceOf[DeviceListInstance]
  
  @JSImport("twilio/lib/rest/microvisor/v1/device", "DevicePage")
  @js.native
  open class DevicePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.microvisorV1Mod.^, DevicePayload, DeviceResource, DeviceInstance] {
    /**
      * Initialize the DevicePage
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
      version: typings.twilio.microvisorV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: DeviceSolution
    ) = this()
    
    /**
      * Build an instance of DeviceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DevicePayload): DeviceInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property loggingEnabled - Whether to enable logging.
    * @property targetApp - The target App SID or unique name.
    * @property uniqueName - A unique, developer-assigned name for this Device.
    */
  trait DeviceInstanceUpdateOptions extends StObject {
    
    var loggingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var targetApp: js.UndefOr[String] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DeviceInstanceUpdateOptions {
    
    inline def apply(): DeviceInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceInstanceUpdateOptions]
    }
    
    extension [Self <: DeviceInstanceUpdateOptions](x: Self) {
      
      inline def setLoggingEnabled(value: Boolean): Self = StObject.set(x, "loggingEnabled", value.asInstanceOf[js.Any])
      
      inline def setLoggingEnabledUndefined: Self = StObject.set(x, "loggingEnabled", js.undefined)
      
      inline def setTargetApp(value: String): Self = StObject.set(x, "targetApp", value.asInstanceOf[js.Any])
      
      inline def setTargetAppUndefined: Self = StObject.set(x, "targetApp", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait DeviceListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DeviceContext = js.native
    
    /**
      * Streams DeviceInstance records from the API.
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
          /* item */ DeviceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DeviceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DeviceListInstanceEachOptions): Unit = js.native
    def each(
      opts: DeviceListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DeviceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a device
      *
      * @param sid - A string that uniquely identifies this Device.
      */
    def get(sid: String): DeviceContext = js.native
    
    /**
      * Retrieve a single target page of DeviceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DevicePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ DevicePage, Any]): js.Promise[DevicePage] = js.native
    def getPage(targetUrl: String): js.Promise[DevicePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DevicePage, Any]
    ): js.Promise[DevicePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DevicePage, Any]): js.Promise[DevicePage] = js.native
    
    /**
      * Lists DeviceInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DeviceInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeviceInstance], Any]): js.Promise[js.Array[DeviceInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeviceInstance], Any]
    ): js.Promise[js.Array[DeviceInstance]] = js.native
    def list(opts: DeviceListInstanceOptions): js.Promise[js.Array[DeviceInstance]] = js.native
    def list(
      opts: DeviceListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeviceInstance], Any]
    ): js.Promise[js.Array[DeviceInstance]] = js.native
    
    /**
      * Retrieve a single page of DeviceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DevicePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DevicePage, Any]): js.Promise[DevicePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DevicePage, Any]): js.Promise[DevicePage] = js.native
    def page(opts: DeviceListInstancePageOptions): js.Promise[DevicePage] = js.native
    def page(
      opts: DeviceListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DevicePage, Any]
    ): js.Promise[DevicePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
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
  trait DeviceListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DeviceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeviceListInstanceEachOptions {
    
    inline def apply(): DeviceListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceListInstanceEachOptions]
    }
    
    extension [Self <: DeviceListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ DeviceInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait DeviceListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeviceListInstanceOptions {
    
    inline def apply(): DeviceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceListInstanceOptions]
    }
    
    extension [Self <: DeviceListInstanceOptions](x: Self) {
      
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
  trait DeviceListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DeviceListInstancePageOptions {
    
    inline def apply(): DeviceListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceListInstancePageOptions]
    }
    
    extension [Self <: DeviceListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait DevicePayload
    extends StObject
       with DeviceResource
       with TwilioResponsePayload
  object DevicePayload {
    
    inline def apply(
      account_sid: String,
      app: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      logging: js.Object,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): DevicePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DevicePayload]
    }
  }
  
  trait DeviceResource extends StObject {
    
    var account_sid: String
    
    var app: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var logging: js.Object
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object DeviceResource {
    
    inline def apply(
      account_sid: String,
      app: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      logging: js.Object,
      sid: String,
      unique_name: String,
      url: String
    ): DeviceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceResource]
    }
    
    extension [Self <: DeviceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setApp(value: js.Object): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLogging(value: js.Object): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeviceSolution extends StObject
}
