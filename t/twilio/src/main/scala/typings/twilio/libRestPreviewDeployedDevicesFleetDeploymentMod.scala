package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesFleetDeploymentMod {
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/deployment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/deployment", "DeploymentContext")
  @js.native
  open class DeploymentContext protected () extends StObject {
    /**
      * Initialize the DeploymentContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param fleetSid - The fleet_sid
      * @param sid - A string that uniquely identifies the Deployment.
      */
    def this(version: typings.twilio.libRestPreviewDeployedDevicesMod.^, fleetSid: String, sid: String) = this()
    
    /**
      * fetch a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeploymentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentInstance, Any]): js.Promise[DeploymentInstance] = js.native
    
    /**
      * remove a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[DeploymentInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentInstance, Any]): js.Promise[DeploymentInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentInstance, Any]
    ): js.Promise[DeploymentInstance] = js.native
    def update(opts: DeploymentInstanceUpdateOptions): js.Promise[DeploymentInstance] = js.native
    def update(
      opts: DeploymentInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentInstance, Any]
    ): js.Promise[DeploymentInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/deployment", "DeploymentInstance")
  @js.native
  open class DeploymentInstance protected () extends SerializableClass {
    /**
      * Initialize the DeploymentContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param fleetSid - The unique identifier of the Fleet.
      * @param sid - A string that uniquely identifies the Deployment.
      */
    def this(
      version: typings.twilio.libRestPreviewDeployedDevicesMod.^,
      payload: DeploymentPayload,
      fleetSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: DeploymentContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeploymentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeploymentInstance] = js.native
    
    var fleetSid: String = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var syncServiceSid: String = js.native
    
    /**
      * update a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[DeploymentInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeploymentInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeploymentInstance] = js.native
    def update(opts: DeploymentInstanceUpdateOptions): js.Promise[DeploymentInstance] = js.native
    def update(
      opts: DeploymentInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[DeploymentInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the DeploymentList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param fleetSid - The unique identifier of the Fleet.
    */
  inline def DeploymentList(version: typings.twilio.libRestPreviewDeployedDevicesMod.^, fleetSid: String): DeploymentListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DeploymentList")(version.asInstanceOf[js.Any], fleetSid.asInstanceOf[js.Any])).asInstanceOf[DeploymentListInstance]
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/deployment", "DeploymentPage")
  @js.native
  open class DeploymentPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewDeployedDevicesMod.^, 
          DeploymentPayload, 
          DeploymentResource, 
          DeploymentInstance
        ] {
    /**
      * Initialize the DeploymentPage
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
      solution: DeploymentSolution
    ) = this()
    
    /**
      * Build an instance of DeploymentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DeploymentPayload): DeploymentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - A human readable description for this Deployment.
    * @property syncServiceSid - The unique identifier of the Sync service instance.
    */
  trait DeploymentInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var syncServiceSid: js.UndefOr[String] = js.undefined
  }
  object DeploymentInstanceUpdateOptions {
    
    inline def apply(): DeploymentInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentInstanceUpdateOptions]
    }
    
    extension [Self <: DeploymentInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setSyncServiceSid(value: String): Self = StObject.set(x, "syncServiceSid", value.asInstanceOf[js.Any])
      
      inline def setSyncServiceSidUndefined: Self = StObject.set(x, "syncServiceSid", js.undefined)
    }
  }
  
  @js.native
  trait DeploymentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DeploymentContext = js.native
    
    /**
      * create a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[DeploymentInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ DeploymentInstance, Any]): js.Promise[DeploymentInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ DeploymentInstance, Any]
    ): js.Promise[DeploymentInstance] = js.native
    def create(opts: DeploymentListInstanceCreateOptions): js.Promise[DeploymentInstance] = js.native
    def create(
      opts: DeploymentListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ DeploymentInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ DeploymentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DeploymentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DeploymentListInstanceEachOptions): Unit = js.native
    def each(
      opts: DeploymentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DeploymentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a deployment
      *
      * @param sid - A string that uniquely identifies the Deployment.
      */
    def get(sid: String): DeploymentContext = js.native
    
    /**
      * Retrieve a single target page of DeploymentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DeploymentPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]): js.Promise[DeploymentPage] = js.native
    def getPage(targetUrl: String): js.Promise[DeploymentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]
    ): js.Promise[DeploymentPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]
    ): js.Promise[DeploymentPage] = js.native
    
    /**
      * Lists DeploymentInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeploymentInstance], Any]): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeploymentInstance], Any]
    ): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(opts: DeploymentListInstanceOptions): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(
      opts: DeploymentListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DeploymentPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]): js.Promise[DeploymentPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]): js.Promise[DeploymentPage] = js.native
    def page(opts: DeploymentListInstancePageOptions): js.Promise[DeploymentPage] = js.native
    def page(
      opts: DeploymentListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]
    ): js.Promise[DeploymentPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - A human readable description for this Deployment.
    * @property syncServiceSid - The unique identifier of the Sync service instance.
    */
  trait DeploymentListInstanceCreateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var syncServiceSid: js.UndefOr[String] = js.undefined
  }
  object DeploymentListInstanceCreateOptions {
    
    inline def apply(): DeploymentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstanceCreateOptions]
    }
    
    extension [Self <: DeploymentListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setSyncServiceSid(value: String): Self = StObject.set(x, "syncServiceSid", value.asInstanceOf[js.Any])
      
      inline def setSyncServiceSidUndefined: Self = StObject.set(x, "syncServiceSid", js.undefined)
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
  trait DeploymentListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DeploymentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeploymentListInstanceEachOptions {
    
    inline def apply(): DeploymentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstanceEachOptions]
    }
    
    extension [Self <: DeploymentListInstanceEachOptions](x: Self) {
      
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
  trait DeploymentListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeploymentListInstanceOptions {
    
    inline def apply(): DeploymentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstanceOptions]
    }
    
    extension [Self <: DeploymentListInstanceOptions](x: Self) {
      
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
  trait DeploymentListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DeploymentListInstancePageOptions {
    
    inline def apply(): DeploymentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstancePageOptions]
    }
    
    extension [Self <: DeploymentListInstancePageOptions](x: Self) {
      
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
       with DeploymentResource
       with TwilioResponsePayload
  object DeploymentPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      fleet_sid: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      sync_service_sid: String,
      uri: String,
      url: String
    ): DeploymentPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sync_service_sid = sync_service_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentPayload]
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
    
    extension [Self <: DeploymentResource](x: Self) {
      
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
    
    var fleetSid: js.UndefOr[String] = js.undefined
  }
  object DeploymentSolution {
    
    inline def apply(): DeploymentSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentSolution]
    }
    
    extension [Self <: DeploymentSolution](x: Self) {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
      
      inline def setFleetSidUndefined: Self = StObject.set(x, "fleetSid", js.undefined)
    }
  }
}
