package typings.twilio

import typings.std.Record
import typings.twilio.anon.Links
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewSyncMod.default
import typings.twilio.libRestPreviewSyncServiceSyncMapSyncMapItemMod.SyncMapItemContext
import typings.twilio.libRestPreviewSyncServiceSyncMapSyncMapItemMod.SyncMapItemListInstance
import typings.twilio.libRestPreviewSyncServiceSyncMapSyncMapPermissionMod.SyncMapPermissionContext
import typings.twilio.libRestPreviewSyncServiceSyncMapSyncMapPermissionMod.SyncMapPermissionListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceSyncMapMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap", "SyncMapContextImpl")
  @js.native
  open class SyncMapContextImpl protected ()
    extends StObject
       with SyncMapContext {
    def this(_version: default, serviceSid: String, sid: String) = this()
    
    /* protected */ var _solution: SyncMapContextSolution = js.native
    
    /* protected */ var _syncMapItems: js.UndefOr[SyncMapItemListInstance] = js.native
    
    /* protected */ var _syncMapPermissions: js.UndefOr[SyncMapPermissionListInstance] = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def syncMapItems: SyncMapItemListInstance = js.native
    
    def syncMapPermissions: SyncMapPermissionListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap", "SyncMapInstance")
  @js.native
  open class SyncMapInstance protected () extends StObject {
    def this(_version: default, payload: SyncMapResource, serviceSid: String) = this()
    def this(_version: default, payload: SyncMapResource, serviceSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[SyncMapContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: SyncMapContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Fetch a SyncMapInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapInstance
      */
    def fetch(): js.Promise[SyncMapInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[SyncMapInstance] = js.native
    
    var links: Record[String, String] = js.native
    
    /**
      * Remove a SyncMapInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    var revision: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    /**
      * Access the syncMapItems.
      */
    def syncMapItems(): SyncMapItemListInstance = js.native
    
    /**
      * Access the syncMapPermissions.
      */
    def syncMapPermissions(): SyncMapPermissionListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): Links = js.native
    
    var uniqueName: String = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait SyncMapListInstance extends StObject {
    
    def apply(sid: String): SyncMapContext = js.native
    
    var _solution: SyncMapSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a SyncMapInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapInstance
      */
    def create(): js.Promise[SyncMapInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncMapInstance], Any]): js.Promise[SyncMapInstance] = js.native
    /**
      * Create a SyncMapInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapInstance
      */
    def create(params: SyncMapListInstanceCreateOptions): js.Promise[SyncMapInstance] = js.native
    def create(
      params: SyncMapListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncMapInstance], Any]
    ): js.Promise[SyncMapInstance] = js.native
    
    /**
      * Streams SyncMapInstance records from the API.
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
      * @param { SyncMapListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncMapInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: SyncMapListInstanceEachOptions): Unit = js.native
    def each(
      params: SyncMapListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncMapInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): SyncMapContext = js.native
    
    /**
      * Retrieve a single target page of SyncMapInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[SyncMapPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPage, Any]
    ): js.Promise[SyncMapPage] = js.native
    
    /**
      * Lists SyncMapInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncMapListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncMapInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapInstance], Any]): js.Promise[js.Array[SyncMapInstance]] = js.native
    def list(params: SyncMapListInstanceOptions): js.Promise[js.Array[SyncMapInstance]] = js.native
    def list(
      params: SyncMapListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapInstance], Any]
    ): js.Promise[js.Array[SyncMapInstance]] = js.native
    
    /**
      * Retrieve a single page of SyncMapInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncMapListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[SyncMapPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPage, Any]): js.Promise[SyncMapPage] = js.native
    def page(params: SyncMapListInstancePageOptions): js.Promise[SyncMapPage] = js.native
    def page(
      params: SyncMapListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPage, Any]
    ): js.Promise[SyncMapPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object SyncMapListInstance {
    
    @JSImport("twilio/lib/rest/preview/sync/service/syncMap", "SyncMapListInstance")
    @js.native
    def apply(version: default, serviceSid: String): SyncMapListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap", "SyncMapPage")
  @js.native
  open class SyncMapPage protected ()
    extends typings.twilio.libBasePageMod.default[default, SyncMapPayload, SyncMapResource, SyncMapInstance] {
    /**
      * Initialize the SyncMapPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: SyncMapSolution
    ) = this()
    
    /**
      * Build an instance of SyncMapInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncMapResource): SyncMapInstance = js.native
  }
  
  @js.native
  trait SyncMapContext extends StObject {
    
    /**
      * Fetch a SyncMapInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapInstance
      */
    def fetch(): js.Promise[SyncMapInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncMapInstance], Any]): js.Promise[SyncMapInstance] = js.native
    
    /**
      * Remove a SyncMapInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    def syncMapItems(key: String): SyncMapItemContext = js.native
    @JSName("syncMapItems")
    var syncMapItems_Original: SyncMapItemListInstance = js.native
    
    def syncMapPermissions(identity: String): SyncMapPermissionContext = js.native
    @JSName("syncMapPermissions")
    var syncMapPermissions_Original: SyncMapPermissionListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait SyncMapContextSolution extends StObject {
    
    var serviceSid: String
    
    var sid: String
  }
  object SyncMapContextSolution {
    
    inline def apply(serviceSid: String, sid: String): SyncMapContextSolution = {
      val __obj = js.Dynamic.literal(serviceSid = serviceSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapContextSolution] (val x: Self) extends AnyVal {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncMapListInstanceCreateOptions extends StObject {
    
    /**  */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object SyncMapListInstanceCreateOptions {
    
    inline def apply(): SyncMapListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait SyncMapListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncMapInstance, 
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
  object SyncMapListInstanceEachOptions {
    
    inline def apply(): SyncMapListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ SyncMapInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait SyncMapListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncMapListInstanceOptions {
    
    inline def apply(): SyncMapListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait SyncMapListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncMapListInstancePageOptions {
    
    inline def apply(): SyncMapListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SyncMapPayload
    extends StObject
       with TwilioResponsePayload {
    
    var maps: js.Array[SyncMapResource]
  }
  object SyncMapPayload {
    
    inline def apply(
      first_page_uri: String,
      maps: js.Array[SyncMapResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): SyncMapPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapPayload] (val x: Self) extends AnyVal {
      
      inline def setMaps(value: js.Array[SyncMapResource]): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
      
      inline def setMapsVarargs(value: SyncMapResource*): Self = StObject.set(x, "maps", js.Array(value*))
    }
  }
  
  trait SyncMapResource extends StObject {
    
    var account_sid: String
    
    var created_by: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var links: Record[String, String]
    
    var revision: String
    
    var service_sid: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object SyncMapResource {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      date_created: js.Date,
      date_updated: js.Date,
      links: Record[String, String],
      revision: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      url: String
    ): SyncMapResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncMapSolution extends StObject {
    
    var serviceSid: String
  }
  object SyncMapSolution {
    
    inline def apply(serviceSid: String): SyncMapSolution = {
      val __obj = js.Dynamic.literal(serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapSolution] (val x: Self) extends AnyVal {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
}
