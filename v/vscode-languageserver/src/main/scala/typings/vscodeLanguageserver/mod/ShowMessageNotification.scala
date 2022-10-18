package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.windowSlashshowMessage
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ShowMessageParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShowMessageNotification {
  
  @JSImport("vscode-languageserver", "ShowMessageNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "ShowMessageNotification.method")
  @js.native
  val method: windowSlashshowMessage = js.native
  
  @JSImport("vscode-languageserver", "ShowMessageNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[ShowMessageParams, Unit] = js.native
}
