package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncServiceSyncMapSyncMapItemMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapItem", "SyncMapItemContext")
  @js.native
  open class SyncMapItemContext protected () extends StObject {
    /**
      * Initialize the SyncMapItemContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param serviceSid - The service_sid
      * @param mapSid - The map_sid
      * @param key - The key
      */
    def this(version: typings.twilio.libRestPreviewSyncMod.^, serviceSid: String, mapSid: String, key: String) = this()
    
    /**
      * fetch a SyncMapItemInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncMapItemInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemInstance, Any]): js.Promise[SyncMapItemInstance] = js.native
    
    /**
      * remove a SyncMapItemInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemInstance, Any]): js.Promise[Boolean] = js.native
    def remove(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemInstance, Any]
    ): js.Promise[Boolean] = js.native
    def remove(opts: SyncMapItemInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: SyncMapItemInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SyncMapItemInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SyncMapItemInstanceUpdateOptions): js.Promise[SyncMapItemInstance] = js.native
    def update(
      opts: SyncMapItemInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemInstance, Any]
    ): js.Promise[SyncMapItemInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapItem", "SyncMapItemInstance")
  @js.native
  open class SyncMapItemInstance protected () extends SerializableClass {
    /**
      * Initialize the SyncMapItemContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The service_sid
      * @param mapSid - The map_sid
      * @param key - The key
      */
    def this(
      version: typings.twilio.libRestPreviewSyncMod.^,
      payload: SyncMapItemPayload,
      serviceSid: String,
      mapSid: String,
      key: String
    ) = this()
    
    /* private */ var _proxy: SyncMapItemContext = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var data: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SyncMapItemInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncMapItemInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncMapItemInstance] = js.native
    
    var key: String = js.native
    
    var mapSid: String = js.native
    
    /**
      * remove a SyncMapItemInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: SyncMapItemInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: SyncMapItemInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[Boolean] = js.native
    
    var revision: String = js.native
    
    var serviceSid: String = js.native
    
    /**
      * update a SyncMapItemInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SyncMapItemInstanceUpdateOptions): js.Promise[SyncMapItemInstance] = js.native
    def update(
      opts: SyncMapItemInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SyncMapItemInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SyncMapItemList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param serviceSid - The service_sid
    * @param mapSid - The map_sid
    */
  inline def SyncMapItemList(version: typings.twilio.libRestPreviewSyncMod.^, serviceSid: String, mapSid: String): SyncMapItemListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncMapItemList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], mapSid.asInstanceOf[js.Any])).asInstanceOf[SyncMapItemListInstance]
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncMap/syncMapItem", "SyncMapItemPage")
  @js.native
  open class SyncMapItemPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewSyncMod.^, 
          SyncMapItemPayload, 
          SyncMapItemResource, 
          SyncMapItemInstance
        ] {
    /**
      * Initialize the SyncMapItemPage
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
      solution: SyncMapItemSolution
    ) = this()
    
    /**
      * Build an instance of SyncMapItemInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncMapItemPayload): SyncMapItemInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to remove
    *
    * @property ifMatch - The If-Match HTTP request header
    */
  trait SyncMapItemInstanceRemoveOptions extends StObject {
    
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object SyncMapItemInstanceRemoveOptions {
    
    inline def apply(): SyncMapItemInstanceRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapItemInstanceRemoveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemInstanceRemoveOptions] (val x: Self) extends AnyVal {
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  /**
    * Options to pass to update
    *
    * @property data - The data
    * @property ifMatch - The If-Match HTTP request header
    */
  trait SyncMapItemInstanceUpdateOptions extends StObject {
    
    var data: js.Object
    
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object SyncMapItemInstanceUpdateOptions {
    
    inline def apply(data: js.Object): SyncMapItemInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapItemInstanceUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemInstanceUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  @js.native
  trait SyncMapItemListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SyncMapItemContext = js.native
    
    /**
      * create a SyncMapItemInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SyncMapItemListInstanceCreateOptions): js.Promise[SyncMapItemInstance] = js.native
    def create(
      opts: SyncMapItemListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncMapItemInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncMapItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SyncMapItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SyncMapItemListInstanceEachOptions): Unit = js.native
    def each(
      opts: SyncMapItemListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncMapItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sync_map_item
      *
      * @param key - The key
      */
    def get(key: String): SyncMapItemContext = js.native
    
    /**
      * Retrieve a single target page of SyncMapItemInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SyncMapItemPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemPage, Any]): js.Promise[SyncMapItemPage] = js.native
    def getPage(targetUrl: String): js.Promise[SyncMapItemPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemPage, Any]
    ): js.Promise[SyncMapItemPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemPage, Any]
    ): js.Promise[SyncMapItemPage] = js.native
    
    /**
      * Lists SyncMapItemInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncMapItemInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapItemInstance], Any]
    ): js.Promise[js.Array[SyncMapItemInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncMapItemInstance], Any]
    ): js.Promise[js.Array[SyncMapItemInstance]] = js.native
    def list(opts: SyncMapItemListInstanceOptions): js.Promise[js.Array[SyncMapItemInstance]] = js.native
    def list(
      opts: SyncMapItemListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SyncMapItemPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemPage, Any]): js.Promise[SyncMapItemPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemPage, Any]): js.Promise[SyncMapItemPage] = js.native
    def page(opts: SyncMapItemListInstancePageOptions): js.Promise[SyncMapItemPage] = js.native
    def page(
      opts: SyncMapItemListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncMapItemPage, Any]
    ): js.Promise[SyncMapItemPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property data - The data
    * @property key - The key
    */
  trait SyncMapItemListInstanceCreateOptions extends StObject {
    
    var data: js.Object
    
    var key: String
  }
  object SyncMapItemListInstanceCreateOptions {
    
    inline def apply(data: js.Object, key: String): SyncMapItemListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapItemListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property bounds - The bounds
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property from - The from
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property order - The order
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait SyncMapItemListInstanceEachOptions extends StObject {
    
    var bounds: js.UndefOr[SyncMapItemQueryFromBoundType] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncMapItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[SyncMapItemQueryResultOrder] = js.undefined
    
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
  
  /**
    * Options to pass to list
    *
    * @property bounds - The bounds
    * @property from - The from
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property order - The order
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait SyncMapItemListInstanceOptions extends StObject {
    
    var bounds: js.UndefOr[SyncMapItemQueryFromBoundType] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[SyncMapItemQueryResultOrder] = js.undefined
    
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
  
  /**
    * Options to pass to page
    *
    * @property bounds - The bounds
    * @property from - The from
    * @property order - The order
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait SyncMapItemListInstancePageOptions extends StObject {
    
    var bounds: js.UndefOr[SyncMapItemQueryFromBoundType] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var order: js.UndefOr[SyncMapItemQueryResultOrder] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
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
       with SyncMapItemResource
       with TwilioResponsePayload
  object SyncMapItemPayload {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      data: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      key: String,
      map_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      revision: String,
      service_sid: String,
      uri: String,
      url: String
    ): SyncMapItemPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], map_sid = map_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncMapItemPayload]
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
    
    var data: js.Object
    
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
      data: js.Object,
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
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
    
    var mapSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object SyncMapItemSolution {
    
    inline def apply(): SyncMapItemSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapItemSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapItemSolution] (val x: Self) extends AnyVal {
      
      inline def setMapSid(value: String): Self = StObject.set(x, "mapSid", value.asInstanceOf[js.Any])
      
      inline def setMapSidUndefined: Self = StObject.set(x, "mapSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
