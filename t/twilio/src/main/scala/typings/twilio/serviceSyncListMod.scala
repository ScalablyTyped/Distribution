package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.syncListSyncListItemMod.SyncListItemContext
import typings.twilio.syncListSyncListItemMod.SyncListItemListInstance
import typings.twilio.syncListSyncListPermissionMod.SyncListPermissionContext
import typings.twilio.syncListSyncListPermissionMod.SyncListPermissionListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceSyncListMod {
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncList", "SyncListContext")
  @js.native
  open class SyncListContext protected () extends StObject {
    /**
      * Initialize the SyncListContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Sync Service with the Sync List resource to fetch
      * @param sid - The SID of the Sync List resource to fetch
      */
    def this(version: typings.twilio.syncV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncListInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListInstance, Any]): js.Promise[SyncListInstance] = js.native
    
    /**
      * remove a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def syncListItems(sid: String): SyncListItemContext = js.native
    @JSName("syncListItems")
    var syncListItems_Original: SyncListItemListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def syncListPermissions(sid: String): SyncListPermissionContext = js.native
    @JSName("syncListPermissions")
    var syncListPermissions_Original: SyncListPermissionListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SyncListInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListInstance, Any]): js.Promise[SyncListInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListInstance, Any]): js.Promise[SyncListInstance] = js.native
    def update(opts: SyncListInstanceUpdateOptions): js.Promise[SyncListInstance] = js.native
    def update(
      opts: SyncListInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListInstance, Any]
    ): js.Promise[SyncListInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncList", "SyncListInstance")
  @js.native
  open class SyncListInstance protected () extends SerializableClass {
    /**
      * Initialize the SyncListContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Sync Service that the resource is associated with
      * @param sid - The SID of the Sync List resource to fetch
      */
    def this(version: typings.twilio.syncV1Mod.^, payload: SyncListPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: SyncListContext = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateExpires: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncListInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncListInstance] = js.native
    
    var links: String = js.native
    
    /**
      * remove a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var revision: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    /**
      * Access the syncListItems
      */
    def syncListItems(): SyncListItemListInstance = js.native
    
    /**
      * Access the syncListPermissions
      */
    def syncListPermissions(): SyncListPermissionListInstance = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SyncListInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncListInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncListInstance] = js.native
    def update(opts: SyncListInstanceUpdateOptions): js.Promise[SyncListInstance] = js.native
    def update(
      opts: SyncListInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SyncListInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SyncListList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Sync Service that the resource is associated with
    */
  inline def SyncListList(version: typings.twilio.syncV1Mod.^, serviceSid: String): SyncListListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncListList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[SyncListListInstance]
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncList", "SyncListPage")
  @js.native
  open class SyncListPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.syncV1Mod.^, SyncListPayload, SyncListResource, SyncListInstance] {
    /**
      * Initialize the SyncListPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.syncV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SyncListSolution
    ) = this()
    
    /**
      * Build an instance of SyncListInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncListPayload): SyncListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property collectionTtl - How long, in seconds, before the Sync List expires and is deleted
    * @property ttl - An alias for collection_ttl
    */
  trait SyncListInstanceUpdateOptions extends StObject {
    
    var collectionTtl: js.UndefOr[Double] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object SyncListInstanceUpdateOptions {
    
    inline def apply(): SyncListInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListInstanceUpdateOptions]
    }
    
    extension [Self <: SyncListInstanceUpdateOptions](x: Self) {
      
      inline def setCollectionTtl(value: Double): Self = StObject.set(x, "collectionTtl", value.asInstanceOf[js.Any])
      
      inline def setCollectionTtlUndefined: Self = StObject.set(x, "collectionTtl", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait SyncListListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SyncListContext = js.native
    
    /**
      * create a SyncListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[SyncListInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncListInstance, Any]): js.Promise[SyncListInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncListInstance, Any]): js.Promise[SyncListInstance] = js.native
    def create(opts: SyncListListInstanceCreateOptions): js.Promise[SyncListInstance] = js.native
    def create(
      opts: SyncListListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncListInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SyncListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SyncListListInstanceEachOptions): Unit = js.native
    def each(
      opts: SyncListListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sync_list
      *
      * @param sid - The SID of the Sync List resource to fetch
      */
    def get(sid: String): SyncListContext = js.native
    
    /**
      * Retrieve a single target page of SyncListInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SyncListPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPage, Any]): js.Promise[SyncListPage] = js.native
    def getPage(targetUrl: String): js.Promise[SyncListPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPage, Any]
    ): js.Promise[SyncListPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPage, Any]
    ): js.Promise[SyncListPage] = js.native
    
    /**
      * Lists SyncListInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncListInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListInstance], Any]): js.Promise[js.Array[SyncListInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListInstance], Any]
    ): js.Promise[js.Array[SyncListInstance]] = js.native
    def list(opts: SyncListListInstanceOptions): js.Promise[js.Array[SyncListInstance]] = js.native
    def list(
      opts: SyncListListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SyncListPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPage, Any]): js.Promise[SyncListPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPage, Any]): js.Promise[SyncListPage] = js.native
    def page(opts: SyncListListInstancePageOptions): js.Promise[SyncListPage] = js.native
    def page(
      opts: SyncListListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPage, Any]
    ): js.Promise[SyncListPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property collectionTtl - How long, in seconds, before the Sync List expires and is deleted
    * @property ttl - Alias for collection_ttl
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait SyncListListInstanceCreateOptions extends StObject {
    
    var collectionTtl: js.UndefOr[Double] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object SyncListListInstanceCreateOptions {
    
    inline def apply(): SyncListListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListListInstanceCreateOptions]
    }
    
    extension [Self <: SyncListListInstanceCreateOptions](x: Self) {
      
      inline def setCollectionTtl(value: Double): Self = StObject.set(x, "collectionTtl", value.asInstanceOf[js.Any])
      
      inline def setCollectionTtlUndefined: Self = StObject.set(x, "collectionTtl", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
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
  trait SyncListListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncListListInstanceEachOptions {
    
    inline def apply(): SyncListListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListListInstanceEachOptions]
    }
    
    extension [Self <: SyncListListInstanceEachOptions](x: Self) {
      
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
  trait SyncListListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncListListInstanceOptions {
    
    inline def apply(): SyncListListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListListInstanceOptions]
    }
    
    extension [Self <: SyncListListInstanceOptions](x: Self) {
      
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
  trait SyncListListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncListListInstancePageOptions {
    
    inline def apply(): SyncListListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListListInstancePageOptions]
    }
    
    extension [Self <: SyncListListInstancePageOptions](x: Self) {
      
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
       with SyncListResource
       with TwilioResponsePayload
  object SyncListPayload {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      date_created: js.Date,
      date_expires: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      revision: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): SyncListPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListPayload]
    }
  }
  
  trait SyncListResource extends StObject {
    
    var account_sid: String
    
    var created_by: String
    
    var date_created: js.Date
    
    var date_expires: js.Date
    
    var date_updated: js.Date
    
    var links: String
    
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
      date_expires: js.Date,
      date_updated: js.Date,
      links: String,
      revision: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      url: String
    ): SyncListResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListResource]
    }
    
    extension [Self <: SyncListResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_expires(value: js.Date): Self = StObject.set(x, "date_expires", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncListSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object SyncListSolution {
    
    inline def apply(): SyncListSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListSolution]
    }
    
    extension [Self <: SyncListSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
