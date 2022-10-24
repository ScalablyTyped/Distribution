package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoveredBoolean extends StObject {
  
  var hovered: Boolean
}
object HoveredBoolean {
  
  inline def apply(hovered: Boolean): HoveredBoolean = {
    val __obj = js.Dynamic.literal(hovered = hovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoveredBoolean]
  }
  
  extension [Self <: HoveredBoolean](x: Self) {
    
    inline def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
  }
}
