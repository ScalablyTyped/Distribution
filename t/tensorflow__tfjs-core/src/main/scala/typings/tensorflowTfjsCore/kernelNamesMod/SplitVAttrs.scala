package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitVAttrs extends StObject {
  
  var axis: Double
  
  var numOrSizeSplits: js.Array[Double] | Double
}
object SplitVAttrs {
  
  inline def apply(axis: Double, numOrSizeSplits: js.Array[Double] | Double): SplitVAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], numOrSizeSplits = numOrSizeSplits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitVAttrs]
  }
  
  extension [Self <: SplitVAttrs](x: Self) {
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setNumOrSizeSplits(value: js.Array[Double] | Double): Self = StObject.set(x, "numOrSizeSplits", value.asInstanceOf[js.Any])
    
    inline def setNumOrSizeSplitsVarargs(value: Double*): Self = StObject.set(x, "numOrSizeSplits", js.Array(value*))
  }
}
