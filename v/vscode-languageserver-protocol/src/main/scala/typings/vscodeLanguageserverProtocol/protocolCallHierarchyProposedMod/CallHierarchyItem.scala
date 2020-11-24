package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.SymbolKind
import typings.vscodeLanguageserverTypes.mod.SymbolTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchyItem extends js.Object {
  
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
  var uri: DocumentUri = js.native
}
object CallHierarchyItem {
  
  @scala.inline
  def apply(kind: SymbolKind, name: String, range: Range, selectionRange: Range, uri: DocumentUri): CallHierarchyItem = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selectionRange = selectionRange.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyItem]
  }
  
  @scala.inline
  implicit class CallHierarchyItemOps[Self <: CallHierarchyItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: SymbolKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRange(value: Range): Self = this.set("selectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: DocumentUri): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: SymbolTag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[SymbolTag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
