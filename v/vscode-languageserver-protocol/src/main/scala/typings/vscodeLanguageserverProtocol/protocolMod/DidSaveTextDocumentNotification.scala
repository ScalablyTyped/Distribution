package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidSave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidSaveTextDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DidSaveTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidSave = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DidSaveTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DidSaveTextDocumentParams, TextDocumentSaveRegistrationOptions] = js.native
}
