package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVideoBaseMod {
  
  @JSImport("twilio/lib/rest/VideoBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends VideoBase {
    /**
      * Initialize video domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait VideoBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestVideoV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestVideoV1Mod.default = js.native
  }
}
