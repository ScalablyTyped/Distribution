package typings.twilio

import typings.twilio.libRestConversationsBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestConversationsV1Mod {
  
  @JSImport("twilio/lib/rest/conversations/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Conversations
      *
      * @param domain - The Twilio (Twilio.Conversations) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** addressConfigurations - { Twilio.Conversations.V1.AddressConfigurationListInstance } resource */
    /* protected */ var _addressConfigurations: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddressConfigurationListInstance */ Any
      ] = js.native
    
    /** configuration - { Twilio.Conversations.V1.ConfigurationListInstance } resource */
    /* protected */ var _configuration: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigurationListInstance */ Any
      ] = js.native
    
    /** conversations - { Twilio.Conversations.V1.ConversationListInstance } resource */
    /* protected */ var _conversations: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConversationListInstance */ Any
      ] = js.native
    
    /** credentials - { Twilio.Conversations.V1.CredentialListInstance } resource */
    /* protected */ var _credentials: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any
      ] = js.native
    
    /** participantConversations - { Twilio.Conversations.V1.ParticipantConversationListInstance } resource */
    /* protected */ var _participantConversations: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParticipantConversationListInstance */ Any
      ] = js.native
    
    /** roles - { Twilio.Conversations.V1.RoleListInstance } resource */
    /* protected */ var _roles: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RoleListInstance */ Any
      ] = js.native
    
    /** services - { Twilio.Conversations.V1.ServiceListInstance } resource */
    /* protected */ var _services: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any
      ] = js.native
    
    /** users - { Twilio.Conversations.V1.UserListInstance } resource */
    /* protected */ var _users: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserListInstance */ Any
      ] = js.native
    
    /** Getter for addressConfigurations resource */
    def addressConfigurations: Any = js.native
    
    /** Getter for configuration resource */
    def configuration: Any = js.native
    
    /** Getter for conversations resource */
    def conversations: Any = js.native
    
    /** Getter for credentials resource */
    def credentials: Any = js.native
    
    /** Getter for participantConversations resource */
    def participantConversations: Any = js.native
    
    /** Getter for roles resource */
    def roles: Any = js.native
    
    /** Getter for services resource */
    def services: Any = js.native
    
    /** Getter for users resource */
    def users: Any = js.native
  }
}
