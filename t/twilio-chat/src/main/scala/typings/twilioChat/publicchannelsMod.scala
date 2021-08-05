package typings.twilioChat

import typings.twilioChat.channeldescriptorMod.ChannelDescriptor
import typings.twilioChat.mod.Client
import typings.twilioChat.networkMod.Network
import typings.twilioChat.restpaginatorMod.RestPaginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicchannelsMod {
  
  /**
    * Public channels collection
    * It's a cassandra-backed pull-based collection
    */
  @JSImport("twilio-chat/lib/data/publicchannels", "PublicChannels")
  @js.native
  class PublicChannels protected () extends StObject {
    def this(client: Client, services: PublicChannelServices, url: String) = this()
    
    /* private */ var client: js.Any = js.native
    
    def getChannelBySid(sid: String): js.Promise[ChannelDescriptor] = js.native
    
    def getChannelByUniqueName(uniqueName: String): js.Promise[ChannelDescriptor] = js.native
    
    def getChannels(): js.Promise[RestPaginator[ChannelDescriptor]] = js.native
    def getChannels(args: js.Any): js.Promise[RestPaginator[ChannelDescriptor]] = js.native
    
    /* private */ var services: js.Any = js.native
    
    /* private */ var url: js.Any = js.native
  }
  
  trait PublicChannelServices extends StObject {
    
    var network: Network
  }
  object PublicChannelServices {
    
    inline def apply(network: Network): PublicChannelServices = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicChannelServices]
    }
    
    extension [Self <: PublicChannelServices](x: Self) {
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    }
  }
}
