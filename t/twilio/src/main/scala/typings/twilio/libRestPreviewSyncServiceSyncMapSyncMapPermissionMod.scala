package typings.twilio

import typings.twilio.anon.Manage
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewSyncMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceSyncMapSyncMapPermissionMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapPermission", "SyncMapPermissionContextImpl")
  @js.native
  open class SyncMapPermissionContextImpl protected ()
    extends StObject
       with SyncMapPermissionContext {
    def this(_version: default, serviceSid: String, mapSid: String, identity: String) = this()
    
    /* protected */ var _solution: SyncMapPermissionContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapPermission", "SyncMapPermissionInstance")
  @js.native
  open class SyncMapPermissionInstance protected () extends StObject {
    def this(_version: default, payload: SyncMapPermissionResource, serviceSid: String, mapSid: String) = this()
    def this(
      _version: default,
      payload: SyncMapPermissionResource,
      serviceSid: String,
      mapSid: String,
      identity: String
    ) = this()
    
    /* protected */ var _context: js.UndefOr[SyncMapPermissionContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: SyncMapPermissionContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique SID identifier of the Twilio Account.
      */
    var accountSid: String = js.native
    
    /**
      * Fetch a SyncMapPermissionInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapPermissionInstance
      */
    def fetch(): js.Promise[SyncMapPermissionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[SyncMapPermissionInstance] = js.native
    
    /**
      * Arbitrary string identifier representing a human user associated with an FPA token, assigned by the developer.
      */
    var identity: String = js.native
    
    /**
      * Boolean flag specifying whether the identity can delete the Sync Map.
      */
    var manage: Boolean = js.native
    
    /**
      * The unique SID identifier of the Sync Map to which the Permission applies.
      */
    var mapSid: String = js.native
    
    /**
      * Boolean flag specifying whether the identity can read the Sync Map and its Items.
      */
    var read: Boolean = js.native
    
    /**
      * Remove a SyncMapPermissionInstance
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
    def toJSON(): Manage = js.native
    
    /**
      * Update a SyncMapPermissionInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapPermissionInstance
      */
    def update(params: SyncMapPermissionContextUpdateOptions): js.Promise[SyncMapPermissionInstance] = js.native
    def update(
      params: SyncMapPermissionContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[SyncMapPermissionInstance] = js.native
    
    /**
      * Contains an absolute URL for this Sync Map Permission.
      */
    var url: String = js.native
    
    /**
      * Boolean flag specifying whether the identity can create, update and delete Items of the Sync Map.
      */
    var write: Boolean = js.native
  }
  
  @js.native
  trait SyncMapPermissionListInstance extends StObject {
    
    def apply(identity: String): SyncMapPermissionContext = js.native
    
    var _solution: SyncMapPermissionSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Streams SyncMapPermissionInstance records from the API.
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
      * @param { SyncMapPermissionListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncMapPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: SyncMapPermissionListInstanceEachOptions): Unit = js.native
    def each(
      params: SyncMapPermissionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncMapPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(identity: String): SyncMapPermissionContext = js.native
    
    /**
      * Retrieve a single target page of SyncMapPermissionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[SyncMapPermissionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionPage, Any]
    ): js.Promise[SyncMapPermissionPage] = js.native
    
    /**
      * Lists SyncMapPermissionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncMapPermissionListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncMapPermissionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapPermissionInstance], Any]
    ): js.Promise[js.Array[SyncMapPermissionInstance]] = js.native
    def list(params: SyncMapPermissionListInstanceOptions): js.Promise[js.Array[SyncMapPermissionInstance]] = js.native
    def list(
      params: SyncMapPermissionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapPermissionInstance], Any]
    ): js.Promise[js.Array[SyncMapPermissionInstance]] = js.native
    
    /**
      * Retrieve a single page of SyncMapPermissionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncMapPermissionListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[SyncMapPermissionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionPage, Any]): js.Promise[SyncMapPermissionPage] = js.native
    def page(params: SyncMapPermissionListInstancePageOptions): js.Promise[SyncMapPermissionPage] = js.native
    def page(
      params: SyncMapPermissionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionPage, Any]
    ): js.Promise[SyncMapPermissionPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object SyncMapPermissionListInstance {
    
    @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapPermission", "SyncMapPermissionListInstance")
    @js.native
    def apply(version: default, serviceSid: String, mapSid: String): SyncMapPermissionListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapPermission", "SyncMapPermissionPage")
  @js.native
  open class SyncMapPermissionPage protected ()
    extends typings.twilio.libBasePageMod.default[
          default, 
          SyncMapPermissionPayload, 
          SyncMapPermissionResource, 
          SyncMapPermissionInstance
        ] {
    /**
      * Initialize the SyncMapPermissionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: SyncMapPermissionSolution
    ) = this()
    
    /**
      * Build an instance of SyncMapPermissionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncMapPermissionResource): SyncMapPermissionInstance = js.native
  }
  
  @js.native
  trait SyncMapPermissionContext extends StObject {
    
    /**
      * Fetch a SyncMapPermissionInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapPermissionInstance
      */
    def fetch(): js.Promise[SyncMapPermissionInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncMapPermissionInstance], Any]
    ): js.Promise[SyncMapPermissionInstance] = js.native
    
    /**
      * Remove a SyncMapPermissionInstance
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
      * Update a SyncMapPermissionInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapPermissionInstance
      */
    def update(params: SyncMapPermissionContextUpdateOptions): js.Promise[SyncMapPermissionInstance] = js.native
    def update(
      params: SyncMapPermissionContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncMapPermissionInstance], Any]
    ): js.Promise[SyncMapPermissionInstance] = js.native
  }
  
  trait SyncMapPermissionContextSolution extends StObject {
    
    var identity: String
    
    var mapSid: String
    
    var serviceSid: String
  }
  object SyncMapPermissionContextSolution {
    
    inline def apply(identity: String, mapSid: String, serviceSid: String): SyncMapPermissionContextSolution = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], mapSid = mapSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapPermissionContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapPermissionContextSolution] (val x: Self) extends AnyVal {
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setMapSid(value: String): Self = StObject.set(x, "mapSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncMapPermissionContextUpdateOptions extends StObject {
    
    /** Boolean flag specifying whether the identity can delete the Sync Map. */
    var manage: Boolean
    
    /** Boolean flag specifying whether the identity can read the Sync Map. */
    var read: Boolean
    
    /** Boolean flag specifying whether the identity can create, update and delete Items of the Sync Map. */
    var write: Boolean
  }
  object SyncMapPermissionContextUpdateOptions {
    
    inline def apply(manage: Boolean, read: Boolean, write: Boolean): SyncMapPermissionContextUpdateOptions = {
      val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapPermissionContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapPermissionContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncMapPermissionListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncMapPermissionInstance, 
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
  object SyncMapPermissionListInstanceEachOptions {
    
    inline def apply(): SyncMapPermissionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapPermissionListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapPermissionListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ SyncMapPermissionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait SyncMapPermissionListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncMapPermissionListInstanceOptions {
    
    inline def apply(): SyncMapPermissionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapPermissionListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapPermissionListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait SyncMapPermissionListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncMapPermissionListInstancePageOptions {
    
    inline def apply(): SyncMapPermissionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapPermissionListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapPermissionListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SyncMapPermissionPayload
    extends StObject
       with TwilioResponsePayload {
    
    var permissions: js.Array[SyncMapPermissionResource]
  }
  object SyncMapPermissionPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      permissions: js.Array[SyncMapPermissionResource],
      previous_page_uri: String,
      uri: String
    ): SyncMapPermissionPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapPermissionPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapPermissionPayload] (val x: Self) extends AnyVal {
      
      inline def setPermissions(value: js.Array[SyncMapPermissionResource]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: SyncMapPermissionResource*): Self = StObject.set(x, "permissions", js.Array(value*))
    }
  }
  
  trait SyncMapPermissionResource extends StObject {
    
    var account_sid: String
    
    var identity: String
    
    var manage: Boolean
    
    var map_sid: String
    
    var read: Boolean
    
    var service_sid: String
    
    var url: String
    
    var write: Boolean
  }
  object SyncMapPermissionResource {
    
    inline def apply(
      account_sid: String,
      identity: String,
      manage: Boolean,
      map_sid: String,
      read: Boolean,
      service_sid: String,
      url: String,
      write: Boolean
    ): SyncMapPermissionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], map_sid = map_sid.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapPermissionResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapPermissionResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
      
      inline def setMap_sid(value: String): Self = StObject.set(x, "map_sid", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncMapPermissionSolution extends StObject {
    
    var mapSid: String
    
    var serviceSid: String
  }
  object SyncMapPermissionSolution {
    
    inline def apply(mapSid: String, serviceSid: String): SyncMapPermissionSolution = {
      val __obj = js.Dynamic.literal(mapSid = mapSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapPermissionSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapPermissionSolution] (val x: Self) extends AnyVal {
      
      inline def setMapSid(value: String): Self = StObject.set(x, "mapSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
}
