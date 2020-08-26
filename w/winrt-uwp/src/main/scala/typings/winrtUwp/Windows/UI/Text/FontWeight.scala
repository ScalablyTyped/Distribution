package typings.winrtUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Refers to the density of a typeface, in terms of the lightness or heaviness of the strokes. */
@js.native
trait FontWeight extends js.Object {
  /** The font weight expressed as a numeric value. See Remarks. */
  var weight: Double = js.native
}

object FontWeight {
  @scala.inline
  def apply(weight: Double): FontWeight = {
    val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeight]
  }
  @scala.inline
  implicit class FontWeightOps[Self <: FontWeight] (val x: Self) extends AnyVal {
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
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

