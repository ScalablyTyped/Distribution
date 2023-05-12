package typings.three.anon

import typings.three.examplesJsmGeometriesTextGeometryMod.TextGeometryParameters
import typings.three.srcThreeMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  val options: TextGeometryParameters
  
  val shapes: Shape | js.Array[Shape]
}
object Options {
  
  inline def apply(options: TextGeometryParameters, shapes: Shape | js.Array[Shape]): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: TextGeometryParameters): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setShapes(value: Shape | js.Array[Shape]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesVarargs(value: Shape*): Self = StObject.set(x, "shapes", js.Array(value*))
  }
}
