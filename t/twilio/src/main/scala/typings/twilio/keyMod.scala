package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/key", "KeyContext")
  @js.native
  open class KeyContext protected () extends StObject {
    /**
      * Initialize the KeyContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[KeyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyInstance, Any]): js.Promise[KeyInstance] = js.native
    
    /**
      * remove a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[KeyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyInstance, Any]): js.Promise[KeyInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyInstance, Any]): js.Promise[KeyInstance] = js.native
    def update(opts: KeyInstanceUpdateOptions): js.Promise[KeyInstance] = js.native
    def update(
      opts: KeyInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyInstance, Any]
    ): js.Promise[KeyInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/key", "KeyInstance")
  @js.native
  open class KeyInstance protected () extends SerializableClass {
    /**
      * Initialize the KeyContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - A 34 character string that uniquely identifies this resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: KeyPayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: KeyContext = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[KeyInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[KeyInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a KeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[KeyInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[KeyInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[KeyInstance] = js.native
    def update(opts: KeyInstanceUpdateOptions): js.Promise[KeyInstance] = js.native
    def update(
      opts: KeyInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[KeyInstance] = js.native
  }
  
  /**
    * Initialize the KeyList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def KeyList(version: typings.twilio.v2010Mod.^, accountSid: String): KeyListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("KeyList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[KeyListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/key", "KeyPage")
  @js.native
  open class KeyPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, KeyPayload, KeyResource, KeyInstance] {
    /**
      * Initialize the KeyPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: KeySolution
    ) = this()
    
    /**
      * Build an instance of KeyInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: KeyPayload): KeyInstance = js.native
    
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
  trait KeyInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object KeyInstanceUpdateOptions {
    
    inline def apply(): KeyInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyInstanceUpdateOptions]
    }
    
    extension [Self <: KeyInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait KeyListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): KeyContext = js.native
    
    /**
      * Streams KeyInstance records from the API.
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
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: KeyListInstanceEachOptions): Unit = js.native
    def each(
      opts: KeyListInstanceEachOptions,
      callback: js.Function2[
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a key
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): KeyContext = js.native
    
    /**
      * Retrieve a single target page of KeyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[KeyPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    def getPage(targetUrl: String): js.Promise[KeyPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    
    /**
      * Lists KeyInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[KeyInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[KeyInstance], Any]): js.Promise[js.Array[KeyInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[KeyInstance], Any]
    ): js.Promise[js.Array[KeyInstance]] = js.native
    def list(opts: KeyListInstanceOptions): js.Promise[js.Array[KeyInstance]] = js.native
    def list(
      opts: KeyListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[KeyInstance], Any]
    ): js.Promise[js.Array[KeyInstance]] = js.native
    
    /**
      * Retrieve a single page of KeyInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[KeyPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]): js.Promise[KeyPage] = js.native
    def page(opts: KeyListInstancePageOptions): js.Promise[KeyPage] = js.native
    def page(
      opts: KeyListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ KeyPage, Any]
    ): js.Promise[KeyPage] = js.native
    
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
  trait KeyListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ KeyInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object KeyListInstanceEachOptions {
    
    inline def apply(): KeyListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstanceEachOptions]
    }
    
    extension [Self <: KeyListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ KeyInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait KeyListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object KeyListInstanceOptions {
    
    inline def apply(): KeyListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstanceOptions]
    }
    
    extension [Self <: KeyListInstanceOptions](x: Self) {
      
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
  trait KeyListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object KeyListInstancePageOptions {
    
    inline def apply(): KeyListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListInstancePageOptions]
    }
    
    extension [Self <: KeyListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait KeyPayload
    extends StObject
       with KeyResource
       with TwilioResponsePayload
  object KeyPayload {
    
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
    ): KeyPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPayload]
    }
  }
  
  trait KeyResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
  }
  object KeyResource {
    
    inline def apply(date_created: js.Date, date_updated: js.Date, friendly_name: String, sid: String): KeyResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyResource]
    }
    
    extension [Self <: KeyResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeySolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object KeySolution {
    
    inline def apply(): KeySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeySolution]
    }
    
    extension [Self <: KeySolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
