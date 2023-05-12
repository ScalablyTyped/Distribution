package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestAutopilotMod {
  
  @JSImport("twilio/lib/rest/Autopilot", JSImport.Namespace)
  @js.native
  open class ^ () extends Autopilot
  
  @js.native
  trait Autopilot
    extends typings.twilio.libRestAutopilotBaseMod.^ {
    
    /**
      * @deprecated - Use v1.assistants instead
      */
    def assistants: Any = js.native
    
    /**
      * @deprecated - Use v1.restoreAssistant instead
      */
    def restoreAssistant: Any = js.native
  }
}
