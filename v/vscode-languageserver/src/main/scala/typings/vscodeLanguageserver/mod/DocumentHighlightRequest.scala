package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdocumentHighlight
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentHighlightParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentHighlightRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlightRequest {
  
  @JSImport("vscode-languageserver", "DocumentHighlightRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DocumentHighlightRequest.method")
  @js.native
  val method: textDocumentSlashdocumentHighlight = js.native
  
  @JSImport("vscode-languageserver", "DocumentHighlightRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentHighlightParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight], 
    Unit, 
    DocumentHighlightRegistrationOptions
  ] = js.native
}
