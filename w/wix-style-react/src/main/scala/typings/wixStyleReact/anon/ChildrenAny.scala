package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenAny extends StObject {
  
  var children: Any
}
object ChildrenAny {
  
  inline def apply(children: Any): ChildrenAny = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenAny]
  }
  
  extension [Self <: ChildrenAny](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
