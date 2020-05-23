package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFoldersChangeNotifications extends js.Object {
  var workspaceFolders: js.UndefOr[ChangeNotifications] = js.undefined
}

object WorkspaceFoldersChangeNotifications {
  @scala.inline
  def apply(workspaceFolders: ChangeNotifications = null): WorkspaceFoldersChangeNotifications = {
    val __obj = js.Dynamic.literal()
    if (workspaceFolders != null) __obj.updateDynamic("workspaceFolders")(workspaceFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFoldersChangeNotifications]
  }
}

