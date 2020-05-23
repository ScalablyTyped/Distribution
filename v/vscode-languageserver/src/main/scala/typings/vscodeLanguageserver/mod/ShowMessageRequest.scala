package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.MessageActionItem
import typings.vscodeLanguageserverProtocol.protocolMod.ShowMessageRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "ShowMessageRequest")
@js.native
object ShowMessageRequest extends js.Object {
  val `type`: ProtocolRequestType[ShowMessageRequestParams, MessageActionItem | Null, scala.Nothing, Unit, Unit] = js.native
}

