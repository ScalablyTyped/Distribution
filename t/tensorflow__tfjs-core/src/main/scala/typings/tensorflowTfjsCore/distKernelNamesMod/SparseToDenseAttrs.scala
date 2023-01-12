package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparseToDenseAttrs extends StObject {
  
  var outputShape: js.Array[Double]
}
object SparseToDenseAttrs {
  
  inline def apply(outputShape: js.Array[Double]): SparseToDenseAttrs = {
    val __obj = js.Dynamic.literal(outputShape = outputShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparseToDenseAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SparseToDenseAttrs] (val x: Self) extends AnyVal {
    
    inline def setOutputShape(value: js.Array[Double]): Self = StObject.set(x, "outputShape", value.asInstanceOf[js.Any])
    
    inline def setOutputShapeVarargs(value: Double*): Self = StObject.set(x, "outputShape", js.Array(value*))
  }
}
