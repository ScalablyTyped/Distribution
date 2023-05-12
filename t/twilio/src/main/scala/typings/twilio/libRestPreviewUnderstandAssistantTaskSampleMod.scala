package typings.twilio

import typings.twilio.anon.SourceChannel
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantTaskSampleMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/sample", "SampleContextImpl")
  @js.native
  open class SampleContextImpl protected ()
    extends StObject
       with SampleContext {
    def this(_version: default, assistantSid: String, taskSid: String, sid: String) = this()
    
    /* protected */ var _solution: SampleContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SampleInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SampleInstance], Any]
    ): js.Promise[SampleInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SampleInstance], Any]
    ): js.Promise[SampleInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/sample", "SampleInstance")
  @js.native
  open class SampleInstance protected () extends StObject {
    def this(_version: default, payload: SampleResource, assistantSid: String, taskSid: String) = this()
    def this(_version: default, payload: SampleResource, assistantSid: String, taskSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[SampleContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: SampleContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Sample.
      */
    var accountSid: String = js.native
    
    /**
      * The unique ID of the Assistant.
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
      * Fetch a SampleInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SampleInstance
      */
    def fetch(): js.Promise[SampleInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[SampleInstance] = js.native
    
    /**
      * An ISO language-country string of the sample.
      */
    var language: String = js.native
    
    /**
      * Remove a SampleInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * A 34 character string that uniquely identifies this resource.
      */
    var sid: String = js.native
    
    /**
      * The communication channel the sample was captured. It can be: *voice*, *sms*, *chat*, *alexa*, *google-assistant*, or *slack*. If not included the value will be null
      */
    var sourceChannel: String = js.native
    
    /**
      * The text example of how end-users may express this task. The sample may contain Field tag blocks.
      */
    var taggedText: String = js.native
    
    /**
      * The unique ID of the Task associated with this Sample.
      */
    var taskSid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): SourceChannel = js.native
    
    /**
      * Update a SampleInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SampleInstance
      */
    def update(): js.Promise[SampleInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[SampleInstance] = js.native
    /**
      * Update a SampleInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SampleInstance
      */
    def update(params: SampleContextUpdateOptions): js.Promise[SampleInstance] = js.native
    def update(
      params: SampleContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[SampleInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait SampleListInstance extends StObject {
    
    def apply(sid: String): SampleContext = js.native
    
    var _solution: SampleSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a SampleInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SampleInstance
      */
    def create(params: SampleListInstanceCreateOptions): js.Promise[SampleInstance] = js.native
    def create(
      params: SampleListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SampleInstance], Any]
    ): js.Promise[SampleInstance] = js.native
    
    /**
      * Streams SampleInstance records from the API.
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
      * @param { SampleListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SampleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: SampleListInstanceEachOptions): Unit = js.native
    def each(
      params: SampleListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SampleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): SampleContext = js.native
    
    /**
      * Retrieve a single target page of SampleInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[SamplePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SamplePage, Any]
    ): js.Promise[SamplePage] = js.native
    
    /**
      * Lists SampleInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SampleListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SampleInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SampleInstance], Any]): js.Promise[js.Array[SampleInstance]] = js.native
    def list(params: SampleListInstanceOptions): js.Promise[js.Array[SampleInstance]] = js.native
    def list(
      params: SampleListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SampleInstance], Any]
    ): js.Promise[js.Array[SampleInstance]] = js.native
    
    /**
      * Retrieve a single page of SampleInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SampleListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[SamplePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SamplePage, Any]): js.Promise[SamplePage] = js.native
    def page(params: SampleListInstancePageOptions): js.Promise[SamplePage] = js.native
    def page(
      params: SampleListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SamplePage, Any]
    ): js.Promise[SamplePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object SampleListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/task/sample", "SampleListInstance")
    @js.native
    def apply(version: default, assistantSid: String, taskSid: String): SampleListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/sample", "SamplePage")
  @js.native
  open class SamplePage protected ()
    extends typings.twilio.libBasePageMod.default[default, SamplePayload, SampleResource, SampleInstance] {
    /**
      * Initialize the SamplePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: SampleSolution
    ) = this()
    
    /**
      * Build an instance of SampleInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SampleResource): SampleInstance = js.native
  }
  
  @js.native
  trait SampleContext extends StObject {
    
    /**
      * Fetch a SampleInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SampleInstance
      */
    def fetch(): js.Promise[SampleInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SampleInstance], Any]): js.Promise[SampleInstance] = js.native
    
    /**
      * Remove a SampleInstance
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
      * Update a SampleInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SampleInstance
      */
    def update(): js.Promise[SampleInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SampleInstance], Any]): js.Promise[SampleInstance] = js.native
    /**
      * Update a SampleInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SampleInstance
      */
    def update(params: SampleContextUpdateOptions): js.Promise[SampleInstance] = js.native
    def update(
      params: SampleContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SampleInstance], Any]
    ): js.Promise[SampleInstance] = js.native
  }
  
  trait SampleContextSolution extends StObject {
    
    var assistantSid: String
    
    var sid: String
    
    var taskSid: String
  }
  object SampleContextSolution {
    
    inline def apply(assistantSid: String, sid: String, taskSid: String): SampleContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], taskSid = taskSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SampleContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SampleContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SampleContextUpdateOptions extends StObject {
    
    /** An ISO language-country string of the sample. */
    var language: js.UndefOr[String] = js.undefined
    
    /** The communication channel the sample was captured. It can be: *voice*, *sms*, *chat*, *alexa*, *google-assistant*, or *slack*. If not included the value will be null */
    var sourceChannel: js.UndefOr[String] = js.undefined
    
    /** The text example of how end-users may express this task. The sample may contain Field tag blocks. */
    var taggedText: js.UndefOr[String] = js.undefined
  }
  object SampleContextUpdateOptions {
    
    inline def apply(): SampleContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SampleContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SampleContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setSourceChannel(value: String): Self = StObject.set(x, "sourceChannel", value.asInstanceOf[js.Any])
      
      inline def setSourceChannelUndefined: Self = StObject.set(x, "sourceChannel", js.undefined)
      
      inline def setTaggedText(value: String): Self = StObject.set(x, "taggedText", value.asInstanceOf[js.Any])
      
      inline def setTaggedTextUndefined: Self = StObject.set(x, "taggedText", js.undefined)
    }
  }
  
  trait SampleListInstanceCreateOptions extends StObject {
    
    /** An ISO language-country string of the sample. */
    var language: String
    
    /** The communication channel the sample was captured. It can be: *voice*, *sms*, *chat*, *alexa*, *google-assistant*, or *slack*. If not included the value will be null */
    var sourceChannel: js.UndefOr[String] = js.undefined
    
    /** The text example of how end-users may express this task. The sample may contain Field tag blocks. */
    var taggedText: String
  }
  object SampleListInstanceCreateOptions {
    
    inline def apply(language: String, taggedText: String): SampleListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], taggedText = taggedText.asInstanceOf[js.Any])
      __obj.asInstanceOf[SampleListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SampleListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setSourceChannel(value: String): Self = StObject.set(x, "sourceChannel", value.asInstanceOf[js.Any])
      
      inline def setSourceChannelUndefined: Self = StObject.set(x, "sourceChannel", js.undefined)
      
      inline def setTaggedText(value: String): Self = StObject.set(x, "taggedText", value.asInstanceOf[js.Any])
    }
  }
  
  trait SampleListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SampleInstance, 
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
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SampleListInstanceEachOptions {
    
    inline def apply(): SampleListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SampleListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SampleListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ SampleInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait SampleListInstanceOptions extends StObject {
    
    /** An ISO language-country string of the sample. */
    var language: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SampleListInstanceOptions {
    
    inline def apply(): SampleListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SampleListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SampleListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait SampleListInstancePageOptions extends StObject {
    
    /** An ISO language-country string of the sample. */
    var language: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SampleListInstancePageOptions {
    
    inline def apply(): SampleListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SampleListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SampleListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SamplePayload
    extends StObject
       with TwilioResponsePayload {
    
    var samples: js.Array[SampleResource]
  }
  object SamplePayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      samples: js.Array[SampleResource],
      uri: String
    ): SamplePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SamplePayload] (val x: Self) extends AnyVal {
      
      inline def setSamples(value: js.Array[SampleResource]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesVarargs(value: SampleResource*): Self = StObject.set(x, "samples", js.Array(value*))
    }
  }
  
  trait SampleResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var language: String
    
    var sid: String
    
    var source_channel: String
    
    var tagged_text: String
    
    var task_sid: String
    
    var url: String
  }
  object SampleResource {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      language: String,
      sid: String,
      source_channel: String,
      tagged_text: String,
      task_sid: String,
      url: String
    ): SampleResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source_channel = source_channel.asInstanceOf[js.Any], tagged_text = tagged_text.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SampleResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SampleResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSource_channel(value: String): Self = StObject.set(x, "source_channel", value.asInstanceOf[js.Any])
      
      inline def setTagged_text(value: String): Self = StObject.set(x, "tagged_text", value.asInstanceOf[js.Any])
      
      inline def setTask_sid(value: String): Self = StObject.set(x, "task_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SampleSolution extends StObject {
    
    var assistantSid: String
    
    var taskSid: String
  }
  object SampleSolution {
    
    inline def apply(assistantSid: String, taskSid: String): SampleSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], taskSid = taskSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SampleSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SampleSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
    }
  }
}
