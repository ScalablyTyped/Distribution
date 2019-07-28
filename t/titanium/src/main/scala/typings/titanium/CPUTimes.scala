package typings.titanium

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
  var idle: js.UndefOr[Double] = js.undefined
  /**
  	 * The number of milliseconds the CPU has spent in irq mode.
  	 */
  var irq: js.UndefOr[Double] = js.undefined
  /**
  	 * The number of milliseconds the CPU has spent in nice mode.
  	 */
  var nice: js.UndefOr[Double] = js.undefined
  /**
  	 * The number of milliseconds the CPU has spent in sys mode.
  	 */
  var sys: js.UndefOr[Double] = js.undefined
  /**
  	 * The number of milliseconds the CPU has spent in user mode.
  	 */
  var user: js.UndefOr[Double] = js.undefined
}

object CPUTimes {
  @scala.inline
  def apply(
    idle: Int | Double = null,
    irq: Int | Double = null,
    nice: Int | Double = null,
    sys: Int | Double = null,
    user: Int | Double = null
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

