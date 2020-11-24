package typings.vscodeLanguageserverProtocol.protocolColorProviderMod

import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverTypes.mod.ColorPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.colorProvider", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  
  val `type`: ProtocolRequestType[
    ColorPresentationParams, 
    js.Array[ColorPresentation], 
    js.Array[ColorPresentation], 
    Unit, 
    WorkDoneProgressOptions with TextDocumentRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[ColorPresentationParams, js.Array[ColorPresentation], Unit]
}
