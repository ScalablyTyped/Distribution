package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/event", "EventInstance")
  @js.native
  open class EventInstance protected () extends SerializableClass {
    /**
      * Initialize the EventContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created this resource
      * @param callSid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: EventPayload, accountSid: String, callSid: String) = this()
    
    var request: Any = js.native
    
    var response: Any = js.native
  }
  
  /**
    * Initialize the EventList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created this resource
    * @param callSid - The unique string that identifies this resource
    */
  inline def EventList(version: typings.twilio.v2010Mod.^, accountSid: String, callSid: String): EventListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("EventList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], callSid.asInstanceOf[js.Any])).asInstanceOf[EventListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/event", "EventPage")
  @js.native
  open class EventPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, EventPayload, EventResource, EventInstance] {
    /**
      * Initialize the EventPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
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
  trait EventListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EventListInstanceOptions {
    
    inline def apply(): EventListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListInstanceOptions]
    }
    
    extension [Self <: EventListInstanceOptions](x: Self) {
      
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
  trait EventListInstancePageOptions extends StObject {
    
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
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      request: js.Object,
      response: js.Object,
      uri: String
    ): EventPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPayload]
    }
  }
  
  trait EventResource extends StObject {
    
    var request: js.Object
    
    var response: js.Object
  }
  object EventResource {
    
    inline def apply(request: js.Object, response: js.Object): EventResource = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventResource]
    }
    
    extension [Self <: EventResource](x: Self) {
      
      inline def setRequest(value: js.Object): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: js.Object): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var callSid: js.UndefOr[String] = js.undefined
  }
  object EventSolution {
    
    inline def apply(): EventSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventSolution]
    }
    
    extension [Self <: EventSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setCallSid(value: String): Self = StObject.set(x, "callSid", value.asInstanceOf[js.Any])
      
      inline def setCallSidUndefined: Self = StObject.set(x, "callSid", js.undefined)
    }
  }
}
