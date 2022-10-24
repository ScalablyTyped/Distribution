package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesSelectorListContentMod.SelectorListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsTotalCount extends StObject {
  
  var items: js.Array[SelectorListItem]
  
  var totalCount: Double
}
object ItemsTotalCount {
  
  inline def apply(items: js.Array[SelectorListItem], totalCount: Double): ItemsTotalCount = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsTotalCount]
  }
  
  extension [Self <: ItemsTotalCount](x: Self) {
    
    inline def setItems(value: js.Array[SelectorListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: SelectorListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
