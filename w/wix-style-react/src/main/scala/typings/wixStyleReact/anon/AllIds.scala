package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllIds extends StObject {
  
  var allIds: Any
  
  var deselectRowsByDefault: Any
  
  var notSelectedIds: Any
  
  var selectedIds: Any
  
  var selectionDisabled: Any
  
  var totalCount: js.UndefOr[Double] = js.undefined
}
object AllIds {
  
  inline def apply(
    allIds: Any,
    deselectRowsByDefault: Any,
    notSelectedIds: Any,
    selectedIds: Any,
    selectionDisabled: Any
  ): AllIds = {
    val __obj = js.Dynamic.literal(allIds = allIds.asInstanceOf[js.Any], deselectRowsByDefault = deselectRowsByDefault.asInstanceOf[js.Any], notSelectedIds = notSelectedIds.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any], selectionDisabled = selectionDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllIds]
  }
  
  extension [Self <: AllIds](x: Self) {
    
    inline def setAllIds(value: Any): Self = StObject.set(x, "allIds", value.asInstanceOf[js.Any])
    
    inline def setDeselectRowsByDefault(value: Any): Self = StObject.set(x, "deselectRowsByDefault", value.asInstanceOf[js.Any])
    
    inline def setNotSelectedIds(value: Any): Self = StObject.set(x, "notSelectedIds", value.asInstanceOf[js.Any])
    
    inline def setSelectedIds(value: Any): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
    
    inline def setSelectionDisabled(value: Any): Self = StObject.set(x, "selectionDisabled", value.asInstanceOf[js.Any])
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
