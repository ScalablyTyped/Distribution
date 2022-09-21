package typings.twilio

import typings.twilio.v2PhoneNumberMod.PhoneNumberContext
import typings.twilio.v2PhoneNumberMod.PhoneNumberListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupsV2Mod {
  
  @JSImport("twilio/lib/rest/lookups/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Lookups
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.lookupsMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def phoneNumbers(sid: String): PhoneNumberContext = js.native
    @JSName("phoneNumbers")
    val phoneNumbers_Original: PhoneNumberListInstance = js.native
  }
}
