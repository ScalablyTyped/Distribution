package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentHighlightParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentHighlightRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentHighlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlightRequest {
  
  @JSImport("vscode-languageserver-protocol", "DocumentHighlightRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentHighlightRequest.method")
  @js.native
  val method: textDocumentSlashdocumentHighlight = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentHighlightRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentHighlightParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight], 
    Unit, 
    DocumentHighlightRegistrationOptions
  ] = js.native
}
