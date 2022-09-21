package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTypeMod {
  
  @JSImport("twilio/lib/rest/events/v1/eventType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/events/v1/eventType", "EventTypeContext")
  @js.native
  open class EventTypeContext protected () extends StObject {
    /**
      * Initialize the EventTypeContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param type - A string that uniquely identifies this Event Type.
      */
    def this(version: typings.twilio.eventsV1Mod.^, `type`: String) = this()
    
    /**
      * fetch a EventTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EventTypeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ EventTypeInstance, Any]): js.Promise[EventTypeInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/events/v1/eventType", "EventTypeInstance")
  @js.native
  open class EventTypeInstance protected () extends SerializableClass {
    /**
      * Initialize the EventTypeContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param type - A string that uniquely identifies this Event Type.
      */
    def this(version: typings.twilio.eventsV1Mod.^, payload: EventTypePayload, `type`: String) = this()
    
    /* private */ var _proxy: EventTypeContext = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var description: String = js.native
    
    /**
      * fetch a EventTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EventTypeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EventTypeInstance] = js.native
    
    var links: String = js.native
    
    var schemaId: String = js.native
    
    var `type`: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the EventTypeList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def EventTypeList(version: typings.twilio.eventsV1Mod.^): EventTypeListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("EventTypeList")(version.asInstanceOf[js.Any]).asInstanceOf[EventTypeListInstance]
  
  @JSImport("twilio/lib/rest/events/v1/eventType", "EventTypePage")
  @js.native
  open class EventTypePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.eventsV1Mod.^, EventTypePayload, EventTypeResource, EventTypeInstance] {
    /**
      * Initialize the EventTypePage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.eventsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: EventTypeSolution
    ) = this()
    
    /**
      * Build an instance of EventTypeInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: EventTypePayload): EventTypeInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait EventTypeListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): EventTypeContext = js.native
    
    /**
      * Streams EventTypeInstance records from the API.
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
          /* item */ EventTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ EventTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: EventTypeListInstanceEachOptions): Unit = js.native
    def each(
      opts: EventTypeListInstanceEachOptions,
      callback: js.Function2[
          /* item */ EventTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a event_type
      *
      * @param type - A string that uniquely identifies this Event Type.
      */
    def get(`type`: String): EventTypeContext = js.native
    
    /**
      * Retrieve a single target page of EventTypeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[EventTypePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ EventTypePage, Any]): js.Promise[EventTypePage] = js.native
    def getPage(targetUrl: String): js.Promise[EventTypePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EventTypePage, Any]
    ): js.Promise[EventTypePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EventTypePage, Any]
    ): js.Promise[EventTypePage] = js.native
    
    /**
      * Lists EventTypeInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[EventTypeInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EventTypeInstance], Any]): js.Promise[js.Array[EventTypeInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EventTypeInstance], Any]
    ): js.Promise[js.Array[EventTypeInstance]] = js.native
    def list(opts: EventTypeListInstanceOptions): js.Promise[js.Array[EventTypeInstance]] = js.native
    def list(
      opts: EventTypeListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EventTypeInstance], Any]
    ): js.Promise[js.Array[EventTypeInstance]] = js.native
    
    /**
      * Retrieve a single page of EventTypeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[EventTypePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ EventTypePage, Any]): js.Promise[EventTypePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EventTypePage, Any]): js.Promise[EventTypePage] = js.native
    def page(opts: EventTypeListInstancePageOptions): js.Promise[EventTypePage] = js.native
    def page(
      opts: EventTypeListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EventTypePage, Any]
    ): js.Promise[EventTypePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
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
    * @property schemaId - A string to filter Event Types by schema.
    */
  trait EventTypeListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ EventTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var schemaId: js.UndefOr[String] = js.undefined
  }
  object EventTypeListInstanceEachOptions {
    
    inline def apply(): EventTypeListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventTypeListInstanceEachOptions]
    }
    
    extension [Self <: EventTypeListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ EventTypeInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSchemaId(value: String): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
      
      inline def setSchemaIdUndefined: Self = StObject.set(x, "schemaId", js.undefined)
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
    * @property schemaId - A string to filter Event Types by schema.
    */
  trait EventTypeListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var schemaId: js.UndefOr[String] = js.undefined
  }
  object EventTypeListInstanceOptions {
    
    inline def apply(): EventTypeListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventTypeListInstanceOptions]
    }
    
    extension [Self <: EventTypeListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSchemaId(value: String): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
      
      inline def setSchemaIdUndefined: Self = StObject.set(x, "schemaId", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property schemaId - A string to filter Event Types by schema.
    */
  trait EventTypeListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var schemaId: js.UndefOr[String] = js.undefined
  }
  object EventTypeListInstancePageOptions {
    
    inline def apply(): EventTypeListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventTypeListInstancePageOptions]
    }
    
    extension [Self <: EventTypeListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSchemaId(value: String): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
      
      inline def setSchemaIdUndefined: Self = StObject.set(x, "schemaId", js.undefined)
    }
  }
  
  trait EventTypePayload
    extends StObject
       with EventTypeResource
       with TwilioResponsePayload
  object EventTypePayload {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      schema_id: String,
      `type`: String,
      uri: String,
      url: String
    ): EventTypePayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTypePayload]
    }
  }
  
  trait EventTypeResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var description: String
    
    var links: String
    
    var schema_id: String
    
    var `type`: String
    
    var url: String
  }
  object EventTypeResource {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      links: String,
      schema_id: String,
      `type`: String,
      url: String
    ): EventTypeResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTypeResource]
    }
    
    extension [Self <: EventTypeResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSchema_id(value: String): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventTypeSolution extends StObject
}
