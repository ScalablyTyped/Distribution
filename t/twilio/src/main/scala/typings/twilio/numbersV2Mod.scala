package typings.twilio

import typings.twilio.regulatoryComplianceMod.RegulatoryComplianceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numbersV2Mod {
  
  @JSImport("twilio/lib/rest/numbers/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Numbers
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.numbersMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.versionMod.^ {
    
    val regulatoryCompliance: RegulatoryComplianceListInstance = js.native
  }
}
