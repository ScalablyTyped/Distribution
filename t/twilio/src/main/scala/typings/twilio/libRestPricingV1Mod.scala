package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPricingV1Mod {
  
  @JSImport("twilio/lib/rest/pricing/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Pricing
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestPricingMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val messaging: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MessagingListInstance */ Any = js.native
    
    val phoneNumbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any = js.native
    
    val voice: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VoiceListInstance */ Any = js.native
  }
}
