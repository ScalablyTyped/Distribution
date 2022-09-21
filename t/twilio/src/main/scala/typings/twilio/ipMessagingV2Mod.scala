package typings.twilio

import typings.twilio.ipMessagingV2CredentialMod.CredentialContext
import typings.twilio.ipMessagingV2CredentialMod.CredentialListInstance
import typings.twilio.ipMessagingV2ServiceMod.ServiceContext
import typings.twilio.ipMessagingV2ServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipMessagingV2Mod {
  
  @JSImport("twilio/lib/rest/ipMessaging/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of IpMessaging
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.ipMessagingMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def credentials(sid: String): CredentialContext = js.native
    @JSName("credentials")
    val credentials_Original: CredentialListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
  }
}
