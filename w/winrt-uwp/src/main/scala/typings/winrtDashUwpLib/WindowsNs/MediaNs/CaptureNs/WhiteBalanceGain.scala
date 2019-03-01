package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the red, green, and blue values of a white balance gain setting. */
trait WhiteBalanceGain extends js.Object {
  /** The blue value of a white balance gain setting. */
  var b: scala.Double
  /** The green value of a white balance gain setting. */
  var g: scala.Double
  /** The red value of a white balance gain setting. */
  var r: scala.Double
}

object WhiteBalanceGain {
  @scala.inline
  def apply(b: scala.Double, g: scala.Double, r: scala.Double): WhiteBalanceGain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[WhiteBalanceGain]
  }
}

