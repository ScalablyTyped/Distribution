package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackButtonValue extends StObject {
  
  var backButtonValue: Any
  
  var children: Any
  
  var dataHook: Any
  
  var dropShadow: Any
  
  var onBackClick: Any
  
  var size: Any
}
object BackButtonValue {
  
  inline def apply(backButtonValue: Any, children: Any, dataHook: Any, dropShadow: Any, onBackClick: Any, size: Any): BackButtonValue = {
    val __obj = js.Dynamic.literal(backButtonValue = backButtonValue.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], dropShadow = dropShadow.asInstanceOf[js.Any], onBackClick = onBackClick.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackButtonValue]
  }
  
  extension [Self <: BackButtonValue](x: Self) {
    
    inline def setBackButtonValue(value: Any): Self = StObject.set(x, "backButtonValue", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDropShadow(value: Any): Self = StObject.set(x, "dropShadow", value.asInstanceOf[js.Any])
    
    inline def setOnBackClick(value: Any): Self = StObject.set(x, "onBackClick", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
