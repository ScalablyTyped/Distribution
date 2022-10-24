package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEmpty extends StObject {
  
  var isEmpty: Boolean
  
  var isLoaded: Boolean
  
  var isSearching: Boolean
  
  var items: js.Array[scala.Nothing]
  
  var noResultsFound: Boolean
  
  var searchValue: String
  
  var selectedItems: js.Array[scala.Nothing]
}
object IsEmpty {
  
  inline def apply(
    isEmpty: Boolean,
    isLoaded: Boolean,
    isSearching: Boolean,
    items: js.Array[scala.Nothing],
    noResultsFound: Boolean,
    searchValue: String,
    selectedItems: js.Array[scala.Nothing]
  ): IsEmpty = {
    val __obj = js.Dynamic.literal(isEmpty = isEmpty.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isSearching = isSearching.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], noResultsFound = noResultsFound.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEmpty]
  }
  
  extension [Self <: IsEmpty](x: Self) {
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
    
    inline def setIsSearching(value: Boolean): Self = StObject.set(x, "isSearching", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[scala.Nothing]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: scala.Nothing*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNoResultsFound(value: Boolean): Self = StObject.set(x, "noResultsFound", value.asInstanceOf[js.Any])
    
    inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    
    inline def setSelectedItems(value: js.Array[scala.Nothing]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsVarargs(value: scala.Nothing*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
