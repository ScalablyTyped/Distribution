package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdidSave
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentSaveRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidSaveTextDocumentNotification {
  
  @JSImport("vscode-languageserver", "DidSaveTextDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DidSaveTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidSave = js.native
  
  @JSImport("vscode-languageserver", "DidSaveTextDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidSaveTextDocumentParams, TextDocumentSaveRegistrationOptions] = js.native
}
