package typings
package w3cDashImageDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaSettingsRange extends js.Object {
  val max: scala.Double
  val min: scala.Double
  val step: scala.Double
}

object MediaSettingsRange {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double, step: scala.Double): MediaSettingsRange = {
    val __obj = js.Dynamic.literal(max = max, min = min, step = step)
  
    __obj.asInstanceOf[MediaSettingsRange]
  }
}

