package typings.vscodeDashLanguageclient.libWorkspaceFoldersMod

import typings.vscode.vscodeMod.WorkspaceFoldersChangeEvent
import typings.vscodeDashLanguageclient.libClientMod.NextSignature
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersRequestNs.MiddlewareSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolderWorkspaceMiddleware extends js.Object {
  var didChangeWorkspaceFolders: js.UndefOr[NextSignature[WorkspaceFoldersChangeEvent, Unit]] = js.undefined
  var workspaceFolders: js.UndefOr[MiddlewareSignature] = js.undefined
}

object WorkspaceFolderWorkspaceMiddleware {
  @scala.inline
  def apply(
    didChangeWorkspaceFolders: NextSignature[WorkspaceFoldersChangeEvent, Unit] = null,
    workspaceFolders: MiddlewareSignature = null
  ): WorkspaceFolderWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    if (didChangeWorkspaceFolders != null) __obj.updateDynamic("didChangeWorkspaceFolders")(didChangeWorkspaceFolders)
    if (workspaceFolders != null) __obj.updateDynamic("workspaceFolders")(workspaceFolders)
    __obj.asInstanceOf[WorkspaceFolderWorkspaceMiddleware]
  }
}

