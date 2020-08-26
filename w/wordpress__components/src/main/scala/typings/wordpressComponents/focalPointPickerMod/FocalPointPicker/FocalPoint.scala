package typings.wordpressComponents.focalPointPickerMod.FocalPointPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocalPoint extends js.Object {
  /**
    * Fractional percent from LTR of image (Range 0 to 1).
    */
  var x: Double = js.native
  /**
    * Fractional percent from TTB of image (Range 0 to 1).
    */
  var y: Double = js.native
}

object FocalPoint {
  @scala.inline
  def apply(x: Double, y: Double): FocalPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocalPoint]
  }
  @scala.inline
  implicit class FocalPointOps[Self <: FocalPoint] (val x: Self) extends AnyVal {
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

