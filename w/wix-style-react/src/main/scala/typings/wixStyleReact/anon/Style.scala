package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var children: Any
  
  var className: Any
  
  var style: Any
}
object Style {
  
  inline def apply(children: Any, className: Any, style: Any): Style = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
