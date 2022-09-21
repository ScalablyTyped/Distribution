package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.telemetrySlashevent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TelemetryEventNotification {
  
  @JSImport("vscode-languageserver", "TelemetryEventNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "TelemetryEventNotification.method")
  @js.native
  val method: telemetrySlashevent = js.native
  
  @JSImport("vscode-languageserver", "TelemetryEventNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[Any, Unit] = js.native
}
