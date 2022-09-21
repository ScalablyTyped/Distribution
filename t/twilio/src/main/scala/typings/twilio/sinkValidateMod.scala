package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sinkValidateMod {
  
  @JSImport("twilio/lib/rest/events/v1/sink/sinkValidate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/events/v1/sink/sinkValidate", "SinkValidateInstance")
  @js.native
  open class SinkValidateInstance protected () extends SerializableClass {
    /**
      * Initialize the SinkValidateContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - A string that uniquely identifies this Sink.
      */
    def this(version: typings.twilio.eventsV1Mod.^, payload: SinkValidatePayload, sid: String) = this()
    
    var result: String = js.native
  }
  
  /**
    * Initialize the SinkValidateList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param sid - A string that uniquely identifies this Sink.
    */
  inline def SinkValidateList(version: typings.twilio.eventsV1Mod.^, sid: String): SinkValidateListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SinkValidateList")(version.asInstanceOf[js.Any], sid.asInstanceOf[js.Any])).asInstanceOf[SinkValidateListInstance]
  
  @JSImport("twilio/lib/rest/events/v1/sink/sinkValidate", "SinkValidatePage")
  @js.native
  open class SinkValidatePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.eventsV1Mod.^, 
          SinkValidatePayload, 
          SinkValidateResource, 
          SinkValidateInstance
        ] {
    /**
      * Initialize the SinkValidatePage
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
      solution: SinkValidateSolution
    ) = this()
    
    /**
      * Build an instance of SinkValidateInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SinkValidatePayload): SinkValidateInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait SinkValidateListInstance extends StObject {
    
    /**
      * create a SinkValidateInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SinkValidateListInstanceCreateOptions): js.Promise[SinkValidateInstance] = js.native
    def create(
      opts: SinkValidateListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SinkValidateInstance, Any]
    ): js.Promise[SinkValidateInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property testId - A string that uniquely identifies the test event for a Sink being validated.
    */
  trait SinkValidateListInstanceCreateOptions extends StObject {
    
    var testId: String
  }
  object SinkValidateListInstanceCreateOptions {
    
    inline def apply(testId: String): SinkValidateListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(testId = testId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinkValidateListInstanceCreateOptions]
    }
    
    extension [Self <: SinkValidateListInstanceCreateOptions](x: Self) {
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SinkValidatePayload
    extends StObject
       with SinkValidateResource
       with TwilioResponsePayload
  object SinkValidatePayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      result: String,
      uri: String
    ): SinkValidatePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinkValidatePayload]
    }
  }
  
  trait SinkValidateResource extends StObject {
    
    var result: String
  }
  object SinkValidateResource {
    
    inline def apply(result: String): SinkValidateResource = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinkValidateResource]
    }
    
    extension [Self <: SinkValidateResource](x: Self) {
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait SinkValidateSolution extends StObject {
    
    var sid: js.UndefOr[String] = js.undefined
  }
  object SinkValidateSolution {
    
    inline def apply(): SinkValidateSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinkValidateSolution]
    }
    
    extension [Self <: SinkValidateSolution](x: Self) {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    }
  }
}
