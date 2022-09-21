package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("twilio/lib/rest/autopilot/v1/assistant/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/autopilot/v1/assistant/query", "QueryContext")
  @js.native
  open class QueryContext protected () extends StObject {
    /**
      * Initialize the QueryContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The SID of the Assistant that is the parent of the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.autopilotV1Mod.^, assistantSid: String, sid: String) = this()
    
    /**
      * fetch a QueryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[QueryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryInstance, Any]): js.Promise[QueryInstance] = js.native
    
    /**
      * remove a QueryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a QueryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[QueryInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryInstance, Any]): js.Promise[QueryInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryInstance, Any]): js.Promise[QueryInstance] = js.native
    def update(opts: QueryInstanceUpdateOptions): js.Promise[QueryInstance] = js.native
    def update(
      opts: QueryInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryInstance, Any]
    ): js.Promise[QueryInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/autopilot/v1/assistant/query", "QueryInstance")
  @js.native
  open class QueryInstance protected () extends SerializableClass {
    /**
      * Initialize the QueryContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The SID of the Assistant that is the parent of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.autopilotV1Mod.^, payload: QueryPayload, assistantSid: String, sid: String) = this()
    
    /* private */ var _proxy: QueryContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var dialogueSid: String = js.native
    
    /**
      * fetch a QueryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[QueryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[QueryInstance] = js.native
    
    var language: String = js.native
    
    var modelBuildSid: String = js.native
    
    var query: String = js.native
    
    /**
      * remove a QueryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var results: Any = js.native
    
    var sampleSid: String = js.native
    
    var sid: String = js.native
    
    var sourceChannel: String = js.native
    
    var status: String = js.native
    
    /**
      * update a QueryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[QueryInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[QueryInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[QueryInstance] = js.native
    def update(opts: QueryInstanceUpdateOptions): js.Promise[QueryInstance] = js.native
    def update(
      opts: QueryInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[QueryInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the QueryList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The SID of the Assistant that is the parent of the resource
    */
  inline def QueryList(version: typings.twilio.autopilotV1Mod.^, assistantSid: String): QueryListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("QueryList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any])).asInstanceOf[QueryListInstance]
  
  @JSImport("twilio/lib/rest/autopilot/v1/assistant/query", "QueryPage")
  @js.native
  open class QueryPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.autopilotV1Mod.^, QueryPayload, QueryResource, QueryInstance] {
    /**
      * Initialize the QueryPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.autopilotV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: QuerySolution
    ) = this()
    
    /**
      * Build an instance of QueryInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: QueryPayload): QueryInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property sampleSid - The SID of an optional reference to the Sample created from the query
    * @property status - The new status of the resource
    */
  trait QueryInstanceUpdateOptions extends StObject {
    
    var sampleSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object QueryInstanceUpdateOptions {
    
    inline def apply(): QueryInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryInstanceUpdateOptions]
    }
    
    extension [Self <: QueryInstanceUpdateOptions](x: Self) {
      
      inline def setSampleSid(value: String): Self = StObject.set(x, "sampleSid", value.asInstanceOf[js.Any])
      
      inline def setSampleSidUndefined: Self = StObject.set(x, "sampleSid", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait QueryListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): QueryContext = js.native
    
    /**
      * create a QueryInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: QueryListInstanceCreateOptions): js.Promise[QueryInstance] = js.native
    def create(
      opts: QueryListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ QueryInstance, Any]
    ): js.Promise[QueryInstance] = js.native
    
    /**
      * Streams QueryInstance records from the API.
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
          /* item */ QueryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ QueryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: QueryListInstanceEachOptions): Unit = js.native
    def each(
      opts: QueryListInstanceEachOptions,
      callback: js.Function2[
          /* item */ QueryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a query
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): QueryContext = js.native
    
    /**
      * Retrieve a single target page of QueryInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[QueryPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryPage, Any]): js.Promise[QueryPage] = js.native
    def getPage(targetUrl: String): js.Promise[QueryPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryPage, Any]): js.Promise[QueryPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryPage, Any]): js.Promise[QueryPage] = js.native
    
    /**
      * Lists QueryInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[QueryInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[QueryInstance], Any]): js.Promise[js.Array[QueryInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[QueryInstance], Any]
    ): js.Promise[js.Array[QueryInstance]] = js.native
    def list(opts: QueryListInstanceOptions): js.Promise[js.Array[QueryInstance]] = js.native
    def list(
      opts: QueryListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[QueryInstance], Any]
    ): js.Promise[js.Array[QueryInstance]] = js.native
    
    /**
      * Retrieve a single page of QueryInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[QueryPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryPage, Any]): js.Promise[QueryPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryPage, Any]): js.Promise[QueryPage] = js.native
    def page(opts: QueryListInstancePageOptions): js.Promise[QueryPage] = js.native
    def page(
      opts: QueryListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryPage, Any]
    ): js.Promise[QueryPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property language - The ISO language-country string that specifies the language used for the new query
    * @property modelBuild - The SID or unique name of the Model Build to be queried
    * @property query - The end-user's natural language input
    * @property tasks - The list of tasks to limit the new query to
    */
  trait QueryListInstanceCreateOptions extends StObject {
    
    var language: String
    
    var modelBuild: js.UndefOr[String] = js.undefined
    
    var query: String
    
    var tasks: js.UndefOr[String] = js.undefined
  }
  object QueryListInstanceCreateOptions {
    
    inline def apply(language: String, query: String): QueryListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryListInstanceCreateOptions]
    }
    
    extension [Self <: QueryListInstanceCreateOptions](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setModelBuild(value: String): Self = StObject.set(x, "modelBuild", value.asInstanceOf[js.Any])
      
      inline def setModelBuildUndefined: Self = StObject.set(x, "modelBuild", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: String): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property dialogueSid - The SID of the {@link https://www.twilio.com/docs/autopilot/api/dialogue|Dialogue}.
    * @property done - Function to be called upon completion of streaming
    * @property language - The ISO language-country string that specifies the language used by the Query resources to read
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property modelBuild - The SID or unique name of the Model Build to be queried
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property status - The status of the resources to read
    */
  trait QueryListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ QueryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dialogueSid: js.UndefOr[String] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var modelBuild: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object QueryListInstanceEachOptions {
    
    inline def apply(): QueryListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryListInstanceEachOptions]
    }
    
    extension [Self <: QueryListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ QueryInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDialogueSid(value: String): Self = StObject.set(x, "dialogueSid", value.asInstanceOf[js.Any])
      
      inline def setDialogueSidUndefined: Self = StObject.set(x, "dialogueSid", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setModelBuild(value: String): Self = StObject.set(x, "modelBuild", value.asInstanceOf[js.Any])
      
      inline def setModelBuildUndefined: Self = StObject.set(x, "modelBuild", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property dialogueSid - The SID of the {@link https://www.twilio.com/docs/autopilot/api/dialogue|Dialogue}.
    * @property language - The ISO language-country string that specifies the language used by the Query resources to read
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property modelBuild - The SID or unique name of the Model Build to be queried
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property status - The status of the resources to read
    */
  trait QueryListInstanceOptions extends StObject {
    
    var dialogueSid: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var modelBuild: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object QueryListInstanceOptions {
    
    inline def apply(): QueryListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryListInstanceOptions]
    }
    
    extension [Self <: QueryListInstanceOptions](x: Self) {
      
      inline def setDialogueSid(value: String): Self = StObject.set(x, "dialogueSid", value.asInstanceOf[js.Any])
      
      inline def setDialogueSidUndefined: Self = StObject.set(x, "dialogueSid", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setModelBuild(value: String): Self = StObject.set(x, "modelBuild", value.asInstanceOf[js.Any])
      
      inline def setModelBuildUndefined: Self = StObject.set(x, "modelBuild", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dialogueSid - The SID of the {@link https://www.twilio.com/docs/autopilot/api/dialogue|Dialogue}.
    * @property language - The ISO language-country string that specifies the language used by the Query resources to read
    * @property modelBuild - The SID or unique name of the Model Build to be queried
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - The status of the resources to read
    */
  trait QueryListInstancePageOptions extends StObject {
    
    var dialogueSid: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var modelBuild: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object QueryListInstancePageOptions {
    
    inline def apply(): QueryListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryListInstancePageOptions]
    }
    
    extension [Self <: QueryListInstancePageOptions](x: Self) {
      
      inline def setDialogueSid(value: String): Self = StObject.set(x, "dialogueSid", value.asInstanceOf[js.Any])
      
      inline def setDialogueSidUndefined: Self = StObject.set(x, "dialogueSid", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setModelBuild(value: String): Self = StObject.set(x, "modelBuild", value.asInstanceOf[js.Any])
      
      inline def setModelBuildUndefined: Self = StObject.set(x, "modelBuild", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait QueryPayload
    extends StObject
       with QueryResource
       with TwilioResponsePayload
  object QueryPayload {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      dialogue_sid: String,
      first_page_uri: String,
      language: String,
      model_build_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      query: String,
      results: js.Object,
      sample_sid: String,
      sid: String,
      source_channel: String,
      status: String,
      uri: String,
      url: String
    ): QueryPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], dialogue_sid = dialogue_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model_build_sid = model_build_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], sample_sid = sample_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source_channel = source_channel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryPayload]
    }
  }
  
  trait QueryResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var dialogue_sid: String
    
    var language: String
    
    var model_build_sid: String
    
    var query: String
    
    var results: js.Object
    
    var sample_sid: String
    
    var sid: String
    
    var source_channel: String
    
    var status: String
    
    var url: String
  }
  object QueryResource {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      dialogue_sid: String,
      language: String,
      model_build_sid: String,
      query: String,
      results: js.Object,
      sample_sid: String,
      sid: String,
      source_channel: String,
      status: String,
      url: String
    ): QueryResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], dialogue_sid = dialogue_sid.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model_build_sid = model_build_sid.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], sample_sid = sample_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source_channel = source_channel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResource]
    }
    
    extension [Self <: QueryResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDialogue_sid(value: String): Self = StObject.set(x, "dialogue_sid", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setModel_build_sid(value: String): Self = StObject.set(x, "model_build_sid", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Object): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setSample_sid(value: String): Self = StObject.set(x, "sample_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSource_channel(value: String): Self = StObject.set(x, "source_channel", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuerySolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
  }
  object QuerySolution {
    
    inline def apply(): QuerySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuerySolution]
    }
    
    extension [Self <: QuerySolution](x: Self) {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
    }
  }
}
