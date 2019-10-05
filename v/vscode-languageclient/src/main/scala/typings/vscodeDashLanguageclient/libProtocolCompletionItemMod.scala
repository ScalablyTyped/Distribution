package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.CompletionItem
import typings.vscodeDashLanguageclient.libProtocolCompletionItemMod.ProtocolCompletionItem
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItemKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/protocolCompletionItem", JSImport.Namespace)
@js.native
object libProtocolCompletionItemMod extends js.Object {
  @js.native
  trait ProtocolCompletionItem extends CompletionItem {
    var data: js.Any = js.native
    var deprecated: Boolean = js.native
    var documentationFormat: String = js.native
    var fromEdit: Boolean = js.native
    var originalItemKind: CompletionItemKind = js.native
  }
  
  @js.native
  class default protected () extends ProtocolCompletionItem {
    def this(label: String) = this()
  }
  
}

