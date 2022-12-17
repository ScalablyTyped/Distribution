package typings.victoryCore.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeRendering extends StObject {
  
  var groupComponent: Element
  
  var lineComponent: Element
  
  var role: String
  
  var shapeRendering: String
}
object ShapeRendering {
  
  inline def apply(groupComponent: Element, lineComponent: Element, role: String, shapeRendering: String): ShapeRendering = {
    val __obj = js.Dynamic.literal(groupComponent = groupComponent.asInstanceOf[js.Any], lineComponent = lineComponent.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeRendering]
  }
  
  extension [Self <: ShapeRendering](x: Self) {
    
    inline def setGroupComponent(value: Element): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setLineComponent(value: Element): Self = StObject.set(x, "lineComponent", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
  }
}
