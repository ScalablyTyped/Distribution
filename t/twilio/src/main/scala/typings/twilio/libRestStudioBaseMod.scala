package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestStudioBaseMod {
  
  @JSImport("twilio/lib/rest/StudioBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends StudioBase {
    /**
      * Initialize studio domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait StudioBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestStudioV1Mod.default] = js.native
    
    var _v2: js.UndefOr[typings.twilio.libRestStudioV2Mod.default] = js.native
    
    def v1: typings.twilio.libRestStudioV1Mod.default = js.native
    
    def v2: typings.twilio.libRestStudioV2Mod.default = js.native
  }
}
