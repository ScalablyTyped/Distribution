package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdocumentHighlight
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlightRequest {
  
  @JSImport("vscode-languageserver", "DocumentHighlightRequest.method")
  @js.native
  val method: textDocumentSlashdocumentHighlight = js.native
  
  /** @deprecated Use DocumentHighlightRequest.type */
  @JSImport("vscode-languageserver", "DocumentHighlightRequest.resultType")
  @js.native
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight]] = js.native
  
  @JSImport("vscode-languageserver", "DocumentHighlightRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentHighlightParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight], 
    Unit, 
    DocumentHighlightRegistrationOptions
  ] = js.native
}
