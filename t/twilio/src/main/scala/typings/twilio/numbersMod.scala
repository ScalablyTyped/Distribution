package typings.twilio

import typings.twilio.regulatoryComplianceMod.RegulatoryComplianceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numbersMod {
  
  @JSImport("twilio/lib/rest/Numbers", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Numbers {
    /**
      * Initialize numbers domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Numbers
    extends typings.twilio.domainMod.^ {
    
    val regulatoryCompliance: RegulatoryComplianceListInstance = js.native
    
    val v2: typings.twilio.numbersV2Mod.^ = js.native
  }
}
