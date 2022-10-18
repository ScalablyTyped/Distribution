package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTrunkingMod {
  
  @JSImport("twilio/lib/rest/Trunking", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Trunking {
    /**
      * Initialize trunking domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Trunking
    extends typings.twilio.libBaseDomainMod.^ {
    
    val trunks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TrunkListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestTrunkingV1Mod.^ = js.native
  }
}
