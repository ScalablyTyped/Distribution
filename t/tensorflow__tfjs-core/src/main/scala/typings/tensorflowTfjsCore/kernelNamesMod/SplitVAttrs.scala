package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitVAttrs extends js.Object {
  var axis: Double = js.native
  var numOrSizeSplits: js.Array[Double] | Double = js.native
}

object SplitVAttrs {
  @scala.inline
  def apply(axis: Double, numOrSizeSplits: js.Array[Double] | Double): SplitVAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], numOrSizeSplits = numOrSizeSplits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitVAttrs]
  }
  @scala.inline
  implicit class SplitVAttrsOps[Self <: SplitVAttrs] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setNumOrSizeSplitsVarargs(value: Double*): Self = this.set("numOrSizeSplits", js.Array(value :_*))
    @scala.inline
    def setNumOrSizeSplits(value: js.Array[Double] | Double): Self = this.set("numOrSizeSplits", value.asInstanceOf[js.Any])
  }
  
}

