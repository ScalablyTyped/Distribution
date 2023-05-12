package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestNotifyMod {
  
  @JSImport("twilio/lib/rest/Notify", JSImport.Namespace)
  @js.native
  open class ^ () extends Notify
  
  @js.native
  trait Notify
    extends typings.twilio.libRestNotifyBaseMod.^ {
    
    /**
      * @deprecated - Use v1.credentials instead
      */
    def credentials: Any = js.native
    
    /**
      * @deprecated - Use v1.services instead
      */
    def services: Any = js.native
  }
}
