package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestAutopilotV1Mod {
  
  @JSImport("twilio/lib/rest/autopilot/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Autopilot
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestAutopilotMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val assistants: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AssistantListInstance */ Any = js.native
    
    val restoreAssistant: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RestoreAssistantListInstance */ Any = js.native
  }
}
