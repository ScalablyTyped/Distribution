package typings.twilio

import typings.twilio.anon.DateAuthenticated
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewDeployedDevicesMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesFleetDeviceMod {
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/device", "DeviceContextImpl")
  @js.native
  open class DeviceContextImpl protected ()
    extends StObject
       with DeviceContext {
    def this(_version: default, fleetSid: String, sid: String) = this()
    
    /* protected */ var _solution: DeviceContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeviceInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeviceInstance], Any]
    ): js.Promise[DeviceInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeviceInstance], Any]
    ): js.Promise[DeviceInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/device", "DeviceInstance")
  @js.native
  open class DeviceInstance protected () extends StObject {
    def this(_version: default, payload: DeviceResource, fleetSid: String) = this()
    def this(_version: default, payload: DeviceResource, fleetSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[DeviceContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: DeviceContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * Specifies the unique string identifier of the Account responsible for this Device.
      */
    var accountSid: String = js.native
    
    /**
      * Specifies the date this Device was last authenticated, given in UTC ISO 8601 format.
      */
    var dateAuthenticated: js.Date = js.native
    
    /**
      * Specifies the date this Device was created, given in UTC ISO 8601 format.
      */
    var dateCreated: js.Date = js.native
    
    /**
      * Specifies the date this Device was last updated, given in UTC ISO 8601 format.
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * Specifies the unique string identifier of the Deployment group that this Device is associated with.
      */
    var deploymentSid: String = js.native
    
    /**
      * Contains a boolean flag indicating whether the device is enabled or not, blocks device connectivity if set to false.
      */
    var enabled: Boolean = js.native
    
    /**
      * Fetch a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeviceInstance
      */
    def fetch(): js.Promise[DeviceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[DeviceInstance] = js.native
    
    /**
      * Specifies the unique string identifier of the Fleet that the given Device belongs to.
      */
    var fleetSid: String = js.native
    
    /**
      * Contains a human readable descriptive text for this Device, up to 256 characters long
      */
    var friendlyName: String = js.native
    
    /**
      * Contains an arbitrary string identifier representing a human user associated with this Device, assigned by the developer, up to 256 characters long.
      */
    var identity: String = js.native
    
    /**
      * Remove a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Contains a 34 character string that uniquely identifies this Device resource.
      */
    var sid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): DateAuthenticated = js.native
    
    /**
      * Contains a unique and addressable name of this Device, assigned by the developer, up to 128 characters long.
      */
    var uniqueName: String = js.native
    
    /**
      * Update a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeviceInstance
      */
    def update(): js.Promise[DeviceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[DeviceInstance] = js.native
    /**
      * Update a DeviceInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeviceInstance
      */
    def update(params: DeviceContextUpdateOptions): js.Promise[DeviceInstance] = js.native
    def update(
      params: DeviceContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[DeviceInstance] = js.native
    
    /**
      * Contains an absolute URL for this Device resource.
      */
    var url: String = js.native
  }
  
  @js.native
  trait DeviceListInstance extends StObject {
    
    def apply(sid: String): DeviceContext = js.native
    
    var _solution: DeviceSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeviceInstance
      */
    def create(): js.Promise[DeviceInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeviceInstance], Any]): js.Promise[DeviceInstance] = js.native
    /**
      * Create a DeviceInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeviceInstance
      */
    def create(params: DeviceListInstanceCreateOptions): js.Promise[DeviceInstance] = js.native
    def create(
      params: DeviceListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeviceInstance], Any]
    ): js.Promise[DeviceInstance] = js.native
    
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
      * @param { DeviceListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ DeviceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: DeviceListInstanceEachOptions): Unit = js.native
    def each(
      params: DeviceListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DeviceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): DeviceContext = js.native
    
    /**
      * Retrieve a single target page of DeviceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[DevicePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DevicePage, Any]
    ): js.Promise[DevicePage] = js.native
    
    /**
      * Lists DeviceInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { DeviceListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DeviceInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeviceInstance], Any]): js.Promise[js.Array[DeviceInstance]] = js.native
    def list(params: DeviceListInstanceOptions): js.Promise[js.Array[DeviceInstance]] = js.native
    def list(
      params: DeviceListInstanceOptions,
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
      * @param { DeviceListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[DevicePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DevicePage, Any]): js.Promise[DevicePage] = js.native
    def page(params: DeviceListInstancePageOptions): js.Promise[DevicePage] = js.native
    def page(
      params: DeviceListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DevicePage, Any]
    ): js.Promise[DevicePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object DeviceListInstance {
    
    @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/device", "DeviceListInstance")
    @js.native
    def apply(version: default, fleetSid: String): DeviceListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/device", "DevicePage")
  @js.native
  open class DevicePage protected ()
    extends typings.twilio.libBasePageMod.default[default, DevicePayload, DeviceResource, DeviceInstance] {
    /**
      * Initialize the DevicePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: DeviceSolution
    ) = this()
    
    /**
      * Build an instance of DeviceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DeviceResource): DeviceInstance = js.native
  }
  
  @js.native
  trait DeviceContext extends StObject {
    
    /**
      * Fetch a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeviceInstance
      */
    def fetch(): js.Promise[DeviceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeviceInstance], Any]): js.Promise[DeviceInstance] = js.native
    
    /**
      * Remove a DeviceInstance
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
      * Update a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeviceInstance
      */
    def update(): js.Promise[DeviceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeviceInstance], Any]): js.Promise[DeviceInstance] = js.native
    /**
      * Update a DeviceInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeviceInstance
      */
    def update(params: DeviceContextUpdateOptions): js.Promise[DeviceInstance] = js.native
    def update(
      params: DeviceContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeviceInstance], Any]
    ): js.Promise[DeviceInstance] = js.native
  }
  
  trait DeviceContextSolution extends StObject {
    
    var fleetSid: String
    
    var sid: String
  }
  object DeviceContextSolution {
    
    inline def apply(fleetSid: String, sid: String): DeviceContextSolution = {
      val __obj = js.Dynamic.literal(fleetSid = fleetSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceContextSolution] (val x: Self) extends AnyVal {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeviceContextUpdateOptions extends StObject {
    
    /** Specifies the unique string identifier of the Deployment group that this Device is going to be associated with. */
    var deploymentSid: js.UndefOr[String] = js.undefined
    
    /**  */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Provides a human readable descriptive text to be assigned to this Device, up to 256 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** Provides an arbitrary string identifier representing a human user to be associated with this Device, up to 256 characters long. */
    var identity: js.UndefOr[String] = js.undefined
  }
  object DeviceContextUpdateOptions {
    
    inline def apply(): DeviceContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setDeploymentSid(value: String): Self = StObject.set(x, "deploymentSid", value.asInstanceOf[js.Any])
      
      inline def setDeploymentSidUndefined: Self = StObject.set(x, "deploymentSid", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    }
  }
  
  trait DeviceListInstanceCreateOptions extends StObject {
    
    /** Specifies the unique string identifier of the Deployment group that this Device is going to be associated with. */
    var deploymentSid: js.UndefOr[String] = js.undefined
    
    /**  */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Provides a human readable descriptive text to be assigned to this Device, up to 256 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** Provides an arbitrary string identifier representing a human user to be associated with this Device, up to 256 characters long. */
    var identity: js.UndefOr[String] = js.undefined
    
    /** Provides a unique and addressable name to be assigned to this Device, to be used in addition to SID, up to 128 characters long. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DeviceListInstanceCreateOptions {
    
    inline def apply(): DeviceListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setDeploymentSid(value: String): Self = StObject.set(x, "deploymentSid", value.asInstanceOf[js.Any])
      
      inline def setDeploymentSidUndefined: Self = StObject.set(x, "deploymentSid", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait DeviceListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DeviceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Filters the resulting list of Devices by a unique string identifier of the Deployment they are associated with. */
    var deploymentSid: js.UndefOr[String] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeviceListInstanceEachOptions {
    
    inline def apply(): DeviceListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ DeviceInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDeploymentSid(value: String): Self = StObject.set(x, "deploymentSid", value.asInstanceOf[js.Any])
      
      inline def setDeploymentSidUndefined: Self = StObject.set(x, "deploymentSid", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait DeviceListInstanceOptions extends StObject {
    
    /** Filters the resulting list of Devices by a unique string identifier of the Deployment they are associated with. */
    var deploymentSid: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeviceListInstanceOptions {
    
    inline def apply(): DeviceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setDeploymentSid(value: String): Self = StObject.set(x, "deploymentSid", value.asInstanceOf[js.Any])
      
      inline def setDeploymentSidUndefined: Self = StObject.set(x, "deploymentSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait DeviceListInstancePageOptions extends StObject {
    
    /** Filters the resulting list of Devices by a unique string identifier of the Deployment they are associated with. */
    var deploymentSid: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DeviceListInstancePageOptions {
    
    inline def apply(): DeviceListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setDeploymentSid(value: String): Self = StObject.set(x, "deploymentSid", value.asInstanceOf[js.Any])
      
      inline def setDeploymentSidUndefined: Self = StObject.set(x, "deploymentSid", js.undefined)
      
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
       with TwilioResponsePayload {
    
    var devices: js.Array[DeviceResource]
  }
  object DevicePayload {
    
    inline def apply(
      devices: js.Array[DeviceResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): DevicePayload = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[DevicePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DevicePayload] (val x: Self) extends AnyVal {
      
      inline def setDevices(value: js.Array[DeviceResource]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setDevicesVarargs(value: DeviceResource*): Self = StObject.set(x, "devices", js.Array(value*))
    }
  }
  
  trait DeviceResource extends StObject {
    
    var account_sid: String
    
    var date_authenticated: js.Date
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var deployment_sid: String
    
    var enabled: Boolean
    
    var fleet_sid: String
    
    var friendly_name: String
    
    var identity: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object DeviceResource {
    
    inline def apply(
      account_sid: String,
      date_authenticated: js.Date,
      date_created: js.Date,
      date_updated: js.Date,
      deployment_sid: String,
      enabled: Boolean,
      fleet_sid: String,
      friendly_name: String,
      identity: String,
      sid: String,
      unique_name: String,
      url: String
    ): DeviceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_authenticated = date_authenticated.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], deployment_sid = deployment_sid.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_authenticated(value: js.Date): Self = StObject.set(x, "date_authenticated", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDeployment_sid(value: String): Self = StObject.set(x, "deployment_sid", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFleet_sid(value: String): Self = StObject.set(x, "fleet_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeviceSolution extends StObject {
    
    var fleetSid: String
  }
  object DeviceSolution {
    
    inline def apply(fleetSid: String): DeviceSolution = {
      val __obj = js.Dynamic.literal(fleetSid = fleetSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceSolution] (val x: Self) extends AnyVal {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
    }
  }
}
