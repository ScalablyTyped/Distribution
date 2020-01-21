package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.RequestType0
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "WorkspaceFoldersRequest")
@js.native
object WorkspaceFoldersRequest extends js.Object {
  val `type`: RequestType0[js.Array[WorkspaceFolder] | Null, Unit, Unit] = js.native
}

