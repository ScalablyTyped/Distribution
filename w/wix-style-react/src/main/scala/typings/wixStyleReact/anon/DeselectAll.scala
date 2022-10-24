package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeselectAll extends StObject {
  
  var dataHook: Any
  
  var deselectAll: Any
  
  var deselectAllText: Any
  
  var enabledItemsAmount: Any
  
  var selectAll: Any
  
  var selectAllText: Any
  
  var selectedEnabledItemsAmount: Any
}
object DeselectAll {
  
  inline def apply(
    dataHook: Any,
    deselectAll: Any,
    deselectAllText: Any,
    enabledItemsAmount: Any,
    selectAll: Any,
    selectAllText: Any,
    selectedEnabledItemsAmount: Any
  ): DeselectAll = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], deselectAll = deselectAll.asInstanceOf[js.Any], deselectAllText = deselectAllText.asInstanceOf[js.Any], enabledItemsAmount = enabledItemsAmount.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectAllText = selectAllText.asInstanceOf[js.Any], selectedEnabledItemsAmount = selectedEnabledItemsAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeselectAll]
  }
  
  extension [Self <: DeselectAll](x: Self) {
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDeselectAll(value: Any): Self = StObject.set(x, "deselectAll", value.asInstanceOf[js.Any])
    
    inline def setDeselectAllText(value: Any): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
    
    inline def setEnabledItemsAmount(value: Any): Self = StObject.set(x, "enabledItemsAmount", value.asInstanceOf[js.Any])
    
    inline def setSelectAll(value: Any): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    inline def setSelectAllText(value: Any): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    inline def setSelectedEnabledItemsAmount(value: Any): Self = StObject.set(x, "selectedEnabledItemsAmount", value.asInstanceOf[js.Any])
  }
}
