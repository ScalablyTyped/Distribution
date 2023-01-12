package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import typings.twilio.libRestPreviewSyncServiceSyncMapSyncMapItemMod.SyncMapItemContext
import typings.twilio.libRestPreviewSyncServiceSyncMapSyncMapItemMod.SyncMapItemListInstance
import typings.twilio.libRestPreviewSyncServiceSyncMapSyncMapPermissionMod.SyncMapPermissionContext
import typings.twilio.libRestPreviewSyncServiceSyncMapSyncMapPermissionMod.SyncMapPermissionListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceSyncMapMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap", "SyncMapContext")
  @js.native
  open class SyncMapContext protected () extends StObject {
    /**
      * Initialize the SyncMapContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param serviceSid - The service_sid
      * @param sid - The sid
      */
    def this(version: typings.twilio.libRestPreviewSyncMod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a SyncMapInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncMapInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapInstance, Any]): js.Promise[SyncMapInstance] = js.native
    
    /**
      * remove a SyncMapInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def syncMapItems(sid: String): SyncMapItemContext = js.native
    @JSName("syncMapItems")
    var syncMapItems_Original: SyncMapItemListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def syncMapPermissions(sid: String): SyncMapPermissionContext = js.native
    @JSName("syncMapPermissions")
    var syncMapPermissions_Original: SyncMapPermissionListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap", "SyncMapInstance")
  @js.native
  open class SyncMapInstance protected () extends SerializableClass {
    /**
      * Initialize the SyncMapContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The service_sid
      * @param sid - The sid
      */
    def this(
      version: typings.twilio.libRestPreviewSyncMod.^,
      payload: SyncMapPayload,
      serviceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: SyncMapContext = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SyncMapInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncMapInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncMapInstance] = js.native
    
    var links: String = js.native
    
    /**
      * remove a SyncMapInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var revision: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    /**
      * Access the syncMapItems
      */
    def syncMapItems(): SyncMapItemListInstance = js.native
    
    /**
      * Access the syncMapPermissions
      */
    def syncMapPermissions(): SyncMapPermissionListInstance = js.native
    
    var uniqueName: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SyncMapList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param serviceSid - The service_sid
    */
  inline def SyncMapList(version: typings.twilio.libRestPreviewSyncMod.^, serviceSid: String): SyncMapListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncMapList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[SyncMapListInstance]
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap", "SyncMapPage")
  @js.native
  open class SyncMapPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewSyncMod.^, 
          SyncMapPayload, 
          SyncMapResource, 
          SyncMapInstance
        ] {
    /**
      * Initialize the SyncMapPage
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
      version: typings.twilio.libRestPreviewSyncMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
      solution: SyncMapSolution
    ) = this()
    
    /**
      * Build an instance of SyncMapInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncMapPayload): SyncMapInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait SyncMapListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SyncMapContext = js.native
    
    /**
      * create a SyncMapInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[SyncMapInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncMapInstance, Any]): js.Promise[SyncMapInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncMapInstance, Any]): js.Promise[SyncMapInstance] = js.native
    def create(opts: SyncMapListInstanceCreateOptions): js.Promise[SyncMapInstance] = js.native
    def create(
      opts: SyncMapListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncMapInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncMapInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SyncMapInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SyncMapListInstanceEachOptions): Unit = js.native
    def each(
      opts: SyncMapListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncMapInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sync_map
      *
      * @param sid - The sid
      */
    def get(sid: String): SyncMapContext = js.native
    
    /**
      * Retrieve a single target page of SyncMapInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SyncMapPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPage, Any]): js.Promise[SyncMapPage] = js.native
    def getPage(targetUrl: String): js.Promise[SyncMapPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPage, Any]
    ): js.Promise[SyncMapPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPage, Any]): js.Promise[SyncMapPage] = js.native
    
    /**
      * Lists SyncMapInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncMapInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapInstance], Any]): js.Promise[js.Array[SyncMapInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapInstance], Any]
    ): js.Promise[js.Array[SyncMapInstance]] = js.native
    def list(opts: SyncMapListInstanceOptions): js.Promise[js.Array[SyncMapInstance]] = js.native
    def list(
      opts: SyncMapListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SyncMapPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPage, Any]): js.Promise[SyncMapPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPage, Any]): js.Promise[SyncMapPage] = js.native
    def page(opts: SyncMapListInstancePageOptions): js.Promise[SyncMapPage] = js.native
    def page(
      opts: SyncMapListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPage, Any]
    ): js.Promise[SyncMapPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property uniqueName - The unique_name
    */
  trait SyncMapListInstanceCreateOptions extends StObject {
    
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
  trait SyncMapListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncMapInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  trait SyncMapListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait SyncMapListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
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
       with SyncMapResource
       with TwilioResponsePayload
  object SyncMapPayload {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      date_created: js.Date,
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
    ): SyncMapPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapPayload]
    }
  }
  
  trait SyncMapResource extends StObject {
    
    var account_sid: String
    
    var created_by: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var links: String
    
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
      links: String,
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
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncMapSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object SyncMapSolution {
    
    inline def apply(): SyncMapSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapSolution] (val x: Self) extends AnyVal {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
