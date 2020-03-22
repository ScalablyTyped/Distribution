package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressCancelParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "WorkDoneProgressCancelNotification")
@js.native
object WorkDoneProgressCancelNotification extends js.Object {
  val `type`: ProtocolNotificationType[WorkDoneProgressCancelParams, Unit] = js.native
}

