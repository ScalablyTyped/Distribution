package typings.twilio

import typings.twilio.annotationMod.AnnotationContext
import typings.twilio.annotationMod.AnnotationListInstance
import typings.twilio.callEventMod.EventListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.metricMod.MetricListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.summaryMod.CallSummaryContext
import typings.twilio.summaryMod.CallSummaryListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1CallMod {
  
  @JSImport("twilio/lib/rest/insights/v1/call", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/call", "CallContext")
  @js.native
  open class CallContext protected () extends StObject {
    /**
      * Initialize the CallContext
      *
      * @param version - Version of the resource
      * @param sid - The sid
      */
    def this(version: typings.twilio.insightsV1Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def annotation(sid: String): AnnotationContext = js.native
    @JSName("annotation")
    var annotation_Original: AnnotationListInstance = js.native
    
    var events: EventListInstance = js.native
    
    /**
      * fetch a CallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CallInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CallInstance, Any]): js.Promise[CallInstance] = js.native
    
    var metrics: MetricListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def summary(sid: String): CallSummaryContext = js.native
    @JSName("summary")
    var summary_Original: CallSummaryListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/insights/v1/call", "CallInstance")
  @js.native
  open class CallInstance protected () extends SerializableClass {
    /**
      * Initialize the CallContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The sid
      */
    def this(version: typings.twilio.insightsV1Mod.^, payload: CallPayload, sid: String) = this()
    
    /* private */ var _proxy: CallContext = js.native
    
    /**
      * Access the annotation
      */
    def annotation(): AnnotationListInstance = js.native
    
    /**
      * Access the events
      */
    def events(): EventListInstance = js.native
    
    /**
      * fetch a CallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CallInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CallInstance] = js.native
    
    var links: String = js.native
    
    /**
      * Access the metrics
      */
    def metrics(): MetricListInstance = js.native
    
    var sid: String = js.native
    
    /**
      * Access the summary
      */
    def summary(): CallSummaryListInstance = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CallList
    *
    * @param version - Version of the resource
    */
  inline def CallList(version: typings.twilio.insightsV1Mod.^): CallListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CallList")(version.asInstanceOf[js.Any]).asInstanceOf[CallListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/call", "CallPage")
  @js.native
  open class CallPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.insightsV1Mod.^, CallPayload, CallResource, CallInstance] {
    /**
      * Initialize the CallPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.insightsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CallSolution
    ) = this()
    
    /**
      * Build an instance of CallInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CallPayload): CallInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait CallListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CallContext = js.native
    
    /**
      * Constructs a call
      *
      * @param sid - The sid
      */
    def get(sid: String): CallContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait CallPayload
    extends StObject
       with CallResource
       with TwilioResponsePayload
  object CallPayload {
    
    inline def apply(
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): CallPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallPayload]
    }
  }
  
  trait CallResource extends StObject {
    
    var links: String
    
    var sid: String
    
    var url: String
  }
  object CallResource {
    
    inline def apply(links: String, sid: String, url: String): CallResource = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallResource]
    }
    
    extension [Self <: CallResource](x: Self) {
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallSolution extends StObject
}
