package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSetQueueOptions extends js.Object {
  /**
    * Queue data changes ('add', 'update', 'remove') and flush them at once.
    * The queue can be flushed manually by calling DataSet.flush(),
    * or can be flushed after a configured delay or maximum number of entries.
    * When queue is true, a queue is created with default options.
    * Options can be specified by providing an object:
    * delay: number - The queue will be flushed automatically after an inactivity of this delay in milliseconds. Default value is null.
    * Default value is null.
    * max: number - When the queue exceeds the given maximum number of entries, the queue is flushed automatically. Default value is Infinity.
    * Default value is Infinity.
    */
  var queue: js.UndefOr[js.Any | Boolean] = js.undefined
}

object DataSetQueueOptions {
  @scala.inline
  def apply(queue: js.Any | Boolean = null): DataSetQueueOptions = {
    val __obj = js.Dynamic.literal()
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetQueueOptions]
  }
}

