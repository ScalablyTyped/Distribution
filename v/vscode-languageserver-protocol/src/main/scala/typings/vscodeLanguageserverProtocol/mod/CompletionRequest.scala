package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcompletion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionRequest {
  
  @JSImport("vscode-languageserver-protocol", "CompletionRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "CompletionRequest.method")
  @js.native
  val method: textDocumentSlashcompletion = js.native
  
  @JSImport("vscode-languageserver-protocol", "CompletionRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CompletionParams, 
    typings.vscodeLanguageserverTypes.mod.CompletionList | js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem], 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}
