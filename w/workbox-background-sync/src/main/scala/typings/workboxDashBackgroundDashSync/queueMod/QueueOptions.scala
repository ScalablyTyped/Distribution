package typings.workboxDashBackgroundDashSync.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  var maxRetentionTime: js.UndefOr[Double] = js.undefined
  var onSync: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(maxRetentionTime: Int | Double = null, onSync: () => Unit = null): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (maxRetentionTime != null) __obj.updateDynamic("maxRetentionTime")(maxRetentionTime.asInstanceOf[js.Any])
    if (onSync != null) __obj.updateDynamic("onSync")(js.Any.fromFunction0(onSync))
    __obj.asInstanceOf[QueueOptions]
  }
}

