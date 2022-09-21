package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.DeleteFilesParams
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.FileOperationRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashwillDeleteFiles
import typings.vscodeLanguageserverTypes.mod.WorkspaceEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillDeleteFilesRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WillDeleteFilesRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WillDeleteFilesRequest.method")
  @js.native
  val method: workspaceSlashwillDeleteFiles = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WillDeleteFilesRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DeleteFilesParams, 
    WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    FileOperationRegistrationOptions
  ] = js.native
}
