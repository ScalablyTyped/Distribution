package typings
package vscodeDashLanguageclientLib.libWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolderWorkspaceMiddleware extends js.Object {
  var didChangeWorkspaceFolders: js.UndefOr[
    vscodeDashLanguageclientLib.libClientMod.NextSignature[vscodeLib.vscodeMod.WorkspaceFoldersChangeEvent, scala.Unit]
  ] = js.undefined
  var workspaceFolders: js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersRequestNs.MiddlewareSignature
  ] = js.undefined
}

object WorkspaceFolderWorkspaceMiddleware {
  @scala.inline
  def apply(
    didChangeWorkspaceFolders: vscodeDashLanguageclientLib.libClientMod.NextSignature[vscodeLib.vscodeMod.WorkspaceFoldersChangeEvent, scala.Unit] = null,
    workspaceFolders: vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersRequestNs.MiddlewareSignature = null
  ): WorkspaceFolderWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    if (didChangeWorkspaceFolders != null) __obj.updateDynamic("didChangeWorkspaceFolders")(didChangeWorkspaceFolders)
    if (workspaceFolders != null) __obj.updateDynamic("workspaceFolders")(workspaceFolders)
    __obj.asInstanceOf[WorkspaceFolderWorkspaceMiddleware]
  }
}

