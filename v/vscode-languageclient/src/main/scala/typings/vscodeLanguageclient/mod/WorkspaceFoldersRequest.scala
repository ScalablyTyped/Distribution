package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "WorkspaceFoldersRequest")
@js.native
object WorkspaceFoldersRequest extends js.Object {
  val `type`: ProtocolRequestType0[js.Array[WorkspaceFolder] | Null, scala.Nothing, Unit, Unit] = js.native
}

