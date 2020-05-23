package typings.workboxBackgroundSync.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  var maxRetentionTime: js.UndefOr[Double] = js.undefined
  var onSync: js.UndefOr[QueueOnSyncHandler] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(
    maxRetentionTime: js.UndefOr[Double] = js.undefined,
    onSync: /* options */ QueueOnSyncEvent => Unit | js.Promise[Unit] = null
  ): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxRetentionTime)) __obj.updateDynamic("maxRetentionTime")(maxRetentionTime.get.asInstanceOf[js.Any])
    if (onSync != null) __obj.updateDynamic("onSync")(js.Any.fromFunction1(onSync))
    __obj.asInstanceOf[QueueOptions]
  }
}

