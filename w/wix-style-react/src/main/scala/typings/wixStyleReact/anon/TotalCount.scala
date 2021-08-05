package typings.wixStyleReact.anon

import typings.wixStyleReact.selectorListContentMod.SelectorListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalCount extends StObject {
  
  var items: js.Array[SelectorListItem]
  
  var totalCount: Double
}
object TotalCount {
  
  inline def apply(items: js.Array[SelectorListItem], totalCount: Double): TotalCount = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalCount]
  }
  
  extension [Self <: TotalCount](x: Self) {
    
    inline def setItems(value: js.Array[SelectorListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: SelectorListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
