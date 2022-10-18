package typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import typings.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdidDeleteFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidDeleteFilesNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "DidDeleteFilesNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "DidDeleteFilesNotification.method")
  @js.native
  val method: workspaceSlashdidDeleteFiles = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "DidDeleteFilesNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DeleteFilesParams, FileOperationRegistrationOptions] = js.native
  
  type HandlerSignature = NotificationHandler[DeleteFilesParams]
}
