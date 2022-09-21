package typings.twilio

import typings.twilio.routesV2PhoneNumberMod.PhoneNumberContext
import typings.twilio.routesV2PhoneNumberMod.PhoneNumberListInstance
import typings.twilio.trunkMod.TrunkContext
import typings.twilio.trunkMod.TrunkListInstance
import typings.twilio.v2SipDomainMod.SipDomainContext
import typings.twilio.v2SipDomainMod.SipDomainListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routesMod {
  
  @JSImport("twilio/lib/rest/Routes", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Routes {
    /**
      * Initialize routes domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Routes
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def phoneNumbers(sid: String): PhoneNumberContext = js.native
    @JSName("phoneNumbers")
    val phoneNumbers_Original: PhoneNumberListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def sipDomains(sid: String): SipDomainContext = js.native
    @JSName("sipDomains")
    val sipDomains_Original: SipDomainListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def trunks(sid: String): TrunkContext = js.native
    @JSName("trunks")
    val trunks_Original: TrunkListInstance = js.native
    
    val v2: typings.twilio.routesV2Mod.^ = js.native
  }
}
