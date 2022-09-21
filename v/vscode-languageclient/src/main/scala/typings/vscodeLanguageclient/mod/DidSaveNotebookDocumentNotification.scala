package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashdidSave
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashsync
import typings.vscodeLanguageserverProtocol.protocolNotebookMod.DidSaveNotebookDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidSaveNotebookDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidSaveNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidSaveNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidSave = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageclient", "DidSaveNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageclient", "DidSaveNotebookDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[DidSaveNotebookDocumentParams, Unit] = js.native
}
