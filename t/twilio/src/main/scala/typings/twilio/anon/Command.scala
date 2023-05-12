package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  var accountSid: String
  
  var command: String
  
  var commandMode: String
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var deviceSid: String
  
  var direction: String
  
  var sid: String
  
  var simSid: String
  
  var status: String
  
  var url: String
}
object Command {
  
  inline def apply(
    accountSid: String,
    command: String,
    commandMode: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    deviceSid: String,
    direction: String,
    sid: String,
    simSid: String,
    status: String,
    url: String
  ): Command = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], commandMode = commandMode.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], deviceSid = deviceSid.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], simSid = simSid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandMode(value: String): Self = StObject.set(x, "commandMode", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
