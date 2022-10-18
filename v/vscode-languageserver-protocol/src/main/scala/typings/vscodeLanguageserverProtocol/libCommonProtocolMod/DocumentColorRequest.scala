package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcolorProviderMod.DocumentColorParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcolorProviderMod.DocumentColorRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentColor
import typings.vscodeLanguageserverTypes.mod.ColorInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentColorRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentColorRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentColorRequest.method")
  @js.native
  val method: textDocumentSlashdocumentColor = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentColorRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentColorParams, 
    js.Array[ColorInformation], 
    js.Array[ColorInformation], 
    Unit, 
    DocumentColorRegistrationOptions
  ] = js.native
}
