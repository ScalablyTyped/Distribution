package typings.twilio

import typings.std.Record
import typings.twilio.anon.FriendlyName
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewUnderstandAssistantFieldTypeFieldValueMod.FieldValueContext
import typings.twilio.libRestPreviewUnderstandAssistantFieldTypeFieldValueMod.FieldValueListInstance
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantFieldTypeMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType", "FieldTypeContextImpl")
  @js.native
  open class FieldTypeContextImpl protected ()
    extends StObject
       with FieldTypeContext {
    def this(_version: default, assistantSid: String, sid: String) = this()
    
    /* protected */ var _fieldValues: js.UndefOr[FieldValueListInstance] = js.native
    
    /* protected */ var _solution: FieldTypeContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def fieldValues: FieldValueListInstance = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldTypeInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldTypeInstance], Any]
    ): js.Promise[FieldTypeInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldTypeInstance], Any]
    ): js.Promise[FieldTypeInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType", "FieldTypeInstance")
  @js.native
  open class FieldTypeInstance protected () extends StObject {
    def this(_version: default, payload: FieldTypeResource, assistantSid: String) = this()
    def this(_version: default, payload: FieldTypeResource, assistantSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[FieldTypeContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: FieldTypeContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Field Type.
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
      * Fetch a FieldTypeInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldTypeInstance
      */
    def fetch(): js.Promise[FieldTypeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[FieldTypeInstance] = js.native
    
    /**
      * Access the fieldValues.
      */
    def fieldValues(): FieldValueListInstance = js.native
    
    /**
      * A user-provided string that identifies this resource. It is non-unique and can up to 255 characters long.
      */
    var friendlyName: String = js.native
    
    var links: Record[String, String] = js.native
    
    /**
      * Remove a FieldTypeInstance
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
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): FriendlyName = js.native
    
    /**
      * A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
      */
    var uniqueName: String = js.native
    
    /**
      * Update a FieldTypeInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldTypeInstance
      */
    def update(): js.Promise[FieldTypeInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[FieldTypeInstance] = js.native
    /**
      * Update a FieldTypeInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldTypeInstance
      */
    def update(params: FieldTypeContextUpdateOptions): js.Promise[FieldTypeInstance] = js.native
    def update(
      params: FieldTypeContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[FieldTypeInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait FieldTypeListInstance extends StObject {
    
    def apply(sid: String): FieldTypeContext = js.native
    
    var _solution: FieldTypeSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a FieldTypeInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldTypeInstance
      */
    def create(params: FieldTypeListInstanceCreateOptions): js.Promise[FieldTypeInstance] = js.native
    def create(
      params: FieldTypeListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldTypeInstance], Any]
    ): js.Promise[FieldTypeInstance] = js.native
    
    /**
      * Streams FieldTypeInstance records from the API.
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
      * @param { FieldTypeListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ FieldTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: FieldTypeListInstanceEachOptions): Unit = js.native
    def each(
      params: FieldTypeListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FieldTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): FieldTypeContext = js.native
    
    /**
      * Retrieve a single target page of FieldTypeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[FieldTypePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypePage, Any]
    ): js.Promise[FieldTypePage] = js.native
    
    /**
      * Lists FieldTypeInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { FieldTypeListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FieldTypeInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldTypeInstance], Any]): js.Promise[js.Array[FieldTypeInstance]] = js.native
    def list(params: FieldTypeListInstanceOptions): js.Promise[js.Array[FieldTypeInstance]] = js.native
    def list(
      params: FieldTypeListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldTypeInstance], Any]
    ): js.Promise[js.Array[FieldTypeInstance]] = js.native
    
    /**
      * Retrieve a single page of FieldTypeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { FieldTypeListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[FieldTypePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypePage, Any]): js.Promise[FieldTypePage] = js.native
    def page(params: FieldTypeListInstancePageOptions): js.Promise[FieldTypePage] = js.native
    def page(
      params: FieldTypeListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypePage, Any]
    ): js.Promise[FieldTypePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object FieldTypeListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType", "FieldTypeListInstance")
    @js.native
    def apply(version: default, assistantSid: String): FieldTypeListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType", "FieldTypePage")
  @js.native
  open class FieldTypePage protected ()
    extends typings.twilio.libBasePageMod.default[default, FieldTypePayload, FieldTypeResource, FieldTypeInstance] {
    /**
      * Initialize the FieldTypePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: FieldTypeSolution
    ) = this()
    
    /**
      * Build an instance of FieldTypeInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FieldTypeResource): FieldTypeInstance = js.native
  }
  
  @js.native
  trait FieldTypeContext extends StObject {
    
    /**
      * Fetch a FieldTypeInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldTypeInstance
      */
    def fetch(): js.Promise[FieldTypeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldTypeInstance], Any]): js.Promise[FieldTypeInstance] = js.native
    
    def fieldValues(sid: String): FieldValueContext = js.native
    @JSName("fieldValues")
    var fieldValues_Original: FieldValueListInstance = js.native
    
    /**
      * Remove a FieldTypeInstance
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
      * Update a FieldTypeInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldTypeInstance
      */
    def update(): js.Promise[FieldTypeInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldTypeInstance], Any]): js.Promise[FieldTypeInstance] = js.native
    /**
      * Update a FieldTypeInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed FieldTypeInstance
      */
    def update(params: FieldTypeContextUpdateOptions): js.Promise[FieldTypeInstance] = js.native
    def update(
      params: FieldTypeContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[FieldTypeInstance], Any]
    ): js.Promise[FieldTypeInstance] = js.native
  }
  
  trait FieldTypeContextSolution extends StObject {
    
    var assistantSid: String
    
    var sid: String
  }
  object FieldTypeContextSolution {
    
    inline def apply(assistantSid: String, sid: String): FieldTypeContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldTypeContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldTypeContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldTypeContextUpdateOptions extends StObject {
    
    /** A user-provided string that identifies this resource. It is non-unique and can up to 255 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object FieldTypeContextUpdateOptions {
    
    inline def apply(): FieldTypeContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldTypeContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldTypeContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait FieldTypeListInstanceCreateOptions extends StObject {
    
    /** A user-provided string that identifies this resource. It is non-unique and can up to 255 characters long. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long. */
    var uniqueName: String
  }
  object FieldTypeListInstanceCreateOptions {
    
    inline def apply(uniqueName: String): FieldTypeListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldTypeListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldTypeListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldTypeListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FieldTypeInstance, 
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
  object FieldTypeListInstanceEachOptions {
    
    inline def apply(): FieldTypeListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldTypeListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldTypeListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ FieldTypeInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait FieldTypeListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FieldTypeListInstanceOptions {
    
    inline def apply(): FieldTypeListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldTypeListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldTypeListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait FieldTypeListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FieldTypeListInstancePageOptions {
    
    inline def apply(): FieldTypeListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldTypeListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldTypeListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait FieldTypePayload
    extends StObject
       with TwilioResponsePayload {
    
    var field_types: js.Array[FieldTypeResource]
  }
  object FieldTypePayload {
    
    inline def apply(
      field_types: js.Array[FieldTypeResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): FieldTypePayload = {
      val __obj = js.Dynamic.literal(field_types = field_types.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldTypePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldTypePayload] (val x: Self) extends AnyVal {
      
      inline def setField_types(value: js.Array[FieldTypeResource]): Self = StObject.set(x, "field_types", value.asInstanceOf[js.Any])
      
      inline def setField_typesVarargs(value: FieldTypeResource*): Self = StObject.set(x, "field_types", js.Array(value*))
    }
  }
  
  trait FieldTypeResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: Record[String, String]
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object FieldTypeResource {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: Record[String, String],
      sid: String,
      unique_name: String,
      url: String
    ): FieldTypeResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldTypeResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldTypeResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldTypeSolution extends StObject {
    
    var assistantSid: String
  }
  object FieldTypeSolution {
    
    inline def apply(assistantSid: String): FieldTypeSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldTypeSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldTypeSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
}
