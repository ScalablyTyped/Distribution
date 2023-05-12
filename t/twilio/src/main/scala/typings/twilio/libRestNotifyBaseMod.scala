package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestNotifyBaseMod {
  
  @JSImport("twilio/lib/rest/NotifyBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends NotifyBase {
    /**
      * Initialize notify domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait NotifyBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestNotifyV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestNotifyV1Mod.default = js.native
  }
}
