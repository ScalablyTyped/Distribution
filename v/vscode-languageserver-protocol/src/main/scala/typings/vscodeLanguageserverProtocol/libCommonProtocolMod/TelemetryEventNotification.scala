package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.telemetrySlashevent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TelemetryEventNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TelemetryEventNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TelemetryEventNotification.method")
  @js.native
  val method: telemetrySlashevent = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TelemetryEventNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[Any, Unit] = js.native
}
