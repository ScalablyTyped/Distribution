package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of edits to make in response to a refactor action, plus an optional
  * location where renaming should be invoked from
  */
@js.native
trait RefactorEditInfo extends js.Object {
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.native
  var edits: js.Array[FileTextChanges] = js.native
  var renameFilename: js.UndefOr[java.lang.String] = js.native
  var renameLocation: js.UndefOr[Double] = js.native
}

object RefactorEditInfo {
  @scala.inline
  def apply(edits: js.Array[FileTextChanges]): RefactorEditInfo = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefactorEditInfo]
  }
  @scala.inline
  implicit class RefactorEditInfoOps[Self <: RefactorEditInfo] (val x: Self) extends AnyVal {
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
    def setEditsVarargs(value: FileTextChanges*): Self = this.set("edits", js.Array(value :_*))
    @scala.inline
    def setEdits(value: js.Array[FileTextChanges]): Self = this.set("edits", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandsVarargs(value: CodeActionCommand*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[CodeActionCommand]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    @scala.inline
    def setRenameFilename(value: java.lang.String): Self = this.set("renameFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenameFilename: Self = this.set("renameFilename", js.undefined)
    @scala.inline
    def setRenameLocation(value: Double): Self = this.set("renameLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenameLocation: Self = this.set("renameLocation", js.undefined)
  }
  
}

