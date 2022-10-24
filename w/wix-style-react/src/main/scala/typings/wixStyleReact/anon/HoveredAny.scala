package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoveredAny extends StObject {
  
  var hovered: Any
}
object HoveredAny {
  
  inline def apply(hovered: Any): HoveredAny = {
    val __obj = js.Dynamic.literal(hovered = hovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoveredAny]
  }
  
  extension [Self <: HoveredAny](x: Self) {
    
    inline def setHovered(value: Any): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
  }
}
