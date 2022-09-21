package typings.twilio

import typings.twilio.v2CountryMod.CountryContext
import typings.twilio.v2CountryMod.CountryListInstance
import typings.twilio.v2NumberMod.NumberContext
import typings.twilio.v2NumberMod.NumberListInstance
import typings.twilio.v2VoiceMod.VoiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pricingV2Mod {
  
  @JSImport("twilio/lib/rest/pricing/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Pricing
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.pricingMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def countries(sid: String): CountryContext = js.native
    @JSName("countries")
    val countries_Original: CountryListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def numbers(sid: String): NumberContext = js.native
    @JSName("numbers")
    val numbers_Original: NumberListInstance = js.native
    
    val voice: VoiceListInstance = js.native
  }
}
