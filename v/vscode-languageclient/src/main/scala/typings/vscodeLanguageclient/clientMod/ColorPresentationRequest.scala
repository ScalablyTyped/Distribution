package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  val `type`: ProtocolRequestType[
    ColorPresentationParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorPresentation], 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorPresentation], 
    Unit, 
    typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions with typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

