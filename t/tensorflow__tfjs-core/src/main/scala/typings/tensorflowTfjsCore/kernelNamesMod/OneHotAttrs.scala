package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OneHotAttrs extends js.Object {
  var depth: Double = js.native
  var offValue: Double = js.native
  var onValue: Double = js.native
}

object OneHotAttrs {
  @scala.inline
  def apply(depth: Double, offValue: Double, onValue: Double): OneHotAttrs = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], offValue = offValue.asInstanceOf[js.Any], onValue = onValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneHotAttrs]
  }
  @scala.inline
  implicit class OneHotAttrsOps[Self <: OneHotAttrs] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffValue(value: Double): Self = this.set("offValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnValue(value: Double): Self = this.set("onValue", value.asInstanceOf[js.Any])
  }
  
}

