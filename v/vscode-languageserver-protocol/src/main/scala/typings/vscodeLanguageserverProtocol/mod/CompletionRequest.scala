package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typings.vscodeLanguageserverProtocol.protocolMod.CompletionRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcompletion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CompletionRequest")
@js.native
object CompletionRequest extends js.Object {
  val method: textDocumentSlashcompletion = js.native
  /** @deprecated Use CompletionRequest.type */
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem]] = js.native
  val `type`: ProtocolRequestType[
    CompletionParams, 
    typings.vscodeLanguageserverTypes.mod.CompletionList | js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem], 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}

