package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeWatchedFilesParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeWatchedFilesRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DidChangeWatchedFilesNotification")
@js.native
object DidChangeWatchedFilesNotification extends js.Object {
  val `type`: ProtocolNotificationType[DidChangeWatchedFilesParams, DidChangeWatchedFilesRegistrationOptions] = js.native
}

