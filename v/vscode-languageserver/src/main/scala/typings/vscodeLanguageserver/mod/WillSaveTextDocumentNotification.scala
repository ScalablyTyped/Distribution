package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "WillSaveTextDocumentNotification")
@js.native
object WillSaveTextDocumentNotification extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.NotificationType[WillSaveTextDocumentParams, TextDocumentRegistrationOptions] = js.native
}

