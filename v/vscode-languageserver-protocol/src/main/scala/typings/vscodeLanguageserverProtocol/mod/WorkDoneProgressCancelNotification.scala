package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressCancelParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashworkDoneProgressSlashcancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgressCancelNotification {
  
  @JSImport("vscode-languageserver-protocol", "WorkDoneProgressCancelNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkDoneProgressCancelNotification.method")
  @js.native
  val method: windowSlashworkDoneProgressSlashcancel = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkDoneProgressCancelNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[WorkDoneProgressCancelParams, Unit] = js.native
}
