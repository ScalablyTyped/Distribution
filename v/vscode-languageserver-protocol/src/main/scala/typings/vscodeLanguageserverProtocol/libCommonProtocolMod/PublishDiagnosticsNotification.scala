package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashpublishDiagnostics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PublishDiagnosticsNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "PublishDiagnosticsNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "PublishDiagnosticsNotification.method")
  @js.native
  val method: textDocumentSlashpublishDiagnostics = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "PublishDiagnosticsNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[PublishDiagnosticsParams, Unit] = js.native
}
