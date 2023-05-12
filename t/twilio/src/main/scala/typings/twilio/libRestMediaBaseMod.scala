package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMediaBaseMod {
  
  @JSImport("twilio/lib/rest/MediaBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends MediaBase {
    /**
      * Initialize media domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait MediaBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestMediaV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestMediaV1Mod.default = js.native
  }
}
