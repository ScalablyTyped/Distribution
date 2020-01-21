package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWorkspaceFolders extends js.Object {
  /**
    * The client has support for workspace folders
    */
  var workspaceFolders: js.UndefOr[Boolean] = js.undefined
}

object AnonWorkspaceFolders {
  @scala.inline
  def apply(workspaceFolders: js.UndefOr[Boolean] = js.undefined): AnonWorkspaceFolders = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(workspaceFolders)) __obj.updateDynamic("workspaceFolders")(workspaceFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWorkspaceFolders]
  }
}

