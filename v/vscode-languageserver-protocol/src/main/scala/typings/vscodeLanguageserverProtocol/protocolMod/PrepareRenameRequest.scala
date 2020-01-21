package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.RequestType
import typings.vscodeLanguageserverProtocol.AnonPlaceholder
import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val `type`: RequestType[TextDocumentPositionParams, Range | AnonPlaceholder | Null, Unit, Unit] = js.native
}

