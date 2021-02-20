package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashrange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensRangeRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokensRangeRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashrange = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokensRangeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SemanticTokensRangeParams, 
    SemanticTokens | Null, 
    SemanticTokensPartialResult, 
    Unit, 
    Unit
  ] = js.native
}
