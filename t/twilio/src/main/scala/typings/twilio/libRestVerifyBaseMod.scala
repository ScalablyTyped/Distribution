package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVerifyBaseMod {
  
  @JSImport("twilio/lib/rest/VerifyBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends VerifyBase {
    /**
      * Initialize verify domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait VerifyBase extends default {
    
    var _v2: js.UndefOr[typings.twilio.libRestVerifyV2Mod.default] = js.native
    
    def v2: typings.twilio.libRestVerifyV2Mod.default = js.native
  }
}
