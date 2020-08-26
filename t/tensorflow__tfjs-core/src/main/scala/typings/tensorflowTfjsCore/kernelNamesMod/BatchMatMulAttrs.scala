package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchMatMulAttrs extends js.Object {
  var transposeA: Boolean = js.native
  var transposeB: Boolean = js.native
}

object BatchMatMulAttrs {
  @scala.inline
  def apply(transposeA: Boolean, transposeB: Boolean): BatchMatMulAttrs = {
    val __obj = js.Dynamic.literal(transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchMatMulAttrs]
  }
  @scala.inline
  implicit class BatchMatMulAttrsOps[Self <: BatchMatMulAttrs] (val x: Self) extends AnyVal {
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
    def setTransposeA(value: Boolean): Self = this.set("transposeA", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransposeB(value: Boolean): Self = this.set("transposeB", value.asInstanceOf[js.Any])
  }
  
}

