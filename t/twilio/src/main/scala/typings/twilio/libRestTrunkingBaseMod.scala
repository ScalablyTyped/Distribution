package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTrunkingBaseMod {
  
  @JSImport("twilio/lib/rest/TrunkingBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends TrunkingBase {
    /**
      * Initialize trunking domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait TrunkingBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestTrunkingV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestTrunkingV1Mod.default = js.native
  }
}
