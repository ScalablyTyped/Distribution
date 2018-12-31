package typings
package workerDashThreadsDashPoolLib.workerDashThreadsDashPoolMod.PoolNs

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

