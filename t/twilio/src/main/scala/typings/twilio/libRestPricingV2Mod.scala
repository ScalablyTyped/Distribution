package typings.twilio

import typings.twilio.libRestPricingBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPricingV2Mod {
  
  @JSImport("twilio/lib/rest/pricing/V2", JSImport.Default)
  @js.native
  open class default protected () extends V2 {
    /**
      * Initialize the V2 version of Pricing
      *
      * @param domain - The Twilio (Twilio.Pricing) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.default {
    
    /** countries - { Twilio.Pricing.V2.CountryListInstance } resource */
    /* protected */ var _countries: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CountryListInstance */ Any
      ] = js.native
    
    /** numbers - { Twilio.Pricing.V2.NumberListInstance } resource */
    /* protected */ var _numbers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberListInstance */ Any
      ] = js.native
    
    /** voice - { Twilio.Pricing.V2.VoiceListInstance } resource */
    /* protected */ var _voice: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VoiceListInstance */ Any
      ] = js.native
    
    /** Getter for countries resource */
    def countries: Any = js.native
    
    /** Getter for numbers resource */
    def numbers: Any = js.native
    
    /** Getter for voice resource */
    def voice: Any = js.native
  }
}
