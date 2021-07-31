package typings.vscodeLanguageclient

import typings.vscode.mod.CompletionItem
import typings.vscodeLanguageserverTypes.mod.CompletionItemKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCompletionItemMod {
  
  @JSImport("vscode-languageclient/lib/protocolCompletionItem", JSImport.Default)
  @js.native
  class default protected () extends ProtocolCompletionItem {
    def this(label: String) = this()
  }
  
  @js.native
  trait ProtocolCompletionItem extends CompletionItem {
    
    var data: js.Any = js.native
    
    var deprecated: Boolean = js.native
    
    var documentationFormat: String = js.native
    
    var fromEdit: Boolean = js.native
    
    var originalItemKind: CompletionItemKind = js.native
  }
}
