package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidSave
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentSaveRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidSaveTextDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidSaveTextDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidSaveTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidSave = js.native
  
  @JSImport("vscode-languageclient", "DidSaveTextDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidSaveTextDocumentParams, TextDocumentSaveRegistrationOptions] = js.native
}
