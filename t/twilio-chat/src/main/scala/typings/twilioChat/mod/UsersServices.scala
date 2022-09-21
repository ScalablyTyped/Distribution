package typings.twilioChat.mod

import typings.twilioSync.mod.SyncClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersServices extends StObject {
  
  var commandExecutor: CommandExecutor
  
  var network: Network
  
  var syncClient: SyncClient
}
object UsersServices {
  
  inline def apply(commandExecutor: CommandExecutor, network: Network, syncClient: SyncClient): UsersServices = {
    val __obj = js.Dynamic.literal(commandExecutor = commandExecutor.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersServices]
  }
  
  extension [Self <: UsersServices](x: Self) {
    
    inline def setCommandExecutor(value: CommandExecutor): Self = StObject.set(x, "commandExecutor", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
  }
}
