package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the red, green, and blue values of a white balance gain setting. */
@js.native
trait WhiteBalanceGain extends js.Object {
  /** The blue value of a white balance gain setting. */
  var b: Double = js.native
  /** The green value of a white balance gain setting. */
  var g: Double = js.native
  /** The red value of a white balance gain setting. */
  var r: Double = js.native
}

object WhiteBalanceGain {
  @scala.inline
  def apply(b: Double, g: Double, r: Double): WhiteBalanceGain = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteBalanceGain]
  }
  @scala.inline
  implicit class WhiteBalanceGainOps[Self <: WhiteBalanceGain] (val x: Self) extends AnyVal {
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
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setG(value: Double): Self = this.set("g", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
  }
  
}

