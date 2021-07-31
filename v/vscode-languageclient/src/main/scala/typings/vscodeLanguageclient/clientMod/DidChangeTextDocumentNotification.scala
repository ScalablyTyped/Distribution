package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidChange
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentChangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeTextDocumentNotification {
  
  @JSImport("vscode-languageclient/lib/client", "DidChangeTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidChange = js.native
  
  @JSImport("vscode-languageclient/lib/client", "DidChangeTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DidChangeTextDocumentParams, TextDocumentChangeRegistrationOptions] = js.native
}
