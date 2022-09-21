package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncListPermissionMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListPermission", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListPermission", "SyncListPermissionContext")
  @js.native
  open class SyncListPermissionContext protected () extends StObject {
    /**
      * Initialize the SyncListPermissionContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param serviceSid - The service_sid
      * @param listSid - Sync List SID or unique name.
      * @param identity - Identity of the user to whom the Sync List Permission applies.
      */
    def this(version: typings.twilio.syncMod.^, serviceSid: String, listSid: String, identity: String) = this()
    
    /**
      * fetch a SyncListPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncListPermissionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionInstance, Any]): js.Promise[SyncListPermissionInstance] = js.native
    
    /**
      * remove a SyncListPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SyncListPermissionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SyncListPermissionInstanceUpdateOptions): js.Promise[SyncListPermissionInstance] = js.native
    def update(
      opts: SyncListPermissionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionInstance, Any]
    ): js.Promise[SyncListPermissionInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListPermission", "SyncListPermissionInstance")
  @js.native
  open class SyncListPermissionInstance protected () extends SerializableClass {
    /**
      * Initialize the SyncListPermissionContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Sync Service Instance SID.
      * @param listSid - Sync List SID.
      * @param identity - Identity of the user to whom the Sync List Permission applies.
      */
    def this(
      version: typings.twilio.syncMod.^,
      payload: SyncListPermissionPayload,
      serviceSid: String,
      listSid: String,
      identity: String
    ) = this()
    
    /* private */ var _proxy: SyncListPermissionContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * fetch a SyncListPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncListPermissionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncListPermissionInstance] = js.native
    
    var identity: String = js.native
    
    var listSid: String = js.native
    
    var manage: Boolean = js.native
    
    var read: Boolean = js.native
    
    /**
      * remove a SyncListPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    /**
      * update a SyncListPermissionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SyncListPermissionInstanceUpdateOptions): js.Promise[SyncListPermissionInstance] = js.native
    def update(
      opts: SyncListPermissionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SyncListPermissionInstance] = js.native
    
    var url: String = js.native
    
    var write: Boolean = js.native
  }
  
  /**
    * Initialize the SyncListPermissionList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param serviceSid - Sync Service Instance SID.
    * @param listSid - Sync List SID.
    */
  inline def SyncListPermissionList(version: typings.twilio.syncMod.^, serviceSid: String, listSid: String): SyncListPermissionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncListPermissionList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], listSid.asInstanceOf[js.Any])).asInstanceOf[SyncListPermissionListInstance]
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListPermission", "SyncListPermissionPage")
  @js.native
  open class SyncListPermissionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.syncMod.^, 
          SyncListPermissionPayload, 
          SyncListPermissionResource, 
          SyncListPermissionInstance
        ] {
    /**
      * Initialize the SyncListPermissionPage
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
      version: typings.twilio.syncMod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SyncListPermissionSolution
    ) = this()
    
    /**
      * Build an instance of SyncListPermissionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncListPermissionPayload): SyncListPermissionInstance = js.native
    
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
  trait SyncListPermissionInstanceUpdateOptions extends StObject {
    
    var manage: Boolean
    
    var read: Boolean
    
    var write: Boolean
  }
  object SyncListPermissionInstanceUpdateOptions {
    
    inline def apply(manage: Boolean, read: Boolean, write: Boolean): SyncListPermissionInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListPermissionInstanceUpdateOptions]
    }
    
    extension [Self <: SyncListPermissionInstanceUpdateOptions](x: Self) {
      
      inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SyncListPermissionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SyncListPermissionContext = js.native
    
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncListPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SyncListPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SyncListPermissionListInstanceEachOptions): Unit = js.native
    def each(
      opts: SyncListPermissionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncListPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sync_list_permission
      *
      * @param identity - Identity of the user to whom the Sync List Permission applies.
      */
    def get(identity: String): SyncListPermissionContext = js.native
    
    /**
      * Retrieve a single target page of SyncListPermissionInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SyncListPermissionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionPage, Any]): js.Promise[SyncListPermissionPage] = js.native
    def getPage(targetUrl: String): js.Promise[SyncListPermissionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionPage, Any]
    ): js.Promise[SyncListPermissionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionPage, Any]
    ): js.Promise[SyncListPermissionPage] = js.native
    
    /**
      * Lists SyncListPermissionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncListPermissionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListPermissionInstance], Any]
    ): js.Promise[js.Array[SyncListPermissionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListPermissionInstance], Any]
    ): js.Promise[js.Array[SyncListPermissionInstance]] = js.native
    def list(opts: SyncListPermissionListInstanceOptions): js.Promise[js.Array[SyncListPermissionInstance]] = js.native
    def list(
      opts: SyncListPermissionListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SyncListPermissionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionPage, Any]): js.Promise[SyncListPermissionPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionPage, Any]
    ): js.Promise[SyncListPermissionPage] = js.native
    def page(opts: SyncListPermissionListInstancePageOptions): js.Promise[SyncListPermissionPage] = js.native
    def page(
      opts: SyncListPermissionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListPermissionPage, Any]
    ): js.Promise[SyncListPermissionPage] = js.native
    
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
  trait SyncListPermissionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncListPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncListPermissionListInstanceEachOptions {
    
    inline def apply(): SyncListPermissionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListPermissionListInstanceEachOptions]
    }
    
    extension [Self <: SyncListPermissionListInstanceEachOptions](x: Self) {
      
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
  trait SyncListPermissionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncListPermissionListInstanceOptions {
    
    inline def apply(): SyncListPermissionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListPermissionListInstanceOptions]
    }
    
    extension [Self <: SyncListPermissionListInstanceOptions](x: Self) {
      
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
  trait SyncListPermissionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncListPermissionListInstancePageOptions {
    
    inline def apply(): SyncListPermissionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListPermissionListInstancePageOptions]
    }
    
    extension [Self <: SyncListPermissionListInstancePageOptions](x: Self) {
      
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
       with SyncListPermissionResource
       with TwilioResponsePayload
  object SyncListPermissionPayload {
    
    inline def apply(
      account_sid: String,
      first_page_uri: String,
      identity: String,
      list_sid: String,
      manage: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      read: Boolean,
      service_sid: String,
      uri: String,
      url: String,
      write: Boolean
    ): SyncListPermissionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], list_sid = list_sid.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListPermissionPayload]
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
    
    extension [Self <: SyncListPermissionResource](x: Self) {
      
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
    
    var listSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object SyncListPermissionSolution {
    
    inline def apply(): SyncListPermissionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListPermissionSolution]
    }
    
    extension [Self <: SyncListPermissionSolution](x: Self) {
      
      inline def setListSid(value: String): Self = StObject.set(x, "listSid", value.asInstanceOf[js.Any])
      
      inline def setListSidUndefined: Self = StObject.set(x, "listSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
