package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFoldersChangeEvent extends js.Object {
  /**
    * Added workspace folders.
    */
  val added: js.Array[WorkspaceFolder] = js.native
  /**
    * Removed workspace folders.
    */
  val removed: js.Array[WorkspaceFolder] = js.native
}

object WorkspaceFoldersChangeEvent {
  @scala.inline
  def apply(added: js.Array[WorkspaceFolder], removed: js.Array[WorkspaceFolder]): WorkspaceFoldersChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFoldersChangeEvent]
  }
  @scala.inline
  implicit class WorkspaceFoldersChangeEventOps[Self <: WorkspaceFoldersChangeEvent] (val x: Self) extends AnyVal {
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
    def setAddedVarargs(value: WorkspaceFolder*): Self = this.set("added", js.Array(value :_*))
    @scala.inline
    def setAdded(value: js.Array[WorkspaceFolder]): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedVarargs(value: WorkspaceFolder*): Self = this.set("removed", js.Array(value :_*))
    @scala.inline
    def setRemoved(value: js.Array[WorkspaceFolder]): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
  
}

