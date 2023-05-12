package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestChatMod {
  
  @JSImport("twilio/lib/rest/Chat", JSImport.Namespace)
  @js.native
  open class ^ () extends Chat
  
  @js.native
  trait Chat
    extends typings.twilio.libRestChatBaseMod.^ {
    
    /**
      * @deprecated - Use v3.channels instead
      */
    def channels: Any = js.native
    
    /**
      * @deprecated - Use v2.credentials instead
      */
    def credentials: Any = js.native
    
    /**
      * @deprecated - Use v2.services instead
      */
    def services: Any = js.native
  }
}
