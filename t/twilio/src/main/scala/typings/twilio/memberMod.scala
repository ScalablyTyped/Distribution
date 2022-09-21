package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/queue/member", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/queue/member", "MemberContext")
  @js.native
  open class MemberContext protected () extends StObject {
    /**
      * Initialize the MemberContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource(s) to fetch
      * @param queueSid - The SID of the Queue in which to find the members
      * @param callSid - The Call SID of the resource(s) to fetch
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, queueSid: String, callSid: String) = this()
    
    /**
      * fetch a MemberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MemberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberInstance, Any]): js.Promise[MemberInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a MemberInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: MemberInstanceUpdateOptions): js.Promise[MemberInstance] = js.native
    def update(
      opts: MemberInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberInstance, Any]
    ): js.Promise[MemberInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/queue/member", "MemberInstance")
  @js.native
  open class MemberInstance protected () extends SerializableClass {
    /**
      * Initialize the MemberContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created this resource
      * @param queueSid - The SID of the Queue the member is in
      * @param callSid - The Call SID of the resource(s) to fetch
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: MemberPayload,
      accountSid: String,
      queueSid: String,
      callSid: String
    ) = this()
    
    /* private */ var _proxy: MemberContext = js.native
    
    var callSid: String = js.native
    
    var dateEnqueued: js.Date = js.native
    
    /**
      * fetch a MemberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MemberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MemberInstance] = js.native
    
    var position: Double = js.native
    
    var queueSid: String = js.native
    
    /**
      * update a MemberInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: MemberInstanceUpdateOptions): js.Promise[MemberInstance] = js.native
    def update(
      opts: MemberInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[MemberInstance] = js.native
    
    var uri: String = js.native
    
    var waitTime: Double = js.native
  }
  
  /**
    * Initialize the MemberList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created this resource
    * @param queueSid - The SID of the Queue the member is in
    */
  inline def MemberList(version: typings.twilio.v2010Mod.^, accountSid: String, queueSid: String): MemberListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("MemberList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], queueSid.asInstanceOf[js.Any])).asInstanceOf[MemberListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/queue/member", "MemberPage")
  @js.native
  open class MemberPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, MemberPayload, MemberResource, MemberInstance] {
    /**
      * Initialize the MemberPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: MemberSolution
    ) = this()
    
    /**
      * Build an instance of MemberInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: MemberPayload): MemberInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property method - How to pass the update request data
    * @property url - The absolute URL of the Queue resource
    */
  trait MemberInstanceUpdateOptions extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object MemberInstanceUpdateOptions {
    
    inline def apply(url: String): MemberInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberInstanceUpdateOptions]
    }
    
    extension [Self <: MemberInstanceUpdateOptions](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MemberListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): MemberContext = js.native
    
    /**
      * Streams MemberInstance records from the API.
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
          /* item */ MemberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ MemberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: MemberListInstanceEachOptions): Unit = js.native
    def each(
      opts: MemberListInstanceEachOptions,
      callback: js.Function2[
          /* item */ MemberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a member
      *
      * @param callSid - The Call SID of the resource(s) to fetch
      */
    def get(callSid: String): MemberContext = js.native
    
    /**
      * Retrieve a single target page of MemberInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[MemberPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]): js.Promise[MemberPage] = js.native
    def getPage(targetUrl: String): js.Promise[MemberPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]
    ): js.Promise[MemberPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]): js.Promise[MemberPage] = js.native
    
    /**
      * Lists MemberInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[MemberInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MemberInstance], Any]): js.Promise[js.Array[MemberInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MemberInstance], Any]
    ): js.Promise[js.Array[MemberInstance]] = js.native
    def list(opts: MemberListInstanceOptions): js.Promise[js.Array[MemberInstance]] = js.native
    def list(
      opts: MemberListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MemberInstance], Any]
    ): js.Promise[js.Array[MemberInstance]] = js.native
    
    /**
      * Retrieve a single page of MemberInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[MemberPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]): js.Promise[MemberPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]): js.Promise[MemberPage] = js.native
    def page(opts: MemberListInstancePageOptions): js.Promise[MemberPage] = js.native
    def page(
      opts: MemberListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]
    ): js.Promise[MemberPage] = js.native
    
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
  trait MemberListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ MemberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MemberListInstanceEachOptions {
    
    inline def apply(): MemberListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberListInstanceEachOptions]
    }
    
    extension [Self <: MemberListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ MemberInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait MemberListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MemberListInstanceOptions {
    
    inline def apply(): MemberListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberListInstanceOptions]
    }
    
    extension [Self <: MemberListInstanceOptions](x: Self) {
      
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
  trait MemberListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object MemberListInstancePageOptions {
    
    inline def apply(): MemberListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberListInstancePageOptions]
    }
    
    extension [Self <: MemberListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait MemberPayload
    extends StObject
       with MemberResource {
    
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
  object MemberPayload {
    
    inline def apply(
      call_sid: String,
      date_enqueued: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      position: Double,
      previous_page_uri: String,
      queue_sid: String,
      uri: String,
      wait_time: Double
    ): MemberPayload = {
      val __obj = js.Dynamic.literal(call_sid = call_sid.asInstanceOf[js.Any], date_enqueued = date_enqueued.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], queue_sid = queue_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], wait_time = wait_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberPayload]
    }
    
    extension [Self <: MemberPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait MemberResource extends StObject {
    
    var call_sid: String
    
    var date_enqueued: js.Date
    
    var position: Double
    
    var queue_sid: String
    
    var uri: String
    
    var wait_time: Double
  }
  object MemberResource {
    
    inline def apply(
      call_sid: String,
      date_enqueued: js.Date,
      position: Double,
      queue_sid: String,
      uri: String,
      wait_time: Double
    ): MemberResource = {
      val __obj = js.Dynamic.literal(call_sid = call_sid.asInstanceOf[js.Any], date_enqueued = date_enqueued.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], queue_sid = queue_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], wait_time = wait_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberResource]
    }
    
    extension [Self <: MemberResource](x: Self) {
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_enqueued(value: js.Date): Self = StObject.set(x, "date_enqueued", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setQueue_sid(value: String): Self = StObject.set(x, "queue_sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setWait_time(value: Double): Self = StObject.set(x, "wait_time", value.asInstanceOf[js.Any])
    }
  }
  
  trait MemberSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var queueSid: js.UndefOr[String] = js.undefined
  }
  object MemberSolution {
    
    inline def apply(): MemberSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberSolution]
    }
    
    extension [Self <: MemberSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setQueueSid(value: String): Self = StObject.set(x, "queueSid", value.asInstanceOf[js.Any])
      
      inline def setQueueSidUndefined: Self = StObject.set(x, "queueSid", js.undefined)
    }
  }
}
