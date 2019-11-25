package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod

import typings.vscodeDashLanguageserverDashProtocol.Anon_WorkspaceFoldersAnonChangeNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFoldersServerCapabilities extends js.Object {
  /**
    * The workspace server capabilities
    */
  var workspace: js.UndefOr[Anon_WorkspaceFoldersAnonChangeNotifications] = js.undefined
}

object WorkspaceFoldersServerCapabilities {
  @scala.inline
  def apply(workspace: Anon_WorkspaceFoldersAnonChangeNotifications = null): WorkspaceFoldersServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFoldersServerCapabilities]
  }
}

