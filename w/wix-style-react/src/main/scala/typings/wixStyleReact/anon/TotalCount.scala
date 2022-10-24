package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesModalSelectorLayoutMod.ModalSelectorLayoutItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalCount extends StObject {
  
  var items: js.Array[ModalSelectorLayoutItem]
  
  var totalCount: Double
}
object TotalCount {
  
  inline def apply(items: js.Array[ModalSelectorLayoutItem], totalCount: Double): TotalCount = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalCount]
  }
  
  extension [Self <: TotalCount](x: Self) {
    
    inline def setItems(value: js.Array[ModalSelectorLayoutItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ModalSelectorLayoutItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
