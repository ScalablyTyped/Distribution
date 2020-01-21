package typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typings.vscodeLanguageserverProtocol.AnonWorkspaceFoldersAnonChangeNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFoldersServerCapabilities extends js.Object {
  /**
    * The workspace server capabilities
    */
  var workspace: js.UndefOr[AnonWorkspaceFoldersAnonChangeNotifications] = js.undefined
}

object WorkspaceFoldersServerCapabilities {
  @scala.inline
  def apply(workspace: AnonWorkspaceFoldersAnonChangeNotifications = null): WorkspaceFoldersServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFoldersServerCapabilities]
  }
}

