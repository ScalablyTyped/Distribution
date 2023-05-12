package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTaskrouterBaseMod {
  
  @JSImport("twilio/lib/rest/TaskrouterBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends TaskrouterBase {
    /**
      * Initialize taskrouter domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait TaskrouterBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestTaskrouterV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestTaskrouterV1Mod.default = js.native
  }
}
