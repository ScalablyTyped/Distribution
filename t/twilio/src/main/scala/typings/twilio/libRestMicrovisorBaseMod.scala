package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMicrovisorBaseMod {
  
  @JSImport("twilio/lib/rest/MicrovisorBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends MicrovisorBase {
    /**
      * Initialize microvisor domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait MicrovisorBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestMicrovisorV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestMicrovisorV1Mod.default = js.native
  }
}
