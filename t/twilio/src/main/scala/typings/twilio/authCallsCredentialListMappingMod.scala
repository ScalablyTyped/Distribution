package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authCallsCredentialListMappingMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes/authCallsMapping/authCallsCredentialListMapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes/authCallsMapping/authCallsCredentialListMapping", "AuthCallsCredentialListMappingContext")
  @js.native
  open class AuthCallsCredentialListMappingContext protected () extends StObject {
    /**
      * Initialize the AuthCallsCredentialListMappingContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param domainSid - The SID of the SIP domain that contains the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, domainSid: String, sid: String) = this()
    
    /**
      * fetch a AuthCallsCredentialListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AuthCallsCredentialListMappingInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthCallsCredentialListMappingInstance, Any]
    ): js.Promise[AuthCallsCredentialListMappingInstance] = js.native
    
    /**
      * remove a AuthCallsCredentialListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthCallsCredentialListMappingInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes/authCallsMapping/authCallsCredentialListMapping", "AuthCallsCredentialListMappingInstance")
  @js.native
  open class AuthCallsCredentialListMappingInstance protected () extends SerializableClass {
    /**
      * Initialize the AuthCallsCredentialListMappingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param domainSid - The unique string that identifies the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: AuthCallsCredentialListMappingPayload,
      accountSid: String,
      domainSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AuthCallsCredentialListMappingContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a AuthCallsCredentialListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AuthCallsCredentialListMappingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AuthCallsCredentialListMappingInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a AuthCallsCredentialListMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
  }
  
  /**
    * Initialize the AuthCallsCredentialListMappingList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param domainSid - The unique string that identifies the resource
    */
  inline def AuthCallsCredentialListMappingList(version: typings.twilio.v2010Mod.^, accountSid: String, domainSid: String): AuthCallsCredentialListMappingListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AuthCallsCredentialListMappingList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], domainSid.asInstanceOf[js.Any])).asInstanceOf[AuthCallsCredentialListMappingListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes/authCallsMapping/authCallsCredentialListMapping", "AuthCallsCredentialListMappingPage")
  @js.native
  open class AuthCallsCredentialListMappingPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          AuthCallsCredentialListMappingPayload, 
          AuthCallsCredentialListMappingResource, 
          AuthCallsCredentialListMappingInstance
        ] {
    /**
      * Initialize the AuthCallsCredentialListMappingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AuthCallsCredentialListMappingSolution
    ) = this()
    
    /**
      * Build an instance of AuthCallsCredentialListMappingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AuthCallsCredentialListMappingPayload): AuthCallsCredentialListMappingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AuthCallsCredentialListMappingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AuthCallsCredentialListMappingContext = js.native
    
    /**
      * create a AuthCallsCredentialListMappingInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: AuthCallsCredentialListMappingListInstanceCreateOptions): js.Promise[AuthCallsCredentialListMappingInstance] = js.native
    def create(
      opts: AuthCallsCredentialListMappingListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ AuthCallsCredentialListMappingInstance, Any]
    ): js.Promise[AuthCallsCredentialListMappingInstance] = js.native
    
    /**
      * Streams AuthCallsCredentialListMappingInstance records from the API.
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
          /* item */ AuthCallsCredentialListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AuthCallsCredentialListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AuthCallsCredentialListMappingListInstanceEachOptions): Unit = js.native
    def each(
      opts: AuthCallsCredentialListMappingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AuthCallsCredentialListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a auth_calls_credential_list_mapping
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): AuthCallsCredentialListMappingContext = js.native
    
    /**
      * Retrieve a single target page of AuthCallsCredentialListMappingInstance records
      * from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AuthCallsCredentialListMappingPage] = js.native
    def getPage(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthCallsCredentialListMappingPage, Any]
    ): js.Promise[AuthCallsCredentialListMappingPage] = js.native
    def getPage(targetUrl: String): js.Promise[AuthCallsCredentialListMappingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthCallsCredentialListMappingPage, Any]
    ): js.Promise[AuthCallsCredentialListMappingPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthCallsCredentialListMappingPage, Any]
    ): js.Promise[AuthCallsCredentialListMappingPage] = js.native
    
    /**
      * Lists AuthCallsCredentialListMappingInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AuthCallsCredentialListMappingInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AuthCallsCredentialListMappingInstance], 
          Any
        ]
    ): js.Promise[js.Array[AuthCallsCredentialListMappingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AuthCallsCredentialListMappingInstance], 
          Any
        ]
    ): js.Promise[js.Array[AuthCallsCredentialListMappingInstance]] = js.native
    def list(opts: AuthCallsCredentialListMappingListInstanceOptions): js.Promise[js.Array[AuthCallsCredentialListMappingInstance]] = js.native
    def list(
      opts: AuthCallsCredentialListMappingListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AuthCallsCredentialListMappingInstance], 
          Any
        ]
    ): js.Promise[js.Array[AuthCallsCredentialListMappingInstance]] = js.native
    
    /**
      * Retrieve a single page of AuthCallsCredentialListMappingInstance records from
      * the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AuthCallsCredentialListMappingPage] = js.native
    def page(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthCallsCredentialListMappingPage, Any]
    ): js.Promise[AuthCallsCredentialListMappingPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthCallsCredentialListMappingPage, Any]
    ): js.Promise[AuthCallsCredentialListMappingPage] = js.native
    def page(opts: AuthCallsCredentialListMappingListInstancePageOptions): js.Promise[AuthCallsCredentialListMappingPage] = js.native
    def page(
      opts: AuthCallsCredentialListMappingListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthCallsCredentialListMappingPage, Any]
    ): js.Promise[AuthCallsCredentialListMappingPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property credentialListSid - The SID of the CredentialList resource to map to the SIP domain
    */
  trait AuthCallsCredentialListMappingListInstanceCreateOptions extends StObject {
    
    var credentialListSid: String
  }
  object AuthCallsCredentialListMappingListInstanceCreateOptions {
    
    inline def apply(credentialListSid: String): AuthCallsCredentialListMappingListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(credentialListSid = credentialListSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthCallsCredentialListMappingListInstanceCreateOptions]
    }
    
    extension [Self <: AuthCallsCredentialListMappingListInstanceCreateOptions](x: Self) {
      
      inline def setCredentialListSid(value: String): Self = StObject.set(x, "credentialListSid", value.asInstanceOf[js.Any])
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
  trait AuthCallsCredentialListMappingListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AuthCallsCredentialListMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AuthCallsCredentialListMappingListInstanceEachOptions {
    
    inline def apply(): AuthCallsCredentialListMappingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthCallsCredentialListMappingListInstanceEachOptions]
    }
    
    extension [Self <: AuthCallsCredentialListMappingListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AuthCallsCredentialListMappingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AuthCallsCredentialListMappingListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AuthCallsCredentialListMappingListInstanceOptions {
    
    inline def apply(): AuthCallsCredentialListMappingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthCallsCredentialListMappingListInstanceOptions]
    }
    
    extension [Self <: AuthCallsCredentialListMappingListInstanceOptions](x: Self) {
      
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
  trait AuthCallsCredentialListMappingListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AuthCallsCredentialListMappingListInstancePageOptions {
    
    inline def apply(): AuthCallsCredentialListMappingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthCallsCredentialListMappingListInstancePageOptions]
    }
    
    extension [Self <: AuthCallsCredentialListMappingListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait AuthCallsCredentialListMappingPayload
    extends StObject
       with AuthCallsCredentialListMappingResource
       with TwilioResponsePayload
  object AuthCallsCredentialListMappingPayload {
    
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
    ): AuthCallsCredentialListMappingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthCallsCredentialListMappingPayload]
    }
  }
  
  trait AuthCallsCredentialListMappingResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
  }
  object AuthCallsCredentialListMappingResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      sid: String
    ): AuthCallsCredentialListMappingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthCallsCredentialListMappingResource]
    }
    
    extension [Self <: AuthCallsCredentialListMappingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthCallsCredentialListMappingSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var domainSid: js.UndefOr[String] = js.undefined
  }
  object AuthCallsCredentialListMappingSolution {
    
    inline def apply(): AuthCallsCredentialListMappingSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthCallsCredentialListMappingSolution]
    }
    
    extension [Self <: AuthCallsCredentialListMappingSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setDomainSid(value: String): Self = StObject.set(x, "domainSid", value.asInstanceOf[js.Any])
      
      inline def setDomainSidUndefined: Self = StObject.set(x, "domainSid", js.undefined)
    }
  }
}
