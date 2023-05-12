package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestNumbersBaseMod {
  
  @JSImport("twilio/lib/rest/NumbersBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends NumbersBase {
    /**
      * Initialize numbers domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait NumbersBase extends default {
    
    var _v2: js.UndefOr[typings.twilio.libRestNumbersV2Mod.default] = js.native
    
    def v2: typings.twilio.libRestNumbersV2Mod.default = js.native
  }
}
