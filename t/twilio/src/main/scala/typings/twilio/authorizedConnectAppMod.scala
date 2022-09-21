package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorizedConnectAppMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/authorizedConnectApp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/authorizedConnectApp", "AuthorizedConnectAppContext")
  @js.native
  open class AuthorizedConnectAppContext protected () extends StObject {
    /**
      * Initialize the AuthorizedConnectAppContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param connectAppSid - The SID of the Connect App to fetch
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, connectAppSid: String) = this()
    
    /**
      * fetch a AuthorizedConnectAppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AuthorizedConnectAppInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizedConnectAppInstance, Any]): js.Promise[AuthorizedConnectAppInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/authorizedConnectApp", "AuthorizedConnectAppInstance")
  @js.native
  open class AuthorizedConnectAppInstance protected () extends SerializableClass {
    /**
      * Initialize the AuthorizedConnectAppContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param connectAppSid - The SID of the Connect App to fetch
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: AuthorizedConnectAppPayload,
      accountSid: String,
      connectAppSid: String
    ) = this()
    
    /* private */ var _proxy: AuthorizedConnectAppContext = js.native
    
    var accountSid: String = js.native
    
    var connectAppCompanyName: String = js.native
    
    var connectAppDescription: String = js.native
    
    var connectAppFriendlyName: String = js.native
    
    var connectAppHomepageUrl: String = js.native
    
    var connectAppSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a AuthorizedConnectAppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AuthorizedConnectAppInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AuthorizedConnectAppInstance] = js.native
    
    var permissions: js.Array[AuthorizedConnectAppPermission] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the AuthorizedConnectAppList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    */
  inline def AuthorizedConnectAppList(version: typings.twilio.v2010Mod.^, accountSid: String): AuthorizedConnectAppListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AuthorizedConnectAppList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[AuthorizedConnectAppListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/authorizedConnectApp", "AuthorizedConnectAppPage")
  @js.native
  open class AuthorizedConnectAppPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          AuthorizedConnectAppPayload, 
          AuthorizedConnectAppResource, 
          AuthorizedConnectAppInstance
        ] {
    /**
      * Initialize the AuthorizedConnectAppPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AuthorizedConnectAppSolution
    ) = this()
    
    /**
      * Build an instance of AuthorizedConnectAppInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AuthorizedConnectAppPayload): AuthorizedConnectAppInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AuthorizedConnectAppListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AuthorizedConnectAppContext = js.native
    
    /**
      * Streams AuthorizedConnectAppInstance records from the API.
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
          /* item */ AuthorizedConnectAppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AuthorizedConnectAppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AuthorizedConnectAppListInstanceEachOptions): Unit = js.native
    def each(
      opts: AuthorizedConnectAppListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AuthorizedConnectAppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a authorized_connect_app
      *
      * @param connectAppSid - The SID of the Connect App to fetch
      */
    def get(connectAppSid: String): AuthorizedConnectAppContext = js.native
    
    /**
      * Retrieve a single target page of AuthorizedConnectAppInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AuthorizedConnectAppPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizedConnectAppPage, Any]): js.Promise[AuthorizedConnectAppPage] = js.native
    def getPage(targetUrl: String): js.Promise[AuthorizedConnectAppPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizedConnectAppPage, Any]
    ): js.Promise[AuthorizedConnectAppPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizedConnectAppPage, Any]
    ): js.Promise[AuthorizedConnectAppPage] = js.native
    
    /**
      * Lists AuthorizedConnectAppInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AuthorizedConnectAppInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AuthorizedConnectAppInstance], Any]
    ): js.Promise[js.Array[AuthorizedConnectAppInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AuthorizedConnectAppInstance], Any]
    ): js.Promise[js.Array[AuthorizedConnectAppInstance]] = js.native
    def list(opts: AuthorizedConnectAppListInstanceOptions): js.Promise[js.Array[AuthorizedConnectAppInstance]] = js.native
    def list(
      opts: AuthorizedConnectAppListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AuthorizedConnectAppInstance], Any]
    ): js.Promise[js.Array[AuthorizedConnectAppInstance]] = js.native
    
    /**
      * Retrieve a single page of AuthorizedConnectAppInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AuthorizedConnectAppPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizedConnectAppPage, Any]): js.Promise[AuthorizedConnectAppPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizedConnectAppPage, Any]
    ): js.Promise[AuthorizedConnectAppPage] = js.native
    def page(opts: AuthorizedConnectAppListInstancePageOptions): js.Promise[AuthorizedConnectAppPage] = js.native
    def page(
      opts: AuthorizedConnectAppListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizedConnectAppPage, Any]
    ): js.Promise[AuthorizedConnectAppPage] = js.native
    
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
  trait AuthorizedConnectAppListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AuthorizedConnectAppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AuthorizedConnectAppListInstanceEachOptions {
    
    inline def apply(): AuthorizedConnectAppListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizedConnectAppListInstanceEachOptions]
    }
    
    extension [Self <: AuthorizedConnectAppListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AuthorizedConnectAppInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AuthorizedConnectAppListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AuthorizedConnectAppListInstanceOptions {
    
    inline def apply(): AuthorizedConnectAppListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizedConnectAppListInstanceOptions]
    }
    
    extension [Self <: AuthorizedConnectAppListInstanceOptions](x: Self) {
      
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
  trait AuthorizedConnectAppListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AuthorizedConnectAppListInstancePageOptions {
    
    inline def apply(): AuthorizedConnectAppListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizedConnectAppListInstancePageOptions]
    }
    
    extension [Self <: AuthorizedConnectAppListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait AuthorizedConnectAppPayload
    extends StObject
       with AuthorizedConnectAppResource {
    
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
  object AuthorizedConnectAppPayload {
    
    inline def apply(
      account_sid: String,
      connect_app_company_name: String,
      connect_app_description: String,
      connect_app_friendly_name: String,
      connect_app_homepage_url: String,
      connect_app_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      permissions: js.Array[AuthorizedConnectAppPermission],
      previous_page_uri: String,
      uri: String
    ): AuthorizedConnectAppPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], connect_app_company_name = connect_app_company_name.asInstanceOf[js.Any], connect_app_description = connect_app_description.asInstanceOf[js.Any], connect_app_friendly_name = connect_app_friendly_name.asInstanceOf[js.Any], connect_app_homepage_url = connect_app_homepage_url.asInstanceOf[js.Any], connect_app_sid = connect_app_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizedConnectAppPayload]
    }
    
    extension [Self <: AuthorizedConnectAppPayload](x: Self) {
      
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
  trait AuthorizedConnectAppPermission extends StObject
  object AuthorizedConnectAppPermission {
    
    inline def `get-all`: typings.twilio.twilioStrings.`get-all` = "get-all".asInstanceOf[typings.twilio.twilioStrings.`get-all`]
    
    inline def `post-all`: typings.twilio.twilioStrings.`post-all` = "post-all".asInstanceOf[typings.twilio.twilioStrings.`post-all`]
  }
  
  trait AuthorizedConnectAppResource extends StObject {
    
    var account_sid: String
    
    var connect_app_company_name: String
    
    var connect_app_description: String
    
    var connect_app_friendly_name: String
    
    var connect_app_homepage_url: String
    
    var connect_app_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var permissions: js.Array[AuthorizedConnectAppPermission]
    
    var uri: String
  }
  object AuthorizedConnectAppResource {
    
    inline def apply(
      account_sid: String,
      connect_app_company_name: String,
      connect_app_description: String,
      connect_app_friendly_name: String,
      connect_app_homepage_url: String,
      connect_app_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      permissions: js.Array[AuthorizedConnectAppPermission],
      uri: String
    ): AuthorizedConnectAppResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], connect_app_company_name = connect_app_company_name.asInstanceOf[js.Any], connect_app_description = connect_app_description.asInstanceOf[js.Any], connect_app_friendly_name = connect_app_friendly_name.asInstanceOf[js.Any], connect_app_homepage_url = connect_app_homepage_url.asInstanceOf[js.Any], connect_app_sid = connect_app_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizedConnectAppResource]
    }
    
    extension [Self <: AuthorizedConnectAppResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setConnect_app_company_name(value: String): Self = StObject.set(x, "connect_app_company_name", value.asInstanceOf[js.Any])
      
      inline def setConnect_app_description(value: String): Self = StObject.set(x, "connect_app_description", value.asInstanceOf[js.Any])
      
      inline def setConnect_app_friendly_name(value: String): Self = StObject.set(x, "connect_app_friendly_name", value.asInstanceOf[js.Any])
      
      inline def setConnect_app_homepage_url(value: String): Self = StObject.set(x, "connect_app_homepage_url", value.asInstanceOf[js.Any])
      
      inline def setConnect_app_sid(value: String): Self = StObject.set(x, "connect_app_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: js.Array[AuthorizedConnectAppPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: AuthorizedConnectAppPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthorizedConnectAppSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object AuthorizedConnectAppSolution {
    
    inline def apply(): AuthorizedConnectAppSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizedConnectAppSolution]
    }
    
    extension [Self <: AuthorizedConnectAppSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
