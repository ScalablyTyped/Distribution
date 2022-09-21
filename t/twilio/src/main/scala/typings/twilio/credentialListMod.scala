package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.credentialListCredentialMod.CredentialContext
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialListMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/credentialList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/credentialList", "CredentialListContext")
  @js.native
  open class CredentialListContext protected () extends StObject {
    /**
      * Initialize the CredentialListContext
      *
      * @param version - Version of the resource
      * @param accountSid - The unique id of the Account that is responsible for this resource.
      * @param sid - Fetch by unique credential list Sid
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def credentials(sid: String): CredentialContext = js.native
    @JSName("credentials")
    var credentials_Original: typings.twilio.credentialListCredentialMod.CredentialListInstance = js.native
    
    /**
      * fetch a CredentialListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CredentialListInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialListInstance, Any]): js.Promise[CredentialListInstance] = js.native
    
    /**
      * remove a CredentialListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialListInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a CredentialListInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: CredentialListInstanceUpdateOptions): js.Promise[CredentialListInstance] = js.native
    def update(
      opts: CredentialListInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialListInstance, Any]
    ): js.Promise[CredentialListInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/credentialList", "CredentialListInstance")
  @js.native
  open class CredentialListInstance protected () extends SerializableClass {
    /**
      * Initialize the CredentialListContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - A 34 character string that uniquely identifies this resource.
      * @param sid - Fetch by unique credential list Sid
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: CredentialListPayload,
      accountSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: CredentialListContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the credentials
      */
    def credentials(): typings.twilio.credentialListCredentialMod.CredentialListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a CredentialListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CredentialListInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CredentialListInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a CredentialListInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var subresourceUris: String = js.native
    
    /**
      * update a CredentialListInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: CredentialListInstanceUpdateOptions): js.Promise[CredentialListInstance] = js.native
    def update(
      opts: CredentialListInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[CredentialListInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the CredentialListList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def CredentialListList(version: typings.twilio.v2010Mod.^, accountSid: String): CredentialListListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("CredentialListList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[CredentialListListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/credentialList", "CredentialListPage")
  @js.native
  open class CredentialListPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          CredentialListPayload, 
          CredentialListResource, 
          CredentialListInstance
        ] {
    /**
      * Initialize the CredentialListPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CredentialListSolution
    ) = this()
    
    /**
      * Build an instance of CredentialListInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CredentialListPayload): CredentialListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - Human readable descriptive text
    */
  trait CredentialListInstanceUpdateOptions extends StObject {
    
    var friendlyName: String
  }
  object CredentialListInstanceUpdateOptions {
    
    inline def apply(friendlyName: String): CredentialListInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialListInstanceUpdateOptions]
    }
    
    extension [Self <: CredentialListInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CredentialListListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CredentialListContext = js.native
    
    /**
      * create a CredentialListInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CredentialListListInstanceCreateOptions): js.Promise[CredentialListInstance] = js.native
    def create(
      opts: CredentialListListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ CredentialListInstance, Any]
    ): js.Promise[CredentialListInstance] = js.native
    
    /**
      * Streams CredentialListInstance records from the API.
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
          /* item */ CredentialListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CredentialListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CredentialListListInstanceEachOptions): Unit = js.native
    def each(
      opts: CredentialListListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CredentialListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a credential_list
      *
      * @param sid - Fetch by unique credential list Sid
      */
    def get(sid: String): CredentialListContext = js.native
    
    /**
      * Retrieve a single target page of CredentialListInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CredentialListPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialListPage, Any]): js.Promise[CredentialListPage] = js.native
    def getPage(targetUrl: String): js.Promise[CredentialListPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialListPage, Any]
    ): js.Promise[CredentialListPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialListPage, Any]
    ): js.Promise[CredentialListPage] = js.native
    
    /**
      * Lists CredentialListInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CredentialListInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CredentialListInstance], Any]
    ): js.Promise[js.Array[CredentialListInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CredentialListInstance], Any]
    ): js.Promise[js.Array[CredentialListInstance]] = js.native
    def list(opts: CredentialListListInstanceOptions): js.Promise[js.Array[CredentialListInstance]] = js.native
    def list(
      opts: CredentialListListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CredentialListInstance], Any]
    ): js.Promise[js.Array[CredentialListInstance]] = js.native
    
    /**
      * Retrieve a single page of CredentialListInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CredentialListPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialListPage, Any]): js.Promise[CredentialListPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialListPage, Any]
    ): js.Promise[CredentialListPage] = js.native
    def page(opts: CredentialListListInstancePageOptions): js.Promise[CredentialListPage] = js.native
    def page(
      opts: CredentialListListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialListPage, Any]
    ): js.Promise[CredentialListPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - Human readable descriptive text
    */
  trait CredentialListListInstanceCreateOptions extends StObject {
    
    var friendlyName: String
  }
  object CredentialListListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): CredentialListListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialListListInstanceCreateOptions]
    }
    
    extension [Self <: CredentialListListInstanceCreateOptions](x: Self) {
      
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
  trait CredentialListListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CredentialListInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CredentialListListInstanceEachOptions {
    
    inline def apply(): CredentialListListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialListListInstanceEachOptions]
    }
    
    extension [Self <: CredentialListListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CredentialListInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait CredentialListListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CredentialListListInstanceOptions {
    
    inline def apply(): CredentialListListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialListListInstanceOptions]
    }
    
    extension [Self <: CredentialListListInstanceOptions](x: Self) {
      
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
  trait CredentialListListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object CredentialListListInstancePageOptions {
    
    inline def apply(): CredentialListListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialListListInstancePageOptions]
    }
    
    extension [Self <: CredentialListListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait CredentialListPayload
    extends StObject
       with CredentialListResource {
    
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
  object CredentialListPayload {
    
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
    ): CredentialListPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialListPayload]
    }
    
    extension [Self <: CredentialListPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait CredentialListResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
    
    var subresource_uris: String
    
    var uri: String
  }
  object CredentialListResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      sid: String,
      subresource_uris: String,
      uri: String
    ): CredentialListResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialListResource]
    }
    
    extension [Self <: CredentialListResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait CredentialListSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object CredentialListSolution {
    
    inline def apply(): CredentialListSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialListSolution]
    }
    
    extension [Self <: CredentialListSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
