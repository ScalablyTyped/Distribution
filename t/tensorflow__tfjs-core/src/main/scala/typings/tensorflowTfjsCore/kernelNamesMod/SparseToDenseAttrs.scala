package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparseToDenseAttrs extends StObject {
  
  var outputShape: js.Array[Double] = js.native
}
object SparseToDenseAttrs {
  
  @scala.inline
  def apply(outputShape: js.Array[Double]): SparseToDenseAttrs = {
    val __obj = js.Dynamic.literal(outputShape = outputShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparseToDenseAttrs]
  }
  
  @scala.inline
  implicit class SparseToDenseAttrsMutableBuilder[Self <: SparseToDenseAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputShape(value: js.Array[Double]): Self = StObject.set(x, "outputShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputShapeVarargs(value: Double*): Self = StObject.set(x, "outputShape", js.Array(value :_*))
  }
}
