package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFoldersServerCapabilities extends js.Object {
  /**
    * The workspace server capabilities
    */
  var workspace: js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.Anon_WorkspaceFoldersAnonChangeNotifications
  ] = js.undefined
}

object WorkspaceFoldersServerCapabilities {
  @scala.inline
  def apply(
    workspace: vscodeDashLanguageserverDashProtocolLib.Anon_WorkspaceFoldersAnonChangeNotifications = null
  ): WorkspaceFoldersServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (workspace != null) __obj.updateDynamic("workspace")(workspace)
    __obj.asInstanceOf[WorkspaceFoldersServerCapabilities]
  }
}

