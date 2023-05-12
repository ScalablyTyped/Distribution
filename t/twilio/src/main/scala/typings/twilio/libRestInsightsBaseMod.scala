package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestInsightsBaseMod {
  
  @JSImport("twilio/lib/rest/InsightsBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends InsightsBase {
    /**
      * Initialize insights domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait InsightsBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestInsightsV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestInsightsV1Mod.default = js.native
  }
}
