package typings.twilio

import typings.twilio.ipMessagingV2CredentialMod.CredentialContext
import typings.twilio.ipMessagingV2CredentialMod.CredentialListInstance
import typings.twilio.ipMessagingV2ServiceMod.ServiceContext
import typings.twilio.ipMessagingV2ServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipMessagingMod {
  
  @JSImport("twilio/lib/rest/IpMessaging", JSImport.Namespace)
  @js.native
  open class ^ protected () extends IpMessaging {
    /**
      * Initialize ip_messaging domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait IpMessaging
    extends typings.twilio.domainMod.^ {
    
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
    
    val v1: typings.twilio.ipMessagingV1Mod.^ = js.native
    
    val v2: typings.twilio.ipMessagingV2Mod.^ = js.native
  }
}
