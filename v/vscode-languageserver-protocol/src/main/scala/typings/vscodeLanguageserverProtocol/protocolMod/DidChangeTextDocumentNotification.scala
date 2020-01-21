package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.NotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DidChangeTextDocumentNotification")
@js.native
object DidChangeTextDocumentNotification extends js.Object {
  val `type`: NotificationType[DidChangeTextDocumentParams, TextDocumentChangeRegistrationOptions] = js.native
}

