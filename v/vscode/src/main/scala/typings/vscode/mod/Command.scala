package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  /**
    * Arguments that the command handler should be
    * invoked with.
    */
  var arguments: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The identifier of the actual command handler.
    * @see {@link commands.registerCommand}
    */
  var command: String
  
  /**
    * Title of the command, like `save`.
    */
  var title: String
  
  /**
    * A tooltip for the command, when represented in the UI.
    */
  var tooltip: js.UndefOr[String] = js.undefined
}
object Command {
  
  inline def apply(command: String, title: String): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  extension [Self <: Command](x: Self) {
    
    inline def setArguments(value: js.Array[Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: Any*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
