package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandDims extends StObject {
  
  var expandDims: js.Array[Double]
  
  var permutationIndices: js.Array[Double]
}
object ExpandDims {
  
  inline def apply(expandDims: js.Array[Double], permutationIndices: js.Array[Double]): ExpandDims = {
    val __obj = js.Dynamic.literal(expandDims = expandDims.asInstanceOf[js.Any], permutationIndices = permutationIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandDims]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandDims] (val x: Self) extends AnyVal {
    
    inline def setExpandDims(value: js.Array[Double]): Self = StObject.set(x, "expandDims", value.asInstanceOf[js.Any])
    
    inline def setExpandDimsVarargs(value: Double*): Self = StObject.set(x, "expandDims", js.Array(value*))
    
    inline def setPermutationIndices(value: js.Array[Double]): Self = StObject.set(x, "permutationIndices", value.asInstanceOf[js.Any])
    
    inline def setPermutationIndicesVarargs(value: Double*): Self = StObject.set(x, "permutationIndices", js.Array(value*))
  }
}
