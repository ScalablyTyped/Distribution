package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Divider extends StObject {
  
  var children: Any
  
  var className: Any
  
  var dataHook: Any
  
  var divider: Any
}
object Divider {
  
  inline def apply(children: Any, className: Any, dataHook: Any, divider: Any): Divider = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Divider]
  }
  
  extension [Self <: Divider](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDivider(value: Any): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
  }
}
