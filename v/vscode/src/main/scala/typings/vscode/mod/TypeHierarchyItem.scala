package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TypeHierarchyItem")
@js.native
open class TypeHierarchyItem protected () extends StObject {
  /**
    * Creates a new type hierarchy item.
    *
    * @param kind The kind of the item.
    * @param name The name of the item.
    * @param detail The details of the item.
    * @param uri The Uri of the item.
    * @param range The whole range of the item.
    * @param selectionRange The selection range of the item.
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
    * The range enclosing this symbol not including leading/trailing whitespace
    * but everything else, e.g. comments and code.
    */
  var range: Range = js.native
  
  /**
    * The range that should be selected and revealed when this symbol is being
    * picked, e.g. the name of a class. Must be contained by the {@link TypeHierarchyItem.range range}-property.
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
