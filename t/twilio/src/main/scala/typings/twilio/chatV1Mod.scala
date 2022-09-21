package typings.twilio

import typings.twilio.serviceMod.ServiceContext
import typings.twilio.serviceMod.ServiceListInstance
import typings.twilio.v1CredentialMod.CredentialContext
import typings.twilio.v1CredentialMod.CredentialListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatV1Mod {
  
  @JSImport("twilio/lib/rest/chat/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Chat
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.chatMod.^) = this()
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
