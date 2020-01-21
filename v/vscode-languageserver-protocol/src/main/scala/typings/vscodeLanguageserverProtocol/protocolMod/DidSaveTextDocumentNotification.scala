package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.NotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DidSaveTextDocumentNotification")
@js.native
object DidSaveTextDocumentNotification extends js.Object {
  val `type`: NotificationType[DidSaveTextDocumentParams, TextDocumentSaveRegistrationOptions] = js.native
}

