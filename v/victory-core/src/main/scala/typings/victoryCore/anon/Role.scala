package typings.victoryCore.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Role extends StObject {
  
  var rectComponent: Element
  
  var role: String
  
  var shapeRendering: String
}
object Role {
  
  inline def apply(rectComponent: Element, role: String, shapeRendering: String): Role = {
    val __obj = js.Dynamic.literal(rectComponent = rectComponent.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Role] (val x: Self) extends AnyVal {
    
    inline def setRectComponent(value: Element): Self = StObject.set(x, "rectComponent", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
  }
}
