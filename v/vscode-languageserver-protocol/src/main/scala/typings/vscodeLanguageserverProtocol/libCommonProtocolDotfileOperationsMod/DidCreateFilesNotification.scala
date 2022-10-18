package typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import typings.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdidCreateFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidCreateFilesNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "DidCreateFilesNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "DidCreateFilesNotification.method")
  @js.native
  val method: workspaceSlashdidCreateFiles = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "DidCreateFilesNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[CreateFilesParams, FileOperationRegistrationOptions] = js.native
  
  type HandlerSignature = NotificationHandler[CreateFilesParams]
}
