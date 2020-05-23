package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFoldersChangeEvent extends js.Object {
  /**
    * Added workspace folders.
    */
  val added: js.Array[WorkspaceFolder]
  /**
    * Removed workspace folders.
    */
  val removed: js.Array[WorkspaceFolder]
}

object WorkspaceFoldersChangeEvent {
  @scala.inline
  def apply(added: js.Array[WorkspaceFolder], removed: js.Array[WorkspaceFolder]): WorkspaceFoldersChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFoldersChangeEvent]
  }
}

