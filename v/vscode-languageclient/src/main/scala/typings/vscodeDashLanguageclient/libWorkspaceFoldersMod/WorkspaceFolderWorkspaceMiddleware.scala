package typings.vscodeDashLanguageclient.libWorkspaceFoldersMod

import typings.vscode.vscodeMod.WorkspaceFoldersChangeEvent
import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.HandlerResult
import typings.vscodeDashLanguageclient.libClientMod.NextSignature
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.WorkspaceFolder
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersRequest.HandlerSignature
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersRequest.MiddlewareSignature
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

