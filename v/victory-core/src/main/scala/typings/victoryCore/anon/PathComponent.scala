package typings.victoryCore.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathComponent extends StObject {
  
  var pathComponent: Element
  
  var role: String
  
  var shapeRendering: String
}
object PathComponent {
  
  inline def apply(pathComponent: Element, role: String, shapeRendering: String): PathComponent = {
    val __obj = js.Dynamic.literal(pathComponent = pathComponent.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathComponent] (val x: Self) extends AnyVal {
    
    inline def setPathComponent(value: Element): Self = StObject.set(x, "pathComponent", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
  }
}
