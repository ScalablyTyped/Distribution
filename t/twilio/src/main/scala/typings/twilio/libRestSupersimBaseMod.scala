package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestSupersimBaseMod {
  
  @JSImport("twilio/lib/rest/SupersimBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends SupersimBase {
    /**
      * Initialize supersim domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait SupersimBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestSupersimV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestSupersimV1Mod.default = js.native
  }
}
