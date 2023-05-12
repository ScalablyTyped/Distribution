package typings.twilio

import typings.twilio.libRestNumbersBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestNumbersV2Mod {
  
  @JSImport("twilio/lib/rest/numbers/V2", JSImport.Default)
  @js.native
  open class default protected () extends V2 {
    /**
      * Initialize the V2 version of Numbers
      *
      * @param domain - The Twilio (Twilio.Numbers) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.default {
    
    /** regulatoryCompliance - { Twilio.Numbers.V2.RegulatoryComplianceListInstance } resource */
    /* protected */ var _regulatoryCompliance: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RegulatoryComplianceListInstance */ Any
      ] = js.native
    
    /** Getter for regulatoryCompliance resource */
    def regulatoryCompliance: Any = js.native
  }
}
