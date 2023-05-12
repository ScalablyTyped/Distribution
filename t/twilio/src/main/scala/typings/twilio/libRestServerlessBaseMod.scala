package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestServerlessBaseMod {
  
  @JSImport("twilio/lib/rest/ServerlessBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ServerlessBase {
    /**
      * Initialize serverless domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait ServerlessBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestServerlessV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestServerlessV1Mod.default = js.native
  }
}
