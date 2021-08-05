package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserData extends StObject {
  
  var command: String
  
  var date: String
  
  var ip: String
  
  var time: String
  
  var tty: String
  
  var user: String
}
object UserData {
  
  inline def apply(command: String, date: String, ip: String, time: String, tty: String, user: String): UserData = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserData]
  }
  
  extension [Self <: UserData](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTty(value: String): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
