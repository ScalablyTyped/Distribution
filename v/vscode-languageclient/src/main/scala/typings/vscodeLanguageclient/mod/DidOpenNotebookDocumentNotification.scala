package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashdidOpen
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashsync
import typings.vscodeLanguageserverProtocol.protocolNotebookMod.DidOpenNotebookDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidOpenNotebookDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidOpenNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidOpenNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidOpen = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageclient", "DidOpenNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageclient", "DidOpenNotebookDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[DidOpenNotebookDocumentParams, Unit] = js.native
}
