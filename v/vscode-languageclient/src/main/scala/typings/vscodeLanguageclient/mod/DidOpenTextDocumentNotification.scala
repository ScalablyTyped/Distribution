package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidOpen
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DidOpenTextDocumentNotification")
@js.native
object DidOpenTextDocumentNotification extends js.Object {
  val method: textDocumentSlashdidOpen = js.native
  val `type`: ProtocolNotificationType[
    DidOpenTextDocumentParams, 
    typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

