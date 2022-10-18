package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidOpenNotebookDocumentParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashdidOpen
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidOpenNotebookDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidOpenNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidOpenNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidOpen = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidOpenNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidOpenNotebookDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DidOpenNotebookDocumentParams, Unit] = js.native
}
