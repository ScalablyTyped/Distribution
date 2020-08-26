package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcatAttrs extends js.Object {
  var axis: Double = js.native
}

object ConcatAttrs {
  @scala.inline
  def apply(axis: Double): ConcatAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatAttrs]
  }
  @scala.inline
  implicit class ConcatAttrsOps[Self <: ConcatAttrs] (val x: Self) extends AnyVal {
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
    def setAxis(value: Double): Self = this.set("axis", value.asInstanceOf[js.Any])
  }
  
}

