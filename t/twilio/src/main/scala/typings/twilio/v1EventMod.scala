package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1EventMod {
  
  @JSImport("twilio/lib/rest/monitor/v1/event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/monitor/v1/event", "EventContext")
  @js.native
  open class EventContext protected () extends StObject {
    /**
      * Initialize the EventContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.monitorV1Mod.^, sid: String) = this()
    
    /**
      * fetch a EventInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EventInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ EventInstance, Any]): js.Promise[EventInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/monitor/v1/event", "EventInstance")
  @js.native
  open class EventInstance protected () extends SerializableClass {
    /**
      * Initialize the EventContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.monitorV1Mod.^, payload: EventPayload, sid: String) = this()
    
    /* private */ var _proxy: EventContext = js.native
    
    var accountSid: String = js.native
    
    var actorSid: String = js.native
    
    var actorType: String = js.native
    
    var description: String = js.native
    
    var eventData: Any = js.native
    
    var eventDate: js.Date = js.native
    
    var eventType: String = js.native
    
    /**
      * fetch a EventInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EventInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EventInstance] = js.native
    
    var links: String = js.native
    
    var resourceSid: String = js.native
    
    var resourceType: String = js.native
    
    var sid: String = js.native
    
    var source: String = js.native
    
    var sourceIpAddress: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the EventList
    *
    * @param version - Version of the resource
    */
  inline def EventList(version: typings.twilio.monitorV1Mod.^): EventListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("EventList")(version.asInstanceOf[js.Any]).asInstanceOf[EventListInstance]
  
  @JSImport("twilio/lib/rest/monitor/v1/event", "EventPage")
  @js.native
  open class EventPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.monitorV1Mod.^, EventPayload, EventResource, EventInstance] {
    /**
      * Initialize the EventPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.monitorV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: EventSolution
    ) = this()
    
    /**
      * Build an instance of EventInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: EventPayload): EventInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait EventListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): EventContext = js.native
    
    /**
      * Streams EventInstance records from the API.
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
          /* item */ EventInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ EventInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: EventListInstanceEachOptions): Unit = js.native
    def each(
      opts: EventListInstanceEachOptions,
      callback: js.Function2[
          /* item */ EventInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a event
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): EventContext = js.native
    
    /**
      * Retrieve a single target page of EventInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[EventPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ EventPage, Any]): js.Promise[EventPage] = js.native
    def getPage(targetUrl: String): js.Promise[EventPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ EventPage, Any]): js.Promise[EventPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EventPage, Any]): js.Promise[EventPage] = js.native
    
    /**
      * Lists EventInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[EventInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EventInstance], Any]): js.Promise[js.Array[EventInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EventInstance], Any]
    ): js.Promise[js.Array[EventInstance]] = js.native
    def list(opts: EventListInstanceOptions): js.Promise[js.Array[EventInstance]] = js.native
    def list(
      opts: EventListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EventInstance], Any]
    ): js.Promise[js.Array[EventInstance]] = js.native
    
    /**
      * Retrieve a single page of EventInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[EventPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ EventPage, Any]): js.Promise[EventPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EventPage, Any]): js.Promise[EventPage] = js.native
    def page(opts: EventListInstancePageOptions): js.Promise[EventPage] = js.native
    def page(
      opts: EventListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EventPage, Any]
    ): js.Promise[EventPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to each
    *
    * @property actorSid - Only include events initiated by this Actor
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property endDate - Only include events that occurred on or before this date
    * @property eventType - Only include events of this Event Type
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
    * @property resourceSid - Only include events that refer to this resource
    * @property sourceIpAddress - Only include events that originated from this IP address
    * @property startDate - Only include events that occurred on or after this date
    */
  trait EventListInstanceEachOptions extends StObject {
    
    var actorSid: js.UndefOr[String] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ EventInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var eventType: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var resourceSid: js.UndefOr[String] = js.undefined
    
    var sourceIpAddress: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object EventListInstanceEachOptions {
    
    inline def apply(): EventListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListInstanceEachOptions]
    }
    
    extension [Self <: EventListInstanceEachOptions](x: Self) {
      
      inline def setActorSid(value: String): Self = StObject.set(x, "actorSid", value.asInstanceOf[js.Any])
      
      inline def setActorSidUndefined: Self = StObject.set(x, "actorSid", js.undefined)
      
      inline def setCallback(
        value: (/* item */ EventInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setResourceSid(value: String): Self = StObject.set(x, "resourceSid", value.asInstanceOf[js.Any])
      
      inline def setResourceSidUndefined: Self = StObject.set(x, "resourceSid", js.undefined)
      
      inline def setSourceIpAddress(value: String): Self = StObject.set(x, "sourceIpAddress", value.asInstanceOf[js.Any])
      
      inline def setSourceIpAddressUndefined: Self = StObject.set(x, "sourceIpAddress", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property actorSid - Only include events initiated by this Actor
    * @property endDate - Only include events that occurred on or before this date
    * @property eventType - Only include events of this Event Type
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
    * @property resourceSid - Only include events that refer to this resource
    * @property sourceIpAddress - Only include events that originated from this IP address
    * @property startDate - Only include events that occurred on or after this date
    */
  trait EventListInstanceOptions extends StObject {
    
    var actorSid: js.UndefOr[String] = js.undefined
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var eventType: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var resourceSid: js.UndefOr[String] = js.undefined
    
    var sourceIpAddress: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object EventListInstanceOptions {
    
    inline def apply(): EventListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListInstanceOptions]
    }
    
    extension [Self <: EventListInstanceOptions](x: Self) {
      
      inline def setActorSid(value: String): Self = StObject.set(x, "actorSid", value.asInstanceOf[js.Any])
      
      inline def setActorSidUndefined: Self = StObject.set(x, "actorSid", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setResourceSid(value: String): Self = StObject.set(x, "resourceSid", value.asInstanceOf[js.Any])
      
      inline def setResourceSidUndefined: Self = StObject.set(x, "resourceSid", js.undefined)
      
      inline def setSourceIpAddress(value: String): Self = StObject.set(x, "sourceIpAddress", value.asInstanceOf[js.Any])
      
      inline def setSourceIpAddressUndefined: Self = StObject.set(x, "sourceIpAddress", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property actorSid - Only include events initiated by this Actor
    * @property endDate - Only include events that occurred on or before this date
    * @property eventType - Only include events of this Event Type
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property resourceSid - Only include events that refer to this resource
    * @property sourceIpAddress - Only include events that originated from this IP address
    * @property startDate - Only include events that occurred on or after this date
    */
  trait EventListInstancePageOptions extends StObject {
    
    var actorSid: js.UndefOr[String] = js.undefined
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var eventType: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var resourceSid: js.UndefOr[String] = js.undefined
    
    var sourceIpAddress: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object EventListInstancePageOptions {
    
    inline def apply(): EventListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListInstancePageOptions]
    }
    
    extension [Self <: EventListInstancePageOptions](x: Self) {
      
      inline def setActorSid(value: String): Self = StObject.set(x, "actorSid", value.asInstanceOf[js.Any])
      
      inline def setActorSidUndefined: Self = StObject.set(x, "actorSid", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setResourceSid(value: String): Self = StObject.set(x, "resourceSid", value.asInstanceOf[js.Any])
      
      inline def setResourceSidUndefined: Self = StObject.set(x, "resourceSid", js.undefined)
      
      inline def setSourceIpAddress(value: String): Self = StObject.set(x, "sourceIpAddress", value.asInstanceOf[js.Any])
      
      inline def setSourceIpAddressUndefined: Self = StObject.set(x, "sourceIpAddress", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait EventPayload
    extends StObject
       with EventResource
       with TwilioResponsePayload
  object EventPayload {
    
    inline def apply(
      account_sid: String,
      actor_sid: String,
      actor_type: String,
      description: String,
      event_data: js.Object,
      event_date: js.Date,
      event_type: String,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      resource_sid: String,
      resource_type: String,
      sid: String,
      source: String,
      source_ip_address: String,
      uri: String,
      url: String
    ): EventPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], actor_sid = actor_sid.asInstanceOf[js.Any], actor_type = actor_type.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], event_data = event_data.asInstanceOf[js.Any], event_date = event_date.asInstanceOf[js.Any], event_type = event_type.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], resource_sid = resource_sid.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], source_ip_address = source_ip_address.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPayload]
    }
  }
  
  trait EventResource extends StObject {
    
    var account_sid: String
    
    var actor_sid: String
    
    var actor_type: String
    
    var description: String
    
    var event_data: js.Object
    
    var event_date: js.Date
    
    var event_type: String
    
    var links: String
    
    var resource_sid: String
    
    var resource_type: String
    
    var sid: String
    
    var source: String
    
    var source_ip_address: String
    
    var url: String
  }
  object EventResource {
    
    inline def apply(
      account_sid: String,
      actor_sid: String,
      actor_type: String,
      description: String,
      event_data: js.Object,
      event_date: js.Date,
      event_type: String,
      links: String,
      resource_sid: String,
      resource_type: String,
      sid: String,
      source: String,
      source_ip_address: String,
      url: String
    ): EventResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], actor_sid = actor_sid.asInstanceOf[js.Any], actor_type = actor_type.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], event_data = event_data.asInstanceOf[js.Any], event_date = event_date.asInstanceOf[js.Any], event_type = event_type.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], resource_sid = resource_sid.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], source_ip_address = source_ip_address.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventResource]
    }
    
    extension [Self <: EventResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setActor_sid(value: String): Self = StObject.set(x, "actor_sid", value.asInstanceOf[js.Any])
      
      inline def setActor_type(value: String): Self = StObject.set(x, "actor_type", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEvent_data(value: js.Object): Self = StObject.set(x, "event_data", value.asInstanceOf[js.Any])
      
      inline def setEvent_date(value: js.Date): Self = StObject.set(x, "event_date", value.asInstanceOf[js.Any])
      
      inline def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setResource_sid(value: String): Self = StObject.set(x, "resource_sid", value.asInstanceOf[js.Any])
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSource_ip_address(value: String): Self = StObject.set(x, "source_ip_address", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventSolution extends StObject
}
