package typings.workboxBackgroundSync.queueMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueEntry[Metadata] extends js.Object {
  var metadata: js.UndefOr[Metadata] = js.undefined
  var request: Request
  var timestamp: js.UndefOr[Double] = js.undefined
}

object QueueEntry {
  @scala.inline
  def apply[Metadata](request: Request, metadata: Metadata = null, timestamp: js.UndefOr[Double] = js.undefined): QueueEntry[Metadata] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueEntry[Metadata]]
  }
}

