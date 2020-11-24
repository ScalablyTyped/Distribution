package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeNearestNeighborAttrs extends js.Object {
  
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
  implicit class ResizeNearestNeighborAttrsOps[Self <: ResizeNearestNeighborAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignCorners(value: Boolean): Self = this.set("alignCorners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Tuple2[Double, Double]): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
