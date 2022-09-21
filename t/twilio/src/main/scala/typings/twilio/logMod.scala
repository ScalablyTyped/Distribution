package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.error_
import typings.twilio.twilioStrings.info_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/log", "LogContext")
  @js.native
  open class LogContext protected () extends StObject {
    /**
      * Initialize the LogContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the Log resource from
      * @param environmentSid - The SID of the environment with the Log resource to fetch
      * @param sid - The SID that identifies the Log resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, environmentSid: String, sid: String) = this()
    
    /**
      * fetch a LogInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[LogInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ LogInstance, Any]): js.Promise[LogInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/log", "LogInstance")
  @js.native
  open class LogInstance protected () extends SerializableClass {
    /**
      * Initialize the LogContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the Log resource is associated with
      * @param environmentSid - The SID of the environment in which the log occurred
      * @param sid - The SID that identifies the Log resource to fetch
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      payload: LogPayload,
      serviceSid: String,
      environmentSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: LogContext = js.native
    
    var accountSid: String = js.native
    
    var buildSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var deploymentSid: String = js.native
    
    var environmentSid: String = js.native
    
    /**
      * fetch a LogInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[LogInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[LogInstance] = js.native
    
    var functionSid: String = js.native
    
    var level: LogLevel = js.native
    
    var message: String = js.native
    
    var requestSid: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the LogList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the Log resource is associated with
    * @param environmentSid - The SID of the environment in which the log occurred
    */
  inline def LogList(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, environmentSid: String): LogListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("LogList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], environmentSid.asInstanceOf[js.Any])).asInstanceOf[LogListInstance]
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/log", "LogPage")
  @js.native
  open class LogPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.serverlessV1Mod.^, LogPayload, LogResource, LogInstance] {
    /**
      * Initialize the LogPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: LogSolution
    ) = this()
    
    /**
      * Build an instance of LogInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: LogPayload): LogInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.info_
    - typings.twilio.twilioStrings.warn
    - typings.twilio.twilioStrings.error_
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def error: error_ = "error".asInstanceOf[error_]
    
    inline def info: info_ = "info".asInstanceOf[info_]
    
    inline def warn: typings.twilio.twilioStrings.warn = "warn".asInstanceOf[typings.twilio.twilioStrings.warn]
  }
  
  @js.native
  trait LogListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): LogContext = js.native
    
    /**
      * Streams LogInstance records from the API.
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
          /* item */ LogInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ LogInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: LogListInstanceEachOptions): Unit = js.native
    def each(
      opts: LogListInstanceEachOptions,
      callback: js.Function2[
          /* item */ LogInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a log
      *
      * @param sid - The SID that identifies the Log resource to fetch
      */
    def get(sid: String): LogContext = js.native
    
    /**
      * Retrieve a single target page of LogInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[LogPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ LogPage, Any]): js.Promise[LogPage] = js.native
    def getPage(targetUrl: String): js.Promise[LogPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ LogPage, Any]): js.Promise[LogPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ LogPage, Any]): js.Promise[LogPage] = js.native
    
    /**
      * Lists LogInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[LogInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[LogInstance], Any]): js.Promise[js.Array[LogInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[LogInstance], Any]
    ): js.Promise[js.Array[LogInstance]] = js.native
    def list(opts: LogListInstanceOptions): js.Promise[js.Array[LogInstance]] = js.native
    def list(
      opts: LogListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[LogInstance], Any]
    ): js.Promise[js.Array[LogInstance]] = js.native
    
    /**
      * Retrieve a single page of LogInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[LogPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ LogPage, Any]): js.Promise[LogPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ LogPage, Any]): js.Promise[LogPage] = js.native
    def page(opts: LogListInstancePageOptions): js.Promise[LogPage] = js.native
    def page(
      opts: LogListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ LogPage, Any]
    ): js.Promise[LogPage] = js.native
    
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
    * @property endDate - The date and time before which the Log resource must have been created.
    * @property functionSid - The SID of the function whose invocation produced the Log resources to read
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
    * @property startDate - The date and time after which the Log resources must have been created.
    */
  trait LogListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ LogInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var functionSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object LogListInstanceEachOptions {
    
    inline def apply(): LogListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogListInstanceEachOptions]
    }
    
    extension [Self <: LogListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ LogInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFunctionSid(value: String): Self = StObject.set(x, "functionSid", value.asInstanceOf[js.Any])
      
      inline def setFunctionSidUndefined: Self = StObject.set(x, "functionSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property endDate - The date and time before which the Log resource must have been created.
    * @property functionSid - The SID of the function whose invocation produced the Log resources to read
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
    * @property startDate - The date and time after which the Log resources must have been created.
    */
  trait LogListInstanceOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var functionSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object LogListInstanceOptions {
    
    inline def apply(): LogListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogListInstanceOptions]
    }
    
    extension [Self <: LogListInstanceOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFunctionSid(value: String): Self = StObject.set(x, "functionSid", value.asInstanceOf[js.Any])
      
      inline def setFunctionSidUndefined: Self = StObject.set(x, "functionSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property endDate - The date and time before which the Log resource must have been created.
    * @property functionSid - The SID of the function whose invocation produced the Log resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property startDate - The date and time after which the Log resources must have been created.
    */
  trait LogListInstancePageOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var functionSid: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object LogListInstancePageOptions {
    
    inline def apply(): LogListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogListInstancePageOptions]
    }
    
    extension [Self <: LogListInstancePageOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFunctionSid(value: String): Self = StObject.set(x, "functionSid", value.asInstanceOf[js.Any])
      
      inline def setFunctionSidUndefined: Self = StObject.set(x, "functionSid", js.undefined)
      
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
  
  trait LogPayload
    extends StObject
       with LogResource
       with TwilioResponsePayload
  object LogPayload {
    
    inline def apply(
      account_sid: String,
      build_sid: String,
      date_created: js.Date,
      deployment_sid: String,
      environment_sid: String,
      first_page_uri: String,
      function_sid: String,
      level: LogLevel,
      message: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      request_sid: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): LogPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], build_sid = build_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], deployment_sid = deployment_sid.asInstanceOf[js.Any], environment_sid = environment_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], function_sid = function_sid.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], request_sid = request_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogPayload]
    }
  }
  
  trait LogResource extends StObject {
    
    var account_sid: String
    
    var build_sid: String
    
    var date_created: js.Date
    
    var deployment_sid: String
    
    var environment_sid: String
    
    var function_sid: String
    
    var level: LogLevel
    
    var message: String
    
    var request_sid: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object LogResource {
    
    inline def apply(
      account_sid: String,
      build_sid: String,
      date_created: js.Date,
      deployment_sid: String,
      environment_sid: String,
      function_sid: String,
      level: LogLevel,
      message: String,
      request_sid: String,
      service_sid: String,
      sid: String,
      url: String
    ): LogResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], build_sid = build_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], deployment_sid = deployment_sid.asInstanceOf[js.Any], environment_sid = environment_sid.asInstanceOf[js.Any], function_sid = function_sid.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], request_sid = request_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogResource]
    }
    
    extension [Self <: LogResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBuild_sid(value: String): Self = StObject.set(x, "build_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDeployment_sid(value: String): Self = StObject.set(x, "deployment_sid", value.asInstanceOf[js.Any])
      
      inline def setEnvironment_sid(value: String): Self = StObject.set(x, "environment_sid", value.asInstanceOf[js.Any])
      
      inline def setFunction_sid(value: String): Self = StObject.set(x, "function_sid", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRequest_sid(value: String): Self = StObject.set(x, "request_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogSolution extends StObject {
    
    var environmentSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object LogSolution {
    
    inline def apply(): LogSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogSolution]
    }
    
    extension [Self <: LogSolution](x: Self) {
      
      inline def setEnvironmentSid(value: String): Self = StObject.set(x, "environmentSid", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentSidUndefined: Self = StObject.set(x, "environmentSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
