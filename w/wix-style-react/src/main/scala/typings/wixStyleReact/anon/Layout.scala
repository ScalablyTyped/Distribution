package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var children: Any
  
  var className: Any
  
  var dataHook: Any
  
  var layout: Any
}
object Layout {
  
  inline def apply(children: Any, className: Any, dataHook: Any, layout: Any): Layout = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  extension [Self <: Layout](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
