package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashcompletion
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typings.vscodeLanguageserverProtocol.protocolMod.CompletionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionRequest {
  
  @JSImport("vscode-languageserver", "CompletionRequest.method")
  @js.native
  val method: textDocumentSlashcompletion = js.native
  
  /** @deprecated Use CompletionRequest.type */
  @JSImport("vscode-languageserver", "CompletionRequest.resultType")
  @js.native
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem]] = js.native
  
  @JSImport("vscode-languageserver", "CompletionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CompletionParams, 
    typings.vscodeLanguageserverTypes.mod.CompletionList | js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem], 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}
