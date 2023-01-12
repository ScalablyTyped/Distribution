package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReshapeAttrs extends StObject {
  
  var shape: js.Array[Double]
}
object ReshapeAttrs {
  
  inline def apply(shape: js.Array[Double]): ReshapeAttrs = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReshapeAttrs] (val x: Self) extends AnyVal {
    
    inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
