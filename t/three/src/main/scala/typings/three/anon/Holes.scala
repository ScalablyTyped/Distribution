package typings.three.anon

import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Holes extends StObject {
  
  var holes: js.Array[js.Array[Vector2]]
  
  var shape: js.Array[Vector2]
}
object Holes {
  
  inline def apply(holes: js.Array[js.Array[Vector2]], shape: js.Array[Vector2]): Holes = {
    val __obj = js.Dynamic.literal(holes = holes.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Holes]
  }
  
  extension [Self <: Holes](x: Self) {
    
    inline def setHoles(value: js.Array[js.Array[Vector2]]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
    
    inline def setHolesVarargs(value: js.Array[Vector2]*): Self = StObject.set(x, "holes", js.Array(value*))
    
    inline def setShape(value: js.Array[Vector2]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Vector2*): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
