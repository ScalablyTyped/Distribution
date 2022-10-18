package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashsemanticTokensSlashrange
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRangeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensRangeRequest {
  
  @JSImport("vscode-languageserver", "SemanticTokensRangeRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "SemanticTokensRangeRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashrange = js.native
  
  /* was `typeof SemanticTokensRegistrationType.method` */
  @JSImport("vscode-languageserver", "SemanticTokensRangeRequest.registrationMethod")
  @js.native
  val registrationMethod: textDocumentSlashsemanticTokens = js.native
  
  @JSImport("vscode-languageserver", "SemanticTokensRangeRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    SemanticTokensRangeParams, 
    typings.vscodeLanguageserverTypes.mod.SemanticTokens | Null, 
    SemanticTokensPartialResult, 
    Unit, 
    Unit
  ] = js.native
}
