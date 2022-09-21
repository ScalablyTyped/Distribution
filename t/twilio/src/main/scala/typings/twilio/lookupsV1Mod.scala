package typings.twilio

import typings.twilio.phoneNumberMod.PhoneNumberContext
import typings.twilio.phoneNumberMod.PhoneNumberListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupsV1Mod {
  
  @JSImport("twilio/lib/rest/lookups/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Lookups
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.lookupsMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def phoneNumbers(sid: String): PhoneNumberContext = js.native
    @JSName("phoneNumbers")
    val phoneNumbers_Original: PhoneNumberListInstance = js.native
  }
}
