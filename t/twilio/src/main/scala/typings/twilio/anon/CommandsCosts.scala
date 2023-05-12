package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsCosts extends StObject {
  
  var accountSid: String
  
  var commandsCosts: Any
  
  var commandsUsage: Any
  
  var dataCosts: Any
  
  var dataUsage: Any
  
  var period: Any
  
  var simSid: String
  
  var simUniqueName: String
  
  var url: String
}
object CommandsCosts {
  
  inline def apply(
    accountSid: String,
    commandsCosts: Any,
    commandsUsage: Any,
    dataCosts: Any,
    dataUsage: Any,
    period: Any,
    simSid: String,
    simUniqueName: String,
    url: String
  ): CommandsCosts = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], commandsCosts = commandsCosts.asInstanceOf[js.Any], commandsUsage = commandsUsage.asInstanceOf[js.Any], dataCosts = dataCosts.asInstanceOf[js.Any], dataUsage = dataUsage.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], simSid = simSid.asInstanceOf[js.Any], simUniqueName = simUniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsCosts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandsCosts] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setCommandsCosts(value: Any): Self = StObject.set(x, "commandsCosts", value.asInstanceOf[js.Any])
    
    inline def setCommandsUsage(value: Any): Self = StObject.set(x, "commandsUsage", value.asInstanceOf[js.Any])
    
    inline def setDataCosts(value: Any): Self = StObject.set(x, "dataCosts", value.asInstanceOf[js.Any])
    
    inline def setDataUsage(value: Any): Self = StObject.set(x, "dataUsage", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Any): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
    
    inline def setSimUniqueName(value: String): Self = StObject.set(x, "simUniqueName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
