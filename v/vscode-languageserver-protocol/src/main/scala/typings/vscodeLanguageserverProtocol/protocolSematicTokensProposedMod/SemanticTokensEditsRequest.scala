package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashedits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokensEditsRequest")
@js.native
object SemanticTokensEditsRequest extends js.Object {
  
  val method: textDocumentSlashsemanticTokensSlashedits = js.native
  
  val `type`: ProtocolRequestType[
    SemanticTokensEditsParams, 
    SemanticTokens | SemanticTokensEdits | Null, 
    SemanticTokensPartialResult | SemanticTokensEditsPartialResult, 
    Unit, 
    SemanticTokensRegistrationOptions
  ] = js.native
}
