package typings.tensorflowTfjsLayers.regularizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait L2Args extends js.Object {
  /** L2 regularization rate. Defaults to 0.01. */
  var l2: Double = js.native
}

object L2Args {
  @scala.inline
  def apply(l2: Double): L2Args = {
    val __obj = js.Dynamic.literal(l2 = l2.asInstanceOf[js.Any])
    __obj.asInstanceOf[L2Args]
  }
  @scala.inline
  implicit class L2ArgsOps[Self <: L2Args] (val x: Self) extends AnyVal {
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
    def setL2(value: Double): Self = this.set("l2", value.asInstanceOf[js.Any])
  }
  
}

