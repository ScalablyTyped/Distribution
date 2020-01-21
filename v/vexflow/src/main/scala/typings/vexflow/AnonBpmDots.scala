package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBpmDots extends js.Object {
  var bpm: Double
  var dots: Double
  var duration: String
  var name: js.UndefOr[String] = js.undefined
}

object AnonBpmDots {
  @scala.inline
  def apply(bpm: Double, dots: Double, duration: String, name: String = null): AnonBpmDots = {
    val __obj = js.Dynamic.literal(bpm = bpm.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBpmDots]
  }
}

