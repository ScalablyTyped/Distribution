package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "WorkspaceFoldersRequest")
@js.native
object WorkspaceFoldersRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType0[js.Array[WorkspaceFolder] | Null, Unit, Unit] = js.native
}

