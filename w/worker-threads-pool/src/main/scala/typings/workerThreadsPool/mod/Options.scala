package typings.workerThreadsPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Maximum number of workers allowed in the pool. Other workers will be queued
    * and started once there's room in the pool.
    * @default 1
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of workers waiting to be started when the pool is full.
    * The callback to `pool.acquire` will be called with an error in case this limit is reached.
    */
  var maxWaiting: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(max: js.UndefOr[Double] = js.undefined, maxWaiting: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWaiting)) __obj.updateDynamic("maxWaiting")(maxWaiting.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

