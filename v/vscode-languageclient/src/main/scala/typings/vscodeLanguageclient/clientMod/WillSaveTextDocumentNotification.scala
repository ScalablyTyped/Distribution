package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "WillSaveTextDocumentNotification")
@js.native
object WillSaveTextDocumentNotification extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.NotificationType[WillSaveTextDocumentParams, TextDocumentRegistrationOptions] = js.native
}

