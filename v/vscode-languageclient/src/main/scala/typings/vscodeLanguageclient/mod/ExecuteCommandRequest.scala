package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandParams
import typings.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "ExecuteCommandRequest")
@js.native
object ExecuteCommandRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[ExecuteCommandParams, js.Any, Unit, ExecuteCommandRegistrationOptions] = js.native
}

