package typings.twilio

import typings.twilio.libRestPricingBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPricingV1Mod {
  
  @JSImport("twilio/lib/rest/pricing/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Pricing
      *
      * @param domain - The Twilio (Twilio.Pricing) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** messaging - { Twilio.Pricing.V1.MessagingListInstance } resource */
    /* protected */ var _messaging: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MessagingListInstance */ Any
      ] = js.native
    
    /** phoneNumbers - { Twilio.Pricing.V1.PhoneNumberListInstance } resource */
    /* protected */ var _phoneNumbers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any
      ] = js.native
    
    /** voice - { Twilio.Pricing.V1.VoiceListInstance } resource */
    /* protected */ var _voice: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VoiceListInstance */ Any
      ] = js.native
    
    /** Getter for messaging resource */
    def messaging: Any = js.native
    
    /** Getter for phoneNumbers resource */
    def phoneNumbers: Any = js.native
    
    /** Getter for voice resource */
    def voice: Any = js.native
  }
}
