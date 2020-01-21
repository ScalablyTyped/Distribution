package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "HoverRequest")
@js.native
object HoverRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[
    TextDocumentPositionParams, 
    typings.vscodeLanguageserverTypes.mod.Hover | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

