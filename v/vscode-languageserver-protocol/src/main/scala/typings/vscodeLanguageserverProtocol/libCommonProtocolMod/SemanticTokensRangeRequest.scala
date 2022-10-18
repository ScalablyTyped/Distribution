package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRangeParams
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
