package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensDeltaParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensDeltaPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashfullSlashdelta
import typings.vscodeLanguageserverTypes.mod.SemanticTokens
import typings.vscodeLanguageserverTypes.mod.SemanticTokensDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensDeltaRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensDeltaRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensDeltaRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashfullSlashdelta = js.native
  
  /* was `typeof SemanticTokensRegistrationType.method` */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensDeltaRequest.registrationMethod")
  @js.native
  val registrationMethod: textDocumentSlashsemanticTokens = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensDeltaRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SemanticTokensDeltaParams, 
    SemanticTokens | SemanticTokensDelta | Null, 
    SemanticTokensPartialResult | SemanticTokensDeltaPartialResult, 
    Unit, 
    SemanticTokensRegistrationOptions
  ] = js.native
}
