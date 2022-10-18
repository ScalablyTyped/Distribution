package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcolorProviderMod.ColorPresentationParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcolorPresentation
import typings.vscodeLanguageserverTypes.mod.ColorPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPresentationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ColorPresentationRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ColorPresentationRequest.method")
  @js.native
  val method: textDocumentSlashcolorPresentation = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ColorPresentationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ColorPresentationParams, 
    js.Array[ColorPresentation], 
    js.Array[ColorPresentation], 
    Unit, 
    WorkDoneProgressOptions & TextDocumentRegistrationOptions
  ] = js.native
}
