package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeNearestNeighborAttrs extends StObject {
  
  var alignCorners: Boolean
  
  var halfPixelCenters: Boolean
  
  var size: js.Tuple2[Double, Double]
}
object ResizeNearestNeighborAttrs {
  
  inline def apply(alignCorners: Boolean, halfPixelCenters: Boolean, size: js.Tuple2[Double, Double]): ResizeNearestNeighborAttrs = {
    val __obj = js.Dynamic.literal(alignCorners = alignCorners.asInstanceOf[js.Any], halfPixelCenters = halfPixelCenters.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeNearestNeighborAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeNearestNeighborAttrs] (val x: Self) extends AnyVal {
    
    inline def setAlignCorners(value: Boolean): Self = StObject.set(x, "alignCorners", value.asInstanceOf[js.Any])
    
    inline def setHalfPixelCenters(value: Boolean): Self = StObject.set(x, "halfPixelCenters", value.asInstanceOf[js.Any])
    
    inline def setSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
