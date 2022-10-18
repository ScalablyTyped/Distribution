package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestConversationsV1Mod {
  
  @JSImport("twilio/lib/rest/conversations/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Conversations
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestConversationsMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val addressConfigurations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddressConfigurationListInstance */ Any = js.native
    
    val configuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigurationListInstance */ Any = js.native
    
    val conversations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConversationListInstance */ Any = js.native
    
    val credentials: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any = js.native
    
    val participantConversations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParticipantConversationListInstance */ Any = js.native
    
    val roles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RoleListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val users: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserListInstance */ Any = js.native
  }
}
