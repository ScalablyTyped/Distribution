package typings.twilio

import typings.twilio.messagingMod.MessagingListInstance
import typings.twilio.v1PhoneNumberMod.PhoneNumberListInstance
import typings.twilio.v2CountryMod.CountryContext
import typings.twilio.v2CountryMod.CountryListInstance
import typings.twilio.v2NumberMod.NumberContext
import typings.twilio.v2NumberMod.NumberListInstance
import typings.twilio.v2VoiceMod.VoiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pricingMod {
  
  @JSImport("twilio/lib/rest/Pricing", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Pricing {
    /**
      * Initialize pricing domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Pricing
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def countries(sid: String): CountryContext = js.native
    @JSName("countries")
    val countries_Original: CountryListInstance = js.native
    
    val messaging: MessagingListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def numbers(sid: String): NumberContext = js.native
    @JSName("numbers")
    val numbers_Original: NumberListInstance = js.native
    
    val phoneNumbers: PhoneNumberListInstance = js.native
    
    val v1: typings.twilio.pricingV1Mod.^ = js.native
    
    val v2: typings.twilio.pricingV2Mod.^ = js.native
    
    val voice: VoiceListInstance = js.native
  }
}
