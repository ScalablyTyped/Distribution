package typings.twilio

import typings.twilio.notifyV1CredentialMod.CredentialContext
import typings.twilio.notifyV1CredentialMod.CredentialListInstance
import typings.twilio.notifyV1ServiceMod.ServiceContext
import typings.twilio.notifyV1ServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notifyMod {
  
  @JSImport("twilio/lib/rest/Notify", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Notify {
    /**
      * Initialize notify domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Notify
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
    
    val v1: typings.twilio.notifyV1Mod.^ = js.native
  }
}
