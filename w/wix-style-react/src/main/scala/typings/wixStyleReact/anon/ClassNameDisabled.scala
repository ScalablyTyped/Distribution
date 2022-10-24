package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameDisabled extends StObject {
  
  var children: Any
  
  var className: Any
  
  var disabled: Any
  
  var draggable: Any
}
object ClassNameDisabled {
  
  inline def apply(children: Any, className: Any, disabled: Any, draggable: Any): ClassNameDisabled = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameDisabled]
  }
  
  extension [Self <: ClassNameDisabled](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDraggable(value: Any): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
  }
}
