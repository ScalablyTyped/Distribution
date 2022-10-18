package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import typings.twilio.libRestPreviewSyncServiceDocumentDocumentPermissionMod.DocumentPermissionContext
import typings.twilio.libRestPreviewSyncServiceDocumentDocumentPermissionMod.DocumentPermissionListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceDocumentMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/document", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/sync/service/document", "DocumentContext")
  @js.native
  open class DocumentContext protected () extends StObject {
    /**
      * Initialize the DocumentContext
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
      * @param sid - sid of instance
      */
    def documentPermissions(sid: String): DocumentPermissionContext = js.native
    @JSName("documentPermissions")
    var documentPermissions_Original: DocumentPermissionListInstance = js.native
    
    /**
      * fetch a DocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DocumentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentInstance, Any]): js.Promise[DocumentInstance] = js.native
    
    /**
      * remove a DocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a DocumentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: DocumentInstanceUpdateOptions): js.Promise[DocumentInstance] = js.native
    def update(
      opts: DocumentInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentInstance, Any]
    ): js.Promise[DocumentInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/document", "DocumentInstance")
  @js.native
  open class DocumentInstance protected () extends SerializableClass {
    /**
      * Initialize the DocumentContext
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
      payload: DocumentPayload,
      serviceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: DocumentContext = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var data: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the documentPermissions
      */
    def documentPermissions(): DocumentPermissionListInstance = js.native
    
    /**
      * fetch a DocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DocumentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DocumentInstance] = js.native
    
    var links: String = js.native
    
    /**
      * remove a DocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var revision: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a DocumentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: DocumentInstanceUpdateOptions): js.Promise[DocumentInstance] = js.native
    def update(
      opts: DocumentInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[DocumentInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the DocumentList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param serviceSid - The service_sid
    */
  inline def DocumentList(version: typings.twilio.libRestPreviewSyncMod.^, serviceSid: String): DocumentListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DocumentList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[DocumentListInstance]
  
  @JSImport("twilio/lib/rest/preview/sync/service/document", "DocumentPage")
  @js.native
  open class DocumentPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewSyncMod.^, 
          DocumentPayload, 
          DocumentResource, 
          DocumentInstance
        ] {
    /**
      * Initialize the DocumentPage
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
      solution: DocumentSolution
    ) = this()
    
    /**
      * Build an instance of DocumentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DocumentPayload): DocumentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property data - The data
    * @property ifMatch - The If-Match HTTP request header
    */
  trait DocumentInstanceUpdateOptions extends StObject {
    
    var data: js.Object
    
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object DocumentInstanceUpdateOptions {
    
    inline def apply(data: js.Object): DocumentInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentInstanceUpdateOptions]
    }
    
    extension [Self <: DocumentInstanceUpdateOptions](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  @js.native
  trait DocumentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DocumentContext = js.native
    
    /**
      * create a DocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[DocumentInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ DocumentInstance, Any]): js.Promise[DocumentInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ DocumentInstance, Any]): js.Promise[DocumentInstance] = js.native
    def create(opts: DocumentListInstanceCreateOptions): js.Promise[DocumentInstance] = js.native
    def create(
      opts: DocumentListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ DocumentInstance, Any]
    ): js.Promise[DocumentInstance] = js.native
    
    /**
      * Streams DocumentInstance records from the API.
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
          /* item */ DocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DocumentListInstanceEachOptions): Unit = js.native
    def each(
      opts: DocumentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a document
      *
      * @param sid - The sid
      */
    def get(sid: String): DocumentContext = js.native
    
    /**
      * Retrieve a single target page of DocumentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DocumentPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPage, Any]): js.Promise[DocumentPage] = js.native
    def getPage(targetUrl: String): js.Promise[DocumentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPage, Any]
    ): js.Promise[DocumentPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPage, Any]
    ): js.Promise[DocumentPage] = js.native
    
    /**
      * Lists DocumentInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DocumentInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DocumentInstance], Any]): js.Promise[js.Array[DocumentInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DocumentInstance], Any]
    ): js.Promise[js.Array[DocumentInstance]] = js.native
    def list(opts: DocumentListInstanceOptions): js.Promise[js.Array[DocumentInstance]] = js.native
    def list(
      opts: DocumentListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DocumentInstance], Any]
    ): js.Promise[js.Array[DocumentInstance]] = js.native
    
    /**
      * Retrieve a single page of DocumentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DocumentPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPage, Any]): js.Promise[DocumentPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPage, Any]): js.Promise[DocumentPage] = js.native
    def page(opts: DocumentListInstancePageOptions): js.Promise[DocumentPage] = js.native
    def page(
      opts: DocumentListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPage, Any]
    ): js.Promise[DocumentPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property data - The data
    * @property uniqueName - The unique_name
    */
  trait DocumentListInstanceCreateOptions extends StObject {
    
    var data: js.UndefOr[js.Object] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DocumentListInstanceCreateOptions {
    
    inline def apply(): DocumentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentListInstanceCreateOptions]
    }
    
    extension [Self <: DocumentListInstanceCreateOptions](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
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
  trait DocumentListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DocumentListInstanceEachOptions {
    
    inline def apply(): DocumentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentListInstanceEachOptions]
    }
    
    extension [Self <: DocumentListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ DocumentInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait DocumentListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DocumentListInstanceOptions {
    
    inline def apply(): DocumentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentListInstanceOptions]
    }
    
    extension [Self <: DocumentListInstanceOptions](x: Self) {
      
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
  trait DocumentListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DocumentListInstancePageOptions {
    
    inline def apply(): DocumentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentListInstancePageOptions]
    }
    
    extension [Self <: DocumentListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait DocumentPayload
    extends StObject
       with DocumentResource
       with TwilioResponsePayload
  object DocumentPayload {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      data: js.Object,
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
    ): DocumentPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentPayload]
    }
  }
  
  trait DocumentResource extends StObject {
    
    var account_sid: String
    
    var created_by: String
    
    var data: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var links: String
    
    var revision: String
    
    var service_sid: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object DocumentResource {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      data: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      links: String,
      revision: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      url: String
    ): DocumentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentResource]
    }
    
    extension [Self <: DocumentResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
  
  trait DocumentSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object DocumentSolution {
    
    inline def apply(): DocumentSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentSolution]
    }
    
    extension [Self <: DocumentSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
