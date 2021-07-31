package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxAttrs extends StObject {
  
  var keepDims: Boolean
  
  var reductionIndices: Double | js.Array[Double]
}
object MaxAttrs {
  
  @scala.inline
  def apply(keepDims: Boolean, reductionIndices: Double | js.Array[Double]): MaxAttrs = {
    val __obj = js.Dynamic.literal(keepDims = keepDims.asInstanceOf[js.Any], reductionIndices = reductionIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAttrs]
  }
  
  @scala.inline
  implicit class MaxAttrsMutableBuilder[Self <: MaxAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepDims(value: Boolean): Self = StObject.set(x, "keepDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReductionIndices(value: Double | js.Array[Double]): Self = StObject.set(x, "reductionIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReductionIndicesVarargs(value: Double*): Self = StObject.set(x, "reductionIndices", js.Array(value :_*))
  }
}
