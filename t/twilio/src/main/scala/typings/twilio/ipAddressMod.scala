package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipAddressMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/ipAccessControlList/ipAddress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/ipAccessControlList/ipAddress", "IpAddressContext")
  @js.native
  open class IpAddressContext protected () extends StObject {
    /**
      * Initialize the IpAddressContext
      *
      * @param version - Version of the resource
      * @param accountSid - The unique sid that identifies this account
      * @param ipAccessControlListSid - The IpAccessControlList Sid that identifies the IpAddress resources to fetch
      * @param sid - A string that identifies the IpAddress resource to fetch
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      accountSid: String,
      ipAccessControlListSid: String,
      sid: String
    ) = this()
    
    /**
      * fetch a IpAddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[IpAddressInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressInstance, Any]): js.Promise[IpAddressInstance] = js.native
    
    /**
      * remove a IpAddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a IpAddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[IpAddressInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressInstance, Any]): js.Promise[IpAddressInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressInstance, Any]
    ): js.Promise[IpAddressInstance] = js.native
    def update(opts: IpAddressInstanceUpdateOptions): js.Promise[IpAddressInstance] = js.native
    def update(
      opts: IpAddressInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressInstance, Any]
    ): js.Promise[IpAddressInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/ipAccessControlList/ipAddress", "IpAddressInstance")
  @js.native
  open class IpAddressInstance protected () extends SerializableClass {
    /**
      * Initialize the IpAddressContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The unique id of the Account that is responsible for this resource.
      * @param ipAccessControlListSid - The unique id of the IpAccessControlList resource that includes this resource.
      * @param sid - A string that identifies the IpAddress resource to fetch
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: IpAddressPayload,
      accountSid: String,
      ipAccessControlListSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: IpAddressContext = js.native
    
    var accountSid: String = js.native
    
    var cidrPrefixLength: Double = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a IpAddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[IpAddressInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[IpAddressInstance] = js.native
    
    var friendlyName: String = js.native
    
    var ipAccessControlListSid: String = js.native
    
    var ipAddress: String = js.native
    
    /**
      * remove a IpAddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a IpAddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[IpAddressInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[IpAddressInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[IpAddressInstance] = js.native
    def update(opts: IpAddressInstanceUpdateOptions): js.Promise[IpAddressInstance] = js.native
    def update(
      opts: IpAddressInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[IpAddressInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the IpAddressList
    *
    * @param version - Version of the resource
    * @param accountSid - The unique id of the Account that is responsible for this resource.
    * @param ipAccessControlListSid - The unique id of the IpAccessControlList resource that includes this resource.
    */
  inline def IpAddressList(version: typings.twilio.v2010Mod.^, accountSid: String, ipAccessControlListSid: String): IpAddressListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("IpAddressList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], ipAccessControlListSid.asInstanceOf[js.Any])).asInstanceOf[IpAddressListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/ipAccessControlList/ipAddress", "IpAddressPage")
  @js.native
  open class IpAddressPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, IpAddressPayload, IpAddressResource, IpAddressInstance] {
    /**
      * Initialize the IpAddressPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: IpAddressSolution
    ) = this()
    
    /**
      * Build an instance of IpAddressInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: IpAddressPayload): IpAddressInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property cidrPrefixLength - An integer representing the length of the CIDR prefix to use with this IP address when accepting traffic. By default the entire IP address is used.
    * @property friendlyName - A human readable descriptive text for this resource, up to 255 characters long.
    * @property ipAddress - An IP address in dotted decimal notation from which you want to accept traffic. Any SIP requests from this IP address will be allowed by Twilio. IPv4 only supported today.
    */
  trait IpAddressInstanceUpdateOptions extends StObject {
    
    var cidrPrefixLength: js.UndefOr[Double] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var ipAddress: js.UndefOr[String] = js.undefined
  }
  object IpAddressInstanceUpdateOptions {
    
    inline def apply(): IpAddressInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAddressInstanceUpdateOptions]
    }
    
    extension [Self <: IpAddressInstanceUpdateOptions](x: Self) {
      
      inline def setCidrPrefixLength(value: Double): Self = StObject.set(x, "cidrPrefixLength", value.asInstanceOf[js.Any])
      
      inline def setCidrPrefixLengthUndefined: Self = StObject.set(x, "cidrPrefixLength", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    }
  }
  
  @js.native
  trait IpAddressListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): IpAddressContext = js.native
    
    /**
      * create a IpAddressInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: IpAddressListInstanceCreateOptions): js.Promise[IpAddressInstance] = js.native
    def create(
      opts: IpAddressListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ IpAddressInstance, Any]
    ): js.Promise[IpAddressInstance] = js.native
    
    /**
      * Streams IpAddressInstance records from the API.
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
          /* item */ IpAddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ IpAddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: IpAddressListInstanceEachOptions): Unit = js.native
    def each(
      opts: IpAddressListInstanceEachOptions,
      callback: js.Function2[
          /* item */ IpAddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a ip_address
      *
      * @param sid - A string that identifies the IpAddress resource to fetch
      */
    def get(sid: String): IpAddressContext = js.native
    
    /**
      * Retrieve a single target page of IpAddressInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[IpAddressPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressPage, Any]): js.Promise[IpAddressPage] = js.native
    def getPage(targetUrl: String): js.Promise[IpAddressPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressPage, Any]
    ): js.Promise[IpAddressPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressPage, Any]
    ): js.Promise[IpAddressPage] = js.native
    
    /**
      * Lists IpAddressInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[IpAddressInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpAddressInstance], Any]): js.Promise[js.Array[IpAddressInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpAddressInstance], Any]
    ): js.Promise[js.Array[IpAddressInstance]] = js.native
    def list(opts: IpAddressListInstanceOptions): js.Promise[js.Array[IpAddressInstance]] = js.native
    def list(
      opts: IpAddressListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpAddressInstance], Any]
    ): js.Promise[js.Array[IpAddressInstance]] = js.native
    
    /**
      * Retrieve a single page of IpAddressInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[IpAddressPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressPage, Any]): js.Promise[IpAddressPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressPage, Any]): js.Promise[IpAddressPage] = js.native
    def page(opts: IpAddressListInstancePageOptions): js.Promise[IpAddressPage] = js.native
    def page(
      opts: IpAddressListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpAddressPage, Any]
    ): js.Promise[IpAddressPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property cidrPrefixLength - An integer representing the length of the CIDR prefix to use with this IP address when accepting traffic. By default the entire IP address is used.
    * @property friendlyName - A human readable descriptive text for this resource, up to 255 characters long.
    * @property ipAddress - An IP address in dotted decimal notation from which you want to accept traffic. Any SIP requests from this IP address will be allowed by Twilio. IPv4 only supported today.
    */
  trait IpAddressListInstanceCreateOptions extends StObject {
    
    var cidrPrefixLength: js.UndefOr[Double] = js.undefined
    
    var friendlyName: String
    
    var ipAddress: String
  }
  object IpAddressListInstanceCreateOptions {
    
    inline def apply(friendlyName: String, ipAddress: String): IpAddressListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpAddressListInstanceCreateOptions]
    }
    
    extension [Self <: IpAddressListInstanceCreateOptions](x: Self) {
      
      inline def setCidrPrefixLength(value: Double): Self = StObject.set(x, "cidrPrefixLength", value.asInstanceOf[js.Any])
      
      inline def setCidrPrefixLengthUndefined: Self = StObject.set(x, "cidrPrefixLength", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
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
  trait IpAddressListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ IpAddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object IpAddressListInstanceEachOptions {
    
    inline def apply(): IpAddressListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAddressListInstanceEachOptions]
    }
    
    extension [Self <: IpAddressListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ IpAddressInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait IpAddressListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object IpAddressListInstanceOptions {
    
    inline def apply(): IpAddressListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAddressListInstanceOptions]
    }
    
    extension [Self <: IpAddressListInstanceOptions](x: Self) {
      
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
  trait IpAddressListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object IpAddressListInstancePageOptions {
    
    inline def apply(): IpAddressListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAddressListInstancePageOptions]
    }
    
    extension [Self <: IpAddressListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait IpAddressPayload
    extends StObject
       with IpAddressResource {
    
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
  object IpAddressPayload {
    
    inline def apply(
      account_sid: String,
      cidr_prefix_length: Double,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      ip_access_control_list_sid: String,
      ip_address: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String
    ): IpAddressPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cidr_prefix_length = cidr_prefix_length.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], ip_access_control_list_sid = ip_access_control_list_sid.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpAddressPayload]
    }
    
    extension [Self <: IpAddressPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IpAddressResource extends StObject {
    
    var account_sid: String
    
    var cidr_prefix_length: Double
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var ip_access_control_list_sid: String
    
    var ip_address: String
    
    var sid: String
    
    var uri: String
  }
  object IpAddressResource {
    
    inline def apply(
      account_sid: String,
      cidr_prefix_length: Double,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      ip_access_control_list_sid: String,
      ip_address: String,
      sid: String,
      uri: String
    ): IpAddressResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cidr_prefix_length = cidr_prefix_length.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], ip_access_control_list_sid = ip_access_control_list_sid.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpAddressResource]
    }
    
    extension [Self <: IpAddressResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCidr_prefix_length(value: Double): Self = StObject.set(x, "cidr_prefix_length", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIp_access_control_list_sid(value: String): Self = StObject.set(x, "ip_access_control_list_sid", value.asInstanceOf[js.Any])
      
      inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IpAddressSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var ipAccessControlListSid: js.UndefOr[String] = js.undefined
  }
  object IpAddressSolution {
    
    inline def apply(): IpAddressSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpAddressSolution]
    }
    
    extension [Self <: IpAddressSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setIpAccessControlListSid(value: String): Self = StObject.set(x, "ipAccessControlListSid", value.asInstanceOf[js.Any])
      
      inline def setIpAccessControlListSidUndefined: Self = StObject.set(x, "ipAccessControlListSid", js.undefined)
    }
  }
}
