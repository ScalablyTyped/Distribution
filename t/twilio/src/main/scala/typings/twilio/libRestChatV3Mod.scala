package typings.twilio

import typings.twilio.libRestChatBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestChatV3Mod {
  
  @JSImport("twilio/lib/rest/chat/V3", JSImport.Default)
  @js.native
  open class default protected () extends V3 {
    /**
      * Initialize the V3 version of Chat
      *
      * @param domain - The Twilio (Twilio.Chat) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V3
    extends typings.twilio.libBaseVersionMod.default {
    
    /** channels - { Twilio.Chat.V3.ChannelListInstance } resource */
    /* protected */ var _channels: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChannelListInstance */ Any
      ] = js.native
    
    /** Getter for channels resource */
    def channels: Any = js.native
  }
}
