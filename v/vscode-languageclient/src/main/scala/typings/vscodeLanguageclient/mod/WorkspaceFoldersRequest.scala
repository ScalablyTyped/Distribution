package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashworkspaceFolders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceFoldersRequest {
  
  @JSImport("vscode-languageclient", "WorkspaceFoldersRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceFoldersRequest.method")
  @js.native
  val method: workspaceSlashworkspaceFolders = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceFoldersRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType0[
    js.Array[typings.vscodeLanguageserverTypes.mod.WorkspaceFolder] | Null, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
