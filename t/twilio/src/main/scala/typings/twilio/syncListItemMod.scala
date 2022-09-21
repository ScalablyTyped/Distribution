package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.asc_
import typings.twilio.twilioStrings.desc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncListItemMod {
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListItem", "SyncListItemContext")
  @js.native
  open class SyncListItemContext protected () extends StObject {
    /**
      * Initialize the SyncListItemContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param serviceSid - The service_sid
      * @param listSid - The list_sid
      * @param index - The index
      */
    def this(version: typings.twilio.syncMod.^, serviceSid: String, listSid: String, index: Double) = this()
    
    /**
      * fetch a SyncListItemInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncListItemInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemInstance, Any]): js.Promise[SyncListItemInstance] = js.native
    
    /**
      * remove a SyncListItemInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemInstance, Any]): js.Promise[Boolean] = js.native
    def remove(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemInstance, Any]
    ): js.Promise[Boolean] = js.native
    def remove(opts: SyncListItemInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: SyncListItemInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SyncListItemInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SyncListItemInstanceUpdateOptions): js.Promise[SyncListItemInstance] = js.native
    def update(
      opts: SyncListItemInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemInstance, Any]
    ): js.Promise[SyncListItemInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListItem", "SyncListItemInstance")
  @js.native
  open class SyncListItemInstance protected () extends SerializableClass {
    /**
      * Initialize the SyncListItemContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The service_sid
      * @param listSid - The list_sid
      * @param index - The index
      */
    def this(
      version: typings.twilio.syncMod.^,
      payload: SyncListItemPayload,
      serviceSid: String,
      listSid: String,
      index: Double
    ) = this()
    
    /* private */ var _proxy: SyncListItemContext = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var data: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SyncListItemInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncListItemInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncListItemInstance] = js.native
    
    var index: Double = js.native
    
    var listSid: String = js.native
    
    /**
      * remove a SyncListItemInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: SyncListItemInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: SyncListItemInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[Boolean] = js.native
    
    var revision: String = js.native
    
    var serviceSid: String = js.native
    
    /**
      * update a SyncListItemInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SyncListItemInstanceUpdateOptions): js.Promise[SyncListItemInstance] = js.native
    def update(
      opts: SyncListItemInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SyncListItemInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SyncListItemList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param serviceSid - The service_sid
    * @param listSid - The list_sid
    */
  inline def SyncListItemList(version: typings.twilio.syncMod.^, serviceSid: String, listSid: String): SyncListItemListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncListItemList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], listSid.asInstanceOf[js.Any])).asInstanceOf[SyncListItemListInstance]
  
  @JSImport("twilio/lib/rest/preview/sync/service/syncList/syncListItem", "SyncListItemPage")
  @js.native
  open class SyncListItemPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.syncMod.^, 
          SyncListItemPayload, 
          SyncListItemResource, 
          SyncListItemInstance
        ] {
    /**
      * Initialize the SyncListItemPage
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
      solution: SyncListItemSolution
    ) = this()
    
    /**
      * Build an instance of SyncListItemInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncListItemPayload): SyncListItemInstance = js.native
    
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
  trait SyncListItemInstanceRemoveOptions extends StObject {
    
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object SyncListItemInstanceRemoveOptions {
    
    inline def apply(): SyncListItemInstanceRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListItemInstanceRemoveOptions]
    }
    
    extension [Self <: SyncListItemInstanceRemoveOptions](x: Self) {
      
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
  trait SyncListItemInstanceUpdateOptions extends StObject {
    
    var data: js.Object
    
    var ifMatch: js.UndefOr[String] = js.undefined
  }
  object SyncListItemInstanceUpdateOptions {
    
    inline def apply(data: js.Object): SyncListItemInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListItemInstanceUpdateOptions]
    }
    
    extension [Self <: SyncListItemInstanceUpdateOptions](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    }
  }
  
  @js.native
  trait SyncListItemListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SyncListItemContext = js.native
    
    /**
      * create a SyncListItemInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SyncListItemListInstanceCreateOptions): js.Promise[SyncListItemInstance] = js.native
    def create(
      opts: SyncListItemListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncListItemInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SyncListItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SyncListItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SyncListItemListInstanceEachOptions): Unit = js.native
    def each(
      opts: SyncListItemListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncListItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sync_list_item
      *
      * @param index - The index
      */
    def get(index: String): SyncListItemContext = js.native
    
    /**
      * Retrieve a single target page of SyncListItemInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SyncListItemPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemPage, Any]): js.Promise[SyncListItemPage] = js.native
    def getPage(targetUrl: String): js.Promise[SyncListItemPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemPage, Any]
    ): js.Promise[SyncListItemPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemPage, Any]
    ): js.Promise[SyncListItemPage] = js.native
    
    /**
      * Lists SyncListItemInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncListItemInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListItemInstance], Any]
    ): js.Promise[js.Array[SyncListItemInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncListItemInstance], Any]
    ): js.Promise[js.Array[SyncListItemInstance]] = js.native
    def list(opts: SyncListItemListInstanceOptions): js.Promise[js.Array[SyncListItemInstance]] = js.native
    def list(
      opts: SyncListItemListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SyncListItemPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemPage, Any]): js.Promise[SyncListItemPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemPage, Any]): js.Promise[SyncListItemPage] = js.native
    def page(opts: SyncListItemListInstancePageOptions): js.Promise[SyncListItemPage] = js.native
    def page(
      opts: SyncListItemListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncListItemPage, Any]
    ): js.Promise[SyncListItemPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property data - The data
    */
  trait SyncListItemListInstanceCreateOptions extends StObject {
    
    var data: js.Object
  }
  object SyncListItemListInstanceCreateOptions {
    
    inline def apply(data: js.Object): SyncListItemListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListItemListInstanceCreateOptions]
    }
    
    extension [Self <: SyncListItemListInstanceCreateOptions](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
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
  trait SyncListItemListInstanceEachOptions extends StObject {
    
    var bounds: js.UndefOr[SyncListItemQueryFromBoundType] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncListItemInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[SyncListItemQueryResultOrder] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncListItemListInstanceEachOptions {
    
    inline def apply(): SyncListItemListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListItemListInstanceEachOptions]
    }
    
    extension [Self <: SyncListItemListInstanceEachOptions](x: Self) {
      
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
  trait SyncListItemListInstanceOptions extends StObject {
    
    var bounds: js.UndefOr[SyncListItemQueryFromBoundType] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[SyncListItemQueryResultOrder] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncListItemListInstanceOptions {
    
    inline def apply(): SyncListItemListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListItemListInstanceOptions]
    }
    
    extension [Self <: SyncListItemListInstanceOptions](x: Self) {
      
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
  trait SyncListItemListInstancePageOptions extends StObject {
    
    var bounds: js.UndefOr[SyncListItemQueryFromBoundType] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var order: js.UndefOr[SyncListItemQueryResultOrder] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncListItemListInstancePageOptions {
    
    inline def apply(): SyncListItemListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListItemListInstancePageOptions]
    }
    
    extension [Self <: SyncListItemListInstancePageOptions](x: Self) {
      
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
       with SyncListItemResource
       with TwilioResponsePayload
  object SyncListItemPayload {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      data: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      index: Double,
      list_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      revision: String,
      service_sid: String,
      uri: String,
      url: String
    ): SyncListItemPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], list_sid = list_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListItemPayload]
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
    - typings.twilio.twilioStrings.asc_
    - typings.twilio.twilioStrings.desc_
  */
  trait SyncListItemQueryResultOrder extends StObject
  object SyncListItemQueryResultOrder {
    
    inline def asc: asc_ = "asc".asInstanceOf[asc_]
    
    inline def desc: desc_ = "desc".asInstanceOf[desc_]
  }
  
  trait SyncListItemResource extends StObject {
    
    var account_sid: String
    
    var created_by: String
    
    var data: js.Object
    
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
      data: js.Object,
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
    
    extension [Self <: SyncListItemResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
    
    var listSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object SyncListItemSolution {
    
    inline def apply(): SyncListItemSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncListItemSolution]
    }
    
    extension [Self <: SyncListItemSolution](x: Self) {
      
      inline def setListSid(value: String): Self = StObject.set(x, "listSid", value.asInstanceOf[js.Any])
      
      inline def setListSidUndefined: Self = StObject.set(x, "listSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
