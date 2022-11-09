package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocused extends StObject {
  
  var isFocused: Boolean
  
  var isHovered: Boolean
}
object IsFocused {
  
  inline def apply(isFocused: Boolean, isHovered: Boolean): IsFocused = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFocused]
  }
  
  extension [Self <: IsFocused](x: Self) {
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
  }
}
