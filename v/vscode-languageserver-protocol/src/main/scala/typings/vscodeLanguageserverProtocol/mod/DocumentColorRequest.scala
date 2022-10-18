package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcolorProviderMod.DocumentColorParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcolorProviderMod.DocumentColorRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentColorRequest {
  
  @JSImport("vscode-languageserver-protocol", "DocumentColorRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentColorRequest.method")
  @js.native
  val method: textDocumentSlashdocumentColor = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentColorRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentColorParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorInformation], 
    js.Array[typings.vscodeLanguageserverTypes.mod.ColorInformation], 
    Unit, 
    DocumentColorRegistrationOptions
  ] = js.native
}
