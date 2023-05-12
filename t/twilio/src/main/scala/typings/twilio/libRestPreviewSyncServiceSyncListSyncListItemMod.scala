package typings.twilio

import typings.twilio.anon.Data
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewSyncMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceSyncListSyncListItemMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListItem", "SyncListItemContextImpl")
  @js.native
  open class SyncListItemContextImpl protected ()
    extends StObject
       with SyncListItemContext {
    def this(_version: default, serviceSid: String, listSid: String, index: Double) = this()
    
    /* protected */ var _solution: SyncListItemContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def remove(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]
    ): js.Promise[Boolean] = js.native
    def remove(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]
    ): js.Promise[Boolean] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListItem", "SyncListItemInstance")
  @js.native
  open class SyncListItemInstance protected () extends StObject {
    def this(_version: default, payload: SyncListItemResource, serviceSid: String, listSid: String) = this()
    def this(
      _version: default,
      payload: SyncListItemResource,
      serviceSid: String,
      listSid: String,
      index: Double
    ) = this()
    
    /* protected */ var _context: js.UndefOr[SyncListItemContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: SyncListItemContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var data: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Fetch a SyncListItemInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListItemInstance
      */
    def fetch(): js.Promise[SyncListItemInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[SyncListItemInstance] = js.native
    
    var index: Double = js.native
    
    var listSid: String = js.native
    
    /**
      * Remove a SyncListItemInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    /**
      * Remove a SyncListItemInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListItemInstance
      */
    def remove(params: SyncListItemContextRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      params: SyncListItemContextRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]
    ): js.Promise[Boolean] = js.native
    
    var revision: String = js.native
    
    var serviceSid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): Data = js.native
    
    /**
      * Update a SyncListItemInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListItemInstance
      */
    def update(params: SyncListItemContextUpdateOptions): js.Promise[SyncListItemInstance] = js.native
    def update(
      params: SyncListItemContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[SyncListItemInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait SyncListItemListInstance extends StObject {
    
    def apply(index: Double): SyncListItemContext = js.native
    
    var _solution: SyncListItemSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a SyncListItemInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListItemInstance
      */
    def create(params: SyncListItemListInstanceCreateOptions): js.Promise[SyncListItemInstance] = js.native
    def create(
      params: SyncListItemListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncListItemInstance], Any]
    ): js.Promise[SyncListItemInstance] = js.native
    
    /**
      * Streams SyncListItemInstance records from the API.
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
      * @param { SyncListItemListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncListItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: SyncListItemListInstanceEachOptions): Unit = js.native
    def each(
      params: SyncListItemListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncListItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(index: Double): SyncListItemContext = js.native
    
    /**
      * Retrieve a single target page of SyncListItemInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[SyncListItemPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemPage, Any]
    ): js.Promise[SyncListItemPage] = js.native
    
    /**
      * Lists SyncListItemInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncListItemListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncListItemInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListItemInstance], Any]
    ): js.Promise[js.Array[SyncListItemInstance]] = js.native
    def list(params: SyncListItemListInstanceOptions): js.Promise[js.Array[SyncListItemInstance]] = js.native
    def list(
      params: SyncListItemListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListItemInstance], Any]
    ): js.Promise[js.Array[SyncListItemInstance]] = js.native
    
    /**
      * Retrieve a single page of SyncListItemInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncListItemListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[SyncListItemPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemPage, Any]): js.Promise[SyncListItemPage] = js.native
    def page(params: SyncListItemListInstancePageOptions): js.Promise[SyncListItemPage] = js.native
    def page(
      params: SyncListItemListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemPage, Any]
    ): js.Promise[SyncListItemPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object SyncListItemListInstance {
    
    @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListItem", "SyncListItemListInstance")
    @js.native
    def apply(version: default, serviceSid: String, listSid: String): SyncListItemListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListItem", "SyncListItemPage")
  @js.native
  open class SyncListItemPage protected ()
    extends typings.twilio.libBasePageMod.default[default, SyncListItemPayload, SyncListItemResource, SyncListItemInstance] {
    /**
      * Initialize the SyncListItemPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: SyncListItemSolution
    ) = this()
    
    /**
      * Build an instance of SyncListItemInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncListItemResource): SyncListItemInstance = js.native
  }
  
  @js.native
  trait SyncListItemContext extends StObject {
    
    /**
      * Fetch a SyncListItemInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListItemInstance
      */
    def fetch(): js.Promise[SyncListItemInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncListItemInstance], Any]
    ): js.Promise[SyncListItemInstance] = js.native
    
    /**
      * Remove a SyncListItemInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    /**
      * Remove a SyncListItemInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListItemInstance
      */
    def remove(params: SyncListItemContextRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      params: SyncListItemContextRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a SyncListItemInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncListItemInstance
      */
    def update(params: SyncListItemContextUpdateOptions): js.Promise[SyncListItemInstance] = js.native
    def update(
      params: SyncListItemContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncListItemInstance], Any]
    ): js.Promise[SyncListItemInstance] = js.native
  }
  
  trait SyncListItemContextRemoveOptions extends StObject {
    
    /** The If-Match HTTP request header */
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object SyncListItemContextRemoveOptions {
    
    inline def apply(): SyncListItemContextRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListItemContextRemoveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListItemContextRemoveOptions] (val x: Self) extends AnyVal {
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  trait SyncListItemContextSolution extends StObject {
    
    var index: Double
    
    var listSid: String
    
    var serviceSid: String
  }
  object SyncListItemContextSolution {
    
    inline def apply(index: Double, listSid: String, serviceSid: String): SyncListItemContextSolution = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], listSid = listSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListItemContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListItemContextSolution] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setListSid(value: String): Self = StObject.set(x, "listSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncListItemContextUpdateOptions extends StObject {
    
    /**  */
    var data: Any
    
    /** The If-Match HTTP request header */
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object SyncListItemContextUpdateOptions {
    
    inline def apply(data: Any): SyncListItemContextUpdateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListItemContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListItemContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  trait SyncListItemListInstanceCreateOptions extends StObject {
    
    /**  */
    var data: Any
  }
  object SyncListItemListInstanceCreateOptions {
    
    inline def apply(data: Any): SyncListItemListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListItemListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListItemListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncListItemListInstanceEachOptions extends StObject {
    
    /**  */
    var bounds: js.UndefOr[SyncListItemQueryFromBoundType] = js.undefined
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncListItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /**  */
    var from: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**  */
    var order: js.UndefOr[SyncListItemQueryResultOrder] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncListItemListInstanceEachOptions {
    
    inline def apply(): SyncListItemListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListItemListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListItemListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: SyncListItemQueryFromBoundType): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCallback(
        value: (/* item */ SyncListItemInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: SyncListItemQueryResultOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait SyncListItemListInstanceOptions extends StObject {
    
    /**  */
    var bounds: js.UndefOr[SyncListItemQueryFromBoundType] = js.undefined
    
    /**  */
    var from: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**  */
    var order: js.UndefOr[SyncListItemQueryResultOrder] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncListItemListInstanceOptions {
    
    inline def apply(): SyncListItemListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListItemListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListItemListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: SyncListItemQueryFromBoundType): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: SyncListItemQueryResultOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait SyncListItemListInstancePageOptions extends StObject {
    
    /**  */
    var bounds: js.UndefOr[SyncListItemQueryFromBoundType] = js.undefined
    
    /**  */
    var from: js.UndefOr[String] = js.undefined
    
    /**  */
    var order: js.UndefOr[SyncListItemQueryResultOrder] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncListItemListInstancePageOptions {
    
    inline def apply(): SyncListItemListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListItemListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListItemListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: SyncListItemQueryFromBoundType): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setOrder(value: SyncListItemQueryResultOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SyncListItemPayload
    extends StObject
       with TwilioResponsePayload {
    
    var items: js.Array[SyncListItemResource]
  }
  object SyncListItemPayload {
    
    inline def apply(
      first_page_uri: String,
      items: js.Array[SyncListItemResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): SyncListItemPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListItemPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListItemPayload] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[SyncListItemResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: SyncListItemResource*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.inclusive
    - typings.twilio.twilioStrings.exclusive
  */
  trait SyncListItemQueryFromBoundType extends StObject
  object SyncListItemQueryFromBoundType {
    
    inline def exclusive: typings.twilio.twilioStrings.exclusive = "exclusive".asInstanceOf[typings.twilio.twilioStrings.exclusive]
    
    inline def inclusive: typings.twilio.twilioStrings.inclusive = "inclusive".asInstanceOf[typings.twilio.twilioStrings.inclusive]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.asc
    - typings.twilio.twilioStrings.desc
  */
  trait SyncListItemQueryResultOrder extends StObject
  object SyncListItemQueryResultOrder {
    
    inline def asc: typings.twilio.twilioStrings.asc = "asc".asInstanceOf[typings.twilio.twilioStrings.asc]
    
    inline def desc: typings.twilio.twilioStrings.desc = "desc".asInstanceOf[typings.twilio.twilioStrings.desc]
  }
  
  trait SyncListItemResource extends StObject {
    
    var account_sid: String
    
    var created_by: String
    
    var data: Any
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var index: Double
    
    var list_sid: String
    
    var revision: String
    
    var service_sid: String
    
    var url: String
  }
  object SyncListItemResource {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      data: Any,
      date_created: js.Date,
      date_updated: js.Date,
      index: Double,
      list_sid: String,
      revision: String,
      service_sid: String,
      url: String
    ): SyncListItemResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], list_sid = list_sid.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListItemResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListItemResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setList_sid(value: String): Self = StObject.set(x, "list_sid", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncListItemSolution extends StObject {
    
    var listSid: String
    
    var serviceSid: String
  }
  object SyncListItemSolution {
    
    inline def apply(listSid: String, serviceSid: String): SyncListItemSolution = {
      val __obj = js.Dynamic.literal(listSid = listSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListItemSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncListItemSolution] (val x: Self) extends AnyVal {
      
      inline def setListSid(value: String): Self = StObject.set(x, "listSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
}
