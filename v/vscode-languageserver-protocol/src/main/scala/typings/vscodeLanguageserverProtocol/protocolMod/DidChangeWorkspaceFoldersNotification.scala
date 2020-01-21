package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.NotificationType
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.DidChangeWorkspaceFoldersParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DidChangeWorkspaceFoldersNotification")
@js.native
object DidChangeWorkspaceFoldersNotification extends js.Object {
  val `type`: NotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
}

