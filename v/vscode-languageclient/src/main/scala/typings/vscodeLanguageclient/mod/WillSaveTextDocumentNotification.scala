package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSave
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "WillSaveTextDocumentNotification")
@js.native
object WillSaveTextDocumentNotification extends js.Object {
  val method: textDocumentSlashwillSave = js.native
  val `type`: ProtocolNotificationType[
    WillSaveTextDocumentParams, 
    typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

