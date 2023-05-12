package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestIpMessagingMod {
  
  @JSImport("twilio/lib/rest/IpMessaging", JSImport.Namespace)
  @js.native
  open class ^ () extends IpMessaging
  
  @js.native
  trait IpMessaging
    extends typings.twilio.libRestIpMessagingBaseMod.^ {
    
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
