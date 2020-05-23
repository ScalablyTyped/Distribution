package typings.wordpressComponents.focalPointPickerMod.FocalPointPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocalPoint extends js.Object {
  /**
    * Fractional percent from LTR of image (Range 0 to 1).
    */
  var x: Double
  /**
    * Fractional percent from TTB of image (Range 0 to 1).
    */
  var y: Double
}

object FocalPoint {
  @scala.inline
  def apply(x: Double, y: Double): FocalPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocalPoint]
  }
}

