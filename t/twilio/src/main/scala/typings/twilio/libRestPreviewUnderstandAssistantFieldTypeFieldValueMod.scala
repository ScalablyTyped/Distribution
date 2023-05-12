package typings.twilio

import typings.twilio.anon.FieldTypeSid
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantFieldTypeFieldValueMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType/fieldValue", "FieldValueContextImpl")
  @js.native
  open class FieldValueContextImpl protected ()
    extends StObject
       with FieldValueContext {
    def this(_version: default, assistantSid: String, fieldTypeSid: String, sid: String) = this()
    
    /* protected */ var _solution: FieldValueContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType/fieldValue", "FieldValueInstance")
  @js.native
  open class FieldValueInstance protected () extends StObject {
    def this(_version: default, payload: FieldValueResource, assistantSid: String, fieldTypeSid: String) = this()
    def this(
      _version: default,
      payload: FieldValueResource,
      assistantSid: String,
      fieldTypeSid: String,
      sid: String
    ) = this()
    
    /* protected */ var _context: js.UndefOr[FieldValueContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: FieldValueContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Field Value.
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
      * Fetch a FieldValueInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldValueInstance
      */
    def fetch(): js.Promise[FieldValueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[FieldValueInstance] = js.native
    
    /**
      * The unique ID of the Field Type associated with this Field Value.
      */
    var fieldTypeSid: String = js.native
    
    /**
      * An ISO language-country string of the value.
      */
    var language: String = js.native
    
    /**
      * Remove a FieldValueInstance
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
      * A value that indicates this field value is a synonym of. Empty if the value is not a synonym.
      */
    var synonymOf: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): FieldTypeSid = js.native
    
    var url: String = js.native
    
    /**
      * The Field Value itself.
      */
    var value: String = js.native
  }
  
  @js.native
  trait FieldValueListInstance extends StObject {
    
    def apply(sid: String): FieldValueContext = js.native
    
    var _solution: FieldValueSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a FieldValueInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldValueInstance
      */
    def create(params: FieldValueListInstanceCreateOptions): js.Promise[FieldValueInstance] = js.native
    def create(
      params: FieldValueListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldValueInstance], Any]
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
      * @param { FieldValueListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ FieldValueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: FieldValueListInstanceEachOptions): Unit = js.native
    def each(
      params: FieldValueListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FieldValueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): FieldValueContext = js.native
    
    /**
      * Retrieve a single target page of FieldValueInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[FieldValuePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValuePage, Any]
    ): js.Promise[FieldValuePage] = js.native
    
    /**
      * Lists FieldValueInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { FieldValueListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FieldValueInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldValueInstance], Any]): js.Promise[js.Array[FieldValueInstance]] = js.native
    def list(params: FieldValueListInstanceOptions): js.Promise[js.Array[FieldValueInstance]] = js.native
    def list(
      params: FieldValueListInstanceOptions,
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
      * @param { FieldValueListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[FieldValuePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValuePage, Any]): js.Promise[FieldValuePage] = js.native
    def page(params: FieldValueListInstancePageOptions): js.Promise[FieldValuePage] = js.native
    def page(
      params: FieldValueListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldValuePage, Any]
    ): js.Promise[FieldValuePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object FieldValueListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType/fieldValue", "FieldValueListInstance")
    @js.native
    def apply(version: default, assistantSid: String, fieldTypeSid: String): FieldValueListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType/fieldValue", "FieldValuePage")
  @js.native
  open class FieldValuePage protected ()
    extends typings.twilio.libBasePageMod.default[default, FieldValuePayload, FieldValueResource, FieldValueInstance] {
    /**
      * Initialize the FieldValuePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: FieldValueSolution
    ) = this()
    
    /**
      * Build an instance of FieldValueInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FieldValueResource): FieldValueInstance = js.native
  }
  
  @js.native
  trait FieldValueContext extends StObject {
    
    /**
      * Fetch a FieldValueInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldValueInstance
      */
    def fetch(): js.Promise[FieldValueInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldValueInstance], Any]
    ): js.Promise[FieldValueInstance] = js.native
    
    /**
      * Remove a FieldValueInstance
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
  
  trait FieldValueContextSolution extends StObject {
    
    var assistantSid: String
    
    var fieldTypeSid: String
    
    var sid: String
  }
  object FieldValueContextSolution {
    
    inline def apply(assistantSid: String, fieldTypeSid: String, sid: String): FieldValueContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], fieldTypeSid = fieldTypeSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValueContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldValueContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setFieldTypeSid(value: String): Self = StObject.set(x, "fieldTypeSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldValueListInstanceCreateOptions extends StObject {
    
    /** An ISO language-country string of the value. */
    var language: String
    
    /** A value that indicates this field value is a synonym of. Empty if the value is not a synonym. */
    var synonymOf: js.UndefOr[String] = js.undefined
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. */
    var value: String
  }
  object FieldValueListInstanceCreateOptions {
    
    inline def apply(language: String, value: String): FieldValueListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValueListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldValueListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setSynonymOf(value: String): Self = StObject.set(x, "synonymOf", value.asInstanceOf[js.Any])
      
      inline def setSynonymOfUndefined: Self = StObject.set(x, "synonymOf", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldValueListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FieldValueInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** An ISO language-country string of the value. For example: *en-US* */
    var language: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FieldValueListInstanceEachOptions {
    
    inline def apply(): FieldValueListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldValueListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldValueListInstanceEachOptions] (val x: Self) extends AnyVal {
      
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
  
  trait FieldValueListInstanceOptions extends StObject {
    
    /** An ISO language-country string of the value. For example: *en-US* */
    var language: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FieldValueListInstanceOptions {
    
    inline def apply(): FieldValueListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldValueListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldValueListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait FieldValueListInstancePageOptions extends StObject {
    
    /** An ISO language-country string of the value. For example: *en-US* */
    var language: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FieldValueListInstancePageOptions {
    
    inline def apply(): FieldValueListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldValueListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldValueListInstancePageOptions] (val x: Self) extends AnyVal {
      
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
       with TwilioResponsePayload {
    
    var field_values: js.Array[FieldValueResource]
  }
  object FieldValuePayload {
    
    inline def apply(
      field_values: js.Array[FieldValueResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): FieldValuePayload = {
      val __obj = js.Dynamic.literal(field_values = field_values.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValuePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldValuePayload] (val x: Self) extends AnyVal {
      
      inline def setField_values(value: js.Array[FieldValueResource]): Self = StObject.set(x, "field_values", value.asInstanceOf[js.Any])
      
      inline def setField_valuesVarargs(value: FieldValueResource*): Self = StObject.set(x, "field_values", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldValueResource] (val x: Self) extends AnyVal {
      
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
    
    var assistantSid: String
    
    var fieldTypeSid: String
  }
  object FieldValueSolution {
    
    inline def apply(assistantSid: String, fieldTypeSid: String): FieldValueSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], fieldTypeSid = fieldTypeSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValueSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldValueSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setFieldTypeSid(value: String): Self = StObject.set(x, "fieldTypeSid", value.asInstanceOf[js.Any])
    }
  }
}
