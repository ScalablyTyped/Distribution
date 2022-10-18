package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteCommandOptions
  extends StObject
     with WorkDoneProgressOptions {
  
  /**
    * The commands to be executed on the server
    */
  var commands: js.Array[String]
}
object ExecuteCommandOptions {
  
  inline def apply(commands: js.Array[String]): ExecuteCommandOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteCommandOptions]
  }
  
  extension [Self <: ExecuteCommandOptions](x: Self) {
    
    inline def setCommands(value: js.Array[String]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: String*): Self = StObject.set(x, "commands", js.Array(value*))
  }
}
