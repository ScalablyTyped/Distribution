package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeJsonrpc.mod.NotificationHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.progress", "WorkDoneProgressCancelNotification")
@js.native
object WorkDoneProgressCancelNotification extends js.Object {
  val `type`: ProtocolNotificationType[WorkDoneProgressCancelParams, Unit] = js.native
  type HandlerSignature = NotificationHandler[WorkDoneProgressCancelParams]
}

