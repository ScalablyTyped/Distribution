package typings.twilioChat.mod

import typings.twilioMcsClient.mod.McsClient
import typings.twilioSync.mod.SyncClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsServices extends StObject {
  
  var commandExecutor: CommandExecutor
  
  var mcsClient: McsClient
  
  var network: Network
  
  var syncClient: SyncClient
  
  var typingIndicator: TypingIndicator
  
  var users: Users
}
object ChannelsServices {
  
  inline def apply(
    commandExecutor: CommandExecutor,
    mcsClient: McsClient,
    network: Network,
    syncClient: SyncClient,
    typingIndicator: TypingIndicator,
    users: Users
  ): ChannelsServices = {
    val __obj = js.Dynamic.literal(commandExecutor = commandExecutor.asInstanceOf[js.Any], mcsClient = mcsClient.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], typingIndicator = typingIndicator.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelsServices]
  }
  
  extension [Self <: ChannelsServices](x: Self) {
    
    inline def setCommandExecutor(value: CommandExecutor): Self = StObject.set(x, "commandExecutor", value.asInstanceOf[js.Any])
    
    inline def setMcsClient(value: McsClient): Self = StObject.set(x, "mcsClient", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
    
    inline def setTypingIndicator(value: TypingIndicator): Self = StObject.set(x, "typingIndicator", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
