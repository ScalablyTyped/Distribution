package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentSymbol
import typings.vscodeLanguageserverTypes.mod.DocumentSymbol
import typings.vscodeLanguageserverTypes.mod.SymbolInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSymbolRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentSymbolRequest.method")
  @js.native
  val method: textDocumentSlashdocumentSymbol = js.native
  
  /** @deprecated Use DocumentSymbolRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentSymbolRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[DocumentSymbol | SymbolInformation]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentSymbolRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentSymbolParams, 
    (js.Array[DocumentSymbol | SymbolInformation]) | Null, 
    js.Array[DocumentSymbol | SymbolInformation], 
    Unit, 
    DocumentSymbolRegistrationOptions
  ] = js.native
}
