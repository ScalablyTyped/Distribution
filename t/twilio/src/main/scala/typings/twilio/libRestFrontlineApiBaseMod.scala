package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestFrontlineApiBaseMod {
  
  @JSImport("twilio/lib/rest/FrontlineApiBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends FrontlineApiBase {
    /**
      * Initialize frontlineApi domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait FrontlineApiBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestFrontlineApiV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestFrontlineApiV1Mod.default = js.native
  }
}
