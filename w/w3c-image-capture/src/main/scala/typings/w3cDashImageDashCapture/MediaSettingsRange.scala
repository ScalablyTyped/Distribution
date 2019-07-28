package typings.w3cDashImageDashCapture

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
    val __obj = js.Dynamic.literal(max = max, min = min, step = step)
  
    __obj.asInstanceOf[MediaSettingsRange]
  }
}

