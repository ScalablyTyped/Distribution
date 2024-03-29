package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdocumentSymbol
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSymbolParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSymbolRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSymbolRequest {
  
  @JSImport("vscode-languageserver", "DocumentSymbolRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DocumentSymbolRequest.method")
  @js.native
  val method: textDocumentSlashdocumentSymbol = js.native
  
  @JSImport("vscode-languageserver", "DocumentSymbolRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentSymbolParams, 
    (js.Array[
      typings.vscodeLanguageserverTypes.mod.DocumentSymbol | typings.vscodeLanguageserverTypes.mod.SymbolInformation
    ]) | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.DocumentSymbol | typings.vscodeLanguageserverTypes.mod.SymbolInformation
    ], 
    Unit, 
    DocumentSymbolRegistrationOptions
  ] = js.native
}
