package typings.wixUiIconsCommon.anon

import typings.wixUiIconsCommon.typesMod.IconMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebouncedSearch extends js.Object {
  
  def debouncedSearch(query: String): Unit = js.native
  
  var filteredIconsMetadata: js.Array[IconMetadata] = js.native
}
object DebouncedSearch {
  
  @scala.inline
  def apply(debouncedSearch: String => Unit, filteredIconsMetadata: js.Array[IconMetadata]): DebouncedSearch = {
    val __obj = js.Dynamic.literal(debouncedSearch = js.Any.fromFunction1(debouncedSearch), filteredIconsMetadata = filteredIconsMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebouncedSearch]
  }
  
  @scala.inline
  implicit class DebouncedSearchOps[Self <: DebouncedSearch] (val x: Self) extends AnyVal {
    
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
    def setDebouncedSearch(value: String => Unit): Self = this.set("debouncedSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilteredIconsMetadataVarargs(value: IconMetadata*): Self = this.set("filteredIconsMetadata", js.Array(value :_*))
    
    @scala.inline
    def setFilteredIconsMetadata(value: js.Array[IconMetadata]): Self = this.set("filteredIconsMetadata", value.asInstanceOf[js.Any])
  }
}
