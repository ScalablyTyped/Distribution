package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var dots: Double
  var duration: String
  var ticks: Double
  var `type`: String
}

object Duration {
  @scala.inline
  def apply(dots: Double, duration: String, ticks: Double, `type`: String): Duration = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

