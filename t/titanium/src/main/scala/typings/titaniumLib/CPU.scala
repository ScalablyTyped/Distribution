package typings
package titaniumLib

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
  var model: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Speed of the CPU in MHz
  	 */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A collection of timings for this logical CPU.
  	 */
  var times: js.UndefOr[CPUTimes] = js.undefined
}

object CPU {
  @scala.inline
  def apply(model: java.lang.String = null, speed: scala.Int | scala.Double = null, times: CPUTimes = null): CPU = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times)
    __obj.asInstanceOf[CPU]
  }
}

