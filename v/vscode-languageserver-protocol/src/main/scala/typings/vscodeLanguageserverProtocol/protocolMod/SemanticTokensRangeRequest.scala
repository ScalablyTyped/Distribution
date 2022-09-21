package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolSemanticTokensMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.protocolSemanticTokensMod.SemanticTokensRangeParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashrange
import typings.vscodeLanguageserverTypes.mod.SemanticTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensRangeRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensRangeRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensRangeRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashrange = js.native
  
  /* was `typeof SemanticTokensRegistrationType.method` */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensRangeRequest.registrationMethod")
  @js.native
  val registrationMethod: textDocumentSlashsemanticTokens = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensRangeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SemanticTokensRangeParams, 
    SemanticTokens | Null, 
    SemanticTokensPartialResult, 
    Unit, 
    Unit
  ] = js.native
}
