package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authCallsIpAccessControlListMappingMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes/authCallsMapping/authCallsIpAccessControlListMapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes/authCallsMapping/authCallsIpAccessControlListMapping", "AuthCallsIpAccessControlListMappingContext")
  @js.native
  open class AuthCallsIpAccessControlListMappingContext protected () extends StObject {
    /**
      * Initialize the AuthCallsIpAccessControlListMappingContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param domainSid - The SID of the SIP domain that contains the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, domainSid: String, sid: String) = this()
    
    /**
      * fetch a AuthCallsIpAccessControlListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AuthCallsIpAccessControlListMappingInstance] = js.native
    def fetch(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ AuthCallsIpAccessControlListMappingInstance, 
          Any
        ]
    ): js.Promise[AuthCallsIpAccessControlListMappingInstance] = js.native
    
    /**
      * remove a AuthCallsIpAccessControlListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ AuthCallsIpAccessControlListMappingInstance, 
          Any
        ]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes/authCallsMapping/authCallsIpAccessControlListMapping", "AuthCallsIpAccessControlListMappingInstance")
  @js.native
  open class AuthCallsIpAccessControlListMappingInstance protected () extends SerializableClass {
    /**
      * Initialize the AuthCallsIpAccessControlListMappingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param domainSid - The unique string that identifies the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: AuthCallsIpAccessControlListMappingPayload,
      accountSid: String,
      domainSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AuthCallsIpAccessControlListMappingContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a AuthCallsIpAccessControlListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AuthCallsIpAccessControlListMappingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AuthCallsIpAccessControlListMappingInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a AuthCallsIpAccessControlListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
  }
  
  /**
    * Initialize the AuthCallsIpAccessControlListMappingList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param domainSid - The unique string that identifies the resource
    */
  inline def AuthCallsIpAccessControlListMappingList(version: typings.twilio.v2010Mod.^, accountSid: String, domainSid: String): AuthCallsIpAccessControlListMappingListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AuthCallsIpAccessControlListMappingList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], domainSid.asInstanceOf[js.Any])).asInstanceOf[AuthCallsIpAccessControlListMappingListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes/authCallsMapping/authCallsIpAccessControlListMapping", "AuthCallsIpAccessControlListMappingPage")
  @js.native
  open class AuthCallsIpAccessControlListMappingPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          AuthCallsIpAccessControlListMappingPayload, 
          AuthCallsIpAccessControlListMappingResource, 
          AuthCallsIpAccessControlListMappingInstance
        ] {
    /**
      * Initialize the AuthCallsIpAccessControlListMappingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AuthCallsIpAccessControlListMappingSolution
    ) = this()
    
    /**
      * Build an instance of AuthCallsIpAccessControlListMappingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AuthCallsIpAccessControlListMappingPayload): AuthCallsIpAccessControlListMappingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AuthCallsIpAccessControlListMappingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AuthCallsIpAccessControlListMappingContext = js.native
    
    /**
      * create a AuthCallsIpAccessControlListMappingInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: AuthCallsIpAccessControlListMappingListInstanceCreateOptions): js.Promise[AuthCallsIpAccessControlListMappingInstance] = js.native
    def create(
      opts: AuthCallsIpAccessControlListMappingListInstanceCreateOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ AuthCallsIpAccessControlListMappingInstance, 
          Any
        ]
    ): js.Promise[AuthCallsIpAccessControlListMappingInstance] = js.native
    
    /**
      * Streams AuthCallsIpAccessControlListMappingInstance records from the API.
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
          /* item */ AuthCallsIpAccessControlListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AuthCallsIpAccessControlListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AuthCallsIpAccessControlListMappingListInstanceEachOptions): Unit = js.native
    def each(
      opts: AuthCallsIpAccessControlListMappingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AuthCallsIpAccessControlListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a auth_calls_ip_access_control_list_mapping
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): AuthCallsIpAccessControlListMappingContext = js.native
    
    /**
      * Retrieve a single target page of AuthCallsIpAccessControlListMappingInstance
      * records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AuthCallsIpAccessControlListMappingPage] = js.native
    def getPage(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ AuthCallsIpAccessControlListMappingPage, 
          Any
        ]
    ): js.Promise[AuthCallsIpAccessControlListMappingPage] = js.native
    def getPage(targetUrl: String): js.Promise[AuthCallsIpAccessControlListMappingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ AuthCallsIpAccessControlListMappingPage, 
          Any
        ]
    ): js.Promise[AuthCallsIpAccessControlListMappingPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ AuthCallsIpAccessControlListMappingPage, 
          Any
        ]
    ): js.Promise[AuthCallsIpAccessControlListMappingPage] = js.native
    
    /**
      * Lists AuthCallsIpAccessControlListMappingInstance records from the API as a
      * list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AuthCallsIpAccessControlListMappingInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AuthCallsIpAccessControlListMappingInstance], 
          Any
        ]
    ): js.Promise[js.Array[AuthCallsIpAccessControlListMappingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AuthCallsIpAccessControlListMappingInstance], 
          Any
        ]
    ): js.Promise[js.Array[AuthCallsIpAccessControlListMappingInstance]] = js.native
    def list(opts: AuthCallsIpAccessControlListMappingListInstanceOptions): js.Promise[js.Array[AuthCallsIpAccessControlListMappingInstance]] = js.native
    def list(
      opts: AuthCallsIpAccessControlListMappingListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AuthCallsIpAccessControlListMappingInstance], 
          Any
        ]
    ): js.Promise[js.Array[AuthCallsIpAccessControlListMappingInstance]] = js.native
    
    /**
      * Retrieve a single page of AuthCallsIpAccessControlListMappingInstance records
      * from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AuthCallsIpAccessControlListMappingPage] = js.native
    def page(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ AuthCallsIpAccessControlListMappingPage, 
          Any
        ]
    ): js.Promise[AuthCallsIpAccessControlListMappingPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ AuthCallsIpAccessControlListMappingPage, 
          Any
        ]
    ): js.Promise[AuthCallsIpAccessControlListMappingPage] = js.native
    def page(opts: AuthCallsIpAccessControlListMappingListInstancePageOptions): js.Promise[AuthCallsIpAccessControlListMappingPage] = js.native
    def page(
      opts: AuthCallsIpAccessControlListMappingListInstancePageOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ AuthCallsIpAccessControlListMappingPage, 
          Any
        ]
    ): js.Promise[AuthCallsIpAccessControlListMappingPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property ipAccessControlListSid - The SID of the IpAccessControlList resource to map to the SIP domain
    */
  trait AuthCallsIpAccessControlListMappingListInstanceCreateOptions extends StObject {
    
    var ipAccessControlListSid: String
  }
  object AuthCallsIpAccessControlListMappingListInstanceCreateOptions {
    
    inline def apply(ipAccessControlListSid: String): AuthCallsIpAccessControlListMappingListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(ipAccessControlListSid = ipAccessControlListSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthCallsIpAccessControlListMappingListInstanceCreateOptions]
    }
    
    extension [Self <: AuthCallsIpAccessControlListMappingListInstanceCreateOptions](x: Self) {
      
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
  trait AuthCallsIpAccessControlListMappingListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AuthCallsIpAccessControlListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AuthCallsIpAccessControlListMappingListInstanceEachOptions {
    
    inline def apply(): AuthCallsIpAccessControlListMappingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthCallsIpAccessControlListMappingListInstanceEachOptions]
    }
    
    extension [Self <: AuthCallsIpAccessControlListMappingListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AuthCallsIpAccessControlListMappingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AuthCallsIpAccessControlListMappingListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AuthCallsIpAccessControlListMappingListInstanceOptions {
    
    inline def apply(): AuthCallsIpAccessControlListMappingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthCallsIpAccessControlListMappingListInstanceOptions]
    }
    
    extension [Self <: AuthCallsIpAccessControlListMappingListInstanceOptions](x: Self) {
      
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
  trait AuthCallsIpAccessControlListMappingListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AuthCallsIpAccessControlListMappingListInstancePageOptions {
    
    inline def apply(): AuthCallsIpAccessControlListMappingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthCallsIpAccessControlListMappingListInstancePageOptions]
    }
    
    extension [Self <: AuthCallsIpAccessControlListMappingListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait AuthCallsIpAccessControlListMappingPayload
    extends StObject
       with AuthCallsIpAccessControlListMappingResource
       with TwilioResponsePayload
  object AuthCallsIpAccessControlListMappingPayload {
    
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
      uri: String
    ): AuthCallsIpAccessControlListMappingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthCallsIpAccessControlListMappingPayload]
    }
  }
  
  trait AuthCallsIpAccessControlListMappingResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
  }
  object AuthCallsIpAccessControlListMappingResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      sid: String
    ): AuthCallsIpAccessControlListMappingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthCallsIpAccessControlListMappingResource]
    }
    
    extension [Self <: AuthCallsIpAccessControlListMappingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthCallsIpAccessControlListMappingSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var domainSid: js.UndefOr[String] = js.undefined
  }
  object AuthCallsIpAccessControlListMappingSolution {
    
    inline def apply(): AuthCallsIpAccessControlListMappingSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthCallsIpAccessControlListMappingSolution]
    }
    
    extension [Self <: AuthCallsIpAccessControlListMappingSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setDomainSid(value: String): Self = StObject.set(x, "domainSid", value.asInstanceOf[js.Any])
      
      inline def setDomainSidUndefined: Self = StObject.set(x, "domainSid", js.undefined)
    }
  }
}
