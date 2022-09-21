package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipRecordMod {
  
  @JSImport("twilio/lib/rest/voice/v1/ipRecord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/voice/v1/ipRecord", "IpRecordContext")
  @js.native
  open class IpRecordContext protected () extends StObject {
    /**
      * Initialize the IpRecordContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, sid: String) = this()
    
    /**
      * fetch a IpRecordInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[IpRecordInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordInstance, Any]): js.Promise[IpRecordInstance] = js.native
    
    /**
      * remove a IpRecordInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a IpRecordInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[IpRecordInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordInstance, Any]): js.Promise[IpRecordInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordInstance, Any]): js.Promise[IpRecordInstance] = js.native
    def update(opts: IpRecordInstanceUpdateOptions): js.Promise[IpRecordInstance] = js.native
    def update(
      opts: IpRecordInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordInstance, Any]
    ): js.Promise[IpRecordInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/voice/v1/ipRecord", "IpRecordInstance")
  @js.native
  open class IpRecordInstance protected () extends SerializableClass {
    /**
      * Initialize the IpRecordContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, payload: IpRecordPayload, sid: String) = this()
    
    /* private */ var _proxy: IpRecordContext = js.native
    
    var accountSid: String = js.native
    
    var cidrPrefixLength: Double = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a IpRecordInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[IpRecordInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[IpRecordInstance] = js.native
    
    var friendlyName: String = js.native
    
    var ipAddress: String = js.native
    
    /**
      * remove a IpRecordInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a IpRecordInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[IpRecordInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[IpRecordInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[IpRecordInstance] = js.native
    def update(opts: IpRecordInstanceUpdateOptions): js.Promise[IpRecordInstance] = js.native
    def update(
      opts: IpRecordInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[IpRecordInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the IpRecordList
    *
    * @param version - Version of the resource
    */
  inline def IpRecordList(version: typings.twilio.voiceV1Mod.^): IpRecordListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("IpRecordList")(version.asInstanceOf[js.Any]).asInstanceOf[IpRecordListInstance]
  
  @JSImport("twilio/lib/rest/voice/v1/ipRecord", "IpRecordPage")
  @js.native
  open class IpRecordPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.voiceV1Mod.^, IpRecordPayload, IpRecordResource, IpRecordInstance] {
    /**
      * Initialize the IpRecordPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.voiceV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: IpRecordSolution
    ) = this()
    
    /**
      * Build an instance of IpRecordInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: IpRecordPayload): IpRecordInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - A string to describe the resource
    */
  trait IpRecordInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object IpRecordInstanceUpdateOptions {
    
    inline def apply(): IpRecordInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpRecordInstanceUpdateOptions]
    }
    
    extension [Self <: IpRecordInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait IpRecordListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): IpRecordContext = js.native
    
    /**
      * create a IpRecordInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: IpRecordListInstanceCreateOptions): js.Promise[IpRecordInstance] = js.native
    def create(
      opts: IpRecordListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ IpRecordInstance, Any]
    ): js.Promise[IpRecordInstance] = js.native
    
    /**
      * Streams IpRecordInstance records from the API.
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
          /* item */ IpRecordInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ IpRecordInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: IpRecordListInstanceEachOptions): Unit = js.native
    def each(
      opts: IpRecordListInstanceEachOptions,
      callback: js.Function2[
          /* item */ IpRecordInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a ip_record
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): IpRecordContext = js.native
    
    /**
      * Retrieve a single target page of IpRecordInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[IpRecordPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordPage, Any]): js.Promise[IpRecordPage] = js.native
    def getPage(targetUrl: String): js.Promise[IpRecordPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordPage, Any]
    ): js.Promise[IpRecordPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordPage, Any]
    ): js.Promise[IpRecordPage] = js.native
    
    /**
      * Lists IpRecordInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[IpRecordInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpRecordInstance], Any]): js.Promise[js.Array[IpRecordInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpRecordInstance], Any]
    ): js.Promise[js.Array[IpRecordInstance]] = js.native
    def list(opts: IpRecordListInstanceOptions): js.Promise[js.Array[IpRecordInstance]] = js.native
    def list(
      opts: IpRecordListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpRecordInstance], Any]
    ): js.Promise[js.Array[IpRecordInstance]] = js.native
    
    /**
      * Retrieve a single page of IpRecordInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[IpRecordPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordPage, Any]): js.Promise[IpRecordPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordPage, Any]): js.Promise[IpRecordPage] = js.native
    def page(opts: IpRecordListInstancePageOptions): js.Promise[IpRecordPage] = js.native
    def page(
      opts: IpRecordListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpRecordPage, Any]
    ): js.Promise[IpRecordPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property cidrPrefixLength - An integer representing the length of the {@link https://tools.ietf.org/html/rfc4632|CIDR} prefix to use with this IP address. By default the entire IP address is used, which for IPv4 is value 32.
    * @property friendlyName - A string to describe the resource
    * @property ipAddress - An IP address in dotted decimal notation, IPv4 only.
    */
  trait IpRecordListInstanceCreateOptions extends StObject {
    
    var cidrPrefixLength: js.UndefOr[Double] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var ipAddress: String
  }
  object IpRecordListInstanceCreateOptions {
    
    inline def apply(ipAddress: String): IpRecordListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpRecordListInstanceCreateOptions]
    }
    
    extension [Self <: IpRecordListInstanceCreateOptions](x: Self) {
      
      inline def setCidrPrefixLength(value: Double): Self = StObject.set(x, "cidrPrefixLength", value.asInstanceOf[js.Any])
      
      inline def setCidrPrefixLengthUndefined: Self = StObject.set(x, "cidrPrefixLength", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
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
  trait IpRecordListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ IpRecordInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object IpRecordListInstanceEachOptions {
    
    inline def apply(): IpRecordListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpRecordListInstanceEachOptions]
    }
    
    extension [Self <: IpRecordListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ IpRecordInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait IpRecordListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object IpRecordListInstanceOptions {
    
    inline def apply(): IpRecordListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpRecordListInstanceOptions]
    }
    
    extension [Self <: IpRecordListInstanceOptions](x: Self) {
      
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
  trait IpRecordListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object IpRecordListInstancePageOptions {
    
    inline def apply(): IpRecordListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpRecordListInstancePageOptions]
    }
    
    extension [Self <: IpRecordListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait IpRecordPayload
    extends StObject
       with IpRecordResource
       with TwilioResponsePayload
  object IpRecordPayload {
    
    inline def apply(
      account_sid: String,
      cidr_prefix_length: Double,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      ip_address: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): IpRecordPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cidr_prefix_length = cidr_prefix_length.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpRecordPayload]
    }
  }
  
  trait IpRecordResource extends StObject {
    
    var account_sid: String
    
    var cidr_prefix_length: Double
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var ip_address: String
    
    var sid: String
    
    var url: String
  }
  object IpRecordResource {
    
    inline def apply(
      account_sid: String,
      cidr_prefix_length: Double,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      ip_address: String,
      sid: String,
      url: String
    ): IpRecordResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cidr_prefix_length = cidr_prefix_length.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpRecordResource]
    }
    
    extension [Self <: IpRecordResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCidr_prefix_length(value: Double): Self = StObject.set(x, "cidr_prefix_length", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IpRecordSolution extends StObject
}
