package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signingKeyMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/signingKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/signingKey", "SigningKeyContext")
  @js.native
  open class SigningKeyContext protected () extends StObject {
    /**
      * Initialize the SigningKeyContext
      *
      * @param version - Version of the resource
      * @param accountSid - The account_sid
      * @param sid - The sid
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a SigningKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SigningKeyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyInstance, Any]): js.Promise[SigningKeyInstance] = js.native
    
    /**
      * remove a SigningKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SigningKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SigningKeyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyInstance, Any]): js.Promise[SigningKeyInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyInstance, Any]
    ): js.Promise[SigningKeyInstance] = js.native
    def update(opts: SigningKeyInstanceUpdateOptions): js.Promise[SigningKeyInstance] = js.native
    def update(
      opts: SigningKeyInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyInstance, Any]
    ): js.Promise[SigningKeyInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/signingKey", "SigningKeyInstance")
  @js.native
  open class SigningKeyInstance protected () extends SerializableClass {
    /**
      * Initialize the SigningKeyContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - A 34 character string that uniquely identifies this resource.
      * @param sid - The sid
      */
    def this(version: typings.twilio.v2010Mod.^, payload: SigningKeyPayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: SigningKeyContext = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SigningKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SigningKeyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SigningKeyInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a SigningKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a SigningKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SigningKeyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SigningKeyInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SigningKeyInstance] = js.native
    def update(opts: SigningKeyInstanceUpdateOptions): js.Promise[SigningKeyInstance] = js.native
    def update(
      opts: SigningKeyInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SigningKeyInstance] = js.native
  }
  
  /**
    * Initialize the SigningKeyList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def SigningKeyList(version: typings.twilio.v2010Mod.^, accountSid: String): SigningKeyListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SigningKeyList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[SigningKeyListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/signingKey", "SigningKeyPage")
  @js.native
  open class SigningKeyPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, SigningKeyPayload, SigningKeyResource, SigningKeyInstance] {
    /**
      * Initialize the SigningKeyPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SigningKeySolution
    ) = this()
    
    /**
      * Build an instance of SigningKeyInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SigningKeyPayload): SigningKeyInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - The friendly_name
    */
  trait SigningKeyInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object SigningKeyInstanceUpdateOptions {
    
    inline def apply(): SigningKeyInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SigningKeyInstanceUpdateOptions]
    }
    
    extension [Self <: SigningKeyInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait SigningKeyListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SigningKeyContext = js.native
    
    /**
      * Streams SigningKeyInstance records from the API.
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
          /* item */ SigningKeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SigningKeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SigningKeyListInstanceEachOptions): Unit = js.native
    def each(
      opts: SigningKeyListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SigningKeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a signing_key
      *
      * @param sid - The sid
      */
    def get(sid: String): SigningKeyContext = js.native
    
    /**
      * Retrieve a single target page of SigningKeyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SigningKeyPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyPage, Any]): js.Promise[SigningKeyPage] = js.native
    def getPage(targetUrl: String): js.Promise[SigningKeyPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyPage, Any]
    ): js.Promise[SigningKeyPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyPage, Any]
    ): js.Promise[SigningKeyPage] = js.native
    
    /**
      * Lists SigningKeyInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SigningKeyInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SigningKeyInstance], Any]): js.Promise[js.Array[SigningKeyInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SigningKeyInstance], Any]
    ): js.Promise[js.Array[SigningKeyInstance]] = js.native
    def list(opts: SigningKeyListInstanceOptions): js.Promise[js.Array[SigningKeyInstance]] = js.native
    def list(
      opts: SigningKeyListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SigningKeyInstance], Any]
    ): js.Promise[js.Array[SigningKeyInstance]] = js.native
    
    /**
      * Retrieve a single page of SigningKeyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SigningKeyPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyPage, Any]): js.Promise[SigningKeyPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyPage, Any]): js.Promise[SigningKeyPage] = js.native
    def page(opts: SigningKeyListInstancePageOptions): js.Promise[SigningKeyPage] = js.native
    def page(
      opts: SigningKeyListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SigningKeyPage, Any]
    ): js.Promise[SigningKeyPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
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
  trait SigningKeyListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SigningKeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SigningKeyListInstanceEachOptions {
    
    inline def apply(): SigningKeyListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SigningKeyListInstanceEachOptions]
    }
    
    extension [Self <: SigningKeyListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SigningKeyInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait SigningKeyListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SigningKeyListInstanceOptions {
    
    inline def apply(): SigningKeyListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SigningKeyListInstanceOptions]
    }
    
    extension [Self <: SigningKeyListInstanceOptions](x: Self) {
      
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
  trait SigningKeyListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SigningKeyListInstancePageOptions {
    
    inline def apply(): SigningKeyListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SigningKeyListInstancePageOptions]
    }
    
    extension [Self <: SigningKeyListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SigningKeyPayload
    extends StObject
       with SigningKeyResource
       with TwilioResponsePayload
  object SigningKeyPayload {
    
    inline def apply(
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
    ): SigningKeyPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SigningKeyPayload]
    }
  }
  
  trait SigningKeyResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
  }
  object SigningKeyResource {
    
    inline def apply(date_created: js.Date, date_updated: js.Date, friendly_name: String, sid: String): SigningKeyResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SigningKeyResource]
    }
    
    extension [Self <: SigningKeyResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SigningKeySolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object SigningKeySolution {
    
    inline def apply(): SigningKeySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SigningKeySolution]
    }
    
    extension [Self <: SigningKeySolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
