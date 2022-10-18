package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidSaveNotebookDocumentParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashdidSave
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidSaveNotebookDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol", "DidSaveNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidSaveNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidSave = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageserver-protocol", "DidSaveNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidSaveNotebookDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidSaveNotebookDocumentParams, Unit] = js.native
}
