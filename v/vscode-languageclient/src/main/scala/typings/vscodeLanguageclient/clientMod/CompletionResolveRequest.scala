package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.completionItemSlashresolve
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CompletionResolveRequest")
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

