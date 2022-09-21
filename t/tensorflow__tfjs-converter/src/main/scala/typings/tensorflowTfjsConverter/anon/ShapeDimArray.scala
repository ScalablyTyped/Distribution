package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeDimArray extends StObject {
  
  var shape: DimArray
}
object ShapeDimArray {
  
  inline def apply(shape: DimArray): ShapeDimArray = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeDimArray]
  }
  
  extension [Self <: ShapeDimArray](x: Self) {
    
    inline def setShape(value: DimArray): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
