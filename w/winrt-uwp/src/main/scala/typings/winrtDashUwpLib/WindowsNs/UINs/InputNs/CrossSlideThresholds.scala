package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the distance thresholds for a CrossSliding interaction. */
trait CrossSlideThresholds extends js.Object {
  /** The distance, in DIPs, from the initial point of contact until the rearrange action is initiated. */
  var rearrangeStart: scala.Double
  /** The distance, in DIPs, from the initial point of contact until the selection action is initiated. */
  var selectionStart: scala.Double
  /** The distance, in DIPs, from the initial point of contact until the end of the speed bump. */
  var speedBumpEnd: scala.Double
  /** The distance, in DIPs, from the initial point of contact until the speed bump is initiated. */
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

