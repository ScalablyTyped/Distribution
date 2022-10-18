package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokensSlashfull
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensRequest {
  
  @JSImport("vscode-languageclient", "SemanticTokensRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "SemanticTokensRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashfull = js.native
  
  /* was `typeof SemanticTokensRegistrationType.method` */
  @JSImport("vscode-languageclient", "SemanticTokensRequest.registrationMethod")
  @js.native
  val registrationMethod: textDocumentSlashsemanticTokens = js.native
  
  @JSImport("vscode-languageclient", "SemanticTokensRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    SemanticTokensParams, 
    typings.vscodeLanguageserverTypes.mod.SemanticTokens | Null, 
    SemanticTokensPartialResult, 
    Unit, 
    SemanticTokensRegistrationOptions
  ] = js.native
}
