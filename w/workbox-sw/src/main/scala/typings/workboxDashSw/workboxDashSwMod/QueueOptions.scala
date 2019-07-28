package typings.workboxDashSw.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== Queue =====
  */
trait QueueOptions extends js.Object {
  /**
  	 * The amount of time (in minutes) a request may be retried. After this amount of time has
  	 * passed, the request will be deleted from the queue.
  	 */
  var maxRetentionTime: Double
  /**
  	 * A function that gets invoked whenever the 'sync' event fires. The function is invoked with an object
  	 * containing the `queue` property (referencing this instance), and you
  	 * can use the callback to customize the replay behavior of the queue.
  	 * When not set the `replayRequests()` method is called.
  	 * Note: if the replay fails after a sync event, make sure you throw an
  	 * error, so the browser knows to retry the sync event later.
  	 */
  def onSync(queue: Queue): Unit
}

object QueueOptions {
  @scala.inline
  def apply(maxRetentionTime: Double, onSync: Queue => Unit): QueueOptions = {
    val __obj = js.Dynamic.literal(maxRetentionTime = maxRetentionTime, onSync = js.Any.fromFunction1(onSync))
  
    __obj.asInstanceOf[QueueOptions]
  }
}

