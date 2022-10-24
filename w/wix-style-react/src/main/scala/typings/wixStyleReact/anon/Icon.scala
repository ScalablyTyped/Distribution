package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var className: Any
  
  var dataHook: Any
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icon: Any
  
  var onClick: Any
  
  var size: Any
  
  var skin: Any
}
object Icon {
  
  inline def apply(className: Any, dataHook: Any, icon: Any, onClick: Any, size: Any, skin: Any): Icon = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSkin(value: Any): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
  }
}
