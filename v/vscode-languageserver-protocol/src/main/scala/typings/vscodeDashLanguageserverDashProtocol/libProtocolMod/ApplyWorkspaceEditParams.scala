package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyWorkspaceEditParams extends js.Object {
  /**
    * The edits to apply.
    */
  var edit: WorkspaceEdit
  /**
    * An optional label of the workspace edit. This label is
    * presented in the user interface for example on an undo
    * stack to undo the workspace edit.
    */
  var label: js.UndefOr[String] = js.undefined
}

object ApplyWorkspaceEditParams {
  @scala.inline
  def apply(edit: WorkspaceEdit, label: String = null): ApplyWorkspaceEditParams = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWorkspaceEditParams]
  }
}

