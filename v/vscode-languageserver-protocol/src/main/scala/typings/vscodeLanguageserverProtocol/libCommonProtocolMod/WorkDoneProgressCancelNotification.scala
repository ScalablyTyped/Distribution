package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressCancelParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashworkDoneProgressSlashcancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgressCancelNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkDoneProgressCancelNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkDoneProgressCancelNotification.method")
  @js.native
  val method: windowSlashworkDoneProgressSlashcancel = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkDoneProgressCancelNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[WorkDoneProgressCancelParams, Unit] = js.native
}
