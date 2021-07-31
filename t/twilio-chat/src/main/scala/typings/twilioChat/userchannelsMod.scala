package typings.twilioChat

import typings.twilioChat.channeldescriptorMod.ChannelDescriptor
import typings.twilioChat.mod.Client
import typings.twilioChat.networkMod.Network
import typings.twilioChat.restpaginatorMod.RestPaginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userchannelsMod {
  
  /**
    * Users channels collection
    * It's a cassandra-backed pull-based collection
    */
  @JSImport("twilio-chat/lib/data/userchannels", "UserChannels")
  @js.native
  class UserChannels protected () extends StObject {
    def this(client: Client, services: UserChannelServices, url: String) = this()
    
    var client: js.Any = js.native
    
    def getChannels(): js.Promise[RestPaginator[ChannelDescriptor]] = js.native
    def getChannels(args: js.Any): js.Promise[RestPaginator[ChannelDescriptor]] = js.native
    
    var services: js.Any = js.native
    
    var url: js.Any = js.native
  }
  
  trait UserChannelServices extends StObject {
    
    var network: Network
  }
  object UserChannelServices {
    
    @scala.inline
    def apply(network: Network): UserChannelServices = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserChannelServices]
    }
    
    @scala.inline
    implicit class UserChannelServicesMutableBuilder[Self <: UserChannelServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    }
  }
}
