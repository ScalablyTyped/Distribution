package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestFlexApiBaseMod {
  
  @JSImport("twilio/lib/rest/FlexApiBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends FlexApiBase {
    /**
      * Initialize flexApi domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait FlexApiBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestFlexApiV1Mod.default] = js.native
    
    var _v2: js.UndefOr[typings.twilio.libRestFlexApiV2Mod.default] = js.native
    
    def v1: typings.twilio.libRestFlexApiV1Mod.default = js.native
    
    def v2: typings.twilio.libRestFlexApiV2Mod.default = js.native
  }
}
