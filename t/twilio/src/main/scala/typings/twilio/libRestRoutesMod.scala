package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestRoutesMod {
  
  @JSImport("twilio/lib/rest/Routes", JSImport.Namespace)
  @js.native
  open class ^ () extends Routes
  
  @js.native
  trait Routes
    extends typings.twilio.libRestRoutesBaseMod.^ {
    
    /**
      * @deprecated - Use v1.phoneNumbers instead
      */
    def phoneNumbers: Any = js.native
    
    /**
      * @deprecated - Use v1.sipDomains instead
      */
    def sipDomains: Any = js.native
    
    /**
      * @deprecated - Use v1.trunks instead
      */
    def trunks: Any = js.native
  }
}
