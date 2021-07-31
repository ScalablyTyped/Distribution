package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokensRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokens = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokensRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SemanticTokensParams, 
    SemanticTokens | Null, 
    SemanticTokensPartialResult, 
    Unit, 
    SemanticTokensRegistrationOptions
  ] = js.native
}
