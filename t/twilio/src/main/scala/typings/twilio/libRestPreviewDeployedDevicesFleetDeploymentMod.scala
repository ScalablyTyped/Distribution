package typings.twilio

import typings.twilio.anon.DateUpdated
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewDeployedDevicesMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesFleetDeploymentMod {
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/deployment", "DeploymentContextImpl")
  @js.native
  open class DeploymentContextImpl protected ()
    extends StObject
       with DeploymentContext {
    def this(_version: default, fleetSid: String, sid: String) = this()
    
    /* protected */ var _solution: DeploymentContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeploymentInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeploymentInstance], Any]
    ): js.Promise[DeploymentInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeploymentInstance], Any]
    ): js.Promise[DeploymentInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/deployment", "DeploymentInstance")
  @js.native
  open class DeploymentInstance protected () extends StObject {
    def this(_version: default, payload: DeploymentResource, fleetSid: String) = this()
    def this(_version: default, payload: DeploymentResource, fleetSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[DeploymentContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: DeploymentContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * Specifies the unique string identifier of the Account responsible for this Deployment.
      */
    var accountSid: String = js.native
    
    /**
      * Specifies the date this Deployment was created, given in UTC ISO 8601 format.
      */
    var dateCreated: js.Date = js.native
    
    /**
      * Specifies the date this Deployment was last updated, given in UTC ISO 8601 format.
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * Fetch a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeploymentInstance
      */
    def fetch(): js.Promise[DeploymentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[DeploymentInstance] = js.native
    
    /**
      * Specifies the unique string identifier of the Fleet that the given Deployment belongs to.
      */
    var fleetSid: String = js.native
    
    /**
      * Contains a human readable descriptive text for this Deployment, up to 64 characters long
      */
    var friendlyName: String = js.native
    
    /**
      * Remove a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Contains a 34 character string that uniquely identifies this Deployment resource.
      */
    var sid: String = js.native
    
    /**
      * Specifies the unique string identifier of the Twilio Sync service instance linked to and accessible by this Deployment.
      */
    var syncServiceSid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): DateUpdated = js.native
    
    /**
      * Update a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeploymentInstance
      */
    def update(): js.Promise[DeploymentInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[DeploymentInstance] = js.native
    /**
      * Update a DeploymentInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeploymentInstance
      */
    def update(params: DeploymentContextUpdateOptions): js.Promise[DeploymentInstance] = js.native
    def update(
      params: DeploymentContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[DeploymentInstance] = js.native
    
    /**
      * Contains an absolute URL for this Deployment resource.
      */
    var url: String = js.native
  }
  
  @js.native
  trait DeploymentListInstance extends StObject {
    
    def apply(sid: String): DeploymentContext = js.native
    
    var _solution: DeploymentSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeploymentInstance
      */
    def create(): js.Promise[DeploymentInstance] = js.native
    def create(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeploymentInstance], Any]
    ): js.Promise[DeploymentInstance] = js.native
    /**
      * Create a DeploymentInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeploymentInstance
      */
    def create(params: DeploymentListInstanceCreateOptions): js.Promise[DeploymentInstance] = js.native
    def create(
      params: DeploymentListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeploymentInstance], Any]
    ): js.Promise[DeploymentInstance] = js.native
    
    /**
      * Streams DeploymentInstance records from the API.
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
      * @param { DeploymentListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ DeploymentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: DeploymentListInstanceEachOptions): Unit = js.native
    def each(
      params: DeploymentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DeploymentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): DeploymentContext = js.native
    
    /**
      * Retrieve a single target page of DeploymentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[DeploymentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]
    ): js.Promise[DeploymentPage] = js.native
    
    /**
      * Lists DeploymentInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { DeploymentListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeploymentInstance], Any]): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(params: DeploymentListInstanceOptions): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(
      params: DeploymentListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeploymentInstance], Any]
    ): js.Promise[js.Array[DeploymentInstance]] = js.native
    
    /**
      * Retrieve a single page of DeploymentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { DeploymentListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[DeploymentPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]): js.Promise[DeploymentPage] = js.native
    def page(params: DeploymentListInstancePageOptions): js.Promise[DeploymentPage] = js.native
    def page(
      params: DeploymentListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]
    ): js.Promise[DeploymentPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object DeploymentListInstance {
    
    @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/deployment", "DeploymentListInstance")
    @js.native
    def apply(version: default, fleetSid: String): DeploymentListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/deployment", "DeploymentPage")
  @js.native
  open class DeploymentPage protected ()
    extends typings.twilio.libBasePageMod.default[default, DeploymentPayload, DeploymentResource, DeploymentInstance] {
    /**
      * Initialize the DeploymentPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: DeploymentSolution
    ) = this()
    
    /**
      * Build an instance of DeploymentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DeploymentResource): DeploymentInstance = js.native
  }
  
  @js.native
  trait DeploymentContext extends StObject {
    
    /**
      * Fetch a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeploymentInstance
      */
    def fetch(): js.Promise[DeploymentInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeploymentInstance], Any]
    ): js.Promise[DeploymentInstance] = js.native
    
    /**
      * Remove a DeploymentInstance
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
      * Update a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeploymentInstance
      */
    def update(): js.Promise[DeploymentInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeploymentInstance], Any]
    ): js.Promise[DeploymentInstance] = js.native
    /**
      * Update a DeploymentInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DeploymentInstance
      */
    def update(params: DeploymentContextUpdateOptions): js.Promise[DeploymentInstance] = js.native
    def update(
      params: DeploymentContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DeploymentInstance], Any]
    ): js.Promise[DeploymentInstance] = js.native
  }
  
  trait DeploymentContextSolution extends StObject {
    
    var fleetSid: String
    
    var sid: String
  }
  object DeploymentContextSolution {
    
    inline def apply(fleetSid: String, sid: String): DeploymentContextSolution = {
      val __obj = js.Dynamic.literal(fleetSid = fleetSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeploymentContextSolution] (val x: Self) extends AnyVal {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeploymentContextUpdateOptions extends StObject {
    
    /** Provides a human readable descriptive text for this Deployment, up to 64 characters long */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** Provides the unique string identifier of the Twilio Sync service instance that will be linked to and accessible by this Deployment. */
    var syncServiceSid: js.UndefOr[String] = js.undefined
  }
  object DeploymentContextUpdateOptions {
    
    inline def apply(): DeploymentContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeploymentContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setSyncServiceSid(value: String): Self = StObject.set(x, "syncServiceSid", value.asInstanceOf[js.Any])
      
      inline def setSyncServiceSidUndefined: Self = StObject.set(x, "syncServiceSid", js.undefined)
    }
  }
  
  trait DeploymentListInstanceCreateOptions extends StObject {
    
    /** Provides a human readable descriptive text for this Deployment, up to 256 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** Provides the unique string identifier of the Twilio Sync service instance that will be linked to and accessible by this Deployment. */
    var syncServiceSid: js.UndefOr[String] = js.undefined
  }
  object DeploymentListInstanceCreateOptions {
    
    inline def apply(): DeploymentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeploymentListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setSyncServiceSid(value: String): Self = StObject.set(x, "syncServiceSid", value.asInstanceOf[js.Any])
      
      inline def setSyncServiceSidUndefined: Self = StObject.set(x, "syncServiceSid", js.undefined)
    }
  }
  
  trait DeploymentListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DeploymentInstance, 
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
  object DeploymentListInstanceEachOptions {
    
    inline def apply(): DeploymentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeploymentListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ DeploymentInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait DeploymentListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeploymentListInstanceOptions {
    
    inline def apply(): DeploymentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeploymentListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait DeploymentListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DeploymentListInstancePageOptions {
    
    inline def apply(): DeploymentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeploymentListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait DeploymentPayload
    extends StObject
       with TwilioResponsePayload {
    
    var deployments: js.Array[DeploymentResource]
  }
  object DeploymentPayload {
    
    inline def apply(
      deployments: js.Array[DeploymentResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): DeploymentPayload = {
      val __obj = js.Dynamic.literal(deployments = deployments.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeploymentPayload] (val x: Self) extends AnyVal {
      
      inline def setDeployments(value: js.Array[DeploymentResource]): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
      
      inline def setDeploymentsVarargs(value: DeploymentResource*): Self = StObject.set(x, "deployments", js.Array(value*))
    }
  }
  
  trait DeploymentResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var fleet_sid: String
    
    var friendly_name: String
    
    var sid: String
    
    var sync_service_sid: String
    
    var url: String
  }
  object DeploymentResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      fleet_sid: String,
      friendly_name: String,
      sid: String,
      sync_service_sid: String,
      url: String
    ): DeploymentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sync_service_sid = sync_service_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeploymentResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFleet_sid(value: String): Self = StObject.set(x, "fleet_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSync_service_sid(value: String): Self = StObject.set(x, "sync_service_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeploymentSolution extends StObject {
    
    var fleetSid: String
  }
  object DeploymentSolution {
    
    inline def apply(fleetSid: String): DeploymentSolution = {
      val __obj = js.Dynamic.literal(fleetSid = fleetSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeploymentSolution] (val x: Self) extends AnyVal {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
    }
  }
}
