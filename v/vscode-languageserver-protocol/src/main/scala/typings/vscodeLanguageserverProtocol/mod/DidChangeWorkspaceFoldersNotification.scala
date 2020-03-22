package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.DidChangeWorkspaceFoldersParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DidChangeWorkspaceFoldersNotification")
@js.native
object DidChangeWorkspaceFoldersNotification extends js.Object {
  val `type`: ProtocolNotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
}

