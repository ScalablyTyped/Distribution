package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeNearestNeighborAttrs extends StObject {
  
  var alignCorners: Boolean = js.native
  
  var size: js.Tuple2[Double, Double] = js.native
}
object ResizeNearestNeighborAttrs {
  
  @scala.inline
  def apply(alignCorners: Boolean, size: js.Tuple2[Double, Double]): ResizeNearestNeighborAttrs = {
    val __obj = js.Dynamic.literal(alignCorners = alignCorners.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeNearestNeighborAttrs]
  }
  
  @scala.inline
  implicit class ResizeNearestNeighborAttrsMutableBuilder[Self <: ResizeNearestNeighborAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignCorners(value: Boolean): Self = StObject.set(x, "alignCorners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
