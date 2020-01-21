package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "ReferencesRequest")
@js.native
object ReferencesRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[
    ReferenceParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.Location] | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

