package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashfull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensRequest {
  
  @JSImport("vscode-languageserver-protocol", "SemanticTokensRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "SemanticTokensRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashfull = js.native
  
  /* was `typeof SemanticTokensRegistrationType.method` */
  @JSImport("vscode-languageserver-protocol", "SemanticTokensRequest.registrationMethod")
  @js.native
  val registrationMethod: textDocumentSlashsemanticTokens = js.native
  
  @JSImport("vscode-languageserver-protocol", "SemanticTokensRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    SemanticTokensParams, 
    typings.vscodeLanguageserverTypes.mod.SemanticTokens | Null, 
    SemanticTokensPartialResult, 
    Unit, 
    SemanticTokensRegistrationOptions
  ] = js.native
}
