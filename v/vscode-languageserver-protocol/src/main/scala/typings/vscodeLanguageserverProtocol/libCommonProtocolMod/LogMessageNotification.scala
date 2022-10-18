package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashlogMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LogMessageNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "LogMessageNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "LogMessageNotification.method")
  @js.native
  val method: windowSlashlogMessage = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "LogMessageNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[LogMessageParams, Unit] = js.native
}
