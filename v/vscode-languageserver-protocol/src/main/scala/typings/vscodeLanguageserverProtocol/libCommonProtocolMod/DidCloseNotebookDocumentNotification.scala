package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidCloseNotebookDocumentParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashdidClose
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidCloseNotebookDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidCloseNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidCloseNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidClose = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidCloseNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidCloseNotebookDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DidCloseNotebookDocumentParams, Unit] = js.native
}
