package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.InitializedParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "InitializedNotification")
@js.native
object InitializedNotification extends js.Object {
  val `type`: ProtocolNotificationType[InitializedParams, Unit] = js.native
}

