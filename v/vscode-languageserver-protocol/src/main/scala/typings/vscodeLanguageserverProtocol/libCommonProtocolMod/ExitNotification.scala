package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType0
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.exit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExitNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ExitNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ExitNotification.method")
  @js.native
  val method: exit = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ExitNotification.type")
  @js.native
  val `type`: ProtocolNotificationType0[Unit] = js.native
}
