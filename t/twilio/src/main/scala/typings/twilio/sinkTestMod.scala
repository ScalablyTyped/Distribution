package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sinkTestMod {
  
  @JSImport("twilio/lib/rest/events/v1/sink/sinkTest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/events/v1/sink/sinkTest", "SinkTestInstance")
  @js.native
  open class SinkTestInstance protected () extends SerializableClass {
    /**
      * Initialize the SinkTestContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - A string that uniquely identifies this Sink.
      */
    def this(version: typings.twilio.eventsV1Mod.^, payload: SinkTestPayload, sid: String) = this()
    
    var result: String = js.native
  }
  
  /**
    * Initialize the SinkTestList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param sid - A string that uniquely identifies this Sink.
    */
  inline def SinkTestList(version: typings.twilio.eventsV1Mod.^, sid: String): SinkTestListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SinkTestList")(version.asInstanceOf[js.Any], sid.asInstanceOf[js.Any])).asInstanceOf[SinkTestListInstance]
  
  @JSImport("twilio/lib/rest/events/v1/sink/sinkTest", "SinkTestPage")
  @js.native
  open class SinkTestPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.eventsV1Mod.^, SinkTestPayload, SinkTestResource, SinkTestInstance] {
    /**
      * Initialize the SinkTestPage
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
      solution: SinkTestSolution
    ) = this()
    
    /**
      * Build an instance of SinkTestInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SinkTestPayload): SinkTestInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait SinkTestListInstance extends StObject {
    
    /**
      * create a SinkTestInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[SinkTestInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ SinkTestInstance, Any]): js.Promise[SinkTestInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait SinkTestPayload
    extends StObject
       with SinkTestResource
       with TwilioResponsePayload
  object SinkTestPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      result: String,
      uri: String
    ): SinkTestPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinkTestPayload]
    }
  }
  
  trait SinkTestResource extends StObject {
    
    var result: String
  }
  object SinkTestResource {
    
    inline def apply(result: String): SinkTestResource = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinkTestResource]
    }
    
    extension [Self <: SinkTestResource](x: Self) {
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait SinkTestSolution extends StObject {
    
    var sid: js.UndefOr[String] = js.undefined
  }
  object SinkTestSolution {
    
    inline def apply(): SinkTestSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinkTestSolution]
    }
    
    extension [Self <: SinkTestSolution](x: Self) {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    }
  }
}
