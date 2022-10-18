package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPricingV2Mod {
  
  @JSImport("twilio/lib/rest/pricing/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Pricing
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestPricingMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.^ {
    
    val countries: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CountryListInstance */ Any = js.native
    
    val numbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberListInstance */ Any = js.native
    
    val voice: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VoiceListInstance */ Any = js.native
  }
}
