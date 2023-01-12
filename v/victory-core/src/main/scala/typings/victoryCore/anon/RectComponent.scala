package typings.victoryCore.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectComponent extends StObject {
  
  var circleComponent: Element
  
  var rectComponent: Element
  
  var role: String
  
  var shapeRendering: String
}
object RectComponent {
  
  inline def apply(circleComponent: Element, rectComponent: Element, role: String, shapeRendering: String): RectComponent = {
    val __obj = js.Dynamic.literal(circleComponent = circleComponent.asInstanceOf[js.Any], rectComponent = rectComponent.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RectComponent] (val x: Self) extends AnyVal {
    
    inline def setCircleComponent(value: Element): Self = StObject.set(x, "circleComponent", value.asInstanceOf[js.Any])
    
    inline def setRectComponent(value: Element): Self = StObject.set(x, "rectComponent", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
  }
}
