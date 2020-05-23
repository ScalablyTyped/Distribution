package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.ShowMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "ShowMessageNotification")
@js.native
object ShowMessageNotification extends js.Object {
  val `type`: ProtocolNotificationType[ShowMessageParams, Unit] = js.native
}

