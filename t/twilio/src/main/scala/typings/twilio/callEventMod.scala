package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callEventMod {
  
  @JSImport("twilio/lib/rest/insights/v1/call/event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/call/event", "EventInstance")
  @js.native
  open class EventInstance protected () extends SerializableClass {
    /**
      * Initialize the EventContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param callSid - The call_sid
      */
    def this(version: typings.twilio.insightsV1Mod.^, payload: EventPayload, callSid: String) = this()
    
    var accountSid: String = js.native
    
    var callSid: String = js.native
    
    var carrierEdge: Any = js.native
    
    var clientEdge: Any = js.native
    
    var edge: EventTwilioEdge = js.native
    
    var group: String = js.native
    
    var level: EventLevel = js.native
    
    var name: String = js.native
    
    var sdkEdge: Any = js.native
    
    var sipEdge: Any = js.native
    
    var timestamp: String = js.native
  }
  
  /**
    * Initialize the EventList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param callSid - The call_sid
    */
  inline def EventList(version: typings.twilio.insightsV1Mod.^, callSid: String): EventListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("EventList")(version.asInstanceOf[js.Any], callSid.asInstanceOf[js.Any])).asInstanceOf[EventListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/call/event", "EventPage")
  @js.native
  open class EventPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.insightsV1Mod.^, EventPayload, EventResource, EventInstance] {
    /**
      * Initialize the EventPage
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
      version: typings.twilio.insightsV1Mod.^,
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.UNKNOWN
    - typings.twilio.twilioStrings.DEBUG
    - typings.twilio.twilioStrings.INFO
    - typings.twilio.twilioStrings.WARNING
    - typings.twilio.twilioStrings.ERROR
  */
  trait EventLevel extends StObject
  object EventLevel {
    
    inline def DEBUG: typings.twilio.twilioStrings.DEBUG = "DEBUG".asInstanceOf[typings.twilio.twilioStrings.DEBUG]
    
    inline def ERROR: typings.twilio.twilioStrings.ERROR = "ERROR".asInstanceOf[typings.twilio.twilioStrings.ERROR]
    
    inline def INFO: typings.twilio.twilioStrings.INFO = "INFO".asInstanceOf[typings.twilio.twilioStrings.INFO]
    
    inline def UNKNOWN: typings.twilio.twilioStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.twilio.twilioStrings.UNKNOWN]
    
    inline def WARNING: typings.twilio.twilioStrings.WARNING = "WARNING".asInstanceOf[typings.twilio.twilioStrings.WARNING]
  }
  
  @js.native
  trait EventListInstance extends StObject {
    
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
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property edge - The edge
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
  trait EventListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ EventInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var edge: js.UndefOr[EventTwilioEdge] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EventListInstanceEachOptions {
    
    inline def apply(): EventListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListInstanceEachOptions]
    }
    
    extension [Self <: EventListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ EventInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEdge(value: EventTwilioEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property edge - The edge
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
  trait EventListInstanceOptions extends StObject {
    
    var edge: js.UndefOr[EventTwilioEdge] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EventListInstanceOptions {
    
    inline def apply(): EventListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListInstanceOptions]
    }
    
    extension [Self <: EventListInstanceOptions](x: Self) {
      
      inline def setEdge(value: EventTwilioEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property edge - The edge
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait EventListInstancePageOptions extends StObject {
    
    var edge: js.UndefOr[EventTwilioEdge] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object EventListInstancePageOptions {
    
    inline def apply(): EventListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListInstancePageOptions]
    }
    
    extension [Self <: EventListInstancePageOptions](x: Self) {
      
      inline def setEdge(value: EventTwilioEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait EventPayload
    extends StObject
       with EventResource
       with TwilioResponsePayload
  object EventPayload {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      carrier_edge: js.Object,
      client_edge: js.Object,
      edge: EventTwilioEdge,
      first_page_uri: String,
      group: String,
      level: EventLevel,
      name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sdk_edge: js.Object,
      sip_edge: js.Object,
      timestamp: String,
      uri: String
    ): EventPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], carrier_edge = carrier_edge.asInstanceOf[js.Any], client_edge = client_edge.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sdk_edge = sdk_edge.asInstanceOf[js.Any], sip_edge = sip_edge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPayload]
    }
  }
  
  trait EventResource extends StObject {
    
    var account_sid: String
    
    var call_sid: String
    
    var carrier_edge: js.Object
    
    var client_edge: js.Object
    
    var edge: EventTwilioEdge
    
    var group: String
    
    var level: EventLevel
    
    var name: String
    
    var sdk_edge: js.Object
    
    var sip_edge: js.Object
    
    var timestamp: String
  }
  object EventResource {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      carrier_edge: js.Object,
      client_edge: js.Object,
      edge: EventTwilioEdge,
      group: String,
      level: EventLevel,
      name: String,
      sdk_edge: js.Object,
      sip_edge: js.Object,
      timestamp: String
    ): EventResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], carrier_edge = carrier_edge.asInstanceOf[js.Any], client_edge = client_edge.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sdk_edge = sdk_edge.asInstanceOf[js.Any], sip_edge = sip_edge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventResource]
    }
    
    extension [Self <: EventResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setCarrier_edge(value: js.Object): Self = StObject.set(x, "carrier_edge", value.asInstanceOf[js.Any])
      
      inline def setClient_edge(value: js.Object): Self = StObject.set(x, "client_edge", value.asInstanceOf[js.Any])
      
      inline def setEdge(value: EventTwilioEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: EventLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSdk_edge(value: js.Object): Self = StObject.set(x, "sdk_edge", value.asInstanceOf[js.Any])
      
      inline def setSip_edge(value: js.Object): Self = StObject.set(x, "sip_edge", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventSolution extends StObject {
    
    var callSid: js.UndefOr[String] = js.undefined
  }
  object EventSolution {
    
    inline def apply(): EventSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventSolution]
    }
    
    extension [Self <: EventSolution](x: Self) {
      
      inline def setCallSid(value: String): Self = StObject.set(x, "callSid", value.asInstanceOf[js.Any])
      
      inline def setCallSidUndefined: Self = StObject.set(x, "callSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.unknown_edge
    - typings.twilio.twilioStrings.carrier_edge
    - typings.twilio.twilioStrings.sip_edge
    - typings.twilio.twilioStrings.sdk_edge
    - typings.twilio.twilioStrings.client_edge
  */
  trait EventTwilioEdge extends StObject
  object EventTwilioEdge {
    
    inline def carrier_edge: typings.twilio.twilioStrings.carrier_edge = "carrier_edge".asInstanceOf[typings.twilio.twilioStrings.carrier_edge]
    
    inline def client_edge: typings.twilio.twilioStrings.client_edge = "client_edge".asInstanceOf[typings.twilio.twilioStrings.client_edge]
    
    inline def sdk_edge: typings.twilio.twilioStrings.sdk_edge = "sdk_edge".asInstanceOf[typings.twilio.twilioStrings.sdk_edge]
    
    inline def sip_edge: typings.twilio.twilioStrings.sip_edge = "sip_edge".asInstanceOf[typings.twilio.twilioStrings.sip_edge]
    
    inline def unknown_edge: typings.twilio.twilioStrings.unknown_edge = "unknown_edge".asInstanceOf[typings.twilio.twilioStrings.unknown_edge]
  }
}
