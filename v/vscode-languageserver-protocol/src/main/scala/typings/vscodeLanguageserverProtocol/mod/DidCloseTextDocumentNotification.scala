package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DidCloseTextDocumentNotification")
@js.native
object DidCloseTextDocumentNotification extends js.Object {
  val method: textDocumentSlashdidClose = js.native
  val `type`: ProtocolNotificationType[
    DidCloseTextDocumentParams, 
    typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

