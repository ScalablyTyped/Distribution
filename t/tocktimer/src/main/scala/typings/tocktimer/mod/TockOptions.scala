package typings.tocktimer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TockOptions extends js.Object {
  /**
    * Defaults to false. If true, the clock will count down from a given time, otherwise it will count up from 0:00.
    */
  var countdown: js.UndefOr[Boolean] = js.undefined
  /**
    * Defaults to 10 milliseconds. How often, in milliseconds, that the clock will tick.
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Callback function executed on each tick
    */
  def callback(): Unit
  /**
    * Callback function executed when the timer is complete
    */
  def complete(): Unit
}

object TockOptions {
  @scala.inline
  def apply(
    callback: () => Unit,
    complete: () => Unit,
    countdown: js.UndefOr[Boolean] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined
  ): TockOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), complete = js.Any.fromFunction0(complete))
    if (!js.isUndefined(countdown)) __obj.updateDynamic("countdown")(countdown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TockOptions]
  }
}

