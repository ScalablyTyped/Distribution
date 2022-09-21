package typings.twilio

import typings.twilio.connectionPolicyTargetMod.ConnectionPolicyTargetContext
import typings.twilio.connectionPolicyTargetMod.ConnectionPolicyTargetListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionPolicyMod {
  
  @JSImport("twilio/lib/rest/voice/v1/connectionPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/voice/v1/connectionPolicy", "ConnectionPolicyContext")
  @js.native
  open class ConnectionPolicyContext protected () extends StObject {
    /**
      * Initialize the ConnectionPolicyContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, sid: String) = this()
    
    /**
      * fetch a ConnectionPolicyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConnectionPolicyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyInstance, Any]): js.Promise[ConnectionPolicyInstance] = js.native
    
    /**
      * remove a ConnectionPolicyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def targets(sid: String): ConnectionPolicyTargetContext = js.native
    @JSName("targets")
    var targets_Original: ConnectionPolicyTargetListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ConnectionPolicyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConnectionPolicyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyInstance, Any]): js.Promise[ConnectionPolicyInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyInstance, Any]
    ): js.Promise[ConnectionPolicyInstance] = js.native
    def update(opts: ConnectionPolicyInstanceUpdateOptions): js.Promise[ConnectionPolicyInstance] = js.native
    def update(
      opts: ConnectionPolicyInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyInstance, Any]
    ): js.Promise[ConnectionPolicyInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/voice/v1/connectionPolicy", "ConnectionPolicyInstance")
  @js.native
  open class ConnectionPolicyInstance protected () extends SerializableClass {
    /**
      * Initialize the ConnectionPolicyContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, payload: ConnectionPolicyPayload, sid: String) = this()
    
    /* private */ var _proxy: ConnectionPolicyContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ConnectionPolicyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConnectionPolicyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConnectionPolicyInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * remove a ConnectionPolicyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * Access the targets
      */
    def targets(): ConnectionPolicyTargetListInstance = js.native
    
    /**
      * update a ConnectionPolicyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConnectionPolicyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConnectionPolicyInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConnectionPolicyInstance] = js.native
    def update(opts: ConnectionPolicyInstanceUpdateOptions): js.Promise[ConnectionPolicyInstance] = js.native
    def update(
      opts: ConnectionPolicyInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ConnectionPolicyInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ConnectionPolicyList
    *
    * @param version - Version of the resource
    */
  inline def ConnectionPolicyList(version: typings.twilio.voiceV1Mod.^): ConnectionPolicyListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionPolicyList")(version.asInstanceOf[js.Any]).asInstanceOf[ConnectionPolicyListInstance]
  
  @JSImport("twilio/lib/rest/voice/v1/connectionPolicy", "ConnectionPolicyPage")
  @js.native
  open class ConnectionPolicyPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.voiceV1Mod.^, 
          ConnectionPolicyPayload, 
          ConnectionPolicyResource, 
          ConnectionPolicyInstance
        ] {
    /**
      * Initialize the ConnectionPolicyPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.voiceV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ConnectionPolicySolution
    ) = this()
    
    /**
      * Build an instance of ConnectionPolicyInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ConnectionPolicyPayload): ConnectionPolicyInstance = js.native
    
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
  trait ConnectionPolicyInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object ConnectionPolicyInstanceUpdateOptions {
    
    inline def apply(): ConnectionPolicyInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPolicyInstanceUpdateOptions]
    }
    
    extension [Self <: ConnectionPolicyInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait ConnectionPolicyListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ConnectionPolicyContext = js.native
    
    /**
      * create a ConnectionPolicyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[ConnectionPolicyInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ ConnectionPolicyInstance, Any]): js.Promise[ConnectionPolicyInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ConnectionPolicyInstance, Any]
    ): js.Promise[ConnectionPolicyInstance] = js.native
    def create(opts: ConnectionPolicyListInstanceCreateOptions): js.Promise[ConnectionPolicyInstance] = js.native
    def create(
      opts: ConnectionPolicyListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ConnectionPolicyInstance, Any]
    ): js.Promise[ConnectionPolicyInstance] = js.native
    
    /**
      * Streams ConnectionPolicyInstance records from the API.
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
          /* item */ ConnectionPolicyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ConnectionPolicyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ConnectionPolicyListInstanceEachOptions): Unit = js.native
    def each(
      opts: ConnectionPolicyListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ConnectionPolicyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a connection_policy
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ConnectionPolicyContext = js.native
    
    /**
      * Retrieve a single target page of ConnectionPolicyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ConnectionPolicyPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyPage, Any]): js.Promise[ConnectionPolicyPage] = js.native
    def getPage(targetUrl: String): js.Promise[ConnectionPolicyPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyPage, Any]
    ): js.Promise[ConnectionPolicyPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyPage, Any]
    ): js.Promise[ConnectionPolicyPage] = js.native
    
    /**
      * Lists ConnectionPolicyInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ConnectionPolicyInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConnectionPolicyInstance], Any]
    ): js.Promise[js.Array[ConnectionPolicyInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConnectionPolicyInstance], Any]
    ): js.Promise[js.Array[ConnectionPolicyInstance]] = js.native
    def list(opts: ConnectionPolicyListInstanceOptions): js.Promise[js.Array[ConnectionPolicyInstance]] = js.native
    def list(
      opts: ConnectionPolicyListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConnectionPolicyInstance], Any]
    ): js.Promise[js.Array[ConnectionPolicyInstance]] = js.native
    
    /**
      * Retrieve a single page of ConnectionPolicyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ConnectionPolicyPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyPage, Any]): js.Promise[ConnectionPolicyPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyPage, Any]
    ): js.Promise[ConnectionPolicyPage] = js.native
    def page(opts: ConnectionPolicyListInstancePageOptions): js.Promise[ConnectionPolicyPage] = js.native
    def page(
      opts: ConnectionPolicyListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyPage, Any]
    ): js.Promise[ConnectionPolicyPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - A string to describe the resource
    */
  trait ConnectionPolicyListInstanceCreateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object ConnectionPolicyListInstanceCreateOptions {
    
    inline def apply(): ConnectionPolicyListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPolicyListInstanceCreateOptions]
    }
    
    extension [Self <: ConnectionPolicyListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
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
  trait ConnectionPolicyListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ConnectionPolicyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ConnectionPolicyListInstanceEachOptions {
    
    inline def apply(): ConnectionPolicyListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPolicyListInstanceEachOptions]
    }
    
    extension [Self <: ConnectionPolicyListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ConnectionPolicyInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ConnectionPolicyListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ConnectionPolicyListInstanceOptions {
    
    inline def apply(): ConnectionPolicyListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPolicyListInstanceOptions]
    }
    
    extension [Self <: ConnectionPolicyListInstanceOptions](x: Self) {
      
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
  trait ConnectionPolicyListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ConnectionPolicyListInstancePageOptions {
    
    inline def apply(): ConnectionPolicyListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPolicyListInstancePageOptions]
    }
    
    extension [Self <: ConnectionPolicyListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ConnectionPolicyPayload
    extends StObject
       with ConnectionPolicyResource
       with TwilioResponsePayload
  object ConnectionPolicyPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): ConnectionPolicyPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionPolicyPayload]
    }
  }
  
  trait ConnectionPolicyResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var sid: String
    
    var url: String
  }
  object ConnectionPolicyResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      sid: String,
      url: String
    ): ConnectionPolicyResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionPolicyResource]
    }
    
    extension [Self <: ConnectionPolicyResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionPolicySolution extends StObject
}
