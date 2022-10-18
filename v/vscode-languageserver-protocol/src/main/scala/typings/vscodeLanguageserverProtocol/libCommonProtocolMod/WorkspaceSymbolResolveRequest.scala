package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSymbolSlashresolve
import typings.vscodeLanguageserverTypes.mod.WorkspaceSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolResolveRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceSymbolResolveRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceSymbolResolveRequest.method")
  @js.native
  val method: workspaceSymbolSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceSymbolResolveRequest.type")
  @js.native
  val `type`: ProtocolRequestType[WorkspaceSymbol, WorkspaceSymbol, scala.Nothing, Unit, Unit] = js.native
}
