package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeDimUndefined extends StObject {
  
  var shape: DimUndefined
}
object ShapeDimUndefined {
  
  inline def apply(shape: DimUndefined): ShapeDimUndefined = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeDimUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeDimUndefined] (val x: Self) extends AnyVal {
    
    inline def setShape(value: DimUndefined): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
