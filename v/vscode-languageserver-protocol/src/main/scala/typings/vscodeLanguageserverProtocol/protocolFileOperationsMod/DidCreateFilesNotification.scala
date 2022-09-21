package typings.vscodeLanguageserverProtocol.protocolFileOperationsMod

import typings.vscodeJsonrpc.connectionMod.NotificationHandler
import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
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
