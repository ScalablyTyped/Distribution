package typings.uiGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISortInfo extends StObject {
  
  var direction: js.UndefOr[String] = js.undefined
  
  var ignoreSort: js.UndefOr[Boolean] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
}
object ISortInfo {
  
  inline def apply(): ISortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortInfo]
  }
  
  extension [Self <: ISortInfo](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIgnoreSort(value: Boolean): Self = StObject.set(x, "ignoreSort", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSortUndefined: Self = StObject.set(x, "ignoreSort", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
