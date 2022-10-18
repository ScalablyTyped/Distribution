package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashdidClose
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashsync
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidCloseNotebookDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidCloseNotebookDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidCloseNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidCloseNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidClose = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageclient", "DidCloseNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageclient", "DidCloseNotebookDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidCloseNotebookDocumentParams, Unit] = js.native
}
