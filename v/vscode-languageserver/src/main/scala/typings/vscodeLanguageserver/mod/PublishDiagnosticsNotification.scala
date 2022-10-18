package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashpublishDiagnostics
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PublishDiagnosticsParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PublishDiagnosticsNotification {
  
  @JSImport("vscode-languageserver", "PublishDiagnosticsNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "PublishDiagnosticsNotification.method")
  @js.native
  val method: textDocumentSlashpublishDiagnostics = js.native
  
  @JSImport("vscode-languageserver", "PublishDiagnosticsNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[PublishDiagnosticsParams, Unit] = js.native
}
