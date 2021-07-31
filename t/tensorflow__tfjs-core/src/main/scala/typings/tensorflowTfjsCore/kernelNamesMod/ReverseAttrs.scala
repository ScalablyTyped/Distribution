package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReverseAttrs extends StObject {
  
  var dims: Double | js.Array[Double]
}
object ReverseAttrs {
  
  @scala.inline
  def apply(dims: Double | js.Array[Double]): ReverseAttrs = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseAttrs]
  }
  
  @scala.inline
  implicit class ReverseAttrsMutableBuilder[Self <: ReverseAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDims(value: Double | js.Array[Double]): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimsVarargs(value: Double*): Self = StObject.set(x, "dims", js.Array(value :_*))
  }
}
