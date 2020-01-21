package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.RequestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "InitializeRequest")
@js.native
object InitializeRequest extends js.Object {
  val `type`: RequestType[InitializeParams, InitializeResult, InitializeError, Unit] = js.native
}

