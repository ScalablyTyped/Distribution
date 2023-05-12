package typings.twilio

import typings.twilio.anon.DeviceSid
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewDeployedDevicesMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesFleetKeyMod {
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/key", "KeyContextImpl")
  @js.native
  open class KeyContextImpl protected ()
    extends StObject
       with KeyContext {
    def this(_version: default, fleetSid: String, sid: String) = this()
    
    /* protected */ var _solution: KeyContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[KeyInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[KeyInstance], Any]
    ): js.Promise[KeyInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[KeyInstance], Any]
    ): js.Promise[KeyInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/key", "KeyInstance")
  @js.native
  open class KeyInstance protected () extends StObject {
    def this(_version: default, payload: KeyResource, fleetSid: String) = this()
    def this(_version: default, payload: KeyResource, fleetSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[KeyContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: KeyContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * Specifies the unique string identifier of the Account responsible for this Key credential.
      */
    var accountSid: String = js.native
    
    /**
      * Specifies the date this Key credential was created, given in UTC ISO 8601 format.
      */
    var dateCreated: js.Date = js.native
    
    /**
      * Specifies the date this Key credential was last updated, given in UTC ISO 8601 format.
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * Specifies the unique string identifier of a Device authenticated with this Key credential.
      */
    var deviceSid: String = js.native
    
    /**
      * Fetch a KeyInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed KeyInstance
      */
    def fetch(): js.Promise[KeyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[KeyInstance] = js.native
    
    /**
      * Specifies the unique string identifier of the Fleet that the given Key credential belongs to.
      */
    var fleetSid: String = js.native
    
    /**
      * Contains a human readable descriptive text for this Key credential, up to 256 characters long.
      */
    var friendlyName: String = js.native
    
    /**
      * Remove a KeyInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Contains the automatically generated secret belonging to this Key credential, used to authenticate the Device.
      */
    var secret: String = js.native
    
    /**
      * Contains a 34 character string that uniquely identifies this Key credential resource.
      */
    var sid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): DeviceSid = js.native
    
    /**
      * Update a KeyInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed KeyInstance
      */
    def update(): js.Promise[KeyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[KeyInstance] = js.native
    /**
      * Update a KeyInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed KeyInstance
      */
    def update(params: KeyContextUpdateOptions): js.Promise[KeyInstance] = js.native
    def update(
      params: KeyContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[KeyInstance] = js.native
    
    /**
      * Contains an absolute URL for this Key credential resource.
      */
    var url: String = js.native
  }
  
  @js.native
  trait KeyListInstance extends StObject {
    
    def apply(sid: String): KeyContext = js.native
    
    var _solution: KeySolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a KeyInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed KeyInstance
      */
    def create(): js.Promise[KeyInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[KeyInstance], Any]): js.Promise[KeyInstance] = js.native
    /**
      * Create a KeyInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed KeyInstance
      */
    def create(params: KeyListInstanceCreateOptions): js.Promise[KeyInstance] = js.native
    def create(
      params: KeyListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[KeyInstance], Any]
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
      * @param { KeyListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: KeyListInstanceEachOptions): Unit = js.native
    def each(
      params: KeyListInstanceEachOptions,
      callback: js.Function2[
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): KeyContext = js.native
    
    /**
      * Retrieve a single target page of KeyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[KeyPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    
    /**
      * Lists KeyInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { KeyListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[KeyInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[KeyInstance], Any]): js.Promise[js.Array[KeyInstance]] = js.native
    def list(params: KeyListInstanceOptions): js.Promise[js.Array[KeyInstance]] = js.native
    def list(
      params: KeyListInstanceOptions,
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
      * @param { KeyListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[KeyPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    def page(params: KeyListInstancePageOptions): js.Promise[KeyPage] = js.native
    def page(
      params: KeyListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]
    ): js.Promise[KeyPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object KeyListInstance {
    
    @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/key", "KeyListInstance")
    @js.native
    def apply(version: default, fleetSid: String): KeyListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/key", "KeyPage")
  @js.native
  open class KeyPage protected ()
    extends typings.twilio.libBasePageMod.default[default, KeyPayload, KeyResource, KeyInstance] {
    /**
      * Initialize the KeyPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: KeySolution
    ) = this()
    
    /**
      * Build an instance of KeyInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: KeyResource): KeyInstance = js.native
  }
  
  @js.native
  trait KeyContext extends StObject {
    
    /**
      * Fetch a KeyInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed KeyInstance
      */
    def fetch(): js.Promise[KeyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[KeyInstance], Any]): js.Promise[KeyInstance] = js.native
    
    /**
      * Remove a KeyInstance
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
      * Update a KeyInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed KeyInstance
      */
    def update(): js.Promise[KeyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[KeyInstance], Any]): js.Promise[KeyInstance] = js.native
    /**
      * Update a KeyInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed KeyInstance
      */
    def update(params: KeyContextUpdateOptions): js.Promise[KeyInstance] = js.native
    def update(
      params: KeyContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[KeyInstance], Any]
    ): js.Promise[KeyInstance] = js.native
  }
  
  trait KeyContextSolution extends StObject {
    
    var fleetSid: String
    
    var sid: String
  }
  object KeyContextSolution {
    
    inline def apply(fleetSid: String, sid: String): KeyContextSolution = {
      val __obj = js.Dynamic.literal(fleetSid = fleetSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyContextSolution] (val x: Self) extends AnyVal {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyContextUpdateOptions extends StObject {
    
    /** Provides the unique string identifier of an existing Device to become authenticated with this Key credential. */
    var deviceSid: js.UndefOr[String] = js.undefined
    
    /** Provides a human readable descriptive text for this Key credential, up to 256 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object KeyContextUpdateOptions {
    
    inline def apply(): KeyContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  trait KeyListInstanceCreateOptions extends StObject {
    
    /** Provides the unique string identifier of an existing Device to become authenticated with this Key credential. */
    var deviceSid: js.UndefOr[String] = js.undefined
    
    /** Provides a human readable descriptive text for this Key credential, up to 256 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object KeyListInstanceCreateOptions {
    
    inline def apply(): KeyListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  trait KeyListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Filters the resulting list of Keys by a unique string identifier of an authenticated Device. */
    var deviceSid: js.UndefOr[String] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object KeyListInstanceEachOptions {
    
    inline def apply(): KeyListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyListInstanceEachOptions] (val x: Self) extends AnyVal {
      
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
  
  trait KeyListInstanceOptions extends StObject {
    
    /** Filters the resulting list of Keys by a unique string identifier of an authenticated Device. */
    var deviceSid: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object KeyListInstanceOptions {
    
    inline def apply(): KeyListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait KeyListInstancePageOptions extends StObject {
    
    /** Filters the resulting list of Keys by a unique string identifier of an authenticated Device. */
    var deviceSid: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object KeyListInstancePageOptions {
    
    inline def apply(): KeyListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyListInstancePageOptions] (val x: Self) extends AnyVal {
      
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
       with TwilioResponsePayload {
    
    var keys: js.Array[KeyResource]
  }
  object KeyPayload {
    
    inline def apply(
      first_page_uri: String,
      keys: js.Array[KeyResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): KeyPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyPayload] (val x: Self) extends AnyVal {
      
      inline def setKeys(value: js.Array[KeyResource]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: KeyResource*): Self = StObject.set(x, "keys", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyResource] (val x: Self) extends AnyVal {
      
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
    
    var fleetSid: String
  }
  object KeySolution {
    
    inline def apply(fleetSid: String): KeySolution = {
      val __obj = js.Dynamic.literal(fleetSid = fleetSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeySolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeySolution] (val x: Self) extends AnyVal {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
    }
  }
}
