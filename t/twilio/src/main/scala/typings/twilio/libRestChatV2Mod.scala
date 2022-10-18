package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestChatV2Mod {
  
  @JSImport("twilio/lib/rest/chat/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Chat
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestChatMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.^ {
    
    val credentials: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
  }
}
