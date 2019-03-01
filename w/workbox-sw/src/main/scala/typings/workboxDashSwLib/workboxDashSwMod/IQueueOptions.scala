package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueueOptions extends js.Object {
  /**
  	 * Callbacks to observe the lifecycle of queued requests. Use these to respond to or modify the requests during the replay process.
  	 */
  var callbacks: stdLib.Partial[IQueueCallback]
  /**
  	 * The amount of time (in minutes) a request may be retried. After this amount of time has passed, the request will be deleted from the queue.
  	 */
  var maxRetentionTime: scala.Double
}

object IQueueOptions {
  @scala.inline
  def apply(callbacks: stdLib.Partial[IQueueCallback], maxRetentionTime: scala.Double): IQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbacks")(callbacks)
    __obj.updateDynamic("maxRetentionTime")(maxRetentionTime)
    __obj.asInstanceOf[IQueueOptions]
  }
}

