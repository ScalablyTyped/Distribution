package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchValue extends StObject {
  
  var items: Any
  
  var searchValue: Any
  
  var totalCount: Any
}
object SearchValue {
  
  inline def apply(items: Any, searchValue: Any, totalCount: Any): SearchValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchValue]
  }
  
  extension [Self <: SearchValue](x: Self) {
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setSearchValue(value: Any): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    
    inline def setTotalCount(value: Any): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
