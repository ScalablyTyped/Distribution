package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.RequestType
import typings.vscodeLanguageserverTypes.mod.Hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "HoverRequest")
@js.native
object HoverRequest extends js.Object {
  val `type`: RequestType[TextDocumentPositionParams, Hover | Null, Unit, TextDocumentRegistrationOptions] = js.native
}

