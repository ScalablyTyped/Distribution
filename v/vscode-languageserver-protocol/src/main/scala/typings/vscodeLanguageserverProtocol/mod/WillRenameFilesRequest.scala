package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.FileOperationRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.RenameFilesParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashwillRenameFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillRenameFilesRequest {
  
  @JSImport("vscode-languageserver-protocol", "WillRenameFilesRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "WillRenameFilesRequest.method")
  @js.native
  val method: workspaceSlashwillRenameFiles = js.native
  
  @JSImport("vscode-languageserver-protocol", "WillRenameFilesRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    RenameFilesParams, 
    typings.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    FileOperationRegistrationOptions
  ] = js.native
}
