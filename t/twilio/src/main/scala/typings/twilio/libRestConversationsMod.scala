package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestConversationsMod {
  
  @JSImport("twilio/lib/rest/Conversations", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Conversations {
    /**
      * Initialize conversations domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Conversations
    extends typings.twilio.libBaseDomainMod.^ {
    
    val addressConfigurations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddressConfigurationListInstance */ Any = js.native
    
    val configuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigurationListInstance */ Any = js.native
    
    val conversations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConversationListInstance */ Any = js.native
    
    val credentials: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any = js.native
    
    val participantConversations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParticipantConversationListInstance */ Any = js.native
    
    val roles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RoleListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val users: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestConversationsV1Mod.^ = js.native
  }
}
