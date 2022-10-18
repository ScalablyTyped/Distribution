package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesFleetCertificateMod {
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/certificate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/certificate", "CertificateContext")
  @js.native
  open class CertificateContext protected () extends StObject {
    /**
      * Initialize the CertificateContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param fleetSid - The fleet_sid
      * @param sid - A string that uniquely identifies the Certificate.
      */
    def this(version: typings.twilio.libRestPreviewDeployedDevicesMod.^, fleetSid: String, sid: String) = this()
    
    /**
      * fetch a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CertificateInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificateInstance, Any]): js.Promise[CertificateInstance] = js.native
    
    /**
      * remove a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificateInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[CertificateInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificateInstance, Any]): js.Promise[CertificateInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificateInstance, Any]
    ): js.Promise[CertificateInstance] = js.native
    def update(opts: CertificateInstanceUpdateOptions): js.Promise[CertificateInstance] = js.native
    def update(
      opts: CertificateInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificateInstance, Any]
    ): js.Promise[CertificateInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/certificate", "CertificateInstance")
  @js.native
  open class CertificateInstance protected () extends SerializableClass {
    /**
      * Initialize the CertificateContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param fleetSid - The unique identifier of the Fleet.
      * @param sid - A string that uniquely identifies the Certificate.
      */
    def this(
      version: typings.twilio.libRestPreviewDeployedDevicesMod.^,
      payload: CertificatePayload,
      fleetSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: CertificateContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var deviceSid: String = js.native
    
    /**
      * fetch a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CertificateInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CertificateInstance] = js.native
    
    var fleetSid: String = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var thumbprint: String = js.native
    
    /**
      * update a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[CertificateInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CertificateInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CertificateInstance] = js.native
    def update(opts: CertificateInstanceUpdateOptions): js.Promise[CertificateInstance] = js.native
    def update(
      opts: CertificateInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[CertificateInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CertificateList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param fleetSid - The unique identifier of the Fleet.
    */
  inline def CertificateList(version: typings.twilio.libRestPreviewDeployedDevicesMod.^, fleetSid: String): CertificateListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("CertificateList")(version.asInstanceOf[js.Any], fleetSid.asInstanceOf[js.Any])).asInstanceOf[CertificateListInstance]
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/certificate", "CertificatePage")
  @js.native
  open class CertificatePage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewDeployedDevicesMod.^, 
          CertificatePayload, 
          CertificateResource, 
          CertificateInstance
        ] {
    /**
      * Initialize the CertificatePage
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
      solution: CertificateSolution
    ) = this()
    
    /**
      * Build an instance of CertificateInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CertificatePayload): CertificateInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property deviceSid - The unique identifier of a Device to be authenticated.
    * @property friendlyName - The human readable description for this Certificate.
    */
  trait CertificateInstanceUpdateOptions extends StObject {
    
    var deviceSid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object CertificateInstanceUpdateOptions {
    
    inline def apply(): CertificateInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateInstanceUpdateOptions]
    }
    
    extension [Self <: CertificateInstanceUpdateOptions](x: Self) {
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait CertificateListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CertificateContext = js.native
    
    /**
      * create a CertificateInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CertificateListInstanceCreateOptions): js.Promise[CertificateInstance] = js.native
    def create(
      opts: CertificateListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ CertificateInstance, Any]
    ): js.Promise[CertificateInstance] = js.native
    
    /**
      * Streams CertificateInstance records from the API.
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
          /* item */ CertificateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CertificateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CertificateListInstanceEachOptions): Unit = js.native
    def each(
      opts: CertificateListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CertificateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a certificate
      *
      * @param sid - A string that uniquely identifies the Certificate.
      */
    def get(sid: String): CertificateContext = js.native
    
    /**
      * Retrieve a single target page of CertificateInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CertificatePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificatePage, Any]): js.Promise[CertificatePage] = js.native
    def getPage(targetUrl: String): js.Promise[CertificatePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificatePage, Any]
    ): js.Promise[CertificatePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificatePage, Any]
    ): js.Promise[CertificatePage] = js.native
    
    /**
      * Lists CertificateInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CertificateInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CertificateInstance], Any]
    ): js.Promise[js.Array[CertificateInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CertificateInstance], Any]
    ): js.Promise[js.Array[CertificateInstance]] = js.native
    def list(opts: CertificateListInstanceOptions): js.Promise[js.Array[CertificateInstance]] = js.native
    def list(
      opts: CertificateListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CertificateInstance], Any]
    ): js.Promise[js.Array[CertificateInstance]] = js.native
    
    /**
      * Retrieve a single page of CertificateInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CertificatePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificatePage, Any]): js.Promise[CertificatePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificatePage, Any]): js.Promise[CertificatePage] = js.native
    def page(opts: CertificateListInstancePageOptions): js.Promise[CertificatePage] = js.native
    def page(
      opts: CertificateListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificatePage, Any]
    ): js.Promise[CertificatePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property certificateData - The public certificate data.
    * @property deviceSid - The unique identifier of a Device to be authenticated.
    * @property friendlyName - The human readable description for this Certificate.
    */
  trait CertificateListInstanceCreateOptions extends StObject {
    
    var certificateData: String
    
    var deviceSid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object CertificateListInstanceCreateOptions {
    
    inline def apply(certificateData: String): CertificateListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(certificateData = certificateData.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateListInstanceCreateOptions]
    }
    
    extension [Self <: CertificateListInstanceCreateOptions](x: Self) {
      
      inline def setCertificateData(value: String): Self = StObject.set(x, "certificateData", value.asInstanceOf[js.Any])
      
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
    * @property deviceSid - Find all Certificates authenticating specified Device.
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
  trait CertificateListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CertificateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var deviceSid: js.UndefOr[String] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CertificateListInstanceEachOptions {
    
    inline def apply(): CertificateListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateListInstanceEachOptions]
    }
    
    extension [Self <: CertificateListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CertificateInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
    * @property deviceSid - Find all Certificates authenticating specified Device.
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
  trait CertificateListInstanceOptions extends StObject {
    
    var deviceSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CertificateListInstanceOptions {
    
    inline def apply(): CertificateListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateListInstanceOptions]
    }
    
    extension [Self <: CertificateListInstanceOptions](x: Self) {
      
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
    * @property deviceSid - Find all Certificates authenticating specified Device.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait CertificateListInstancePageOptions extends StObject {
    
    var deviceSid: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object CertificateListInstancePageOptions {
    
    inline def apply(): CertificateListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateListInstancePageOptions]
    }
    
    extension [Self <: CertificateListInstancePageOptions](x: Self) {
      
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
  
  trait CertificatePayload
    extends StObject
       with CertificateResource
       with TwilioResponsePayload
  object CertificatePayload {
    
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
      sid: String,
      thumbprint: String,
      uri: String,
      url: String
    ): CertificatePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], device_sid = device_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificatePayload]
    }
  }
  
  trait CertificateResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var device_sid: String
    
    var fleet_sid: String
    
    var friendly_name: String
    
    var sid: String
    
    var thumbprint: String
    
    var url: String
  }
  object CertificateResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      device_sid: String,
      fleet_sid: String,
      friendly_name: String,
      sid: String,
      thumbprint: String,
      url: String
    ): CertificateResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], device_sid = device_sid.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateResource]
    }
    
    extension [Self <: CertificateResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDevice_sid(value: String): Self = StObject.set(x, "device_sid", value.asInstanceOf[js.Any])
      
      inline def setFleet_sid(value: String): Self = StObject.set(x, "fleet_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateSolution extends StObject {
    
    var fleetSid: js.UndefOr[String] = js.undefined
  }
  object CertificateSolution {
    
    inline def apply(): CertificateSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateSolution]
    }
    
    extension [Self <: CertificateSolution](x: Self) {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
      
      inline def setFleetSidUndefined: Self = StObject.set(x, "fleetSid", js.undefined)
    }
  }
}
