package typings.twilio

import typings.twilio.anon.Language
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantQueryMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/query", "QueryContextImpl")
  @js.native
  open class QueryContextImpl protected ()
    extends StObject
       with QueryContext {
    def this(_version: default, assistantSid: String, sid: String) = this()
    
    /* protected */ var _solution: QueryContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[QueryInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[QueryInstance], Any]
    ): js.Promise[QueryInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[QueryInstance], Any]
    ): js.Promise[QueryInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/query", "QueryInstance")
  @js.native
  open class QueryInstance protected () extends StObject {
    def this(_version: default, payload: QueryResource, assistantSid: String) = this()
    def this(_version: default, payload: QueryResource, assistantSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[QueryContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: QueryContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Query.
      */
    var accountSid: String = js.native
    
    /**
      * The unique ID of the parent Assistant.
      */
    var assistantSid: String = js.native
    
    /**
      * The date that this resource was created
      */
    var dateCreated: js.Date = js.native
    
    /**
      * The date that this resource was last updated
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * Fetch a QueryInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed QueryInstance
      */
    def fetch(): js.Promise[QueryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[QueryInstance] = js.native
    
    /**
      * An ISO language-country string of the sample.
      */
    var language: String = js.native
    
    /**
      * The unique ID of the Model Build queried.
      */
    var modelBuildSid: String = js.native
    
    /**
      * The end-user\'s natural language input.
      */
    var query: String = js.native
    
    /**
      * Remove a QueryInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * The natural language analysis results which include the Task recognized, the confidence score and a list of identified Fields.
      */
    var results: Any = js.native
    
    /**
      * An optional reference to the Sample created from this query.
      */
    var sampleSid: String = js.native
    
    /**
      * A 34 character string that uniquely identifies this resource.
      */
    var sid: String = js.native
    
    /**
      * The communication channel where this end-user input came from
      */
    var sourceChannel: String = js.native
    
    /**
      * A string that described the query status. The values can be: pending_review, reviewed, discarded
      */
    var status: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): Language = js.native
    
    /**
      * Update a QueryInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed QueryInstance
      */
    def update(): js.Promise[QueryInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[QueryInstance] = js.native
    /**
      * Update a QueryInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed QueryInstance
      */
    def update(params: QueryContextUpdateOptions): js.Promise[QueryInstance] = js.native
    def update(
      params: QueryContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[QueryInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait QueryListInstance extends StObject {
    
    def apply(sid: String): QueryContext = js.native
    
    var _solution: QuerySolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a QueryInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed QueryInstance
      */
    def create(params: QueryListInstanceCreateOptions): js.Promise[QueryInstance] = js.native
    def create(
      params: QueryListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[QueryInstance], Any]
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
      * @param { QueryListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ QueryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: QueryListInstanceEachOptions): Unit = js.native
    def each(
      params: QueryListInstanceEachOptions,
      callback: js.Function2[
          /* item */ QueryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): QueryContext = js.native
    
    /**
      * Retrieve a single target page of QueryInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[QueryPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryPage, Any]): js.Promise[QueryPage] = js.native
    
    /**
      * Lists QueryInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { QueryListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[QueryInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[QueryInstance], Any]): js.Promise[js.Array[QueryInstance]] = js.native
    def list(params: QueryListInstanceOptions): js.Promise[js.Array[QueryInstance]] = js.native
    def list(
      params: QueryListInstanceOptions,
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
      * @param { QueryListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[QueryPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryPage, Any]): js.Promise[QueryPage] = js.native
    def page(params: QueryListInstancePageOptions): js.Promise[QueryPage] = js.native
    def page(
      params: QueryListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ QueryPage, Any]
    ): js.Promise[QueryPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object QueryListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/query", "QueryListInstance")
    @js.native
    def apply(version: default, assistantSid: String): QueryListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/query", "QueryPage")
  @js.native
  open class QueryPage protected ()
    extends typings.twilio.libBasePageMod.default[default, QueryPayload, QueryResource, QueryInstance] {
    /**
      * Initialize the QueryPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: QuerySolution
    ) = this()
    
    /**
      * Build an instance of QueryInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: QueryResource): QueryInstance = js.native
  }
  
  @js.native
  trait QueryContext extends StObject {
    
    /**
      * Fetch a QueryInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed QueryInstance
      */
    def fetch(): js.Promise[QueryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[QueryInstance], Any]): js.Promise[QueryInstance] = js.native
    
    /**
      * Remove a QueryInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a QueryInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed QueryInstance
      */
    def update(): js.Promise[QueryInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[QueryInstance], Any]): js.Promise[QueryInstance] = js.native
    /**
      * Update a QueryInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed QueryInstance
      */
    def update(params: QueryContextUpdateOptions): js.Promise[QueryInstance] = js.native
    def update(
      params: QueryContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[QueryInstance], Any]
    ): js.Promise[QueryInstance] = js.native
  }
  
  trait QueryContextSolution extends StObject {
    
    var assistantSid: String
    
    var sid: String
  }
  object QueryContextSolution {
    
    inline def apply(assistantSid: String, sid: String): QueryContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryContextUpdateOptions extends StObject {
    
    /** An optional reference to the Sample created from this query. */
    var sampleSid: js.UndefOr[String] = js.undefined
    
    /** A string that described the query status. The values can be: pending_review, reviewed, discarded */
    var status: js.UndefOr[String] = js.undefined
  }
  object QueryContextUpdateOptions {
    
    inline def apply(): QueryContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setSampleSid(value: String): Self = StObject.set(x, "sampleSid", value.asInstanceOf[js.Any])
      
      inline def setSampleSidUndefined: Self = StObject.set(x, "sampleSid", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait QueryListInstanceCreateOptions extends StObject {
    
    /** Constraints the query to a given Field with an task. Useful when you know the Field you are expecting. It accepts one field in the format *task-unique-name-1*:*field-unique-name* */
    var field: js.UndefOr[String] = js.undefined
    
    /** An ISO language-country string of the sample. */
    var language: String
    
    /** The Model Build Sid or unique name of the Model Build to be queried. */
    var modelBuild: js.UndefOr[String] = js.undefined
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. It can be up to 2048 characters long. */
    var query: String
    
    /** Constraints the query to a set of tasks. Useful when you need to constrain the paths the user can take. Tasks should be comma separated *task-unique-name-1*, *task-unique-name-2* */
    var tasks: js.UndefOr[String] = js.undefined
  }
  object QueryListInstanceCreateOptions {
    
    inline def apply(language: String, query: String): QueryListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setModelBuild(value: String): Self = StObject.set(x, "modelBuild", value.asInstanceOf[js.Any])
      
      inline def setModelBuildUndefined: Self = StObject.set(x, "modelBuild", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: String): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    }
  }
  
  trait QueryListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ QueryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** An ISO language-country string of the sample. */
    var language: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** The Model Build Sid or unique name of the Model Build to be queried. */
    var modelBuild: js.UndefOr[String] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** A string that described the query status. The values can be: pending_review, reviewed, discarded */
    var status: js.UndefOr[String] = js.undefined
  }
  object QueryListInstanceEachOptions {
    
    inline def apply(): QueryListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ QueryInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
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
  
  trait QueryListInstanceOptions extends StObject {
    
    /** An ISO language-country string of the sample. */
    var language: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** The Model Build Sid or unique name of the Model Build to be queried. */
    var modelBuild: js.UndefOr[String] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** A string that described the query status. The values can be: pending_review, reviewed, discarded */
    var status: js.UndefOr[String] = js.undefined
  }
  object QueryListInstanceOptions {
    
    inline def apply(): QueryListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryListInstanceOptions] (val x: Self) extends AnyVal {
      
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
  
  trait QueryListInstancePageOptions extends StObject {
    
    /** An ISO language-country string of the sample. */
    var language: js.UndefOr[String] = js.undefined
    
    /** The Model Build Sid or unique name of the Model Build to be queried. */
    var modelBuild: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /** A string that described the query status. The values can be: pending_review, reviewed, discarded */
    var status: js.UndefOr[String] = js.undefined
  }
  object QueryListInstancePageOptions {
    
    inline def apply(): QueryListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryListInstancePageOptions] (val x: Self) extends AnyVal {
      
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
       with TwilioResponsePayload {
    
    var queries: js.Array[QueryResource]
  }
  object QueryPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      queries: js.Array[QueryResource],
      uri: String
    ): QueryPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryPayload] (val x: Self) extends AnyVal {
      
      inline def setQueries(value: js.Array[QueryResource]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesVarargs(value: QueryResource*): Self = StObject.set(x, "queries", js.Array(value*))
    }
  }
  
  trait QueryResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var language: String
    
    var model_build_sid: String
    
    var query: String
    
    var results: Any
    
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
      language: String,
      model_build_sid: String,
      query: String,
      results: Any,
      sample_sid: String,
      sid: String,
      source_channel: String,
      status: String,
      url: String
    ): QueryResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model_build_sid = model_build_sid.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], sample_sid = sample_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source_channel = source_channel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setModel_build_sid(value: String): Self = StObject.set(x, "model_build_sid", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResults(value: Any): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setSample_sid(value: String): Self = StObject.set(x, "sample_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSource_channel(value: String): Self = StObject.set(x, "source_channel", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuerySolution extends StObject {
    
    var assistantSid: String
  }
  object QuerySolution {
    
    inline def apply(assistantSid: String): QuerySolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuerySolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuerySolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
}
