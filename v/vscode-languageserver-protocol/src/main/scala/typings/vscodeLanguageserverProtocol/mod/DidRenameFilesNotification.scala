package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.FileOperationRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.RenameFilesParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdidRenameFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidRenameFilesNotification {
  
  @JSImport("vscode-languageserver-protocol", "DidRenameFilesNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidRenameFilesNotification.method")
  @js.native
  val method: workspaceSlashdidRenameFiles = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidRenameFilesNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[RenameFilesParams, FileOperationRegistrationOptions] = js.native
}
