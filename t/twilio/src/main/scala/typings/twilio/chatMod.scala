package typings.twilio

import typings.twilio.v2CredentialMod.CredentialContext
import typings.twilio.v2CredentialMod.CredentialListInstance
import typings.twilio.v2ServiceMod.ServiceContext
import typings.twilio.v2ServiceMod.ServiceListInstance
import typings.twilio.v3ChannelMod.ChannelContext
import typings.twilio.v3ChannelMod.ChannelListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatMod {
  
  @JSImport("twilio/lib/rest/Chat", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Chat {
    /**
      * Initialize chat domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Chat
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def channels(sid: String): ChannelContext = js.native
    @JSName("channels")
    val channels_Original: ChannelListInstance = js.native
    
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
    
    val v1: typings.twilio.chatV1Mod.^ = js.native
    
    val v2: typings.twilio.v2Mod.^ = js.native
    
    val v3: typings.twilio.v3Mod.^ = js.native
  }
}
