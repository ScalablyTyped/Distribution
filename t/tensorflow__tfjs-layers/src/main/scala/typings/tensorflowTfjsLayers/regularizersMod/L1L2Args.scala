package typings.tensorflowTfjsLayers.regularizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait L1L2Args extends js.Object {
  /** L1 regularization rate. Defaults to 0.01. */
  var l1: js.UndefOr[Double] = js.native
  /** L2 regularization rate. Defaults to 0.01. */
  var l2: js.UndefOr[Double] = js.native
}

object L1L2Args {
  @scala.inline
  def apply(): L1L2Args = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[L1L2Args]
  }
  @scala.inline
  implicit class L1L2ArgsOps[Self <: L1L2Args] (val x: Self) extends AnyVal {
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
    def setL1(value: Double): Self = this.set("l1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL1: Self = this.set("l1", js.undefined)
    @scala.inline
    def setL2(value: Double): Self = this.set("l2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL2: Self = this.set("l2", js.undefined)
  }
  
}

