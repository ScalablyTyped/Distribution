package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashsemanticTokensSlashfullSlashdelta
import typings.vscodeLanguageserverProtocol.protocolSemanticTokensMod.SemanticTokensDeltaParams
import typings.vscodeLanguageserverProtocol.protocolSemanticTokensMod.SemanticTokensDeltaPartialResult
import typings.vscodeLanguageserverProtocol.protocolSemanticTokensMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.protocolSemanticTokensMod.SemanticTokensRegistrationOptions
import typings.vscodeLanguageserverTypes.mod.SemanticTokensDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensDeltaRequest {
  
  @JSImport("vscode-languageserver", "SemanticTokensDeltaRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "SemanticTokensDeltaRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashfullSlashdelta = js.native
  
  /* was `typeof SemanticTokensRegistrationType.method` */
  @JSImport("vscode-languageserver", "SemanticTokensDeltaRequest.registrationMethod")
  @js.native
  val registrationMethod: textDocumentSlashsemanticTokens = js.native
  
  @JSImport("vscode-languageserver", "SemanticTokensDeltaRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    SemanticTokensDeltaParams, 
    typings.vscodeLanguageserverTypes.mod.SemanticTokens | SemanticTokensDelta | Null, 
    SemanticTokensPartialResult | SemanticTokensDeltaPartialResult, 
    Unit, 
    SemanticTokensRegistrationOptions
  ] = js.native
}
