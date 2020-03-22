package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DidOpenTextDocumentNotification")
@js.native
object DidOpenTextDocumentNotification extends js.Object {
  val method: textDocumentSlashdidOpen = js.native
  val `type`: ProtocolNotificationType[DidOpenTextDocumentParams, TextDocumentRegistrationOptions] = js.native
}

