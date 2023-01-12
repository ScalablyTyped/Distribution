package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantTaskFieldMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/field", "FieldContext")
  @js.native
  open class FieldContext protected () extends StObject {
    /**
      * Initialize the FieldContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The unique ID of the Assistant.
      * @param taskSid - The unique ID of the Task associated with this Field.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      assistantSid: String,
      taskSid: String,
      sid: String
    ) = this()
    
    /**
      * fetch a FieldInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FieldInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldInstance, Any]): js.Promise[FieldInstance] = js.native
    
    /**
      * remove a FieldInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/field", "FieldInstance")
  @js.native
  open class FieldInstance protected () extends SerializableClass {
    /**
      * Initialize the FieldContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The unique ID of the parent Assistant.
      * @param taskSid - The unique ID of the Task associated with this Field.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      payload: FieldPayload,
      assistantSid: String,
      taskSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: FieldContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a FieldInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FieldInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FieldInstance] = js.native
    
    var fieldType: String = js.native
    
    /**
      * remove a FieldInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var taskSid: String = js.native
    
    var uniqueName: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the FieldList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The unique ID of the parent Assistant.
    * @param taskSid - The unique ID of the Task associated with this Field.
    */
  inline def FieldList(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String, taskSid: String): FieldListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FieldList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any], taskSid.asInstanceOf[js.Any])).asInstanceOf[FieldListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/field", "FieldPage")
  @js.native
  open class FieldPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewUnderstandMod.^, 
          FieldPayload, 
          FieldResource, 
          FieldInstance
        ] {
    /**
      * Initialize the FieldPage
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
      solution: FieldSolution
    ) = this()
    
    /**
      * Build an instance of FieldInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FieldPayload): FieldInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait FieldListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FieldContext = js.native
    
    /**
      * create a FieldInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: FieldListInstanceCreateOptions): js.Promise[FieldInstance] = js.native
    def create(
      opts: FieldListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ FieldInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ FieldInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ FieldInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: FieldListInstanceEachOptions): Unit = js.native
    def each(
      opts: FieldListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FieldInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a field
      *
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def get(sid: String): FieldContext = js.native
    
    /**
      * Retrieve a single target page of FieldInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[FieldPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldPage, Any]): js.Promise[FieldPage] = js.native
    def getPage(targetUrl: String): js.Promise[FieldPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldPage, Any]): js.Promise[FieldPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldPage, Any]): js.Promise[FieldPage] = js.native
    
    /**
      * Lists FieldInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FieldInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldInstance], Any]): js.Promise[js.Array[FieldInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldInstance], Any]
    ): js.Promise[js.Array[FieldInstance]] = js.native
    def list(opts: FieldListInstanceOptions): js.Promise[js.Array[FieldInstance]] = js.native
    def list(
      opts: FieldListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[FieldPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldPage, Any]): js.Promise[FieldPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldPage, Any]): js.Promise[FieldPage] = js.native
    def page(opts: FieldListInstancePageOptions): js.Promise[FieldPage] = js.native
    def page(
      opts: FieldListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldPage, Any]
    ): js.Promise[FieldPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property fieldType - The unique name or sid of the FieldType. It can be any Built-in Field Type or the unique_name or sid of a custom Field Type.
    * @property uniqueName - A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
    */
  trait FieldListInstanceCreateOptions extends StObject {
    
    var fieldType: String
    
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
  trait FieldListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FieldInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  trait FieldListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait FieldListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
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
       with FieldResource
       with TwilioResponsePayload
  object FieldPayload {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      field_type: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      task_sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): FieldPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], field_type = field_type.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldPayload]
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
    
    var assistantSid: js.UndefOr[String] = js.undefined
    
    var taskSid: js.UndefOr[String] = js.undefined
  }
  object FieldSolution {
    
    inline def apply(): FieldSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSidUndefined: Self = StObject.set(x, "taskSid", js.undefined)
    }
  }
}
