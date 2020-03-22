package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.PublishDiagnosticsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "PublishDiagnosticsNotification")
@js.native
object PublishDiagnosticsNotification extends js.Object {
  val `type`: ProtocolNotificationType[PublishDiagnosticsParams, Unit] = js.native
}

