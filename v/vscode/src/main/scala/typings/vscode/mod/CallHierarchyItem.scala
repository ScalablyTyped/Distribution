package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "CallHierarchyItem")
@js.native
class CallHierarchyItem protected () extends js.Object {
  /**
    * Creates a new call hierarchy item.
    */
  def this(kind: SymbolKind, name: String, detail: String, uri: Uri, range: Range, selectionRange: Range) = this()
  
  /**
    * More detail for this item, e.g. the signature of a function.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * The kind of this item.
    */
  var kind: SymbolKind = js.native
  
  /**
    * The name of this item.
    */
  var name: String = js.native
  
  /**
    * The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code.
    */
  var range: Range = js.native
  
  /**
    * The range that should be selected and revealed when this symbol is being picked, e.g. the name of a function.
    * Must be contained by the [`range`](#CallHierarchyItem.range).
    */
  var selectionRange: Range = js.native
  
  /**
    * Tags for this item.
    */
  var tags: js.UndefOr[js.Array[SymbolTag]] = js.native
  
  /**
    * The resource identifier of this item.
    */
  var uri: Uri = js.native
}
