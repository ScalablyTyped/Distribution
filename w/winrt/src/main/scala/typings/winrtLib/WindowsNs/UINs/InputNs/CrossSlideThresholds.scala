package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossSlideThresholds extends js.Object {
  var rearrangeStart: scala.Double
  var selectionStart: scala.Double
  var speedBumpEnd: scala.Double
  var speedBumpStart: scala.Double
}

object CrossSlideThresholds {
  @scala.inline
  def apply(
    rearrangeStart: scala.Double,
    selectionStart: scala.Double,
    speedBumpEnd: scala.Double,
    speedBumpStart: scala.Double
  ): CrossSlideThresholds = {
    val __obj = js.Dynamic.literal(rearrangeStart = rearrangeStart, selectionStart = selectionStart, speedBumpEnd = speedBumpEnd, speedBumpStart = speedBumpStart)
  
    __obj.asInstanceOf[CrossSlideThresholds]
  }
}

