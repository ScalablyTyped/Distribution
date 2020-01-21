package typings.tress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TressJobQueues extends js.Object {
  var failed: js.Array[TressJobData]
  var finished: js.Array[TressJobData]
  var waiting: js.Array[TressJobData]
}

object TressJobQueues {
  @scala.inline
  def apply(failed: js.Array[TressJobData], finished: js.Array[TressJobData], waiting: js.Array[TressJobData]): TressJobQueues = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TressJobQueues]
  }
}

