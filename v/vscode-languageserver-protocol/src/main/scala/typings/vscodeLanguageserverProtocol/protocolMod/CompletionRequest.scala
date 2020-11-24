package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcompletion
import typings.vscodeLanguageserverTypes.mod.CompletionItem
import typings.vscodeLanguageserverTypes.mod.CompletionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "CompletionRequest")
@js.native
object CompletionRequest extends js.Object {
  
  val method: textDocumentSlashcompletion = js.native
  
  /** @deprecated Use CompletionRequest.type */
  val resultType: ProgressType[js.Array[CompletionItem]] = js.native
  
  val `type`: ProtocolRequestType[
    CompletionParams, 
    CompletionList | js.Array[CompletionItem] | Null, 
    js.Array[CompletionItem], 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}
