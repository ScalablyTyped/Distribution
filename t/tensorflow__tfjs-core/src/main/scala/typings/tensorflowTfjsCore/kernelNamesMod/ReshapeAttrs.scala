package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReshapeAttrs extends StObject {
  
  var shape: js.Array[Double] = js.native
}
object ReshapeAttrs {
  
  @scala.inline
  def apply(shape: js.Array[Double]): ReshapeAttrs = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeAttrs]
  }
  
  @scala.inline
  implicit class ReshapeAttrsMutableBuilder[Self <: ReshapeAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
  }
}
