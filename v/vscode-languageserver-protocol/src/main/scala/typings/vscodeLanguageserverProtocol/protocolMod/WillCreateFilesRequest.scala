package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.CreateFilesParams
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.FileOperationRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashwillCreateFiles
import typings.vscodeLanguageserverTypes.mod.WorkspaceEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillCreateFilesRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WillCreateFilesRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WillCreateFilesRequest.method")
  @js.native
  val method: workspaceSlashwillCreateFiles = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WillCreateFilesRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CreateFilesParams, 
    WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    FileOperationRegistrationOptions
  ] = js.native
}
