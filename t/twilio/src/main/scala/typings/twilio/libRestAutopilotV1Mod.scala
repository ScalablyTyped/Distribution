package typings.twilio

import typings.twilio.libRestAutopilotBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestAutopilotV1Mod {
  
  @JSImport("twilio/lib/rest/autopilot/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Autopilot
      *
      * @param domain - The Twilio (Twilio.Autopilot) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** assistants - { Twilio.Autopilot.V1.AssistantListInstance } resource */
    /* protected */ var _assistants: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AssistantListInstance */ Any
      ] = js.native
    
    /** restoreAssistant - { Twilio.Autopilot.V1.RestoreAssistantListInstance } resource */
    /* protected */ var _restoreAssistant: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RestoreAssistantListInstance */ Any
      ] = js.native
    
    /** Getter for assistants resource */
    def assistants: Any = js.native
    
    /** Getter for restoreAssistant resource */
    def restoreAssistant: Any = js.native
  }
}
