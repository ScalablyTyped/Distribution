package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.windowSlashworkDoneProgressSlashcancel
import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressCancelParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgressCancelNotification {
  
  @JSImport("vscode-languageclient", "WorkDoneProgressCancelNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "WorkDoneProgressCancelNotification.method")
  @js.native
  val method: windowSlashworkDoneProgressSlashcancel = js.native
  
  @JSImport("vscode-languageclient", "WorkDoneProgressCancelNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[WorkDoneProgressCancelParams, Unit] = js.native
}
