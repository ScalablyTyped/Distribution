package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.RegistrationType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookDocumentSyncRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.notebookDocumentSlashsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotebookDocumentSyncRegistrationType {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "NotebookDocumentSyncRegistrationType.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "NotebookDocumentSyncRegistrationType.method")
  @js.native
  val method: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "NotebookDocumentSyncRegistrationType.type")
  @js.native
  val `type`: RegistrationType[NotebookDocumentSyncRegistrationOptions] = js.native
}
