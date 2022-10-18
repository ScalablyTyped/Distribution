package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcolorProviderMod.ColorPresentationParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcolorPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPresentationRequest {
  
  @JSImport("vscode-languageserver-protocol", "ColorPresentationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "ColorPresentationRequest.method")
  @js.native
  val method: textDocumentSlashcolorPresentation = js.native
  
  @JSImport("vscode-languageserver-protocol", "ColorPresentationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    ColorPresentationParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorPresentation], 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorPresentation], 
    Unit, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressOptions & typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
