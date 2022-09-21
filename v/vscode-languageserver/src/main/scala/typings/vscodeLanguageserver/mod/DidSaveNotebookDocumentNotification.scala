package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.notebookDocumentSlashdidSave
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.notebookDocumentSlashsync
import typings.vscodeLanguageserverProtocol.protocolNotebookMod.DidSaveNotebookDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidSaveNotebookDocumentNotification {
  
  @JSImport("vscode-languageserver", "DidSaveNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DidSaveNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidSave = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageserver", "DidSaveNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageserver", "DidSaveNotebookDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[DidSaveNotebookDocumentParams, Unit] = js.native
}
