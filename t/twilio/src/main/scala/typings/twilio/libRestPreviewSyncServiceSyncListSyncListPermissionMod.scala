package typings.twilio

import typings.twilio.anon.Identity
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewSyncMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceSyncListSyncListPermissionMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListPermission", "SyncListPermissionContextImpl")
  @js.native
  open class SyncListPermissionContextImpl protected ()
    extends StObject
       with SyncListPermissionContext {
    def this(_version: default, serviceSid: String, listSid: String, identity: String) = this()
    
    /* protected */ var _solution: SyncListPermissionContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListPermission", "SyncListPermissionInstance")
  @js.native
  open class SyncListPermissionInstance protected () extends StObject {
    def this(_version: default, payload: SyncListPermissionResource, serviceSid: String, listSid: String) = this()
    def this(
      _version: default,
      payload: SyncListPermissionResource,
      serviceSid: String,
      listSid: String,
      identity: String
    ) = this()
    
    /* protected */ var _context: js.UndefOr[SyncListPermissionContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: SyncListPermissionContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique SID identifier of the Twilio Account.
      */
    var accountSid: String = js.native
    
    /**
      * Fetch a SyncListPermissionInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListPermissionInstance
      */
    def fetch(): js.Promise[SyncListPermissionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[SyncListPermissionInstance] = js.native
    
    /**
      * Arbitrary string identifier representing a human user associated with an FPA token, assigned by the developer.
      */
    var identity: String = js.native
    
    /**
      * The unique SID identifier of the Sync List to which the Permission applies.
      */
    var listSid: String = js.native
    
    /**
      * Boolean flag specifying whether the identity can delete the Sync List.
      */
    var manage: Boolean = js.native
    
    /**
      * Boolean flag specifying whether the identity can read the Sync List and its Items.
      */
    var read: Boolean = js.native
    
    /**
      * Remove a SyncListPermissionInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * The unique SID identifier of the Sync Service Instance.
      */
    var serviceSid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): Identity = js.native
    
    /**
      * Update a SyncListPermissionInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListPermissionInstance
      */
    def update(params: SyncListPermissionContextUpdateOptions): js.Promise[SyncListPermissionInstance] = js.native
    def update(
      params: SyncListPermissionContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[SyncListPermissionInstance] = js.native
    
    /**
      * Contains an absolute URL for this Sync List Permission.
      */
    var url: String = js.native
    
    /**
      * Boolean flag specifying whether the identity can create, update and delete Items of the Sync List.
      */
    var write: Boolean = js.native
  }
  
  @js.native
  trait SyncListPermissionListInstance extends StObject {
    
    def apply(identity: String): SyncListPermissionContext = js.native
    
    var _solution: SyncListPermissionSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Streams SyncListPermissionInstance records from the API.
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
      * @param { SyncListPermissionListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncListPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: SyncListPermissionListInstanceEachOptions): Unit = js.native
    def each(
      params: SyncListPermissionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncListPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(identity: String): SyncListPermissionContext = js.native
    
    /**
      * Retrieve a single target page of SyncListPermissionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[SyncListPermissionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionPage, Any]
    ): js.Promise[SyncListPermissionPage] = js.native
    
    /**
      * Lists SyncListPermissionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncListPermissionListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncListPermissionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListPermissionInstance], Any]
    ): js.Promise[js.Array[SyncListPermissionInstance]] = js.native
    def list(params: SyncListPermissionListInstanceOptions): js.Promise[js.Array[SyncListPermissionInstance]] = js.native
    def list(
      params: SyncListPermissionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListPermissionInstance], Any]
    ): js.Promise[js.Array[SyncListPermissionInstance]] = js.native
    
    /**
      * Retrieve a single page of SyncListPermissionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncListPermissionListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[SyncListPermissionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionPage, Any]): js.Promise[SyncListPermissionPage] = js.native
    def page(params: SyncListPermissionListInstancePageOptions): js.Promise[SyncListPermissionPage] = js.native
    def page(
      params: SyncListPermissionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionPage, Any]
    ): js.Promise[SyncListPermissionPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object SyncListPermissionListInstance {
    
    @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListPermission", "SyncListPermissionListInstance")
    @js.native
    def apply(version: default, serviceSid: String, listSid: String): SyncListPermissionListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListPermission", "SyncListPermissionPage")
  @js.native
  open class SyncListPermissionPage protected ()
    extends typings.twilio.libBasePageMod.default[
          default, 
          SyncListPermissionPayload, 
          SyncListPermissionResource, 
          SyncListPermissionInstance
        ] {
    /**
      * Initialize the SyncListPermissionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: SyncListPermissionSolution
    ) = this()
    
    /**
      * Build an instance of SyncListPermissionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncListPermissionResource): SyncListPermissionInstance = js.native
  }
  
  @js.native
  trait SyncListPermissionContext extends StObject {
    
    /**
      * Fetch a SyncListPermissionInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListPermissionInstance
      */
    def fetch(): js.Promise[SyncListPermissionInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncListPermissionInstance], Any]
    ): js.Promise[SyncListPermissionInstance] = js.native
    
    /**
      * Remove a SyncListPermissionInstance
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
      * Update a SyncListPermissionInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListPermissionInstance
      */
    def update(params: SyncListPermissionContextUpdateOptions): js.Promise[SyncListPermissionInstance] = js.native
    def update(
      params: SyncListPermissionContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncListPermissionInstance], Any]
    ): js.Promise[SyncListPermissionInstance] = js.native
  }
  
  trait SyncListPermissionContextSolution extends StObject {
    
    var identity: String
    
    var listSid: String
    
    var serviceSid: String
  }
  object SyncListPermissionContextSolution {
    
    inline def apply(identity: String, listSid: String, serviceSid: String): SyncListPermissionContextSolution = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], listSid = listSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListPermissionContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListPermissionContextSolution] (val x: Self) extends AnyVal {
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setListSid(value: String): Self = StObject.set(x, "listSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncListPermissionContextUpdateOptions extends StObject {
    
    /** Boolean flag specifying whether the identity can delete the Sync List. */
    var manage: Boolean
    
    /** Boolean flag specifying whether the identity can read the Sync List. */
    var read: Boolean
    
    /** Boolean flag specifying whether the identity can create, update and delete Items of the Sync List. */
    var write: Boolean
  }
  object SyncListPermissionContextUpdateOptions {
    
    inline def apply(manage: Boolean, read: Boolean, write: Boolean): SyncListPermissionContextUpdateOptions = {
      val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListPermissionContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListPermissionContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncListPermissionListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncListPermissionInstance, 
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
  object SyncListPermissionListInstanceEachOptions {
    
    inline def apply(): SyncListPermissionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListPermissionListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListPermissionListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ SyncListPermissionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait SyncListPermissionListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncListPermissionListInstanceOptions {
    
    inline def apply(): SyncListPermissionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListPermissionListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListPermissionListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait SyncListPermissionListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncListPermissionListInstancePageOptions {
    
    inline def apply(): SyncListPermissionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListPermissionListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListPermissionListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SyncListPermissionPayload
    extends StObject
       with TwilioResponsePayload {
    
    var permissions: js.Array[SyncListPermissionResource]
  }
  object SyncListPermissionPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      permissions: js.Array[SyncListPermissionResource],
      previous_page_uri: String,
      uri: String
    ): SyncListPermissionPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListPermissionPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListPermissionPayload] (val x: Self) extends AnyVal {
      
      inline def setPermissions(value: js.Array[SyncListPermissionResource]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: SyncListPermissionResource*): Self = StObject.set(x, "permissions", js.Array(value*))
    }
  }
  
  trait SyncListPermissionResource extends StObject {
    
    var account_sid: String
    
    var identity: String
    
    var list_sid: String
    
    var manage: Boolean
    
    var read: Boolean
    
    var service_sid: String
    
    var url: String
    
    var write: Boolean
  }
  object SyncListPermissionResource {
    
    inline def apply(
      account_sid: String,
      identity: String,
      list_sid: String,
      manage: Boolean,
      read: Boolean,
      service_sid: String,
      url: String,
      write: Boolean
    ): SyncListPermissionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], list_sid = list_sid.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListPermissionResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListPermissionResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setList_sid(value: String): Self = StObject.set(x, "list_sid", value.asInstanceOf[js.Any])
      
      inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncListPermissionSolution extends StObject {
    
    var listSid: String
    
    var serviceSid: String
  }
  object SyncListPermissionSolution {
    
    inline def apply(listSid: String, serviceSid: String): SyncListPermissionSolution = {
      val __obj = js.Dynamic.literal(listSid = listSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListPermissionSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListPermissionSolution] (val x: Self) extends AnyVal {
      
      inline def setListSid(value: String): Self = StObject.set(x, "listSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
}
