package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fleetKeyMod {
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/key", "KeyContext")
  @js.native
  open class KeyContext protected () extends StObject {
    /**
      * Initialize the KeyContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param fleetSid - The fleet_sid
      * @param sid - A string that uniquely identifies the Key.
      */
    def this(version: typings.twilio.deployedDevicesMod.^, fleetSid: String, sid: String) = this()
    
    /**
      * fetch a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[KeyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyInstance, Any]): js.Promise[KeyInstance] = js.native
    
    /**
      * remove a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[KeyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyInstance, Any]): js.Promise[KeyInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyInstance, Any]): js.Promise[KeyInstance] = js.native
    def update(opts: KeyInstanceUpdateOptions): js.Promise[KeyInstance] = js.native
    def update(
      opts: KeyInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyInstance, Any]
    ): js.Promise[KeyInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/key", "KeyInstance")
  @js.native
  open class KeyInstance protected () extends SerializableClass {
    /**
      * Initialize the KeyContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param fleetSid - The unique identifier of the Fleet.
      * @param sid - A string that uniquely identifies the Key.
      */
    def this(version: typings.twilio.deployedDevicesMod.^, payload: KeyPayload, fleetSid: String, sid: String) = this()
    
    /* private */ var _proxy: KeyContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var deviceSid: String = js.native
    
    /**
      * fetch a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[KeyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[KeyInstance] = js.native
    
    var fleetSid: String = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var secret: String = js.native
    
    var sid: String = js.native
    
    /**
      * update a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[KeyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[KeyInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[KeyInstance] = js.native
    def update(opts: KeyInstanceUpdateOptions): js.Promise[KeyInstance] = js.native
    def update(
      opts: KeyInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[KeyInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the KeyList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param fleetSid - The unique identifier of the Fleet.
    */
  inline def KeyList(version: typings.twilio.deployedDevicesMod.^, fleetSid: String): KeyListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("KeyList")(version.asInstanceOf[js.Any], fleetSid.asInstanceOf[js.Any])).asInstanceOf[KeyListInstance]
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/key", "KeyPage")
  @js.native
  open class KeyPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.deployedDevicesMod.^, KeyPayload, KeyResource, KeyInstance] {
    /**
      * Initialize the KeyPage
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
      version: typings.twilio.deployedDevicesMod.^,
      response: typings.twilio.responseMod.^[String],
      solution: KeySolution
    ) = this()
    
    /**
      * Build an instance of KeyInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: KeyPayload): KeyInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property deviceSid - The unique identifier of a Key to be authenticated.
    * @property friendlyName - The human readable description for this Key.
    */
  trait KeyInstanceUpdateOptions extends StObject {
    
    var deviceSid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object KeyInstanceUpdateOptions {
    
    inline def apply(): KeyInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyInstanceUpdateOptions]
    }
    
    extension [Self <: KeyInstanceUpdateOptions](x: Self) {
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait KeyListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): KeyContext = js.native
    
    /**
      * create a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[KeyInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ KeyInstance, Any]): js.Promise[KeyInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ KeyInstance, Any]): js.Promise[KeyInstance] = js.native
    def create(opts: KeyListInstanceCreateOptions): js.Promise[KeyInstance] = js.native
    def create(
      opts: KeyListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ KeyInstance, Any]
    ): js.Promise[KeyInstance] = js.native
    
    /**
      * Streams KeyInstance records from the API.
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
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: KeyListInstanceEachOptions): Unit = js.native
    def each(
      opts: KeyListInstanceEachOptions,
      callback: js.Function2[
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a key
      *
      * @param sid - A string that uniquely identifies the Key.
      */
    def get(sid: String): KeyContext = js.native
    
    /**
      * Retrieve a single target page of KeyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[KeyPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    def getPage(targetUrl: String): js.Promise[KeyPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    
    /**
      * Lists KeyInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[KeyInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[KeyInstance], Any]): js.Promise[js.Array[KeyInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[KeyInstance], Any]
    ): js.Promise[js.Array[KeyInstance]] = js.native
    def list(opts: KeyListInstanceOptions): js.Promise[js.Array[KeyInstance]] = js.native
    def list(
      opts: KeyListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[KeyInstance], Any]
    ): js.Promise[js.Array[KeyInstance]] = js.native
    
    /**
      * Retrieve a single page of KeyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[KeyPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    def page(opts: KeyListInstancePageOptions): js.Promise[KeyPage] = js.native
    def page(
      opts: KeyListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]
    ): js.Promise[KeyPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property deviceSid - The unique identifier of a Key to be authenticated.
    * @property friendlyName - The human readable description for this Key.
    */
  trait KeyListInstanceCreateOptions extends StObject {
    
    var deviceSid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object KeyListInstanceCreateOptions {
    
    inline def apply(): KeyListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstanceCreateOptions]
    }
    
    extension [Self <: KeyListInstanceCreateOptions](x: Self) {
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
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
    * @property deviceSid - Find all Keys authenticating specified Device.
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
  trait KeyListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var deviceSid: js.UndefOr[String] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object KeyListInstanceEachOptions {
    
    inline def apply(): KeyListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstanceEachOptions]
    }
    
    extension [Self <: KeyListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ KeyInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
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
    * @property deviceSid - Find all Keys authenticating specified Device.
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
  trait KeyListInstanceOptions extends StObject {
    
    var deviceSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object KeyListInstanceOptions {
    
    inline def apply(): KeyListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstanceOptions]
    }
    
    extension [Self <: KeyListInstanceOptions](x: Self) {
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property deviceSid - Find all Keys authenticating specified Device.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait KeyListInstancePageOptions extends StObject {
    
    var deviceSid: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object KeyListInstancePageOptions {
    
    inline def apply(): KeyListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstancePageOptions]
    }
    
    extension [Self <: KeyListInstancePageOptions](x: Self) {
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait KeyPayload
    extends StObject
       with KeyResource
       with TwilioResponsePayload
  object KeyPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      device_sid: String,
      first_page_uri: String,
      fleet_sid: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      secret: String,
      sid: String,
      uri: String,
      url: String
    ): KeyPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], device_sid = device_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPayload]
    }
  }
  
  trait KeyResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var device_sid: String
    
    var fleet_sid: String
    
    var friendly_name: String
    
    var secret: String
    
    var sid: String
    
    var url: String
  }
  object KeyResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      device_sid: String,
      fleet_sid: String,
      friendly_name: String,
      secret: String,
      sid: String,
      url: String
    ): KeyResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], device_sid = device_sid.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyResource]
    }
    
    extension [Self <: KeyResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDevice_sid(value: String): Self = StObject.set(x, "device_sid", value.asInstanceOf[js.Any])
      
      inline def setFleet_sid(value: String): Self = StObject.set(x, "fleet_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeySolution extends StObject {
    
    var fleetSid: js.UndefOr[String] = js.undefined
  }
  object KeySolution {
    
    inline def apply(): KeySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeySolution]
    }
    
    extension [Self <: KeySolution](x: Self) {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
      
      inline def setFleetSidUndefined: Self = StObject.set(x, "fleetSid", js.undefined)
    }
  }
}
