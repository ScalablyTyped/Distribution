package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenSize extends StObject {
  
  var children: Any
  
  var size: Any
}
object ChildrenSize {
  
  inline def apply(children: Any, size: Any): ChildrenSize = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenSize]
  }
  
  extension [Self <: ChildrenSize](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
