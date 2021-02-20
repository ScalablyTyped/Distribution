package typings.wixUiIconsCommon

import typings.wixUiIconsCommon.typesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DebouncedSearch extends StObject {
    
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
    implicit class DebouncedSearchMutableBuilder[Self <: DebouncedSearch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebouncedSearch(value: String => Unit): Self = StObject.set(x, "debouncedSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilteredIconsMetadata(value: js.Array[IconMetadata]): Self = StObject.set(x, "filteredIconsMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredIconsMetadataVarargs(value: IconMetadata*): Self = StObject.set(x, "filteredIconsMetadata", js.Array(value :_*))
    }
  }
}
