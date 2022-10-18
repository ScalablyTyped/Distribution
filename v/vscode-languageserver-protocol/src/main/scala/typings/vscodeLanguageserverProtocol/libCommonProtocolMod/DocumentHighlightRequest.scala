package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentHighlight
import typings.vscodeLanguageserverTypes.mod.DocumentHighlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlightRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentHighlightRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentHighlightRequest.method")
  @js.native
  val method: textDocumentSlashdocumentHighlight = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentHighlightRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentHighlightParams, 
    js.Array[DocumentHighlight] | Null, 
    js.Array[DocumentHighlight], 
    Unit, 
    DocumentHighlightRegistrationOptions
  ] = js.native
}
