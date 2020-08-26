package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedCodeActions extends js.Object {
  var changes: js.Array[FileTextChanges] = js.native
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.native
}

object CombinedCodeActions {
  @scala.inline
  def apply(changes: js.Array[FileTextChanges]): CombinedCodeActions = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedCodeActions]
  }
  @scala.inline
  implicit class CombinedCodeActionsOps[Self <: CombinedCodeActions] (val x: Self) extends AnyVal {
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
    def setCommandsVarargs(value: CodeActionCommand*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[CodeActionCommand]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
  }
  
}

