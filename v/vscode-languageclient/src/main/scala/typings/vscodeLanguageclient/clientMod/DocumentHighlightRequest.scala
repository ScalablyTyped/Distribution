package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentHighlight
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlightRequest {
  
  @JSImport("vscode-languageclient/lib/client", "DocumentHighlightRequest.method")
  @js.native
  val method: textDocumentSlashdocumentHighlight = js.native
  
  /** @deprecated Use DocumentHighlightRequest.type */
  @JSImport("vscode-languageclient/lib/client", "DocumentHighlightRequest.resultType")
  @js.native
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight]] = js.native
  
  @JSImport("vscode-languageclient/lib/client", "DocumentHighlightRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentHighlightParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight], 
    Unit, 
    DocumentHighlightRegistrationOptions
  ] = js.native
}
