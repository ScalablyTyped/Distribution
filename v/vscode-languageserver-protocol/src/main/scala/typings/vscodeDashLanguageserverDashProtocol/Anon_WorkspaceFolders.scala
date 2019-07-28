package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WorkspaceFolders extends js.Object {
  /**
    * The client has support for workspace folders
    */
  var workspaceFolders: js.UndefOr[Boolean] = js.undefined
}

object Anon_WorkspaceFolders {
  @scala.inline
  def apply(workspaceFolders: js.UndefOr[Boolean] = js.undefined): Anon_WorkspaceFolders = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(workspaceFolders)) __obj.updateDynamic("workspaceFolders")(workspaceFolders)
    __obj.asInstanceOf[Anon_WorkspaceFolders]
  }
}

