package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDescriptorServices extends StObject {
  
  var users: Users
}
object UserDescriptorServices {
  
  inline def apply(users: Users): UserDescriptorServices = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDescriptorServices]
  }
  
  extension [Self <: UserDescriptorServices](x: Self) {
    
    inline def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
