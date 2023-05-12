package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeHierarchyItem extends StObject {
  
  /**
    * A data entry field that is preserved between a type hierarchy prepare and
    * supertypes or subtypes requests. It could also be used to identify the
    * type hierarchy in the server, helping improve the performance on
    * resolving supertypes and subtypes.
    */
  var data: js.UndefOr[LSPAny] = js.undefined
  
  /**
    * More detail for this item, e.g. the signature of a function.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of this item.
    */
  var kind: SymbolKind
  
  /**
    * The name of this item.
    */
  var name: String
  
  /**
    * The range enclosing this symbol not including leading/trailing whitespace
    * but everything else, e.g. comments and code.
    */
  var range: Range
  
  /**
    * The range that should be selected and revealed when this symbol is being
    * picked, e.g. the name of a function. Must be contained by the
    * {@link TypeHierarchyItem.range `range`}.
    */
  var selectionRange: Range
  
  /**
    * Tags for this item.
    */
  var tags: js.UndefOr[js.Array[SymbolTag]] = js.undefined
  
  /**
    * The resource identifier of this item.
    */
  var uri: DocumentUri
}
object TypeHierarchyItem {
  
  inline def apply(kind: SymbolKind, name: String, range: Range, selectionRange: Range, uri: DocumentUri): TypeHierarchyItem = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selectionRange = selectionRange.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeHierarchyItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeHierarchyItem] (val x: Self) extends AnyVal {
    
    inline def setData(value: LSPAny): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setKind(value: SymbolKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSelectionRange(value: Range): Self = StObject.set(x, "selectionRange", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[SymbolTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: SymbolTag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
