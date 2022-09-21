package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.memberMod.MemberContext
import typings.twilio.memberMod.MemberListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/queue", "QueueContext")
  @js.native
  open class QueueContext protected () extends StObject {
    /**
      * Initialize the QueueContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource(s) to fetch
      * @param sid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a QueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[QueueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueueInstance, Any]): js.Promise[QueueInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def members(sid: String): MemberContext = js.native
    @JSName("members")
    var members_Original: MemberListInstance = js.native
    
    /**
      * remove a QueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueueInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a QueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[QueueInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueueInstance, Any]): js.Promise[QueueInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ QueueInstance, Any]): js.Promise[QueueInstance] = js.native
    def update(opts: QueueInstanceUpdateOptions): js.Promise[QueueInstance] = js.native
    def update(
      opts: QueueInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ QueueInstance, Any]
    ): js.Promise[QueueInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/queue", "QueueInstance")
  @js.native
  open class QueueInstance protected () extends SerializableClass {
    /**
      * Initialize the QueueContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created this resource
      * @param sid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: QueuePayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: QueueContext = js.native
    
    var accountSid: String = js.native
    
    var averageWaitTime: Double = js.native
    
    var currentSize: Double = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a QueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[QueueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[QueueInstance] = js.native
    
    var friendlyName: String = js.native
    
    var maxSize: Double = js.native
    
    /**
      * Access the members
      */
    def members(): MemberListInstance = js.native
    
    /**
      * remove a QueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a QueueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[QueueInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[QueueInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[QueueInstance] = js.native
    def update(opts: QueueInstanceUpdateOptions): js.Promise[QueueInstance] = js.native
    def update(
      opts: QueueInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[QueueInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the QueueList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created this resource
    */
  inline def QueueList(version: typings.twilio.v2010Mod.^, accountSid: String): QueueListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("QueueList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[QueueListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/queue", "QueuePage")
  @js.native
  open class QueuePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, QueuePayload, QueueResource, QueueInstance] {
    /**
      * Initialize the QueuePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: QueueSolution
    ) = this()
    
    /**
      * Build an instance of QueueInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: QueuePayload): QueueInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - A string to describe this resource
    * @property maxSize - The max number of calls allowed in the queue
    */
  trait QueueInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
  }
  object QueueInstanceUpdateOptions {
    
    inline def apply(): QueueInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueInstanceUpdateOptions]
    }
    
    extension [Self <: QueueInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    }
  }
  
  @js.native
  trait QueueListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): QueueContext = js.native
    
    /**
      * create a QueueInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: QueueListInstanceCreateOptions): js.Promise[QueueInstance] = js.native
    def create(
      opts: QueueListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ QueueInstance, Any]
    ): js.Promise[QueueInstance] = js.native
    
    /**
      * Streams QueueInstance records from the API.
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
          /* item */ QueueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ QueueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: QueueListInstanceEachOptions): Unit = js.native
    def each(
      opts: QueueListInstanceEachOptions,
      callback: js.Function2[
          /* item */ QueueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a queue
      *
      * @param sid - The unique string that identifies this resource
      */
    def get(sid: String): QueueContext = js.native
    
    /**
      * Retrieve a single target page of QueueInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[QueuePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueuePage, Any]): js.Promise[QueuePage] = js.native
    def getPage(targetUrl: String): js.Promise[QueuePage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ QueuePage, Any]): js.Promise[QueuePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ QueuePage, Any]): js.Promise[QueuePage] = js.native
    
    /**
      * Lists QueueInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[QueueInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[QueueInstance], Any]): js.Promise[js.Array[QueueInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[QueueInstance], Any]
    ): js.Promise[js.Array[QueueInstance]] = js.native
    def list(opts: QueueListInstanceOptions): js.Promise[js.Array[QueueInstance]] = js.native
    def list(
      opts: QueueListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[QueueInstance], Any]
    ): js.Promise[js.Array[QueueInstance]] = js.native
    
    /**
      * Retrieve a single page of QueueInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[QueuePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueuePage, Any]): js.Promise[QueuePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ QueuePage, Any]): js.Promise[QueuePage] = js.native
    def page(opts: QueueListInstancePageOptions): js.Promise[QueuePage] = js.native
    def page(
      opts: QueueListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ QueuePage, Any]
    ): js.Promise[QueuePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - A string to describe this resource
    * @property maxSize - The max number of calls allowed in the queue
    */
  trait QueueListInstanceCreateOptions extends StObject {
    
    var friendlyName: String
    
    var maxSize: js.UndefOr[Double] = js.undefined
  }
  object QueueListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): QueueListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueListInstanceCreateOptions]
    }
    
    extension [Self <: QueueListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
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
  trait QueueListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ QueueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object QueueListInstanceEachOptions {
    
    inline def apply(): QueueListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueListInstanceEachOptions]
    }
    
    extension [Self <: QueueListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ QueueInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait QueueListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object QueueListInstanceOptions {
    
    inline def apply(): QueueListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueListInstanceOptions]
    }
    
    extension [Self <: QueueListInstanceOptions](x: Self) {
      
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
  trait QueueListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object QueueListInstancePageOptions {
    
    inline def apply(): QueueListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueListInstancePageOptions]
    }
    
    extension [Self <: QueueListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait QueuePayload
    extends StObject
       with QueueResource {
    
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
  object QueuePayload {
    
    inline def apply(
      account_sid: String,
      average_wait_time: Double,
      current_size: Double,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      max_size: Double,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String
    ): QueuePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], average_wait_time = average_wait_time.asInstanceOf[js.Any], current_size = current_size.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], max_size = max_size.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueuePayload]
    }
    
    extension [Self <: QueuePayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueResource extends StObject {
    
    var account_sid: String
    
    var average_wait_time: Double
    
    var current_size: Double
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var max_size: Double
    
    var sid: String
    
    var uri: String
  }
  object QueueResource {
    
    inline def apply(
      account_sid: String,
      average_wait_time: Double,
      current_size: Double,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      max_size: Double,
      sid: String,
      uri: String
    ): QueueResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], average_wait_time = average_wait_time.asInstanceOf[js.Any], current_size = current_size.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], max_size = max_size.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueResource]
    }
    
    extension [Self <: QueueResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAverage_wait_time(value: Double): Self = StObject.set(x, "average_wait_time", value.asInstanceOf[js.Any])
      
      inline def setCurrent_size(value: Double): Self = StObject.set(x, "current_size", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setMax_size(value: Double): Self = StObject.set(x, "max_size", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object QueueSolution {
    
    inline def apply(): QueueSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueSolution]
    }
    
    extension [Self <: QueueSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
