package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestNumbersMod {
  
  @JSImport("twilio/lib/rest/Numbers", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Numbers {
    /**
      * Initialize numbers domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Numbers
    extends typings.twilio.libBaseDomainMod.^ {
    
    val regulatoryCompliance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RegulatoryComplianceListInstance */ Any = js.native
    
    val v2: typings.twilio.libRestNumbersV2Mod.^ = js.native
  }
}
