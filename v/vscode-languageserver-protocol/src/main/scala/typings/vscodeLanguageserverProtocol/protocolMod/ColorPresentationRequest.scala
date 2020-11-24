package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import typings.vscodeLanguageserverTypes.mod.ColorPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  
  val `type`: ProtocolRequestType[
    ColorPresentationParams, 
    js.Array[ColorPresentation], 
    js.Array[ColorPresentation], 
    Unit, 
    WorkDoneProgressOptions with TextDocumentRegistrationOptions
  ] = js.native
}
