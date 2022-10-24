package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var active: Any
  
  var className: Any
  
  var disabled: Any
  
  var hovered: Any
  
  var number: Any
  
  var styleType: Any
  
  var `type`: Any
}
object Number {
  
  inline def apply(active: Any, className: Any, disabled: Any, hovered: Any, number: Any, styleType: Any, `type`: Any): Number = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], styleType = styleType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
  
  extension [Self <: Number](x: Self) {
    
    inline def setActive(value: Any): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHovered(value: Any): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Any): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setStyleType(value: Any): Self = StObject.set(x, "styleType", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
