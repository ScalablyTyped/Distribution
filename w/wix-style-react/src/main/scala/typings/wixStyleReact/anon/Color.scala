package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: Any
}
object Color {
  
  inline def apply(color: Any): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
