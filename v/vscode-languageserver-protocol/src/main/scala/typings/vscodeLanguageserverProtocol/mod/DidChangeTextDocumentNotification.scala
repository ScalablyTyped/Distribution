package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentChangeRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DidChangeTextDocumentNotification")
@js.native
object DidChangeTextDocumentNotification extends js.Object {
  val method: textDocumentSlashdidChange = js.native
  val `type`: ProtocolNotificationType[DidChangeTextDocumentParams, TextDocumentChangeRegistrationOptions] = js.native
}

