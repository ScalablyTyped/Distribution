package typings.vscodeLanguageclient

import typings.vscode.mod.CompletionItem
import typings.vscode.mod.CompletionItemLabel
import typings.vscodeLanguageserverTypes.mod.CompletionItemKind
import typings.vscodeLanguageserverTypes.mod.InsertTextMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCompletionItemMod {
  
  @JSImport("vscode-languageclient/lib/common/protocolCompletionItem", JSImport.Default)
  @js.native
  open class default protected () extends ProtocolCompletionItem {
    def this(label: String) = this()
    def this(label: CompletionItemLabel) = this()
  }
  
  @js.native
  trait ProtocolCompletionItem extends CompletionItem {
    
    var data: Any = js.native
    
    var deprecated: js.UndefOr[Boolean] = js.native
    
    var documentationFormat: js.UndefOr[String] = js.native
    
    var fromEdit: js.UndefOr[Boolean] = js.native
    
    var insertTextMode: js.UndefOr[InsertTextMode] = js.native
    
    var originalItemKind: js.UndefOr[CompletionItemKind] = js.native
  }
}
