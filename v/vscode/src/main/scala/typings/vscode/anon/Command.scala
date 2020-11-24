package typings.vscode.anon

import typings.vscode.mod.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends js.Object {
  
  /**
    * Command that displays the documentation to the user.
    *
    * This can display the documentation directly in VS Code or open a website using [`env.openExternal`](#env.openExternal);
    *
    * The title of this documentation code action is taken from [`Command.title`](#Command.title)
    */
  val command: typings.vscode.mod.Command = js.native
  
  /**
    * The kind of the code action being documented.
    *
    * If the kind is generic, such as `CodeActionKind.Refactor`, the documentation will be shown whenever any
    * refactorings are returned. If the kind if more specific, such as `CodeActionKind.RefactorExtract`, the
    * documentation will only be shown when extract refactoring code actions are returned.
    */
  val kind: CodeActionKind = js.native
}
object Command {
  
  @scala.inline
  def apply(command: typings.vscode.mod.Command, kind: CodeActionKind): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommand(value: typings.vscode.mod.Command): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: CodeActionKind): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
}
