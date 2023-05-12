package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestRoutesBaseMod {
  
  @JSImport("twilio/lib/rest/RoutesBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends RoutesBase {
    /**
      * Initialize routes domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait RoutesBase extends default {
    
    var _v2: js.UndefOr[typings.twilio.libRestRoutesV2Mod.default] = js.native
    
    def v2: typings.twilio.libRestRoutesV2Mod.default = js.native
  }
}
