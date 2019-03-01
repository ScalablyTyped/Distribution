package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFoldersClientCapabilities extends js.Object {
  /**
    * The workspace client capabilities
    */
  var workspace: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_WorkspaceFolders] = js.undefined
}

object WorkspaceFoldersClientCapabilities {
  @scala.inline
  def apply(workspace: vscodeDashLanguageserverDashProtocolLib.Anon_WorkspaceFolders = null): WorkspaceFoldersClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (workspace != null) __obj.updateDynamic("workspace")(workspace)
    __obj.asInstanceOf[WorkspaceFoldersClientCapabilities]
  }
}

