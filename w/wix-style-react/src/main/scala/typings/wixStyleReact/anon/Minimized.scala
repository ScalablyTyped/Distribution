package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minimized extends StObject {
  
  var children: Any
  
  var minimized: Any
}
object Minimized {
  
  inline def apply(children: Any, minimized: Any): Minimized = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minimized]
  }
  
  extension [Self <: Minimized](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setMinimized(value: Any): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
  }
}
