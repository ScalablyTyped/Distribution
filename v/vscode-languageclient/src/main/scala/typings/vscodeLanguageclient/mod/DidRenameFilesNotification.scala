package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidRenameFiles
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.FileOperationRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.RenameFilesParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidRenameFilesNotification {
  
  @JSImport("vscode-languageclient", "DidRenameFilesNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidRenameFilesNotification.method")
  @js.native
  val method: workspaceSlashdidRenameFiles = js.native
  
  @JSImport("vscode-languageclient", "DidRenameFilesNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[RenameFilesParams, FileOperationRegistrationOptions] = js.native
}
