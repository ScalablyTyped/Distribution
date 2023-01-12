package typings.vscode.anon

import typings.vscode.mod.CodeActionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  /**
    * Command that displays the documentation to the user.
    *
    * This can display the documentation directly in the editor or open a website using {@linkcode env.openExternal};
    *
    * The title of this documentation code action is taken from {@linkcode Command.title}
    */
  val command: typings.vscode.mod.Command
  
  /**
    * The kind of the code action being documented.
    *
    * If the kind is generic, such as `CodeActionKind.Refactor`, the documentation will be shown whenever any
    * refactorings are returned. If the kind if more specific, such as `CodeActionKind.RefactorExtract`, the
    * documentation will only be shown when extract refactoring code actions are returned.
    */
  val kind: CodeActionKind
}
object Command {
  
  inline def apply(command: typings.vscode.mod.Command, kind: CodeActionKind): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: typings.vscode.mod.Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setKind(value: CodeActionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
