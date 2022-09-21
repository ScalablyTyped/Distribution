package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicKeyMod {
  
  @JSImport("twilio/lib/rest/accounts/v1/credential/publicKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/accounts/v1/credential/publicKey", "PublicKeyContext")
  @js.native
  open class PublicKeyContext protected () extends StObject {
    /**
      * Initialize the PublicKeyContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v1Mod.^, sid: String) = this()
    
    /**
      * fetch a PublicKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PublicKeyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyInstance, Any]): js.Promise[PublicKeyInstance] = js.native
    
    /**
      * remove a PublicKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a PublicKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[PublicKeyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyInstance, Any]): js.Promise[PublicKeyInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyInstance, Any]
    ): js.Promise[PublicKeyInstance] = js.native
    def update(opts: PublicKeyInstanceUpdateOptions): js.Promise[PublicKeyInstance] = js.native
    def update(
      opts: PublicKeyInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyInstance, Any]
    ): js.Promise[PublicKeyInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/accounts/v1/credential/publicKey", "PublicKeyInstance")
  @js.native
  open class PublicKeyInstance protected () extends SerializableClass {
    /**
      * Initialize the PublicKeyContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v1Mod.^, payload: PublicKeyPayload, sid: String) = this()
    
    /* private */ var _proxy: PublicKeyContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a PublicKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PublicKeyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PublicKeyInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a PublicKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a PublicKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[PublicKeyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PublicKeyInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PublicKeyInstance] = js.native
    def update(opts: PublicKeyInstanceUpdateOptions): js.Promise[PublicKeyInstance] = js.native
    def update(
      opts: PublicKeyInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[PublicKeyInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the PublicKeyList
    *
    * @param version - Version of the resource
    */
  inline def PublicKeyList(version: typings.twilio.v1Mod.^): PublicKeyListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("PublicKeyList")(version.asInstanceOf[js.Any]).asInstanceOf[PublicKeyListInstance]
  
  @JSImport("twilio/lib/rest/accounts/v1/credential/publicKey", "PublicKeyPage")
  @js.native
  open class PublicKeyPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v1Mod.^, PublicKeyPayload, PublicKeyResource, PublicKeyInstance] {
    /**
      * Initialize the PublicKeyPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: PublicKeySolution
    ) = this()
    
    /**
      * Build an instance of PublicKeyInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: PublicKeyPayload): PublicKeyInstance = js.native
    
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
  trait PublicKeyInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object PublicKeyInstanceUpdateOptions {
    
    inline def apply(): PublicKeyInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicKeyInstanceUpdateOptions]
    }
    
    extension [Self <: PublicKeyInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait PublicKeyListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): PublicKeyContext = js.native
    
    /**
      * create a PublicKeyInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: PublicKeyListInstanceCreateOptions): js.Promise[PublicKeyInstance] = js.native
    def create(
      opts: PublicKeyListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ PublicKeyInstance, Any]
    ): js.Promise[PublicKeyInstance] = js.native
    
    /**
      * Streams PublicKeyInstance records from the API.
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
          /* item */ PublicKeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ PublicKeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: PublicKeyListInstanceEachOptions): Unit = js.native
    def each(
      opts: PublicKeyListInstanceEachOptions,
      callback: js.Function2[
          /* item */ PublicKeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a public_key
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): PublicKeyContext = js.native
    
    /**
      * Retrieve a single target page of PublicKeyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[PublicKeyPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyPage, Any]): js.Promise[PublicKeyPage] = js.native
    def getPage(targetUrl: String): js.Promise[PublicKeyPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyPage, Any]
    ): js.Promise[PublicKeyPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyPage, Any]
    ): js.Promise[PublicKeyPage] = js.native
    
    /**
      * Lists PublicKeyInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[PublicKeyInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PublicKeyInstance], Any]): js.Promise[js.Array[PublicKeyInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PublicKeyInstance], Any]
    ): js.Promise[js.Array[PublicKeyInstance]] = js.native
    def list(opts: PublicKeyListInstanceOptions): js.Promise[js.Array[PublicKeyInstance]] = js.native
    def list(
      opts: PublicKeyListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PublicKeyInstance], Any]
    ): js.Promise[js.Array[PublicKeyInstance]] = js.native
    
    /**
      * Retrieve a single page of PublicKeyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[PublicKeyPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyPage, Any]): js.Promise[PublicKeyPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyPage, Any]): js.Promise[PublicKeyPage] = js.native
    def page(opts: PublicKeyListInstancePageOptions): js.Promise[PublicKeyPage] = js.native
    def page(
      opts: PublicKeyListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PublicKeyPage, Any]
    ): js.Promise[PublicKeyPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property accountSid - The Subaccount this Credential should be associated with.
    * @property friendlyName - A string to describe the resource
    * @property publicKey - A URL encoded representation of the public key
    */
  trait PublicKeyListInstanceCreateOptions extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var publicKey: String
  }
  object PublicKeyListInstanceCreateOptions {
    
    inline def apply(publicKey: String): PublicKeyListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKeyListInstanceCreateOptions]
    }
    
    extension [Self <: PublicKeyListInstanceCreateOptions](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
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
  trait PublicKeyListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ PublicKeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PublicKeyListInstanceEachOptions {
    
    inline def apply(): PublicKeyListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicKeyListInstanceEachOptions]
    }
    
    extension [Self <: PublicKeyListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ PublicKeyInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait PublicKeyListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PublicKeyListInstanceOptions {
    
    inline def apply(): PublicKeyListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicKeyListInstanceOptions]
    }
    
    extension [Self <: PublicKeyListInstanceOptions](x: Self) {
      
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
  trait PublicKeyListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object PublicKeyListInstancePageOptions {
    
    inline def apply(): PublicKeyListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicKeyListInstancePageOptions]
    }
    
    extension [Self <: PublicKeyListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait PublicKeyPayload
    extends StObject
       with PublicKeyResource
       with TwilioResponsePayload
  object PublicKeyPayload {
    
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
      uri: String,
      url: String
    ): PublicKeyPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKeyPayload]
    }
  }
  
  trait PublicKeyResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
    
    var url: String
  }
  object PublicKeyResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      sid: String,
      url: String
    ): PublicKeyResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKeyResource]
    }
    
    extension [Self <: PublicKeyResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublicKeySolution extends StObject
}
