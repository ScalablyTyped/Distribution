package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBpm extends js.Object {
  var bpm: Double
  var dots: Boolean
  var duration: String
  var name: js.UndefOr[String] = js.undefined
}

object AnonBpm {
  @scala.inline
  def apply(bpm: Double, dots: Boolean, duration: String, name: String = null): AnonBpm = {
    val __obj = js.Dynamic.literal(bpm = bpm.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBpm]
  }
}

