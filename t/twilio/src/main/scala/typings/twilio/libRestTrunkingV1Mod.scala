package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTrunkingV1Mod {
  
  @JSImport("twilio/lib/rest/trunking/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Trunking
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestTrunkingMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val trunks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TrunkListInstance */ Any = js.native
  }
}
