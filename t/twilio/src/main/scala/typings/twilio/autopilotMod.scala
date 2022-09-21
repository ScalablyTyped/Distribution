package typings.twilio

import typings.twilio.assistantMod.AssistantContext
import typings.twilio.assistantMod.AssistantListInstance
import typings.twilio.restoreAssistantMod.RestoreAssistantListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autopilotMod {
  
  @JSImport("twilio/lib/rest/Autopilot", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Autopilot {
    /**
      * Initialize autopilot domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Autopilot
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def assistants(sid: String): AssistantContext = js.native
    @JSName("assistants")
    val assistants_Original: AssistantListInstance = js.native
    
    val restoreAssistant: RestoreAssistantListInstance = js.native
    
    val v1: typings.twilio.autopilotV1Mod.^ = js.native
  }
}
