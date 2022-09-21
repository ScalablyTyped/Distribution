package typings.twilio

import typings.twilio.assistantMod.AssistantContext
import typings.twilio.assistantMod.AssistantListInstance
import typings.twilio.restoreAssistantMod.RestoreAssistantListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autopilotV1Mod {
  
  @JSImport("twilio/lib/rest/autopilot/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Autopilot
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.autopilotMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def assistants(sid: String): AssistantContext = js.native
    @JSName("assistants")
    val assistants_Original: AssistantListInstance = js.native
    
    val restoreAssistant: RestoreAssistantListInstance = js.native
  }
}
