package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.windowSlashworkDoneProgressSlashcancel
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressCancelParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgressCancelNotification {
  
  @JSImport("vscode-languageserver", "WorkDoneProgressCancelNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "WorkDoneProgressCancelNotification.method")
  @js.native
  val method: windowSlashworkDoneProgressSlashcancel = js.native
  
  @JSImport("vscode-languageserver", "WorkDoneProgressCancelNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[WorkDoneProgressCancelParams, Unit] = js.native
}
