package typings.vscodeLanguageclient

import typings.vscode.mod.CallHierarchyItem
import typings.vscode.mod.Range
import typings.vscode.mod.SymbolKind
import typings.vscode.mod.Uri
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCallHierarchyItemMod {
  
  @JSImport("vscode-languageclient/lib/common/protocolCallHierarchyItem", JSImport.Default)
  @js.native
  open class default protected () extends ProtocolCallHierarchyItem {
    def this(kind: SymbolKind, name: String, detail: String, uri: Uri, range: Range, selectionRange: Range) = this()
    def this(
      kind: SymbolKind,
      name: String,
      detail: String,
      uri: Uri,
      range: Range,
      selectionRange: Range,
      data: LSPAny
    ) = this()
  }
  
  @js.native
  trait ProtocolCallHierarchyItem extends CallHierarchyItem {
    
    var data: js.UndefOr[LSPAny] = js.native
  }
}
