package typings.twilio

import typings.twilio.v3ChannelMod.ChannelContext
import typings.twilio.v3ChannelMod.ChannelListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v3Mod {
  
  @JSImport("twilio/lib/rest/chat/V3", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V3 {
    /**
      * Initialize the V3 version of Chat
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.chatMod.^) = this()
  }
  
  @js.native
  trait V3
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def channels(sid: String): ChannelContext = js.native
    @JSName("channels")
    val channels_Original: ChannelListInstance = js.native
  }
}
