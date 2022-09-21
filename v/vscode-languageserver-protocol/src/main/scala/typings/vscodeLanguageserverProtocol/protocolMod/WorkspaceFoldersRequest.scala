package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashworkspaceFolders
import typings.vscodeLanguageserverTypes.mod.WorkspaceFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceFoldersRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceFoldersRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceFoldersRequest.method")
  @js.native
  val method: workspaceSlashworkspaceFolders = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceFoldersRequest.type")
  @js.native
  val `type`: ProtocolRequestType0[js.Array[WorkspaceFolder] | Null, scala.Nothing, Unit, Unit] = js.native
}
