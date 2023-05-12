package typings.twilio

import typings.twilio.anon.MapSid
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewSyncMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceSyncMapSyncMapItemMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapItem", "SyncMapItemContextImpl")
  @js.native
  open class SyncMapItemContextImpl protected ()
    extends StObject
       with SyncMapItemContext {
    def this(_version: default, serviceSid: String, mapSid: String, key: String) = this()
    
    /* protected */ var _solution: SyncMapItemContextSolution = js.native
    
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
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapItem", "SyncMapItemInstance")
  @js.native
  open class SyncMapItemInstance protected () extends StObject {
    def this(_version: default, payload: SyncMapItemResource, serviceSid: String, mapSid: String) = this()
    def this(_version: default, payload: SyncMapItemResource, serviceSid: String, mapSid: String, key: String) = this()
    
    /* protected */ var _context: js.UndefOr[SyncMapItemContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: SyncMapItemContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var data: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Fetch a SyncMapItemInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapItemInstance
      */
    def fetch(): js.Promise[SyncMapItemInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[SyncMapItemInstance] = js.native
    
    var key: String = js.native
    
    var mapSid: String = js.native
    
    /**
      * Remove a SyncMapItemInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    /**
      * Remove a SyncMapItemInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapItemInstance
      */
    def remove(params: SyncMapItemContextRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      params: SyncMapItemContextRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]
    ): js.Promise[Boolean] = js.native
    
    var revision: String = js.native
    
    var serviceSid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): MapSid = js.native
    
    /**
      * Update a SyncMapItemInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapItemInstance
      */
    def update(params: SyncMapItemContextUpdateOptions): js.Promise[SyncMapItemInstance] = js.native
    def update(
      params: SyncMapItemContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[SyncMapItemInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait SyncMapItemListInstance extends StObject {
    
    def apply(key: String): SyncMapItemContext = js.native
    
    var _solution: SyncMapItemSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a SyncMapItemInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapItemInstance
      */
    def create(params: SyncMapItemListInstanceCreateOptions): js.Promise[SyncMapItemInstance] = js.native
    def create(
      params: SyncMapItemListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncMapItemInstance], Any]
    ): js.Promise[SyncMapItemInstance] = js.native
    
    /**
      * Streams SyncMapItemInstance records from the API.
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
      * @param { SyncMapItemListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncMapItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: SyncMapItemListInstanceEachOptions): Unit = js.native
    def each(
      params: SyncMapItemListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncMapItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(key: String): SyncMapItemContext = js.native
    
    /**
      * Retrieve a single target page of SyncMapItemInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[SyncMapItemPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemPage, Any]
    ): js.Promise[SyncMapItemPage] = js.native
    
    /**
      * Lists SyncMapItemInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncMapItemListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncMapItemInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapItemInstance], Any]
    ): js.Promise[js.Array[SyncMapItemInstance]] = js.native
    def list(params: SyncMapItemListInstanceOptions): js.Promise[js.Array[SyncMapItemInstance]] = js.native
    def list(
      params: SyncMapItemListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapItemInstance], Any]
    ): js.Promise[js.Array[SyncMapItemInstance]] = js.native
    
    /**
      * Retrieve a single page of SyncMapItemInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SyncMapItemListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[SyncMapItemPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemPage, Any]): js.Promise[SyncMapItemPage] = js.native
    def page(params: SyncMapItemListInstancePageOptions): js.Promise[SyncMapItemPage] = js.native
    def page(
      params: SyncMapItemListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemPage, Any]
    ): js.Promise[SyncMapItemPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object SyncMapItemListInstance {
    
    @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapItem", "SyncMapItemListInstance")
    @js.native
    def apply(version: default, serviceSid: String, mapSid: String): SyncMapItemListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapItem", "SyncMapItemPage")
  @js.native
  open class SyncMapItemPage protected ()
    extends typings.twilio.libBasePageMod.default[default, SyncMapItemPayload, SyncMapItemResource, SyncMapItemInstance] {
    /**
      * Initialize the SyncMapItemPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: SyncMapItemSolution
    ) = this()
    
    /**
      * Build an instance of SyncMapItemInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncMapItemResource): SyncMapItemInstance = js.native
  }
  
  @js.native
  trait SyncMapItemContext extends StObject {
    
    /**
      * Fetch a SyncMapItemInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapItemInstance
      */
    def fetch(): js.Promise[SyncMapItemInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncMapItemInstance], Any]
    ): js.Promise[SyncMapItemInstance] = js.native
    
    /**
      * Remove a SyncMapItemInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    /**
      * Remove a SyncMapItemInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapItemInstance
      */
    def remove(params: SyncMapItemContextRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      params: SyncMapItemContextRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a SyncMapItemInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SyncMapItemInstance
      */
    def update(params: SyncMapItemContextUpdateOptions): js.Promise[SyncMapItemInstance] = js.native
    def update(
      params: SyncMapItemContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SyncMapItemInstance], Any]
    ): js.Promise[SyncMapItemInstance] = js.native
  }
  
  trait SyncMapItemContextRemoveOptions extends StObject {
    
    /** The If-Match HTTP request header */
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object SyncMapItemContextRemoveOptions {
    
    inline def apply(): SyncMapItemContextRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapItemContextRemoveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemContextRemoveOptions] (val x: Self) extends AnyVal {
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  trait SyncMapItemContextSolution extends StObject {
    
    var key: String
    
    var mapSid: String
    
    var serviceSid: String
  }
  object SyncMapItemContextSolution {
    
    inline def apply(key: String, mapSid: String, serviceSid: String): SyncMapItemContextSolution = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], mapSid = mapSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapItemContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemContextSolution] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMapSid(value: String): Self = StObject.set(x, "mapSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncMapItemContextUpdateOptions extends StObject {
    
    /**  */
    var data: Any
    
    /** The If-Match HTTP request header */
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object SyncMapItemContextUpdateOptions {
    
    inline def apply(data: Any): SyncMapItemContextUpdateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapItemContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  trait SyncMapItemListInstanceCreateOptions extends StObject {
    
    /**  */
    var data: Any
    
    /**  */
    var key: String
  }
  object SyncMapItemListInstanceCreateOptions {
    
    inline def apply(data: Any, key: String): SyncMapItemListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapItemListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncMapItemListInstanceEachOptions extends StObject {
    
    /**  */
    var bounds: js.UndefOr[SyncMapItemQueryFromBoundType] = js.undefined
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncMapItemInstance, 
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
    var order: js.UndefOr[SyncMapItemQueryResultOrder] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncMapItemListInstanceEachOptions {
    
    inline def apply(): SyncMapItemListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapItemListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: SyncMapItemQueryFromBoundType): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCallback(
        value: (/* item */ SyncMapItemInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: SyncMapItemQueryResultOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait SyncMapItemListInstanceOptions extends StObject {
    
    /**  */
    var bounds: js.UndefOr[SyncMapItemQueryFromBoundType] = js.undefined
    
    /**  */
    var from: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**  */
    var order: js.UndefOr[SyncMapItemQueryResultOrder] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncMapItemListInstanceOptions {
    
    inline def apply(): SyncMapItemListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapItemListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: SyncMapItemQueryFromBoundType): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: SyncMapItemQueryResultOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait SyncMapItemListInstancePageOptions extends StObject {
    
    /**  */
    var bounds: js.UndefOr[SyncMapItemQueryFromBoundType] = js.undefined
    
    /**  */
    var from: js.UndefOr[String] = js.undefined
    
    /**  */
    var order: js.UndefOr[SyncMapItemQueryResultOrder] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncMapItemListInstancePageOptions {
    
    inline def apply(): SyncMapItemListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapItemListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: SyncMapItemQueryFromBoundType): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setOrder(value: SyncMapItemQueryResultOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SyncMapItemPayload
    extends StObject
       with TwilioResponsePayload {
    
    var items: js.Array[SyncMapItemResource]
  }
  object SyncMapItemPayload {
    
    inline def apply(
      first_page_uri: String,
      items: js.Array[SyncMapItemResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): SyncMapItemPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapItemPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemPayload] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[SyncMapItemResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: SyncMapItemResource*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.inclusive
    - typings.twilio.twilioStrings.exclusive
  */
  trait SyncMapItemQueryFromBoundType extends StObject
  object SyncMapItemQueryFromBoundType {
    
    inline def exclusive: typings.twilio.twilioStrings.exclusive = "exclusive".asInstanceOf[typings.twilio.twilioStrings.exclusive]
    
    inline def inclusive: typings.twilio.twilioStrings.inclusive = "inclusive".asInstanceOf[typings.twilio.twilioStrings.inclusive]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.asc
    - typings.twilio.twilioStrings.desc
  */
  trait SyncMapItemQueryResultOrder extends StObject
  object SyncMapItemQueryResultOrder {
    
    inline def asc: typings.twilio.twilioStrings.asc = "asc".asInstanceOf[typings.twilio.twilioStrings.asc]
    
    inline def desc: typings.twilio.twilioStrings.desc = "desc".asInstanceOf[typings.twilio.twilioStrings.desc]
  }
  
  trait SyncMapItemResource extends StObject {
    
    var account_sid: String
    
    var created_by: String
    
    var data: Any
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var key: String
    
    var map_sid: String
    
    var revision: String
    
    var service_sid: String
    
    var url: String
  }
  object SyncMapItemResource {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      data: Any,
      date_created: js.Date,
      date_updated: js.Date,
      key: String,
      map_sid: String,
      revision: String,
      service_sid: String,
      url: String
    ): SyncMapItemResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], map_sid = map_sid.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapItemResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMap_sid(value: String): Self = StObject.set(x, "map_sid", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncMapItemSolution extends StObject {
    
    var mapSid: String
    
    var serviceSid: String
  }
  object SyncMapItemSolution {
    
    inline def apply(mapSid: String, serviceSid: String): SyncMapItemSolution = {
      val __obj = js.Dynamic.literal(mapSid = mapSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapItemSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemSolution] (val x: Self) extends AnyVal {
      
      inline def setMapSid(value: String): Self = StObject.set(x, "mapSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    }
  }
}
