package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("twilio/lib/rest/monitor/v1/alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/monitor/v1/alert", "AlertContext")
  @js.native
  open class AlertContext protected () extends StObject {
    /**
      * Initialize the AlertContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.monitorV1Mod.^, sid: String) = this()
    
    /**
      * fetch a AlertInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AlertInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AlertInstance, Any]): js.Promise[AlertInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/monitor/v1/alert", "AlertInstance")
  @js.native
  open class AlertInstance protected () extends SerializableClass {
    /**
      * Initialize the AlertContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.monitorV1Mod.^, payload: AlertPayload, sid: String) = this()
    
    /* private */ var _proxy: AlertContext = js.native
    
    var accountSid: String = js.native
    
    var alertText: String = js.native
    
    var apiVersion: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateGenerated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var errorCode: String = js.native
    
    /**
      * fetch a AlertInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AlertInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AlertInstance] = js.native
    
    var logLevel: String = js.native
    
    var moreInfo: String = js.native
    
    var requestHeaders: String = js.native
    
    var requestMethod: String = js.native
    
    var requestUrl: String = js.native
    
    var requestVariables: String = js.native
    
    var resourceSid: String = js.native
    
    var responseBody: String = js.native
    
    var responseHeaders: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AlertList
    *
    * @param version - Version of the resource
    */
  inline def AlertList(version: typings.twilio.monitorV1Mod.^): AlertListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("AlertList")(version.asInstanceOf[js.Any]).asInstanceOf[AlertListInstance]
  
  @JSImport("twilio/lib/rest/monitor/v1/alert", "AlertPage")
  @js.native
  open class AlertPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.monitorV1Mod.^, AlertPayload, AlertResource, AlertInstance] {
    /**
      * Initialize the AlertPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.monitorV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AlertSolution
    ) = this()
    
    /**
      * Build an instance of AlertInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AlertPayload): AlertInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AlertListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AlertContext = js.native
    
    /**
      * Streams AlertInstance records from the API.
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
          /* item */ AlertInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AlertInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AlertListInstanceEachOptions): Unit = js.native
    def each(
      opts: AlertListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AlertInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a alert
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): AlertContext = js.native
    
    /**
      * Retrieve a single target page of AlertInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AlertPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AlertPage, Any]): js.Promise[AlertPage] = js.native
    def getPage(targetUrl: String): js.Promise[AlertPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ AlertPage, Any]): js.Promise[AlertPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AlertPage, Any]): js.Promise[AlertPage] = js.native
    
    /**
      * Lists AlertInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AlertInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AlertInstance], Any]): js.Promise[js.Array[AlertInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AlertInstance], Any]
    ): js.Promise[js.Array[AlertInstance]] = js.native
    def list(opts: AlertListInstanceOptions): js.Promise[js.Array[AlertInstance]] = js.native
    def list(
      opts: AlertListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AlertInstance], Any]
    ): js.Promise[js.Array[AlertInstance]] = js.native
    
    /**
      * Retrieve a single page of AlertInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AlertPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AlertPage, Any]): js.Promise[AlertPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AlertPage, Any]): js.Promise[AlertPage] = js.native
    def page(opts: AlertListInstancePageOptions): js.Promise[AlertPage] = js.native
    def page(
      opts: AlertListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AlertPage, Any]
    ): js.Promise[AlertPage] = js.native
    
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
    * @property endDate - Only include alerts that occurred on or before this date and time
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property logLevel - Only show alerts for this log-level
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property startDate - Only include alerts that occurred on or after this date and time
    */
  trait AlertListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AlertInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object AlertListInstanceEachOptions {
    
    inline def apply(): AlertListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertListInstanceEachOptions]
    }
    
    extension [Self <: AlertListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AlertInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property endDate - Only include alerts that occurred on or before this date and time
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property logLevel - Only show alerts for this log-level
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property startDate - Only include alerts that occurred on or after this date and time
    */
  trait AlertListInstanceOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object AlertListInstanceOptions {
    
    inline def apply(): AlertListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertListInstanceOptions]
    }
    
    extension [Self <: AlertListInstanceOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property endDate - Only include alerts that occurred on or before this date and time
    * @property logLevel - Only show alerts for this log-level
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property startDate - Only include alerts that occurred on or after this date and time
    */
  trait AlertListInstancePageOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object AlertListInstancePageOptions {
    
    inline def apply(): AlertListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertListInstancePageOptions]
    }
    
    extension [Self <: AlertListInstancePageOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait AlertPayload
    extends StObject
       with AlertResource
       with TwilioResponsePayload
  object AlertPayload {
    
    inline def apply(
      account_sid: String,
      alert_text: String,
      api_version: String,
      date_created: js.Date,
      date_generated: js.Date,
      date_updated: js.Date,
      error_code: String,
      first_page_uri: String,
      log_level: String,
      more_info: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      request_method: String,
      request_url: String,
      resource_sid: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): AlertPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], alert_text = alert_text.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_generated = date_generated.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], log_level = log_level.asInstanceOf[js.Any], more_info = more_info.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], request_method = request_method.asInstanceOf[js.Any], request_url = request_url.asInstanceOf[js.Any], resource_sid = resource_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertPayload]
    }
  }
  
  trait AlertResource extends StObject {
    
    var account_sid: String
    
    var alert_text: String
    
    var api_version: String
    
    var date_created: js.Date
    
    var date_generated: js.Date
    
    var date_updated: js.Date
    
    var error_code: String
    
    var log_level: String
    
    var more_info: String
    
    var request_headers: js.UndefOr[String] = js.undefined
    
    var request_method: String
    
    var request_url: String
    
    var request_variables: js.UndefOr[String] = js.undefined
    
    var resource_sid: String
    
    var response_body: js.UndefOr[String] = js.undefined
    
    var response_headers: js.UndefOr[String] = js.undefined
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object AlertResource {
    
    inline def apply(
      account_sid: String,
      alert_text: String,
      api_version: String,
      date_created: js.Date,
      date_generated: js.Date,
      date_updated: js.Date,
      error_code: String,
      log_level: String,
      more_info: String,
      request_method: String,
      request_url: String,
      resource_sid: String,
      service_sid: String,
      sid: String,
      url: String
    ): AlertResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], alert_text = alert_text.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_generated = date_generated.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], log_level = log_level.asInstanceOf[js.Any], more_info = more_info.asInstanceOf[js.Any], request_method = request_method.asInstanceOf[js.Any], request_url = request_url.asInstanceOf[js.Any], resource_sid = resource_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertResource]
    }
    
    extension [Self <: AlertResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAlert_text(value: String): Self = StObject.set(x, "alert_text", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_generated(value: js.Date): Self = StObject.set(x, "date_generated", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setLog_level(value: String): Self = StObject.set(x, "log_level", value.asInstanceOf[js.Any])
      
      inline def setMore_info(value: String): Self = StObject.set(x, "more_info", value.asInstanceOf[js.Any])
      
      inline def setRequest_headers(value: String): Self = StObject.set(x, "request_headers", value.asInstanceOf[js.Any])
      
      inline def setRequest_headersUndefined: Self = StObject.set(x, "request_headers", js.undefined)
      
      inline def setRequest_method(value: String): Self = StObject.set(x, "request_method", value.asInstanceOf[js.Any])
      
      inline def setRequest_url(value: String): Self = StObject.set(x, "request_url", value.asInstanceOf[js.Any])
      
      inline def setRequest_variables(value: String): Self = StObject.set(x, "request_variables", value.asInstanceOf[js.Any])
      
      inline def setRequest_variablesUndefined: Self = StObject.set(x, "request_variables", js.undefined)
      
      inline def setResource_sid(value: String): Self = StObject.set(x, "resource_sid", value.asInstanceOf[js.Any])
      
      inline def setResponse_body(value: String): Self = StObject.set(x, "response_body", value.asInstanceOf[js.Any])
      
      inline def setResponse_bodyUndefined: Self = StObject.set(x, "response_body", js.undefined)
      
      inline def setResponse_headers(value: String): Self = StObject.set(x, "response_headers", value.asInstanceOf[js.Any])
      
      inline def setResponse_headersUndefined: Self = StObject.set(x, "response_headers", js.undefined)
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlertSolution extends StObject
}
