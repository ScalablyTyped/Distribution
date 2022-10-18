package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.windowSlashlogMessage
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.LogMessageParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LogMessageNotification {
  
  @JSImport("vscode-languageserver", "LogMessageNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "LogMessageNotification.method")
  @js.native
  val method: windowSlashlogMessage = js.native
  
  @JSImport("vscode-languageserver", "LogMessageNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[LogMessageParams, Unit] = js.native
}
