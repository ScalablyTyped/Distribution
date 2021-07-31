package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterNdAttrs extends StObject {
  
  var shape: js.Array[Double]
}
object ScatterNdAttrs {
  
  @scala.inline
  def apply(shape: js.Array[Double]): ScatterNdAttrs = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterNdAttrs]
  }
  
  @scala.inline
  implicit class ScatterNdAttrsMutableBuilder[Self <: ScatterNdAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
  }
}
