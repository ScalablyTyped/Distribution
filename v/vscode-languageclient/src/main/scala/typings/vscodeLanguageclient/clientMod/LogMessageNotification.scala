package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.LogMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "LogMessageNotification")
@js.native
object LogMessageNotification extends js.Object {
  val `type`: ProtocolNotificationType[LogMessageParams, Unit] = js.native
}

