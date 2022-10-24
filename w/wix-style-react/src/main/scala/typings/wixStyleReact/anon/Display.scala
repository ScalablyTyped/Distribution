package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var children: Any
  
  var display: Any
}
object Display {
  
  inline def apply(children: Any, display: Any): Display = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  extension [Self <: Display](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Any): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
  }
}
