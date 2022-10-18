package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesFleetDeviceMod {
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/device", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/device", "DeviceContext")
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
      * @param fleetSid - The fleet_sid
      * @param sid - A string that uniquely identifies the Device.
      */
    def this(version: typings.twilio.libRestPreviewDeployedDevicesMod.^, fleetSid: String, sid: String) = this()
    
    /**
      * fetch a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeviceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeviceInstance, Any]): js.Promise[DeviceInstance] = js.native
    
    /**
      * remove a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeviceInstance, Any]): js.Promise[Boolean] = js.native
    
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
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/device", "DeviceInstance")
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
      * @param fleetSid - The unique identifier of the Fleet.
      * @param sid - A string that uniquely identifies the Device.
      */
    def this(
      version: typings.twilio.libRestPreviewDeployedDevicesMod.^,
      payload: DevicePayload,
      fleetSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: DeviceContext = js.native
    
    var accountSid: String = js.native
    
    var dateAuthenticated: js.Date = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var deploymentSid: String = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * fetch a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeviceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeviceInstance] = js.native
    
    var fleetSid: String = js.native
    
    var friendlyName: String = js.native
    
    var identity: String = js.native
    
    /**
      * remove a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
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
    * @param fleetSid - The unique identifier of the Fleet.
    */
  inline def DeviceList(version: typings.twilio.libRestPreviewDeployedDevicesMod.^, fleetSid: String): DeviceListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DeviceList")(version.asInstanceOf[js.Any], fleetSid.asInstanceOf[js.Any])).asInstanceOf[DeviceListInstance]
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/device", "DevicePage")
  @js.native
  open class DevicePage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewDeployedDevicesMod.^, 
          DevicePayload, 
          DeviceResource, 
          DeviceInstance
        ] {
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
      version: typings.twilio.libRestPreviewDeployedDevicesMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
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
    * @property deploymentSid - The unique SID of the Deployment group.
    * @property enabled - The enabled
    * @property friendlyName - A human readable description for this Device.
    * @property identity - An identifier of the Device user.
    */
  trait DeviceInstanceUpdateOptions extends StObject {
    
    var deploymentSid: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
  }
  object DeviceInstanceUpdateOptions {
    
    inline def apply(): DeviceInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceInstanceUpdateOptions]
    }
    
    extension [Self <: DeviceInstanceUpdateOptions](x: Self) {
      
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
  
  @js.native
  trait DeviceListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DeviceContext = js.native
    
    /**
      * create a DeviceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[DeviceInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ DeviceInstance, Any]): js.Promise[DeviceInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ DeviceInstance, Any]): js.Promise[DeviceInstance] = js.native
    def create(opts: DeviceListInstanceCreateOptions): js.Promise[DeviceInstance] = js.native
    def create(
      opts: DeviceListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ DeviceInstance, Any]
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
      * @param sid - A string that uniquely identifies the Device.
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
    * Options to pass to create
    *
    * @property deploymentSid - The unique SID of the Deployment group.
    * @property enabled - The enabled
    * @property friendlyName - A human readable description for this Device.
    * @property identity - An identifier of the Device user.
    * @property uniqueName - A unique, addressable name of this Device.
    */
  trait DeviceListInstanceCreateOptions extends StObject {
    
    var deploymentSid: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DeviceListInstanceCreateOptions {
    
    inline def apply(): DeviceListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceListInstanceCreateOptions]
    }
    
    extension [Self <: DeviceListInstanceCreateOptions](x: Self) {
      
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
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property deploymentSid - Find all Devices grouped under the specified Deployment.
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
    
    var deploymentSid: js.UndefOr[String] = js.undefined
    
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
  
  /**
    * Options to pass to list
    *
    * @property deploymentSid - Find all Devices grouped under the specified Deployment.
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
    
    var deploymentSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeviceListInstanceOptions {
    
    inline def apply(): DeviceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceListInstanceOptions]
    }
    
    extension [Self <: DeviceListInstanceOptions](x: Self) {
      
      inline def setDeploymentSid(value: String): Self = StObject.set(x, "deploymentSid", value.asInstanceOf[js.Any])
      
      inline def setDeploymentSidUndefined: Self = StObject.set(x, "deploymentSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property deploymentSid - Find all Devices grouped under the specified Deployment.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait DeviceListInstancePageOptions extends StObject {
    
    var deploymentSid: js.UndefOr[String] = js.undefined
    
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
       with DeviceResource
       with TwilioResponsePayload
  object DevicePayload {
    
    inline def apply(
      account_sid: String,
      date_authenticated: js.Date,
      date_created: js.Date,
      date_updated: js.Date,
      deployment_sid: String,
      enabled: Boolean,
      first_page_uri: String,
      fleet_sid: String,
      friendly_name: String,
      identity: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): DevicePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_authenticated = date_authenticated.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], deployment_sid = deployment_sid.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DevicePayload]
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
    
    extension [Self <: DeviceResource](x: Self) {
      
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
    
    var fleetSid: js.UndefOr[String] = js.undefined
  }
  object DeviceSolution {
    
    inline def apply(): DeviceSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceSolution]
    }
    
    extension [Self <: DeviceSolution](x: Self) {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
      
      inline def setFleetSidUndefined: Self = StObject.set(x, "fleetSid", js.undefined)
    }
  }
}
