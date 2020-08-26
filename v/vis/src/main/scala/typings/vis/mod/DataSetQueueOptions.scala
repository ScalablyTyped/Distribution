package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var queue: js.UndefOr[js.Any | Boolean] = js.native
}

object DataSetQueueOptions {
  @scala.inline
  def apply(): DataSetQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetQueueOptions]
  }
  @scala.inline
  implicit class DataSetQueueOptionsOps[Self <: DataSetQueueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueue(value: js.Any | Boolean): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
  }
  
}

