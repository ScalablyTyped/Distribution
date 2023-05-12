package typings.twilio

import typings.std.Record
import typings.twilio.anon.Links
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewSyncMod.default
import typings.twilio.libRestPreviewSyncServiceSyncListSyncListItemMod.SyncListItemContext
import typings.twilio.libRestPreviewSyncServiceSyncListSyncListItemMod.SyncListItemListInstance
import typings.twilio.libRestPreviewSyncServiceSyncListSyncListPermissionMod.SyncListPermissionContext
import typings.twilio.libRestPreviewSyncServiceSyncListSyncListPermissionMod.SyncListPermissionListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceSyncListMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList", "SyncListContextImpl")
  @js.native
  open class SyncListContextImpl protected ()
    extends StObject
       with SyncListContext {
    def this(_version: default, serviceSid: String, sid: String) = this()
    
    /* protected */ var _solution: SyncListContextSolution = js.native
    
    /* protected */ var _syncListItems: js.UndefOr[SyncListItemListInstance] = js.native
    
    /* protected */ var _syncListPermissions: js.UndefOr[SyncListPermissionListInstance] = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def syncListItems: SyncListItemListInstance = js.native
    
    def syncListPermissions: SyncListPermissionListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList", "SyncListInstance")
  @js.native
  open class SyncListInstance protected () extends StObject {
    def this(_version: default, payload: SyncListResource, serviceSid: String) = this()
    def this(_version: default, payload: SyncListResource, serviceSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[SyncListContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: SyncListContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Fetch a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListInstance
      */
    def fetch(): js.Promise[SyncListInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[SyncListInstance] = js.native
    
    var links: Record[String, String] = js.native
    
    /**
      * Remove a SyncListInstance
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
      * Access the syncListItems.
      */
    def syncListItems(): SyncListItemListInstance = js.native
    
    /**
      * Access the syncListPermissions.
      */
    def syncListPermissions(): SyncListPermissionListInstance = js.native
    
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
  trait SyncListListInstance extends StObject {
    
    def apply(sid: String): SyncListContext = js.native
    
    var _solution: SyncListSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListInstance
      */
    def create(): js.Promise[SyncListInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncListInstance], Any]): js.Promise[SyncListInstance] = js.native
    /**
      * Create a SyncListInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListInstance
      */
    def create(params: SyncListListInstanceCreateOptions): js.Promise[SyncListInstance] = js.native
    def create(
      params: SyncListListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncListInstance], Any]
    ): js.Promise[SyncListInstance] = js.native
    
    /**
      * Streams SyncListInstance records from the API.
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
      * @param { SyncListListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: SyncListListInstanceEachOptions): Unit = js.native
    def each(
      params: SyncListListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): SyncListContext = js.native
    
    /**
      * Retrieve a single target page of SyncListInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[SyncListPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPage, Any]
    ): js.Promise[SyncListPage] = js.native
    
    /**
      * Lists SyncListInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncListListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncListInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListInstance], Any]): js.Promise[js.Array[SyncListInstance]] = js.native
    def list(params: SyncListListInstanceOptions): js.Promise[js.Array[SyncListInstance]] = js.native
    def list(
      params: SyncListListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListInstance], Any]
    ): js.Promise[js.Array[SyncListInstance]] = js.native
    
    /**
      * Retrieve a single page of SyncListInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncListListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[SyncListPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPage, Any]): js.Promise[SyncListPage] = js.native
    def page(params: SyncListListInstancePageOptions): js.Promise[SyncListPage] = js.native
    def page(
      params: SyncListListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPage, Any]
    ): js.Promise[SyncListPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object SyncListListInstance {
    
    @JSImport("twilio/lib/rest/preview/sync/service/syncList", "SyncListListInstance")
    @js.native
    def apply(version: default, serviceSid: String): SyncListListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList", "SyncListPage")
  @js.native
  open class SyncListPage protected ()
    extends typings.twilio.libBasePageMod.default[default, SyncListPayload, SyncListResource, SyncListInstance] {
    /**
      * Initialize the SyncListPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: SyncListSolution
    ) = this()
    
    /**
      * Build an instance of SyncListInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncListResource): SyncListInstance = js.native
  }
  
  @js.native
  trait SyncListContext extends StObject {
    
    /**
      * Fetch a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListInstance
      */
    def fetch(): js.Promise[SyncListInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncListInstance], Any]): js.Promise[SyncListInstance] = js.native
    
    /**
      * Remove a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    def syncListItems(index: Double): SyncListItemContext = js.native
    @JSName("syncListItems")
    var syncListItems_Original: SyncListItemListInstance = js.native
    
    def syncListPermissions(identity: String): SyncListPermissionContext = js.native
    @JSName("syncListPermissions")
    var syncListPermissions_Original: SyncListPermissionListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait SyncListContextSolution extends StObject {
    
    var serviceSid: String
    
    var sid: String
  }
  object SyncListContextSolution {
    
    inline def apply(serviceSid: String, sid: String): SyncListContextSolution = {
      val __obj = js.Dynamic.literal(serviceSid = serviceSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListContextSolution] (val x: Self) extends AnyVal {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncListListInstanceCreateOptions extends StObject {
    
    /**  */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object SyncListListInstanceCreateOptions {
    
    inline def apply(): SyncListListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait SyncListListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncListInstance, 
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
  object SyncListListInstanceEachOptions {
    
    inline def apply(): SyncListListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ SyncListInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait SyncListListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncListListInstanceOptions {
    
    inline def apply(): SyncListListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait SyncListListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncListListInstancePageOptions {
    
    inline def apply(): SyncListListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SyncListPayload
    extends StObject
       with TwilioResponsePayload {
    
    var lists: js.Array[SyncListResource]
  }
  object SyncListPayload {
    
    inline def apply(
      first_page_uri: String,
      lists: js.Array[SyncListResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): SyncListPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListPayload] (val x: Self) extends AnyVal {
      
      inline def setLists(value: js.Array[SyncListResource]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
      
      inline def setListsVarargs(value: SyncListResource*): Self = StObject.set(x, "lists", js.Array(value*))
    }
  }
  
  trait SyncListResource extends StObject {
    
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
  object SyncListResource {
    
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
    ): SyncListResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListResource] (val x: Self) extends AnyVal {
      
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
  
  trait SyncListSolution extends StObject {
    
    var serviceSid: String
  }
  object SyncListSolution {
    
    inline def apply(serviceSid: String): SyncListSolution = {
      val __obj = js.Dynamic.literal(serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListSolution] (val x: Self) extends AnyVal {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
}
