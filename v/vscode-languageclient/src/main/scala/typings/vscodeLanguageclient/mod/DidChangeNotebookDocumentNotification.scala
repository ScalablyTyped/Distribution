package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashdidChange
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashsync
import typings.vscodeLanguageserverProtocol.protocolNotebookMod.DidChangeNotebookDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeNotebookDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidChangeNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidChangeNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidChange = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageclient", "DidChangeNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageclient", "DidChangeNotebookDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[DidChangeNotebookDocumentParams, Unit] = js.native
}
