package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashworkspaceFolders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceFoldersRequest {
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceFoldersRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceFoldersRequest.method")
  @js.native
  val method: workspaceSlashworkspaceFolders = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceFoldersRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0[
    js.Array[typings.vscodeLanguageserverTypes.mod.WorkspaceFolder] | Null, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
