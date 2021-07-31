package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashsymbol
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolRequest {
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolRequest.method")
  @js.native
  val method: workspaceSlashsymbol = js.native
  
  /** @deprecated Use WorkspaceSymbolRequest.type */
  @JSImport("vscode-languageclient", "WorkspaceSymbolRequest.resultType")
  @js.native
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.SymbolInformation]] = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    WorkspaceSymbolParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.SymbolInformation] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.SymbolInformation], 
    Unit, 
    WorkspaceSymbolRegistrationOptions
  ] = js.native
}
