package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.completionItemSlashresolve
import typings.vscodeLanguageserverTypes.mod.CompletionItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "CompletionResolveRequest")
@js.native
object CompletionResolveRequest extends js.Object {
  val method: completionItemSlashresolve = js.native
  val `type`: ProtocolRequestType[CompletionItem, CompletionItem, scala.Nothing, Unit, Unit] = js.native
}

