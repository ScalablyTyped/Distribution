package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import typings.vscodeLanguageserverTypes.mod.ColorPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPresentationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ColorPresentationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ColorPresentationParams, 
    js.Array[ColorPresentation], 
    js.Array[ColorPresentation], 
    Unit, 
    WorkDoneProgressOptions & TextDocumentRegistrationOptions
  ] = js.native
}
