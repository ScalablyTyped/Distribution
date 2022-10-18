package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.FileOperationRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.RenameFilesParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdidRenameFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidRenameFilesNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidRenameFilesNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidRenameFilesNotification.method")
  @js.native
  val method: workspaceSlashdidRenameFiles = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidRenameFilesNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[RenameFilesParams, FileOperationRegistrationOptions] = js.native
}
