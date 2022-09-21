package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSymbolSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolResolveRequest {
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceSymbolResolveRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceSymbolResolveRequest.method")
  @js.native
  val method: workspaceSymbolSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceSymbolResolveRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.WorkspaceSymbol, 
    typings.vscodeLanguageserverTypes.mod.WorkspaceSymbol, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
