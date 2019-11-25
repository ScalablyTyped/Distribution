package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding the data for a logical cpu.
  */
trait CPU extends js.Object {
  /**
  	 * General description of the CPU
  	 */
  var model: js.UndefOr[String] = js.undefined
  /**
  	 * Speed of the CPU in MHz
  	 */
  var speed: js.UndefOr[Double] = js.undefined
  /**
  	 * A collection of timings for this logical CPU.
  	 */
  var times: js.UndefOr[CPUTimes] = js.undefined
}

object CPU {
  @scala.inline
  def apply(model: String = null, speed: Int | Double = null, times: CPUTimes = null): CPU = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPU]
  }
}

