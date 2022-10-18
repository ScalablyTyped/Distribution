package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidChangeNotebookDocumentParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashdidChange
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeNotebookDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol", "DidChangeNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidChangeNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidChange = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageserver-protocol", "DidChangeNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidChangeNotebookDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeNotebookDocumentParams, Unit] = js.native
}
