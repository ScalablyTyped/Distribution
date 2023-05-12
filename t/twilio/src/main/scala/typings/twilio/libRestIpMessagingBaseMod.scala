package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestIpMessagingBaseMod {
  
  @JSImport("twilio/lib/rest/IpMessagingBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends IpMessagingBase {
    /**
      * Initialize ipMessaging domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait IpMessagingBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestIpMessagingV1Mod.default] = js.native
    
    var _v2: js.UndefOr[typings.twilio.libRestIpMessagingV2Mod.default] = js.native
    
    def v1: typings.twilio.libRestIpMessagingV1Mod.default = js.native
    
    def v2: typings.twilio.libRestIpMessagingV2Mod.default = js.native
  }
}
