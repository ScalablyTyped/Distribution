package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashcompletion
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionRequest {
  
  @JSImport("vscode-languageserver", "CompletionRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "CompletionRequest.method")
  @js.native
  val method: textDocumentSlashcompletion = js.native
  
  @JSImport("vscode-languageserver", "CompletionRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CompletionParams, 
    typings.vscodeLanguageserverTypes.mod.CompletionList | js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem], 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}
