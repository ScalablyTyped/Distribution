package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Controls extends StObject {
  
  var children: Any
  
  var className: Any
  
  var controls: Any
  
  var dataHook: Any
  
  var hideOverflow: Any
  
  var showShadow: Any
  
  var stretchVertically: Any
}
object Controls {
  
  inline def apply(
    children: Any,
    className: Any,
    controls: Any,
    dataHook: Any,
    hideOverflow: Any,
    showShadow: Any,
    stretchVertically: Any
  ): Controls = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], hideOverflow = hideOverflow.asInstanceOf[js.Any], showShadow = showShadow.asInstanceOf[js.Any], stretchVertically = stretchVertically.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controls]
  }
  
  extension [Self <: Controls](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setControls(value: Any): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setHideOverflow(value: Any): Self = StObject.set(x, "hideOverflow", value.asInstanceOf[js.Any])
    
    inline def setShowShadow(value: Any): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    inline def setStretchVertically(value: Any): Self = StObject.set(x, "stretchVertically", value.asInstanceOf[js.Any])
  }
}
