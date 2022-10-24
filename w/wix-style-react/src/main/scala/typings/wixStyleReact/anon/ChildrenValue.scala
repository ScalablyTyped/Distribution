package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenValue extends StObject {
  
  var children: Any
  
  var value: Any
}
object ChildrenValue {
  
  inline def apply(children: Any, value: Any): ChildrenValue = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenValue]
  }
  
  extension [Self <: ChildrenValue](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
