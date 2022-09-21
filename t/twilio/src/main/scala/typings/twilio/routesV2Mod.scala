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

object routesV2Mod {
  
  @JSImport("twilio/lib/rest/routes/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Routes
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.routesMod.^) = this()
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
  }
}
