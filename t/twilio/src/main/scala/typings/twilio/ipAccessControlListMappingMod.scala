package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipAccessControlListMappingMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/ipAccessControlListMapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/ipAccessControlListMapping", "IpAccessControlListMappingContext")
  @js.native
  open class IpAccessControlListMappingContext protected () extends StObject {
    /**
      * Initialize the IpAccessControlListMappingContext
      *
      * @param version - Version of the resource
      * @param accountSid - The unique id of the Account that is responsible for this resource.
      * @param domainSid - A string that uniquely identifies the SIP Domain
      * @param sid - A 34 character string that uniquely identifies the resource to fetch.
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, domainSid: String, sid: String) = this()
    
    /**
      * fetch a IpAccessControlListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[IpAccessControlListMappingInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListMappingInstance, Any]
    ): js.Promise[IpAccessControlListMappingInstance] = js.native
    
    /**
      * remove a IpAccessControlListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListMappingInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/ipAccessControlListMapping", "IpAccessControlListMappingInstance")
  @js.native
  open class IpAccessControlListMappingInstance protected () extends SerializableClass {
    /**
      * Initialize the IpAccessControlListMappingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The unique id of the Account that is responsible for this resource.
      * @param domainSid - The unique string that identifies the SipDomain resource.
      * @param sid - A 34 character string that uniquely identifies the resource to fetch.
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: IpAccessControlListMappingPayload,
      accountSid: String,
      domainSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: IpAccessControlListMappingContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var domainSid: String = js.native
    
    /**
      * fetch a IpAccessControlListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[IpAccessControlListMappingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[IpAccessControlListMappingInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a IpAccessControlListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the IpAccessControlListMappingList
    *
    * @param version - Version of the resource
    * @param accountSid - The unique id of the Account that is responsible for this resource.
    * @param domainSid - The unique string that identifies the SipDomain resource.
    */
  inline def IpAccessControlListMappingList(version: typings.twilio.v2010Mod.^, accountSid: String, domainSid: String): IpAccessControlListMappingListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("IpAccessControlListMappingList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], domainSid.asInstanceOf[js.Any])).asInstanceOf[IpAccessControlListMappingListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/ipAccessControlListMapping", "IpAccessControlListMappingPage")
  @js.native
  open class IpAccessControlListMappingPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          IpAccessControlListMappingPayload, 
          IpAccessControlListMappingResource, 
          IpAccessControlListMappingInstance
        ] {
    /**
      * Initialize the IpAccessControlListMappingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: IpAccessControlListMappingSolution
    ) = this()
    
    /**
      * Build an instance of IpAccessControlListMappingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: IpAccessControlListMappingPayload): IpAccessControlListMappingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait IpAccessControlListMappingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): IpAccessControlListMappingContext = js.native
    
    /**
      * create a IpAccessControlListMappingInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: IpAccessControlListMappingListInstanceCreateOptions): js.Promise[IpAccessControlListMappingInstance] = js.native
    def create(
      opts: IpAccessControlListMappingListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ IpAccessControlListMappingInstance, Any]
    ): js.Promise[IpAccessControlListMappingInstance] = js.native
    
    /**
      * Streams IpAccessControlListMappingInstance records from the API.
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
          /* item */ IpAccessControlListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ IpAccessControlListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: IpAccessControlListMappingListInstanceEachOptions): Unit = js.native
    def each(
      opts: IpAccessControlListMappingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ IpAccessControlListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a ip_access_control_list_mapping
      *
      * @param sid - A 34 character string that uniquely identifies the resource to fetch.
      */
    def get(sid: String): IpAccessControlListMappingContext = js.native
    
    /**
      * Retrieve a single target page of IpAccessControlListMappingInstance records from
      * the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[IpAccessControlListMappingPage] = js.native
    def getPage(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListMappingPage, Any]
    ): js.Promise[IpAccessControlListMappingPage] = js.native
    def getPage(targetUrl: String): js.Promise[IpAccessControlListMappingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListMappingPage, Any]
    ): js.Promise[IpAccessControlListMappingPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListMappingPage, Any]
    ): js.Promise[IpAccessControlListMappingPage] = js.native
    
    /**
      * Lists IpAccessControlListMappingInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[IpAccessControlListMappingInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[IpAccessControlListMappingInstance], 
          Any
        ]
    ): js.Promise[js.Array[IpAccessControlListMappingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[IpAccessControlListMappingInstance], 
          Any
        ]
    ): js.Promise[js.Array[IpAccessControlListMappingInstance]] = js.native
    def list(opts: IpAccessControlListMappingListInstanceOptions): js.Promise[js.Array[IpAccessControlListMappingInstance]] = js.native
    def list(
      opts: IpAccessControlListMappingListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[IpAccessControlListMappingInstance], 
          Any
        ]
    ): js.Promise[js.Array[IpAccessControlListMappingInstance]] = js.native
    
    /**
      * Retrieve a single page of IpAccessControlListMappingInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[IpAccessControlListMappingPage] = js.native
    def page(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListMappingPage, Any]
    ): js.Promise[IpAccessControlListMappingPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListMappingPage, Any]
    ): js.Promise[IpAccessControlListMappingPage] = js.native
    def page(opts: IpAccessControlListMappingListInstancePageOptions): js.Promise[IpAccessControlListMappingPage] = js.native
    def page(
      opts: IpAccessControlListMappingListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAccessControlListMappingPage, Any]
    ): js.Promise[IpAccessControlListMappingPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property ipAccessControlListSid - The unique id of the IP access control list to map to the SIP domain
    */
  trait IpAccessControlListMappingListInstanceCreateOptions extends StObject {
    
    var ipAccessControlListSid: String
  }
  object IpAccessControlListMappingListInstanceCreateOptions {
    
    inline def apply(ipAccessControlListSid: String): IpAccessControlListMappingListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(ipAccessControlListSid = ipAccessControlListSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpAccessControlListMappingListInstanceCreateOptions]
    }
    
    extension [Self <: IpAccessControlListMappingListInstanceCreateOptions](x: Self) {
      
      inline def setIpAccessControlListSid(value: String): Self = StObject.set(x, "ipAccessControlListSid", value.asInstanceOf[js.Any])
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
  trait IpAccessControlListMappingListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ IpAccessControlListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object IpAccessControlListMappingListInstanceEachOptions {
    
    inline def apply(): IpAccessControlListMappingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAccessControlListMappingListInstanceEachOptions]
    }
    
    extension [Self <: IpAccessControlListMappingListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ IpAccessControlListMappingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait IpAccessControlListMappingListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object IpAccessControlListMappingListInstanceOptions {
    
    inline def apply(): IpAccessControlListMappingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAccessControlListMappingListInstanceOptions]
    }
    
    extension [Self <: IpAccessControlListMappingListInstanceOptions](x: Self) {
      
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
  trait IpAccessControlListMappingListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object IpAccessControlListMappingListInstancePageOptions {
    
    inline def apply(): IpAccessControlListMappingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAccessControlListMappingListInstancePageOptions]
    }
    
    extension [Self <: IpAccessControlListMappingListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait IpAccessControlListMappingPayload
    extends StObject
       with IpAccessControlListMappingResource {
    
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
  object IpAccessControlListMappingPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      domain_sid: String,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String
    ): IpAccessControlListMappingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], domain_sid = domain_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpAccessControlListMappingPayload]
    }
    
    extension [Self <: IpAccessControlListMappingPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IpAccessControlListMappingResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var domain_sid: String
    
    var friendly_name: String
    
    var sid: String
    
    var uri: String
  }
  object IpAccessControlListMappingResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      domain_sid: String,
      friendly_name: String,
      sid: String,
      uri: String
    ): IpAccessControlListMappingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], domain_sid = domain_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpAccessControlListMappingResource]
    }
    
    extension [Self <: IpAccessControlListMappingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDomain_sid(value: String): Self = StObject.set(x, "domain_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IpAccessControlListMappingSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var domainSid: js.UndefOr[String] = js.undefined
  }
  object IpAccessControlListMappingSolution {
    
    inline def apply(): IpAccessControlListMappingSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAccessControlListMappingSolution]
    }
    
    extension [Self <: IpAccessControlListMappingSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setDomainSid(value: String): Self = StObject.set(x, "domainSid", value.asInstanceOf[js.Any])
      
      inline def setDomainSidUndefined: Self = StObject.set(x, "domainSid", js.undefined)
    }
  }
}
