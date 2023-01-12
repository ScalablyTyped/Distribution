package typings.victoryCore.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineComponent extends StObject {
  
  var lineComponent: Element
  
  var role: String
  
  var shapeRendering: String
}
object LineComponent {
  
  inline def apply(lineComponent: Element, role: String, shapeRendering: String): LineComponent = {
    val __obj = js.Dynamic.literal(lineComponent = lineComponent.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineComponent] (val x: Self) extends AnyVal {
    
    inline def setLineComponent(value: Element): Self = StObject.set(x, "lineComponent", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
  }
}
