package typings.twilio

import typings.twilio.anon.FieldType
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantTaskFieldMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/field", "FieldContextImpl")
  @js.native
  open class FieldContextImpl protected ()
    extends StObject
       with FieldContext {
    def this(_version: default, assistantSid: String, taskSid: String, sid: String) = this()
    
    /* protected */ var _solution: FieldContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/field", "FieldInstance")
  @js.native
  open class FieldInstance protected () extends StObject {
    def this(_version: default, payload: FieldResource, assistantSid: String, taskSid: String) = this()
    def this(_version: default, payload: FieldResource, assistantSid: String, taskSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[FieldContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: FieldContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Field.
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
      * Fetch a FieldInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldInstance
      */
    def fetch(): js.Promise[FieldInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[FieldInstance] = js.native
    
    /**
      * The Field Type of this field. It can be any [Built-in Field Type](https://www.twilio.com/docs/assistant/api/built-in-field-types) or the unique_name or sid of a custom Field Type.
      */
    var fieldType: String = js.native
    
    /**
      * Remove a FieldInstance
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
      * The unique ID of the Task associated with this Field.
      */
    var taskSid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): FieldType = js.native
    
    /**
      * A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
      */
    var uniqueName: String = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait FieldListInstance extends StObject {
    
    def apply(sid: String): FieldContext = js.native
    
    var _solution: FieldSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a FieldInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldInstance
      */
    def create(params: FieldListInstanceCreateOptions): js.Promise[FieldInstance] = js.native
    def create(
      params: FieldListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldInstance], Any]
    ): js.Promise[FieldInstance] = js.native
    
    /**
      * Streams FieldInstance records from the API.
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
      * @param { FieldListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ FieldInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: FieldListInstanceEachOptions): Unit = js.native
    def each(
      params: FieldListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FieldInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): FieldContext = js.native
    
    /**
      * Retrieve a single target page of FieldInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[FieldPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldPage, Any]): js.Promise[FieldPage] = js.native
    
    /**
      * Lists FieldInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { FieldListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FieldInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldInstance], Any]): js.Promise[js.Array[FieldInstance]] = js.native
    def list(params: FieldListInstanceOptions): js.Promise[js.Array[FieldInstance]] = js.native
    def list(
      params: FieldListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldInstance], Any]
    ): js.Promise[js.Array[FieldInstance]] = js.native
    
    /**
      * Retrieve a single page of FieldInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { FieldListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[FieldPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldPage, Any]): js.Promise[FieldPage] = js.native
    def page(params: FieldListInstancePageOptions): js.Promise[FieldPage] = js.native
    def page(
      params: FieldListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldPage, Any]
    ): js.Promise[FieldPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object FieldListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/task/field", "FieldListInstance")
    @js.native
    def apply(version: default, assistantSid: String, taskSid: String): FieldListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/field", "FieldPage")
  @js.native
  open class FieldPage protected ()
    extends typings.twilio.libBasePageMod.default[default, FieldPayload, FieldResource, FieldInstance] {
    /**
      * Initialize the FieldPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: FieldSolution
    ) = this()
    
    /**
      * Build an instance of FieldInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FieldResource): FieldInstance = js.native
  }
  
  @js.native
  trait FieldContext extends StObject {
    
    /**
      * Fetch a FieldInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldInstance
      */
    def fetch(): js.Promise[FieldInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldInstance], Any]): js.Promise[FieldInstance] = js.native
    
    /**
      * Remove a FieldInstance
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
  }
  
  trait FieldContextSolution extends StObject {
    
    var assistantSid: String
    
    var sid: String
    
    var taskSid: String
  }
  object FieldContextSolution {
    
    inline def apply(assistantSid: String, sid: String, taskSid: String): FieldContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], taskSid = taskSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldListInstanceCreateOptions extends StObject {
    
    /** The unique name or sid of the FieldType. It can be any [Built-in Field Type](https://www.twilio.com/docs/assistant/api/built-in-field-types) or the unique_name or the Field Type sid of a custom Field Type. */
    var fieldType: String
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. */
    var uniqueName: String
  }
  object FieldListInstanceCreateOptions {
    
    inline def apply(fieldType: String, uniqueName: String): FieldListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(fieldType = fieldType.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FieldInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FieldListInstanceEachOptions {
    
    inline def apply(): FieldListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ FieldInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait FieldListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FieldListInstanceOptions {
    
    inline def apply(): FieldListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait FieldListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FieldListInstancePageOptions {
    
    inline def apply(): FieldListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait FieldPayload
    extends StObject
       with TwilioResponsePayload {
    
    var fields: js.Array[FieldResource]
  }
  object FieldPayload {
    
    inline def apply(
      fields: js.Array[FieldResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): FieldPayload = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldPayload] (val x: Self) extends AnyVal {
      
      inline def setFields(value: js.Array[FieldResource]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: FieldResource*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait FieldResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var field_type: String
    
    var sid: String
    
    var task_sid: String
    
    var unique_name: String
    
    var url: String
  }
  object FieldResource {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      field_type: String,
      sid: String,
      task_sid: String,
      unique_name: String,
      url: String
    ): FieldResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], field_type = field_type.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setField_type(value: String): Self = StObject.set(x, "field_type", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTask_sid(value: String): Self = StObject.set(x, "task_sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldSolution extends StObject {
    
    var assistantSid: String
    
    var taskSid: String
  }
  object FieldSolution {
    
    inline def apply(assistantSid: String, taskSid: String): FieldSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], taskSid = taskSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
    }
  }
}
