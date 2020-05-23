package typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typings.vscodeLanguageserverProtocol.anon.WorkspaceFoldersChangeNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFoldersServerCapabilities extends js.Object {
  /**
    * The workspace server capabilities
    */
  var workspace: js.UndefOr[WorkspaceFoldersChangeNotifications] = js.undefined
}

object WorkspaceFoldersServerCapabilities {
  @scala.inline
  def apply(workspace: WorkspaceFoldersChangeNotifications = null): WorkspaceFoldersServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFoldersServerCapabilities]
  }
}

