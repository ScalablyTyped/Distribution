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
    idle: js.UndefOr[Double] = js.undefined,
    irq: js.UndefOr[Double] = js.undefined,
    nice: js.UndefOr[Double] = js.undefined,
    sys: js.UndefOr[Double] = js.undefined,
    user: js.UndefOr[Double] = js.undefined
  ): CPUTimes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(idle)) __obj.updateDynamic("idle")(idle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(irq)) __obj.updateDynamic("irq")(irq.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nice)) __obj.updateDynamic("nice")(nice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sys)) __obj.updateDynamic("sys")(sys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(user)) __obj.updateDynamic("user")(user.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUTimes]
  }
}

