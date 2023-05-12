package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestWirelessBaseMod {
  
  @JSImport("twilio/lib/rest/WirelessBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends WirelessBase {
    /**
      * Initialize wireless domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait WirelessBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestWirelessV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestWirelessV1Mod.default = js.native
  }
}
