package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineRollingModeOption extends js.Object {
  var follow: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
}

object TimelineRollingModeOption {
  @scala.inline
  def apply(follow: js.UndefOr[Boolean] = js.undefined, offset: Int | Double = null): TimelineRollingModeOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineRollingModeOption]
  }
}

