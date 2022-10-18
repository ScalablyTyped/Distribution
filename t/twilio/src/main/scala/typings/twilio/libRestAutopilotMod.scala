package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestAutopilotMod {
  
  @JSImport("twilio/lib/rest/Autopilot", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Autopilot {
    /**
      * Initialize autopilot domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Autopilot
    extends typings.twilio.libBaseDomainMod.^ {
    
    val assistants: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AssistantListInstance */ Any = js.native
    
    val restoreAssistant: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RestoreAssistantListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestAutopilotV1Mod.^ = js.native
  }
}
