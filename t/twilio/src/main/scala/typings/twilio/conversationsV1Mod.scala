package typings.twilio

import typings.twilio.addressConfigurationMod.AddressConfigurationContext
import typings.twilio.addressConfigurationMod.AddressConfigurationListInstance
import typings.twilio.configurationMod.ConfigurationContext
import typings.twilio.configurationMod.ConfigurationListInstance
import typings.twilio.conversationMod.ConversationContext
import typings.twilio.conversationMod.ConversationListInstance
import typings.twilio.conversationsV1CredentialMod.CredentialContext
import typings.twilio.conversationsV1CredentialMod.CredentialListInstance
import typings.twilio.participantConversationMod.ParticipantConversationListInstance
import typings.twilio.v1RoleMod.RoleContext
import typings.twilio.v1RoleMod.RoleListInstance
import typings.twilio.v1ServiceMod.ServiceContext
import typings.twilio.v1ServiceMod.ServiceListInstance
import typings.twilio.v1UserMod.UserContext
import typings.twilio.v1UserMod.UserListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversationsV1Mod {
  
  @JSImport("twilio/lib/rest/conversations/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Conversations
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.conversationsMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def addressConfigurations(sid: String): AddressConfigurationContext = js.native
    @JSName("addressConfigurations")
    val addressConfigurations_Original: AddressConfigurationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def configuration(sid: String): ConfigurationContext = js.native
    @JSName("configuration")
    val configuration_Original: ConfigurationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def conversations(sid: String): ConversationContext = js.native
    @JSName("conversations")
    val conversations_Original: ConversationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def credentials(sid: String): CredentialContext = js.native
    @JSName("credentials")
    val credentials_Original: CredentialListInstance = js.native
    
    val participantConversations: ParticipantConversationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def roles(sid: String): RoleContext = js.native
    @JSName("roles")
    val roles_Original: RoleListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def users(sid: String): UserContext = js.native
    @JSName("users")
    val users_Original: UserListInstance = js.native
  }
}
