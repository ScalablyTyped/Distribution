package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.PublishDiagnosticsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "PublishDiagnosticsNotification")
@js.native
object PublishDiagnosticsNotification extends js.Object {
  
  val `type`: ProtocolNotificationType[PublishDiagnosticsParams, Unit] = js.native
}
