package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding the data for a logical cpu execution times.
  */
trait CPUTimes extends js.Object {
  /**
  	 * The number of milliseconds the CPU has spent in idle mode.
  	 */
  var idle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The number of milliseconds the CPU has spent in irq mode.
  	 */
  var irq: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The number of milliseconds the CPU has spent in nice mode.
  	 */
  var nice: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The number of milliseconds the CPU has spent in sys mode.
  	 */
  var sys: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The number of milliseconds the CPU has spent in user mode.
  	 */
  var user: js.UndefOr[scala.Double] = js.undefined
}

object CPUTimes {
  @scala.inline
  def apply(
    idle: scala.Int | scala.Double = null,
    irq: scala.Int | scala.Double = null,
    nice: scala.Int | scala.Double = null,
    sys: scala.Int | scala.Double = null,
    user: scala.Int | scala.Double = null
  ): CPUTimes = {
    val __obj = js.Dynamic.literal()
    if (idle != null) __obj.updateDynamic("idle")(idle.asInstanceOf[js.Any])
    if (irq != null) __obj.updateDynamic("irq")(irq.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (sys != null) __obj.updateDynamic("sys")(sys.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUTimes]
  }
}

