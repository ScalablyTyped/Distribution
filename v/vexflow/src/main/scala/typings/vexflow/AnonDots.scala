package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDots extends js.Object {
  var dots: Double
  var duration: String
  var `type`: String
}

object AnonDots {
  @scala.inline
  def apply(dots: Double, duration: String, `type`: String): AnonDots = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDots]
  }
}

