package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestConversationsBaseMod {
  
  @JSImport("twilio/lib/rest/ConversationsBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ConversationsBase {
    /**
      * Initialize conversations domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait ConversationsBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestConversationsV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestConversationsV1Mod.default = js.native
  }
}
