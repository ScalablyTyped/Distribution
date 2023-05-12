package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVoiceBaseMod {
  
  @JSImport("twilio/lib/rest/VoiceBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends VoiceBase {
    /**
      * Initialize voice domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait VoiceBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestVoiceV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestVoiceV1Mod.default = js.native
  }
}
