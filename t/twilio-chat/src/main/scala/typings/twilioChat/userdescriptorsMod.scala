package typings.twilioChat

import typings.twilioChat.networkMod.Network
import typings.twilioChat.restpaginatorMod.RestPaginator
import typings.twilioChat.userdescriptorMod.UserDescriptor
import typings.twilioChat.usersMod.Users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userdescriptorsMod {
  
  @JSImport("twilio-chat/lib/data/userdescriptors", "UserDescriptors")
  @js.native
  class UserDescriptors protected () extends StObject {
    def this(services: UserDescriptorsServices, url: String) = this()
    
    def getChannelUserDescriptors(channelSid: String): js.Promise[RestPaginator[UserDescriptor]] = js.native
    def getChannelUserDescriptors(channelSid: String, args: js.Any): js.Promise[RestPaginator[UserDescriptor]] = js.native
    
    def getUserDescriptor(identity: String): js.Promise[UserDescriptor] = js.native
    
    /* private */ var services: js.Any = js.native
    
    /* private */ var url: js.Any = js.native
  }
  
  trait UserDescriptorsServices extends StObject {
    
    var network: Network
    
    var users: Users
  }
  object UserDescriptorsServices {
    
    inline def apply(network: Network, users: Users): UserDescriptorsServices = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDescriptorsServices]
    }
    
    extension [Self <: UserDescriptorsServices](x: Self) {
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
