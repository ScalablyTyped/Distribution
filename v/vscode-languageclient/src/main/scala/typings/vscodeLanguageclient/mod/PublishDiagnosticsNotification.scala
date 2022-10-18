package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashpublishDiagnostics
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PublishDiagnosticsParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PublishDiagnosticsNotification {
  
  @JSImport("vscode-languageclient", "PublishDiagnosticsNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "PublishDiagnosticsNotification.method")
  @js.native
  val method: textDocumentSlashpublishDiagnostics = js.native
  
  @JSImport("vscode-languageclient", "PublishDiagnosticsNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[PublishDiagnosticsParams, Unit] = js.native
}
