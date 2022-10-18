package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantFieldTypeFieldValueMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType/fieldValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType/fieldValue", "FieldValueContext")
  @js.native
  open class FieldValueContext protected () extends StObject {
    /**
      * Initialize the FieldValueContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The assistant_sid
      * @param fieldTypeSid - The field_type_sid
      * @param sid - The sid
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      assistantSid: String,
      fieldTypeSid: String,
      sid: String
    ) = this()
    
    /**
      * fetch a FieldValueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FieldValueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValueInstance, Any]): js.Promise[FieldValueInstance] = js.native
    
    /**
      * remove a FieldValueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValueInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType/fieldValue", "FieldValueInstance")
  @js.native
  open class FieldValueInstance protected () extends SerializableClass {
    /**
      * Initialize the FieldValueContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The unique ID of the Assistant.
      * @param fieldTypeSid - The unique ID of the Field Type associated with this Field Value.
      * @param sid - The sid
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      payload: FieldValuePayload,
      assistantSid: String,
      fieldTypeSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: FieldValueContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a FieldValueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FieldValueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FieldValueInstance] = js.native
    
    var fieldTypeSid: String = js.native
    
    var language: String = js.native
    
    /**
      * remove a FieldValueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var synonymOf: String = js.native
    
    var url: String = js.native
    
    var value: String = js.native
  }
  
  /**
    * Initialize the FieldValueList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The unique ID of the Assistant.
    * @param fieldTypeSid - The unique ID of the Field Type associated with this Field Value.
    */
  inline def FieldValueList(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String, fieldTypeSid: String): FieldValueListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FieldValueList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any], fieldTypeSid.asInstanceOf[js.Any])).asInstanceOf[FieldValueListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType/fieldValue", "FieldValuePage")
  @js.native
  open class FieldValuePage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewUnderstandMod.^, 
          FieldValuePayload, 
          FieldValueResource, 
          FieldValueInstance
        ] {
    /**
      * Initialize the FieldValuePage
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
      solution: FieldValueSolution
    ) = this()
    
    /**
      * Build an instance of FieldValueInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FieldValuePayload): FieldValueInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait FieldValueListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FieldValueContext = js.native
    
    /**
      * create a FieldValueInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: FieldValueListInstanceCreateOptions): js.Promise[FieldValueInstance] = js.native
    def create(
      opts: FieldValueListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ FieldValueInstance, Any]
    ): js.Promise[FieldValueInstance] = js.native
    
    /**
      * Streams FieldValueInstance records from the API.
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
          /* item */ FieldValueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ FieldValueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: FieldValueListInstanceEachOptions): Unit = js.native
    def each(
      opts: FieldValueListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FieldValueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a field_value
      *
      * @param sid - The sid
      */
    def get(sid: String): FieldValueContext = js.native
    
    /**
      * Retrieve a single target page of FieldValueInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[FieldValuePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValuePage, Any]): js.Promise[FieldValuePage] = js.native
    def getPage(targetUrl: String): js.Promise[FieldValuePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValuePage, Any]
    ): js.Promise[FieldValuePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValuePage, Any]
    ): js.Promise[FieldValuePage] = js.native
    
    /**
      * Lists FieldValueInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FieldValueInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldValueInstance], Any]): js.Promise[js.Array[FieldValueInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldValueInstance], Any]
    ): js.Promise[js.Array[FieldValueInstance]] = js.native
    def list(opts: FieldValueListInstanceOptions): js.Promise[js.Array[FieldValueInstance]] = js.native
    def list(
      opts: FieldValueListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldValueInstance], Any]
    ): js.Promise[js.Array[FieldValueInstance]] = js.native
    
    /**
      * Retrieve a single page of FieldValueInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[FieldValuePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValuePage, Any]): js.Promise[FieldValuePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValuePage, Any]): js.Promise[FieldValuePage] = js.native
    def page(opts: FieldValueListInstancePageOptions): js.Promise[FieldValuePage] = js.native
    def page(
      opts: FieldValueListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValuePage, Any]
    ): js.Promise[FieldValuePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property language - An ISO language-country string of the value.
    * @property synonymOf - A value that indicates this field value is a synonym of. Empty if the value is not a synonym.
    * @property value - A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
    */
  trait FieldValueListInstanceCreateOptions extends StObject {
    
    var language: String
    
    var synonymOf: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object FieldValueListInstanceCreateOptions {
    
    inline def apply(language: String, value: String): FieldValueListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValueListInstanceCreateOptions]
    }
    
    extension [Self <: FieldValueListInstanceCreateOptions](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setSynonymOf(value: String): Self = StObject.set(x, "synonymOf", value.asInstanceOf[js.Any])
      
      inline def setSynonymOfUndefined: Self = StObject.set(x, "synonymOf", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property language - An ISO language-country string of the value. For example: en-US
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
  trait FieldValueListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FieldValueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FieldValueListInstanceEachOptions {
    
    inline def apply(): FieldValueListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldValueListInstanceEachOptions]
    }
    
    extension [Self <: FieldValueListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ FieldValueInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
    * @property language - An ISO language-country string of the value. For example: en-US
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
  trait FieldValueListInstanceOptions extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FieldValueListInstanceOptions {
    
    inline def apply(): FieldValueListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldValueListInstanceOptions]
    }
    
    extension [Self <: FieldValueListInstanceOptions](x: Self) {
      
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
    * @property language - An ISO language-country string of the value. For example: en-US
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait FieldValueListInstancePageOptions extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FieldValueListInstancePageOptions {
    
    inline def apply(): FieldValueListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldValueListInstancePageOptions]
    }
    
    extension [Self <: FieldValueListInstancePageOptions](x: Self) {
      
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
  
  trait FieldValuePayload
    extends StObject
       with FieldValueResource
       with TwilioResponsePayload
  object FieldValuePayload {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      field_type_sid: String,
      first_page_uri: String,
      language: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      synonym_of: String,
      uri: String,
      url: String,
      value: String
    ): FieldValuePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], field_type_sid = field_type_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], synonym_of = synonym_of.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValuePayload]
    }
  }
  
  trait FieldValueResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var field_type_sid: String
    
    var language: String
    
    var sid: String
    
    var synonym_of: String
    
    var url: String
    
    var value: String
  }
  object FieldValueResource {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      field_type_sid: String,
      language: String,
      sid: String,
      synonym_of: String,
      url: String,
      value: String
    ): FieldValueResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], field_type_sid = field_type_sid.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], synonym_of = synonym_of.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValueResource]
    }
    
    extension [Self <: FieldValueResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setField_type_sid(value: String): Self = StObject.set(x, "field_type_sid", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSynonym_of(value: String): Self = StObject.set(x, "synonym_of", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldValueSolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
    
    var fieldTypeSid: js.UndefOr[String] = js.undefined
  }
  object FieldValueSolution {
    
    inline def apply(): FieldValueSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldValueSolution]
    }
    
    extension [Self <: FieldValueSolution](x: Self) {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
      
      inline def setFieldTypeSid(value: String): Self = StObject.set(x, "fieldTypeSid", value.asInstanceOf[js.Any])
      
      inline def setFieldTypeSidUndefined: Self = StObject.set(x, "fieldTypeSid", js.undefined)
    }
  }
}
