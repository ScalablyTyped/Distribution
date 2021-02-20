package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashedits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensEditsRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokensEditsRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashedits = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokensEditsRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SemanticTokensEditsParams, 
    SemanticTokens | SemanticTokensEdits | Null, 
    SemanticTokensPartialResult | SemanticTokensEditsPartialResult, 
    Unit, 
    SemanticTokensRegistrationOptions
  ] = js.native
}
