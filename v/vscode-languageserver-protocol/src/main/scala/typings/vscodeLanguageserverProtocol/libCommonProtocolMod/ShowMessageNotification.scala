package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashshowMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShowMessageNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowMessageNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowMessageNotification.method")
  @js.native
  val method: windowSlashshowMessage = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowMessageNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[ShowMessageParams, Unit] = js.native
}
