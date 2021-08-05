package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  /**
    * Arguments that the command handler should be
    * invoked with.
    */
  var arguments: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * The identifier of the actual command handler.
    */
  var command: String
  
  /**
    * Title of the command, like `save`.
    */
  var title: String
}
object Command {
  
  inline def apply(command: String, title: String): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @JSImport("vscode-languageserver-types", "Command")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Command literal.
    */
  inline def create(title: String, command: String, args: js.Any*): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Command]
  
  /**
    * Checks whether the given literal conforms to the [Command](#Command) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Command */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Command */ Boolean]
  
  extension [Self <: Command](x: Self) {
    
    inline def setArguments(value: js.Array[js.Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
