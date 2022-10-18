package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashsymbol
import typings.vscodeLanguageserverTypes.mod.SymbolInformation
import typings.vscodeLanguageserverTypes.mod.WorkspaceSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceSymbolRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceSymbolRequest.method")
  @js.native
  val method: workspaceSlashsymbol = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceSymbolRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    WorkspaceSymbolParams, 
    (js.Array[SymbolInformation | WorkspaceSymbol]) | Null, 
    js.Array[SymbolInformation | WorkspaceSymbol], 
    Unit, 
    WorkspaceSymbolRegistrationOptions
  ] = js.native
}
