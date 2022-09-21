package typings.twilio

import typings.twilio.phoneNumberMod.PhoneNumberContext
import typings.twilio.phoneNumberMod.PhoneNumberListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupsMod {
  
  @JSImport("twilio/lib/rest/Lookups", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Lookups {
    /**
      * Initialize lookups domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Lookups
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def phoneNumbers(sid: String): PhoneNumberContext = js.native
    @JSName("phoneNumbers")
    val phoneNumbers_Original: PhoneNumberListInstance = js.native
    
    val v1: typings.twilio.lookupsV1Mod.^ = js.native
    
    val v2: typings.twilio.lookupsV2Mod.^ = js.native
  }
}
