package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usecaseMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/usecase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/usecase", "UsecaseInstance")
  @js.native
  open class UsecaseInstance protected () extends SerializableClass {
    /**
      * Initialize the UsecaseContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.messagingV1Mod.^, payload: UsecasePayload) = this()
    
    var usecases: js.Array[js.Object] = js.native
  }
  
  /**
    * Initialize the UsecaseList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def UsecaseList(version: typings.twilio.messagingV1Mod.^): UsecaseListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("UsecaseList")(version.asInstanceOf[js.Any]).asInstanceOf[UsecaseListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/usecase", "UsecasePage")
  @js.native
  open class UsecasePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.messagingV1Mod.^, UsecasePayload, UsecaseResource, UsecaseInstance] {
    /**
      * Initialize the UsecasePage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: UsecaseSolution
    ) = this()
    
    /**
      * Build an instance of UsecaseInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: UsecasePayload): UsecaseInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait UsecaseListInstance extends StObject {
    
    /**
      * fetch a UsecaseInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UsecaseInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UsecaseInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait UsecasePayload
    extends StObject
       with UsecaseResource
       with TwilioResponsePayload
  object UsecasePayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      usecases: js.Array[js.Object]
    ): UsecasePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], usecases = usecases.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsecasePayload]
    }
  }
  
  trait UsecaseResource extends StObject {
    
    var usecases: js.Array[js.Object]
  }
  object UsecaseResource {
    
    inline def apply(usecases: js.Array[js.Object]): UsecaseResource = {
      val __obj = js.Dynamic.literal(usecases = usecases.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsecaseResource]
    }
    
    extension [Self <: UsecaseResource](x: Self) {
      
      inline def setUsecases(value: js.Array[js.Object]): Self = StObject.set(x, "usecases", value.asInstanceOf[js.Any])
      
      inline def setUsecasesVarargs(value: js.Object*): Self = StObject.set(x, "usecases", js.Array(value*))
    }
  }
  
  trait UsecaseSolution extends StObject
}
