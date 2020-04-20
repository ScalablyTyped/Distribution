package typings.winrtUwp.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the distance thresholds for a CrossSliding interaction. */
trait CrossSlideThresholds extends js.Object {
  /** The distance, in DIPs, from the initial point of contact until the rearrange action is initiated. */
  var rearrangeStart: Double
  /** The distance, in DIPs, from the initial point of contact until the selection action is initiated. */
  var selectionStart: Double
  /** The distance, in DIPs, from the initial point of contact until the end of the speed bump. */
  var speedBumpEnd: Double
  /** The distance, in DIPs, from the initial point of contact until the speed bump is initiated. */
  var speedBumpStart: Double
}

object CrossSlideThresholds {
  @scala.inline
  def apply(rearrangeStart: Double, selectionStart: Double, speedBumpEnd: Double, speedBumpStart: Double): CrossSlideThresholds = {
    val __obj = js.Dynamic.literal(rearrangeStart = rearrangeStart.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], speedBumpEnd = speedBumpEnd.asInstanceOf[js.Any], speedBumpStart = speedBumpStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlideThresholds]
  }
}

