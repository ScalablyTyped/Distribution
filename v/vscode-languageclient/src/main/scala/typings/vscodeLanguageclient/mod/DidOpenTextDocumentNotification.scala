package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidOpen
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidOpenTextDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidOpenTextDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidOpenTextDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidOpenTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidOpen = js.native
  
  @JSImport("vscode-languageclient", "DidOpenTextDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[
    DidOpenTextDocumentParams, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
