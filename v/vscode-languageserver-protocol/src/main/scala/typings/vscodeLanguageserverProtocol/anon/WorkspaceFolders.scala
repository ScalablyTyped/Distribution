package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolders extends js.Object {
  /**
    * The client has support for workspace folders
    */
  var workspaceFolders: js.UndefOr[Boolean] = js.undefined
}

object WorkspaceFolders {
  @scala.inline
  def apply(workspaceFolders: js.UndefOr[Boolean] = js.undefined): WorkspaceFolders = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(workspaceFolders)) __obj.updateDynamic("workspaceFolders")(workspaceFolders.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFolders]
  }
}

