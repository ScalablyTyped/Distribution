package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHovered extends StObject {
  
  var isHovered: Boolean
}
object IsHovered {
  
  inline def apply(isHovered: Boolean): IsHovered = {
    val __obj = js.Dynamic.literal(isHovered = isHovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHovered]
  }
  
  extension [Self <: IsHovered](x: Self) {
    
    inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
  }
}
