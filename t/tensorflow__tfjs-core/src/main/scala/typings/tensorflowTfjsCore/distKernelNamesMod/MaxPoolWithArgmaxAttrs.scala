package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxPoolWithArgmaxAttrs extends StObject {
  
  var filterSize: (js.Tuple2[Double, Double]) | Double
  
  var includeBatchInIndex: Boolean
  
  var pad: valid_ | same_ | Double
  
  var strides: (js.Tuple2[Double, Double]) | Double
}
object MaxPoolWithArgmaxAttrs {
  
  inline def apply(
    filterSize: (js.Tuple2[Double, Double]) | Double,
    includeBatchInIndex: Boolean,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): MaxPoolWithArgmaxAttrs = {
    val __obj = js.Dynamic.literal(filterSize = filterSize.asInstanceOf[js.Any], includeBatchInIndex = includeBatchInIndex.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxPoolWithArgmaxAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxPoolWithArgmaxAttrs] (val x: Self) extends AnyVal {
    
    inline def setFilterSize(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "filterSize", value.asInstanceOf[js.Any])
    
    inline def setIncludeBatchInIndex(value: Boolean): Self = StObject.set(x, "includeBatchInIndex", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_ | Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
