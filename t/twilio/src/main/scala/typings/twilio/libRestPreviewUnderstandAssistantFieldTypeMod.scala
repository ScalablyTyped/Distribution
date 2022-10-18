package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import typings.twilio.libRestPreviewUnderstandAssistantFieldTypeFieldValueMod.FieldValueContext
import typings.twilio.libRestPreviewUnderstandAssistantFieldTypeFieldValueMod.FieldValueListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantFieldTypeMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType", "FieldTypeContext")
  @js.native
  open class FieldTypeContext protected () extends StObject {
    /**
      * Initialize the FieldTypeContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The assistant_sid
      * @param sid - The sid
      */
    def this(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String, sid: String) = this()
    
    /**
      * fetch a FieldTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FieldTypeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypeInstance, Any]): js.Promise[FieldTypeInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def fieldValues(sid: String): FieldValueContext = js.native
    @JSName("fieldValues")
    var fieldValues_Original: FieldValueListInstance = js.native
    
    /**
      * remove a FieldTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypeInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a FieldTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[FieldTypeInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypeInstance, Any]): js.Promise[FieldTypeInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypeInstance, Any]
    ): js.Promise[FieldTypeInstance] = js.native
    def update(opts: FieldTypeInstanceUpdateOptions): js.Promise[FieldTypeInstance] = js.native
    def update(
      opts: FieldTypeInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypeInstance, Any]
    ): js.Promise[FieldTypeInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType", "FieldTypeInstance")
  @js.native
  open class FieldTypeInstance protected () extends SerializableClass {
    /**
      * Initialize the FieldTypeContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The unique ID of the Assistant.
      * @param sid - The sid
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      payload: FieldTypePayload,
      assistantSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: FieldTypeContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a FieldTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FieldTypeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FieldTypeInstance] = js.native
    
    /**
      * Access the fieldValues
      */
    def fieldValues(): FieldValueListInstance = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * remove a FieldTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a FieldTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[FieldTypeInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FieldTypeInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FieldTypeInstance] = js.native
    def update(opts: FieldTypeInstanceUpdateOptions): js.Promise[FieldTypeInstance] = js.native
    def update(
      opts: FieldTypeInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[FieldTypeInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the FieldTypeList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The unique ID of the Assistant.
    */
  inline def FieldTypeList(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String): FieldTypeListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FieldTypeList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any])).asInstanceOf[FieldTypeListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/fieldType", "FieldTypePage")
  @js.native
  open class FieldTypePage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewUnderstandMod.^, 
          FieldTypePayload, 
          FieldTypeResource, 
          FieldTypeInstance
        ] {
    /**
      * Initialize the FieldTypePage
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
      solution: FieldTypeSolution
    ) = this()
    
    /**
      * Build an instance of FieldTypeInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FieldTypePayload): FieldTypeInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - A user-provided string that identifies this resource. It is non-unique and can up to 255 characters long.
    * @property uniqueName - A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
    */
  trait FieldTypeInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object FieldTypeInstanceUpdateOptions {
    
    inline def apply(): FieldTypeInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldTypeInstanceUpdateOptions]
    }
    
    extension [Self <: FieldTypeInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait FieldTypeListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FieldTypeContext = js.native
    
    /**
      * create a FieldTypeInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: FieldTypeListInstanceCreateOptions): js.Promise[FieldTypeInstance] = js.native
    def create(
      opts: FieldTypeListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ FieldTypeInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ FieldTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ FieldTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: FieldTypeListInstanceEachOptions): Unit = js.native
    def each(
      opts: FieldTypeListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FieldTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a field_type
      *
      * @param sid - The sid
      */
    def get(sid: String): FieldTypeContext = js.native
    
    /**
      * Retrieve a single target page of FieldTypeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[FieldTypePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypePage, Any]): js.Promise[FieldTypePage] = js.native
    def getPage(targetUrl: String): js.Promise[FieldTypePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypePage, Any]
    ): js.Promise[FieldTypePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypePage, Any]
    ): js.Promise[FieldTypePage] = js.native
    
    /**
      * Lists FieldTypeInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FieldTypeInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldTypeInstance], Any]): js.Promise[js.Array[FieldTypeInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FieldTypeInstance], Any]
    ): js.Promise[js.Array[FieldTypeInstance]] = js.native
    def list(opts: FieldTypeListInstanceOptions): js.Promise[js.Array[FieldTypeInstance]] = js.native
    def list(
      opts: FieldTypeListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[FieldTypePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypePage, Any]): js.Promise[FieldTypePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypePage, Any]): js.Promise[FieldTypePage] = js.native
    def page(opts: FieldTypeListInstancePageOptions): js.Promise[FieldTypePage] = js.native
    def page(
      opts: FieldTypeListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FieldTypePage, Any]
    ): js.Promise[FieldTypePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - A user-provided string that identifies this resource. It is non-unique and can up to 255 characters long.
    * @property uniqueName - A user-provided string that uniquely identifies this resource as an alternative to the sid. Unique up to 64 characters long.
    */
  trait FieldTypeListInstanceCreateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var uniqueName: String
  }
  object FieldTypeListInstanceCreateOptions {
    
    inline def apply(uniqueName: String): FieldTypeListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldTypeListInstanceCreateOptions]
    }
    
    extension [Self <: FieldTypeListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
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
  trait FieldTypeListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FieldTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FieldTypeListInstanceEachOptions {
    
    inline def apply(): FieldTypeListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldTypeListInstanceEachOptions]
    }
    
    extension [Self <: FieldTypeListInstanceEachOptions](x: Self) {
      
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
  trait FieldTypeListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FieldTypeListInstanceOptions {
    
    inline def apply(): FieldTypeListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldTypeListInstanceOptions]
    }
    
    extension [Self <: FieldTypeListInstanceOptions](x: Self) {
      
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
  trait FieldTypeListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FieldTypeListInstancePageOptions {
    
    inline def apply(): FieldTypeListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldTypeListInstancePageOptions]
    }
    
    extension [Self <: FieldTypeListInstancePageOptions](x: Self) {
      
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
       with FieldTypeResource
       with TwilioResponsePayload
  object FieldTypePayload {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): FieldTypePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldTypePayload]
    }
  }
  
  trait FieldTypeResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
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
      links: String,
      sid: String,
      unique_name: String,
      url: String
    ): FieldTypeResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldTypeResource]
    }
    
    extension [Self <: FieldTypeResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldTypeSolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
  }
  object FieldTypeSolution {
    
    inline def apply(): FieldTypeSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldTypeSolution]
    }
    
    extension [Self <: FieldTypeSolution](x: Self) {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
    }
  }
}
