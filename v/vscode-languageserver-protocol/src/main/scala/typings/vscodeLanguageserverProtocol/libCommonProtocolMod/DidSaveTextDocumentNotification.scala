package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidSave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidSaveTextDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidSaveTextDocumentNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidSaveTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidSave = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidSaveTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DidSaveTextDocumentParams, TextDocumentSaveRegistrationOptions] = js.native
}
