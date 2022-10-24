package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookIsActive extends StObject {
  
  var children: Any
  
  var dataHook: Any
  
  var isActive: Any
  
  var isDisabled: Any
  
  var onClick: Any
  
  var tooltipText: Any
}
object DataHookIsActive {
  
  inline def apply(children: Any, dataHook: Any, isActive: Any, isDisabled: Any, onClick: Any, tooltipText: Any): DataHookIsActive = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], tooltipText = tooltipText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookIsActive]
  }
  
  extension [Self <: DataHookIsActive](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Any): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: Any): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setTooltipText(value: Any): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
  }
}
