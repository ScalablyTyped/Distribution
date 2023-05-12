package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTrunkingMod {
  
  @JSImport("twilio/lib/rest/Trunking", JSImport.Namespace)
  @js.native
  open class ^ () extends Trunking
  
  @js.native
  trait Trunking
    extends typings.twilio.libRestTrunkingBaseMod.^ {
    
    /**
      * @deprecated - Use v1.trunks instead
      */
    def trunks: Any = js.native
  }
}
