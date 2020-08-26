package typings.vanillaTilt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TiltValues extends js.Object {
  /**
    * The current percentage on the X axis
    */
  var percentageX: Double = js.native
  /**
    * The current percentage on the Y axis
    */
  var percentageY: Double = js.native
  /**
    * The current tilt on the X axis
    */
  var tiltX: Double = js.native
  /**
    * The current tilt on the Y axis
    */
  var tiltY: Double = js.native
}

object TiltValues {
  @scala.inline
  def apply(percentageX: Double, percentageY: Double, tiltX: Double, tiltY: Double): TiltValues = {
    val __obj = js.Dynamic.literal(percentageX = percentageX.asInstanceOf[js.Any], percentageY = percentageY.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiltValues]
  }
  @scala.inline
  implicit class TiltValuesOps[Self <: TiltValues] (val x: Self) extends AnyVal {
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
    def setPercentageX(value: Double): Self = this.set("percentageX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentageY(value: Double): Self = this.set("percentageY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiltX(value: Double): Self = this.set("tiltX", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiltY(value: Double): Self = this.set("tiltY", value.asInstanceOf[js.Any])
  }
  
}

