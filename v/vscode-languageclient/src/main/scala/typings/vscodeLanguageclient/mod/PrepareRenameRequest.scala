package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverProtocol.AnonPlaceholder
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[
    TextDocumentPositionParams, 
    typings.vscodeLanguageserverTypes.mod.Range | AnonPlaceholder | Null, 
    Unit, 
    Unit
  ] = js.native
}

