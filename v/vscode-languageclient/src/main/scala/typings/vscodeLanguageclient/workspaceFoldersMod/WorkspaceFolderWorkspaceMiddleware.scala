package typings.vscodeLanguageclient.workspaceFoldersMod

import typings.vscode.mod.WorkspaceFoldersChangeEvent
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.mod.HandlerResult
import typings.vscodeLanguageclient.clientMod.NextSignature
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.HandlerSignature
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.MiddlewareSignature
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
    workspaceFolders: (/* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[WorkspaceFolder] | Null, Unit] = null
  ): WorkspaceFolderWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    if (didChangeWorkspaceFolders != null) __obj.updateDynamic("didChangeWorkspaceFolders")(didChangeWorkspaceFolders.asInstanceOf[js.Any])
    if (workspaceFolders != null) __obj.updateDynamic("workspaceFolders")(js.Any.fromFunction2(workspaceFolders))
    __obj.asInstanceOf[WorkspaceFolderWorkspaceMiddleware]
  }
}

