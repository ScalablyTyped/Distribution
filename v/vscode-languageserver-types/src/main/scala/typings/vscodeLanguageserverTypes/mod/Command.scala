package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends StObject {
  
  /**
    * Arguments that the command handler should be
    * invoked with.
    */
  var arguments: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The identifier of the actual command handler.
    */
  var command: String = js.native
  
  /**
    * Title of the command, like `save`.
    */
  var title: String = js.native
}
object Command {
  
  @scala.inline
  def apply(command: String, title: String): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  /**
    * Creates a new Command literal.
    */
  @JSImport("vscode-languageserver-types", "Command.create")
  @js.native
  def create(title: String, command: String, args: js.Any*): Command = js.native
  
  /**
    * Checks whether the given literal conforms to the [Command](#Command) interface.
    */
  @JSImport("vscode-languageserver-types", "Command.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Command */ Boolean = js.native
  
  @scala.inline
  implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
