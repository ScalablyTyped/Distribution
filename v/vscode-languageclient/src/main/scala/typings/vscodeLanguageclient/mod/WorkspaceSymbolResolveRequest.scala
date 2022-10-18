package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSymbolSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolResolveRequest {
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolResolveRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolResolveRequest.method")
  @js.native
  val method: workspaceSymbolSlashresolve = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolResolveRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.WorkspaceSymbol, 
    typings.vscodeLanguageserverTypes.mod.WorkspaceSymbol, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
