package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.completionItemSlashresolve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CompletionResolveRequest")
@js.native
object CompletionResolveRequest extends js.Object {
  val method: completionItemSlashresolve = js.native
  val `type`: ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.CompletionItem, 
    typings.vscodeLanguageserverTypes.mod.CompletionItem, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}

