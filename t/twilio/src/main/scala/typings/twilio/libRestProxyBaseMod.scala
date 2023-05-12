package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestProxyBaseMod {
  
  @JSImport("twilio/lib/rest/ProxyBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ProxyBase {
    /**
      * Initialize proxy domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait ProxyBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestProxyV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestProxyV1Mod.default = js.native
  }
}
