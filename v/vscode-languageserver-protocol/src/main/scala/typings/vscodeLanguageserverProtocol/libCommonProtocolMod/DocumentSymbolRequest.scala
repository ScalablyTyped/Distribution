package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentSymbol
import typings.vscodeLanguageserverTypes.mod.DocumentSymbol
import typings.vscodeLanguageserverTypes.mod.SymbolInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSymbolRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentSymbolRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentSymbolRequest.method")
  @js.native
  val method: textDocumentSlashdocumentSymbol = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentSymbolRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentSymbolParams, 
    (js.Array[DocumentSymbol | SymbolInformation]) | Null, 
    js.Array[DocumentSymbol | SymbolInformation], 
    Unit, 
    DocumentSymbolRegistrationOptions
  ] = js.native
}
