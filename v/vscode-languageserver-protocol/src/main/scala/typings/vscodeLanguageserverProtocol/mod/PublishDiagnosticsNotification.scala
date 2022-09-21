package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.protocolMod.PublishDiagnosticsParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashpublishDiagnostics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PublishDiagnosticsNotification {
  
  @JSImport("vscode-languageserver-protocol", "PublishDiagnosticsNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "PublishDiagnosticsNotification.method")
  @js.native
  val method: textDocumentSlashpublishDiagnostics = js.native
  
  @JSImport("vscode-languageserver-protocol", "PublishDiagnosticsNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[PublishDiagnosticsParams, Unit] = js.native
}
