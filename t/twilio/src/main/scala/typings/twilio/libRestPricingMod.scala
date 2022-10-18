package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPricingMod {
  
  @JSImport("twilio/lib/rest/Pricing", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Pricing {
    /**
      * Initialize pricing domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Pricing
    extends typings.twilio.libBaseDomainMod.^ {
    
    val countries: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CountryListInstance */ Any = js.native
    
    val messaging: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MessagingListInstance */ Any = js.native
    
    val numbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberListInstance */ Any = js.native
    
    val phoneNumbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestPricingV1Mod.^ = js.native
    
    val v2: typings.twilio.libRestPricingV2Mod.^ = js.native
    
    val voice: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VoiceListInstance */ Any = js.native
  }
}
