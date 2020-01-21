package typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFoldersInitializeParams extends js.Object {
  /**
    * The actual configured workspace folders.
    */
  var workspaceFolders: js.Array[WorkspaceFolder] | Null
}

object WorkspaceFoldersInitializeParams {
  @scala.inline
  def apply(workspaceFolders: js.Array[WorkspaceFolder] = null): WorkspaceFoldersInitializeParams = {
    val __obj = js.Dynamic.literal()
    if (workspaceFolders != null) __obj.updateDynamic("workspaceFolders")(workspaceFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFoldersInitializeParams]
  }
}

