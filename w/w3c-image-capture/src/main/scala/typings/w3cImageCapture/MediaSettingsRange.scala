package typings.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaSettingsRange extends js.Object {
  val max: Double
  val min: Double
  val step: Double
}

object MediaSettingsRange {
  @scala.inline
  def apply(max: Double, min: Double, step: Double): MediaSettingsRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSettingsRange]
  }
}

