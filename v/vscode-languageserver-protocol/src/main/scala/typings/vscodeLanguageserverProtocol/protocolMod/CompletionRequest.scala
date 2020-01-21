package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.RequestType
import typings.vscodeLanguageserverTypes.mod.CompletionItem
import typings.vscodeLanguageserverTypes.mod.CompletionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "CompletionRequest")
@js.native
object CompletionRequest extends js.Object {
  val `type`: RequestType[
    CompletionParams, 
    CompletionList | js.Array[CompletionItem] | Null, 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}

