package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.protocolMod.MessageActionItem
import typings.vscodeLanguageserverProtocol.protocolMod.ShowMessageRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ShowMessageRequest")
@js.native
object ShowMessageRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[ShowMessageRequestParams, MessageActionItem | Null, Unit, Unit] = js.native
}

