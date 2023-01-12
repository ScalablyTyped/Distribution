package typings.twilioChat.mod

import typings.twilioMcsClient.mod.McsClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageServices extends StObject {
  
  var commandExecutor: CommandExecutor
  
  var mcsClient: McsClient
}
object MessageServices {
  
  inline def apply(commandExecutor: CommandExecutor, mcsClient: McsClient): MessageServices = {
    val __obj = js.Dynamic.literal(commandExecutor = commandExecutor.asInstanceOf[js.Any], mcsClient = mcsClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageServices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageServices] (val x: Self) extends AnyVal {
    
    inline def setCommandExecutor(value: CommandExecutor): Self = StObject.set(x, "commandExecutor", value.asInstanceOf[js.Any])
    
    inline def setMcsClient(value: McsClient): Self = StObject.set(x, "mcsClient", value.asInstanceOf[js.Any])
  }
}
