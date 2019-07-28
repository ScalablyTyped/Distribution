package typings.winrt.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossSlideThresholds extends js.Object {
  var rearrangeStart: Double
  var selectionStart: Double
  var speedBumpEnd: Double
  var speedBumpStart: Double
}

object CrossSlideThresholds {
  @scala.inline
  def apply(rearrangeStart: Double, selectionStart: Double, speedBumpEnd: Double, speedBumpStart: Double): CrossSlideThresholds = {
    val __obj = js.Dynamic.literal(rearrangeStart = rearrangeStart, selectionStart = selectionStart, speedBumpEnd = speedBumpEnd, speedBumpStart = speedBumpStart)
  
    __obj.asInstanceOf[CrossSlideThresholds]
  }
}

