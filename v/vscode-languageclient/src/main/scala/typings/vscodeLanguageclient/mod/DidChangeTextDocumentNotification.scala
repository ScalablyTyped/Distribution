package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidChange
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeTextDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentChangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeTextDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidChangeTextDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidChangeTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidChange = js.native
  
  @JSImport("vscode-languageclient", "DidChangeTextDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeTextDocumentParams, TextDocumentChangeRegistrationOptions] = js.native
}
