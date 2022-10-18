package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensDeltaParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensDeltaPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashfullSlashdelta
import typings.vscodeLanguageserverTypes.mod.SemanticTokensDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensDeltaRequest {
  
  @JSImport("vscode-languageserver-protocol", "SemanticTokensDeltaRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "SemanticTokensDeltaRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashfullSlashdelta = js.native
  
  /* was `typeof SemanticTokensRegistrationType.method` */
  @JSImport("vscode-languageserver-protocol", "SemanticTokensDeltaRequest.registrationMethod")
  @js.native
  val registrationMethod: textDocumentSlashsemanticTokens = js.native
  
  @JSImport("vscode-languageserver-protocol", "SemanticTokensDeltaRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    SemanticTokensDeltaParams, 
    typings.vscodeLanguageserverTypes.mod.SemanticTokens | SemanticTokensDelta | Null, 
    SemanticTokensPartialResult | SemanticTokensDeltaPartialResult, 
    Unit, 
    SemanticTokensRegistrationOptions
  ] = js.native
}
