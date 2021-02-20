package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteCommandOptions extends WorkDoneProgressOptions {
  
  /**
    * The commands to be executed on the server
    */
  var commands: js.Array[String] = js.native
}
object ExecuteCommandOptions {
  
  @scala.inline
  def apply(commands: js.Array[String]): ExecuteCommandOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteCommandOptions]
  }
  
  @scala.inline
  implicit class ExecuteCommandOptionsMutableBuilder[Self <: ExecuteCommandOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: js.Array[String]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsVarargs(value: String*): Self = StObject.set(x, "commands", js.Array(value :_*))
  }
}
