package typings.w3cGenericSensor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorOptions extends js.Object {
  var frequency: js.UndefOr[Double] = js.undefined
}

object SensorOptions {
  @scala.inline
  def apply(frequency: Int | Double = null): SensorOptions = {
    val __obj = js.Dynamic.literal()
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorOptions]
  }
}

