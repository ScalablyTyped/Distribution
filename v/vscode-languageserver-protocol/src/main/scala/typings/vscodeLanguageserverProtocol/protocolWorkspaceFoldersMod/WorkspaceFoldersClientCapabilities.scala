package typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typings.vscodeLanguageserverProtocol.AnonWorkspaceFolders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFoldersClientCapabilities extends js.Object {
  /**
    * The workspace client capabilities
    */
  var workspace: js.UndefOr[AnonWorkspaceFolders] = js.undefined
}

object WorkspaceFoldersClientCapabilities {
  @scala.inline
  def apply(workspace: AnonWorkspaceFolders = null): WorkspaceFoldersClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFoldersClientCapabilities]
  }
}

