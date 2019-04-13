package typings
package workerDashThreadsDashPoolLib.workerDashThreadsDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Maximum number of workers allowed in the pool. Other workers will be queued
    * and started once there's room in the pool.
    * @default 1
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum number of workers waiting to be started when the pool is full.
    * The callback to `pool.acquire` will be called with an error in case this limit is reached.
    */
  var maxWaiting: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(max: scala.Int | scala.Double = null, maxWaiting: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxWaiting != null) __obj.updateDynamic("maxWaiting")(maxWaiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

