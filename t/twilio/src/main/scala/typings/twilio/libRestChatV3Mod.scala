package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestChatV3Mod {
  
  @JSImport("twilio/lib/rest/chat/V3", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V3 {
    /**
      * Initialize the V3 version of Chat
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestChatMod.^) = this()
  }
  
  @js.native
  trait V3
    extends typings.twilio.libBaseVersionMod.^ {
    
    val channels: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChannelListInstance */ Any = js.native
  }
}
