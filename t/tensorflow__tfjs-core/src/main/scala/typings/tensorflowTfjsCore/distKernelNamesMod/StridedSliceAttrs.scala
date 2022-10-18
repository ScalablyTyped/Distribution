package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StridedSliceAttrs extends StObject {
  
  var begin: js.Array[Double]
  
  var beginMask: Double
  
  var ellipsisMask: Double
  
  var end: js.Array[Double]
  
  var endMask: Double
  
  var newAxisMask: Double
  
  var shrinkAxisMask: Double
  
  var strides: js.Array[Double]
}
object StridedSliceAttrs {
  
  inline def apply(
    begin: js.Array[Double],
    beginMask: Double,
    ellipsisMask: Double,
    end: js.Array[Double],
    endMask: Double,
    newAxisMask: Double,
    shrinkAxisMask: Double,
    strides: js.Array[Double]
  ): StridedSliceAttrs = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], beginMask = beginMask.asInstanceOf[js.Any], ellipsisMask = ellipsisMask.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endMask = endMask.asInstanceOf[js.Any], newAxisMask = newAxisMask.asInstanceOf[js.Any], shrinkAxisMask = shrinkAxisMask.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StridedSliceAttrs]
  }
  
  extension [Self <: StridedSliceAttrs](x: Self) {
    
    inline def setBegin(value: js.Array[Double]): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginMask(value: Double): Self = StObject.set(x, "beginMask", value.asInstanceOf[js.Any])
    
    inline def setBeginVarargs(value: Double*): Self = StObject.set(x, "begin", js.Array(value*))
    
    inline def setEllipsisMask(value: Double): Self = StObject.set(x, "ellipsisMask", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: js.Array[Double]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndMask(value: Double): Self = StObject.set(x, "endMask", value.asInstanceOf[js.Any])
    
    inline def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value*))
    
    inline def setNewAxisMask(value: Double): Self = StObject.set(x, "newAxisMask", value.asInstanceOf[js.Any])
    
    inline def setShrinkAxisMask(value: Double): Self = StObject.set(x, "shrinkAxisMask", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
    
    inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
  }
}
