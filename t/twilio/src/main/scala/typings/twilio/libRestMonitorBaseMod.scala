package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMonitorBaseMod {
  
  @JSImport("twilio/lib/rest/MonitorBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends MonitorBase {
    /**
      * Initialize monitor domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait MonitorBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestMonitorV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestMonitorV1Mod.default = js.native
  }
}
