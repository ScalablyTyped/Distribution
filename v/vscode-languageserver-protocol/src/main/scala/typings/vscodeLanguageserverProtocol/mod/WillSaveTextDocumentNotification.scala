package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashwillSave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "WillSaveTextDocumentNotification")
@js.native
object WillSaveTextDocumentNotification extends js.Object {
  val method: textDocumentSlashwillSave = js.native
  val `type`: ProtocolNotificationType[
    WillSaveTextDocumentParams, 
    typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

