package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the red, green, and blue values of a white balance gain setting. */
trait WhiteBalanceGain extends js.Object {
  /** The blue value of a white balance gain setting. */
  var b: Double
  /** The green value of a white balance gain setting. */
  var g: Double
  /** The red value of a white balance gain setting. */
  var r: Double
}

object WhiteBalanceGain {
  @scala.inline
  def apply(b: Double, g: Double, r: Double): WhiteBalanceGain = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WhiteBalanceGain]
  }
}

