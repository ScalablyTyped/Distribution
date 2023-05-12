package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestContentBaseMod {
  
  @JSImport("twilio/lib/rest/ContentBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ContentBase {
    /**
      * Initialize content domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait ContentBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestContentV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestContentV1Mod.default = js.native
  }
}
