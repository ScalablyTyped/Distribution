package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.DidSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidSave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DidSaveTextDocumentNotification")
@js.native
object DidSaveTextDocumentNotification extends js.Object {
  val method: textDocumentSlashdidSave = js.native
  val `type`: ProtocolNotificationType[DidSaveTextDocumentParams, TextDocumentSaveRegistrationOptions] = js.native
}

