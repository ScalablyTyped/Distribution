package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyWorkspaceEditParams extends js.Object {
  
  /**
    * The edits to apply.
    */
  var edit: WorkspaceEdit = js.native
  
  /**
    * An optional label of the workspace edit. This label is
    * presented in the user interface for example on an undo
    * stack to undo the workspace edit.
    */
  var label: js.UndefOr[String] = js.native
}
object ApplyWorkspaceEditParams {
  
  @scala.inline
  def apply(edit: WorkspaceEdit): ApplyWorkspaceEditParams = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWorkspaceEditParams]
  }
  
  @scala.inline
  implicit class ApplyWorkspaceEditParamsOps[Self <: ApplyWorkspaceEditParams] (val x: Self) extends AnyVal {
    
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
    def setEdit(value: WorkspaceEdit): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
