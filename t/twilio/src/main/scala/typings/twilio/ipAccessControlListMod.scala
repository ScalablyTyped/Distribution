package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.ipAddressMod.IpAddressContext
import typings.twilio.ipAddressMod.IpAddressListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipAccessControlListMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/ipAccessControlList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/ipAccessControlList", "IpAccessControlListContext")
  @js.native
  open class IpAccessControlListContext protected () extends StObject {
    /**
      * Initialize the IpAccessControlListContext
      *
      * @param version - Version of the resource
      * @param accountSid - The unique sid that identifies this account
      * @param sid - A string that identifies the resource to fetch
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a IpAccessControlListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[IpAccessControlListInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListInstance, Any]): js.Promise[IpAccessControlListInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def ipAddresses(sid: String): IpAddressContext = js.native
    @JSName("ipAddresses")
    var ipAddresses_Original: IpAddressListInstance = js.native
    
    /**
      * remove a IpAccessControlListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a IpAccessControlListInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: IpAccessControlListInstanceUpdateOptions): js.Promise[IpAccessControlListInstance] = js.native
    def update(
      opts: IpAccessControlListInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListInstance, Any]
    ): js.Promise[IpAccessControlListInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/ipAccessControlList", "IpAccessControlListInstance")
  @js.native
  open class IpAccessControlListInstance protected () extends SerializableClass {
    /**
      * Initialize the IpAccessControlListContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - A 34 character string that uniquely identifies this resource.
      * @param sid - A string that identifies the resource to fetch
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: IpAccessControlListPayload,
      accountSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: IpAccessControlListContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a IpAccessControlListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[IpAccessControlListInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[IpAccessControlListInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * Access the ipAddresses
      */
    def ipAddresses(): IpAddressListInstance = js.native
    
    /**
      * remove a IpAccessControlListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var subresourceUris: String = js.native
    
    /**
      * update a IpAccessControlListInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: IpAccessControlListInstanceUpdateOptions): js.Promise[IpAccessControlListInstance] = js.native
    def update(
      opts: IpAccessControlListInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[IpAccessControlListInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the IpAccessControlListList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def IpAccessControlListList(version: typings.twilio.v2010Mod.^, accountSid: String): IpAccessControlListListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("IpAccessControlListList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[IpAccessControlListListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/ipAccessControlList", "IpAccessControlListPage")
  @js.native
  open class IpAccessControlListPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          IpAccessControlListPayload, 
          IpAccessControlListResource, 
          IpAccessControlListInstance
        ] {
    /**
      * Initialize the IpAccessControlListPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: IpAccessControlListSolution
    ) = this()
    
    /**
      * Build an instance of IpAccessControlListInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: IpAccessControlListPayload): IpAccessControlListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - A human readable description of this resource
    */
  trait IpAccessControlListInstanceUpdateOptions extends StObject {
    
    var friendlyName: String
  }
  object IpAccessControlListInstanceUpdateOptions {
    
    inline def apply(friendlyName: String): IpAccessControlListInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpAccessControlListInstanceUpdateOptions]
    }
    
    extension [Self <: IpAccessControlListInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IpAccessControlListListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): IpAccessControlListContext = js.native
    
    /**
      * create a IpAccessControlListInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: IpAccessControlListListInstanceCreateOptions): js.Promise[IpAccessControlListInstance] = js.native
    def create(
      opts: IpAccessControlListListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ IpAccessControlListInstance, Any]
    ): js.Promise[IpAccessControlListInstance] = js.native
    
    /**
      * Streams IpAccessControlListInstance records from the API.
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
          /* item */ IpAccessControlListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ IpAccessControlListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: IpAccessControlListListInstanceEachOptions): Unit = js.native
    def each(
      opts: IpAccessControlListListInstanceEachOptions,
      callback: js.Function2[
          /* item */ IpAccessControlListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a ip_access_control_list
      *
      * @param sid - A string that identifies the resource to fetch
      */
    def get(sid: String): IpAccessControlListContext = js.native
    
    /**
      * Retrieve a single target page of IpAccessControlListInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[IpAccessControlListPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListPage, Any]): js.Promise[IpAccessControlListPage] = js.native
    def getPage(targetUrl: String): js.Promise[IpAccessControlListPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListPage, Any]
    ): js.Promise[IpAccessControlListPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListPage, Any]
    ): js.Promise[IpAccessControlListPage] = js.native
    
    /**
      * Lists IpAccessControlListInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[IpAccessControlListInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpAccessControlListInstance], Any]
    ): js.Promise[js.Array[IpAccessControlListInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpAccessControlListInstance], Any]
    ): js.Promise[js.Array[IpAccessControlListInstance]] = js.native
    def list(opts: IpAccessControlListListInstanceOptions): js.Promise[js.Array[IpAccessControlListInstance]] = js.native
    def list(
      opts: IpAccessControlListListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpAccessControlListInstance], Any]
    ): js.Promise[js.Array[IpAccessControlListInstance]] = js.native
    
    /**
      * Retrieve a single page of IpAccessControlListInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[IpAccessControlListPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListPage, Any]): js.Promise[IpAccessControlListPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListPage, Any]
    ): js.Promise[IpAccessControlListPage] = js.native
    def page(opts: IpAccessControlListListInstancePageOptions): js.Promise[IpAccessControlListPage] = js.native
    def page(
      opts: IpAccessControlListListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListPage, Any]
    ): js.Promise[IpAccessControlListPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - A human readable description of this resource
    */
  trait IpAccessControlListListInstanceCreateOptions extends StObject {
    
    var friendlyName: String
  }
  object IpAccessControlListListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): IpAccessControlListListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpAccessControlListListInstanceCreateOptions]
    }
    
    extension [Self <: IpAccessControlListListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
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
  trait IpAccessControlListListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ IpAccessControlListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object IpAccessControlListListInstanceEachOptions {
    
    inline def apply(): IpAccessControlListListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAccessControlListListInstanceEachOptions]
    }
    
    extension [Self <: IpAccessControlListListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ IpAccessControlListInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait IpAccessControlListListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object IpAccessControlListListInstanceOptions {
    
    inline def apply(): IpAccessControlListListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAccessControlListListInstanceOptions]
    }
    
    extension [Self <: IpAccessControlListListInstanceOptions](x: Self) {
      
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
  trait IpAccessControlListListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object IpAccessControlListListInstancePageOptions {
    
    inline def apply(): IpAccessControlListListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAccessControlListListInstancePageOptions]
    }
    
    extension [Self <: IpAccessControlListListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait IpAccessControlListPayload
    extends StObject
       with IpAccessControlListResource {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
  }
  object IpAccessControlListPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      subresource_uris: String,
      uri: String
    ): IpAccessControlListPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpAccessControlListPayload]
    }
    
    extension [Self <: IpAccessControlListPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IpAccessControlListResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
    
    var subresource_uris: String
    
    var uri: String
  }
  object IpAccessControlListResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      sid: String,
      subresource_uris: String,
      uri: String
    ): IpAccessControlListResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpAccessControlListResource]
    }
    
    extension [Self <: IpAccessControlListResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IpAccessControlListSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object IpAccessControlListSolution {
    
    inline def apply(): IpAccessControlListSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAccessControlListSolution]
    }
    
    extension [Self <: IpAccessControlListSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
