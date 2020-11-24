package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FusedBatchNormAttrs extends js.Object {
  
  var varianceEpsilon: Double = js.native
}
object FusedBatchNormAttrs {
  
  @scala.inline
  def apply(varianceEpsilon: Double): FusedBatchNormAttrs = {
    val __obj = js.Dynamic.literal(varianceEpsilon = varianceEpsilon.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedBatchNormAttrs]
  }
  
  @scala.inline
  implicit class FusedBatchNormAttrsOps[Self <: FusedBatchNormAttrs] (val x: Self) extends AnyVal {
    
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
    def setVarianceEpsilon(value: Double): Self = this.set("varianceEpsilon", value.asInstanceOf[js.Any])
  }
}
