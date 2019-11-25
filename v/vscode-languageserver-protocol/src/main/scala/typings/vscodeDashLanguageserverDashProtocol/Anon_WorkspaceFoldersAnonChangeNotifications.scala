package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WorkspaceFoldersAnonChangeNotifications extends js.Object {
  var workspaceFolders: js.UndefOr[Anon_ChangeNotifications] = js.undefined
}

object Anon_WorkspaceFoldersAnonChangeNotifications {
  @scala.inline
  def apply(workspaceFolders: Anon_ChangeNotifications = null): Anon_WorkspaceFoldersAnonChangeNotifications = {
    val __obj = js.Dynamic.literal()
    if (workspaceFolders != null) __obj.updateDynamic("workspaceFolders")(workspaceFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WorkspaceFoldersAnonChangeNotifications]
  }
}

