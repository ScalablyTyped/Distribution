package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdidChange
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeTextDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentChangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeTextDocumentNotification {
  
  @JSImport("vscode-languageserver", "DidChangeTextDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DidChangeTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidChange = js.native
  
  @JSImport("vscode-languageserver", "DidChangeTextDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeTextDocumentParams, TextDocumentChangeRegistrationOptions] = js.native
}
