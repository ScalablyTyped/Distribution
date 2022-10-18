package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceSyncMapSyncMapPermissionMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapPermission", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapPermission", "SyncMapPermissionContext")
  @js.native
  open class SyncMapPermissionContext protected () extends StObject {
    /**
      * Initialize the SyncMapPermissionContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param serviceSid - The service_sid
      * @param mapSid - Sync Map SID or unique name.
      * @param identity - Identity of the user to whom the Sync Map Permission applies.
      */
    def this(
      version: typings.twilio.libRestPreviewSyncMod.^,
      serviceSid: String,
      mapSid: String,
      identity: String
    ) = this()
    
    /**
      * fetch a SyncMapPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncMapPermissionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionInstance, Any]): js.Promise[SyncMapPermissionInstance] = js.native
    
    /**
      * remove a SyncMapPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SyncMapPermissionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SyncMapPermissionInstanceUpdateOptions): js.Promise[SyncMapPermissionInstance] = js.native
    def update(
      opts: SyncMapPermissionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionInstance, Any]
    ): js.Promise[SyncMapPermissionInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapPermission", "SyncMapPermissionInstance")
  @js.native
  open class SyncMapPermissionInstance protected () extends SerializableClass {
    /**
      * Initialize the SyncMapPermissionContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Sync Service Instance SID.
      * @param mapSid - Sync Map SID.
      * @param identity - Identity of the user to whom the Sync Map Permission applies.
      */
    def this(
      version: typings.twilio.libRestPreviewSyncMod.^,
      payload: SyncMapPermissionPayload,
      serviceSid: String,
      mapSid: String,
      identity: String
    ) = this()
    
    /* private */ var _proxy: SyncMapPermissionContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * fetch a SyncMapPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncMapPermissionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncMapPermissionInstance] = js.native
    
    var identity: String = js.native
    
    var manage: Boolean = js.native
    
    var mapSid: String = js.native
    
    var read: Boolean = js.native
    
    /**
      * remove a SyncMapPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    /**
      * update a SyncMapPermissionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SyncMapPermissionInstanceUpdateOptions): js.Promise[SyncMapPermissionInstance] = js.native
    def update(
      opts: SyncMapPermissionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SyncMapPermissionInstance] = js.native
    
    var url: String = js.native
    
    var write: Boolean = js.native
  }
  
  /**
    * Initialize the SyncMapPermissionList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param serviceSid - Sync Service Instance SID.
    * @param mapSid - Sync Map SID.
    */
  inline def SyncMapPermissionList(version: typings.twilio.libRestPreviewSyncMod.^, serviceSid: String, mapSid: String): SyncMapPermissionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncMapPermissionList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], mapSid.asInstanceOf[js.Any])).asInstanceOf[SyncMapPermissionListInstance]
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapPermission", "SyncMapPermissionPage")
  @js.native
  open class SyncMapPermissionPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewSyncMod.^, 
          SyncMapPermissionPayload, 
          SyncMapPermissionResource, 
          SyncMapPermissionInstance
        ] {
    /**
      * Initialize the SyncMapPermissionPage
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
      solution: SyncMapPermissionSolution
    ) = this()
    
    /**
      * Build an instance of SyncMapPermissionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncMapPermissionPayload): SyncMapPermissionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property manage - Manage access.
    * @property read - Read access.
    * @property write - Write access.
    */
  trait SyncMapPermissionInstanceUpdateOptions extends StObject {
    
    var manage: Boolean
    
    var read: Boolean
    
    var write: Boolean
  }
  object SyncMapPermissionInstanceUpdateOptions {
    
    inline def apply(manage: Boolean, read: Boolean, write: Boolean): SyncMapPermissionInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapPermissionInstanceUpdateOptions]
    }
    
    extension [Self <: SyncMapPermissionInstanceUpdateOptions](x: Self) {
      
      inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SyncMapPermissionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SyncMapPermissionContext = js.native
    
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncMapPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SyncMapPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SyncMapPermissionListInstanceEachOptions): Unit = js.native
    def each(
      opts: SyncMapPermissionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncMapPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sync_map_permission
      *
      * @param identity - Identity of the user to whom the Sync Map Permission applies.
      */
    def get(identity: String): SyncMapPermissionContext = js.native
    
    /**
      * Retrieve a single target page of SyncMapPermissionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SyncMapPermissionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionPage, Any]): js.Promise[SyncMapPermissionPage] = js.native
    def getPage(targetUrl: String): js.Promise[SyncMapPermissionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionPage, Any]
    ): js.Promise[SyncMapPermissionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionPage, Any]
    ): js.Promise[SyncMapPermissionPage] = js.native
    
    /**
      * Lists SyncMapPermissionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncMapPermissionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapPermissionInstance], Any]
    ): js.Promise[js.Array[SyncMapPermissionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapPermissionInstance], Any]
    ): js.Promise[js.Array[SyncMapPermissionInstance]] = js.native
    def list(opts: SyncMapPermissionListInstanceOptions): js.Promise[js.Array[SyncMapPermissionInstance]] = js.native
    def list(
      opts: SyncMapPermissionListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SyncMapPermissionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionPage, Any]): js.Promise[SyncMapPermissionPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionPage, Any]
    ): js.Promise[SyncMapPermissionPage] = js.native
    def page(opts: SyncMapPermissionListInstancePageOptions): js.Promise[SyncMapPermissionPage] = js.native
    def page(
      opts: SyncMapPermissionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapPermissionPage, Any]
    ): js.Promise[SyncMapPermissionPage] = js.native
    
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
  trait SyncMapPermissionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncMapPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncMapPermissionListInstanceEachOptions {
    
    inline def apply(): SyncMapPermissionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapPermissionListInstanceEachOptions]
    }
    
    extension [Self <: SyncMapPermissionListInstanceEachOptions](x: Self) {
      
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
  trait SyncMapPermissionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncMapPermissionListInstanceOptions {
    
    inline def apply(): SyncMapPermissionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapPermissionListInstanceOptions]
    }
    
    extension [Self <: SyncMapPermissionListInstanceOptions](x: Self) {
      
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
  trait SyncMapPermissionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncMapPermissionListInstancePageOptions {
    
    inline def apply(): SyncMapPermissionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapPermissionListInstancePageOptions]
    }
    
    extension [Self <: SyncMapPermissionListInstancePageOptions](x: Self) {
      
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
       with SyncMapPermissionResource
       with TwilioResponsePayload
  object SyncMapPermissionPayload {
    
    inline def apply(
      account_sid: String,
      first_page_uri: String,
      identity: String,
      manage: Boolean,
      map_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      read: Boolean,
      service_sid: String,
      uri: String,
      url: String,
      write: Boolean
    ): SyncMapPermissionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], map_sid = map_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapPermissionPayload]
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
    
    extension [Self <: SyncMapPermissionResource](x: Self) {
      
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
    
    var mapSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object SyncMapPermissionSolution {
    
    inline def apply(): SyncMapPermissionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapPermissionSolution]
    }
    
    extension [Self <: SyncMapPermissionSolution](x: Self) {
      
      inline def setMapSid(value: String): Self = StObject.set(x, "mapSid", value.asInstanceOf[js.Any])
      
      inline def setMapSidUndefined: Self = StObject.set(x, "mapSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
