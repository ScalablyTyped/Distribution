package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidClose
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidCloseTextDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidCloseTextDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidCloseTextDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidCloseTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidClose = js.native
  
  @JSImport("vscode-languageclient", "DidCloseTextDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[
    DidCloseTextDocumentParams, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
