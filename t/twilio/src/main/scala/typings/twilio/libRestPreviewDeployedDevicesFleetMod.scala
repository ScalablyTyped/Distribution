package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import typings.twilio.libRestPreviewDeployedDevicesFleetCertificateMod.CertificateContext
import typings.twilio.libRestPreviewDeployedDevicesFleetCertificateMod.CertificateListInstance
import typings.twilio.libRestPreviewDeployedDevicesFleetDeploymentMod.DeploymentContext
import typings.twilio.libRestPreviewDeployedDevicesFleetDeploymentMod.DeploymentListInstance
import typings.twilio.libRestPreviewDeployedDevicesFleetDeviceMod.DeviceContext
import typings.twilio.libRestPreviewDeployedDevicesFleetDeviceMod.DeviceListInstance
import typings.twilio.libRestPreviewDeployedDevicesFleetKeyMod.KeyContext
import typings.twilio.libRestPreviewDeployedDevicesFleetKeyMod.KeyListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesFleetMod {
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet", "FleetContext")
  @js.native
  open class FleetContext protected () extends StObject {
    /**
      * Initialize the FleetContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - A string that uniquely identifies the Fleet.
      */
    def this(version: typings.twilio.libRestPreviewDeployedDevicesMod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def certificates(sid: String): CertificateContext = js.native
    @JSName("certificates")
    var certificates_Original: CertificateListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def deployments(sid: String): DeploymentContext = js.native
    @JSName("deployments")
    var deployments_Original: DeploymentListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def devices(sid: String): DeviceContext = js.native
    @JSName("devices")
    var devices_Original: DeviceListInstance = js.native
    
    /**
      * fetch a FleetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FleetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetInstance, Any]): js.Promise[FleetInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def keys(sid: String): KeyContext = js.native
    @JSName("keys")
    var keys_Original: KeyListInstance = js.native
    
    /**
      * remove a FleetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetInstance, Any]): js.Promise[Boolean] = js.native
    
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
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet", "FleetInstance")
  @js.native
  open class FleetInstance protected () extends SerializableClass {
    /**
      * Initialize the FleetContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - A string that uniquely identifies the Fleet.
      */
    def this(version: typings.twilio.libRestPreviewDeployedDevicesMod.^, payload: FleetPayload, sid: String) = this()
    
    /* private */ var _proxy: FleetContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the certificates
      */
    def certificates(): CertificateListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var defaultDeploymentSid: String = js.native
    
    /**
      * Access the deployments
      */
    def deployments(): DeploymentListInstance = js.native
    
    /**
      * Access the devices
      */
    def devices(): DeviceListInstance = js.native
    
    /**
      * fetch a FleetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FleetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FleetInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * Access the keys
      */
    def keys(): KeyListInstance = js.native
    
    var links: String = js.native
    
    /**
      * remove a FleetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
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
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def FleetList(version: typings.twilio.libRestPreviewDeployedDevicesMod.^): FleetListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("FleetList")(version.asInstanceOf[js.Any]).asInstanceOf[FleetListInstance]
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet", "FleetPage")
  @js.native
  open class FleetPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewDeployedDevicesMod.^, 
          FleetPayload, 
          FleetResource, 
          FleetInstance
        ] {
    /**
      * Initialize the FleetPage
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
  
  /**
    * Options to pass to update
    *
    * @property defaultDeploymentSid - A default Deployment SID.
    * @property friendlyName - A human readable description for this Fleet.
    */
  trait FleetInstanceUpdateOptions extends StObject {
    
    var defaultDeploymentSid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object FleetInstanceUpdateOptions {
    
    inline def apply(): FleetInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetInstanceUpdateOptions]
    }
    
    extension [Self <: FleetInstanceUpdateOptions](x: Self) {
      
      inline def setDefaultDeploymentSid(value: String): Self = StObject.set(x, "defaultDeploymentSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultDeploymentSidUndefined: Self = StObject.set(x, "defaultDeploymentSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
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
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[FleetInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ FleetInstance, Any]): js.Promise[FleetInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ FleetInstance, Any]): js.Promise[FleetInstance] = js.native
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
      * @param sid - A string that uniquely identifies the Fleet.
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
    * @property friendlyName - A human readable description for this Fleet.
    */
  trait FleetListInstanceCreateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object FleetListInstanceCreateOptions {
    
    inline def apply(): FleetListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetListInstanceCreateOptions]
    }
    
    extension [Self <: FleetListInstanceCreateOptions](x: Self) {
      
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
  trait FleetListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  trait FleetListInstancePageOptions extends StObject {
    
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
      date_created: js.Date,
      date_updated: js.Date,
      default_deployment_sid: String,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): FleetPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_deployment_sid = default_deployment_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetPayload]
    }
  }
  
  trait FleetResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var default_deployment_sid: String
    
    var friendly_name: String
    
    var links: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object FleetResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      default_deployment_sid: String,
      friendly_name: String,
      links: String,
      sid: String,
      unique_name: String,
      url: String
    ): FleetResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_deployment_sid = default_deployment_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetResource]
    }
    
    extension [Self <: FleetResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDefault_deployment_sid(value: String): Self = StObject.set(x, "default_deployment_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FleetSolution extends StObject
}
