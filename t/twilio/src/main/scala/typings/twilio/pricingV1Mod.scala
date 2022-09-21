package typings.twilio

import typings.twilio.messagingMod.MessagingListInstance
import typings.twilio.v1PhoneNumberMod.PhoneNumberListInstance
import typings.twilio.voiceMod.VoiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pricingV1Mod {
  
  @JSImport("twilio/lib/rest/pricing/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Pricing
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.pricingMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    val messaging: MessagingListInstance = js.native
    
    val phoneNumbers: PhoneNumberListInstance = js.native
    
    val voice: VoiceListInstance = js.native
  }
}
