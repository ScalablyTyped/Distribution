package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMonitorMod {
  
  @JSImport("twilio/lib/rest/Monitor", JSImport.Namespace)
  @js.native
  open class ^ () extends Monitor
  
  @js.native
  trait Monitor
    extends typings.twilio.libRestMonitorBaseMod.^ {
    
    /**
      * @deprecated - Use v1.alerts instead
      */
    def alerts: Any = js.native
    
    /**
      * @deprecated - Use v1.events instead
      */
    def events: Any = js.native
  }
}
