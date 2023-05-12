package typings.twilio

import typings.std.Record
import typings.twilio.anon.CreatedBy
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewSyncMod.default
import typings.twilio.libRestPreviewSyncServiceDocumentDocumentPermissionMod.DocumentPermissionContext
import typings.twilio.libRestPreviewSyncServiceDocumentDocumentPermissionMod.DocumentPermissionListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceDocumentMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/document", "DocumentContextImpl")
  @js.native
  open class DocumentContextImpl protected ()
    extends StObject
       with DocumentContext {
    def this(_version: default, serviceSid: String, sid: String) = this()
    
    /* protected */ var _documentPermissions: js.UndefOr[DocumentPermissionListInstance] = js.native
    
    /* protected */ var _solution: DocumentContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def documentPermissions: DocumentPermissionListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/document", "DocumentInstance")
  @js.native
  open class DocumentInstance protected () extends StObject {
    def this(_version: default, payload: DocumentResource, serviceSid: String) = this()
    def this(_version: default, payload: DocumentResource, serviceSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[DocumentContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: DocumentContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var data: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the documentPermissions.
      */
    def documentPermissions(): DocumentPermissionListInstance = js.native
    
    /**
      * Fetch a DocumentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DocumentInstance
      */
    def fetch(): js.Promise[DocumentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[DocumentInstance] = js.native
    
    var links: Record[String, String] = js.native
    
    /**
      * Remove a DocumentInstance
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
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): CreatedBy = js.native
    
    var uniqueName: String = js.native
    
    /**
      * Update a DocumentInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DocumentInstance
      */
    def update(params: DocumentContextUpdateOptions): js.Promise[DocumentInstance] = js.native
    def update(
      params: DocumentContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[DocumentInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait DocumentListInstance extends StObject {
    
    def apply(sid: String): DocumentContext = js.native
    
    var _solution: DocumentSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a DocumentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DocumentInstance
      */
    def create(): js.Promise[DocumentInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DocumentInstance], Any]): js.Promise[DocumentInstance] = js.native
    /**
      * Create a DocumentInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DocumentInstance
      */
    def create(params: DocumentListInstanceCreateOptions): js.Promise[DocumentInstance] = js.native
    def create(
      params: DocumentListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DocumentInstance], Any]
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
      * @param { DocumentListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ DocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: DocumentListInstanceEachOptions): Unit = js.native
    def each(
      params: DocumentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): DocumentContext = js.native
    
    /**
      * Retrieve a single target page of DocumentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[DocumentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPage, Any]
    ): js.Promise[DocumentPage] = js.native
    
    /**
      * Lists DocumentInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { DocumentListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DocumentInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DocumentInstance], Any]): js.Promise[js.Array[DocumentInstance]] = js.native
    def list(params: DocumentListInstanceOptions): js.Promise[js.Array[DocumentInstance]] = js.native
    def list(
      params: DocumentListInstanceOptions,
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
      * @param { DocumentListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[DocumentPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPage, Any]): js.Promise[DocumentPage] = js.native
    def page(params: DocumentListInstancePageOptions): js.Promise[DocumentPage] = js.native
    def page(
      params: DocumentListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DocumentPage, Any]
    ): js.Promise[DocumentPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object DocumentListInstance {
    
    @JSImport("twilio/lib/rest/preview/sync/service/document", "DocumentListInstance")
    @js.native
    def apply(version: default, serviceSid: String): DocumentListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/document", "DocumentPage")
  @js.native
  open class DocumentPage protected ()
    extends typings.twilio.libBasePageMod.default[default, DocumentPayload, DocumentResource, DocumentInstance] {
    /**
      * Initialize the DocumentPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: DocumentSolution
    ) = this()
    
    /**
      * Build an instance of DocumentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DocumentResource): DocumentInstance = js.native
  }
  
  @js.native
  trait DocumentContext extends StObject {
    
    def documentPermissions(identity: String): DocumentPermissionContext = js.native
    @JSName("documentPermissions")
    var documentPermissions_Original: DocumentPermissionListInstance = js.native
    
    /**
      * Fetch a DocumentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DocumentInstance
      */
    def fetch(): js.Promise[DocumentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DocumentInstance], Any]): js.Promise[DocumentInstance] = js.native
    
    /**
      * Remove a DocumentInstance
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
      * Update a DocumentInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DocumentInstance
      */
    def update(params: DocumentContextUpdateOptions): js.Promise[DocumentInstance] = js.native
    def update(
      params: DocumentContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DocumentInstance], Any]
    ): js.Promise[DocumentInstance] = js.native
  }
  
  trait DocumentContextSolution extends StObject {
    
    var serviceSid: String
    
    var sid: String
  }
  object DocumentContextSolution {
    
    inline def apply(serviceSid: String, sid: String): DocumentContextSolution = {
      val __obj = js.Dynamic.literal(serviceSid = serviceSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentContextSolution] (val x: Self) extends AnyVal {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocumentContextUpdateOptions extends StObject {
    
    /**  */
    var data: Any
    
    /** The If-Match HTTP request header */
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object DocumentContextUpdateOptions {
    
    inline def apply(data: Any): DocumentContextUpdateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  trait DocumentListInstanceCreateOptions extends StObject {
    
    /**  */
    var data: js.UndefOr[Any] = js.undefined
    
    /**  */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DocumentListInstanceCreateOptions {
    
    inline def apply(): DocumentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait DocumentListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DocumentInstance, 
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
  object DocumentListInstanceEachOptions {
    
    inline def apply(): DocumentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentListInstanceEachOptions] (val x: Self) extends AnyVal {
      
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
  
  trait DocumentListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DocumentListInstanceOptions {
    
    inline def apply(): DocumentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait DocumentListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DocumentListInstancePageOptions {
    
    inline def apply(): DocumentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentListInstancePageOptions] (val x: Self) extends AnyVal {
      
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
       with TwilioResponsePayload {
    
    var documents: js.Array[DocumentResource]
  }
  object DocumentPayload {
    
    inline def apply(
      documents: js.Array[DocumentResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): DocumentPayload = {
      val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentPayload] (val x: Self) extends AnyVal {
      
      inline def setDocuments(value: js.Array[DocumentResource]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
      
      inline def setDocumentsVarargs(value: DocumentResource*): Self = StObject.set(x, "documents", js.Array(value*))
    }
  }
  
  trait DocumentResource extends StObject {
    
    var account_sid: String
    
    var created_by: String
    
    var data: Any
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var links: Record[String, String]
    
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
      data: Any,
      date_created: js.Date,
      date_updated: js.Date,
      links: Record[String, String],
      revision: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      url: String
    ): DocumentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
  
  trait DocumentSolution extends StObject {
    
    var serviceSid: String
  }
  object DocumentSolution {
    
    inline def apply(serviceSid: String): DocumentSolution = {
      val __obj = js.Dynamic.literal(serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentSolution] (val x: Self) extends AnyVal {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
}
