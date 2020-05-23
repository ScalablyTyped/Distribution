package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineRollingModeOption extends js.Object {
  var follow: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
}

object TimelineRollingModeOption {
  @scala.inline
  def apply(follow: js.UndefOr[Boolean] = js.undefined, offset: js.UndefOr[Double] = js.undefined): TimelineRollingModeOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineRollingModeOption]
  }
}

