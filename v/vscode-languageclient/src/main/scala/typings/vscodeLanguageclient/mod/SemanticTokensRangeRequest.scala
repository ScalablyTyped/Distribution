package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokensSlashrange
import typings.vscodeLanguageserverProtocol.protocolSemanticTokensMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.protocolSemanticTokensMod.SemanticTokensRangeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensRangeRequest {
  
  @JSImport("vscode-languageclient", "SemanticTokensRangeRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "SemanticTokensRangeRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashrange = js.native
  
  /* was `typeof SemanticTokensRegistrationType.method` */
  @JSImport("vscode-languageclient", "SemanticTokensRangeRequest.registrationMethod")
  @js.native
  val registrationMethod: textDocumentSlashsemanticTokens = js.native
  
  @JSImport("vscode-languageclient", "SemanticTokensRangeRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    SemanticTokensRangeParams, 
    typings.vscodeLanguageserverTypes.mod.SemanticTokens | Null, 
    SemanticTokensPartialResult, 
    Unit, 
    Unit
  ] = js.native
}
