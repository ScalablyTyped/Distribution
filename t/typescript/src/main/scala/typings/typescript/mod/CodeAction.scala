package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeAction extends js.Object {
  /** Text changes to apply to each file as part of the code action */
  var changes: js.Array[FileTextChanges] = js.native
  /**
    * If the user accepts the code fix, the editor should send the action back in a `applyAction` request.
    * This allows the language service to have side effects (e.g. installing dependencies) upon a code fix.
    */
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.native
  /** Description of the code action to display in the UI of the editor */
  var description: java.lang.String = js.native
}

object CodeAction {
  @scala.inline
  def apply(changes: js.Array[FileTextChanges], description: java.lang.String): CodeAction = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAction]
  }
  @scala.inline
  implicit class CodeActionOps[Self <: CodeAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangesVarargs(value: FileTextChanges*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[FileTextChanges]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: java.lang.String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandsVarargs(value: CodeActionCommand*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[CodeActionCommand]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
  }
  
}

