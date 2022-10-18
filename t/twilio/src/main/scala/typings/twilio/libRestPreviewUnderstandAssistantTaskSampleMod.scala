package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantTaskSampleMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/sample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/sample", "SampleContext")
  @js.native
  open class SampleContext protected () extends StObject {
    /**
      * Initialize the SampleContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The unique ID of the Assistant.
      * @param taskSid - The unique ID of the Task associated with this Sample.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      assistantSid: String,
      taskSid: String,
      sid: String
    ) = this()
    
    /**
      * fetch a SampleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SampleInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SampleInstance, Any]): js.Promise[SampleInstance] = js.native
    
    /**
      * remove a SampleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SampleInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SampleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SampleInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SampleInstance, Any]): js.Promise[SampleInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SampleInstance, Any]): js.Promise[SampleInstance] = js.native
    def update(opts: SampleInstanceUpdateOptions): js.Promise[SampleInstance] = js.native
    def update(
      opts: SampleInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SampleInstance, Any]
    ): js.Promise[SampleInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/sample", "SampleInstance")
  @js.native
  open class SampleInstance protected () extends SerializableClass {
    /**
      * Initialize the SampleContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The unique ID of the Assistant.
      * @param taskSid - The unique ID of the Task associated with this Sample.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      payload: SamplePayload,
      assistantSid: String,
      taskSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: SampleContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SampleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SampleInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SampleInstance] = js.native
    
    var language: String = js.native
    
    /**
      * remove a SampleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var sourceChannel: String = js.native
    
    var taggedText: String = js.native
    
    var taskSid: String = js.native
    
    /**
      * update a SampleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SampleInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SampleInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SampleInstance] = js.native
    def update(opts: SampleInstanceUpdateOptions): js.Promise[SampleInstance] = js.native
    def update(
      opts: SampleInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SampleInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SampleList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The unique ID of the Assistant.
    * @param taskSid - The unique ID of the Task associated with this Sample.
    */
  inline def SampleList(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String, taskSid: String): SampleListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SampleList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any], taskSid.asInstanceOf[js.Any])).asInstanceOf[SampleListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/sample", "SamplePage")
  @js.native
  open class SamplePage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewUnderstandMod.^, 
          SamplePayload, 
          SampleResource, 
          SampleInstance
        ] {
    /**
      * Initialize the SamplePage
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
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
      solution: SampleSolution
    ) = this()
    
    /**
      * Build an instance of SampleInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SamplePayload): SampleInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property language - An ISO language-country string of the sample.
    * @property sourceChannel - The communication channel the sample was captured. It can be: voice, sms, chat, alexa, google-assistant, or slack. If not included the value will be null
    * @property taggedText - The text example of how end-users may express this task. The sample may contain Field tag blocks.
    */
  trait SampleInstanceUpdateOptions extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
    
    var sourceChannel: js.UndefOr[String] = js.undefined
    
    var taggedText: js.UndefOr[String] = js.undefined
  }
  object SampleInstanceUpdateOptions {
    
    inline def apply(): SampleInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SampleInstanceUpdateOptions]
    }
    
    extension [Self <: SampleInstanceUpdateOptions](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setSourceChannel(value: String): Self = StObject.set(x, "sourceChannel", value.asInstanceOf[js.Any])
      
      inline def setSourceChannelUndefined: Self = StObject.set(x, "sourceChannel", js.undefined)
      
      inline def setTaggedText(value: String): Self = StObject.set(x, "taggedText", value.asInstanceOf[js.Any])
      
      inline def setTaggedTextUndefined: Self = StObject.set(x, "taggedText", js.undefined)
    }
  }
  
  @js.native
  trait SampleListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SampleContext = js.native
    
    /**
      * create a SampleInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SampleListInstanceCreateOptions): js.Promise[SampleInstance] = js.native
    def create(
      opts: SampleListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SampleInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SampleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SampleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SampleListInstanceEachOptions): Unit = js.native
    def each(
      opts: SampleListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SampleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sample
      *
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def get(sid: String): SampleContext = js.native
    
    /**
      * Retrieve a single target page of SampleInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SamplePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SamplePage, Any]): js.Promise[SamplePage] = js.native
    def getPage(targetUrl: String): js.Promise[SamplePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SamplePage, Any]
    ): js.Promise[SamplePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SamplePage, Any]): js.Promise[SamplePage] = js.native
    
    /**
      * Lists SampleInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SampleInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SampleInstance], Any]): js.Promise[js.Array[SampleInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SampleInstance], Any]
    ): js.Promise[js.Array[SampleInstance]] = js.native
    def list(opts: SampleListInstanceOptions): js.Promise[js.Array[SampleInstance]] = js.native
    def list(
      opts: SampleListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SamplePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SamplePage, Any]): js.Promise[SamplePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SamplePage, Any]): js.Promise[SamplePage] = js.native
    def page(opts: SampleListInstancePageOptions): js.Promise[SamplePage] = js.native
    def page(
      opts: SampleListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SamplePage, Any]
    ): js.Promise[SamplePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property language - An ISO language-country string of the sample.
    * @property sourceChannel - The communication channel the sample was captured. It can be: voice, sms, chat, alexa, google-assistant, or slack. If not included the value will be null
    * @property taggedText - The text example of how end-users may express this task. The sample may contain Field tag blocks.
    */
  trait SampleListInstanceCreateOptions extends StObject {
    
    var language: String
    
    var sourceChannel: js.UndefOr[String] = js.undefined
    
    var taggedText: String
  }
  object SampleListInstanceCreateOptions {
    
    inline def apply(language: String, taggedText: String): SampleListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], taggedText = taggedText.asInstanceOf[js.Any])
      __obj.asInstanceOf[SampleListInstanceCreateOptions]
    }
    
    extension [Self <: SampleListInstanceCreateOptions](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setSourceChannel(value: String): Self = StObject.set(x, "sourceChannel", value.asInstanceOf[js.Any])
      
      inline def setSourceChannelUndefined: Self = StObject.set(x, "sourceChannel", js.undefined)
      
      inline def setTaggedText(value: String): Self = StObject.set(x, "taggedText", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property language - An ISO language-country string of the sample.
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
  trait SampleListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SampleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SampleListInstanceEachOptions {
    
    inline def apply(): SampleListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SampleListInstanceEachOptions]
    }
    
    extension [Self <: SampleListInstanceEachOptions](x: Self) {
      
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
  
  /**
    * Options to pass to list
    *
    * @property language - An ISO language-country string of the sample.
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
  trait SampleListInstanceOptions extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SampleListInstanceOptions {
    
    inline def apply(): SampleListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SampleListInstanceOptions]
    }
    
    extension [Self <: SampleListInstanceOptions](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property language - An ISO language-country string of the sample.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait SampleListInstancePageOptions extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SampleListInstancePageOptions {
    
    inline def apply(): SampleListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SampleListInstancePageOptions]
    }
    
    extension [Self <: SampleListInstancePageOptions](x: Self) {
      
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
       with SampleResource
       with TwilioResponsePayload
  object SamplePayload {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      language: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      source_channel: String,
      tagged_text: String,
      task_sid: String,
      uri: String,
      url: String
    ): SamplePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source_channel = source_channel.asInstanceOf[js.Any], tagged_text = tagged_text.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplePayload]
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
    
    extension [Self <: SampleResource](x: Self) {
      
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
    
    var assistantSid: js.UndefOr[String] = js.undefined
    
    var taskSid: js.UndefOr[String] = js.undefined
  }
  object SampleSolution {
    
    inline def apply(): SampleSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SampleSolution]
    }
    
    extension [Self <: SampleSolution](x: Self) {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSidUndefined: Self = StObject.set(x, "taskSid", js.undefined)
    }
  }
}
