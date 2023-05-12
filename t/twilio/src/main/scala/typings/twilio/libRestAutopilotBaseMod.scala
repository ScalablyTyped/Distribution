package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestAutopilotBaseMod {
  
  @JSImport("twilio/lib/rest/AutopilotBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends AutopilotBase {
    /**
      * Initialize autopilot domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait AutopilotBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestAutopilotV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestAutopilotV1Mod.default = js.native
  }
}
