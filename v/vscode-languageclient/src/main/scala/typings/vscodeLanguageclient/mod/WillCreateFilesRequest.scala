package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashwillCreateFiles
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.CreateFilesParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.FileOperationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillCreateFilesRequest {
  
  @JSImport("vscode-languageclient", "WillCreateFilesRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "WillCreateFilesRequest.method")
  @js.native
  val method: workspaceSlashwillCreateFiles = js.native
  
  @JSImport("vscode-languageclient", "WillCreateFilesRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CreateFilesParams, 
    typings.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    FileOperationRegistrationOptions
  ] = js.native
}
