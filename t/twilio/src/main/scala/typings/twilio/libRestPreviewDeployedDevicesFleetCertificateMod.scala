package typings.twilio

import typings.twilio.anon.DateCreated
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewDeployedDevicesMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesFleetCertificateMod {
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/certificate", "CertificateContextImpl")
  @js.native
  open class CertificateContextImpl protected ()
    extends StObject
       with CertificateContext {
    def this(_version: default, fleetSid: String, sid: String) = this()
    
    /* protected */ var _solution: CertificateContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[CertificateInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[CertificateInstance], Any]
    ): js.Promise[CertificateInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[CertificateInstance], Any]
    ): js.Promise[CertificateInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/certificate", "CertificateInstance")
  @js.native
  open class CertificateInstance protected () extends StObject {
    def this(_version: default, payload: CertificateResource, fleetSid: String) = this()
    def this(_version: default, payload: CertificateResource, fleetSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[CertificateContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: CertificateContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * Specifies the unique string identifier of the Account responsible for this Certificate credential.
      */
    var accountSid: String = js.native
    
    /**
      * Specifies the date this Certificate credential was created, given in UTC ISO 8601 format.
      */
    var dateCreated: js.Date = js.native
    
    /**
      * Specifies the date this Certificate credential was last updated, given in UTC ISO 8601 format.
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * Specifies the unique string identifier of a Device authenticated with this Certificate credential.
      */
    var deviceSid: String = js.native
    
    /**
      * Fetch a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed CertificateInstance
      */
    def fetch(): js.Promise[CertificateInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[CertificateInstance] = js.native
    
    /**
      * Specifies the unique string identifier of the Fleet that the given Certificate credential belongs to.
      */
    var fleetSid: String = js.native
    
    /**
      * Contains a human readable descriptive text for this Certificate credential, up to 256 characters long.
      */
    var friendlyName: String = js.native
    
    /**
      * Remove a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Contains a 34 character string that uniquely identifies this Certificate credential resource.
      */
    var sid: String = js.native
    
    /**
      * Contains a unique hash of the payload of this Certificate credential, used to authenticate the Device.
      */
    var thumbprint: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): DateCreated = js.native
    
    /**
      * Update a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed CertificateInstance
      */
    def update(): js.Promise[CertificateInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[CertificateInstance] = js.native
    /**
      * Update a CertificateInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed CertificateInstance
      */
    def update(params: CertificateContextUpdateOptions): js.Promise[CertificateInstance] = js.native
    def update(
      params: CertificateContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[CertificateInstance] = js.native
    
    /**
      * Contains an absolute URL for this Certificate credential resource.
      */
    var url: String = js.native
  }
  
  @js.native
  trait CertificateListInstance extends StObject {
    
    def apply(sid: String): CertificateContext = js.native
    
    var _solution: CertificateSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a CertificateInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed CertificateInstance
      */
    def create(params: CertificateListInstanceCreateOptions): js.Promise[CertificateInstance] = js.native
    def create(
      params: CertificateListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[CertificateInstance], Any]
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
      * @param { CertificateListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ CertificateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: CertificateListInstanceEachOptions): Unit = js.native
    def each(
      params: CertificateListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CertificateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): CertificateContext = js.native
    
    /**
      * Retrieve a single target page of CertificateInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[CertificatePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificatePage, Any]
    ): js.Promise[CertificatePage] = js.native
    
    /**
      * Lists CertificateInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { CertificateListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CertificateInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CertificateInstance], Any]
    ): js.Promise[js.Array[CertificateInstance]] = js.native
    def list(params: CertificateListInstanceOptions): js.Promise[js.Array[CertificateInstance]] = js.native
    def list(
      params: CertificateListInstanceOptions,
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
      * @param { CertificateListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[CertificatePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificatePage, Any]): js.Promise[CertificatePage] = js.native
    def page(params: CertificateListInstancePageOptions): js.Promise[CertificatePage] = js.native
    def page(
      params: CertificateListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CertificatePage, Any]
    ): js.Promise[CertificatePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object CertificateListInstance {
    
    @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/certificate", "CertificateListInstance")
    @js.native
    def apply(version: default, fleetSid: String): CertificateListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/deployed_devices/fleet/certificate", "CertificatePage")
  @js.native
  open class CertificatePage protected ()
    extends typings.twilio.libBasePageMod.default[default, CertificatePayload, CertificateResource, CertificateInstance] {
    /**
      * Initialize the CertificatePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: CertificateSolution
    ) = this()
    
    /**
      * Build an instance of CertificateInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CertificateResource): CertificateInstance = js.native
  }
  
  @js.native
  trait CertificateContext extends StObject {
    
    /**
      * Fetch a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed CertificateInstance
      */
    def fetch(): js.Promise[CertificateInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[CertificateInstance], Any]
    ): js.Promise[CertificateInstance] = js.native
    
    /**
      * Remove a CertificateInstance
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
      * Update a CertificateInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed CertificateInstance
      */
    def update(): js.Promise[CertificateInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[CertificateInstance], Any]
    ): js.Promise[CertificateInstance] = js.native
    /**
      * Update a CertificateInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed CertificateInstance
      */
    def update(params: CertificateContextUpdateOptions): js.Promise[CertificateInstance] = js.native
    def update(
      params: CertificateContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[CertificateInstance], Any]
    ): js.Promise[CertificateInstance] = js.native
  }
  
  trait CertificateContextSolution extends StObject {
    
    var fleetSid: String
    
    var sid: String
  }
  object CertificateContextSolution {
    
    inline def apply(fleetSid: String, sid: String): CertificateContextSolution = {
      val __obj = js.Dynamic.literal(fleetSid = fleetSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateContextSolution] (val x: Self) extends AnyVal {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateContextUpdateOptions extends StObject {
    
    /** Provides the unique string identifier of an existing Device to become authenticated with this Certificate credential. */
    var deviceSid: js.UndefOr[String] = js.undefined
    
    /** Provides a human readable descriptive text for this Certificate credential, up to 256 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object CertificateContextUpdateOptions {
    
    inline def apply(): CertificateContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  trait CertificateListInstanceCreateOptions extends StObject {
    
    /** Provides a URL encoded representation of the public certificate in PEM format. */
    var certificateData: String
    
    /** Provides the unique string identifier of an existing Device to become authenticated with this Certificate credential. */
    var deviceSid: js.UndefOr[String] = js.undefined
    
    /** Provides a human readable descriptive text for this Certificate credential, up to 256 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object CertificateListInstanceCreateOptions {
    
    inline def apply(certificateData: String): CertificateListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(certificateData = certificateData.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setCertificateData(value: String): Self = StObject.set(x, "certificateData", value.asInstanceOf[js.Any])
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  trait CertificateListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CertificateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Filters the resulting list of Certificates by a unique string identifier of an authenticated Device. */
    var deviceSid: js.UndefOr[String] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CertificateListInstanceEachOptions {
    
    inline def apply(): CertificateListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateListInstanceEachOptions] (val x: Self) extends AnyVal {
      
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
  
  trait CertificateListInstanceOptions extends StObject {
    
    /** Filters the resulting list of Certificates by a unique string identifier of an authenticated Device. */
    var deviceSid: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CertificateListInstanceOptions {
    
    inline def apply(): CertificateListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
      
      inline def setDeviceSidUndefined: Self = StObject.set(x, "deviceSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait CertificateListInstancePageOptions extends StObject {
    
    /** Filters the resulting list of Certificates by a unique string identifier of an authenticated Device. */
    var deviceSid: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object CertificateListInstancePageOptions {
    
    inline def apply(): CertificateListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateListInstancePageOptions] (val x: Self) extends AnyVal {
      
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
       with TwilioResponsePayload {
    
    var certificates: js.Array[CertificateResource]
  }
  object CertificatePayload {
    
    inline def apply(
      certificates: js.Array[CertificateResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): CertificatePayload = {
      val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificatePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificatePayload] (val x: Self) extends AnyVal {
      
      inline def setCertificates(value: js.Array[CertificateResource]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
      
      inline def setCertificatesVarargs(value: CertificateResource*): Self = StObject.set(x, "certificates", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateResource] (val x: Self) extends AnyVal {
      
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
    
    var fleetSid: String
  }
  object CertificateSolution {
    
    inline def apply(fleetSid: String): CertificateSolution = {
      val __obj = js.Dynamic.literal(fleetSid = fleetSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateSolution] (val x: Self) extends AnyVal {
      
      inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
    }
  }
}
