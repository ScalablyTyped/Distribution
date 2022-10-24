package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconOnClick extends StObject {
  
  var dataHook: Any
  
  var disabled: Any
  
  var icon: Any
  
  var onClick: Any
  
  var text: Any
}
object IconOnClick {
  
  inline def apply(dataHook: Any, disabled: Any, icon: Any, onClick: Any, text: Any): IconOnClick = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOnClick]
  }
  
  extension [Self <: IconOnClick](x: Self) {
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
