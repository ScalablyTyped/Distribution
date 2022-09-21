package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentPermissionMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/document/documentPermission", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/sync/service/document/documentPermission", "DocumentPermissionContext")
  @js.native
  open class DocumentPermissionContext protected () extends StObject {
    /**
      * Initialize the DocumentPermissionContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param serviceSid - The service_sid
      * @param documentSid - Sync Document SID or unique name.
      * @param identity - Identity of the user to whom the Sync Document Permission applies.
      */
    def this(version: typings.twilio.syncMod.^, serviceSid: String, documentSid: String, identity: String) = this()
    
    /**
      * fetch a DocumentPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DocumentPermissionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPermissionInstance, Any]): js.Promise[DocumentPermissionInstance] = js.native
    
    /**
      * remove a DocumentPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPermissionInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a DocumentPermissionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: DocumentPermissionInstanceUpdateOptions): js.Promise[DocumentPermissionInstance] = js.native
    def update(
      opts: DocumentPermissionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPermissionInstance, Any]
    ): js.Promise[DocumentPermissionInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/document/documentPermission", "DocumentPermissionInstance")
  @js.native
  open class DocumentPermissionInstance protected () extends SerializableClass {
    /**
      * Initialize the DocumentPermissionContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Sync Service Instance SID.
      * @param documentSid - Sync Document SID.
      * @param identity - Identity of the user to whom the Sync Document Permission applies.
      */
    def this(
      version: typings.twilio.syncMod.^,
      payload: DocumentPermissionPayload,
      serviceSid: String,
      documentSid: String,
      identity: String
    ) = this()
    
    /* private */ var _proxy: DocumentPermissionContext = js.native
    
    var accountSid: String = js.native
    
    var documentSid: String = js.native
    
    /**
      * fetch a DocumentPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DocumentPermissionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DocumentPermissionInstance] = js.native
    
    var identity: String = js.native
    
    var manage: Boolean = js.native
    
    var read: Boolean = js.native
    
    /**
      * remove a DocumentPermissionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    /**
      * update a DocumentPermissionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: DocumentPermissionInstanceUpdateOptions): js.Promise[DocumentPermissionInstance] = js.native
    def update(
      opts: DocumentPermissionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[DocumentPermissionInstance] = js.native
    
    var url: String = js.native
    
    var write: Boolean = js.native
  }
  
  /**
    * Initialize the DocumentPermissionList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param serviceSid - Sync Service Instance SID.
    * @param documentSid - Sync Document SID.
    */
  inline def DocumentPermissionList(version: typings.twilio.syncMod.^, serviceSid: String, documentSid: String): DocumentPermissionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DocumentPermissionList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], documentSid.asInstanceOf[js.Any])).asInstanceOf[DocumentPermissionListInstance]
  
  @JSImport("twilio/lib/rest/preview/sync/service/document/documentPermission", "DocumentPermissionPage")
  @js.native
  open class DocumentPermissionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.syncMod.^, 
          DocumentPermissionPayload, 
          DocumentPermissionResource, 
          DocumentPermissionInstance
        ] {
    /**
      * Initialize the DocumentPermissionPage
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
      solution: DocumentPermissionSolution
    ) = this()
    
    /**
      * Build an instance of DocumentPermissionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DocumentPermissionPayload): DocumentPermissionInstance = js.native
    
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
  trait DocumentPermissionInstanceUpdateOptions extends StObject {
    
    var manage: Boolean
    
    var read: Boolean
    
    var write: Boolean
  }
  object DocumentPermissionInstanceUpdateOptions {
    
    inline def apply(manage: Boolean, read: Boolean, write: Boolean): DocumentPermissionInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentPermissionInstanceUpdateOptions]
    }
    
    extension [Self <: DocumentPermissionInstanceUpdateOptions](x: Self) {
      
      inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocumentPermissionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DocumentPermissionContext = js.native
    
    /**
      * Streams DocumentPermissionInstance records from the API.
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
          /* item */ DocumentPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DocumentPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DocumentPermissionListInstanceEachOptions): Unit = js.native
    def each(
      opts: DocumentPermissionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DocumentPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a document_permission
      *
      * @param identity - Identity of the user to whom the Sync Document Permission applies.
      */
    def get(identity: String): DocumentPermissionContext = js.native
    
    /**
      * Retrieve a single target page of DocumentPermissionInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DocumentPermissionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPermissionPage, Any]): js.Promise[DocumentPermissionPage] = js.native
    def getPage(targetUrl: String): js.Promise[DocumentPermissionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPermissionPage, Any]
    ): js.Promise[DocumentPermissionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPermissionPage, Any]
    ): js.Promise[DocumentPermissionPage] = js.native
    
    /**
      * Lists DocumentPermissionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DocumentPermissionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DocumentPermissionInstance], Any]
    ): js.Promise[js.Array[DocumentPermissionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DocumentPermissionInstance], Any]
    ): js.Promise[js.Array[DocumentPermissionInstance]] = js.native
    def list(opts: DocumentPermissionListInstanceOptions): js.Promise[js.Array[DocumentPermissionInstance]] = js.native
    def list(
      opts: DocumentPermissionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DocumentPermissionInstance], Any]
    ): js.Promise[js.Array[DocumentPermissionInstance]] = js.native
    
    /**
      * Retrieve a single page of DocumentPermissionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DocumentPermissionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPermissionPage, Any]): js.Promise[DocumentPermissionPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPermissionPage, Any]
    ): js.Promise[DocumentPermissionPage] = js.native
    def page(opts: DocumentPermissionListInstancePageOptions): js.Promise[DocumentPermissionPage] = js.native
    def page(
      opts: DocumentPermissionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPermissionPage, Any]
    ): js.Promise[DocumentPermissionPage] = js.native
    
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
  trait DocumentPermissionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DocumentPermissionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DocumentPermissionListInstanceEachOptions {
    
    inline def apply(): DocumentPermissionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentPermissionListInstanceEachOptions]
    }
    
    extension [Self <: DocumentPermissionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ DocumentPermissionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait DocumentPermissionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DocumentPermissionListInstanceOptions {
    
    inline def apply(): DocumentPermissionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentPermissionListInstanceOptions]
    }
    
    extension [Self <: DocumentPermissionListInstanceOptions](x: Self) {
      
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
  trait DocumentPermissionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DocumentPermissionListInstancePageOptions {
    
    inline def apply(): DocumentPermissionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentPermissionListInstancePageOptions]
    }
    
    extension [Self <: DocumentPermissionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait DocumentPermissionPayload
    extends StObject
       with DocumentPermissionResource
       with TwilioResponsePayload
  object DocumentPermissionPayload {
    
    inline def apply(
      account_sid: String,
      document_sid: String,
      first_page_uri: String,
      identity: String,
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
    ): DocumentPermissionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], document_sid = document_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentPermissionPayload]
    }
  }
  
  trait DocumentPermissionResource extends StObject {
    
    var account_sid: String
    
    var document_sid: String
    
    var identity: String
    
    var manage: Boolean
    
    var read: Boolean
    
    var service_sid: String
    
    var url: String
    
    var write: Boolean
  }
  object DocumentPermissionResource {
    
    inline def apply(
      account_sid: String,
      document_sid: String,
      identity: String,
      manage: Boolean,
      read: Boolean,
      service_sid: String,
      url: String,
      write: Boolean
    ): DocumentPermissionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], document_sid = document_sid.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentPermissionResource]
    }
    
    extension [Self <: DocumentPermissionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDocument_sid(value: String): Self = StObject.set(x, "document_sid", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocumentPermissionSolution extends StObject {
    
    var documentSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object DocumentPermissionSolution {
    
    inline def apply(): DocumentPermissionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentPermissionSolution]
    }
    
    extension [Self <: DocumentPermissionSolution](x: Self) {
      
      inline def setDocumentSid(value: String): Self = StObject.set(x, "documentSid", value.asInstanceOf[js.Any])
      
      inline def setDocumentSidUndefined: Self = StObject.set(x, "documentSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
