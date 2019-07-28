package typings.vscodeDashLanguageclient.libProtocolCompletionItemMod

import typings.vscode.vscodeMod.CompletionItem
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItemKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtocolCompletionItem extends CompletionItem {
  var data: js.Any = js.native
  var deprecated: Boolean = js.native
  var documentationFormat: String = js.native
  var fromEdit: Boolean = js.native
  var originalItemKind: CompletionItemKind = js.native
}

