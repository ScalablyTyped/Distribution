package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPricingBaseMod {
  
  @JSImport("twilio/lib/rest/PricingBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends PricingBase {
    /**
      * Initialize pricing domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait PricingBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestPricingV1Mod.default] = js.native
    
    var _v2: js.UndefOr[typings.twilio.libRestPricingV2Mod.default] = js.native
    
    def v1: typings.twilio.libRestPricingV1Mod.default = js.native
    
    def v2: typings.twilio.libRestPricingV2Mod.default = js.native
  }
}
