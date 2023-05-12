package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestChatBaseMod {
  
  @JSImport("twilio/lib/rest/ChatBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ChatBase {
    /**
      * Initialize chat domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait ChatBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestChatV1Mod.default] = js.native
    
    var _v2: js.UndefOr[typings.twilio.libRestChatV2Mod.default] = js.native
    
    var _v3: js.UndefOr[typings.twilio.libRestChatV3Mod.default] = js.native
    
    def v1: typings.twilio.libRestChatV1Mod.default = js.native
    
    def v2: typings.twilio.libRestChatV2Mod.default = js.native
    
    def v3: typings.twilio.libRestChatV3Mod.default = js.native
  }
}
