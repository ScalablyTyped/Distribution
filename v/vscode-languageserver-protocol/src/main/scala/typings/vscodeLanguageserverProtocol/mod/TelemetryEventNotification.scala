package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.telemetrySlashevent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TelemetryEventNotification {
  
  @JSImport("vscode-languageserver-protocol", "TelemetryEventNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "TelemetryEventNotification.method")
  @js.native
  val method: telemetrySlashevent = js.native
  
  @JSImport("vscode-languageserver-protocol", "TelemetryEventNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[Any, Unit] = js.native
}
