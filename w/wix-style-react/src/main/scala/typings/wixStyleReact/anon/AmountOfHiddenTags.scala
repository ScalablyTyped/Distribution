package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountOfHiddenTags extends StObject {
  
  var amountOfHiddenTags: Any
  
  var dataHook: Any
  
  var isExpanded: Any
  
  var onClick: Any
  
  var toggleMoreButton: Any
}
object AmountOfHiddenTags {
  
  inline def apply(amountOfHiddenTags: Any, dataHook: Any, isExpanded: Any, onClick: Any, toggleMoreButton: Any): AmountOfHiddenTags = {
    val __obj = js.Dynamic.literal(amountOfHiddenTags = amountOfHiddenTags.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], toggleMoreButton = toggleMoreButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountOfHiddenTags]
  }
  
  extension [Self <: AmountOfHiddenTags](x: Self) {
    
    inline def setAmountOfHiddenTags(value: Any): Self = StObject.set(x, "amountOfHiddenTags", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setIsExpanded(value: Any): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setToggleMoreButton(value: Any): Self = StObject.set(x, "toggleMoreButton", value.asInstanceOf[js.Any])
  }
}
