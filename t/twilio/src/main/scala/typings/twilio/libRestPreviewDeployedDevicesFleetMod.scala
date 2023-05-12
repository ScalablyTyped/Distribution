package typings.twilio

import typings.std.Record
import typings.twilio.anon.AccountSid
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewDeployedDevicesFleetCertificateMod.CertificateContext
import typings.twilio.libRestPreviewDeployedDevicesFleetCertificateMod.CertificateListInstance
import typings.twilio.libRestPreviewDeployedDevicesFleetDeploymentMod.DeploymentContext
import typings.twilio.libRestPreviewDeployedDevicesFleetDeploymentMod.DeploymentListInstance
import typings.twilio.libRestPreviewDeployedDevicesFleetDeviceMod.DeviceContext
import typings.twilio.libRestPreviewDeployedDevicesFleetDeviceMod.DeviceListInstance
import typings.twilio.libRestPreviewDeployedDevicesFleetKeyMod.KeyContext
import typings.twilio.libRestPreviewDeployedDevicesFleetKeyMod.KeyListInstance
import typings.twilio.libRestPreviewDeployedDevicesMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesFleetMod {
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet", "FleetContextImpl")
  @js.native
  open class FleetContextImpl protected ()
    extends StObject
       with FleetContext {
    def this(_version: default, sid: String) = this()
    
    /* protected */ var _certificates: js.UndefOr[CertificateListInstance] = js.native
    
    /* protected */ var _deployments: js.UndefOr[DeploymentListInstance] = js.native
    
    /* protected */ var _devices: js.UndefOr[DeviceListInstance] = js.native
    
    /* protected */ var _keys: js.UndefOr[KeyListInstance] = js.native
    
    /* protected */ var _solution: FleetContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def certificates: CertificateListInstance = js.native
    
    def deployments: DeploymentListInstance = js.native
    
    def devices: DeviceListInstance = js.native
    
    def keys: KeyListInstance = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FleetInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FleetInstance], Any]
    ): js.Promise[FleetInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FleetInstance], Any]
    ): js.Promise[FleetInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet", "FleetInstance")
  @js.native
  open class FleetInstance protected () extends StObject {
    def this(_version: default, payload: FleetResource) = this()
    def this(_version: default, payload: FleetResource, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[FleetContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: FleetContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * Speicifies the unique string identifier of the Account responsible for this Fleet.
      */
    var accountSid: String = js.native
    
    /**
      * Access the certificates.
      */
    def certificates(): CertificateListInstance = js.native
    
    /**
      * Specifies the date this Fleet was created, given in UTC ISO 8601 format.
      */
    var dateCreated: js.Date = js.native
    
    /**
      * Specifies the date this Fleet was last updated, given in UTC ISO 8601 format.
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * Contains the string identifier of the automatically provisioned default Deployment of this Fleet.
      */
    var defaultDeploymentSid: String = js.native
    
    /**
      * Access the deployments.
      */
    def deployments(): DeploymentListInstance = js.native
    
    /**
      * Access the devices.
      */
    def devices(): DeviceListInstance = js.native
    
    /**
      * Fetch a FleetInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FleetInstance
      */
    def fetch(): js.Promise[FleetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[FleetInstance] = js.native
    
    /**
      * Contains a human readable descriptive text for this Fleet, up to 256 characters long.
      */
    var friendlyName: String = js.native
    
    /**
      * Access the keys.
      */
    def keys(): KeyListInstance = js.native
    
    /**
      * Contains a dictionary of URL links to nested resources of this Fleet.
      */
    var links: Record[String, String] = js.native
    
    /**
      * Remove a FleetInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Contains a 34 character string that uniquely identifies this Fleet resource.
      */
    var sid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): AccountSid = js.native
    
    /**
      * Contains a unique and addressable name of this Fleet, e.g. \'default\', up to 128 characters long.
      */
    var uniqueName: String = js.native
    
    /**
      * Update a FleetInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FleetInstance
      */
    def update(): js.Promise[FleetInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[FleetInstance] = js.native
    /**
      * Update a FleetInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FleetInstance
      */
    def update(params: FleetContextUpdateOptions): js.Promise[FleetInstance] = js.native
    def update(
      params: FleetContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[FleetInstance] = js.native
    
    /**
      * Contains an absolute URL for this Fleet resource.
      */
    var url: String = js.native
  }
  
  @js.native
  trait FleetListInstance extends StObject {
    
    def apply(sid: String): FleetContext = js.native
    
    var _solution: FleetSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a FleetInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FleetInstance
      */
    def create(): js.Promise[FleetInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FleetInstance], Any]): js.Promise[FleetInstance] = js.native
    /**
      * Create a FleetInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FleetInstance
      */
    def create(params: FleetListInstanceCreateOptions): js.Promise[FleetInstance] = js.native
    def create(
      params: FleetListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FleetInstance], Any]
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
      * @param { FleetListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ FleetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: FleetListInstanceEachOptions): Unit = js.native
    def each(
      params: FleetListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FleetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): FleetContext = js.native
    
    /**
      * Retrieve a single target page of FleetInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[FleetPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetPage, Any]): js.Promise[FleetPage] = js.native
    
    /**
      * Lists FleetInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { FleetListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FleetInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FleetInstance], Any]): js.Promise[js.Array[FleetInstance]] = js.native
    def list(params: FleetListInstanceOptions): js.Promise[js.Array[FleetInstance]] = js.native
    def list(
      params: FleetListInstanceOptions,
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
      * @param { FleetListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[FleetPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetPage, Any]): js.Promise[FleetPage] = js.native
    def page(params: FleetListInstancePageOptions): js.Promise[FleetPage] = js.native
    def page(
      params: FleetListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FleetPage, Any]
    ): js.Promise[FleetPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object FleetListInstance {
    
    @JSImport("twilio/lib/rest/preview/deployed_devices/fleet", "FleetListInstance")
    @js.native
    def apply(version: default): FleetListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet", "FleetPage")
  @js.native
  open class FleetPage protected ()
    extends typings.twilio.libBasePageMod.default[default, FleetPayload, FleetResource, FleetInstance] {
    /**
      * Initialize the FleetPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: FleetSolution
    ) = this()
    
    /**
      * Build an instance of FleetInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FleetResource): FleetInstance = js.native
  }
  
  @js.native
  trait FleetContext extends StObject {
    
    def certificates(sid: String): CertificateContext = js.native
    @JSName("certificates")
    var certificates_Original: CertificateListInstance = js.native
    
    def deployments(sid: String): DeploymentContext = js.native
    @JSName("deployments")
    var deployments_Original: DeploymentListInstance = js.native
    
    def devices(sid: String): DeviceContext = js.native
    @JSName("devices")
    var devices_Original: DeviceListInstance = js.native
    
    /**
      * Fetch a FleetInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FleetInstance
      */
    def fetch(): js.Promise[FleetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FleetInstance], Any]): js.Promise[FleetInstance] = js.native
    
    def keys(sid: String): KeyContext = js.native
    @JSName("keys")
    var keys_Original: KeyListInstance = js.native
    
    /**
      * Remove a FleetInstance
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
      * Update a FleetInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FleetInstance
      */
    def update(): js.Promise[FleetInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FleetInstance], Any]): js.Promise[FleetInstance] = js.native
    /**
      * Update a FleetInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FleetInstance
      */
    def update(params: FleetContextUpdateOptions): js.Promise[FleetInstance] = js.native
    def update(
      params: FleetContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FleetInstance], Any]
    ): js.Promise[FleetInstance] = js.native
  }
  
  trait FleetContextSolution extends StObject {
    
    var sid: String
  }
  object FleetContextSolution {
    
    inline def apply(sid: String): FleetContextSolution = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FleetContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait FleetContextUpdateOptions extends StObject {
    
    /** Provides a string identifier of a Deployment that is going to be used as a default one for this Fleet. */
    var defaultDeploymentSid: js.UndefOr[String] = js.undefined
    
    /** Provides a human readable descriptive text for this Fleet, up to 256 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object FleetContextUpdateOptions {
    
    inline def apply(): FleetContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FleetContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultDeploymentSid(value: String): Self = StObject.set(x, "defaultDeploymentSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultDeploymentSidUndefined: Self = StObject.set(x, "defaultDeploymentSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  trait FleetListInstanceCreateOptions extends StObject {
    
    /** Provides a human readable descriptive text for this Fleet, up to 256 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object FleetListInstanceCreateOptions {
    
    inline def apply(): FleetListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FleetListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  trait FleetListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FleetInstance, 
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
  object FleetListInstanceEachOptions {
    
    inline def apply(): FleetListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FleetListInstanceEachOptions] (val x: Self) extends AnyVal {
      
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
  
  trait FleetListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FleetListInstanceOptions {
    
    inline def apply(): FleetListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FleetListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait FleetListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FleetListInstancePageOptions {
    
    inline def apply(): FleetListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FleetListInstancePageOptions] (val x: Self) extends AnyVal {
      
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
       with TwilioResponsePayload {
    
    var fleets: js.Array[FleetResource]
  }
  object FleetPayload {
    
    inline def apply(
      first_page_uri: String,
      fleets: js.Array[FleetResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): FleetPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], fleets = fleets.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FleetPayload] (val x: Self) extends AnyVal {
      
      inline def setFleets(value: js.Array[FleetResource]): Self = StObject.set(x, "fleets", value.asInstanceOf[js.Any])
      
      inline def setFleetsVarargs(value: FleetResource*): Self = StObject.set(x, "fleets", js.Array(value*))
    }
  }
  
  trait FleetResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var default_deployment_sid: String
    
    var friendly_name: String
    
    var links: Record[String, String]
    
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
      links: Record[String, String],
      sid: String,
      unique_name: String,
      url: String
    ): FleetResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_deployment_sid = default_deployment_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FleetResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDefault_deployment_sid(value: String): Self = StObject.set(x, "default_deployment_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FleetSolution extends StObject
}
