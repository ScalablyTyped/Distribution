package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidChange
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentChangeRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DidChangeTextDocumentNotification")
@js.native
object DidChangeTextDocumentNotification extends js.Object {
  val method: textDocumentSlashdidChange = js.native
  val `type`: ProtocolNotificationType[DidChangeTextDocumentParams, TextDocumentChangeRegistrationOptions] = js.native
}

