package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var children: Any
  
  var className: Any
  
  var dataHook: Any
  
  var position: Any
}
object Position {
  
  inline def apply(children: Any, className: Any, dataHook: Any, position: Any): Position = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
