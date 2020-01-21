package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[
    ColorPresentationParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorPresentation], 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

