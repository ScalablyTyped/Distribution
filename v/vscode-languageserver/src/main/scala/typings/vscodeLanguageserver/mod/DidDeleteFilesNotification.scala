package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.workspaceSlashdidDeleteFiles
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.DeleteFilesParams
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.FileOperationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidDeleteFilesNotification {
  
  @JSImport("vscode-languageserver", "DidDeleteFilesNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DidDeleteFilesNotification.method")
  @js.native
  val method: workspaceSlashdidDeleteFiles = js.native
  
  @JSImport("vscode-languageserver", "DidDeleteFilesNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[DeleteFilesParams, FileOperationRegistrationOptions] = js.native
}
