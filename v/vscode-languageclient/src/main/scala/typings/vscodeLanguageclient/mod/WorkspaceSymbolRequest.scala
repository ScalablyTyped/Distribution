package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashsymbol
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkspaceSymbolParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkspaceSymbolRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolRequest {
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolRequest.method")
  @js.native
  val method: workspaceSlashsymbol = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    WorkspaceSymbolParams, 
    (js.Array[
      typings.vscodeLanguageserverTypes.mod.SymbolInformation | typings.vscodeLanguageserverTypes.mod.WorkspaceSymbol
    ]) | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.SymbolInformation | typings.vscodeLanguageserverTypes.mod.WorkspaceSymbol
    ], 
    Unit, 
    WorkspaceSymbolRegistrationOptions
  ] = js.native
}
