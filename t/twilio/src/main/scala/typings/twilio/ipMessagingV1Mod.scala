package typings.twilio

import typings.twilio.ipMessagingV1CredentialMod.CredentialContext
import typings.twilio.ipMessagingV1CredentialMod.CredentialListInstance
import typings.twilio.ipMessagingV1ServiceMod.ServiceContext
import typings.twilio.ipMessagingV1ServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipMessagingV1Mod {
  
  @JSImport("twilio/lib/rest/ipMessaging/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of IpMessaging
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.ipMessagingMod.^) = this()
  }
  
  @js.native
  trait V1
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
