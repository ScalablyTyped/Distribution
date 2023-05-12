package typings.three.anon

import typings.three.srcExtrasCoreShapeMod.Shape
import typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shapes extends StObject {
  
  val options: ExtrudeGeometryOptions
  
  val shapes: Shape | js.Array[Shape]
}
object Shapes {
  
  inline def apply(options: ExtrudeGeometryOptions, shapes: Shape | js.Array[Shape]): Shapes = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shapes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shapes] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: ExtrudeGeometryOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setShapes(value: Shape | js.Array[Shape]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesVarargs(value: Shape*): Self = StObject.set(x, "shapes", js.Array(value*))
  }
}
