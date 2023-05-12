package typings.twilio

import typings.std.Record
import typings.twilio.anon.AclEnabled
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewSyncMod.default
import typings.twilio.libRestPreviewSyncServiceDocumentMod.DocumentContext
import typings.twilio.libRestPreviewSyncServiceDocumentMod.DocumentListInstance
import typings.twilio.libRestPreviewSyncServiceSyncListMod.SyncListContext
import typings.twilio.libRestPreviewSyncServiceSyncListMod.SyncListListInstance
import typings.twilio.libRestPreviewSyncServiceSyncMapMod.SyncMapContext
import typings.twilio.libRestPreviewSyncServiceSyncMapMod.SyncMapListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service", "ServiceContextImpl")
  @js.native
  open class ServiceContextImpl protected ()
    extends StObject
       with ServiceContext {
    def this(_version: default, sid: String) = this()
    
    /* protected */ var _documents: js.UndefOr[DocumentListInstance] = js.native
    
    /* protected */ var _solution: ServiceContextSolution = js.native
    
    /* protected */ var _syncLists: js.UndefOr[SyncListListInstance] = js.native
    
    /* protected */ var _syncMaps: js.UndefOr[SyncMapListInstance] = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def documents: DocumentListInstance = js.native
    
    def syncLists: SyncListListInstance = js.native
    
    def syncMaps: SyncMapListInstance = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ServiceInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ServiceInstance], Any]
    ): js.Promise[ServiceInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ServiceInstance], Any]
    ): js.Promise[ServiceInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service", "ServiceInstance")
  @js.native
  open class ServiceInstance protected () extends StObject {
    def this(_version: default, payload: ServiceResource) = this()
    def this(_version: default, payload: ServiceResource, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[ServiceContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: ServiceContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var aclEnabled: Boolean = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the documents.
      */
    def documents(): DocumentListInstance = js.native
    
    /**
      * Fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ServiceInstance
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[ServiceInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: Record[String, String] = js.native
    
    var reachabilityWebhooksEnabled: Boolean = js.native
    
    /**
      * Remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * Access the syncLists.
      */
    def syncLists(): SyncListListInstance = js.native
    
    /**
      * Access the syncMaps.
      */
    def syncMaps(): SyncMapListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): AclEnabled = js.native
    
    /**
      * Update a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ServiceInstance
      */
    def update(): js.Promise[ServiceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[ServiceInstance] = js.native
    /**
      * Update a ServiceInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ServiceInstance
      */
    def update(params: ServiceContextUpdateOptions): js.Promise[ServiceInstance] = js.native
    def update(
      params: ServiceContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[ServiceInstance] = js.native
    
    var url: String = js.native
    
    var webhookUrl: String = js.native
  }
  
  @js.native
  trait ServiceListInstance extends StObject {
    
    def apply(sid: String): ServiceContext = js.native
    
    var _solution: ServiceSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ServiceInstance
      */
    def create(): js.Promise[ServiceInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ServiceInstance], Any]): js.Promise[ServiceInstance] = js.native
    /**
      * Create a ServiceInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ServiceInstance
      */
    def create(params: ServiceListInstanceCreateOptions): js.Promise[ServiceInstance] = js.native
    def create(
      params: ServiceListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ServiceInstance], Any]
    ): js.Promise[ServiceInstance] = js.native
    
    /**
      * Streams ServiceInstance records from the API.
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
      * @param { ServiceListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: ServiceListInstanceEachOptions): Unit = js.native
    def each(
      params: ServiceListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): ServiceContext = js.native
    
    /**
      * Retrieve a single target page of ServiceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[ServicePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]
    ): js.Promise[ServicePage] = js.native
    
    /**
      * Lists ServiceInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { ServiceListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(params: ServiceListInstanceOptions): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(
      params: ServiceListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]
    ): js.Promise[js.Array[ServiceInstance]] = js.native
    
    /**
      * Retrieve a single page of ServiceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { ServiceListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[ServicePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def page(params: ServiceListInstancePageOptions): js.Promise[ServicePage] = js.native
    def page(
      params: ServiceListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]
    ): js.Promise[ServicePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object ServiceListInstance {
    
    @JSImport("twilio/lib/rest/preview/sync/service", "ServiceListInstance")
    @js.native
    def apply(version: default): ServiceListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service", "ServicePage")
  @js.native
  open class ServicePage protected ()
    extends typings.twilio.libBasePageMod.default[default, ServicePayload, ServiceResource, ServiceInstance] {
    /**
      * Initialize the ServicePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: ServiceSolution
    ) = this()
    
    /**
      * Build an instance of ServiceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ServiceResource): ServiceInstance = js.native
  }
  
  @js.native
  trait ServiceContext extends StObject {
    
    def documents(sid: String): DocumentContext = js.native
    @JSName("documents")
    var documents_Original: DocumentListInstance = js.native
    
    /**
      * Fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ServiceInstance
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ServiceInstance], Any]): js.Promise[ServiceInstance] = js.native
    
    /**
      * Remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    def syncLists(sid: String): SyncListContext = js.native
    @JSName("syncLists")
    var syncLists_Original: SyncListListInstance = js.native
    
    def syncMaps(sid: String): SyncMapContext = js.native
    @JSName("syncMaps")
    var syncMaps_Original: SyncMapListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ServiceInstance
      */
    def update(): js.Promise[ServiceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ServiceInstance], Any]): js.Promise[ServiceInstance] = js.native
    /**
      * Update a ServiceInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed ServiceInstance
      */
    def update(params: ServiceContextUpdateOptions): js.Promise[ServiceInstance] = js.native
    def update(
      params: ServiceContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[ServiceInstance], Any]
    ): js.Promise[ServiceInstance] = js.native
  }
  
  trait ServiceContextSolution extends StObject {
    
    var sid: String
  }
  object ServiceContextSolution {
    
    inline def apply(sid: String): ServiceContextSolution = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceContextUpdateOptions extends StObject {
    
    /**  */
    var aclEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**  */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /**  */
    var reachabilityWebhooksEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**  */
    var webhookUrl: js.UndefOr[String] = js.undefined
  }
  object ServiceContextUpdateOptions {
    
    inline def apply(): ServiceContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setAclEnabled(value: Boolean): Self = StObject.set(x, "aclEnabled", value.asInstanceOf[js.Any])
      
      inline def setAclEnabledUndefined: Self = StObject.set(x, "aclEnabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setReachabilityWebhooksEnabled(value: Boolean): Self = StObject.set(x, "reachabilityWebhooksEnabled", value.asInstanceOf[js.Any])
      
      inline def setReachabilityWebhooksEnabledUndefined: Self = StObject.set(x, "reachabilityWebhooksEnabled", js.undefined)
      
      inline def setWebhookUrl(value: String): Self = StObject.set(x, "webhookUrl", value.asInstanceOf[js.Any])
      
      inline def setWebhookUrlUndefined: Self = StObject.set(x, "webhookUrl", js.undefined)
    }
  }
  
  trait ServiceListInstanceCreateOptions extends StObject {
    
    /**  */
    var aclEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**  */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /**  */
    var reachabilityWebhooksEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**  */
    var webhookUrl: js.UndefOr[String] = js.undefined
  }
  object ServiceListInstanceCreateOptions {
    
    inline def apply(): ServiceListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setAclEnabled(value: Boolean): Self = StObject.set(x, "aclEnabled", value.asInstanceOf[js.Any])
      
      inline def setAclEnabledUndefined: Self = StObject.set(x, "aclEnabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setReachabilityWebhooksEnabled(value: Boolean): Self = StObject.set(x, "reachabilityWebhooksEnabled", value.asInstanceOf[js.Any])
      
      inline def setReachabilityWebhooksEnabledUndefined: Self = StObject.set(x, "reachabilityWebhooksEnabled", js.undefined)
      
      inline def setWebhookUrl(value: String): Self = StObject.set(x, "webhookUrl", value.asInstanceOf[js.Any])
      
      inline def setWebhookUrlUndefined: Self = StObject.set(x, "webhookUrl", js.undefined)
    }
  }
  
  trait ServiceListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ServiceInstance, 
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
  object ServiceListInstanceEachOptions {
    
    inline def apply(): ServiceListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ ServiceInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait ServiceListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ServiceListInstanceOptions {
    
    inline def apply(): ServiceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait ServiceListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ServiceListInstancePageOptions {
    
    inline def apply(): ServiceListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ServicePayload
    extends StObject
       with TwilioResponsePayload {
    
    var services: js.Array[ServiceResource]
  }
  object ServicePayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      services: js.Array[ServiceResource],
      uri: String
    ): ServicePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServicePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServicePayload] (val x: Self) extends AnyVal {
      
      inline def setServices(value: js.Array[ServiceResource]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesVarargs(value: ServiceResource*): Self = StObject.set(x, "services", js.Array(value*))
    }
  }
  
  trait ServiceResource extends StObject {
    
    var account_sid: String
    
    var acl_enabled: Boolean
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: Record[String, String]
    
    var reachability_webhooks_enabled: Boolean
    
    var sid: String
    
    var url: String
    
    var webhook_url: String
  }
  object ServiceResource {
    
    inline def apply(
      account_sid: String,
      acl_enabled: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: Record[String, String],
      reachability_webhooks_enabled: Boolean,
      sid: String,
      url: String,
      webhook_url: String
    ): ServiceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], acl_enabled = acl_enabled.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], reachability_webhooks_enabled = reachability_webhooks_enabled.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAcl_enabled(value: Boolean): Self = StObject.set(x, "acl_enabled", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setReachability_webhooks_enabled(value: Boolean): Self = StObject.set(x, "reachability_webhooks_enabled", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWebhook_url(value: String): Self = StObject.set(x, "webhook_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceSolution extends StObject
}
