package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.workspaceSlashwillDeleteFiles
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.DeleteFilesParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.FileOperationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillDeleteFilesRequest {
  
  @JSImport("vscode-languageserver", "WillDeleteFilesRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "WillDeleteFilesRequest.method")
  @js.native
  val method: workspaceSlashwillDeleteFiles = js.native
  
  @JSImport("vscode-languageserver", "WillDeleteFilesRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DeleteFilesParams, 
    typings.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    FileOperationRegistrationOptions
  ] = js.native
}
