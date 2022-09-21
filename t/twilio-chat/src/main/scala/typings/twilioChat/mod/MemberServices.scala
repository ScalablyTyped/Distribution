package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberServices extends StObject {
  
  var commandExecutor: CommandExecutor
  
  var users: Users
}
object MemberServices {
  
  inline def apply(commandExecutor: CommandExecutor, users: Users): MemberServices = {
    val __obj = js.Dynamic.literal(commandExecutor = commandExecutor.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberServices]
  }
  
  extension [Self <: MemberServices](x: Self) {
    
    inline def setCommandExecutor(value: CommandExecutor): Self = StObject.set(x, "commandExecutor", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
