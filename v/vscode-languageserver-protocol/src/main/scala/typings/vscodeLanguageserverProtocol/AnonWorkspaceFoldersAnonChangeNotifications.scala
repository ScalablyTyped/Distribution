package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWorkspaceFoldersAnonChangeNotifications extends js.Object {
  var workspaceFolders: js.UndefOr[AnonChangeNotifications] = js.undefined
}

object AnonWorkspaceFoldersAnonChangeNotifications {
  @scala.inline
  def apply(workspaceFolders: AnonChangeNotifications = null): AnonWorkspaceFoldersAnonChangeNotifications = {
    val __obj = js.Dynamic.literal()
    if (workspaceFolders != null) __obj.updateDynamic("workspaceFolders")(workspaceFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWorkspaceFoldersAnonChangeNotifications]
  }
}

