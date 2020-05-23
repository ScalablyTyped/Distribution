package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeConfigurationParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeConfigurationRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DidChangeConfigurationNotification")
@js.native
object DidChangeConfigurationNotification extends js.Object {
  val `type`: ProtocolNotificationType[DidChangeConfigurationParams, DidChangeConfigurationRegistrationOptions] = js.native
}

