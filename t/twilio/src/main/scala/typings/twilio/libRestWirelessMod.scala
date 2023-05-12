package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestWirelessMod {
  
  @JSImport("twilio/lib/rest/Wireless", JSImport.Namespace)
  @js.native
  open class ^ () extends Wireless
  
  @js.native
  trait Wireless
    extends typings.twilio.libRestWirelessBaseMod.^ {
    
    /**
      * @deprecated - Use v1.commands instead
      */
    def commands: Any = js.native
    
    /**
      * @deprecated - Use v1.ratePlans instead
      */
    def ratePlans: Any = js.native
    
    /**
      * @deprecated - Use v1.sims instead
      */
    def sims: Any = js.native
    
    /**
      * @deprecated - Use v1.usageRecords instead
      */
    def usageRecords: Any = js.native
  }
}
