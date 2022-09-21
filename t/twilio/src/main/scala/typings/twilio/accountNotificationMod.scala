package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountNotificationMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/notification", "NotificationContext")
  @js.native
  open class NotificationContext protected () extends StObject {
    /**
      * Initialize the NotificationContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a NotificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NotificationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationInstance, Any]): js.Promise[NotificationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/notification", "NotificationInstance")
  @js.native
  open class NotificationInstance protected () extends SerializableClass {
    /**
      * Initialize the NotificationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: NotificationPayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: NotificationContext = js.native
    
    var accountSid: String = js.native
    
    var apiVersion: String = js.native
    
    var callSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var errorCode: String = js.native
    
    /**
      * fetch a NotificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NotificationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NotificationInstance] = js.native
    
    var log: String = js.native
    
    var messageDate: js.Date = js.native
    
    var messageText: String = js.native
    
    var moreInfo: String = js.native
    
    var requestMethod: String = js.native
    
    var requestUrl: String = js.native
    
    var requestVariables: String = js.native
    
    var responseBody: String = js.native
    
    var responseHeaders: String = js.native
    
    var sid: String = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the NotificationList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    */
  inline def NotificationList(version: typings.twilio.v2010Mod.^, accountSid: String): NotificationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("NotificationList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[NotificationListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/notification", "NotificationPage")
  @js.native
  open class NotificationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          NotificationPayload, 
          NotificationResource, 
          NotificationInstance
        ] {
    /**
      * Initialize the NotificationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: NotificationSolution
    ) = this()
    
    /**
      * Build an instance of NotificationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: NotificationPayload): NotificationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait NotificationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): NotificationContext = js.native
    
    /**
      * Streams NotificationInstance records from the API.
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
          /* item */ NotificationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ NotificationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: NotificationListInstanceEachOptions): Unit = js.native
    def each(
      opts: NotificationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ NotificationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a notification
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): NotificationContext = js.native
    
    /**
      * Retrieve a single target page of NotificationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[NotificationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationPage, Any]): js.Promise[NotificationPage] = js.native
    def getPage(targetUrl: String): js.Promise[NotificationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationPage, Any]
    ): js.Promise[NotificationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationPage, Any]
    ): js.Promise[NotificationPage] = js.native
    
    /**
      * Lists NotificationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[NotificationInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[NotificationInstance], Any]
    ): js.Promise[js.Array[NotificationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[NotificationInstance], Any]
    ): js.Promise[js.Array[NotificationInstance]] = js.native
    def list(opts: NotificationListInstanceOptions): js.Promise[js.Array[NotificationInstance]] = js.native
    def list(
      opts: NotificationListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[NotificationInstance], Any]
    ): js.Promise[js.Array[NotificationInstance]] = js.native
    
    /**
      * Retrieve a single page of NotificationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[NotificationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationPage, Any]): js.Promise[NotificationPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationPage, Any]): js.Promise[NotificationPage] = js.native
    def page(opts: NotificationListInstancePageOptions): js.Promise[NotificationPage] = js.native
    def page(
      opts: NotificationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationPage, Any]
    ): js.Promise[NotificationPage] = js.native
    
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
    * @property log - Filter by log level
    * @property messageDate - Filter by date
    * @property messageDateAfter - Filter by date
    * @property messageDateBefore - Filter by date
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait NotificationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ NotificationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[Double] = js.undefined
    
    var messageDate: js.UndefOr[js.Date] = js.undefined
    
    var messageDateAfter: js.UndefOr[js.Date] = js.undefined
    
    var messageDateBefore: js.UndefOr[js.Date] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object NotificationListInstanceEachOptions {
    
    inline def apply(): NotificationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationListInstanceEachOptions]
    }
    
    extension [Self <: NotificationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ NotificationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLog(value: Double): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMessageDate(value: js.Date): Self = StObject.set(x, "messageDate", value.asInstanceOf[js.Any])
      
      inline def setMessageDateAfter(value: js.Date): Self = StObject.set(x, "messageDateAfter", value.asInstanceOf[js.Any])
      
      inline def setMessageDateAfterUndefined: Self = StObject.set(x, "messageDateAfter", js.undefined)
      
      inline def setMessageDateBefore(value: js.Date): Self = StObject.set(x, "messageDateBefore", value.asInstanceOf[js.Any])
      
      inline def setMessageDateBeforeUndefined: Self = StObject.set(x, "messageDateBefore", js.undefined)
      
      inline def setMessageDateUndefined: Self = StObject.set(x, "messageDate", js.undefined)
      
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
    * @property log - Filter by log level
    * @property messageDate - Filter by date
    * @property messageDateAfter - Filter by date
    * @property messageDateBefore - Filter by date
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait NotificationListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[Double] = js.undefined
    
    var messageDate: js.UndefOr[js.Date] = js.undefined
    
    var messageDateAfter: js.UndefOr[js.Date] = js.undefined
    
    var messageDateBefore: js.UndefOr[js.Date] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object NotificationListInstanceOptions {
    
    inline def apply(): NotificationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationListInstanceOptions]
    }
    
    extension [Self <: NotificationListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLog(value: Double): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMessageDate(value: js.Date): Self = StObject.set(x, "messageDate", value.asInstanceOf[js.Any])
      
      inline def setMessageDateAfter(value: js.Date): Self = StObject.set(x, "messageDateAfter", value.asInstanceOf[js.Any])
      
      inline def setMessageDateAfterUndefined: Self = StObject.set(x, "messageDateAfter", js.undefined)
      
      inline def setMessageDateBefore(value: js.Date): Self = StObject.set(x, "messageDateBefore", value.asInstanceOf[js.Any])
      
      inline def setMessageDateBeforeUndefined: Self = StObject.set(x, "messageDateBefore", js.undefined)
      
      inline def setMessageDateUndefined: Self = StObject.set(x, "messageDate", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property log - Filter by log level
    * @property messageDate - Filter by date
    * @property messageDateAfter - Filter by date
    * @property messageDateBefore - Filter by date
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait NotificationListInstancePageOptions extends StObject {
    
    var log: js.UndefOr[Double] = js.undefined
    
    var messageDate: js.UndefOr[js.Date] = js.undefined
    
    var messageDateAfter: js.UndefOr[js.Date] = js.undefined
    
    var messageDateBefore: js.UndefOr[js.Date] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object NotificationListInstancePageOptions {
    
    inline def apply(): NotificationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationListInstancePageOptions]
    }
    
    extension [Self <: NotificationListInstancePageOptions](x: Self) {
      
      inline def setLog(value: Double): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMessageDate(value: js.Date): Self = StObject.set(x, "messageDate", value.asInstanceOf[js.Any])
      
      inline def setMessageDateAfter(value: js.Date): Self = StObject.set(x, "messageDateAfter", value.asInstanceOf[js.Any])
      
      inline def setMessageDateAfterUndefined: Self = StObject.set(x, "messageDateAfter", js.undefined)
      
      inline def setMessageDateBefore(value: js.Date): Self = StObject.set(x, "messageDateBefore", value.asInstanceOf[js.Any])
      
      inline def setMessageDateBeforeUndefined: Self = StObject.set(x, "messageDateBefore", js.undefined)
      
      inline def setMessageDateUndefined: Self = StObject.set(x, "messageDate", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait NotificationPayload
    extends StObject
       with NotificationResource {
    
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
  object NotificationPayload {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      call_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      error_code: String,
      first_page_uri: String,
      log: String,
      message_date: js.Date,
      message_text: String,
      more_info: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      request_method: String,
      request_url: String,
      sid: String,
      uri: String
    ): NotificationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], message_date = message_date.asInstanceOf[js.Any], message_text = message_text.asInstanceOf[js.Any], more_info = more_info.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], request_method = request_method.asInstanceOf[js.Any], request_url = request_url.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationPayload]
    }
    
    extension [Self <: NotificationPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationResource extends StObject {
    
    var account_sid: String
    
    var api_version: String
    
    var call_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var error_code: String
    
    var log: String
    
    var message_date: js.Date
    
    var message_text: String
    
    var more_info: String
    
    var request_method: String
    
    var request_url: String
    
    var request_variables: js.UndefOr[String] = js.undefined
    
    var response_body: js.UndefOr[String] = js.undefined
    
    var response_headers: js.UndefOr[String] = js.undefined
    
    var sid: String
    
    var uri: String
  }
  object NotificationResource {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      call_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      error_code: String,
      log: String,
      message_date: js.Date,
      message_text: String,
      more_info: String,
      request_method: String,
      request_url: String,
      sid: String,
      uri: String
    ): NotificationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], message_date = message_date.asInstanceOf[js.Any], message_text = message_text.asInstanceOf[js.Any], more_info = more_info.asInstanceOf[js.Any], request_method = request_method.asInstanceOf[js.Any], request_url = request_url.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationResource]
    }
    
    extension [Self <: NotificationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setMessage_date(value: js.Date): Self = StObject.set(x, "message_date", value.asInstanceOf[js.Any])
      
      inline def setMessage_text(value: String): Self = StObject.set(x, "message_text", value.asInstanceOf[js.Any])
      
      inline def setMore_info(value: String): Self = StObject.set(x, "more_info", value.asInstanceOf[js.Any])
      
      inline def setRequest_method(value: String): Self = StObject.set(x, "request_method", value.asInstanceOf[js.Any])
      
      inline def setRequest_url(value: String): Self = StObject.set(x, "request_url", value.asInstanceOf[js.Any])
      
      inline def setRequest_variables(value: String): Self = StObject.set(x, "request_variables", value.asInstanceOf[js.Any])
      
      inline def setRequest_variablesUndefined: Self = StObject.set(x, "request_variables", js.undefined)
      
      inline def setResponse_body(value: String): Self = StObject.set(x, "response_body", value.asInstanceOf[js.Any])
      
      inline def setResponse_bodyUndefined: Self = StObject.set(x, "response_body", js.undefined)
      
      inline def setResponse_headers(value: String): Self = StObject.set(x, "response_headers", value.asInstanceOf[js.Any])
      
      inline def setResponse_headersUndefined: Self = StObject.set(x, "response_headers", js.undefined)
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object NotificationSolution {
    
    inline def apply(): NotificationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationSolution]
    }
    
    extension [Self <: NotificationSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
