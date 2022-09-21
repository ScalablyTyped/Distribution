package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricMod {
  
  @JSImport("twilio/lib/rest/insights/v1/call/metric", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/call/metric", "MetricInstance")
  @js.native
  open class MetricInstance protected () extends SerializableClass {
    /**
      * Initialize the MetricContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param callSid - The call_sid
      */
    def this(version: typings.twilio.insightsV1Mod.^, payload: MetricPayload, callSid: String) = this()
    
    var accountSid: String = js.native
    
    var callSid: String = js.native
    
    var carrierEdge: Any = js.native
    
    var clientEdge: Any = js.native
    
    var direction: MetricStreamDirection = js.native
    
    var edge: MetricTwilioEdge = js.native
    
    var sdkEdge: Any = js.native
    
    var sipEdge: Any = js.native
    
    var timestamp: String = js.native
  }
  
  /**
    * Initialize the MetricList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param callSid - The call_sid
    */
  inline def MetricList(version: typings.twilio.insightsV1Mod.^, callSid: String): MetricListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("MetricList")(version.asInstanceOf[js.Any], callSid.asInstanceOf[js.Any])).asInstanceOf[MetricListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/call/metric", "MetricPage")
  @js.native
  open class MetricPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.insightsV1Mod.^, MetricPayload, MetricResource, MetricInstance] {
    /**
      * Initialize the MetricPage
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
      solution: MetricSolution
    ) = this()
    
    /**
      * Build an instance of MetricInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: MetricPayload): MetricInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait MetricListInstance extends StObject {
    
    /**
      * Streams MetricInstance records from the API.
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
          /* item */ MetricInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ MetricInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: MetricListInstanceEachOptions): Unit = js.native
    def each(
      opts: MetricListInstanceEachOptions,
      callback: js.Function2[
          /* item */ MetricInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of MetricInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[MetricPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ MetricPage, Any]): js.Promise[MetricPage] = js.native
    def getPage(targetUrl: String): js.Promise[MetricPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MetricPage, Any]
    ): js.Promise[MetricPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MetricPage, Any]): js.Promise[MetricPage] = js.native
    
    /**
      * Lists MetricInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[MetricInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MetricInstance], Any]): js.Promise[js.Array[MetricInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MetricInstance], Any]
    ): js.Promise[js.Array[MetricInstance]] = js.native
    def list(opts: MetricListInstanceOptions): js.Promise[js.Array[MetricInstance]] = js.native
    def list(
      opts: MetricListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MetricInstance], Any]
    ): js.Promise[js.Array[MetricInstance]] = js.native
    
    /**
      * Retrieve a single page of MetricInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[MetricPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ MetricPage, Any]): js.Promise[MetricPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MetricPage, Any]): js.Promise[MetricPage] = js.native
    def page(opts: MetricListInstancePageOptions): js.Promise[MetricPage] = js.native
    def page(
      opts: MetricListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MetricPage, Any]
    ): js.Promise[MetricPage] = js.native
    
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
    * @property direction - The direction
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
  trait MetricListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ MetricInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var direction: js.UndefOr[MetricStreamDirection] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var edge: js.UndefOr[MetricTwilioEdge] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MetricListInstanceEachOptions {
    
    inline def apply(): MetricListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricListInstanceEachOptions]
    }
    
    extension [Self <: MetricListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ MetricInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDirection(value: MetricStreamDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEdge(value: MetricTwilioEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
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
    * @property direction - The direction
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
  trait MetricListInstanceOptions extends StObject {
    
    var direction: js.UndefOr[MetricStreamDirection] = js.undefined
    
    var edge: js.UndefOr[MetricTwilioEdge] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MetricListInstanceOptions {
    
    inline def apply(): MetricListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricListInstanceOptions]
    }
    
    extension [Self <: MetricListInstanceOptions](x: Self) {
      
      inline def setDirection(value: MetricStreamDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEdge(value: MetricTwilioEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
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
    * @property direction - The direction
    * @property edge - The edge
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait MetricListInstancePageOptions extends StObject {
    
    var direction: js.UndefOr[MetricStreamDirection] = js.undefined
    
    var edge: js.UndefOr[MetricTwilioEdge] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object MetricListInstancePageOptions {
    
    inline def apply(): MetricListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricListInstancePageOptions]
    }
    
    extension [Self <: MetricListInstancePageOptions](x: Self) {
      
      inline def setDirection(value: MetricStreamDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEdge(value: MetricTwilioEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait MetricPayload
    extends StObject
       with MetricResource
       with TwilioResponsePayload
  object MetricPayload {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      carrier_edge: js.Object,
      client_edge: js.Object,
      direction: MetricStreamDirection,
      edge: MetricTwilioEdge,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sdk_edge: js.Object,
      sip_edge: js.Object,
      timestamp: String,
      uri: String
    ): MetricPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], carrier_edge = carrier_edge.asInstanceOf[js.Any], client_edge = client_edge.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sdk_edge = sdk_edge.asInstanceOf[js.Any], sip_edge = sip_edge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricPayload]
    }
  }
  
  trait MetricResource extends StObject {
    
    var account_sid: String
    
    var call_sid: String
    
    var carrier_edge: js.Object
    
    var client_edge: js.Object
    
    var direction: MetricStreamDirection
    
    var edge: MetricTwilioEdge
    
    var sdk_edge: js.Object
    
    var sip_edge: js.Object
    
    var timestamp: String
  }
  object MetricResource {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      carrier_edge: js.Object,
      client_edge: js.Object,
      direction: MetricStreamDirection,
      edge: MetricTwilioEdge,
      sdk_edge: js.Object,
      sip_edge: js.Object,
      timestamp: String
    ): MetricResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], carrier_edge = carrier_edge.asInstanceOf[js.Any], client_edge = client_edge.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], sdk_edge = sdk_edge.asInstanceOf[js.Any], sip_edge = sip_edge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricResource]
    }
    
    extension [Self <: MetricResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setCarrier_edge(value: js.Object): Self = StObject.set(x, "carrier_edge", value.asInstanceOf[js.Any])
      
      inline def setClient_edge(value: js.Object): Self = StObject.set(x, "client_edge", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: MetricStreamDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEdge(value: MetricTwilioEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setSdk_edge(value: js.Object): Self = StObject.set(x, "sdk_edge", value.asInstanceOf[js.Any])
      
      inline def setSip_edge(value: js.Object): Self = StObject.set(x, "sip_edge", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetricSolution extends StObject {
    
    var callSid: js.UndefOr[String] = js.undefined
  }
  object MetricSolution {
    
    inline def apply(): MetricSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricSolution]
    }
    
    extension [Self <: MetricSolution](x: Self) {
      
      inline def setCallSid(value: String): Self = StObject.set(x, "callSid", value.asInstanceOf[js.Any])
      
      inline def setCallSidUndefined: Self = StObject.set(x, "callSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.unknown_
    - typings.twilio.twilioStrings.inbound
    - typings.twilio.twilioStrings.outbound
    - typings.twilio.twilioStrings.both
  */
  trait MetricStreamDirection extends StObject
  object MetricStreamDirection {
    
    inline def both: typings.twilio.twilioStrings.both = "both".asInstanceOf[typings.twilio.twilioStrings.both]
    
    inline def inbound: typings.twilio.twilioStrings.inbound = "inbound".asInstanceOf[typings.twilio.twilioStrings.inbound]
    
    inline def outbound: typings.twilio.twilioStrings.outbound = "outbound".asInstanceOf[typings.twilio.twilioStrings.outbound]
    
    inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.unknown_edge
    - typings.twilio.twilioStrings.carrier_edge
    - typings.twilio.twilioStrings.sip_edge
    - typings.twilio.twilioStrings.sdk_edge
    - typings.twilio.twilioStrings.client_edge
  */
  trait MetricTwilioEdge extends StObject
  object MetricTwilioEdge {
    
    inline def carrier_edge: typings.twilio.twilioStrings.carrier_edge = "carrier_edge".asInstanceOf[typings.twilio.twilioStrings.carrier_edge]
    
    inline def client_edge: typings.twilio.twilioStrings.client_edge = "client_edge".asInstanceOf[typings.twilio.twilioStrings.client_edge]
    
    inline def sdk_edge: typings.twilio.twilioStrings.sdk_edge = "sdk_edge".asInstanceOf[typings.twilio.twilioStrings.sdk_edge]
    
    inline def sip_edge: typings.twilio.twilioStrings.sip_edge = "sip_edge".asInstanceOf[typings.twilio.twilioStrings.sip_edge]
    
    inline def unknown_edge: typings.twilio.twilioStrings.unknown_edge = "unknown_edge".asInstanceOf[typings.twilio.twilioStrings.unknown_edge]
  }
}
