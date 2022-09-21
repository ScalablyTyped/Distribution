package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectAppMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/connectApp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/connectApp", "ConnectAppContext")
  @js.native
  open class ConnectAppContext protected () extends StObject {
    /**
      * Initialize the ConnectAppContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a ConnectAppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConnectAppInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppInstance, Any]): js.Promise[ConnectAppInstance] = js.native
    
    /**
      * remove a ConnectAppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ConnectAppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConnectAppInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppInstance, Any]): js.Promise[ConnectAppInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppInstance, Any]
    ): js.Promise[ConnectAppInstance] = js.native
    def update(opts: ConnectAppInstanceUpdateOptions): js.Promise[ConnectAppInstance] = js.native
    def update(
      opts: ConnectAppInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppInstance, Any]
    ): js.Promise[ConnectAppInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/connectApp", "ConnectAppInstance")
  @js.native
  open class ConnectAppInstance protected () extends SerializableClass {
    /**
      * Initialize the ConnectAppContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: ConnectAppPayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: ConnectAppContext = js.native
    
    var accountSid: String = js.native
    
    var authorizeRedirectUrl: String = js.native
    
    var companyName: String = js.native
    
    var deauthorizeCallbackMethod: String = js.native
    
    var deauthorizeCallbackUrl: String = js.native
    
    var description: String = js.native
    
    /**
      * fetch a ConnectAppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConnectAppInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConnectAppInstance] = js.native
    
    var friendlyName: String = js.native
    
    var homepageUrl: String = js.native
    
    var permissions: js.Array[ConnectAppPermission] = js.native
    
    /**
      * remove a ConnectAppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a ConnectAppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConnectAppInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConnectAppInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConnectAppInstance] = js.native
    def update(opts: ConnectAppInstanceUpdateOptions): js.Promise[ConnectAppInstance] = js.native
    def update(
      opts: ConnectAppInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ConnectAppInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the ConnectAppList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    */
  inline def ConnectAppList(version: typings.twilio.v2010Mod.^, accountSid: String): ConnectAppListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ConnectAppList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[ConnectAppListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/connectApp", "ConnectAppPage")
  @js.native
  open class ConnectAppPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, ConnectAppPayload, ConnectAppResource, ConnectAppInstance] {
    /**
      * Initialize the ConnectAppPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ConnectAppSolution
    ) = this()
    
    /**
      * Build an instance of ConnectAppInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ConnectAppPayload): ConnectAppInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property authorizeRedirectUrl - The URL to redirect the user to after authorization
    * @property companyName - The company name to set for the Connect App
    * @property deauthorizeCallbackMethod - The HTTP method to use when calling deauthorize_callback_url
    * @property deauthorizeCallbackUrl - The URL to call to de-authorize the Connect App
    * @property description - A description of the Connect App
    * @property friendlyName - A string to describe the resource
    * @property homepageUrl - A public URL where users can obtain more information
    * @property permissions - The set of permissions that your ConnectApp will request
    */
  trait ConnectAppInstanceUpdateOptions extends StObject {
    
    var authorizeRedirectUrl: js.UndefOr[String] = js.undefined
    
    var companyName: js.UndefOr[String] = js.undefined
    
    var deauthorizeCallbackMethod: js.UndefOr[String] = js.undefined
    
    var deauthorizeCallbackUrl: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var homepageUrl: js.UndefOr[String] = js.undefined
    
    var permissions: js.UndefOr[ConnectAppPermission | js.Array[ConnectAppPermission]] = js.undefined
  }
  object ConnectAppInstanceUpdateOptions {
    
    inline def apply(): ConnectAppInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectAppInstanceUpdateOptions]
    }
    
    extension [Self <: ConnectAppInstanceUpdateOptions](x: Self) {
      
      inline def setAuthorizeRedirectUrl(value: String): Self = StObject.set(x, "authorizeRedirectUrl", value.asInstanceOf[js.Any])
      
      inline def setAuthorizeRedirectUrlUndefined: Self = StObject.set(x, "authorizeRedirectUrl", js.undefined)
      
      inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
      
      inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
      
      inline def setDeauthorizeCallbackMethod(value: String): Self = StObject.set(x, "deauthorizeCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setDeauthorizeCallbackMethodUndefined: Self = StObject.set(x, "deauthorizeCallbackMethod", js.undefined)
      
      inline def setDeauthorizeCallbackUrl(value: String): Self = StObject.set(x, "deauthorizeCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setDeauthorizeCallbackUrlUndefined: Self = StObject.set(x, "deauthorizeCallbackUrl", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setHomepageUrl(value: String): Self = StObject.set(x, "homepageUrl", value.asInstanceOf[js.Any])
      
      inline def setHomepageUrlUndefined: Self = StObject.set(x, "homepageUrl", js.undefined)
      
      inline def setPermissions(value: ConnectAppPermission | js.Array[ConnectAppPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setPermissionsVarargs(value: ConnectAppPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
    }
  }
  
  @js.native
  trait ConnectAppListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ConnectAppContext = js.native
    
    /**
      * Streams ConnectAppInstance records from the API.
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
          /* item */ ConnectAppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ConnectAppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ConnectAppListInstanceEachOptions): Unit = js.native
    def each(
      opts: ConnectAppListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ConnectAppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a connect_app
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ConnectAppContext = js.native
    
    /**
      * Retrieve a single target page of ConnectAppInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ConnectAppPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppPage, Any]): js.Promise[ConnectAppPage] = js.native
    def getPage(targetUrl: String): js.Promise[ConnectAppPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppPage, Any]
    ): js.Promise[ConnectAppPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppPage, Any]
    ): js.Promise[ConnectAppPage] = js.native
    
    /**
      * Lists ConnectAppInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ConnectAppInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConnectAppInstance], Any]): js.Promise[js.Array[ConnectAppInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConnectAppInstance], Any]
    ): js.Promise[js.Array[ConnectAppInstance]] = js.native
    def list(opts: ConnectAppListInstanceOptions): js.Promise[js.Array[ConnectAppInstance]] = js.native
    def list(
      opts: ConnectAppListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConnectAppInstance], Any]
    ): js.Promise[js.Array[ConnectAppInstance]] = js.native
    
    /**
      * Retrieve a single page of ConnectAppInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ConnectAppPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppPage, Any]): js.Promise[ConnectAppPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppPage, Any]): js.Promise[ConnectAppPage] = js.native
    def page(opts: ConnectAppListInstancePageOptions): js.Promise[ConnectAppPage] = js.native
    def page(
      opts: ConnectAppListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectAppPage, Any]
    ): js.Promise[ConnectAppPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
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
  trait ConnectAppListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ConnectAppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ConnectAppListInstanceEachOptions {
    
    inline def apply(): ConnectAppListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectAppListInstanceEachOptions]
    }
    
    extension [Self <: ConnectAppListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ConnectAppInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ConnectAppListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ConnectAppListInstanceOptions {
    
    inline def apply(): ConnectAppListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectAppListInstanceOptions]
    }
    
    extension [Self <: ConnectAppListInstanceOptions](x: Self) {
      
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
  trait ConnectAppListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ConnectAppListInstancePageOptions {
    
    inline def apply(): ConnectAppListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectAppListInstancePageOptions]
    }
    
    extension [Self <: ConnectAppListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait ConnectAppPayload
    extends StObject
       with ConnectAppResource {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
  }
  object ConnectAppPayload {
    
    inline def apply(
      account_sid: String,
      authorize_redirect_url: String,
      company_name: String,
      deauthorize_callback_method: String,
      deauthorize_callback_url: String,
      description: String,
      first_page_uri: String,
      friendly_name: String,
      homepage_url: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      permissions: js.Array[ConnectAppPermission],
      previous_page_uri: String,
      sid: String,
      uri: String
    ): ConnectAppPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], authorize_redirect_url = authorize_redirect_url.asInstanceOf[js.Any], company_name = company_name.asInstanceOf[js.Any], deauthorize_callback_method = deauthorize_callback_method.asInstanceOf[js.Any], deauthorize_callback_url = deauthorize_callback_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], homepage_url = homepage_url.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectAppPayload]
    }
    
    extension [Self <: ConnectAppPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`get-all`
    - typings.twilio.twilioStrings.`post-all`
  */
  trait ConnectAppPermission extends StObject
  object ConnectAppPermission {
    
    inline def `get-all`: typings.twilio.twilioStrings.`get-all` = "get-all".asInstanceOf[typings.twilio.twilioStrings.`get-all`]
    
    inline def `post-all`: typings.twilio.twilioStrings.`post-all` = "post-all".asInstanceOf[typings.twilio.twilioStrings.`post-all`]
  }
  
  trait ConnectAppResource extends StObject {
    
    var account_sid: String
    
    var authorize_redirect_url: String
    
    var company_name: String
    
    var deauthorize_callback_method: String
    
    var deauthorize_callback_url: String
    
    var description: String
    
    var friendly_name: String
    
    var homepage_url: String
    
    var permissions: js.Array[ConnectAppPermission]
    
    var sid: String
    
    var uri: String
  }
  object ConnectAppResource {
    
    inline def apply(
      account_sid: String,
      authorize_redirect_url: String,
      company_name: String,
      deauthorize_callback_method: String,
      deauthorize_callback_url: String,
      description: String,
      friendly_name: String,
      homepage_url: String,
      permissions: js.Array[ConnectAppPermission],
      sid: String,
      uri: String
    ): ConnectAppResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], authorize_redirect_url = authorize_redirect_url.asInstanceOf[js.Any], company_name = company_name.asInstanceOf[js.Any], deauthorize_callback_method = deauthorize_callback_method.asInstanceOf[js.Any], deauthorize_callback_url = deauthorize_callback_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], homepage_url = homepage_url.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectAppResource]
    }
    
    extension [Self <: ConnectAppResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAuthorize_redirect_url(value: String): Self = StObject.set(x, "authorize_redirect_url", value.asInstanceOf[js.Any])
      
      inline def setCompany_name(value: String): Self = StObject.set(x, "company_name", value.asInstanceOf[js.Any])
      
      inline def setDeauthorize_callback_method(value: String): Self = StObject.set(x, "deauthorize_callback_method", value.asInstanceOf[js.Any])
      
      inline def setDeauthorize_callback_url(value: String): Self = StObject.set(x, "deauthorize_callback_url", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setHomepage_url(value: String): Self = StObject.set(x, "homepage_url", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: js.Array[ConnectAppPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: ConnectAppPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectAppSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object ConnectAppSolution {
    
    inline def apply(): ConnectAppSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectAppSolution]
    }
    
    extension [Self <: ConnectAppSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
