package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LRNAttrs extends js.Object {
  var alpha: Double = js.native
  var beta: Double = js.native
  var bias: Double = js.native
  var depthRadius: Double = js.native
}

object LRNAttrs {
  @scala.inline
  def apply(alpha: Double, beta: Double, bias: Double, depthRadius: Double): LRNAttrs = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], bias = bias.asInstanceOf[js.Any], depthRadius = depthRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[LRNAttrs]
  }
  @scala.inline
  implicit class LRNAttrsOps[Self <: LRNAttrs] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeta(value: Double): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def setBias(value: Double): Self = this.set("bias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepthRadius(value: Double): Self = this.set("depthRadius", value.asInstanceOf[js.Any])
  }
  
}

